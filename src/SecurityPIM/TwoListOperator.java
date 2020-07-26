/**
 */
package SecurityPIM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Two List Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SecurityPIM.TwoListOperator#getListOperator <em>List Operator</em>}</li>
 * </ul>
 *
 * @see SecurityPIM.SecurityPIMMetamodelPackage#getTwoListOperator()
 * @model
 * @generated
 */
public interface TwoListOperator extends TwoPropertyOperator {
	/**
	 * Returns the value of the '<em><b>List Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link SecurityPIM.ListOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Operator</em>' attribute.
	 * @see SecurityPIM.ListOperator
	 * @see #setListOperator(ListOperator)
	 * @see SecurityPIM.SecurityPIMMetamodelPackage#getTwoListOperator_ListOperator()
	 * @model required="true"
	 * @generated
	 */
	ListOperator getListOperator();

	/**
	 * Sets the value of the '{@link SecurityPIM.TwoListOperator#getListOperator <em>List Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Operator</em>' attribute.
	 * @see SecurityPIM.ListOperator
	 * @see #getListOperator()
	 * @generated
	 */
	void setListOperator(ListOperator value);

} // TwoListOperator
