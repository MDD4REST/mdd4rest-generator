/**
 */
package SecurityPIM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>One List Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SecurityPIM.OneListOperator#getValue <em>Value</em>}</li>
 *   <li>{@link SecurityPIM.OneListOperator#getListOperator <em>List Operator</em>}</li>
 * </ul>
 *
 * @see SecurityPIM.SecurityPIMMetamodelPackage#getOneListOperator()
 * @model
 * @generated
 */
public interface OneListOperator extends OnePropertyOperator {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see SecurityPIM.SecurityPIMMetamodelPackage#getOneListOperator_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link SecurityPIM.OneListOperator#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>List Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link SecurityPIM.ListOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Operator</em>' attribute.
	 * @see SecurityPIM.ListOperator
	 * @see #setListOperator(ListOperator)
	 * @see SecurityPIM.SecurityPIMMetamodelPackage#getOneListOperator_ListOperator()
	 * @model required="true"
	 * @generated
	 */
	ListOperator getListOperator();

	/**
	 * Sets the value of the '{@link SecurityPIM.OneListOperator#getListOperator <em>List Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Operator</em>' attribute.
	 * @see SecurityPIM.ListOperator
	 * @see #getListOperator()
	 * @generated
	 */
	void setListOperator(ListOperator value);

} // OneListOperator
