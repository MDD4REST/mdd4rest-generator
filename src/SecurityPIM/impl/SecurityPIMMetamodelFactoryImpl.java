/**
 */
package SecurityPIM.impl;

import SecurityPIM.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SecurityPIMMetamodelFactoryImpl extends EFactoryImpl implements SecurityPIMMetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SecurityPIMMetamodelFactory init() {
		try {
			SecurityPIMMetamodelFactory theSecurityPIMMetamodelFactory = (SecurityPIMMetamodelFactory)EPackage.Registry.INSTANCE.getEFactory(SecurityPIMMetamodelPackage.eNS_URI);
			if (theSecurityPIMMetamodelFactory != null) {
				return theSecurityPIMMetamodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SecurityPIMMetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityPIMMetamodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SecurityPIMMetamodelPackage.DECENTRAL_AUTH: return createDecentralAuth();
			case SecurityPIMMetamodelPackage.CENTERAL_AUTH: return createCenteralAuth();
			case SecurityPIMMetamodelPackage.UAA: return createUAA();
			case SecurityPIMMetamodelPackage.OAUTH2: return createOAuth2();
			case SecurityPIMMetamodelPackage.BASIC: return createBasic();
			case SecurityPIMMetamodelPackage.ROLE: return createRole();
			case SecurityPIMMetamodelPackage.PERMISSION: return createPermission();
			case SecurityPIMMetamodelPackage.CONSTRAINT: return createConstraint();
			case SecurityPIMMetamodelPackage.ONE_RELATIONAL_OPERATOR: return createOneRelationalOperator();
			case SecurityPIMMetamodelPackage.ONE_LIST_OPERATOR: return createOneListOperator();
			case SecurityPIMMetamodelPackage.ONE_STRING_OPERATOR: return createOneStringOperator();
			case SecurityPIMMetamodelPackage.ONE_UNARY_OPERATOR: return createOneUnaryOperator();
			case SecurityPIMMetamodelPackage.ONE_BOOLEAN_OPERATOR: return createOneBooleanOperator();
			case SecurityPIMMetamodelPackage.TWO_LIST_OPERATOR: return createTwoListOperator();
			case SecurityPIMMetamodelPackage.TWO_RELATIONAL_OPERATOR: return createTwoRelationalOperator();
			case SecurityPIMMetamodelPackage.TWO_STRING_OPERATOR: return createTwoStringOperator();
			case SecurityPIMMetamodelPackage.LOGICAL_OPERATOR: return createLogicalOperator();
			case SecurityPIMMetamodelPackage.USER: return createUser();
			case SecurityPIMMetamodelPackage.CURRENT_USER: return createCurrentUser();
			case SecurityPIMMetamodelPackage.USERNAME: return createUsername();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SecurityPIMMetamodelPackage.PERMISSION_TYPE:
				return createPermissionTypeFromString(eDataType, initialValue);
			case SecurityPIMMetamodelPackage.LIST_OPERATOR:
				return createListOperatorFromString(eDataType, initialValue);
			case SecurityPIMMetamodelPackage.STRING_OPERATOR:
				return createStringOperatorFromString(eDataType, initialValue);
			case SecurityPIMMetamodelPackage.RELATIONAL_OPERATOR:
				return createRelationalOperatorFromString(eDataType, initialValue);
			case SecurityPIMMetamodelPackage.UNARY_OPERATOR:
				return createUnaryOperatorFromString(eDataType, initialValue);
			case SecurityPIMMetamodelPackage.LOGICAL_OPERATOR_TYPE:
				return createLogicalOperatorTypeFromString(eDataType, initialValue);
			case SecurityPIMMetamodelPackage.PERMISSION_MODE:
				return createPermissionModeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SecurityPIMMetamodelPackage.PERMISSION_TYPE:
				return convertPermissionTypeToString(eDataType, instanceValue);
			case SecurityPIMMetamodelPackage.LIST_OPERATOR:
				return convertListOperatorToString(eDataType, instanceValue);
			case SecurityPIMMetamodelPackage.STRING_OPERATOR:
				return convertStringOperatorToString(eDataType, instanceValue);
			case SecurityPIMMetamodelPackage.RELATIONAL_OPERATOR:
				return convertRelationalOperatorToString(eDataType, instanceValue);
			case SecurityPIMMetamodelPackage.UNARY_OPERATOR:
				return convertUnaryOperatorToString(eDataType, instanceValue);
			case SecurityPIMMetamodelPackage.LOGICAL_OPERATOR_TYPE:
				return convertLogicalOperatorTypeToString(eDataType, instanceValue);
			case SecurityPIMMetamodelPackage.PERMISSION_MODE:
				return convertPermissionModeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DecentralAuth createDecentralAuth() {
		DecentralAuthImpl decentralAuth = new DecentralAuthImpl();
		return decentralAuth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CenteralAuth createCenteralAuth() {
		CenteralAuthImpl centeralAuth = new CenteralAuthImpl();
		return centeralAuth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UAA createUAA() {
		UAAImpl uaa = new UAAImpl();
		return uaa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OAuth2 createOAuth2() {
		OAuth2Impl oAuth2 = new OAuth2Impl();
		return oAuth2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Basic createBasic() {
		BasicImpl basic = new BasicImpl();
		return basic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Permission createPermission() {
		PermissionImpl permission = new PermissionImpl();
		return permission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OneRelationalOperator createOneRelationalOperator() {
		OneRelationalOperatorImpl oneRelationalOperator = new OneRelationalOperatorImpl();
		return oneRelationalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OneListOperator createOneListOperator() {
		OneListOperatorImpl oneListOperator = new OneListOperatorImpl();
		return oneListOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OneStringOperator createOneStringOperator() {
		OneStringOperatorImpl oneStringOperator = new OneStringOperatorImpl();
		return oneStringOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OneUnaryOperator createOneUnaryOperator() {
		OneUnaryOperatorImpl oneUnaryOperator = new OneUnaryOperatorImpl();
		return oneUnaryOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OneBooleanOperator createOneBooleanOperator() {
		OneBooleanOperatorImpl oneBooleanOperator = new OneBooleanOperatorImpl();
		return oneBooleanOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TwoListOperator createTwoListOperator() {
		TwoListOperatorImpl twoListOperator = new TwoListOperatorImpl();
		return twoListOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TwoRelationalOperator createTwoRelationalOperator() {
		TwoRelationalOperatorImpl twoRelationalOperator = new TwoRelationalOperatorImpl();
		return twoRelationalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TwoStringOperator createTwoStringOperator() {
		TwoStringOperatorImpl twoStringOperator = new TwoStringOperatorImpl();
		return twoStringOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicalOperator createLogicalOperator() {
		LogicalOperatorImpl logicalOperator = new LogicalOperatorImpl();
		return logicalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CurrentUser createCurrentUser() {
		CurrentUserImpl currentUser = new CurrentUserImpl();
		return currentUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Username createUsername() {
		UsernameImpl username = new UsernameImpl();
		return username;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermissionType createPermissionTypeFromString(EDataType eDataType, String initialValue) {
		PermissionType result = PermissionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPermissionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOperator createListOperatorFromString(EDataType eDataType, String initialValue) {
		ListOperator result = ListOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringOperator createStringOperatorFromString(EDataType eDataType, String initialValue) {
		StringOperator result = StringOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalOperator createRelationalOperatorFromString(EDataType eDataType, String initialValue) {
		RelationalOperator result = RelationalOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationalOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryOperator createUnaryOperatorFromString(EDataType eDataType, String initialValue) {
		UnaryOperator result = UnaryOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnaryOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalOperatorType createLogicalOperatorTypeFromString(EDataType eDataType, String initialValue) {
		LogicalOperatorType result = LogicalOperatorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLogicalOperatorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermissionMode createPermissionModeFromString(EDataType eDataType, String initialValue) {
		PermissionMode result = PermissionMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPermissionModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityPIMMetamodelPackage getSecurityPIMMetamodelPackage() {
		return (SecurityPIMMetamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SecurityPIMMetamodelPackage getPackage() {
		return SecurityPIMMetamodelPackage.eINSTANCE;
	}

} //SecurityPIMMetamodelFactoryImpl
