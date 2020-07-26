/**
 */
package SecurityPIM;

import ServicePIM.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Two Property Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SecurityPIM.TwoPropertyOperator#getLeftOperand <em>Left Operand</em>}</li>
 * </ul>
 *
 * @see SecurityPIM.SecurityPIMMetamodelPackage#getTwoPropertyOperator()
 * @model abstract="true"
 * @generated
 */
public interface TwoPropertyOperator extends ConstraintOperator {
	/**
	 * Returns the value of the '<em><b>Left Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Operand</em>' reference.
	 * @see #setLeftOperand(Property)
	 * @see SecurityPIM.SecurityPIMMetamodelPackage#getTwoPropertyOperator_LeftOperand()
	 * @model
	 * @generated
	 */
	Property getLeftOperand();

	/**
	 * Sets the value of the '{@link SecurityPIM.TwoPropertyOperator#getLeftOperand <em>Left Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Operand</em>' reference.
	 * @see #getLeftOperand()
	 * @generated
	 */
	void setLeftOperand(Property value);

} // TwoPropertyOperator
