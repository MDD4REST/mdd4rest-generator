/**
 */
package SecurityPIM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>One Unary Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SecurityPIM.OneUnaryOperator#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see SecurityPIM.SecurityPIMMetamodelPackage#getOneUnaryOperator()
 * @model
 * @generated
 */
public interface OneUnaryOperator extends OnePropertyOperator {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link SecurityPIM.UnaryOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see SecurityPIM.UnaryOperator
	 * @see #setOperator(UnaryOperator)
	 * @see SecurityPIM.SecurityPIMMetamodelPackage#getOneUnaryOperator_Operator()
	 * @model required="true"
	 * @generated
	 */
	UnaryOperator getOperator();

	/**
	 * Sets the value of the '{@link SecurityPIM.OneUnaryOperator#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see SecurityPIM.UnaryOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(UnaryOperator value);

} // OneUnaryOperator
