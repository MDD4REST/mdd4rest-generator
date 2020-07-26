/**
 */
package SecurityPIM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Two Relational Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SecurityPIM.TwoRelationalOperator#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see SecurityPIM.SecurityPIMMetamodelPackage#getTwoRelationalOperator()
 * @model
 * @generated
 */
public interface TwoRelationalOperator extends TwoPropertyOperator {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link SecurityPIM.RelationalOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see SecurityPIM.RelationalOperator
	 * @see #setOperator(RelationalOperator)
	 * @see SecurityPIM.SecurityPIMMetamodelPackage#getTwoRelationalOperator_Operator()
	 * @model required="true"
	 * @generated
	 */
	RelationalOperator getOperator();

	/**
	 * Sets the value of the '{@link SecurityPIM.TwoRelationalOperator#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see SecurityPIM.RelationalOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(RelationalOperator value);

} // TwoRelationalOperator
