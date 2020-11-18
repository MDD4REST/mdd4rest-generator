/**
 */
package ActivityDiagramMetamodel.impl;

import ActivityDiagramMetamodel.*;

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
public class ModelingTestFactoryImpl extends EFactoryImpl implements ModelingTestFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelingTestFactory init() {
		try {
			ModelingTestFactory theModelingTestFactory = (ModelingTestFactory)EPackage.Registry.INSTANCE.getEFactory(ModelingTestPackage.eNS_URI);
			if (theModelingTestFactory != null) {
				return theModelingTestFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelingTestFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelingTestFactoryImpl() {
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
			case ModelingTestPackage.ACTIVITY_DIAGRAM: return createActivityDiagram();
			case ModelingTestPackage.ACTIVITY_NODE: return createActivityNode();
			case ModelingTestPackage.ACTIVITY_EDGE: return createActivityEdge();
			case ModelingTestPackage.OBJECT_FLOW: return createObjectFlow();
			case ModelingTestPackage.CONTROL_FLOW: return createControlFlow();
			case ModelingTestPackage.CONTROL_NODE: return createControlNode();
			case ModelingTestPackage.EXECUTABLE_NODE: return createExecutableNode();
			case ModelingTestPackage.INITIAL_NODE: return createInitialNode();
			case ModelingTestPackage.FORK_NODE: return createForkNode();
			case ModelingTestPackage.JOIN_NODE: return createJoinNode();
			case ModelingTestPackage.DECISION_NODE: return createDecisionNode();
			case ModelingTestPackage.MERGE_NODE: return createMergeNode();
			case ModelingTestPackage.FINAL_NODE: return createFinalNode();
			case ModelingTestPackage.INPUT_PIN: return createInputPin();
			case ModelingTestPackage.OUTPUT_PIN: return createOutputPin();
			case ModelingTestPackage.PIN: return createPin();
			case ModelingTestPackage.OBJECT_NODE: return createObjectNode();
			case ModelingTestPackage.ACTIVITY_PARAMETER_NODE: return createActivityParameterNode();
			case ModelingTestPackage.VARIABLE: return createVariable();
			case ModelingTestPackage.VALUE_SPECIFICATION: return createValueSpecification();
			case ModelingTestPackage.ACTION: return createAction();
			case ModelingTestPackage.CALL_ACTION: return createCallAction();
			case ModelingTestPackage.VARIABLE_ACTION: return createVariableAction();
			case ModelingTestPackage.START_OBJECT_BEHAVIOR_ACTION: return createStartObjectBehaviorAction();
			case ModelingTestPackage.OBJECT_ACTION: return createObjectAction();
			case ModelingTestPackage.CALL_BEHAVIOR_ACTION: return createCallBehaviorAction();
			case ModelingTestPackage.CALL_OPERATION_ACTION: return createCallOperationAction();
			case ModelingTestPackage.CALL_ACTIVITY_ACTION: return createCallActivityAction();
			case ModelingTestPackage.ACTIVITY_PARTITION: return createActivityPartition();
			case ModelingTestPackage.EVENT_ACTION: return createEventAction();
			case ModelingTestPackage.COMMAND_ACTION: return createCommandAction();
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
			case ModelingTestPackage.OBJECT_NODE_ORDERING_KIND:
				return createObjectNodeOrderingKindFromString(eDataType, initialValue);
			case ModelingTestPackage.OBJECT_ACTION_KIND:
				return createObjectActionKindFromString(eDataType, initialValue);
			case ModelingTestPackage.VARIABLE_ACTION_KIND:
				return createVariableActionKindFromString(eDataType, initialValue);
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
			case ModelingTestPackage.OBJECT_NODE_ORDERING_KIND:
				return convertObjectNodeOrderingKindToString(eDataType, instanceValue);
			case ModelingTestPackage.OBJECT_ACTION_KIND:
				return convertObjectActionKindToString(eDataType, instanceValue);
			case ModelingTestPackage.VARIABLE_ACTION_KIND:
				return convertVariableActionKindToString(eDataType, instanceValue);
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
	public VariableAction createVariableAction() {
		VariableActionImpl variableAction = new VariableActionImpl();
		return variableAction;
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
	public EventAction createEventAction() {
		EventActionImpl eventAction = new EventActionImpl();
		return eventAction;
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
	public VariableActionKind createVariableActionKindFromString(EDataType eDataType, String initialValue) {
		VariableActionKind result = VariableActionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVariableActionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelingTestPackage getModelingTestPackage() {
		return (ModelingTestPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelingTestPackage getPackage() {
		return ModelingTestPackage.eINSTANCE;
	}

} //ModelingTestFactoryImpl
