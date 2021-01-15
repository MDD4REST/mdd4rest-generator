package core.handlers;

import java.util.ArrayList;

import org.apache.commons.lang3.StringUtils;

import core.ontology.DynamicOntologyAPI;
import core.ontology.LinkedOntologyAPI;
import core.ontology.StaticOntologyAPI;

/**
 * Links the static and the dynamic ontologies into one linked ontology.
 * 
 * @author amirdeljouyi
 */
public class LinkOntologiesHandler {

	public void linkOntologies(StaticOntologyAPI staticOntology, DynamicOntologyAPI dynamicOntology,
			LinkedOntologyAPI linkedOntology) {
		ArrayList<String> enumerations = staticOntology.getEnumerations();
		System.out.println(enumerations);
		ArrayList<String> entities = staticOntology.getEntities();
		ArrayList<String> valueObjects = staticOntology.getValueObjects();
		ArrayList<String> roles = dynamicOntology.getUserActors();
		// Iterate over all objects of the static ontology
		for (String object : staticOntology.getObjects()) {
			String capObject = StringUtils.capitalize(object);
			// Add the object as a resource in the linked ontology
			// linkedOntology.addResource(object);
			addObjectToLinkedOntology(linkedOntology, staticOntology, capObject, enumerations, entities, valueObjects);
			// Iterate over all related objects of the object and add them to the linked
			
			for (String relatedObject : staticOntology.getReferenceObjectsOfObject(object)) {
				addObjectToLinkedOntology(linkedOntology, staticOntology, relatedObject, enumerations, entities,
						valueObjects);
				ArrayList<String> sources = new ArrayList<String>();
				ArrayList<String> targets = new ArrayList<String>();
				String capRelatedObject = StringUtils.capitalize(relatedObject);
				sources.add(capObject);
				targets.add(capRelatedObject);
				linkedOntology.addReference(relatedObject.toLowerCase() + "__Reference__has_source__" + capObject
						+ "__has_target__" + relatedObject, sources, targets, false, relatedObject.toLowerCase());
				for (String requirement : staticOntology.getRequirementsOfConcept(relatedObject)) {
					linkedOntology.addRequirement(requirement, staticOntology.getTextOfRequirement(requirement));
					linkedOntology.connectRequirementToElement(requirement, capRelatedObject);
				}
			}

			// Iterate over all properties of the object and add them to the linked ontology
			for (String property : staticOntology.getPropertiesOfObject(object)) {
				linkedOntology.addPropertyToObject(capObject, property);
				for (String requirement : staticOntology.getRequirementsOfConcept(property)) {
					linkedOntology.addRequirement(requirement, staticOntology.getTextOfRequirement(requirement));
					linkedOntology.connectRequirementToElement(requirement, property);
				}
			}

			// Iterate over all actions of the object and add them to the linked ontology
			// TODO: @amirdeljouyi Solve Static Actions
//			for (String action : staticOntology.getActionsOfObject(object)) {
//				String activity = action + " " + capObject;
//				linkedOntology.addActivityToElement(capObject, activity);
//				linkedOntology.addActionToActivity(activity, action);
//				linkedOntology.addObjectToActivity(activity, capObject);
//				for (String requirement : staticOntology.getRequirementsOfOperation(action)) {
//					linkedOntology.addRequirement(requirement, staticOntology.getTextOfRequirement(requirement));
//					linkedOntology.connectRequirementToElement(requirement, activity);
//					linkedOntology.connectRequirementToElement(requirement, action);
//				}
//			}

			// Iterate over all requirements containing the object and add them to the
			// linked ontology
			for (String requirement : staticOntology.getRequirementsOfConcept(object)) {
				linkedOntology.addRequirement(requirement, staticOntology.getTextOfRequirement(requirement));
				linkedOntology.connectRequirementToElement(requirement, capObject);
			}
		}

		for (String reference : staticOntology.getReferences()) {
			Boolean many = staticOntology.getManyOfReference(reference);
			String name = staticOntology.getNameOfElement(reference);
			ArrayList<String> sources = staticOntology.getSourceOfReference(reference);
			ArrayList<String> targets = staticOntology.getTargetOfReference(reference);
			linkedOntology.addReference(reference,  sources, targets, many, name);
			for (String requirement : staticOntology.getRequirementsOfConcept(reference)) {
				linkedOntology.addRequirement(requirement, staticOntology.getTextOfRequirement(requirement));
				linkedOntology.connectRequirementToElement(requirement, reference);
			}
		}

		
		for (String dynactivity : dynamicOntology.getActivities()) {
			// Get the object of the activity and add it as a resource in the linked
			String aggregate = dynamicOntology.getSupplierOfActivity(dynactivity);
			if (aggregate != null) {
				linkedOntology.addAggregate(aggregate);
				// TODO: @amirdeljouyi external systems sould be added

				ArrayList<String> valueObjectsOfDynamic = dynamicOntology.getValueObjectsOfAggregate(aggregate);
				System.out.println(valueObjectsOfDynamic);
				ArrayList<String> entitiesOfDynamic = dynamicOntology.getEntitiesOfAggregate(aggregate);
				String role = dynamicOntology.getActorOfElement(dynactivity);

				for (String object : dynamicOntology.getObjectsOfAggregate(aggregate)) {
					if (entitiesOfDynamic.contains(object)) {
						linkedOntology.addEntityToAggregate(aggregate, object);
					} else if (valueObjectsOfDynamic.contains(object)) {
						linkedOntology.addValueObjectToAggregate(aggregate, object);
					}
				}

				// Get the action of the activity and add it to the linked ontology
				String starterAction = dynamicOntology.getStarterActionOfActivity(dynactivity);
				ArrayList<String> queries = dynamicOntology.getQueriesOfActivity(dynactivity);
				ArrayList<String> commands = dynamicOntology.getCommandsOfActivity(dynactivity);
				ArrayList<String> events = dynamicOntology.getEventsOfActivity(dynactivity);
				ArrayList<String> readmodels = dynamicOntology.getReadmodelsOfActivity(dynactivity);
//				ArrayList<String> policies = dynamicOntology.getPoliciesOfTransition(dynactivity);

				if (starterAction != null) {
					String activity = starterAction + " " + aggregate;
					linkedOntology.addActivityToElement(aggregate, activity);
					addStarterAction(linkedOntology, activity, starterAction, commands, queries);
					
					if (role != null && roles.contains(role)) {
						linkedOntology.addRoleToActivity(activity, role);
					}

					for (String event : events) {
						linkedOntology.addEventToActivity(activity, event);
					}
					
					for (String readmodel : readmodels) {
						linkedOntology.addReadmodelToActivity(activity, readmodel);
					}
					
					for (String diagram : dynamicOntology.getDiagramsOfConcept(dynactivity)) {
						linkedOntology.addActivityDiagram(diagram, dynamicOntology.getTextOfActivityDiagram(diagram));
						linkedOntology.connectActivityDiagramToElement(diagram, aggregate);
						linkedOntology.connectActivityDiagramToElement(diagram, starterAction);
						linkedOntology.connectActivityDiagramToElement(diagram, activity);
						linkedOntology.connectActivityDiagramToActivity(diagram, activity);
					}
					
					for(String object: dynamicOntology.getObjectsOfActivity(dynactivity)) {
						linkedOntology.addObjectToActivity(activity, object);
					}
				}
			}
		}
	
		
		ArrayList<String> events = dynamicOntology.getEvents();
		ArrayList<String> readModels = dynamicOntology.getReadmodels();
		// Iterate over all transitions of the dynamic ontology
		for (String transition : dynamicOntology.getTransitions()) {
			String policy = dynamicOntology.getPoliciesOfTransition(transition);
			String role = dynamicOntology.getActorOfElement(transition);
			System.out.println("role"+ role);
			// Get the condition of the transition
			String condition = dynamicOntology.getConditionOfTransition(transition);

			// Get the source activity of the transition
			String source = dynamicOntology.getSourceActivityOfTransition(transition);

			// Get the target activity of the transition
			String targetdynactivity = dynamicOntology.getTargetActivityOfTransition(transition);
			String taction = dynamicOntology.getActionOfActivity(targetdynactivity);
			String tsupplier = dynamicOntology.getSupplierOfActivity(targetdynactivity);
			String tactivity = taction + " " + tsupplier;
			
			System.out.println("Transition " + source + " " + taction);

			// Connect the activities
			if (policy != null && taction != null) {
				System.out.println("HIII not policy");
				linkedOntology.addPolicyToActivity(tactivity, policy);
				linkedOntology.connectPolicyToEvent(policy, source);
			}
			
			if (role != null && roles.contains(role)) {
				linkedOntology.addRoleToActivity(tactivity, role);
			}

			// Add the condition of the transition to the respective activity of the linked
			// ontology.
			if (condition != null && taction != null) {
				linkedOntology.addConditionToActivity(tactivity, condition);
				for (String diagram : dynamicOntology.getDiagramsOfConcept(condition)) {
					linkedOntology.addActivityDiagram(diagram, dynamicOntology.getTextOfActivityDiagram(diagram));
					linkedOntology.connectActivityDiagramToElement(diagram, condition);
				}
			}
		}
	}

	private void addObjectToLinkedOntology(LinkedOntologyAPI linkedOntology, StaticOntologyAPI staticOntology,
			String object, ArrayList<String> enumerations, ArrayList<String> entities, ArrayList<String> valueObjects) {
		if (enumerations.contains(object)) {
			linkedOntology.addEnumeration(object);
			for (String literal: staticOntology.getLiteralsOfEnumeration(object)) {
				System.out.println(literal);
				linkedOntology.addLiteralToEnumeration(object, literal);
			}
		} else if (entities.contains(object)) {
			linkedOntology.addEntity(object);
		} else if (valueObjects.contains(object)) {
			linkedOntology.addValueObject(object);
		} else {
			linkedOntology.addObject(object);
		}
	}

	private void addStarterAction(LinkedOntologyAPI linkedOntology, String activityName, String starterAction,
			ArrayList<String> commands, ArrayList<String> queries) {
		if (commands.contains(starterAction)) {
			linkedOntology.addCommandActionToActivity(activityName, starterAction);
		} else if (queries.contains(starterAction)) {
			linkedOntology.addQueryActionToActivity(activityName, starterAction);
		}
	}

}
