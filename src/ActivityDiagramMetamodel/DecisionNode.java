/**
 */
package ActivityDiagramMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ActivityDiagramMetamodel.DecisionNode#getObjectnode <em>Objectnode</em>}</li>
 *   <li>{@link ActivityDiagramMetamodel.DecisionNode#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage#getDecisionNode()
 * @model annotation="gmf.node label='name' label.placement='external' tool.name='Decision (Policy)' figure='svg' svg.uri='platform:/plugin/MyCore/svg/diamond-3.svg' label.icon='false' size='40,40' resizable='false' margin='2'"
 * @generated
 */
public interface DecisionNode extends ControlNode {
	/**
	 * Returns the value of the '<em><b>Objectnode</b></em>' reference list.
	 * The list contents are of type {@link ActivityDiagramMetamodel.ObjectNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objectnode</em>' reference list.
	 * @see ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage#getDecisionNode_Objectnode()
	 * @model
	 * @generated
	 */
	EList<ObjectNode> getObjectnode();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage#getDecisionNode_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ActivityDiagramMetamodel.DecisionNode#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // DecisionNode
