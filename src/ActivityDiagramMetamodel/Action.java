/**
 */
package ActivityDiagramMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ActivityDiagramMetamodel.Action#getName <em>Name</em>}</li>
 *   <li>{@link ActivityDiagramMetamodel.Action#getInputpin <em>Inputpin</em>}</li>
 *   <li>{@link ActivityDiagramMetamodel.Action#getOutputpin <em>Outputpin</em>}</li>
 * </ul>
 *
 * @see ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage#getAction()
 * @model annotation="gmf.node label='name' label.placement='internal'"
 * @generated
 */
public interface Action extends ExecutableNode {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage#getAction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ActivityDiagramMetamodel.Action#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Inputpin</b></em>' containment reference list.
	 * The list contents are of type {@link ActivityDiagramMetamodel.InputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputpin</em>' containment reference list.
	 * @see ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage#getAction_Inputpin()
	 * @model containment="true"
	 * @generated
	 */
	EList<InputPin> getInputpin();

	/**
	 * Returns the value of the '<em><b>Outputpin</b></em>' containment reference list.
	 * The list contents are of type {@link ActivityDiagramMetamodel.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputpin</em>' containment reference list.
	 * @see ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage#getAction_Outputpin()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputPin> getOutputpin();

} // Action
