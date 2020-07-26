/**
 */
package SecurityPIM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SecurityPIM.LogicalOperator#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see SecurityPIM.SecurityPIMMetamodelPackage#getLogicalOperator()
 * @model
 * @generated
 */
public interface LogicalOperator extends EObject {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link SecurityPIM.LogicalOperatorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see SecurityPIM.LogicalOperatorType
	 * @see #setOperator(LogicalOperatorType)
	 * @see SecurityPIM.SecurityPIMMetamodelPackage#getLogicalOperator_Operator()
	 * @model
	 * @generated
	 */
	LogicalOperatorType getOperator();

	/**
	 * Sets the value of the '{@link SecurityPIM.LogicalOperator#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see SecurityPIM.LogicalOperatorType
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(LogicalOperatorType value);

} // LogicalOperator
