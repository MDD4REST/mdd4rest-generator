/**
 */
package ActivityDiagramMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supplier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ActivityDiagramMetamodel.Supplier#getAction <em>Action</em>}</li>
 *   <li>{@link ActivityDiagramMetamodel.Supplier#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link ActivityDiagramMetamodel.Supplier#getReadmodels <em>Readmodels</em>}</li>
 *   <li>{@link ActivityDiagramMetamodel.Supplier#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage#getSupplier()
 * @model abstract="true"
 *        annotation="gmf.node label='name'"
 * @generated
 */
public interface Supplier extends ObjectNode {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ActivityDiagramMetamodel.Action#getSupplier <em>Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference.
	 * @see #setAction(Action)
	 * @see ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage#getSupplier_Action()
	 * @see ActivityDiagramMetamodel.Action#getSupplier
	 * @model opposite="supplier"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link ActivityDiagramMetamodel.Supplier#getAction <em>Action</em>}' reference.
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
	 * It is bidirectional and its opposite is '{@link ActivityDiagramMetamodel.DomainEvent#getSupplier <em>Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggers</em>' reference list.
	 * @see ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage#getSupplier_Triggers()
	 * @see ActivityDiagramMetamodel.DomainEvent#getSupplier
	 * @model opposite="supplier"
	 *        annotation="gmf.link tool.name='Supplier to Event' style='dash' target.decoration='arrow' width='2'"
	 * @generated
	 */
	EList<DomainEvent> getTriggers();

	/**
	 * Returns the value of the '<em><b>Readmodels</b></em>' reference list.
	 * The list contents are of type {@link ActivityDiagramMetamodel.ReadModel}.
	 * It is bidirectional and its opposite is '{@link ActivityDiagramMetamodel.ReadModel#getSupplier <em>Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Readmodels</em>' reference list.
	 * @see ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage#getSupplier_Readmodels()
	 * @see ActivityDiagramMetamodel.ReadModel#getSupplier
	 * @model opposite="supplier"
	 *        annotation="gmf.link tool.name='Supplier to ReadModel' style='dash' target.decoration='arrow' width='2'"
	 * @generated
	 */
	EList<ReadModel> getReadmodels();

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link ActivityDiagramMetamodel.ConstraintPin}.
	 * It is bidirectional and its opposite is '{@link ActivityDiagramMetamodel.ConstraintPin#getSupplier <em>Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage#getSupplier_Constraints()
	 * @see ActivityDiagramMetamodel.ConstraintPin#getSupplier
	 * @model opposite="supplier" containment="true"
	 *        annotation="gmf.affixed"
	 * @generated
	 */
	EList<ConstraintPin> getConstraints();

} // Supplier
