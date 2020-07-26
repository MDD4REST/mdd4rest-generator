/**
 */
package SecurityPIM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>One String Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SecurityPIM.OneStringOperator#getValue <em>Value</em>}</li>
 *   <li>{@link SecurityPIM.OneStringOperator#getStringOperator <em>String Operator</em>}</li>
 * </ul>
 *
 * @see SecurityPIM.SecurityPIMMetamodelPackage#getOneStringOperator()
 * @model
 * @generated
 */
public interface OneStringOperator extends OnePropertyOperator {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see SecurityPIM.SecurityPIMMetamodelPackage#getOneStringOperator_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link SecurityPIM.OneStringOperator#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>String Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link SecurityPIM.StringOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Operator</em>' attribute.
	 * @see SecurityPIM.StringOperator
	 * @see #setStringOperator(StringOperator)
	 * @see SecurityPIM.SecurityPIMMetamodelPackage#getOneStringOperator_StringOperator()
	 * @model required="true"
	 * @generated
	 */
	StringOperator getStringOperator();

	/**
	 * Sets the value of the '{@link SecurityPIM.OneStringOperator#getStringOperator <em>String Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Operator</em>' attribute.
	 * @see SecurityPIM.StringOperator
	 * @see #getStringOperator()
	 * @generated
	 */
	void setStringOperator(StringOperator value);

} // OneStringOperator
