/**
 */
package SecurityPIM;

import ServicePIM.Property;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SecurityPIM.ConstraintOperator#getRightOperand <em>Right Operand</em>}</li>
 * </ul>
 *
 * @see SecurityPIM.SecurityPIMMetamodelPackage#getConstraintOperator()
 * @model abstract="true"
 * @generated
 */
public interface ConstraintOperator extends EObject {
	/**
	 * Returns the value of the '<em><b>Right Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Operand</em>' reference.
	 * @see #setRightOperand(Property)
	 * @see SecurityPIM.SecurityPIMMetamodelPackage#getConstraintOperator_RightOperand()
	 * @model
	 * @generated
	 */
	Property getRightOperand();

	/**
	 * Sets the value of the '{@link SecurityPIM.ConstraintOperator#getRightOperand <em>Right Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Operand</em>' reference.
	 * @see #getRightOperand()
	 * @generated
	 */
	void setRightOperand(Property value);

} // ConstraintOperator
