/**
 */
package ActivityDiagramMetamodel.impl;

import ActivityDiagramMetamodel.Action;
import ActivityDiagramMetamodel.ActivityDiagram;
import ActivityDiagramMetamodel.ActivityEdge;
import ActivityDiagramMetamodel.ActivityNode;
import ActivityDiagramMetamodel.ActivityParameterNode;
import ActivityDiagramMetamodel.ActivityPartition;
import ActivityDiagramMetamodel.CallAction;
import ActivityDiagramMetamodel.CallActivityAction;
import ActivityDiagramMetamodel.CallBehaviorAction;
import ActivityDiagramMetamodel.CallOperationAction;
import ActivityDiagramMetamodel.CommandAction;
import ActivityDiagramMetamodel.ControlFlow;
import ActivityDiagramMetamodel.ControlNode;
import ActivityDiagramMetamodel.DecisionNode;
import ActivityDiagramMetamodel.EventAction;
import ActivityDiagramMetamodel.ExecutableNode;
import ActivityDiagramMetamodel.FinalNode;
import ActivityDiagramMetamodel.ForkNode;
import ActivityDiagramMetamodel.InitialNode;
import ActivityDiagramMetamodel.InputPin;
import ActivityDiagramMetamodel.JoinNode;
import ActivityDiagramMetamodel.MergeNode;
import ActivityDiagramMetamodel.ModelingTestFactory;
import ActivityDiagramMetamodel.ModelingTestPackage;
import ActivityDiagramMetamodel.ObjectAction;
import ActivityDiagramMetamodel.ObjectActionKind;
import ActivityDiagramMetamodel.ObjectFlow;
import ActivityDiagramMetamodel.ObjectNode;
import ActivityDiagramMetamodel.ObjectNodeOrderingKind;
import ActivityDiagramMetamodel.OutputPin;
import ActivityDiagramMetamodel.Pin;
import ActivityDiagramMetamodel.StartObjectBehaviorAction;
import ActivityDiagramMetamodel.ValueSpecification;
import ActivityDiagramMetamodel.Variable;
import ActivityDiagramMetamodel.VariableAction;
import ActivityDiagramMetamodel.VariableActionKind;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelingTestPackageImpl extends EPackageImpl implements ModelingTestPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executableNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forkNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergeNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityParameterNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startObjectBehaviorActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callBehaviorActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callOperationActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callActivityActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityPartitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum objectNodeOrderingKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum objectActionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum variableActionKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ActivityDiagramMetamodel.ModelingTestPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelingTestPackageImpl() {
		super(eNS_URI, ModelingTestFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ModelingTestPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelingTestPackage init() {
		if (isInited) return (ModelingTestPackage)EPackage.Registry.INSTANCE.getEPackage(ModelingTestPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredModelingTestPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ModelingTestPackageImpl theModelingTestPackage = registeredModelingTestPackage instanceof ModelingTestPackageImpl ? (ModelingTestPackageImpl)registeredModelingTestPackage : new ModelingTestPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theModelingTestPackage.createPackageContents();

		// Initialize created meta-data
		theModelingTestPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelingTestPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelingTestPackage.eNS_URI, theModelingTestPackage);
		return theModelingTestPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActivityDiagram() {
		return activityDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActivityDiagram_Name() {
		return (EAttribute)activityDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActivityDiagram_Precondition() {
		return (EAttribute)activityDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActivityDiagram_Postcondition() {
		return (EAttribute)activityDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActivityDiagram_IsReadOnly() {
		return (EAttribute)activityDiagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActivityDiagram_IsSingleExecution() {
		return (EAttribute)activityDiagramEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivityDiagram_Activityedge() {
		return (EReference)activityDiagramEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivityDiagram_Activitynode() {
		return (EReference)activityDiagramEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivityDiagram_Variable() {
		return (EReference)activityDiagramEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivityDiagram_Activitypartition() {
		return (EReference)activityDiagramEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActivityNode() {
		return activityNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivityNode_Incomming() {
		return (EReference)activityNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivityNode_Outcomming() {
		return (EReference)activityNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivityNode_Activitypartition() {
		return (EReference)activityNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActivityEdge() {
		return activityEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActivityEdge_Name() {
		return (EAttribute)activityEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActivityEdge_Guard() {
		return (EAttribute)activityEdgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivityEdge_Target() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivityEdge_Source() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivityEdge_Weight() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivityEdge_Activitypartition() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getObjectFlow() {
		return objectFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getControlFlow() {
		return controlFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getControlNode() {
		return controlNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExecutableNode() {
		return executableNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInitialNode() {
		return initialNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getForkNode() {
		return forkNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJoinNode() {
		return joinNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDecisionNode() {
		return decisionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDecisionNode_Objectnode() {
		return (EReference)decisionNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDecisionNode_Name() {
		return (EAttribute)decisionNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMergeNode() {
		return mergeNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFinalNode() {
		return finalNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInputPin() {
		return inputPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutputPin() {
		return outputPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPin() {
		return pinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getObjectNode() {
		return objectNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjectNode_Name() {
		return (EAttribute)objectNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getObjectNode_UpperBound() {
		return (EReference)objectNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjectNode_IsControlType() {
		return (EAttribute)objectNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjectNode_Order() {
		return (EAttribute)objectNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActivityParameterNode() {
		return activityParameterNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariable_UpperBound() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariable_LowerBound() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValueSpecification() {
		return valueSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAction_Name() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAction_Inputpin() {
		return (EReference)actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAction_Outputpin() {
		return (EReference)actionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCallAction() {
		return callActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariableAction() {
		return variableActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariableAction_Kind() {
		return (EAttribute)variableActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStartObjectBehaviorAction() {
		return startObjectBehaviorActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getObjectAction() {
		return objectActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjectAction_Kind() {
		return (EAttribute)objectActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCallBehaviorAction() {
		return callBehaviorActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCallOperationAction() {
		return callOperationActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCallActivityAction() {
		return callActivityActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCallActivityAction_Activitydiagram() {
		return (EReference)callActivityActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActivityPartition() {
		return activityPartitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActivityPartition_Name() {
		return (EAttribute)activityPartitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivityPartition_Subpartition() {
		return (EReference)activityPartitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivityPartition_Activityedge() {
		return (EReference)activityPartitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivityPartition_Activitynode() {
		return (EReference)activityPartitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventAction() {
		return eventActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommandAction() {
		return commandActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getObjectNodeOrderingKind() {
		return objectNodeOrderingKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getObjectActionKind() {
		return objectActionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getVariableActionKind() {
		return variableActionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelingTestFactory getModelingTestFactory() {
		return (ModelingTestFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		activityDiagramEClass = createEClass(ACTIVITY_DIAGRAM);
		createEAttribute(activityDiagramEClass, ACTIVITY_DIAGRAM__NAME);
		createEAttribute(activityDiagramEClass, ACTIVITY_DIAGRAM__PRECONDITION);
		createEAttribute(activityDiagramEClass, ACTIVITY_DIAGRAM__POSTCONDITION);
		createEAttribute(activityDiagramEClass, ACTIVITY_DIAGRAM__IS_READ_ONLY);
		createEAttribute(activityDiagramEClass, ACTIVITY_DIAGRAM__IS_SINGLE_EXECUTION);
		createEReference(activityDiagramEClass, ACTIVITY_DIAGRAM__ACTIVITYEDGE);
		createEReference(activityDiagramEClass, ACTIVITY_DIAGRAM__ACTIVITYNODE);
		createEReference(activityDiagramEClass, ACTIVITY_DIAGRAM__VARIABLE);
		createEReference(activityDiagramEClass, ACTIVITY_DIAGRAM__ACTIVITYPARTITION);

		activityNodeEClass = createEClass(ACTIVITY_NODE);
		createEReference(activityNodeEClass, ACTIVITY_NODE__INCOMMING);
		createEReference(activityNodeEClass, ACTIVITY_NODE__OUTCOMMING);
		createEReference(activityNodeEClass, ACTIVITY_NODE__ACTIVITYPARTITION);

		activityEdgeEClass = createEClass(ACTIVITY_EDGE);
		createEAttribute(activityEdgeEClass, ACTIVITY_EDGE__NAME);
		createEAttribute(activityEdgeEClass, ACTIVITY_EDGE__GUARD);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__TARGET);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__SOURCE);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__WEIGHT);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__ACTIVITYPARTITION);

		objectFlowEClass = createEClass(OBJECT_FLOW);

		controlFlowEClass = createEClass(CONTROL_FLOW);

		controlNodeEClass = createEClass(CONTROL_NODE);

		executableNodeEClass = createEClass(EXECUTABLE_NODE);

		initialNodeEClass = createEClass(INITIAL_NODE);

		forkNodeEClass = createEClass(FORK_NODE);

		joinNodeEClass = createEClass(JOIN_NODE);

		decisionNodeEClass = createEClass(DECISION_NODE);
		createEReference(decisionNodeEClass, DECISION_NODE__OBJECTNODE);
		createEAttribute(decisionNodeEClass, DECISION_NODE__NAME);

		mergeNodeEClass = createEClass(MERGE_NODE);

		finalNodeEClass = createEClass(FINAL_NODE);

		inputPinEClass = createEClass(INPUT_PIN);

		outputPinEClass = createEClass(OUTPUT_PIN);

		pinEClass = createEClass(PIN);

		objectNodeEClass = createEClass(OBJECT_NODE);
		createEAttribute(objectNodeEClass, OBJECT_NODE__NAME);
		createEReference(objectNodeEClass, OBJECT_NODE__UPPER_BOUND);
		createEAttribute(objectNodeEClass, OBJECT_NODE__IS_CONTROL_TYPE);
		createEAttribute(objectNodeEClass, OBJECT_NODE__ORDER);

		activityParameterNodeEClass = createEClass(ACTIVITY_PARAMETER_NODE);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__UPPER_BOUND);
		createEAttribute(variableEClass, VARIABLE__LOWER_BOUND);

		valueSpecificationEClass = createEClass(VALUE_SPECIFICATION);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__NAME);
		createEReference(actionEClass, ACTION__INPUTPIN);
		createEReference(actionEClass, ACTION__OUTPUTPIN);

		callActionEClass = createEClass(CALL_ACTION);

		variableActionEClass = createEClass(VARIABLE_ACTION);
		createEAttribute(variableActionEClass, VARIABLE_ACTION__KIND);

		startObjectBehaviorActionEClass = createEClass(START_OBJECT_BEHAVIOR_ACTION);

		objectActionEClass = createEClass(OBJECT_ACTION);
		createEAttribute(objectActionEClass, OBJECT_ACTION__KIND);

		callBehaviorActionEClass = createEClass(CALL_BEHAVIOR_ACTION);

		callOperationActionEClass = createEClass(CALL_OPERATION_ACTION);

		callActivityActionEClass = createEClass(CALL_ACTIVITY_ACTION);
		createEReference(callActivityActionEClass, CALL_ACTIVITY_ACTION__ACTIVITYDIAGRAM);

		activityPartitionEClass = createEClass(ACTIVITY_PARTITION);
		createEAttribute(activityPartitionEClass, ACTIVITY_PARTITION__NAME);
		createEReference(activityPartitionEClass, ACTIVITY_PARTITION__SUBPARTITION);
		createEReference(activityPartitionEClass, ACTIVITY_PARTITION__ACTIVITYEDGE);
		createEReference(activityPartitionEClass, ACTIVITY_PARTITION__ACTIVITYNODE);

		eventActionEClass = createEClass(EVENT_ACTION);

		commandActionEClass = createEClass(COMMAND_ACTION);

		// Create enums
		objectNodeOrderingKindEEnum = createEEnum(OBJECT_NODE_ORDERING_KIND);
		objectActionKindEEnum = createEEnum(OBJECT_ACTION_KIND);
		variableActionKindEEnum = createEEnum(VARIABLE_ACTION_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		objectFlowEClass.getESuperTypes().add(this.getActivityEdge());
		controlFlowEClass.getESuperTypes().add(this.getActivityEdge());
		controlNodeEClass.getESuperTypes().add(this.getActivityNode());
		executableNodeEClass.getESuperTypes().add(this.getActivityNode());
		initialNodeEClass.getESuperTypes().add(this.getControlNode());
		forkNodeEClass.getESuperTypes().add(this.getControlNode());
		joinNodeEClass.getESuperTypes().add(this.getControlNode());
		decisionNodeEClass.getESuperTypes().add(this.getControlNode());
		mergeNodeEClass.getESuperTypes().add(this.getControlNode());
		finalNodeEClass.getESuperTypes().add(this.getControlNode());
		inputPinEClass.getESuperTypes().add(this.getPin());
		outputPinEClass.getESuperTypes().add(this.getPin());
		pinEClass.getESuperTypes().add(this.getObjectNode());
		objectNodeEClass.getESuperTypes().add(this.getActivityNode());
		activityParameterNodeEClass.getESuperTypes().add(this.getObjectNode());
		actionEClass.getESuperTypes().add(this.getExecutableNode());
		callActionEClass.getESuperTypes().add(this.getAction());
		variableActionEClass.getESuperTypes().add(this.getCallAction());
		startObjectBehaviorActionEClass.getESuperTypes().add(this.getCallAction());
		objectActionEClass.getESuperTypes().add(this.getCallAction());
		callBehaviorActionEClass.getESuperTypes().add(this.getCallAction());
		callOperationActionEClass.getESuperTypes().add(this.getCallAction());
		callActivityActionEClass.getESuperTypes().add(this.getCallAction());
		eventActionEClass.getESuperTypes().add(this.getAction());
		commandActionEClass.getESuperTypes().add(this.getAction());

		// Initialize classes and features; add operations and parameters
		initEClass(activityDiagramEClass, ActivityDiagram.class, "ActivityDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivityDiagram_Name(), ecorePackage.getEString(), "name", null, 0, 1, ActivityDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivityDiagram_Precondition(), ecorePackage.getEString(), "precondition", null, 0, 1, ActivityDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivityDiagram_Postcondition(), ecorePackage.getEString(), "postcondition", null, 0, 1, ActivityDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivityDiagram_IsReadOnly(), ecorePackage.getEBoolean(), "isReadOnly", null, 0, 1, ActivityDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivityDiagram_IsSingleExecution(), ecorePackage.getEBoolean(), "isSingleExecution", null, 0, 1, ActivityDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityDiagram_Activityedge(), this.getActivityEdge(), null, "activityedge", null, 0, -1, ActivityDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityDiagram_Activitynode(), this.getActivityNode(), null, "activitynode", null, 0, -1, ActivityDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityDiagram_Variable(), this.getVariable(), null, "variable", null, 0, -1, ActivityDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityDiagram_Activitypartition(), this.getActivityPartition(), null, "activitypartition", null, 0, -1, ActivityDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityNodeEClass, ActivityNode.class, "ActivityNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityNode_Incomming(), this.getActivityEdge(), this.getActivityEdge_Target(), "incomming", null, 0, -1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNode_Outcomming(), this.getActivityEdge(), this.getActivityEdge_Source(), "outcomming", null, 0, -1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNode_Activitypartition(), this.getActivityPartition(), this.getActivityPartition_Activitynode(), "activitypartition", null, 0, -1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityEdgeEClass, ActivityEdge.class, "ActivityEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivityEdge_Name(), ecorePackage.getEString(), "name", null, 0, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivityEdge_Guard(), ecorePackage.getEString(), "guard", null, 0, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityEdge_Target(), this.getActivityNode(), this.getActivityNode_Incomming(), "target", null, 1, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityEdge_Source(), this.getActivityNode(), this.getActivityNode_Outcomming(), "source", null, 1, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityEdge_Weight(), this.getValueSpecification(), null, "weight", null, 0, -1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityEdge_Activitypartition(), this.getActivityPartition(), this.getActivityPartition_Activityedge(), "activitypartition", null, 0, -1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectFlowEClass, ObjectFlow.class, "ObjectFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(controlFlowEClass, ControlFlow.class, "ControlFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(controlNodeEClass, ControlNode.class, "ControlNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(executableNodeEClass, ExecutableNode.class, "ExecutableNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(initialNodeEClass, InitialNode.class, "InitialNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(forkNodeEClass, ForkNode.class, "ForkNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(joinNodeEClass, JoinNode.class, "JoinNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(decisionNodeEClass, DecisionNode.class, "DecisionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDecisionNode_Objectnode(), this.getObjectNode(), null, "objectnode", null, 0, -1, DecisionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecisionNode_Name(), ecorePackage.getEString(), "name", null, 0, 1, DecisionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mergeNodeEClass, MergeNode.class, "MergeNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finalNodeEClass, FinalNode.class, "FinalNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputPinEClass, InputPin.class, "InputPin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(outputPinEClass, OutputPin.class, "OutputPin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pinEClass, Pin.class, "Pin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectNodeEClass, ObjectNode.class, "ObjectNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectNode_Name(), ecorePackage.getEString(), "name", null, 0, 1, ObjectNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectNode_UpperBound(), this.getValueSpecification(), null, "upperBound", null, 0, 1, ObjectNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectNode_IsControlType(), ecorePackage.getEBoolean(), "isControlType", null, 0, 1, ObjectNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectNode_Order(), this.getObjectNodeOrderingKind(), "order", "FIFO", 0, 1, ObjectNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityParameterNodeEClass, ActivityParameterNode.class, "ActivityParameterNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_UpperBound(), ecorePackage.getEInt(), "upperBound", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_LowerBound(), ecorePackage.getEInt(), "lowerBound", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueSpecificationEClass, ValueSpecification.class, "ValueSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_Name(), ecorePackage.getEString(), "name", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction_Inputpin(), this.getInputPin(), null, "inputpin", null, 0, -1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction_Outputpin(), this.getOutputPin(), null, "outputpin", null, 0, -1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callActionEClass, CallAction.class, "CallAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableActionEClass, VariableAction.class, "VariableAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariableAction_Kind(), this.getVariableActionKind(), "kind", null, 0, 1, VariableAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(startObjectBehaviorActionEClass, StartObjectBehaviorAction.class, "StartObjectBehaviorAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectActionEClass, ObjectAction.class, "ObjectAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectAction_Kind(), this.getObjectActionKind(), "kind", null, 0, 1, ObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callBehaviorActionEClass, CallBehaviorAction.class, "CallBehaviorAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(callOperationActionEClass, CallOperationAction.class, "CallOperationAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(callActivityActionEClass, CallActivityAction.class, "CallActivityAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCallActivityAction_Activitydiagram(), this.getActivityDiagram(), null, "activitydiagram", null, 1, 1, CallActivityAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityPartitionEClass, ActivityPartition.class, "ActivityPartition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivityPartition_Name(), ecorePackage.getEString(), "name", null, 0, 1, ActivityPartition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityPartition_Subpartition(), this.getActivityPartition(), null, "subpartition", null, 0, -1, ActivityPartition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityPartition_Activityedge(), this.getActivityEdge(), this.getActivityEdge_Activitypartition(), "activityedge", null, 0, -1, ActivityPartition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityPartition_Activitynode(), this.getActivityNode(), this.getActivityNode_Activitypartition(), "activitynode", null, 0, -1, ActivityPartition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventActionEClass, EventAction.class, "EventAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(commandActionEClass, CommandAction.class, "CommandAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(objectNodeOrderingKindEEnum, ObjectNodeOrderingKind.class, "ObjectNodeOrderingKind");
		addEEnumLiteral(objectNodeOrderingKindEEnum, ObjectNodeOrderingKind.UNORDERED);
		addEEnumLiteral(objectNodeOrderingKindEEnum, ObjectNodeOrderingKind.ORDERED);
		addEEnumLiteral(objectNodeOrderingKindEEnum, ObjectNodeOrderingKind.FIFO);
		addEEnumLiteral(objectNodeOrderingKindEEnum, ObjectNodeOrderingKind.LIFO);

		initEEnum(objectActionKindEEnum, ObjectActionKind.class, "ObjectActionKind");
		addEEnumLiteral(objectActionKindEEnum, ObjectActionKind.CREATE_OBJECT_ACTION);
		addEEnumLiteral(objectActionKindEEnum, ObjectActionKind.DESTROY_OBJECT_ACTION);
		addEEnumLiteral(objectActionKindEEnum, ObjectActionKind.TEST_IDENTITY_ACTION);
		addEEnumLiteral(objectActionKindEEnum, ObjectActionKind.READ_SELF_ACTION);
		addEEnumLiteral(objectActionKindEEnum, ObjectActionKind.VALUE_SPECIFICATION_ACTION);

		initEEnum(variableActionKindEEnum, VariableActionKind.class, "VariableActionKind");
		addEEnumLiteral(variableActionKindEEnum, VariableActionKind.CLEAR_VARIABLE_ACTION);
		addEEnumLiteral(variableActionKindEEnum, VariableActionKind.WRITE_VARIABLE_ACTION);
		addEEnumLiteral(variableActionKindEEnum, VariableActionKind.READ_VARIABLE_ACTION);
		addEEnumLiteral(variableActionKindEEnum, VariableActionKind.MATHEMATICAL_VARIABLE_ACTION);

		// Create resource
		createResource(eNS_URI);
	}

} //ModelingTestPackageImpl
