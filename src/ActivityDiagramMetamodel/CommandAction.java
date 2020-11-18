/**
 */
package ActivityDiagramMetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ActivityDiagramMetamodel.CommandAction#getAggregate <em>Aggregate</em>}</li>
 * </ul>
 *
 * @see ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage#getCommandAction()
 * @model annotation="gmf.node label='name' color='173,216,230'"
 * @generated
 */
public interface CommandAction extends Action {

	/**
	 * Returns the value of the '<em><b>Aggregate</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ActivityDiagramMetamodel.Aggregate#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate</em>' reference.
	 * @see #setAggregate(Aggregate)
	 * @see ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage#getCommandAction_Aggregate()
	 * @see ActivityDiagramMetamodel.Aggregate#getCommand
	 * @model opposite="command"
	 *        annotation="gmf.link style='dash' target.decoration='arrow' width='2'"
	 * @generated
	 */
	Aggregate getAggregate();

	/**
	 * Sets the value of the '{@link ActivityDiagramMetamodel.CommandAction#getAggregate <em>Aggregate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregate</em>' reference.
	 * @see #getAggregate()
	 * @generated
	 */
	void setAggregate(Aggregate value);
} // CommandAction
