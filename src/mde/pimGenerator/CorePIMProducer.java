package mde.pimGenerator;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;

import mde.inputParser.YamlProperty;
import mde.inputParser.YamlRelatedResource;
import mde.inputParser.YamlResource;
import ServicePIM.CRUDActivity;
import ServicePIM.CRUDVerb;
import ServicePIM.InputRepresentation;
import ServicePIM.MediaType;
import ServicePIM.Multiplicity;
import ServicePIM.OutputRepresentation;
import ServicePIM.RESTfulServicePIM;
import ServicePIM.RelatedResource;
import ServicePIM.Resource;
import ServicePIM.Property;

public class CorePIMProducer extends APIMProducer {

	public CorePIMProducer(ArrayList<YamlResource> listOfPIMYamlResources) {
		super(listOfPIMYamlResources);
	}

	public CorePIMProducer(ArrayList<YamlResource> listOfPIMYamlResources, String strProjectName,
			String strProjectOutputPath, String strServiceDatabaseIp, String strServiceDatabasePort,
			String strServiceDatabaseUsername, String strServiceDatabasePassword) {
		super(listOfPIMYamlResources, strProjectName, strProjectOutputPath, strServiceDatabaseIp,
				strServiceDatabasePort, strServiceDatabaseUsername, strServiceDatabasePassword);
	}

	@Override
	public RESTfulServicePIM producePIM() {

		createAllPIMResources();
		addResourceRelations();
		// validateProducedPIM();
		System.out.println(this.getRESTfulServicePIM().getHasResources());

		return this.getRESTfulServicePIM();
	}

	private void createAllPIMResources() {
		for (int n = 0; n < this.listOfYamlResources.size(); n++) {
			YamlResource oCurrentYamlResource = this.listOfYamlResources.get(n);
			Resource oNewPIMResource = this.getRESTServicePIMFactory().createResource();
			oNewPIMResource.setName(oCurrentYamlResource.getName());
			oNewPIMResource.setIsAlgorithmic(oCurrentYamlResource.getResourceType());
			oNewPIMResource = addResourceProperties(oNewPIMResource, oCurrentYamlResource);
			oNewPIMResource = addResourceCRUDActivities(oNewPIMResource, oCurrentYamlResource);
			oNewPIMResource = addResourceRepresentations(oNewPIMResource, oCurrentYamlResource);
			this.getRESTfulServicePIM().getHasResources().add(oNewPIMResource);
		}
	}

	private Resource addResourceProperties(Resource oNewPIMResource, YamlResource oCurrentYamlResource) {

		for (int n = 0; n < oCurrentYamlResource.getYamlProperties().size(); n++) {
			YamlProperty oCurrentYamlProperty = oCurrentYamlResource.getYamlProperties().get(n);
			Property oNewResourceProperty = this.getRESTServicePIMFactory().createProperty();
			oNewResourceProperty.setName(oCurrentYamlProperty.getName());
			oNewResourceProperty.setType(oCurrentYamlProperty.getType());
			oNewResourceProperty.setIsUnique(oCurrentYamlProperty.getUniqueness());
			oNewResourceProperty.setIsNamingProperty(oCurrentYamlProperty.getNamingAbility());
			oNewPIMResource.getHasProperty().add(oNewResourceProperty);
		}
		return oNewPIMResource;
	}

	private void addResourceRelations() {

		for (int n = 0; n < this.getRESTfulServicePIM().getHasResources().size(); n++) {
			for (int i = 0; i < this.listOfYamlResources.size(); i++) {
				// if we come by the parent Yaml resource of this PIM resource
				if (this.getRESTfulServicePIM().getHasResources().get(n).getName()
						.equalsIgnoreCase(this.listOfYamlResources.get(i).getName())) {
					// add to the PIM resource the same related resources as the ones that the Yaml
					// resource has
					addOutgoingRelations(n, i);
				}
			}
		}
		for (int n = 0; n < this.getRESTfulServicePIM().getHasResources().size(); n++) {
			addIncomingRelations(n);
		}
	}

	private void addOutgoingRelations(int iPIMResourceIndex, int iYamlResourceIndex) {
		if (this.listOfYamlResources.get(iYamlResourceIndex).getRelatedResources() != null) {
			for (int i = 0; i < this.listOfYamlResources.get(iYamlResourceIndex).getRelatedResources().size(); i++) {
				for (int n = 0; n < this.getRESTfulServicePIM().getHasResources().size(); n++) {
					YamlRelatedResource oCurrentYamlRelatedResource = this.listOfYamlResources.get(iYamlResourceIndex)
							.getRelatedResources().get(i);
					if (this.getRESTfulServicePIM().getHasResources().get(n).getName()
							.equalsIgnoreCase(oCurrentYamlRelatedResource.Name)) {
						RelatedResource oNewRelatedResource = this.getRESTServicePIMFactory().createRelatedResource();
						oNewRelatedResource
								.setFromResource(this.getRESTfulServicePIM().getHasResources().get(iPIMResourceIndex));
						oNewRelatedResource.setToResource(this.getRESTfulServicePIM().getHasResources().get(n));

						if (oCurrentYamlRelatedResource.Multiplicity.equalsIgnoreCase("one-many")) {
							oNewRelatedResource.setMultiplicity(Multiplicity.ONE_TO_MANY);
						} else if (oCurrentYamlRelatedResource.Multiplicity.equalsIgnoreCase("many-one")) {
							oNewRelatedResource.setMultiplicity(Multiplicity.MANY_TO_ONE);
						} else if (oCurrentYamlRelatedResource.Multiplicity.equalsIgnoreCase("one-one")) {
							oNewRelatedResource.setMultiplicity(Multiplicity.ONE_TO_ONE);
						} else if (oCurrentYamlRelatedResource.Multiplicity.equalsIgnoreCase("many-many")) {
							oNewRelatedResource.setMultiplicity(Multiplicity.MANY_TO_MANY);
						} else {
							System.out.println("Corrupted input! Unkown multiplicity: " + oCurrentYamlRelatedResource);
							Runtime.getRuntime().exit(-1);
						}

						this.getRESTfulServicePIM().getHasResources().get(iPIMResourceIndex).getHasRelatedResource()
								.add(oNewRelatedResource);
					}
				}
			}
		}
	}

	private void addIncomingRelations(int iPIMResourceIndex) {
		
		System.out.println("iPIM:: " + iPIMResourceIndex);
		for (int n = 0; n < this.getRESTfulServicePIM().getHasResources().size(); n++) {
			for (int i = 0; i < this.getRESTfulServicePIM().getHasResources().get(n).getHasRelatedResource()
					.size(); i++) {
				System.out.println("n: "+n+", i:"+i);
				if (this.getRESTfulServicePIM().getHasResources().get(iPIMResourceIndex).getName()
						.equalsIgnoreCase(this.getRESTfulServicePIM().getHasResources().get(n).getHasRelatedResource()
								.get(i).getToResource().getName())) {
					this.getRESTfulServicePIM().getHasResources().get(iPIMResourceIndex).getIsRelatedResource()
							.add(this.getRESTfulServicePIM().getHasResources().get(n).getHasRelatedResource().get(i));
				}
			}
		}
	}

	private Resource addResourceCRUDActivities(Resource oNewPIMResource, YamlResource oCurrentYamlResource) {

		for (int n = 0; n < oCurrentYamlResource.getCRUDActivities().size(); n++) {

			CRUDActivity oCRUDActivity = this.getRESTServicePIMFactory().createCRUDActivity();
			if (oCurrentYamlResource.getCRUDActivities().get(n).equalsIgnoreCase("create")) {
				oCRUDActivity.setCRUDVerb(CRUDVerb.CREATE);
			} else if (oCurrentYamlResource.getCRUDActivities().get(n).equalsIgnoreCase("read")) {
				oCRUDActivity.setCRUDVerb(CRUDVerb.READ);
			} else if (oCurrentYamlResource.getCRUDActivities().get(n).equalsIgnoreCase("update")) {
				oCRUDActivity.setCRUDVerb(CRUDVerb.UPDATE);
			} else if (oCurrentYamlResource.getCRUDActivities().get(n).equalsIgnoreCase("delete")) {
				oCRUDActivity.setCRUDVerb(CRUDVerb.DELETE);
			} else {
				System.out.println(
						"Corrupted input! Unkown CRUD verb: " + oCurrentYamlResource.getCRUDActivities().get(n));
				Runtime.getRuntime().exit(-1);
			}
			oNewPIMResource.getHasCRUDActivity().add(oCRUDActivity);
		}
		return oNewPIMResource;
	}

	private Resource addResourceRepresentations(Resource oNewPIMResource, YamlResource oCurrentYamlResource) {

		oNewPIMResource = addInputRepresentations(oNewPIMResource, oCurrentYamlResource);
		oNewPIMResource = addOutputRepresentations(oNewPIMResource, oCurrentYamlResource);

		return oNewPIMResource;
	}

	private Resource addInputRepresentations(Resource oNewPIMResource, YamlResource oCurrentYamlResource) {

		if (oCurrentYamlResource.getInputRepresentation() != null) {
			InputRepresentation oInputRepresentation = this.getRESTServicePIMFactory().createInputRepresentation();
			if (oCurrentYamlResource.getInputRepresentation().equalsIgnoreCase("JSON")) {
				oInputRepresentation.setInputMediaType(MediaType.JSON);
			} else if (oCurrentYamlResource.getInputRepresentation().equalsIgnoreCase("XML")) {
				oInputRepresentation.setInputMediaType(MediaType.XML);
			} else {
				System.out.println(
						"Corrupted inpt! Unkown input media type: " + oCurrentYamlResource.getInputRepresentation());
				Runtime.getRuntime().exit(-1);
			}
			oNewPIMResource.getHasInputRepresentation().add(oInputRepresentation);
		}

		return oNewPIMResource;
	}

	private Resource addOutputRepresentations(Resource oNewPIMResource, YamlResource oCurrentYamlResource) {

		if (oCurrentYamlResource.getOutputRepresentation() != null) {
			OutputRepresentation oOutputRepresentation = this.getRESTServicePIMFactory().createOutputRepresentation();
			if (oCurrentYamlResource.getOutputRepresentation().equalsIgnoreCase("JSON")) {
				oOutputRepresentation.setOutputMediaType(MediaType.JSON);
			} else if (oCurrentYamlResource.getOutputRepresentation().equalsIgnoreCase("XML")) {
				oOutputRepresentation.setOutputMediaType(MediaType.XML);
			} else {
				System.out.println("Corrupted input! Unknown output media type: "
						+ oCurrentYamlResource.getOutputRepresentation());
				Runtime.getRuntime().exit(-1);
			}
			oNewPIMResource.getHasOutputRepresentation().add(oOutputRepresentation);
		}

		return oNewPIMResource;
	}

	private void validateProducedPIM() {

		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(this.getRESTfulServicePIM());
		if (diagnostic.getSeverity() == Diagnostic.OK) {
			System.out.println("Produced PIM is valid!");
		} else {
			System.out.println("Produced PIM is invalid!");
			System.out.println(diagnostic.getMessage());
			for (Iterator<Diagnostic> iteratorOfDiagnostics = diagnostic.getChildren().iterator(); iteratorOfDiagnostics
					.hasNext();) {
				Diagnostic childDiagnostic = (Diagnostic) iteratorOfDiagnostics.next();
				System.out.println(childDiagnostic.getMessage());
			}
		}
	}
}