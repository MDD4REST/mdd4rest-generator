/**
 */
package QueryPIM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order By</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QueryPIM.OrderBy#getOrderDirection <em>Order Direction</em>}</li>
 * </ul>
 *
 * @see QueryPIM.QueryPIMMetamodelPackage#getOrderBy()
 * @model
 * @generated
 */
public interface OrderBy extends Query {
	/**
	 * Returns the value of the '<em><b>Order Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link QueryPIM.OrderDirection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Direction</em>' attribute.
	 * @see QueryPIM.OrderDirection
	 * @see #setOrderDirection(OrderDirection)
	 * @see QueryPIM.QueryPIMMetamodelPackage#getOrderBy_OrderDirection()
	 * @model
	 * @generated
	 */
	OrderDirection getOrderDirection();

	/**
	 * Sets the value of the '{@link QueryPIM.OrderBy#getOrderDirection <em>Order Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Direction</em>' attribute.
	 * @see QueryPIM.OrderDirection
	 * @see #getOrderDirection()
	 * @generated
	 */
	void setOrderDirection(OrderDirection value);

} // OrderBy
