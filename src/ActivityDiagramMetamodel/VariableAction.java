/**
 */
package ActivityDiagramMetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ActivityDiagramMetamodel.VariableAction#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage#getVariableAction()
 * @model
 * @generated
 */
public interface VariableAction extends CallAction {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link ActivityDiagramMetamodel.VariableActionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see ActivityDiagramMetamodel.VariableActionKind
	 * @see #setKind(VariableActionKind)
	 * @see ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage#getVariableAction_Kind()
	 * @model
	 * @generated
	 */
	VariableActionKind getKind();

	/**
	 * Sets the value of the '{@link ActivityDiagramMetamodel.VariableAction#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see ActivityDiagramMetamodel.VariableActionKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(VariableActionKind value);

} // VariableAction
