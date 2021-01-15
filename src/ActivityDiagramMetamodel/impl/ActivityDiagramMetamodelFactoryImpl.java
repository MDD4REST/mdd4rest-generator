/**
 */
package ActivityDiagramMetamodel.impl;

import ActivityDiagramMetamodel.Action;
import ActivityDiagramMetamodel.ActivityDiagram;
import ActivityDiagramMetamodel.ActivityDiagramMetamodelFactory;
import ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage;
import ActivityDiagramMetamodel.ActivityEdge;
import ActivityDiagramMetamodel.ActivityNode;
import ActivityDiagramMetamodel.ActivityParameterNode;
import ActivityDiagramMetamodel.ActivityPartition;
import ActivityDiagramMetamodel.Actor;
import ActivityDiagramMetamodel.Aggregate;
import ActivityDiagramMetamodel.CallAction;
import ActivityDiagramMetamodel.CallActivityAction;
import ActivityDiagramMetamodel.CallBehaviorAction;
import ActivityDiagramMetamodel.CallOperationAction;
import ActivityDiagramMetamodel.CommandAction;
import ActivityDiagramMetamodel.ConstraintPin;
import ActivityDiagramMetamodel.ControlFlow;
import ActivityDiagramMetamodel.ControlNode;
import ActivityDiagramMetamodel.DecisionNode;
import ActivityDiagramMetamodel.DomainEvent;
import ActivityDiagramMetamodel.DomainObject;
import ActivityDiagramMetamodel.Entity;
import ActivityDiagramMetamodel.ExecutableNode;
import ActivityDiagramMetamodel.ExternalSystem;
import ActivityDiagramMetamodel.FinalNode;
import ActivityDiagramMetamodel.ForkNode;
import ActivityDiagramMetamodel.InitialNode;
import ActivityDiagramMetamodel.InputPin;
import ActivityDiagramMetamodel.JoinNode;
import ActivityDiagramMetamodel.MergeNode;
import ActivityDiagramMetamodel.ObjectAction;
import ActivityDiagramMetamodel.ObjectActionKind;
import ActivityDiagramMetamodel.ObjectFlow;
import ActivityDiagramMetamodel.ObjectNode;
import ActivityDiagramMetamodel.ObjectNodeOrderingKind;
import ActivityDiagramMetamodel.OutputPin;
import ActivityDiagramMetamodel.Pin;
import ActivityDiagramMetamodel.QueryAction;
import ActivityDiagramMetamodel.ReadModel;
import ActivityDiagramMetamodel.StartObjectBehaviorAction;
import ActivityDiagramMetamodel.ValueObject;
import ActivityDiagramMetamodel.ValueSpecification;
import ActivityDiagramMetamodel.Variable;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityDiagramMetamodelFactoryImpl extends EFactoryImpl implements ActivityDiagramMetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActivityDiagramMetamodelFactory init() {
		try {
			ActivityDiagramMetamodelFactory theActivityDiagramMetamodelFactory = (ActivityDiagramMetamodelFactory)EPackage.Registry.INSTANCE.getEFactory(ActivityDiagramMetamodelPackage.eNS_URI);
			if (theActivityDiagramMetamodelFactory != null) {
				return theActivityDiagramMetamodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ActivityDiagramMetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityDiagramMetamodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ActivityDiagramMetamodelPackage.ACTIVITY_DIAGRAM: return createActivityDiagram();
			case ActivityDiagramMetamodelPackage.ACTIVITY_NODE: return createActivityNode();
			case ActivityDiagramMetamodelPackage.ACTIVITY_EDGE: return createActivityEdge();
			case ActivityDiagramMetamodelPackage.OBJECT_FLOW: return createObjectFlow();
			case ActivityDiagramMetamodelPackage.CONTROL_FLOW: return createControlFlow();
			case ActivityDiagramMetamodelPackage.CONTROL_NODE: return createControlNode();
			case ActivityDiagramMetamodelPackage.EXECUTABLE_NODE: return createExecutableNode();
			case ActivityDiagramMetamodelPackage.INITIAL_NODE: return createInitialNode();
			case ActivityDiagramMetamodelPackage.FORK_NODE: return createForkNode();
			case ActivityDiagramMetamodelPackage.JOIN_NODE: return createJoinNode();
			case ActivityDiagramMetamodelPackage.DECISION_NODE: return createDecisionNode();
			case ActivityDiagramMetamodelPackage.MERGE_NODE: return createMergeNode();
			case ActivityDiagramMetamodelPackage.FINAL_NODE: return createFinalNode();
			case ActivityDiagramMetamodelPackage.INPUT_PIN: return createInputPin();
			case ActivityDiagramMetamodelPackage.OUTPUT_PIN: return createOutputPin();
			case ActivityDiagramMetamodelPackage.PIN: return createPin();
			case ActivityDiagramMetamodelPackage.OBJECT_NODE: return createObjectNode();
			case ActivityDiagramMetamodelPackage.ACTIVITY_PARAMETER_NODE: return createActivityParameterNode();
			case ActivityDiagramMetamodelPackage.VARIABLE: return createVariable();
			case ActivityDiagramMetamodelPackage.VALUE_SPECIFICATION: return createValueSpecification();
			case ActivityDiagramMetamodelPackage.ACTION: return createAction();
			case ActivityDiagramMetamodelPackage.CALL_ACTION: return createCallAction();
			case ActivityDiagramMetamodelPackage.START_OBJECT_BEHAVIOR_ACTION: return createStartObjectBehaviorAction();
			case ActivityDiagramMetamodelPackage.OBJECT_ACTION: return createObjectAction();
			case ActivityDiagramMetamodelPackage.CALL_BEHAVIOR_ACTION: return createCallBehaviorAction();
			case ActivityDiagramMetamodelPackage.CALL_OPERATION_ACTION: return createCallOperationAction();
			case ActivityDiagramMetamodelPackage.CALL_ACTIVITY_ACTION: return createCallActivityAction();
			case ActivityDiagramMetamodelPackage.ACTIVITY_PARTITION: return createActivityPartition();
			case ActivityDiagramMetamodelPackage.COMMAND_ACTION: return createCommandAction();
			case ActivityDiagramMetamodelPackage.AGGREGATE: return createAggregate();
			case ActivityDiagramMetamodelPackage.QUERY_ACTION: return createQueryAction();
			case ActivityDiagramMetamodelPackage.DOMAIN_OBJECT: return createDomainObject();
			case ActivityDiagramMetamodelPackage.VALUE_OBJECT: return createValueObject();
			case ActivityDiagramMetamodelPackage.ENTITY: return createEntity();
			case ActivityDiagramMetamodelPackage.ACTOR: return createActor();
			case ActivityDiagramMetamodelPackage.SYSTEM: return createSystem();
			case ActivityDiagramMetamodelPackage.EXTERNAL_SYSTEM: return createExternalSystem();
			case ActivityDiagramMetamodelPackage.READ_MODEL: return createReadModel();
			case ActivityDiagramMetamodelPackage.DOMAIN_EVENT: return createDomainEvent();
			case ActivityDiagramMetamodelPackage.CONSTRAINT_PIN: return createConstraintPin();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ActivityDiagramMetamodelPackage.OBJECT_NODE_ORDERING_KIND:
				return createObjectNodeOrderingKindFromString(eDataType, initialValue);
			case ActivityDiagramMetamodelPackage.OBJECT_ACTION_KIND:
				return createObjectActionKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ActivityDiagramMetamodelPackage.OBJECT_NODE_ORDERING_KIND:
				return convertObjectNodeOrderingKindToString(eDataType, instanceValue);
			case ActivityDiagramMetamodelPackage.OBJECT_ACTION_KIND:
				return convertObjectActionKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityDiagram createActivityDiagram() {
		ActivityDiagramImpl activityDiagram = new ActivityDiagramImpl();
		return activityDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityNode createActivityNode() {
		ActivityNodeImpl activityNode = new ActivityNodeImpl();
		return activityNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityEdge createActivityEdge() {
		ActivityEdgeImpl activityEdge = new ActivityEdgeImpl();
		return activityEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObjectFlow createObjectFlow() {
		ObjectFlowImpl objectFlow = new ObjectFlowImpl();
		return objectFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlFlow createControlFlow() {
		ControlFlowImpl controlFlow = new ControlFlowImpl();
		return controlFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlNode createControlNode() {
		ControlNodeImpl controlNode = new ControlNodeImpl();
		return controlNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExecutableNode createExecutableNode() {
		ExecutableNodeImpl executableNode = new ExecutableNodeImpl();
		return executableNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitialNode createInitialNode() {
		InitialNodeImpl initialNode = new InitialNodeImpl();
		return initialNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ForkNode createForkNode() {
		ForkNodeImpl forkNode = new ForkNodeImpl();
		return forkNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JoinNode createJoinNode() {
		JoinNodeImpl joinNode = new JoinNodeImpl();
		return joinNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DecisionNode createDecisionNode() {
		DecisionNodeImpl decisionNode = new DecisionNodeImpl();
		return decisionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MergeNode createMergeNode() {
		MergeNodeImpl mergeNode = new MergeNodeImpl();
		return mergeNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinalNode createFinalNode() {
		FinalNodeImpl finalNode = new FinalNodeImpl();
		return finalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputPin createInputPin() {
		InputPinImpl inputPin = new InputPinImpl();
		return inputPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputPin createOutputPin() {
		OutputPinImpl outputPin = new OutputPinImpl();
		return outputPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pin createPin() {
		PinImpl pin = new PinImpl();
		return pin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObjectNode createObjectNode() {
		ObjectNodeImpl objectNode = new ObjectNodeImpl();
		return objectNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityParameterNode createActivityParameterNode() {
		ActivityParameterNodeImpl activityParameterNode = new ActivityParameterNodeImpl();
		return activityParameterNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueSpecification createValueSpecification() {
		ValueSpecificationImpl valueSpecification = new ValueSpecificationImpl();
		return valueSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CallAction createCallAction() {
		CallActionImpl callAction = new CallActionImpl();
		return callAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StartObjectBehaviorAction createStartObjectBehaviorAction() {
		StartObjectBehaviorActionImpl startObjectBehaviorAction = new StartObjectBehaviorActionImpl();
		return startObjectBehaviorAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObjectAction createObjectAction() {
		ObjectActionImpl objectAction = new ObjectActionImpl();
		return objectAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CallBehaviorAction createCallBehaviorAction() {
		CallBehaviorActionImpl callBehaviorAction = new CallBehaviorActionImpl();
		return callBehaviorAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CallOperationAction createCallOperationAction() {
		CallOperationActionImpl callOperationAction = new CallOperationActionImpl();
		return callOperationAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CallActivityAction createCallActivityAction() {
		CallActivityActionImpl callActivityAction = new CallActivityActionImpl();
		return callActivityAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityPartition createActivityPartition() {
		ActivityPartitionImpl activityPartition = new ActivityPartitionImpl();
		return activityPartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommandAction createCommandAction() {
		CommandActionImpl commandAction = new CommandActionImpl();
		return commandAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Aggregate createAggregate() {
		AggregateImpl aggregate = new AggregateImpl();
		return aggregate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QueryAction createQueryAction() {
		QueryActionImpl queryAction = new QueryActionImpl();
		return queryAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainObject createDomainObject() {
		DomainObjectImpl domainObject = new DomainObjectImpl();
		return domainObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueObject createValueObject() {
		ValueObjectImpl valueObject = new ValueObjectImpl();
		return valueObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityDiagramMetamodel.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalSystem createExternalSystem() {
		ExternalSystemImpl externalSystem = new ExternalSystemImpl();
		return externalSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReadModel createReadModel() {
		ReadModelImpl readModel = new ReadModelImpl();
		return readModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainEvent createDomainEvent() {
		DomainEventImpl domainEvent = new DomainEventImpl();
		return domainEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstraintPin createConstraintPin() {
		ConstraintPinImpl constraintPin = new ConstraintPinImpl();
		return constraintPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectNodeOrderingKind createObjectNodeOrderingKindFromString(EDataType eDataType, String initialValue) {
		ObjectNodeOrderingKind result = ObjectNodeOrderingKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectNodeOrderingKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectActionKind createObjectActionKindFromString(EDataType eDataType, String initialValue) {
		ObjectActionKind result = ObjectActionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectActionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityDiagramMetamodelPackage getActivityDiagramMetamodelPackage() {
		return (ActivityDiagramMetamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ActivityDiagramMetamodelPackage getPackage() {
		return ActivityDiagramMetamodelPackage.eINSTANCE;
	}

} //ActivityDiagramMetamodelFactoryImpl
