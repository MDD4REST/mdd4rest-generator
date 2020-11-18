/**
 */
package ActivityDiagramMetamodel;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ActivityDiagramMetamodel.Aggregate#getEvents <em>Events</em>}</li>
 *   <li>{@link ActivityDiagramMetamodel.Aggregate#getCommand <em>Command</em>}</li>
 *   <li>{@link ActivityDiagramMetamodel.Aggregate#getQuery <em>Query</em>}</li>
 * </ul>
 *
 * @see ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage#getAggregate()
 * @model annotation="gmf.node label='name' color='241,196,15'"
 * @generated
 */
public interface Aggregate extends ObjectNode {

	/**
	 * Returns the value of the '<em><b>Events</b></em>' reference list.
	 * The list contents are of type {@link ActivityDiagramMetamodel.EventAction}.
	 * It is bidirectional and its opposite is '{@link ActivityDiagramMetamodel.EventAction#getAggregate <em>Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' reference list.
	 * @see ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage#getAggregate_Events()
	 * @see ActivityDiagramMetamodel.EventAction#getAggregate
	 * @model opposite="aggregate"
	 *        annotation="gmf.link style='dash' target.decoration='arrow' width='2'"
	 * @generated
	 */
	EList<EventAction> getEvents();

	/**
	 * Returns the value of the '<em><b>Command</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ActivityDiagramMetamodel.CommandAction#getAggregate <em>Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' reference.
	 * @see #setCommand(CommandAction)
	 * @see ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage#getAggregate_Command()
	 * @see ActivityDiagramMetamodel.CommandAction#getAggregate
	 * @model opposite="aggregate"
	 * @generated
	 */
	CommandAction getCommand();

	/**
	 * Sets the value of the '{@link ActivityDiagramMetamodel.Aggregate#getCommand <em>Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' reference.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(CommandAction value);

	/**
	 * Returns the value of the '<em><b>Query</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ActivityDiagramMetamodel.QueryAction#getAggregate <em>Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' reference.
	 * @see #setQuery(QueryAction)
	 * @see ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage#getAggregate_Query()
	 * @see ActivityDiagramMetamodel.QueryAction#getAggregate
	 * @model opposite="aggregate"
	 * @generated
	 */
	QueryAction getQuery();

	/**
	 * Sets the value of the '{@link ActivityDiagramMetamodel.Aggregate#getQuery <em>Query</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' reference.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(QueryAction value);
} // Aggregate
