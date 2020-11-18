/**
 */
package ActivityDiagramMetamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ActivityDiagramMetamodel.ActivityDiagramMetamodelFactory
 * @model kind="package"
 *        annotation="gmf"
 * @generated
 */
public interface ActivityDiagramMetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ActivityDiagramMetamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "resources/mm/CIM/ActivityDiagram.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mde";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ActivityDiagramMetamodelPackage eINSTANCE = ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link ActivityDiagramMetamodel.impl.ActivityDiagramImpl <em>Activity Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagramMetamodel.impl.ActivityDiagramImpl
	 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getActivityDiagram()
	 * @generated
	 */
	int ACTIVITY_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM__PRECONDITION = 1;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM__POSTCONDITION = 2;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM__IS_READ_ONLY = 3;

	/**
	 * The feature id for the '<em><b>Is Single Execution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM__IS_SINGLE_EXECUTION = 4;

	/**
	 * The feature id for the '<em><b>Activityedge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM__ACTIVITYEDGE = 5;

	/**
	 * The feature id for the '<em><b>Activitynode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM__ACTIVITYNODE = 6;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM__VARIABLE = 7;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM__ACTIVITYPARTITION = 8;

	/**
	 * The number of structural features of the '<em>Activity Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DIAGRAM_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link ActivityDiagramMetamodel.impl.ActivityNodeImpl <em>Activity Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagramMetamodel.impl.ActivityNodeImpl
	 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getActivityNode()
	 * @generated
	 */
	int ACTIVITY_NODE = 1;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__INCOMMING = 0;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__OUTCOMMING = 1;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__ACTIVITYPARTITION = 2;

	/**
	 * The number of structural features of the '<em>Activity Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link ActivityDiagramMetamodel.impl.ActivityEdgeImpl <em>Activity Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagramMetamodel.impl.ActivityEdgeImpl
	 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getActivityEdge()
	 * @generated
	 */
	int ACTIVITY_EDGE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__GUARD = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__TARGET = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__SOURCE = 3;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__WEIGHT = 4;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__ACTIVITYPARTITION = 5;

	/**
	 * The number of structural features of the '<em>Activity Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link ActivityDiagramMetamodel.impl.ObjectFlowImpl <em>Object Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagramMetamodel.impl.ObjectFlowImpl
	 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getObjectFlow()
	 * @generated
	 */
	int OBJECT_FLOW = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__NAME = ACTIVITY_EDGE__NAME;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__GUARD = ACTIVITY_EDGE__GUARD;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__TARGET = ACTIVITY_EDGE__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__SOURCE = ACTIVITY_EDGE__SOURCE;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__WEIGHT = ACTIVITY_EDGE__WEIGHT;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__ACTIVITYPARTITION = ACTIVITY_EDGE__ACTIVITYPARTITION;

	/**
	 * The number of structural features of the '<em>Object Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW_FEATURE_COUNT = ACTIVITY_EDGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ActivityDiagramMetamodel.impl.ControlFlowImpl <em>Control Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagramMetamodel.impl.ControlFlowImpl
	 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getControlFlow()
	 * @generated
	 */
	int CONTROL_FLOW = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__NAME = ACTIVITY_EDGE__NAME;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__GUARD = ACTIVITY_EDGE__GUARD;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__TARGET = ACTIVITY_EDGE__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__SOURCE = ACTIVITY_EDGE__SOURCE;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__WEIGHT = ACTIVITY_EDGE__WEIGHT;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__ACTIVITYPARTITION = ACTIVITY_EDGE__ACTIVITYPARTITION;

	/**
	 * The number of structural features of the '<em>Control Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_FEATURE_COUNT = ACTIVITY_EDGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ActivityDiagramMetamodel.impl.ControlNodeImpl <em>Control Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagramMetamodel.impl.ControlNodeImpl
	 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getControlNode()
	 * @generated
	 */
	int CONTROL_NODE = 5;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__INCOMMING = ACTIVITY_NODE__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__OUTCOMMING = ACTIVITY_NODE__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__ACTIVITYPARTITION = ACTIVITY_NODE__ACTIVITYPARTITION;

	/**
	 * The number of structural features of the '<em>Control Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_FEATURE_COUNT = ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ActivityDiagramMetamodel.impl.ExecutableNodeImpl <em>Executable Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagramMetamodel.impl.ExecutableNodeImpl
	 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getExecutableNode()
	 * @generated
	 */
	int EXECUTABLE_NODE = 6;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__INCOMMING = ACTIVITY_NODE__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__OUTCOMMING = ACTIVITY_NODE__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__ACTIVITYPARTITION = ACTIVITY_NODE__ACTIVITYPARTITION;

	/**
	 * The number of structural features of the '<em>Executable Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE_FEATURE_COUNT = ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ActivityDiagramMetamodel.impl.InitialNodeImpl <em>Initial Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagramMetamodel.impl.InitialNodeImpl
	 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getInitialNode()
	 * @generated
	 */
	int INITIAL_NODE = 7;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__INCOMMING = CONTROL_NODE__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__OUTCOMMING = CONTROL_NODE__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__ACTIVITYPARTITION = CONTROL_NODE__ACTIVITYPARTITION;

	/**
	 * The number of structural features of the '<em>Initial Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ActivityDiagramMetamodel.impl.ForkNodeImpl <em>Fork Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagramMetamodel.impl.ForkNodeImpl
	 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getForkNode()
	 * @generated
	 */
	int FORK_NODE = 8;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__INCOMMING = CONTROL_NODE__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__OUTCOMMING = CONTROL_NODE__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__ACTIVITYPARTITION = CONTROL_NODE__ACTIVITYPARTITION;

	/**
	 * The number of structural features of the '<em>Fork Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ActivityDiagramMetamodel.impl.JoinNodeImpl <em>Join Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagramMetamodel.impl.JoinNodeImpl
	 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getJoinNode()
	 * @generated
	 */
	int JOIN_NODE = 9;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__INCOMMING = CONTROL_NODE__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__OUTCOMMING = CONTROL_NODE__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__ACTIVITYPARTITION = CONTROL_NODE__ACTIVITYPARTITION;

	/**
	 * The number of structural features of the '<em>Join Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ActivityDiagramMetamodel.impl.DecisionNodeImpl <em>Decision Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagramMetamodel.impl.DecisionNodeImpl
	 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getDecisionNode()
	 * @generated
	 */
	int DECISION_NODE = 10;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__INCOMMING = CONTROL_NODE__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__OUTCOMMING = CONTROL_NODE__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__ACTIVITYPARTITION = CONTROL_NODE__ACTIVITYPARTITION;

	/**
	 * The feature id for the '<em><b>Objectnode</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__OBJECTNODE = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__NAME = CONTROL_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Decision Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ActivityDiagramMetamodel.impl.MergeNodeImpl <em>Merge Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagramMetamodel.impl.MergeNodeImpl
	 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getMergeNode()
	 * @generated
	 */
	int MERGE_NODE = 11;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__INCOMMING = CONTROL_NODE__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__OUTCOMMING = CONTROL_NODE__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__ACTIVITYPARTITION = CONTROL_NODE__ACTIVITYPARTITION;

	/**
	 * The number of structural features of the '<em>Merge Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ActivityDiagramMetamodel.impl.FinalNodeImpl <em>Final Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagramMetamodel.impl.FinalNodeImpl
	 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getFinalNode()
	 * @generated
	 */
	int FINAL_NODE = 12;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__INCOMMING = CONTROL_NODE__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__OUTCOMMING = CONTROL_NODE__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__ACTIVITYPARTITION = CONTROL_NODE__ACTIVITYPARTITION;

	/**
	 * The number of structural features of the '<em>Final Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ActivityDiagramMetamodel.impl.ObjectNodeImpl <em>Object Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagramMetamodel.impl.ObjectNodeImpl
	 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getObjectNode()
	 * @generated
	 */
	int OBJECT_NODE = 16;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__INCOMMING = ACTIVITY_NODE__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__OUTCOMMING = ACTIVITY_NODE__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__ACTIVITYPARTITION = ACTIVITY_NODE__ACTIVITYPARTITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__NAME = ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__UPPER_BOUND = ACTIVITY_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Control Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__IS_CONTROL_TYPE = ACTIVITY_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__ORDER = ACTIVITY_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Object Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE_FEATURE_COUNT = ACTIVITY_NODE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link ActivityDiagramMetamodel.impl.PinImpl <em>Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagramMetamodel.impl.PinImpl
	 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getPin()
	 * @generated
	 */
	int PIN = 15;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__INCOMMING = OBJECT_NODE__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__OUTCOMMING = OBJECT_NODE__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__ACTIVITYPARTITION = OBJECT_NODE__ACTIVITYPARTITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__NAME = OBJECT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__UPPER_BOUND = OBJECT_NODE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Is Control Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__IS_CONTROL_TYPE = OBJECT_NODE__IS_CONTROL_TYPE;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__ORDER = OBJECT_NODE__ORDER;

	/**
	 * The number of structural features of the '<em>Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_FEATURE_COUNT = OBJECT_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ActivityDiagramMetamodel.impl.InputPinImpl <em>Input Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagramMetamodel.impl.InputPinImpl
	 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getInputPin()
	 * @generated
	 */
	int INPUT_PIN = 13;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__INCOMMING = PIN__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__OUTCOMMING = PIN__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__ACTIVITYPARTITION = PIN__ACTIVITYPARTITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__NAME = PIN__NAME;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__UPPER_BOUND = PIN__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Is Control Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__IS_CONTROL_TYPE = PIN__IS_CONTROL_TYPE;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__ORDER = PIN__ORDER;

	/**
	 * The number of structural features of the '<em>Input Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN_FEATURE_COUNT = PIN_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ActivityDiagramMetamodel.impl.OutputPinImpl <em>Output Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagramMetamodel.impl.OutputPinImpl
	 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getOutputPin()
	 * @generated
	 */
	int OUTPUT_PIN = 14;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__INCOMMING = PIN__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__OUTCOMMING = PIN__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__ACTIVITYPARTITION = PIN__ACTIVITYPARTITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__NAME = PIN__NAME;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__UPPER_BOUND = PIN__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Is Control Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__IS_CONTROL_TYPE = PIN__IS_CONTROL_TYPE;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__ORDER = PIN__ORDER;

	/**
	 * The number of structural features of the '<em>Output Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN_FEATURE_COUNT = PIN_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ActivityDiagramMetamodel.impl.ActivityParameterNodeImpl <em>Activity Parameter Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagramMetamodel.impl.ActivityParameterNodeImpl
	 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getActivityParameterNode()
	 * @generated
	 */
	int ACTIVITY_PARAMETER_NODE = 17;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE__INCOMMING = OBJECT_NODE__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE__OUTCOMMING = OBJECT_NODE__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE__ACTIVITYPARTITION = OBJECT_NODE__ACTIVITYPARTITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE__NAME = OBJECT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE__UPPER_BOUND = OBJECT_NODE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Is Control Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE__IS_CONTROL_TYPE = OBJECT_NODE__IS_CONTROL_TYPE;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE__ORDER = OBJECT_NODE__ORDER;

	/**
	 * The number of structural features of the '<em>Activity Parameter Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARAMETER_NODE_FEATURE_COUNT = OBJECT_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ActivityDiagramMetamodel.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagramMetamodel.impl.VariableImpl
	 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 18;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__UPPER_BOUND = 0;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__LOWER_BOUND = 1;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ActivityDiagramMetamodel.impl.ValueSpecificationImpl <em>Value Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagramMetamodel.impl.ValueSpecificationImpl
	 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getValueSpecification()
	 * @generated
	 */
	int VALUE_SPECIFICATION = 19;

	/**
	 * The number of structural features of the '<em>Value Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link ActivityDiagramMetamodel.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagramMetamodel.impl.ActionImpl
	 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 20;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__INCOMMING = EXECUTABLE_NODE__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__OUTCOMMING = EXECUTABLE_NODE__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTIVITYPARTITION = EXECUTABLE_NODE__ACTIVITYPARTITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = EXECUTABLE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inputpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__INPUTPIN = EXECUTABLE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outputpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__OUTPUTPIN = EXECUTABLE_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = EXECUTABLE_NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ActivityDiagramMetamodel.impl.CallActionImpl <em>Call Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagramMetamodel.impl.CallActionImpl
	 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getCallAction()
	 * @generated
	 */
	int CALL_ACTION = 21;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__INCOMMING = ACTION__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__OUTCOMMING = ACTION__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__ACTIVITYPARTITION = ACTION__ACTIVITYPARTITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Inputpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__INPUTPIN = ACTION__INPUTPIN;

	/**
	 * The feature id for the '<em><b>Outputpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__OUTPUTPIN = ACTION__OUTPUTPIN;

	/**
	 * The number of structural features of the '<em>Call Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ActivityDiagramMetamodel.impl.VariableActionImpl <em>Variable Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagramMetamodel.impl.VariableActionImpl
	 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getVariableAction()
	 * @generated
	 */
	int VARIABLE_ACTION = 22;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION__INCOMMING = CALL_ACTION__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION__OUTCOMMING = CALL_ACTION__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION__ACTIVITYPARTITION = CALL_ACTION__ACTIVITYPARTITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION__NAME = CALL_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Inputpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION__INPUTPIN = CALL_ACTION__INPUTPIN;

	/**
	 * The feature id for the '<em><b>Outputpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION__OUTPUTPIN = CALL_ACTION__OUTPUTPIN;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION__KIND = CALL_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACTION_FEATURE_COUNT = CALL_ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ActivityDiagramMetamodel.impl.StartObjectBehaviorActionImpl <em>Start Object Behavior Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagramMetamodel.impl.StartObjectBehaviorActionImpl
	 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getStartObjectBehaviorAction()
	 * @generated
	 */
	int START_OBJECT_BEHAVIOR_ACTION = 23;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__INCOMMING = CALL_ACTION__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__OUTCOMMING = CALL_ACTION__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__ACTIVITYPARTITION = CALL_ACTION__ACTIVITYPARTITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__NAME = CALL_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Inputpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__INPUTPIN = CALL_ACTION__INPUTPIN;

	/**
	 * The feature id for the '<em><b>Outputpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION__OUTPUTPIN = CALL_ACTION__OUTPUTPIN;

	/**
	 * The number of structural features of the '<em>Start Object Behavior Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OBJECT_BEHAVIOR_ACTION_FEATURE_COUNT = CALL_ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ActivityDiagramMetamodel.impl.ObjectActionImpl <em>Object Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagramMetamodel.impl.ObjectActionImpl
	 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getObjectAction()
	 * @generated
	 */
	int OBJECT_ACTION = 24;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ACTION__INCOMMING = CALL_ACTION__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ACTION__OUTCOMMING = CALL_ACTION__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ACTION__ACTIVITYPARTITION = CALL_ACTION__ACTIVITYPARTITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ACTION__NAME = CALL_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Inputpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ACTION__INPUTPIN = CALL_ACTION__INPUTPIN;

	/**
	 * The feature id for the '<em><b>Outputpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ACTION__OUTPUTPIN = CALL_ACTION__OUTPUTPIN;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ACTION__KIND = CALL_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ACTION_FEATURE_COUNT = CALL_ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ActivityDiagramMetamodel.impl.CallBehaviorActionImpl <em>Call Behavior Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagramMetamodel.impl.CallBehaviorActionImpl
	 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getCallBehaviorAction()
	 * @generated
	 */
	int CALL_BEHAVIOR_ACTION = 25;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__INCOMMING = CALL_ACTION__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__OUTCOMMING = CALL_ACTION__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__ACTIVITYPARTITION = CALL_ACTION__ACTIVITYPARTITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__NAME = CALL_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Inputpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__INPUTPIN = CALL_ACTION__INPUTPIN;

	/**
	 * The feature id for the '<em><b>Outputpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__OUTPUTPIN = CALL_ACTION__OUTPUTPIN;

	/**
	 * The number of structural features of the '<em>Call Behavior Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION_FEATURE_COUNT = CALL_ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ActivityDiagramMetamodel.impl.CallOperationActionImpl <em>Call Operation Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagramMetamodel.impl.CallOperationActionImpl
	 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getCallOperationAction()
	 * @generated
	 */
	int CALL_OPERATION_ACTION = 26;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__INCOMMING = CALL_ACTION__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__OUTCOMMING = CALL_ACTION__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__ACTIVITYPARTITION = CALL_ACTION__ACTIVITYPARTITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__NAME = CALL_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Inputpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__INPUTPIN = CALL_ACTION__INPUTPIN;

	/**
	 * The feature id for the '<em><b>Outputpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION__OUTPUTPIN = CALL_ACTION__OUTPUTPIN;

	/**
	 * The number of structural features of the '<em>Call Operation Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_ACTION_FEATURE_COUNT = CALL_ACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ActivityDiagramMetamodel.impl.CallActivityActionImpl <em>Call Activity Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagramMetamodel.impl.CallActivityActionImpl
	 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getCallActivityAction()
	 * @generated
	 */
	int CALL_ACTIVITY_ACTION = 27;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY_ACTION__INCOMMING = CALL_ACTION__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY_ACTION__OUTCOMMING = CALL_ACTION__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY_ACTION__ACTIVITYPARTITION = CALL_ACTION__ACTIVITYPARTITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY_ACTION__NAME = CALL_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Inputpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY_ACTION__INPUTPIN = CALL_ACTION__INPUTPIN;

	/**
	 * The feature id for the '<em><b>Outputpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY_ACTION__OUTPUTPIN = CALL_ACTION__OUTPUTPIN;

	/**
	 * The feature id for the '<em><b>Activitydiagram</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY_ACTION__ACTIVITYDIAGRAM = CALL_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Call Activity Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY_ACTION_FEATURE_COUNT = CALL_ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ActivityDiagramMetamodel.impl.ActivityPartitionImpl <em>Activity Partition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagramMetamodel.impl.ActivityPartitionImpl
	 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getActivityPartition()
	 * @generated
	 */
	int ACTIVITY_PARTITION = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Subpartition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION__SUBPARTITION = 1;

	/**
	 * The feature id for the '<em><b>Activityedge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION__ACTIVITYEDGE = 2;

	/**
	 * The feature id for the '<em><b>Activitynode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION__ACTIVITYNODE = 3;

	/**
	 * The number of structural features of the '<em>Activity Partition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link ActivityDiagramMetamodel.impl.EventActionImpl <em>Event Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagramMetamodel.impl.EventActionImpl
	 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getEventAction()
	 * @generated
	 */
	int EVENT_ACTION = 29;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ACTION__INCOMMING = ACTION__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ACTION__OUTCOMMING = ACTION__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ACTION__ACTIVITYPARTITION = ACTION__ACTIVITYPARTITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Inputpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ACTION__INPUTPIN = ACTION__INPUTPIN;

	/**
	 * The feature id for the '<em><b>Outputpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ACTION__OUTPUTPIN = ACTION__OUTPUTPIN;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ACTION__AGGREGATE = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ActivityDiagramMetamodel.impl.CommandActionImpl <em>Command Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagramMetamodel.impl.CommandActionImpl
	 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getCommandAction()
	 * @generated
	 */
	int COMMAND_ACTION = 30;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_ACTION__INCOMMING = ACTION__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_ACTION__OUTCOMMING = ACTION__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_ACTION__ACTIVITYPARTITION = ACTION__ACTIVITYPARTITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Inputpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_ACTION__INPUTPIN = ACTION__INPUTPIN;

	/**
	 * The feature id for the '<em><b>Outputpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_ACTION__OUTPUTPIN = ACTION__OUTPUTPIN;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_ACTION__AGGREGATE = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Command Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ActivityDiagramMetamodel.impl.AggregateImpl <em>Aggregate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagramMetamodel.impl.AggregateImpl
	 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getAggregate()
	 * @generated
	 */
	int AGGREGATE = 31;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__INCOMMING = OBJECT_NODE__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__OUTCOMMING = OBJECT_NODE__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__ACTIVITYPARTITION = OBJECT_NODE__ACTIVITYPARTITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__NAME = OBJECT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__UPPER_BOUND = OBJECT_NODE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Is Control Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__IS_CONTROL_TYPE = OBJECT_NODE__IS_CONTROL_TYPE;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__ORDER = OBJECT_NODE__ORDER;

	/**
	 * The feature id for the '<em><b>Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__EVENTS = OBJECT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__COMMAND = OBJECT_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__QUERY = OBJECT_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Aggregate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_FEATURE_COUNT = OBJECT_NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ActivityDiagramMetamodel.impl.QueryActionImpl <em>Query Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagramMetamodel.impl.QueryActionImpl
	 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getQueryAction()
	 * @generated
	 */
	int QUERY_ACTION = 32;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_ACTION__INCOMMING = ACTION__INCOMMING;

	/**
	 * The feature id for the '<em><b>Outcomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_ACTION__OUTCOMMING = ACTION__OUTCOMMING;

	/**
	 * The feature id for the '<em><b>Activitypartition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_ACTION__ACTIVITYPARTITION = ACTION__ACTIVITYPARTITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Inputpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_ACTION__INPUTPIN = ACTION__INPUTPIN;

	/**
	 * The feature id for the '<em><b>Outputpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_ACTION__OUTPUTPIN = ACTION__OUTPUTPIN;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_ACTION__AGGREGATE = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Query Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ActivityDiagramMetamodel.ObjectNodeOrderingKind <em>Object Node Ordering Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagramMetamodel.ObjectNodeOrderingKind
	 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getObjectNodeOrderingKind()
	 * @generated
	 */
	int OBJECT_NODE_ORDERING_KIND = 33;

	/**
	 * The meta object id for the '{@link ActivityDiagramMetamodel.ObjectActionKind <em>Object Action Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagramMetamodel.ObjectActionKind
	 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getObjectActionKind()
	 * @generated
	 */
	int OBJECT_ACTION_KIND = 34;

	/**
	 * The meta object id for the '{@link ActivityDiagramMetamodel.VariableActionKind <em>Variable Action Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ActivityDiagramMetamodel.VariableActionKind
	 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getVariableActionKind()
	 * @generated
	 */
	int VARIABLE_ACTION_KIND = 35;


	/**
	 * Returns the meta object for class '{@link ActivityDiagramMetamodel.ActivityDiagram <em>Activity Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Diagram</em>'.
	 * @see ActivityDiagramMetamodel.ActivityDiagram
	 * @generated
	 */
	EClass getActivityDiagram();

	/**
	 * Returns the meta object for the attribute '{@link ActivityDiagramMetamodel.ActivityDiagram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ActivityDiagramMetamodel.ActivityDiagram#getName()
	 * @see #getActivityDiagram()
	 * @generated
	 */
	EAttribute getActivityDiagram_Name();

	/**
	 * Returns the meta object for the attribute '{@link ActivityDiagramMetamodel.ActivityDiagram#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precondition</em>'.
	 * @see ActivityDiagramMetamodel.ActivityDiagram#getPrecondition()
	 * @see #getActivityDiagram()
	 * @generated
	 */
	EAttribute getActivityDiagram_Precondition();

	/**
	 * Returns the meta object for the attribute '{@link ActivityDiagramMetamodel.ActivityDiagram#getPostcondition <em>Postcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postcondition</em>'.
	 * @see ActivityDiagramMetamodel.ActivityDiagram#getPostcondition()
	 * @see #getActivityDiagram()
	 * @generated
	 */
	EAttribute getActivityDiagram_Postcondition();

	/**
	 * Returns the meta object for the attribute '{@link ActivityDiagramMetamodel.ActivityDiagram#isIsReadOnly <em>Is Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Read Only</em>'.
	 * @see ActivityDiagramMetamodel.ActivityDiagram#isIsReadOnly()
	 * @see #getActivityDiagram()
	 * @generated
	 */
	EAttribute getActivityDiagram_IsReadOnly();

	/**
	 * Returns the meta object for the attribute '{@link ActivityDiagramMetamodel.ActivityDiagram#isIsSingleExecution <em>Is Single Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Single Execution</em>'.
	 * @see ActivityDiagramMetamodel.ActivityDiagram#isIsSingleExecution()
	 * @see #getActivityDiagram()
	 * @generated
	 */
	EAttribute getActivityDiagram_IsSingleExecution();

	/**
	 * Returns the meta object for the containment reference list '{@link ActivityDiagramMetamodel.ActivityDiagram#getActivityedge <em>Activityedge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activityedge</em>'.
	 * @see ActivityDiagramMetamodel.ActivityDiagram#getActivityedge()
	 * @see #getActivityDiagram()
	 * @generated
	 */
	EReference getActivityDiagram_Activityedge();

	/**
	 * Returns the meta object for the containment reference list '{@link ActivityDiagramMetamodel.ActivityDiagram#getActivitynode <em>Activitynode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitynode</em>'.
	 * @see ActivityDiagramMetamodel.ActivityDiagram#getActivitynode()
	 * @see #getActivityDiagram()
	 * @generated
	 */
	EReference getActivityDiagram_Activitynode();

	/**
	 * Returns the meta object for the containment reference list '{@link ActivityDiagramMetamodel.ActivityDiagram#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see ActivityDiagramMetamodel.ActivityDiagram#getVariable()
	 * @see #getActivityDiagram()
	 * @generated
	 */
	EReference getActivityDiagram_Variable();

	/**
	 * Returns the meta object for the containment reference list '{@link ActivityDiagramMetamodel.ActivityDiagram#getActivitypartition <em>Activitypartition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitypartition</em>'.
	 * @see ActivityDiagramMetamodel.ActivityDiagram#getActivitypartition()
	 * @see #getActivityDiagram()
	 * @generated
	 */
	EReference getActivityDiagram_Activitypartition();

	/**
	 * Returns the meta object for class '{@link ActivityDiagramMetamodel.ActivityNode <em>Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Node</em>'.
	 * @see ActivityDiagramMetamodel.ActivityNode
	 * @generated
	 */
	EClass getActivityNode();

	/**
	 * Returns the meta object for the reference list '{@link ActivityDiagramMetamodel.ActivityNode#getIncomming <em>Incomming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incomming</em>'.
	 * @see ActivityDiagramMetamodel.ActivityNode#getIncomming()
	 * @see #getActivityNode()
	 * @generated
	 */
	EReference getActivityNode_Incomming();

	/**
	 * Returns the meta object for the reference list '{@link ActivityDiagramMetamodel.ActivityNode#getOutcomming <em>Outcomming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outcomming</em>'.
	 * @see ActivityDiagramMetamodel.ActivityNode#getOutcomming()
	 * @see #getActivityNode()
	 * @generated
	 */
	EReference getActivityNode_Outcomming();

	/**
	 * Returns the meta object for the container reference '{@link ActivityDiagramMetamodel.ActivityNode#getActivitypartition <em>Activitypartition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Activitypartition</em>'.
	 * @see ActivityDiagramMetamodel.ActivityNode#getActivitypartition()
	 * @see #getActivityNode()
	 * @generated
	 */
	EReference getActivityNode_Activitypartition();

	/**
	 * Returns the meta object for class '{@link ActivityDiagramMetamodel.ActivityEdge <em>Activity Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Edge</em>'.
	 * @see ActivityDiagramMetamodel.ActivityEdge
	 * @generated
	 */
	EClass getActivityEdge();

	/**
	 * Returns the meta object for the attribute '{@link ActivityDiagramMetamodel.ActivityEdge#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ActivityDiagramMetamodel.ActivityEdge#getName()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EAttribute getActivityEdge_Name();

	/**
	 * Returns the meta object for the attribute '{@link ActivityDiagramMetamodel.ActivityEdge#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard</em>'.
	 * @see ActivityDiagramMetamodel.ActivityEdge#getGuard()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EAttribute getActivityEdge_Guard();

	/**
	 * Returns the meta object for the reference '{@link ActivityDiagramMetamodel.ActivityEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ActivityDiagramMetamodel.ActivityEdge#getTarget()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EReference getActivityEdge_Target();

	/**
	 * Returns the meta object for the reference '{@link ActivityDiagramMetamodel.ActivityEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ActivityDiagramMetamodel.ActivityEdge#getSource()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EReference getActivityEdge_Source();

	/**
	 * Returns the meta object for the containment reference list '{@link ActivityDiagramMetamodel.ActivityEdge#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Weight</em>'.
	 * @see ActivityDiagramMetamodel.ActivityEdge#getWeight()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EReference getActivityEdge_Weight();

	/**
	 * Returns the meta object for the container reference '{@link ActivityDiagramMetamodel.ActivityEdge#getActivitypartition <em>Activitypartition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Activitypartition</em>'.
	 * @see ActivityDiagramMetamodel.ActivityEdge#getActivitypartition()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EReference getActivityEdge_Activitypartition();

	/**
	 * Returns the meta object for class '{@link ActivityDiagramMetamodel.ObjectFlow <em>Object Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Flow</em>'.
	 * @see ActivityDiagramMetamodel.ObjectFlow
	 * @generated
	 */
	EClass getObjectFlow();

	/**
	 * Returns the meta object for class '{@link ActivityDiagramMetamodel.ControlFlow <em>Control Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Flow</em>'.
	 * @see ActivityDiagramMetamodel.ControlFlow
	 * @generated
	 */
	EClass getControlFlow();

	/**
	 * Returns the meta object for class '{@link ActivityDiagramMetamodel.ControlNode <em>Control Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Node</em>'.
	 * @see ActivityDiagramMetamodel.ControlNode
	 * @generated
	 */
	EClass getControlNode();

	/**
	 * Returns the meta object for class '{@link ActivityDiagramMetamodel.ExecutableNode <em>Executable Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executable Node</em>'.
	 * @see ActivityDiagramMetamodel.ExecutableNode
	 * @generated
	 */
	EClass getExecutableNode();

	/**
	 * Returns the meta object for class '{@link ActivityDiagramMetamodel.InitialNode <em>Initial Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Node</em>'.
	 * @see ActivityDiagramMetamodel.InitialNode
	 * @generated
	 */
	EClass getInitialNode();

	/**
	 * Returns the meta object for class '{@link ActivityDiagramMetamodel.ForkNode <em>Fork Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fork Node</em>'.
	 * @see ActivityDiagramMetamodel.ForkNode
	 * @generated
	 */
	EClass getForkNode();

	/**
	 * Returns the meta object for class '{@link ActivityDiagramMetamodel.JoinNode <em>Join Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Node</em>'.
	 * @see ActivityDiagramMetamodel.JoinNode
	 * @generated
	 */
	EClass getJoinNode();

	/**
	 * Returns the meta object for class '{@link ActivityDiagramMetamodel.DecisionNode <em>Decision Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Node</em>'.
	 * @see ActivityDiagramMetamodel.DecisionNode
	 * @generated
	 */
	EClass getDecisionNode();

	/**
	 * Returns the meta object for the reference list '{@link ActivityDiagramMetamodel.DecisionNode#getObjectnode <em>Objectnode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Objectnode</em>'.
	 * @see ActivityDiagramMetamodel.DecisionNode#getObjectnode()
	 * @see #getDecisionNode()
	 * @generated
	 */
	EReference getDecisionNode_Objectnode();

	/**
	 * Returns the meta object for the attribute '{@link ActivityDiagramMetamodel.DecisionNode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ActivityDiagramMetamodel.DecisionNode#getName()
	 * @see #getDecisionNode()
	 * @generated
	 */
	EAttribute getDecisionNode_Name();

	/**
	 * Returns the meta object for class '{@link ActivityDiagramMetamodel.MergeNode <em>Merge Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merge Node</em>'.
	 * @see ActivityDiagramMetamodel.MergeNode
	 * @generated
	 */
	EClass getMergeNode();

	/**
	 * Returns the meta object for class '{@link ActivityDiagramMetamodel.FinalNode <em>Final Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final Node</em>'.
	 * @see ActivityDiagramMetamodel.FinalNode
	 * @generated
	 */
	EClass getFinalNode();

	/**
	 * Returns the meta object for class '{@link ActivityDiagramMetamodel.InputPin <em>Input Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Pin</em>'.
	 * @see ActivityDiagramMetamodel.InputPin
	 * @generated
	 */
	EClass getInputPin();

	/**
	 * Returns the meta object for class '{@link ActivityDiagramMetamodel.OutputPin <em>Output Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Pin</em>'.
	 * @see ActivityDiagramMetamodel.OutputPin
	 * @generated
	 */
	EClass getOutputPin();

	/**
	 * Returns the meta object for class '{@link ActivityDiagramMetamodel.Pin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pin</em>'.
	 * @see ActivityDiagramMetamodel.Pin
	 * @generated
	 */
	EClass getPin();

	/**
	 * Returns the meta object for class '{@link ActivityDiagramMetamodel.ObjectNode <em>Object Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Node</em>'.
	 * @see ActivityDiagramMetamodel.ObjectNode
	 * @generated
	 */
	EClass getObjectNode();

	/**
	 * Returns the meta object for the attribute '{@link ActivityDiagramMetamodel.ObjectNode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ActivityDiagramMetamodel.ObjectNode#getName()
	 * @see #getObjectNode()
	 * @generated
	 */
	EAttribute getObjectNode_Name();

	/**
	 * Returns the meta object for the containment reference '{@link ActivityDiagramMetamodel.ObjectNode#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper Bound</em>'.
	 * @see ActivityDiagramMetamodel.ObjectNode#getUpperBound()
	 * @see #getObjectNode()
	 * @generated
	 */
	EReference getObjectNode_UpperBound();

	/**
	 * Returns the meta object for the attribute '{@link ActivityDiagramMetamodel.ObjectNode#isIsControlType <em>Is Control Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Control Type</em>'.
	 * @see ActivityDiagramMetamodel.ObjectNode#isIsControlType()
	 * @see #getObjectNode()
	 * @generated
	 */
	EAttribute getObjectNode_IsControlType();

	/**
	 * Returns the meta object for the attribute '{@link ActivityDiagramMetamodel.ObjectNode#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see ActivityDiagramMetamodel.ObjectNode#getOrder()
	 * @see #getObjectNode()
	 * @generated
	 */
	EAttribute getObjectNode_Order();

	/**
	 * Returns the meta object for class '{@link ActivityDiagramMetamodel.ActivityParameterNode <em>Activity Parameter Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Parameter Node</em>'.
	 * @see ActivityDiagramMetamodel.ActivityParameterNode
	 * @generated
	 */
	EClass getActivityParameterNode();

	/**
	 * Returns the meta object for class '{@link ActivityDiagramMetamodel.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see ActivityDiagramMetamodel.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link ActivityDiagramMetamodel.Variable#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see ActivityDiagramMetamodel.Variable#getUpperBound()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_UpperBound();

	/**
	 * Returns the meta object for the attribute '{@link ActivityDiagramMetamodel.Variable#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see ActivityDiagramMetamodel.Variable#getLowerBound()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_LowerBound();

	/**
	 * Returns the meta object for class '{@link ActivityDiagramMetamodel.ValueSpecification <em>Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Specification</em>'.
	 * @see ActivityDiagramMetamodel.ValueSpecification
	 * @generated
	 */
	EClass getValueSpecification();

	/**
	 * Returns the meta object for class '{@link ActivityDiagramMetamodel.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see ActivityDiagramMetamodel.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link ActivityDiagramMetamodel.Action#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ActivityDiagramMetamodel.Action#getName()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ActivityDiagramMetamodel.Action#getInputpin <em>Inputpin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputpin</em>'.
	 * @see ActivityDiagramMetamodel.Action#getInputpin()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Inputpin();

	/**
	 * Returns the meta object for the containment reference list '{@link ActivityDiagramMetamodel.Action#getOutputpin <em>Outputpin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputpin</em>'.
	 * @see ActivityDiagramMetamodel.Action#getOutputpin()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Outputpin();

	/**
	 * Returns the meta object for class '{@link ActivityDiagramMetamodel.CallAction <em>Call Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Action</em>'.
	 * @see ActivityDiagramMetamodel.CallAction
	 * @generated
	 */
	EClass getCallAction();

	/**
	 * Returns the meta object for class '{@link ActivityDiagramMetamodel.VariableAction <em>Variable Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Action</em>'.
	 * @see ActivityDiagramMetamodel.VariableAction
	 * @generated
	 */
	EClass getVariableAction();

	/**
	 * Returns the meta object for the attribute '{@link ActivityDiagramMetamodel.VariableAction#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see ActivityDiagramMetamodel.VariableAction#getKind()
	 * @see #getVariableAction()
	 * @generated
	 */
	EAttribute getVariableAction_Kind();

	/**
	 * Returns the meta object for class '{@link ActivityDiagramMetamodel.StartObjectBehaviorAction <em>Start Object Behavior Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Object Behavior Action</em>'.
	 * @see ActivityDiagramMetamodel.StartObjectBehaviorAction
	 * @generated
	 */
	EClass getStartObjectBehaviorAction();

	/**
	 * Returns the meta object for class '{@link ActivityDiagramMetamodel.ObjectAction <em>Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Action</em>'.
	 * @see ActivityDiagramMetamodel.ObjectAction
	 * @generated
	 */
	EClass getObjectAction();

	/**
	 * Returns the meta object for the attribute '{@link ActivityDiagramMetamodel.ObjectAction#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see ActivityDiagramMetamodel.ObjectAction#getKind()
	 * @see #getObjectAction()
	 * @generated
	 */
	EAttribute getObjectAction_Kind();

	/**
	 * Returns the meta object for class '{@link ActivityDiagramMetamodel.CallBehaviorAction <em>Call Behavior Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Behavior Action</em>'.
	 * @see ActivityDiagramMetamodel.CallBehaviorAction
	 * @generated
	 */
	EClass getCallBehaviorAction();

	/**
	 * Returns the meta object for class '{@link ActivityDiagramMetamodel.CallOperationAction <em>Call Operation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Operation Action</em>'.
	 * @see ActivityDiagramMetamodel.CallOperationAction
	 * @generated
	 */
	EClass getCallOperationAction();

	/**
	 * Returns the meta object for class '{@link ActivityDiagramMetamodel.CallActivityAction <em>Call Activity Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Activity Action</em>'.
	 * @see ActivityDiagramMetamodel.CallActivityAction
	 * @generated
	 */
	EClass getCallActivityAction();

	/**
	 * Returns the meta object for the containment reference '{@link ActivityDiagramMetamodel.CallActivityAction#getActivitydiagram <em>Activitydiagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activitydiagram</em>'.
	 * @see ActivityDiagramMetamodel.CallActivityAction#getActivitydiagram()
	 * @see #getCallActivityAction()
	 * @generated
	 */
	EReference getCallActivityAction_Activitydiagram();

	/**
	 * Returns the meta object for class '{@link ActivityDiagramMetamodel.ActivityPartition <em>Activity Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Partition</em>'.
	 * @see ActivityDiagramMetamodel.ActivityPartition
	 * @generated
	 */
	EClass getActivityPartition();

	/**
	 * Returns the meta object for the attribute '{@link ActivityDiagramMetamodel.ActivityPartition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ActivityDiagramMetamodel.ActivityPartition#getName()
	 * @see #getActivityPartition()
	 * @generated
	 */
	EAttribute getActivityPartition_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ActivityDiagramMetamodel.ActivityPartition#getSubpartition <em>Subpartition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subpartition</em>'.
	 * @see ActivityDiagramMetamodel.ActivityPartition#getSubpartition()
	 * @see #getActivityPartition()
	 * @generated
	 */
	EReference getActivityPartition_Subpartition();

	/**
	 * Returns the meta object for the containment reference list '{@link ActivityDiagramMetamodel.ActivityPartition#getActivityedge <em>Activityedge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activityedge</em>'.
	 * @see ActivityDiagramMetamodel.ActivityPartition#getActivityedge()
	 * @see #getActivityPartition()
	 * @generated
	 */
	EReference getActivityPartition_Activityedge();

	/**
	 * Returns the meta object for the containment reference list '{@link ActivityDiagramMetamodel.ActivityPartition#getActivitynode <em>Activitynode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitynode</em>'.
	 * @see ActivityDiagramMetamodel.ActivityPartition#getActivitynode()
	 * @see #getActivityPartition()
	 * @generated
	 */
	EReference getActivityPartition_Activitynode();

	/**
	 * Returns the meta object for class '{@link ActivityDiagramMetamodel.EventAction <em>Event Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Action</em>'.
	 * @see ActivityDiagramMetamodel.EventAction
	 * @generated
	 */
	EClass getEventAction();

	/**
	 * Returns the meta object for the reference '{@link ActivityDiagramMetamodel.EventAction#getAggregate <em>Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Aggregate</em>'.
	 * @see ActivityDiagramMetamodel.EventAction#getAggregate()
	 * @see #getEventAction()
	 * @generated
	 */
	EReference getEventAction_Aggregate();

	/**
	 * Returns the meta object for class '{@link ActivityDiagramMetamodel.CommandAction <em>Command Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Action</em>'.
	 * @see ActivityDiagramMetamodel.CommandAction
	 * @generated
	 */
	EClass getCommandAction();

	/**
	 * Returns the meta object for the reference '{@link ActivityDiagramMetamodel.CommandAction#getAggregate <em>Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Aggregate</em>'.
	 * @see ActivityDiagramMetamodel.CommandAction#getAggregate()
	 * @see #getCommandAction()
	 * @generated
	 */
	EReference getCommandAction_Aggregate();

	/**
	 * Returns the meta object for class '{@link ActivityDiagramMetamodel.Aggregate <em>Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregate</em>'.
	 * @see ActivityDiagramMetamodel.Aggregate
	 * @generated
	 */
	EClass getAggregate();

	/**
	 * Returns the meta object for the reference list '{@link ActivityDiagramMetamodel.Aggregate#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Events</em>'.
	 * @see ActivityDiagramMetamodel.Aggregate#getEvents()
	 * @see #getAggregate()
	 * @generated
	 */
	EReference getAggregate_Events();

	/**
	 * Returns the meta object for the reference '{@link ActivityDiagramMetamodel.Aggregate#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Command</em>'.
	 * @see ActivityDiagramMetamodel.Aggregate#getCommand()
	 * @see #getAggregate()
	 * @generated
	 */
	EReference getAggregate_Command();

	/**
	 * Returns the meta object for the reference '{@link ActivityDiagramMetamodel.Aggregate#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Query</em>'.
	 * @see ActivityDiagramMetamodel.Aggregate#getQuery()
	 * @see #getAggregate()
	 * @generated
	 */
	EReference getAggregate_Query();

	/**
	 * Returns the meta object for class '{@link ActivityDiagramMetamodel.QueryAction <em>Query Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Action</em>'.
	 * @see ActivityDiagramMetamodel.QueryAction
	 * @generated
	 */
	EClass getQueryAction();

	/**
	 * Returns the meta object for the reference '{@link ActivityDiagramMetamodel.QueryAction#getAggregate <em>Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Aggregate</em>'.
	 * @see ActivityDiagramMetamodel.QueryAction#getAggregate()
	 * @see #getQueryAction()
	 * @generated
	 */
	EReference getQueryAction_Aggregate();

	/**
	 * Returns the meta object for enum '{@link ActivityDiagramMetamodel.ObjectNodeOrderingKind <em>Object Node Ordering Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Object Node Ordering Kind</em>'.
	 * @see ActivityDiagramMetamodel.ObjectNodeOrderingKind
	 * @generated
	 */
	EEnum getObjectNodeOrderingKind();

	/**
	 * Returns the meta object for enum '{@link ActivityDiagramMetamodel.ObjectActionKind <em>Object Action Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Object Action Kind</em>'.
	 * @see ActivityDiagramMetamodel.ObjectActionKind
	 * @generated
	 */
	EEnum getObjectActionKind();

	/**
	 * Returns the meta object for enum '{@link ActivityDiagramMetamodel.VariableActionKind <em>Variable Action Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Variable Action Kind</em>'.
	 * @see ActivityDiagramMetamodel.VariableActionKind
	 * @generated
	 */
	EEnum getVariableActionKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ActivityDiagramMetamodelFactory getActivityDiagramMetamodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ActivityDiagramMetamodel.impl.ActivityDiagramImpl <em>Activity Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagramMetamodel.impl.ActivityDiagramImpl
		 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getActivityDiagram()
		 * @generated
		 */
		EClass ACTIVITY_DIAGRAM = eINSTANCE.getActivityDiagram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_DIAGRAM__NAME = eINSTANCE.getActivityDiagram_Name();

		/**
		 * The meta object literal for the '<em><b>Precondition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_DIAGRAM__PRECONDITION = eINSTANCE.getActivityDiagram_Precondition();

		/**
		 * The meta object literal for the '<em><b>Postcondition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_DIAGRAM__POSTCONDITION = eINSTANCE.getActivityDiagram_Postcondition();

		/**
		 * The meta object literal for the '<em><b>Is Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_DIAGRAM__IS_READ_ONLY = eINSTANCE.getActivityDiagram_IsReadOnly();

		/**
		 * The meta object literal for the '<em><b>Is Single Execution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_DIAGRAM__IS_SINGLE_EXECUTION = eINSTANCE.getActivityDiagram_IsSingleExecution();

		/**
		 * The meta object literal for the '<em><b>Activityedge</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_DIAGRAM__ACTIVITYEDGE = eINSTANCE.getActivityDiagram_Activityedge();

		/**
		 * The meta object literal for the '<em><b>Activitynode</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_DIAGRAM__ACTIVITYNODE = eINSTANCE.getActivityDiagram_Activitynode();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_DIAGRAM__VARIABLE = eINSTANCE.getActivityDiagram_Variable();

		/**
		 * The meta object literal for the '<em><b>Activitypartition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_DIAGRAM__ACTIVITYPARTITION = eINSTANCE.getActivityDiagram_Activitypartition();

		/**
		 * The meta object literal for the '{@link ActivityDiagramMetamodel.impl.ActivityNodeImpl <em>Activity Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagramMetamodel.impl.ActivityNodeImpl
		 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getActivityNode()
		 * @generated
		 */
		EClass ACTIVITY_NODE = eINSTANCE.getActivityNode();

		/**
		 * The meta object literal for the '<em><b>Incomming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE__INCOMMING = eINSTANCE.getActivityNode_Incomming();

		/**
		 * The meta object literal for the '<em><b>Outcomming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE__OUTCOMMING = eINSTANCE.getActivityNode_Outcomming();

		/**
		 * The meta object literal for the '<em><b>Activitypartition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE__ACTIVITYPARTITION = eINSTANCE.getActivityNode_Activitypartition();

		/**
		 * The meta object literal for the '{@link ActivityDiagramMetamodel.impl.ActivityEdgeImpl <em>Activity Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagramMetamodel.impl.ActivityEdgeImpl
		 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getActivityEdge()
		 * @generated
		 */
		EClass ACTIVITY_EDGE = eINSTANCE.getActivityEdge();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_EDGE__NAME = eINSTANCE.getActivityEdge_Name();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_EDGE__GUARD = eINSTANCE.getActivityEdge_Guard();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE__TARGET = eINSTANCE.getActivityEdge_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE__SOURCE = eINSTANCE.getActivityEdge_Source();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE__WEIGHT = eINSTANCE.getActivityEdge_Weight();

		/**
		 * The meta object literal for the '<em><b>Activitypartition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE__ACTIVITYPARTITION = eINSTANCE.getActivityEdge_Activitypartition();

		/**
		 * The meta object literal for the '{@link ActivityDiagramMetamodel.impl.ObjectFlowImpl <em>Object Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagramMetamodel.impl.ObjectFlowImpl
		 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getObjectFlow()
		 * @generated
		 */
		EClass OBJECT_FLOW = eINSTANCE.getObjectFlow();

		/**
		 * The meta object literal for the '{@link ActivityDiagramMetamodel.impl.ControlFlowImpl <em>Control Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagramMetamodel.impl.ControlFlowImpl
		 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getControlFlow()
		 * @generated
		 */
		EClass CONTROL_FLOW = eINSTANCE.getControlFlow();

		/**
		 * The meta object literal for the '{@link ActivityDiagramMetamodel.impl.ControlNodeImpl <em>Control Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagramMetamodel.impl.ControlNodeImpl
		 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getControlNode()
		 * @generated
		 */
		EClass CONTROL_NODE = eINSTANCE.getControlNode();

		/**
		 * The meta object literal for the '{@link ActivityDiagramMetamodel.impl.ExecutableNodeImpl <em>Executable Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagramMetamodel.impl.ExecutableNodeImpl
		 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getExecutableNode()
		 * @generated
		 */
		EClass EXECUTABLE_NODE = eINSTANCE.getExecutableNode();

		/**
		 * The meta object literal for the '{@link ActivityDiagramMetamodel.impl.InitialNodeImpl <em>Initial Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagramMetamodel.impl.InitialNodeImpl
		 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getInitialNode()
		 * @generated
		 */
		EClass INITIAL_NODE = eINSTANCE.getInitialNode();

		/**
		 * The meta object literal for the '{@link ActivityDiagramMetamodel.impl.ForkNodeImpl <em>Fork Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagramMetamodel.impl.ForkNodeImpl
		 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getForkNode()
		 * @generated
		 */
		EClass FORK_NODE = eINSTANCE.getForkNode();

		/**
		 * The meta object literal for the '{@link ActivityDiagramMetamodel.impl.JoinNodeImpl <em>Join Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagramMetamodel.impl.JoinNodeImpl
		 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getJoinNode()
		 * @generated
		 */
		EClass JOIN_NODE = eINSTANCE.getJoinNode();

		/**
		 * The meta object literal for the '{@link ActivityDiagramMetamodel.impl.DecisionNodeImpl <em>Decision Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagramMetamodel.impl.DecisionNodeImpl
		 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getDecisionNode()
		 * @generated
		 */
		EClass DECISION_NODE = eINSTANCE.getDecisionNode();

		/**
		 * The meta object literal for the '<em><b>Objectnode</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION_NODE__OBJECTNODE = eINSTANCE.getDecisionNode_Objectnode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION_NODE__NAME = eINSTANCE.getDecisionNode_Name();

		/**
		 * The meta object literal for the '{@link ActivityDiagramMetamodel.impl.MergeNodeImpl <em>Merge Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagramMetamodel.impl.MergeNodeImpl
		 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getMergeNode()
		 * @generated
		 */
		EClass MERGE_NODE = eINSTANCE.getMergeNode();

		/**
		 * The meta object literal for the '{@link ActivityDiagramMetamodel.impl.FinalNodeImpl <em>Final Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagramMetamodel.impl.FinalNodeImpl
		 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getFinalNode()
		 * @generated
		 */
		EClass FINAL_NODE = eINSTANCE.getFinalNode();

		/**
		 * The meta object literal for the '{@link ActivityDiagramMetamodel.impl.InputPinImpl <em>Input Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagramMetamodel.impl.InputPinImpl
		 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getInputPin()
		 * @generated
		 */
		EClass INPUT_PIN = eINSTANCE.getInputPin();

		/**
		 * The meta object literal for the '{@link ActivityDiagramMetamodel.impl.OutputPinImpl <em>Output Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagramMetamodel.impl.OutputPinImpl
		 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getOutputPin()
		 * @generated
		 */
		EClass OUTPUT_PIN = eINSTANCE.getOutputPin();

		/**
		 * The meta object literal for the '{@link ActivityDiagramMetamodel.impl.PinImpl <em>Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagramMetamodel.impl.PinImpl
		 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getPin()
		 * @generated
		 */
		EClass PIN = eINSTANCE.getPin();

		/**
		 * The meta object literal for the '{@link ActivityDiagramMetamodel.impl.ObjectNodeImpl <em>Object Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagramMetamodel.impl.ObjectNodeImpl
		 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getObjectNode()
		 * @generated
		 */
		EClass OBJECT_NODE = eINSTANCE.getObjectNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_NODE__NAME = eINSTANCE.getObjectNode_Name();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_NODE__UPPER_BOUND = eINSTANCE.getObjectNode_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Is Control Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_NODE__IS_CONTROL_TYPE = eINSTANCE.getObjectNode_IsControlType();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_NODE__ORDER = eINSTANCE.getObjectNode_Order();

		/**
		 * The meta object literal for the '{@link ActivityDiagramMetamodel.impl.ActivityParameterNodeImpl <em>Activity Parameter Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagramMetamodel.impl.ActivityParameterNodeImpl
		 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getActivityParameterNode()
		 * @generated
		 */
		EClass ACTIVITY_PARAMETER_NODE = eINSTANCE.getActivityParameterNode();

		/**
		 * The meta object literal for the '{@link ActivityDiagramMetamodel.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagramMetamodel.impl.VariableImpl
		 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__UPPER_BOUND = eINSTANCE.getVariable_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__LOWER_BOUND = eINSTANCE.getVariable_LowerBound();

		/**
		 * The meta object literal for the '{@link ActivityDiagramMetamodel.impl.ValueSpecificationImpl <em>Value Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagramMetamodel.impl.ValueSpecificationImpl
		 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getValueSpecification()
		 * @generated
		 */
		EClass VALUE_SPECIFICATION = eINSTANCE.getValueSpecification();

		/**
		 * The meta object literal for the '{@link ActivityDiagramMetamodel.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagramMetamodel.impl.ActionImpl
		 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

		/**
		 * The meta object literal for the '<em><b>Inputpin</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__INPUTPIN = eINSTANCE.getAction_Inputpin();

		/**
		 * The meta object literal for the '<em><b>Outputpin</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__OUTPUTPIN = eINSTANCE.getAction_Outputpin();

		/**
		 * The meta object literal for the '{@link ActivityDiagramMetamodel.impl.CallActionImpl <em>Call Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagramMetamodel.impl.CallActionImpl
		 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getCallAction()
		 * @generated
		 */
		EClass CALL_ACTION = eINSTANCE.getCallAction();

		/**
		 * The meta object literal for the '{@link ActivityDiagramMetamodel.impl.VariableActionImpl <em>Variable Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagramMetamodel.impl.VariableActionImpl
		 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getVariableAction()
		 * @generated
		 */
		EClass VARIABLE_ACTION = eINSTANCE.getVariableAction();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_ACTION__KIND = eINSTANCE.getVariableAction_Kind();

		/**
		 * The meta object literal for the '{@link ActivityDiagramMetamodel.impl.StartObjectBehaviorActionImpl <em>Start Object Behavior Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagramMetamodel.impl.StartObjectBehaviorActionImpl
		 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getStartObjectBehaviorAction()
		 * @generated
		 */
		EClass START_OBJECT_BEHAVIOR_ACTION = eINSTANCE.getStartObjectBehaviorAction();

		/**
		 * The meta object literal for the '{@link ActivityDiagramMetamodel.impl.ObjectActionImpl <em>Object Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagramMetamodel.impl.ObjectActionImpl
		 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getObjectAction()
		 * @generated
		 */
		EClass OBJECT_ACTION = eINSTANCE.getObjectAction();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_ACTION__KIND = eINSTANCE.getObjectAction_Kind();

		/**
		 * The meta object literal for the '{@link ActivityDiagramMetamodel.impl.CallBehaviorActionImpl <em>Call Behavior Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagramMetamodel.impl.CallBehaviorActionImpl
		 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getCallBehaviorAction()
		 * @generated
		 */
		EClass CALL_BEHAVIOR_ACTION = eINSTANCE.getCallBehaviorAction();

		/**
		 * The meta object literal for the '{@link ActivityDiagramMetamodel.impl.CallOperationActionImpl <em>Call Operation Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagramMetamodel.impl.CallOperationActionImpl
		 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getCallOperationAction()
		 * @generated
		 */
		EClass CALL_OPERATION_ACTION = eINSTANCE.getCallOperationAction();

		/**
		 * The meta object literal for the '{@link ActivityDiagramMetamodel.impl.CallActivityActionImpl <em>Call Activity Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagramMetamodel.impl.CallActivityActionImpl
		 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getCallActivityAction()
		 * @generated
		 */
		EClass CALL_ACTIVITY_ACTION = eINSTANCE.getCallActivityAction();

		/**
		 * The meta object literal for the '<em><b>Activitydiagram</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_ACTIVITY_ACTION__ACTIVITYDIAGRAM = eINSTANCE.getCallActivityAction_Activitydiagram();

		/**
		 * The meta object literal for the '{@link ActivityDiagramMetamodel.impl.ActivityPartitionImpl <em>Activity Partition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagramMetamodel.impl.ActivityPartitionImpl
		 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getActivityPartition()
		 * @generated
		 */
		EClass ACTIVITY_PARTITION = eINSTANCE.getActivityPartition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_PARTITION__NAME = eINSTANCE.getActivityPartition_Name();

		/**
		 * The meta object literal for the '<em><b>Subpartition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_PARTITION__SUBPARTITION = eINSTANCE.getActivityPartition_Subpartition();

		/**
		 * The meta object literal for the '<em><b>Activityedge</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_PARTITION__ACTIVITYEDGE = eINSTANCE.getActivityPartition_Activityedge();

		/**
		 * The meta object literal for the '<em><b>Activitynode</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_PARTITION__ACTIVITYNODE = eINSTANCE.getActivityPartition_Activitynode();

		/**
		 * The meta object literal for the '{@link ActivityDiagramMetamodel.impl.EventActionImpl <em>Event Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagramMetamodel.impl.EventActionImpl
		 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getEventAction()
		 * @generated
		 */
		EClass EVENT_ACTION = eINSTANCE.getEventAction();

		/**
		 * The meta object literal for the '<em><b>Aggregate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_ACTION__AGGREGATE = eINSTANCE.getEventAction_Aggregate();

		/**
		 * The meta object literal for the '{@link ActivityDiagramMetamodel.impl.CommandActionImpl <em>Command Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagramMetamodel.impl.CommandActionImpl
		 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getCommandAction()
		 * @generated
		 */
		EClass COMMAND_ACTION = eINSTANCE.getCommandAction();

		/**
		 * The meta object literal for the '<em><b>Aggregate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_ACTION__AGGREGATE = eINSTANCE.getCommandAction_Aggregate();

		/**
		 * The meta object literal for the '{@link ActivityDiagramMetamodel.impl.AggregateImpl <em>Aggregate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagramMetamodel.impl.AggregateImpl
		 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getAggregate()
		 * @generated
		 */
		EClass AGGREGATE = eINSTANCE.getAggregate();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATE__EVENTS = eINSTANCE.getAggregate_Events();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATE__COMMAND = eINSTANCE.getAggregate_Command();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATE__QUERY = eINSTANCE.getAggregate_Query();

		/**
		 * The meta object literal for the '{@link ActivityDiagramMetamodel.impl.QueryActionImpl <em>Query Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagramMetamodel.impl.QueryActionImpl
		 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getQueryAction()
		 * @generated
		 */
		EClass QUERY_ACTION = eINSTANCE.getQueryAction();

		/**
		 * The meta object literal for the '<em><b>Aggregate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_ACTION__AGGREGATE = eINSTANCE.getQueryAction_Aggregate();

		/**
		 * The meta object literal for the '{@link ActivityDiagramMetamodel.ObjectNodeOrderingKind <em>Object Node Ordering Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagramMetamodel.ObjectNodeOrderingKind
		 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getObjectNodeOrderingKind()
		 * @generated
		 */
		EEnum OBJECT_NODE_ORDERING_KIND = eINSTANCE.getObjectNodeOrderingKind();

		/**
		 * The meta object literal for the '{@link ActivityDiagramMetamodel.ObjectActionKind <em>Object Action Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagramMetamodel.ObjectActionKind
		 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getObjectActionKind()
		 * @generated
		 */
		EEnum OBJECT_ACTION_KIND = eINSTANCE.getObjectActionKind();

		/**
		 * The meta object literal for the '{@link ActivityDiagramMetamodel.VariableActionKind <em>Variable Action Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ActivityDiagramMetamodel.VariableActionKind
		 * @see ActivityDiagramMetamodel.impl.ActivityDiagramMetamodelPackageImpl#getVariableActionKind()
		 * @generated
		 */
		EEnum VARIABLE_ACTION_KIND = eINSTANCE.getVariableActionKind();

	}

} //ActivityDiagramMetamodelPackage
