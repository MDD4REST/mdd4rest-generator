/**
 */
package SecurityPIM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see SecurityPIM.SecurityPIMMetamodelPackage
 * @generated
 */
public interface SecurityPIMMetamodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SecurityPIMMetamodelFactory eINSTANCE = SecurityPIM.impl.SecurityPIMMetamodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Decentral Auth</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decentral Auth</em>'.
	 * @generated
	 */
	DecentralAuth createDecentralAuth();

	/**
	 * Returns a new object of class '<em>Centeral Auth</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Centeral Auth</em>'.
	 * @generated
	 */
	CenteralAuth createCenteralAuth();

	/**
	 * Returns a new object of class '<em>UAA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UAA</em>'.
	 * @generated
	 */
	UAA createUAA();

	/**
	 * Returns a new object of class '<em>OAuth2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OAuth2</em>'.
	 * @generated
	 */
	OAuth2 createOAuth2();

	/**
	 * Returns a new object of class '<em>Basic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic</em>'.
	 * @generated
	 */
	Basic createBasic();

	/**
	 * Returns a new object of class '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role</em>'.
	 * @generated
	 */
	Role createRole();

	/**
	 * Returns a new object of class '<em>Permission</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Permission</em>'.
	 * @generated
	 */
	Permission createPermission();

	/**
	 * Returns a new object of class '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint</em>'.
	 * @generated
	 */
	Constraint createConstraint();

	/**
	 * Returns a new object of class '<em>One Relational Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>One Relational Operator</em>'.
	 * @generated
	 */
	OneRelationalOperator createOneRelationalOperator();

	/**
	 * Returns a new object of class '<em>One List Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>One List Operator</em>'.
	 * @generated
	 */
	OneListOperator createOneListOperator();

	/**
	 * Returns a new object of class '<em>One String Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>One String Operator</em>'.
	 * @generated
	 */
	OneStringOperator createOneStringOperator();

	/**
	 * Returns a new object of class '<em>One Unary Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>One Unary Operator</em>'.
	 * @generated
	 */
	OneUnaryOperator createOneUnaryOperator();

	/**
	 * Returns a new object of class '<em>One Boolean Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>One Boolean Operator</em>'.
	 * @generated
	 */
	OneBooleanOperator createOneBooleanOperator();

	/**
	 * Returns a new object of class '<em>Two List Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Two List Operator</em>'.
	 * @generated
	 */
	TwoListOperator createTwoListOperator();

	/**
	 * Returns a new object of class '<em>Two Relational Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Two Relational Operator</em>'.
	 * @generated
	 */
	TwoRelationalOperator createTwoRelationalOperator();

	/**
	 * Returns a new object of class '<em>Two String Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Two String Operator</em>'.
	 * @generated
	 */
	TwoStringOperator createTwoStringOperator();

	/**
	 * Returns a new object of class '<em>Logical Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical Operator</em>'.
	 * @generated
	 */
	LogicalOperator createLogicalOperator();

	/**
	 * Returns a new object of class '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User</em>'.
	 * @generated
	 */
	User createUser();

	/**
	 * Returns a new object of class '<em>Current User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Current User</em>'.
	 * @generated
	 */
	CurrentUser createCurrentUser();

	/**
	 * Returns a new object of class '<em>Username</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Username</em>'.
	 * @generated
	 */
	Username createUsername();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SecurityPIMMetamodelPackage getSecurityPIMMetamodelPackage();

} //SecurityPIMMetamodelFactory
