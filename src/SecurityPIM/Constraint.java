/**
 */
package SecurityPIM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SecurityPIM.Constraint#getConstraintoperator <em>Constraintoperator</em>}</li>
 *   <li>{@link SecurityPIM.Constraint#getLogicaloperators <em>Logicaloperators</em>}</li>
 * </ul>
 *
 * @see SecurityPIM.SecurityPIMMetamodelPackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Constraintoperator</b></em>' containment reference list.
	 * The list contents are of type {@link SecurityPIM.ConstraintOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraintoperator</em>' containment reference list.
	 * @see SecurityPIM.SecurityPIMMetamodelPackage#getConstraint_Constraintoperator()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConstraintOperator> getConstraintoperator();

	/**
	 * Returns the value of the '<em><b>Logicaloperators</b></em>' containment reference list.
	 * The list contents are of type {@link SecurityPIM.LogicalOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logicaloperators</em>' containment reference list.
	 * @see SecurityPIM.SecurityPIMMetamodelPackage#getConstraint_Logicaloperators()
	 * @model containment="true"
	 * @generated
	 */
	EList<LogicalOperator> getLogicaloperators();

} // Constraint
