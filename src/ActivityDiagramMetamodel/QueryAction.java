/**
 */
package ActivityDiagramMetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ActivityDiagramMetamodel.QueryAction#getAggregate <em>Aggregate</em>}</li>
 * </ul>
 *
 * @see ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage#getQueryAction()
 * @model annotation="gmf.node label='name' color='243,156,18'"
 * @generated
 */
public interface QueryAction extends Action {
	/**
	 * Returns the value of the '<em><b>Aggregate</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ActivityDiagramMetamodel.Aggregate#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate</em>' reference.
	 * @see #setAggregate(Aggregate)
	 * @see ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage#getQueryAction_Aggregate()
	 * @see ActivityDiagramMetamodel.Aggregate#getQuery
	 * @model opposite="query"
	 * @generated
	 */
	Aggregate getAggregate();

	/**
	 * Sets the value of the '{@link ActivityDiagramMetamodel.QueryAction#getAggregate <em>Aggregate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregate</em>' reference.
	 * @see #getAggregate()
	 * @generated
	 */
	void setAggregate(Aggregate value);

} // QueryAction
