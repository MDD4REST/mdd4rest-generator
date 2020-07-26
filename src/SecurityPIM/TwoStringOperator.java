/**
 */
package SecurityPIM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Two String Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SecurityPIM.TwoStringOperator#getStringOperator <em>String Operator</em>}</li>
 * </ul>
 *
 * @see SecurityPIM.SecurityPIMMetamodelPackage#getTwoStringOperator()
 * @model
 * @generated
 */
public interface TwoStringOperator extends TwoPropertyOperator {
	/**
	 * Returns the value of the '<em><b>String Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link SecurityPIM.StringOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Operator</em>' attribute.
	 * @see SecurityPIM.StringOperator
	 * @see #setStringOperator(StringOperator)
	 * @see SecurityPIM.SecurityPIMMetamodelPackage#getTwoStringOperator_StringOperator()
	 * @model required="true"
	 * @generated
	 */
	StringOperator getStringOperator();

	/**
	 * Sets the value of the '{@link SecurityPIM.TwoStringOperator#getStringOperator <em>String Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Operator</em>' attribute.
	 * @see SecurityPIM.StringOperator
	 * @see #getStringOperator()
	 * @generated
	 */
	void setStringOperator(StringOperator value);

} // TwoStringOperator
