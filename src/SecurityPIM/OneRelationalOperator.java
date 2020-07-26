/**
 */
package SecurityPIM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>One Relational Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SecurityPIM.OneRelationalOperator#getValue <em>Value</em>}</li>
 *   <li>{@link SecurityPIM.OneRelationalOperator#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see SecurityPIM.SecurityPIMMetamodelPackage#getOneRelationalOperator()
 * @model
 * @generated
 */
public interface OneRelationalOperator extends OnePropertyOperator {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see SecurityPIM.SecurityPIMMetamodelPackage#getOneRelationalOperator_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link SecurityPIM.OneRelationalOperator#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link SecurityPIM.RelationalOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see SecurityPIM.RelationalOperator
	 * @see #setOperator(RelationalOperator)
	 * @see SecurityPIM.SecurityPIMMetamodelPackage#getOneRelationalOperator_Operator()
	 * @model required="true"
	 * @generated
	 */
	RelationalOperator getOperator();

	/**
	 * Sets the value of the '{@link SecurityPIM.OneRelationalOperator#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see SecurityPIM.RelationalOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(RelationalOperator value);

} // OneRelationalOperator
