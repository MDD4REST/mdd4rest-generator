/**
 */
package ActivityDiagramMetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ActivityDiagramMetamodel.EventAction#getAggregate <em>Aggregate</em>}</li>
 * </ul>
 *
 * @see ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage#getEventAction()
 * @model annotation="gmf.node label='name' color='243,156,18'"
 * @generated
 */
public interface EventAction extends Action {

	/**
	 * Returns the value of the '<em><b>Aggregate</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ActivityDiagramMetamodel.Aggregate#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate</em>' reference.
	 * @see #setAggregate(Aggregate)
	 * @see ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage#getEventAction_Aggregate()
	 * @see ActivityDiagramMetamodel.Aggregate#getEvents
	 * @model opposite="events"
	 * @generated
	 */
	Aggregate getAggregate();

	/**
	 * Sets the value of the '{@link ActivityDiagramMetamodel.EventAction#getAggregate <em>Aggregate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregate</em>' reference.
	 * @see #getAggregate()
	 * @generated
	 */
	void setAggregate(Aggregate value);
} // EventAction
