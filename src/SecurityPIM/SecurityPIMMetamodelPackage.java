/**
 */
package SecurityPIM;

import ServicePIM.ServicePIMPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see SecurityPIM.SecurityPIMMetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface SecurityPIMMetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SecurityPIM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "src/metamodels/SecurityPIMMetamodel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mde";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SecurityPIMMetamodelPackage eINSTANCE = SecurityPIM.impl.SecurityPIMMetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link SecurityPIM.impl.AuthenticationImpl <em>Authentication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SecurityPIM.impl.AuthenticationImpl
	 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getAuthentication()
	 * @generated
	 */
	int AUTHENTICATION = 0;

	/**
	 * The number of structural features of the '<em>Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Current User</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION___CURRENT_USER = 0;

	/**
	 * The number of operations of the '<em>Authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link SecurityPIM.impl.AuthorizationImpl <em>Authorization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SecurityPIM.impl.AuthorizationImpl
	 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getAuthorization()
	 * @generated
	 */
	int AUTHORIZATION = 1;

	/**
	 * The number of structural features of the '<em>Authorization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Authorization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SecurityPIM.impl.DecentralAuthImpl <em>Decentral Auth</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SecurityPIM.impl.DecentralAuthImpl
	 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getDecentralAuth()
	 * @generated
	 */
	int DECENTRAL_AUTH = 2;

	/**
	 * The feature id for the '<em><b>Authorization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECENTRAL_AUTH__AUTHORIZATION = AUTHENTICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Decentral Auth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECENTRAL_AUTH_FEATURE_COUNT = AUTHENTICATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Current User</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECENTRAL_AUTH___CURRENT_USER = AUTHENTICATION___CURRENT_USER;

	/**
	 * The number of operations of the '<em>Decentral Auth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECENTRAL_AUTH_OPERATION_COUNT = AUTHENTICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SecurityPIM.impl.CenteralAuthImpl <em>Centeral Auth</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SecurityPIM.impl.CenteralAuthImpl
	 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getCenteralAuth()
	 * @generated
	 */
	int CENTERAL_AUTH = 3;

	/**
	 * The feature id for the '<em><b>Uaa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTERAL_AUTH__UAA = AUTHENTICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Centeral Auth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTERAL_AUTH_FEATURE_COUNT = AUTHENTICATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Current User</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTERAL_AUTH___CURRENT_USER = AUTHENTICATION___CURRENT_USER;

	/**
	 * The number of operations of the '<em>Centeral Auth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTERAL_AUTH_OPERATION_COUNT = AUTHENTICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SecurityPIM.impl.UAAImpl <em>UAA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SecurityPIM.impl.UAAImpl
	 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getUAA()
	 * @generated
	 */
	int UAA = 4;

	/**
	 * The number of structural features of the '<em>UAA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UAA_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>UAA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UAA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SecurityPIM.impl.OAuth2Impl <em>OAuth2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SecurityPIM.impl.OAuth2Impl
	 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getOAuth2()
	 * @generated
	 */
	int OAUTH2 = 5;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2__TOKEN = AUTHORIZATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OAuth2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_FEATURE_COUNT = AUTHORIZATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>OAuth2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH2_OPERATION_COUNT = AUTHORIZATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SecurityPIM.impl.BasicImpl <em>Basic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SecurityPIM.impl.BasicImpl
	 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getBasic()
	 * @generated
	 */
	int BASIC = 6;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC__USERNAME = AUTHORIZATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC__PASSWORD = AUTHORIZATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Basic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_FEATURE_COUNT = AUTHORIZATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Basic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_OPERATION_COUNT = AUTHORIZATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SecurityPIM.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SecurityPIM.impl.RoleImpl
	 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 7;

	/**
	 * The feature id for the '<em><b>Permission</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__PERMISSION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Permission Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__PERMISSION_MODE = 2;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SecurityPIM.impl.PermissionImpl <em>Permission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SecurityPIM.impl.PermissionImpl
	 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getPermission()
	 * @generated
	 */
	int PERMISSION = 8;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__CONSTRAINT = 0;

	/**
	 * The feature id for the '<em><b>Permission Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__PERMISSION_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__ACTIVITY = 2;

	/**
	 * The number of structural features of the '<em>Permission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Permission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SecurityPIM.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SecurityPIM.impl.ConstraintImpl
	 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 9;

	/**
	 * The feature id for the '<em><b>Constraintoperator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__CONSTRAINTOPERATOR = 0;

	/**
	 * The feature id for the '<em><b>Logicaloperators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__LOGICALOPERATORS = 1;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SecurityPIM.impl.ConstraintOperatorImpl <em>Constraint Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SecurityPIM.impl.ConstraintOperatorImpl
	 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getConstraintOperator()
	 * @generated
	 */
	int CONSTRAINT_OPERATOR = 10;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATOR__RIGHT_OPERAND = 0;

	/**
	 * The number of structural features of the '<em>Constraint Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Constraint Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SecurityPIM.impl.OnePropertyOperatorImpl <em>One Property Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SecurityPIM.impl.OnePropertyOperatorImpl
	 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getOnePropertyOperator()
	 * @generated
	 */
	int ONE_PROPERTY_OPERATOR = 11;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_PROPERTY_OPERATOR__RIGHT_OPERAND = CONSTRAINT_OPERATOR__RIGHT_OPERAND;

	/**
	 * The number of structural features of the '<em>One Property Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_PROPERTY_OPERATOR_FEATURE_COUNT = CONSTRAINT_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>One Property Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_PROPERTY_OPERATOR_OPERATION_COUNT = CONSTRAINT_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SecurityPIM.impl.TwoPropertyOperatorImpl <em>Two Property Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SecurityPIM.impl.TwoPropertyOperatorImpl
	 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getTwoPropertyOperator()
	 * @generated
	 */
	int TWO_PROPERTY_OPERATOR = 12;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_PROPERTY_OPERATOR__RIGHT_OPERAND = CONSTRAINT_OPERATOR__RIGHT_OPERAND;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_PROPERTY_OPERATOR__LEFT_OPERAND = CONSTRAINT_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Two Property Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_PROPERTY_OPERATOR_FEATURE_COUNT = CONSTRAINT_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Two Property Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_PROPERTY_OPERATOR_OPERATION_COUNT = CONSTRAINT_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SecurityPIM.impl.OneRelationalOperatorImpl <em>One Relational Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SecurityPIM.impl.OneRelationalOperatorImpl
	 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getOneRelationalOperator()
	 * @generated
	 */
	int ONE_RELATIONAL_OPERATOR = 13;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_RELATIONAL_OPERATOR__RIGHT_OPERAND = ONE_PROPERTY_OPERATOR__RIGHT_OPERAND;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_RELATIONAL_OPERATOR__VALUE = ONE_PROPERTY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_RELATIONAL_OPERATOR__OPERATOR = ONE_PROPERTY_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>One Relational Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_RELATIONAL_OPERATOR_FEATURE_COUNT = ONE_PROPERTY_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>One Relational Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_RELATIONAL_OPERATOR_OPERATION_COUNT = ONE_PROPERTY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SecurityPIM.impl.OneListOperatorImpl <em>One List Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SecurityPIM.impl.OneListOperatorImpl
	 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getOneListOperator()
	 * @generated
	 */
	int ONE_LIST_OPERATOR = 14;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_LIST_OPERATOR__RIGHT_OPERAND = ONE_PROPERTY_OPERATOR__RIGHT_OPERAND;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_LIST_OPERATOR__VALUE = ONE_PROPERTY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>List Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_LIST_OPERATOR__LIST_OPERATOR = ONE_PROPERTY_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>One List Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_LIST_OPERATOR_FEATURE_COUNT = ONE_PROPERTY_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>One List Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_LIST_OPERATOR_OPERATION_COUNT = ONE_PROPERTY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SecurityPIM.impl.OneStringOperatorImpl <em>One String Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SecurityPIM.impl.OneStringOperatorImpl
	 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getOneStringOperator()
	 * @generated
	 */
	int ONE_STRING_OPERATOR = 15;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_STRING_OPERATOR__RIGHT_OPERAND = ONE_PROPERTY_OPERATOR__RIGHT_OPERAND;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_STRING_OPERATOR__VALUE = ONE_PROPERTY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>String Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_STRING_OPERATOR__STRING_OPERATOR = ONE_PROPERTY_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>One String Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_STRING_OPERATOR_FEATURE_COUNT = ONE_PROPERTY_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>One String Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_STRING_OPERATOR_OPERATION_COUNT = ONE_PROPERTY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SecurityPIM.impl.OneUnaryOperatorImpl <em>One Unary Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SecurityPIM.impl.OneUnaryOperatorImpl
	 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getOneUnaryOperator()
	 * @generated
	 */
	int ONE_UNARY_OPERATOR = 16;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_UNARY_OPERATOR__RIGHT_OPERAND = ONE_PROPERTY_OPERATOR__RIGHT_OPERAND;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_UNARY_OPERATOR__OPERATOR = ONE_PROPERTY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>One Unary Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_UNARY_OPERATOR_FEATURE_COUNT = ONE_PROPERTY_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>One Unary Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_UNARY_OPERATOR_OPERATION_COUNT = ONE_PROPERTY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SecurityPIM.impl.OneBooleanOperatorImpl <em>One Boolean Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SecurityPIM.impl.OneBooleanOperatorImpl
	 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getOneBooleanOperator()
	 * @generated
	 */
	int ONE_BOOLEAN_OPERATOR = 17;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_BOOLEAN_OPERATOR__RIGHT_OPERAND = ONE_PROPERTY_OPERATOR__RIGHT_OPERAND;

	/**
	 * The number of structural features of the '<em>One Boolean Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_BOOLEAN_OPERATOR_FEATURE_COUNT = ONE_PROPERTY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>One Boolean Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_BOOLEAN_OPERATOR_OPERATION_COUNT = ONE_PROPERTY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SecurityPIM.impl.TwoListOperatorImpl <em>Two List Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SecurityPIM.impl.TwoListOperatorImpl
	 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getTwoListOperator()
	 * @generated
	 */
	int TWO_LIST_OPERATOR = 18;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_LIST_OPERATOR__RIGHT_OPERAND = TWO_PROPERTY_OPERATOR__RIGHT_OPERAND;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_LIST_OPERATOR__LEFT_OPERAND = TWO_PROPERTY_OPERATOR__LEFT_OPERAND;

	/**
	 * The feature id for the '<em><b>List Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_LIST_OPERATOR__LIST_OPERATOR = TWO_PROPERTY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Two List Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_LIST_OPERATOR_FEATURE_COUNT = TWO_PROPERTY_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Two List Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_LIST_OPERATOR_OPERATION_COUNT = TWO_PROPERTY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SecurityPIM.impl.TwoRelationalOperatorImpl <em>Two Relational Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SecurityPIM.impl.TwoRelationalOperatorImpl
	 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getTwoRelationalOperator()
	 * @generated
	 */
	int TWO_RELATIONAL_OPERATOR = 19;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_RELATIONAL_OPERATOR__RIGHT_OPERAND = TWO_PROPERTY_OPERATOR__RIGHT_OPERAND;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_RELATIONAL_OPERATOR__LEFT_OPERAND = TWO_PROPERTY_OPERATOR__LEFT_OPERAND;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_RELATIONAL_OPERATOR__OPERATOR = TWO_PROPERTY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Two Relational Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_RELATIONAL_OPERATOR_FEATURE_COUNT = TWO_PROPERTY_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Two Relational Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_RELATIONAL_OPERATOR_OPERATION_COUNT = TWO_PROPERTY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SecurityPIM.impl.TwoStringOperatorImpl <em>Two String Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SecurityPIM.impl.TwoStringOperatorImpl
	 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getTwoStringOperator()
	 * @generated
	 */
	int TWO_STRING_OPERATOR = 20;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_STRING_OPERATOR__RIGHT_OPERAND = TWO_PROPERTY_OPERATOR__RIGHT_OPERAND;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_STRING_OPERATOR__LEFT_OPERAND = TWO_PROPERTY_OPERATOR__LEFT_OPERAND;

	/**
	 * The feature id for the '<em><b>String Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_STRING_OPERATOR__STRING_OPERATOR = TWO_PROPERTY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Two String Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_STRING_OPERATOR_FEATURE_COUNT = TWO_PROPERTY_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Two String Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWO_STRING_OPERATOR_OPERATION_COUNT = TWO_PROPERTY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SecurityPIM.impl.LogicalOperatorImpl <em>Logical Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SecurityPIM.impl.LogicalOperatorImpl
	 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getLogicalOperator()
	 * @generated
	 */
	int LOGICAL_OPERATOR = 21;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATOR__OPERATOR = 0;

	/**
	 * The number of structural features of the '<em>Logical Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Logical Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SecurityPIM.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SecurityPIM.impl.UserImpl
	 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getUser()
	 * @generated
	 */
	int USER = 22;

	/**
	 * The feature id for the '<em><b>Is Algorithmic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__IS_ALGORITHMIC = ServicePIMPackage.RESOURCE__IS_ALGORITHMIC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = ServicePIMPackage.RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Has Input Representation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__HAS_INPUT_REPRESENTATION = ServicePIMPackage.RESOURCE__HAS_INPUT_REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ACTIVITY = ServicePIMPackage.RESOURCE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Has Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__HAS_PROPERTY = ServicePIMPackage.RESOURCE__HAS_PROPERTY;

	/**
	 * The feature id for the '<em><b>Has Output Representation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__HAS_OUTPUT_REPRESENTATION = ServicePIMPackage.RESOURCE__HAS_OUTPUT_REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Has Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__HAS_RELATIONSHIP = ServicePIMPackage.RESOURCE__HAS_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__FILTERS = ServicePIMPackage.RESOURCE__FILTERS;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__SORT = ServicePIMPackage.RESOURCE__SORT;

	/**
	 * The feature id for the '<em><b>Select</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__SELECT = ServicePIMPackage.RESOURCE__SELECT;

	/**
	 * The feature id for the '<em><b>Pagination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PAGINATION = ServicePIMPackage.RESOURCE__PAGINATION;

	/**
	 * The feature id for the '<em><b>Scopesearch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__SCOPESEARCH = ServicePIMPackage.RESOURCE__SCOPESEARCH;

	/**
	 * The feature id for the '<em><b>Caching</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__CACHING = ServicePIMPackage.RESOURCE__CACHING;

	/**
	 * The feature id for the '<em><b>Username</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USERNAME = ServicePIMPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = ServicePIMPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = ServicePIMPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SecurityPIM.impl.CurrentUserImpl <em>Current User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SecurityPIM.impl.CurrentUserImpl
	 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getCurrentUser()
	 * @generated
	 */
	int CURRENT_USER = 23;

	/**
	 * The feature id for the '<em><b>Is Algorithmic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_USER__IS_ALGORITHMIC = USER__IS_ALGORITHMIC;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_USER__NAME = USER__NAME;

	/**
	 * The feature id for the '<em><b>Has Input Representation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_USER__HAS_INPUT_REPRESENTATION = USER__HAS_INPUT_REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_USER__ACTIVITY = USER__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Has Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_USER__HAS_PROPERTY = USER__HAS_PROPERTY;

	/**
	 * The feature id for the '<em><b>Has Output Representation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_USER__HAS_OUTPUT_REPRESENTATION = USER__HAS_OUTPUT_REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Has Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_USER__HAS_RELATIONSHIP = USER__HAS_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_USER__FILTERS = USER__FILTERS;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_USER__SORT = USER__SORT;

	/**
	 * The feature id for the '<em><b>Select</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_USER__SELECT = USER__SELECT;

	/**
	 * The feature id for the '<em><b>Pagination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_USER__PAGINATION = USER__PAGINATION;

	/**
	 * The feature id for the '<em><b>Scopesearch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_USER__SCOPESEARCH = USER__SCOPESEARCH;

	/**
	 * The feature id for the '<em><b>Caching</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_USER__CACHING = USER__CACHING;

	/**
	 * The feature id for the '<em><b>Username</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_USER__USERNAME = USER__USERNAME;

	/**
	 * The number of structural features of the '<em>Current User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_USER_FEATURE_COUNT = USER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Current User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_USER_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SecurityPIM.impl.UsernameImpl <em>Username</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SecurityPIM.impl.UsernameImpl
	 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getUsername()
	 * @generated
	 */
	int USERNAME = 24;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERNAME__IS_UNIQUE = ServicePIMPackage.PROPERTY__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Is Naming Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERNAME__IS_NAMING_PROPERTY = ServicePIMPackage.PROPERTY__IS_NAMING_PROPERTY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERNAME__NAME = ServicePIMPackage.PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Is Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERNAME__IS_REQUIRED = ServicePIMPackage.PROPERTY__IS_REQUIRED;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERNAME__MIN = ServicePIMPackage.PROPERTY__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERNAME__MAX = ServicePIMPackage.PROPERTY__MAX;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERNAME__TYPE = ServicePIMPackage.PROPERTY__TYPE;

	/**
	 * The feature id for the '<em><b>Basictype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERNAME__BASICTYPE = ServicePIMPackage.PROPERTY__BASICTYPE;

	/**
	 * The number of structural features of the '<em>Username</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERNAME_FEATURE_COUNT = ServicePIMPackage.PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Username</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERNAME_OPERATION_COUNT = ServicePIMPackage.PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SecurityPIM.PermissionType <em>Permission Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SecurityPIM.PermissionType
	 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getPermissionType()
	 * @generated
	 */
	int PERMISSION_TYPE = 25;

	/**
	 * The meta object id for the '{@link SecurityPIM.ListOperator <em>List Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SecurityPIM.ListOperator
	 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getListOperator()
	 * @generated
	 */
	int LIST_OPERATOR = 26;

	/**
	 * The meta object id for the '{@link SecurityPIM.StringOperator <em>String Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SecurityPIM.StringOperator
	 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getStringOperator()
	 * @generated
	 */
	int STRING_OPERATOR = 27;

	/**
	 * The meta object id for the '{@link SecurityPIM.RelationalOperator <em>Relational Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SecurityPIM.RelationalOperator
	 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getRelationalOperator()
	 * @generated
	 */
	int RELATIONAL_OPERATOR = 28;

	/**
	 * The meta object id for the '{@link SecurityPIM.UnaryOperator <em>Unary Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SecurityPIM.UnaryOperator
	 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getUnaryOperator()
	 * @generated
	 */
	int UNARY_OPERATOR = 29;

	/**
	 * The meta object id for the '{@link SecurityPIM.LogicalOperatorType <em>Logical Operator Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SecurityPIM.LogicalOperatorType
	 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getLogicalOperatorType()
	 * @generated
	 */
	int LOGICAL_OPERATOR_TYPE = 30;

	/**
	 * The meta object id for the '{@link SecurityPIM.PermissionMode <em>Permission Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SecurityPIM.PermissionMode
	 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getPermissionMode()
	 * @generated
	 */
	int PERMISSION_MODE = 31;


	/**
	 * Returns the meta object for class '{@link SecurityPIM.Authentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authentication</em>'.
	 * @see SecurityPIM.Authentication
	 * @generated
	 */
	EClass getAuthentication();

	/**
	 * Returns the meta object for the '{@link SecurityPIM.Authentication#currentUser() <em>Current User</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Current User</em>' operation.
	 * @see SecurityPIM.Authentication#currentUser()
	 * @generated
	 */
	EOperation getAuthentication__CurrentUser();

	/**
	 * Returns the meta object for class '{@link SecurityPIM.Authorization <em>Authorization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authorization</em>'.
	 * @see SecurityPIM.Authorization
	 * @generated
	 */
	EClass getAuthorization();

	/**
	 * Returns the meta object for class '{@link SecurityPIM.DecentralAuth <em>Decentral Auth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decentral Auth</em>'.
	 * @see SecurityPIM.DecentralAuth
	 * @generated
	 */
	EClass getDecentralAuth();

	/**
	 * Returns the meta object for the containment reference list '{@link SecurityPIM.DecentralAuth#getAuthorization <em>Authorization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Authorization</em>'.
	 * @see SecurityPIM.DecentralAuth#getAuthorization()
	 * @see #getDecentralAuth()
	 * @generated
	 */
	EReference getDecentralAuth_Authorization();

	/**
	 * Returns the meta object for class '{@link SecurityPIM.CenteralAuth <em>Centeral Auth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Centeral Auth</em>'.
	 * @see SecurityPIM.CenteralAuth
	 * @generated
	 */
	EClass getCenteralAuth();

	/**
	 * Returns the meta object for the reference '{@link SecurityPIM.CenteralAuth#getUaa <em>Uaa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uaa</em>'.
	 * @see SecurityPIM.CenteralAuth#getUaa()
	 * @see #getCenteralAuth()
	 * @generated
	 */
	EReference getCenteralAuth_Uaa();

	/**
	 * Returns the meta object for class '{@link SecurityPIM.UAA <em>UAA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UAA</em>'.
	 * @see SecurityPIM.UAA
	 * @generated
	 */
	EClass getUAA();

	/**
	 * Returns the meta object for class '{@link SecurityPIM.OAuth2 <em>OAuth2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OAuth2</em>'.
	 * @see SecurityPIM.OAuth2
	 * @generated
	 */
	EClass getOAuth2();

	/**
	 * Returns the meta object for the attribute '{@link SecurityPIM.OAuth2#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see SecurityPIM.OAuth2#getToken()
	 * @see #getOAuth2()
	 * @generated
	 */
	EAttribute getOAuth2_Token();

	/**
	 * Returns the meta object for class '{@link SecurityPIM.Basic <em>Basic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic</em>'.
	 * @see SecurityPIM.Basic
	 * @generated
	 */
	EClass getBasic();

	/**
	 * Returns the meta object for the attribute '{@link SecurityPIM.Basic#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see SecurityPIM.Basic#getUsername()
	 * @see #getBasic()
	 * @generated
	 */
	EAttribute getBasic_Username();

	/**
	 * Returns the meta object for the attribute '{@link SecurityPIM.Basic#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see SecurityPIM.Basic#getPassword()
	 * @see #getBasic()
	 * @generated
	 */
	EAttribute getBasic_Password();

	/**
	 * Returns the meta object for class '{@link SecurityPIM.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see SecurityPIM.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the containment reference list '{@link SecurityPIM.Role#getPermission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Permission</em>'.
	 * @see SecurityPIM.Role#getPermission()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Permission();

	/**
	 * Returns the meta object for the attribute '{@link SecurityPIM.Role#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SecurityPIM.Role#getName()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Name();

	/**
	 * Returns the meta object for the attribute '{@link SecurityPIM.Role#getPermissionMode <em>Permission Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Permission Mode</em>'.
	 * @see SecurityPIM.Role#getPermissionMode()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_PermissionMode();

	/**
	 * Returns the meta object for class '{@link SecurityPIM.Permission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Permission</em>'.
	 * @see SecurityPIM.Permission
	 * @generated
	 */
	EClass getPermission();

	/**
	 * Returns the meta object for the containment reference list '{@link SecurityPIM.Permission#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraint</em>'.
	 * @see SecurityPIM.Permission#getConstraint()
	 * @see #getPermission()
	 * @generated
	 */
	EReference getPermission_Constraint();

	/**
	 * Returns the meta object for the attribute '{@link SecurityPIM.Permission#getPermissionType <em>Permission Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Permission Type</em>'.
	 * @see SecurityPIM.Permission#getPermissionType()
	 * @see #getPermission()
	 * @generated
	 */
	EAttribute getPermission_PermissionType();

	/**
	 * Returns the meta object for the reference list '{@link SecurityPIM.Permission#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity</em>'.
	 * @see SecurityPIM.Permission#getActivity()
	 * @see #getPermission()
	 * @generated
	 */
	EReference getPermission_Activity();

	/**
	 * Returns the meta object for class '{@link SecurityPIM.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see SecurityPIM.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link SecurityPIM.Constraint#getConstraintoperator <em>Constraintoperator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraintoperator</em>'.
	 * @see SecurityPIM.Constraint#getConstraintoperator()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Constraintoperator();

	/**
	 * Returns the meta object for the containment reference list '{@link SecurityPIM.Constraint#getLogicaloperators <em>Logicaloperators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Logicaloperators</em>'.
	 * @see SecurityPIM.Constraint#getLogicaloperators()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Logicaloperators();

	/**
	 * Returns the meta object for class '{@link SecurityPIM.ConstraintOperator <em>Constraint Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint Operator</em>'.
	 * @see SecurityPIM.ConstraintOperator
	 * @generated
	 */
	EClass getConstraintOperator();

	/**
	 * Returns the meta object for the reference '{@link SecurityPIM.ConstraintOperator#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right Operand</em>'.
	 * @see SecurityPIM.ConstraintOperator#getRightOperand()
	 * @see #getConstraintOperator()
	 * @generated
	 */
	EReference getConstraintOperator_RightOperand();

	/**
	 * Returns the meta object for class '{@link SecurityPIM.OnePropertyOperator <em>One Property Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One Property Operator</em>'.
	 * @see SecurityPIM.OnePropertyOperator
	 * @generated
	 */
	EClass getOnePropertyOperator();

	/**
	 * Returns the meta object for class '{@link SecurityPIM.TwoPropertyOperator <em>Two Property Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Two Property Operator</em>'.
	 * @see SecurityPIM.TwoPropertyOperator
	 * @generated
	 */
	EClass getTwoPropertyOperator();

	/**
	 * Returns the meta object for the reference '{@link SecurityPIM.TwoPropertyOperator#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left Operand</em>'.
	 * @see SecurityPIM.TwoPropertyOperator#getLeftOperand()
	 * @see #getTwoPropertyOperator()
	 * @generated
	 */
	EReference getTwoPropertyOperator_LeftOperand();

	/**
	 * Returns the meta object for class '{@link SecurityPIM.OneRelationalOperator <em>One Relational Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One Relational Operator</em>'.
	 * @see SecurityPIM.OneRelationalOperator
	 * @generated
	 */
	EClass getOneRelationalOperator();

	/**
	 * Returns the meta object for the attribute '{@link SecurityPIM.OneRelationalOperator#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see SecurityPIM.OneRelationalOperator#getValue()
	 * @see #getOneRelationalOperator()
	 * @generated
	 */
	EAttribute getOneRelationalOperator_Value();

	/**
	 * Returns the meta object for the attribute '{@link SecurityPIM.OneRelationalOperator#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see SecurityPIM.OneRelationalOperator#getOperator()
	 * @see #getOneRelationalOperator()
	 * @generated
	 */
	EAttribute getOneRelationalOperator_Operator();

	/**
	 * Returns the meta object for class '{@link SecurityPIM.OneListOperator <em>One List Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One List Operator</em>'.
	 * @see SecurityPIM.OneListOperator
	 * @generated
	 */
	EClass getOneListOperator();

	/**
	 * Returns the meta object for the attribute '{@link SecurityPIM.OneListOperator#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see SecurityPIM.OneListOperator#getValue()
	 * @see #getOneListOperator()
	 * @generated
	 */
	EAttribute getOneListOperator_Value();

	/**
	 * Returns the meta object for the attribute '{@link SecurityPIM.OneListOperator#getListOperator <em>List Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>List Operator</em>'.
	 * @see SecurityPIM.OneListOperator#getListOperator()
	 * @see #getOneListOperator()
	 * @generated
	 */
	EAttribute getOneListOperator_ListOperator();

	/**
	 * Returns the meta object for class '{@link SecurityPIM.OneStringOperator <em>One String Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One String Operator</em>'.
	 * @see SecurityPIM.OneStringOperator
	 * @generated
	 */
	EClass getOneStringOperator();

	/**
	 * Returns the meta object for the attribute '{@link SecurityPIM.OneStringOperator#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see SecurityPIM.OneStringOperator#getValue()
	 * @see #getOneStringOperator()
	 * @generated
	 */
	EAttribute getOneStringOperator_Value();

	/**
	 * Returns the meta object for the attribute '{@link SecurityPIM.OneStringOperator#getStringOperator <em>String Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String Operator</em>'.
	 * @see SecurityPIM.OneStringOperator#getStringOperator()
	 * @see #getOneStringOperator()
	 * @generated
	 */
	EAttribute getOneStringOperator_StringOperator();

	/**
	 * Returns the meta object for class '{@link SecurityPIM.OneUnaryOperator <em>One Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One Unary Operator</em>'.
	 * @see SecurityPIM.OneUnaryOperator
	 * @generated
	 */
	EClass getOneUnaryOperator();

	/**
	 * Returns the meta object for the attribute '{@link SecurityPIM.OneUnaryOperator#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see SecurityPIM.OneUnaryOperator#getOperator()
	 * @see #getOneUnaryOperator()
	 * @generated
	 */
	EAttribute getOneUnaryOperator_Operator();

	/**
	 * Returns the meta object for class '{@link SecurityPIM.OneBooleanOperator <em>One Boolean Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One Boolean Operator</em>'.
	 * @see SecurityPIM.OneBooleanOperator
	 * @generated
	 */
	EClass getOneBooleanOperator();

	/**
	 * Returns the meta object for class '{@link SecurityPIM.TwoListOperator <em>Two List Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Two List Operator</em>'.
	 * @see SecurityPIM.TwoListOperator
	 * @generated
	 */
	EClass getTwoListOperator();

	/**
	 * Returns the meta object for the attribute '{@link SecurityPIM.TwoListOperator#getListOperator <em>List Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>List Operator</em>'.
	 * @see SecurityPIM.TwoListOperator#getListOperator()
	 * @see #getTwoListOperator()
	 * @generated
	 */
	EAttribute getTwoListOperator_ListOperator();

	/**
	 * Returns the meta object for class '{@link SecurityPIM.TwoRelationalOperator <em>Two Relational Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Two Relational Operator</em>'.
	 * @see SecurityPIM.TwoRelationalOperator
	 * @generated
	 */
	EClass getTwoRelationalOperator();

	/**
	 * Returns the meta object for the attribute '{@link SecurityPIM.TwoRelationalOperator#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see SecurityPIM.TwoRelationalOperator#getOperator()
	 * @see #getTwoRelationalOperator()
	 * @generated
	 */
	EAttribute getTwoRelationalOperator_Operator();

	/**
	 * Returns the meta object for class '{@link SecurityPIM.TwoStringOperator <em>Two String Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Two String Operator</em>'.
	 * @see SecurityPIM.TwoStringOperator
	 * @generated
	 */
	EClass getTwoStringOperator();

	/**
	 * Returns the meta object for the attribute '{@link SecurityPIM.TwoStringOperator#getStringOperator <em>String Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String Operator</em>'.
	 * @see SecurityPIM.TwoStringOperator#getStringOperator()
	 * @see #getTwoStringOperator()
	 * @generated
	 */
	EAttribute getTwoStringOperator_StringOperator();

	/**
	 * Returns the meta object for class '{@link SecurityPIM.LogicalOperator <em>Logical Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Operator</em>'.
	 * @see SecurityPIM.LogicalOperator
	 * @generated
	 */
	EClass getLogicalOperator();

	/**
	 * Returns the meta object for the attribute '{@link SecurityPIM.LogicalOperator#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see SecurityPIM.LogicalOperator#getOperator()
	 * @see #getLogicalOperator()
	 * @generated
	 */
	EAttribute getLogicalOperator_Operator();

	/**
	 * Returns the meta object for class '{@link SecurityPIM.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see SecurityPIM.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the containment reference '{@link SecurityPIM.User#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Username</em>'.
	 * @see SecurityPIM.User#getUsername()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Username();

	/**
	 * Returns the meta object for class '{@link SecurityPIM.CurrentUser <em>Current User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Current User</em>'.
	 * @see SecurityPIM.CurrentUser
	 * @generated
	 */
	EClass getCurrentUser();

	/**
	 * Returns the meta object for class '{@link SecurityPIM.Username <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Username</em>'.
	 * @see SecurityPIM.Username
	 * @generated
	 */
	EClass getUsername();

	/**
	 * Returns the meta object for enum '{@link SecurityPIM.PermissionType <em>Permission Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Permission Type</em>'.
	 * @see SecurityPIM.PermissionType
	 * @generated
	 */
	EEnum getPermissionType();

	/**
	 * Returns the meta object for enum '{@link SecurityPIM.ListOperator <em>List Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>List Operator</em>'.
	 * @see SecurityPIM.ListOperator
	 * @generated
	 */
	EEnum getListOperator();

	/**
	 * Returns the meta object for enum '{@link SecurityPIM.StringOperator <em>String Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>String Operator</em>'.
	 * @see SecurityPIM.StringOperator
	 * @generated
	 */
	EEnum getStringOperator();

	/**
	 * Returns the meta object for enum '{@link SecurityPIM.RelationalOperator <em>Relational Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relational Operator</em>'.
	 * @see SecurityPIM.RelationalOperator
	 * @generated
	 */
	EEnum getRelationalOperator();

	/**
	 * Returns the meta object for enum '{@link SecurityPIM.UnaryOperator <em>Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unary Operator</em>'.
	 * @see SecurityPIM.UnaryOperator
	 * @generated
	 */
	EEnum getUnaryOperator();

	/**
	 * Returns the meta object for enum '{@link SecurityPIM.LogicalOperatorType <em>Logical Operator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Logical Operator Type</em>'.
	 * @see SecurityPIM.LogicalOperatorType
	 * @generated
	 */
	EEnum getLogicalOperatorType();

	/**
	 * Returns the meta object for enum '{@link SecurityPIM.PermissionMode <em>Permission Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Permission Mode</em>'.
	 * @see SecurityPIM.PermissionMode
	 * @generated
	 */
	EEnum getPermissionMode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SecurityPIMMetamodelFactory getSecurityPIMMetamodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link SecurityPIM.impl.AuthenticationImpl <em>Authentication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SecurityPIM.impl.AuthenticationImpl
		 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getAuthentication()
		 * @generated
		 */
		EClass AUTHENTICATION = eINSTANCE.getAuthentication();

		/**
		 * The meta object literal for the '<em><b>Current User</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AUTHENTICATION___CURRENT_USER = eINSTANCE.getAuthentication__CurrentUser();

		/**
		 * The meta object literal for the '{@link SecurityPIM.impl.AuthorizationImpl <em>Authorization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SecurityPIM.impl.AuthorizationImpl
		 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getAuthorization()
		 * @generated
		 */
		EClass AUTHORIZATION = eINSTANCE.getAuthorization();

		/**
		 * The meta object literal for the '{@link SecurityPIM.impl.DecentralAuthImpl <em>Decentral Auth</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SecurityPIM.impl.DecentralAuthImpl
		 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getDecentralAuth()
		 * @generated
		 */
		EClass DECENTRAL_AUTH = eINSTANCE.getDecentralAuth();

		/**
		 * The meta object literal for the '<em><b>Authorization</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECENTRAL_AUTH__AUTHORIZATION = eINSTANCE.getDecentralAuth_Authorization();

		/**
		 * The meta object literal for the '{@link SecurityPIM.impl.CenteralAuthImpl <em>Centeral Auth</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SecurityPIM.impl.CenteralAuthImpl
		 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getCenteralAuth()
		 * @generated
		 */
		EClass CENTERAL_AUTH = eINSTANCE.getCenteralAuth();

		/**
		 * The meta object literal for the '<em><b>Uaa</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CENTERAL_AUTH__UAA = eINSTANCE.getCenteralAuth_Uaa();

		/**
		 * The meta object literal for the '{@link SecurityPIM.impl.UAAImpl <em>UAA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SecurityPIM.impl.UAAImpl
		 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getUAA()
		 * @generated
		 */
		EClass UAA = eINSTANCE.getUAA();

		/**
		 * The meta object literal for the '{@link SecurityPIM.impl.OAuth2Impl <em>OAuth2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SecurityPIM.impl.OAuth2Impl
		 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getOAuth2()
		 * @generated
		 */
		EClass OAUTH2 = eINSTANCE.getOAuth2();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH2__TOKEN = eINSTANCE.getOAuth2_Token();

		/**
		 * The meta object literal for the '{@link SecurityPIM.impl.BasicImpl <em>Basic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SecurityPIM.impl.BasicImpl
		 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getBasic()
		 * @generated
		 */
		EClass BASIC = eINSTANCE.getBasic();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC__USERNAME = eINSTANCE.getBasic_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC__PASSWORD = eINSTANCE.getBasic_Password();

		/**
		 * The meta object literal for the '{@link SecurityPIM.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SecurityPIM.impl.RoleImpl
		 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Permission</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__PERMISSION = eINSTANCE.getRole_Permission();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__NAME = eINSTANCE.getRole_Name();

		/**
		 * The meta object literal for the '<em><b>Permission Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__PERMISSION_MODE = eINSTANCE.getRole_PermissionMode();

		/**
		 * The meta object literal for the '{@link SecurityPIM.impl.PermissionImpl <em>Permission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SecurityPIM.impl.PermissionImpl
		 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getPermission()
		 * @generated
		 */
		EClass PERMISSION = eINSTANCE.getPermission();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERMISSION__CONSTRAINT = eINSTANCE.getPermission_Constraint();

		/**
		 * The meta object literal for the '<em><b>Permission Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMISSION__PERMISSION_TYPE = eINSTANCE.getPermission_PermissionType();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERMISSION__ACTIVITY = eINSTANCE.getPermission_Activity();

		/**
		 * The meta object literal for the '{@link SecurityPIM.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SecurityPIM.impl.ConstraintImpl
		 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Constraintoperator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__CONSTRAINTOPERATOR = eINSTANCE.getConstraint_Constraintoperator();

		/**
		 * The meta object literal for the '<em><b>Logicaloperators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__LOGICALOPERATORS = eINSTANCE.getConstraint_Logicaloperators();

		/**
		 * The meta object literal for the '{@link SecurityPIM.impl.ConstraintOperatorImpl <em>Constraint Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SecurityPIM.impl.ConstraintOperatorImpl
		 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getConstraintOperator()
		 * @generated
		 */
		EClass CONSTRAINT_OPERATOR = eINSTANCE.getConstraintOperator();

		/**
		 * The meta object literal for the '<em><b>Right Operand</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_OPERATOR__RIGHT_OPERAND = eINSTANCE.getConstraintOperator_RightOperand();

		/**
		 * The meta object literal for the '{@link SecurityPIM.impl.OnePropertyOperatorImpl <em>One Property Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SecurityPIM.impl.OnePropertyOperatorImpl
		 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getOnePropertyOperator()
		 * @generated
		 */
		EClass ONE_PROPERTY_OPERATOR = eINSTANCE.getOnePropertyOperator();

		/**
		 * The meta object literal for the '{@link SecurityPIM.impl.TwoPropertyOperatorImpl <em>Two Property Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SecurityPIM.impl.TwoPropertyOperatorImpl
		 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getTwoPropertyOperator()
		 * @generated
		 */
		EClass TWO_PROPERTY_OPERATOR = eINSTANCE.getTwoPropertyOperator();

		/**
		 * The meta object literal for the '<em><b>Left Operand</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TWO_PROPERTY_OPERATOR__LEFT_OPERAND = eINSTANCE.getTwoPropertyOperator_LeftOperand();

		/**
		 * The meta object literal for the '{@link SecurityPIM.impl.OneRelationalOperatorImpl <em>One Relational Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SecurityPIM.impl.OneRelationalOperatorImpl
		 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getOneRelationalOperator()
		 * @generated
		 */
		EClass ONE_RELATIONAL_OPERATOR = eINSTANCE.getOneRelationalOperator();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONE_RELATIONAL_OPERATOR__VALUE = eINSTANCE.getOneRelationalOperator_Value();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONE_RELATIONAL_OPERATOR__OPERATOR = eINSTANCE.getOneRelationalOperator_Operator();

		/**
		 * The meta object literal for the '{@link SecurityPIM.impl.OneListOperatorImpl <em>One List Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SecurityPIM.impl.OneListOperatorImpl
		 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getOneListOperator()
		 * @generated
		 */
		EClass ONE_LIST_OPERATOR = eINSTANCE.getOneListOperator();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONE_LIST_OPERATOR__VALUE = eINSTANCE.getOneListOperator_Value();

		/**
		 * The meta object literal for the '<em><b>List Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONE_LIST_OPERATOR__LIST_OPERATOR = eINSTANCE.getOneListOperator_ListOperator();

		/**
		 * The meta object literal for the '{@link SecurityPIM.impl.OneStringOperatorImpl <em>One String Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SecurityPIM.impl.OneStringOperatorImpl
		 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getOneStringOperator()
		 * @generated
		 */
		EClass ONE_STRING_OPERATOR = eINSTANCE.getOneStringOperator();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONE_STRING_OPERATOR__VALUE = eINSTANCE.getOneStringOperator_Value();

		/**
		 * The meta object literal for the '<em><b>String Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONE_STRING_OPERATOR__STRING_OPERATOR = eINSTANCE.getOneStringOperator_StringOperator();

		/**
		 * The meta object literal for the '{@link SecurityPIM.impl.OneUnaryOperatorImpl <em>One Unary Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SecurityPIM.impl.OneUnaryOperatorImpl
		 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getOneUnaryOperator()
		 * @generated
		 */
		EClass ONE_UNARY_OPERATOR = eINSTANCE.getOneUnaryOperator();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONE_UNARY_OPERATOR__OPERATOR = eINSTANCE.getOneUnaryOperator_Operator();

		/**
		 * The meta object literal for the '{@link SecurityPIM.impl.OneBooleanOperatorImpl <em>One Boolean Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SecurityPIM.impl.OneBooleanOperatorImpl
		 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getOneBooleanOperator()
		 * @generated
		 */
		EClass ONE_BOOLEAN_OPERATOR = eINSTANCE.getOneBooleanOperator();

		/**
		 * The meta object literal for the '{@link SecurityPIM.impl.TwoListOperatorImpl <em>Two List Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SecurityPIM.impl.TwoListOperatorImpl
		 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getTwoListOperator()
		 * @generated
		 */
		EClass TWO_LIST_OPERATOR = eINSTANCE.getTwoListOperator();

		/**
		 * The meta object literal for the '<em><b>List Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWO_LIST_OPERATOR__LIST_OPERATOR = eINSTANCE.getTwoListOperator_ListOperator();

		/**
		 * The meta object literal for the '{@link SecurityPIM.impl.TwoRelationalOperatorImpl <em>Two Relational Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SecurityPIM.impl.TwoRelationalOperatorImpl
		 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getTwoRelationalOperator()
		 * @generated
		 */
		EClass TWO_RELATIONAL_OPERATOR = eINSTANCE.getTwoRelationalOperator();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWO_RELATIONAL_OPERATOR__OPERATOR = eINSTANCE.getTwoRelationalOperator_Operator();

		/**
		 * The meta object literal for the '{@link SecurityPIM.impl.TwoStringOperatorImpl <em>Two String Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SecurityPIM.impl.TwoStringOperatorImpl
		 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getTwoStringOperator()
		 * @generated
		 */
		EClass TWO_STRING_OPERATOR = eINSTANCE.getTwoStringOperator();

		/**
		 * The meta object literal for the '<em><b>String Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TWO_STRING_OPERATOR__STRING_OPERATOR = eINSTANCE.getTwoStringOperator_StringOperator();

		/**
		 * The meta object literal for the '{@link SecurityPIM.impl.LogicalOperatorImpl <em>Logical Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SecurityPIM.impl.LogicalOperatorImpl
		 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getLogicalOperator()
		 * @generated
		 */
		EClass LOGICAL_OPERATOR = eINSTANCE.getLogicalOperator();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_OPERATOR__OPERATOR = eINSTANCE.getLogicalOperator_Operator();

		/**
		 * The meta object literal for the '{@link SecurityPIM.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SecurityPIM.impl.UserImpl
		 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__USERNAME = eINSTANCE.getUser_Username();

		/**
		 * The meta object literal for the '{@link SecurityPIM.impl.CurrentUserImpl <em>Current User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SecurityPIM.impl.CurrentUserImpl
		 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getCurrentUser()
		 * @generated
		 */
		EClass CURRENT_USER = eINSTANCE.getCurrentUser();

		/**
		 * The meta object literal for the '{@link SecurityPIM.impl.UsernameImpl <em>Username</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SecurityPIM.impl.UsernameImpl
		 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getUsername()
		 * @generated
		 */
		EClass USERNAME = eINSTANCE.getUsername();

		/**
		 * The meta object literal for the '{@link SecurityPIM.PermissionType <em>Permission Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SecurityPIM.PermissionType
		 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getPermissionType()
		 * @generated
		 */
		EEnum PERMISSION_TYPE = eINSTANCE.getPermissionType();

		/**
		 * The meta object literal for the '{@link SecurityPIM.ListOperator <em>List Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SecurityPIM.ListOperator
		 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getListOperator()
		 * @generated
		 */
		EEnum LIST_OPERATOR = eINSTANCE.getListOperator();

		/**
		 * The meta object literal for the '{@link SecurityPIM.StringOperator <em>String Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SecurityPIM.StringOperator
		 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getStringOperator()
		 * @generated
		 */
		EEnum STRING_OPERATOR = eINSTANCE.getStringOperator();

		/**
		 * The meta object literal for the '{@link SecurityPIM.RelationalOperator <em>Relational Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SecurityPIM.RelationalOperator
		 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getRelationalOperator()
		 * @generated
		 */
		EEnum RELATIONAL_OPERATOR = eINSTANCE.getRelationalOperator();

		/**
		 * The meta object literal for the '{@link SecurityPIM.UnaryOperator <em>Unary Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SecurityPIM.UnaryOperator
		 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getUnaryOperator()
		 * @generated
		 */
		EEnum UNARY_OPERATOR = eINSTANCE.getUnaryOperator();

		/**
		 * The meta object literal for the '{@link SecurityPIM.LogicalOperatorType <em>Logical Operator Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SecurityPIM.LogicalOperatorType
		 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getLogicalOperatorType()
		 * @generated
		 */
		EEnum LOGICAL_OPERATOR_TYPE = eINSTANCE.getLogicalOperatorType();

		/**
		 * The meta object literal for the '{@link SecurityPIM.PermissionMode <em>Permission Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SecurityPIM.PermissionMode
		 * @see SecurityPIM.impl.SecurityPIMMetamodelPackageImpl#getPermissionMode()
		 * @generated
		 */
		EEnum PERMISSION_MODE = eINSTANCE.getPermissionMode();

	}

} //SecurityPIMMetamodelPackage
