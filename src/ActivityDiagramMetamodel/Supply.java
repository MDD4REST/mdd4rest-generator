/**
 */
package ActivityDiagramMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supply</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ActivityDiagramMetamodel.Supply#getAction <em>Action</em>}</li>
 *   <li>{@link ActivityDiagramMetamodel.Supply#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link ActivityDiagramMetamodel.Supply#getReadmodels <em>Readmodels</em>}</li>
 *   <li>{@link ActivityDiagramMetamodel.Supply#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage#getSupply()
 * @model abstract="true"
 *        annotation="gmf.node label='name'"
 * @generated
 */
public interface Supply extends ObjectNode {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ActivityDiagramMetamodel.Action#getSupply <em>Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference.
	 * @see #setAction(Action)
	 * @see ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage#getSupply_Action()
	 * @see ActivityDiagramMetamodel.Action#getSupply
	 * @model opposite="supply"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link ActivityDiagramMetamodel.Supply#getAction <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

	/**
	 * Returns the value of the '<em><b>Triggers</b></em>' reference list.
	 * The list contents are of type {@link ActivityDiagramMetamodel.DomainEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggers</em>' reference list.
	 * @see ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage#getSupply_Triggers()
	 * @model annotation="gmf.link tool.name='Supply to Event' style='dash' target.decoration='arrow' width='2'"
	 * @generated
	 */
	EList<DomainEvent> getTriggers();

	/**
	 * Returns the value of the '<em><b>Readmodels</b></em>' reference list.
	 * The list contents are of type {@link ActivityDiagramMetamodel.ReadModel}.
	 * It is bidirectional and its opposite is '{@link ActivityDiagramMetamodel.ReadModel#getSupply <em>Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Readmodels</em>' reference list.
	 * @see ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage#getSupply_Readmodels()
	 * @see ActivityDiagramMetamodel.ReadModel#getSupply
	 * @model opposite="supply"
	 *        annotation="gmf.link tool.name='Supply to ReadModel' style='dash' target.decoration='arrow' width='2'"
	 * @generated
	 */
	EList<ReadModel> getReadmodels();

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link ActivityDiagramMetamodel.ConstraintPin}.
	 * It is bidirectional and its opposite is '{@link ActivityDiagramMetamodel.ConstraintPin#getSupply <em>Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage#getSupply_Constraints()
	 * @see ActivityDiagramMetamodel.ConstraintPin#getSupply
	 * @model opposite="supply" containment="true"
	 *        annotation="gmf.affixed"
	 * @generated
	 */
	EList<ConstraintPin> getConstraints();

} // Supply
