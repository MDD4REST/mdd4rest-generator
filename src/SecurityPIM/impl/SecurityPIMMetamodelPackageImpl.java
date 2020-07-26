/**
 */
package SecurityPIM.impl;

import QueryPIM.QueryPIMMetamodelPackage;

import QueryPIM.impl.QueryPIMMetamodelPackageImpl;

import SecurityPIM.Authentication;
import SecurityPIM.Authorization;
import SecurityPIM.Basic;
import SecurityPIM.CenteralAuth;
import SecurityPIM.Constraint;
import SecurityPIM.ConstraintOperator;
import SecurityPIM.CurrentUser;
import SecurityPIM.DecentralAuth;
import SecurityPIM.ListOperator;
import SecurityPIM.LogicalOperator;
import SecurityPIM.LogicalOperatorType;
import SecurityPIM.OAuth2;
import SecurityPIM.OneBooleanOperator;
import SecurityPIM.OneListOperator;
import SecurityPIM.OnePropertyOperator;
import SecurityPIM.OneRelationalOperator;
import SecurityPIM.OneStringOperator;
import SecurityPIM.OneUnaryOperator;
import SecurityPIM.Permission;
import SecurityPIM.PermissionMode;
import SecurityPIM.PermissionType;
import SecurityPIM.RelationalOperator;
import SecurityPIM.Role;
import SecurityPIM.SecurityPIMMetamodelFactory;
import SecurityPIM.SecurityPIMMetamodelPackage;
import SecurityPIM.StringOperator;
import SecurityPIM.TwoListOperator;
import SecurityPIM.TwoPropertyOperator;
import SecurityPIM.TwoRelationalOperator;
import SecurityPIM.TwoStringOperator;
import SecurityPIM.UnaryOperator;

import SecurityPIM.User;
import SecurityPIM.Username;
import ServicePIM.ServicePIMPackage;

import ServicePIM.impl.ServicePIMPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SecurityPIMMetamodelPackageImpl extends EPackageImpl implements SecurityPIMMetamodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authenticationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decentralAuthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass centeralAuthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uaaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oAuth2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permissionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onePropertyOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass twoPropertyOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oneRelationalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oneListOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oneStringOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oneUnaryOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oneBooleanOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass twoListOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass twoRelationalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass twoStringOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currentUserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usernameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum permissionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum listOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stringOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relationalOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unaryOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum logicalOperatorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum permissionModeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see SecurityPIM.SecurityPIMMetamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SecurityPIMMetamodelPackageImpl() {
		super(eNS_URI, SecurityPIMMetamodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SecurityPIMMetamodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SecurityPIMMetamodelPackage init() {
		if (isInited) return (SecurityPIMMetamodelPackage)EPackage.Registry.INSTANCE.getEPackage(SecurityPIMMetamodelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSecurityPIMMetamodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SecurityPIMMetamodelPackageImpl theSecurityPIMMetamodelPackage = registeredSecurityPIMMetamodelPackage instanceof SecurityPIMMetamodelPackageImpl ? (SecurityPIMMetamodelPackageImpl)registeredSecurityPIMMetamodelPackage : new SecurityPIMMetamodelPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ServicePIMPackage.eNS_URI);
		ServicePIMPackageImpl theServicePIMPackage = (ServicePIMPackageImpl)(registeredPackage instanceof ServicePIMPackageImpl ? registeredPackage : ServicePIMPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(QueryPIMMetamodelPackage.eNS_URI);
		QueryPIMMetamodelPackageImpl theQueryPIMMetamodelPackage = (QueryPIMMetamodelPackageImpl)(registeredPackage instanceof QueryPIMMetamodelPackageImpl ? registeredPackage : QueryPIMMetamodelPackage.eINSTANCE);

		// Create package meta-data objects
		theSecurityPIMMetamodelPackage.createPackageContents();
		theServicePIMPackage.createPackageContents();
		theQueryPIMMetamodelPackage.createPackageContents();

		// Initialize created meta-data
		theSecurityPIMMetamodelPackage.initializePackageContents();
		theServicePIMPackage.initializePackageContents();
		theQueryPIMMetamodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSecurityPIMMetamodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SecurityPIMMetamodelPackage.eNS_URI, theSecurityPIMMetamodelPackage);
		return theSecurityPIMMetamodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuthentication() {
		return authenticationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAuthentication__CurrentUser() {
		return authenticationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuthorization() {
		return authorizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDecentralAuth() {
		return decentralAuthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDecentralAuth_Authorization() {
		return (EReference)decentralAuthEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCenteralAuth() {
		return centeralAuthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCenteralAuth_Uaa() {
		return (EReference)centeralAuthEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUAA() {
		return uaaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOAuth2() {
		return oAuth2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOAuth2_Token() {
		return (EAttribute)oAuth2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBasic() {
		return basicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasic_Username() {
		return (EAttribute)basicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasic_Password() {
		return (EAttribute)basicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_Permission() {
		return (EReference)roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRole_Name() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRole_PermissionMode() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPermission() {
		return permissionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPermission_Constraint() {
		return (EReference)permissionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPermission_PermissionType() {
		return (EAttribute)permissionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPermission_Activity() {
		return (EReference)permissionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConstraint_Constraintoperator() {
		return (EReference)constraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConstraint_Logicaloperators() {
		return (EReference)constraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConstraintOperator() {
		return constraintOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConstraintOperator_RightOperand() {
		return (EReference)constraintOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOnePropertyOperator() {
		return onePropertyOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTwoPropertyOperator() {
		return twoPropertyOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTwoPropertyOperator_LeftOperand() {
		return (EReference)twoPropertyOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOneRelationalOperator() {
		return oneRelationalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOneRelationalOperator_Value() {
		return (EAttribute)oneRelationalOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOneRelationalOperator_Operator() {
		return (EAttribute)oneRelationalOperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOneListOperator() {
		return oneListOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOneListOperator_Value() {
		return (EAttribute)oneListOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOneListOperator_ListOperator() {
		return (EAttribute)oneListOperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOneStringOperator() {
		return oneStringOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOneStringOperator_Value() {
		return (EAttribute)oneStringOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOneStringOperator_StringOperator() {
		return (EAttribute)oneStringOperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOneUnaryOperator() {
		return oneUnaryOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOneUnaryOperator_Operator() {
		return (EAttribute)oneUnaryOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOneBooleanOperator() {
		return oneBooleanOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTwoListOperator() {
		return twoListOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTwoListOperator_ListOperator() {
		return (EAttribute)twoListOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTwoRelationalOperator() {
		return twoRelationalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTwoRelationalOperator_Operator() {
		return (EAttribute)twoRelationalOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTwoStringOperator() {
		return twoStringOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTwoStringOperator_StringOperator() {
		return (EAttribute)twoStringOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLogicalOperator() {
		return logicalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLogicalOperator_Operator() {
		return (EAttribute)logicalOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUser_Username() {
		return (EReference)userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCurrentUser() {
		return currentUserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUsername() {
		return usernameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPermissionType() {
		return permissionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getListOperator() {
		return listOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getStringOperator() {
		return stringOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRelationalOperator() {
		return relationalOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getUnaryOperator() {
		return unaryOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLogicalOperatorType() {
		return logicalOperatorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPermissionMode() {
		return permissionModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityPIMMetamodelFactory getSecurityPIMMetamodelFactory() {
		return (SecurityPIMMetamodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		authenticationEClass = createEClass(AUTHENTICATION);
		createEOperation(authenticationEClass, AUTHENTICATION___CURRENT_USER);

		authorizationEClass = createEClass(AUTHORIZATION);

		decentralAuthEClass = createEClass(DECENTRAL_AUTH);
		createEReference(decentralAuthEClass, DECENTRAL_AUTH__AUTHORIZATION);

		centeralAuthEClass = createEClass(CENTERAL_AUTH);
		createEReference(centeralAuthEClass, CENTERAL_AUTH__UAA);

		uaaEClass = createEClass(UAA);

		oAuth2EClass = createEClass(OAUTH2);
		createEAttribute(oAuth2EClass, OAUTH2__TOKEN);

		basicEClass = createEClass(BASIC);
		createEAttribute(basicEClass, BASIC__USERNAME);
		createEAttribute(basicEClass, BASIC__PASSWORD);

		roleEClass = createEClass(ROLE);
		createEReference(roleEClass, ROLE__PERMISSION);
		createEAttribute(roleEClass, ROLE__NAME);
		createEAttribute(roleEClass, ROLE__PERMISSION_MODE);

		permissionEClass = createEClass(PERMISSION);
		createEReference(permissionEClass, PERMISSION__CONSTRAINT);
		createEAttribute(permissionEClass, PERMISSION__PERMISSION_TYPE);
		createEReference(permissionEClass, PERMISSION__ACTIVITY);

		constraintEClass = createEClass(CONSTRAINT);
		createEReference(constraintEClass, CONSTRAINT__CONSTRAINTOPERATOR);
		createEReference(constraintEClass, CONSTRAINT__LOGICALOPERATORS);

		constraintOperatorEClass = createEClass(CONSTRAINT_OPERATOR);
		createEReference(constraintOperatorEClass, CONSTRAINT_OPERATOR__RIGHT_OPERAND);

		onePropertyOperatorEClass = createEClass(ONE_PROPERTY_OPERATOR);

		twoPropertyOperatorEClass = createEClass(TWO_PROPERTY_OPERATOR);
		createEReference(twoPropertyOperatorEClass, TWO_PROPERTY_OPERATOR__LEFT_OPERAND);

		oneRelationalOperatorEClass = createEClass(ONE_RELATIONAL_OPERATOR);
		createEAttribute(oneRelationalOperatorEClass, ONE_RELATIONAL_OPERATOR__VALUE);
		createEAttribute(oneRelationalOperatorEClass, ONE_RELATIONAL_OPERATOR__OPERATOR);

		oneListOperatorEClass = createEClass(ONE_LIST_OPERATOR);
		createEAttribute(oneListOperatorEClass, ONE_LIST_OPERATOR__VALUE);
		createEAttribute(oneListOperatorEClass, ONE_LIST_OPERATOR__LIST_OPERATOR);

		oneStringOperatorEClass = createEClass(ONE_STRING_OPERATOR);
		createEAttribute(oneStringOperatorEClass, ONE_STRING_OPERATOR__VALUE);
		createEAttribute(oneStringOperatorEClass, ONE_STRING_OPERATOR__STRING_OPERATOR);

		oneUnaryOperatorEClass = createEClass(ONE_UNARY_OPERATOR);
		createEAttribute(oneUnaryOperatorEClass, ONE_UNARY_OPERATOR__OPERATOR);

		oneBooleanOperatorEClass = createEClass(ONE_BOOLEAN_OPERATOR);

		twoListOperatorEClass = createEClass(TWO_LIST_OPERATOR);
		createEAttribute(twoListOperatorEClass, TWO_LIST_OPERATOR__LIST_OPERATOR);

		twoRelationalOperatorEClass = createEClass(TWO_RELATIONAL_OPERATOR);
		createEAttribute(twoRelationalOperatorEClass, TWO_RELATIONAL_OPERATOR__OPERATOR);

		twoStringOperatorEClass = createEClass(TWO_STRING_OPERATOR);
		createEAttribute(twoStringOperatorEClass, TWO_STRING_OPERATOR__STRING_OPERATOR);

		logicalOperatorEClass = createEClass(LOGICAL_OPERATOR);
		createEAttribute(logicalOperatorEClass, LOGICAL_OPERATOR__OPERATOR);

		userEClass = createEClass(USER);
		createEReference(userEClass, USER__USERNAME);

		currentUserEClass = createEClass(CURRENT_USER);

		usernameEClass = createEClass(USERNAME);

		// Create enums
		permissionTypeEEnum = createEEnum(PERMISSION_TYPE);
		listOperatorEEnum = createEEnum(LIST_OPERATOR);
		stringOperatorEEnum = createEEnum(STRING_OPERATOR);
		relationalOperatorEEnum = createEEnum(RELATIONAL_OPERATOR);
		unaryOperatorEEnum = createEEnum(UNARY_OPERATOR);
		logicalOperatorTypeEEnum = createEEnum(LOGICAL_OPERATOR_TYPE);
		permissionModeEEnum = createEEnum(PERMISSION_MODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ServicePIMPackage theServicePIMPackage = (ServicePIMPackage)EPackage.Registry.INSTANCE.getEPackage(ServicePIMPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		decentralAuthEClass.getESuperTypes().add(this.getAuthentication());
		centeralAuthEClass.getESuperTypes().add(this.getAuthentication());
		oAuth2EClass.getESuperTypes().add(this.getAuthorization());
		basicEClass.getESuperTypes().add(this.getAuthorization());
		onePropertyOperatorEClass.getESuperTypes().add(this.getConstraintOperator());
		twoPropertyOperatorEClass.getESuperTypes().add(this.getConstraintOperator());
		oneRelationalOperatorEClass.getESuperTypes().add(this.getOnePropertyOperator());
		oneListOperatorEClass.getESuperTypes().add(this.getOnePropertyOperator());
		oneStringOperatorEClass.getESuperTypes().add(this.getOnePropertyOperator());
		oneUnaryOperatorEClass.getESuperTypes().add(this.getOnePropertyOperator());
		oneBooleanOperatorEClass.getESuperTypes().add(this.getOnePropertyOperator());
		twoListOperatorEClass.getESuperTypes().add(this.getTwoPropertyOperator());
		twoRelationalOperatorEClass.getESuperTypes().add(this.getTwoPropertyOperator());
		twoStringOperatorEClass.getESuperTypes().add(this.getTwoPropertyOperator());
		userEClass.getESuperTypes().add(theServicePIMPackage.getResource());
		currentUserEClass.getESuperTypes().add(this.getUser());
		usernameEClass.getESuperTypes().add(theServicePIMPackage.getProperty());

		// Initialize classes, features, and operations; add parameters
		initEClass(authenticationEClass, Authentication.class, "Authentication", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getAuthentication__CurrentUser(), this.getUser(), "currentUser", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(authorizationEClass, Authorization.class, "Authorization", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(decentralAuthEClass, DecentralAuth.class, "DecentralAuth", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDecentralAuth_Authorization(), this.getAuthorization(), null, "authorization", null, 0, -1, DecentralAuth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(centeralAuthEClass, CenteralAuth.class, "CenteralAuth", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCenteralAuth_Uaa(), this.getUAA(), null, "uaa", null, 1, 1, CenteralAuth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uaaEClass, SecurityPIM.UAA.class, "UAA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(oAuth2EClass, OAuth2.class, "OAuth2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOAuth2_Token(), ecorePackage.getEString(), "token", null, 1, 1, OAuth2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicEClass, Basic.class, "Basic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBasic_Username(), ecorePackage.getEString(), "username", null, 1, 1, Basic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasic_Password(), ecorePackage.getEString(), "password", null, 1, 1, Basic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_Permission(), this.getPermission(), null, "permission", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRole_Name(), ecorePackage.getEString(), "name", null, 1, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRole_PermissionMode(), this.getPermissionMode(), "permissionMode", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(permissionEClass, Permission.class, "Permission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPermission_Constraint(), this.getConstraint(), null, "constraint", null, 0, -1, Permission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPermission_PermissionType(), this.getPermissionType(), "permissionType", null, 0, 1, Permission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPermission_Activity(), theServicePIMPackage.getActivity(), null, "activity", null, 1, -1, Permission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraint_Constraintoperator(), this.getConstraintOperator(), null, "constraintoperator", null, 0, -1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraint_Logicaloperators(), this.getLogicalOperator(), null, "logicaloperators", null, 0, -1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintOperatorEClass, ConstraintOperator.class, "ConstraintOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraintOperator_RightOperand(), theServicePIMPackage.getProperty(), null, "rightOperand", null, 0, 1, ConstraintOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(onePropertyOperatorEClass, OnePropertyOperator.class, "OnePropertyOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(twoPropertyOperatorEClass, TwoPropertyOperator.class, "TwoPropertyOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTwoPropertyOperator_LeftOperand(), theServicePIMPackage.getProperty(), null, "leftOperand", null, 0, 1, TwoPropertyOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oneRelationalOperatorEClass, OneRelationalOperator.class, "OneRelationalOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOneRelationalOperator_Value(), ecorePackage.getEString(), "value", null, 0, 1, OneRelationalOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOneRelationalOperator_Operator(), this.getRelationalOperator(), "operator", null, 1, 1, OneRelationalOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oneListOperatorEClass, OneListOperator.class, "OneListOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOneListOperator_Value(), ecorePackage.getEString(), "value", null, 0, 1, OneListOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOneListOperator_ListOperator(), this.getListOperator(), "ListOperator", null, 1, 1, OneListOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oneStringOperatorEClass, OneStringOperator.class, "OneStringOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOneStringOperator_Value(), ecorePackage.getEString(), "value", null, 0, 1, OneStringOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOneStringOperator_StringOperator(), this.getStringOperator(), "StringOperator", null, 1, 1, OneStringOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oneUnaryOperatorEClass, OneUnaryOperator.class, "OneUnaryOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOneUnaryOperator_Operator(), this.getUnaryOperator(), "operator", null, 1, 1, OneUnaryOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oneBooleanOperatorEClass, OneBooleanOperator.class, "OneBooleanOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(twoListOperatorEClass, TwoListOperator.class, "TwoListOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTwoListOperator_ListOperator(), this.getListOperator(), "ListOperator", null, 1, 1, TwoListOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(twoRelationalOperatorEClass, TwoRelationalOperator.class, "TwoRelationalOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTwoRelationalOperator_Operator(), this.getRelationalOperator(), "operator", null, 1, 1, TwoRelationalOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(twoStringOperatorEClass, TwoStringOperator.class, "TwoStringOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTwoStringOperator_StringOperator(), this.getStringOperator(), "StringOperator", null, 1, 1, TwoStringOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicalOperatorEClass, LogicalOperator.class, "LogicalOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLogicalOperator_Operator(), this.getLogicalOperatorType(), "operator", null, 0, 1, LogicalOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUser_Username(), this.getUsername(), null, "username", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(currentUserEClass, CurrentUser.class, "CurrentUser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(usernameEClass, Username.class, "Username", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(permissionTypeEEnum, PermissionType.class, "PermissionType");
		addEEnumLiteral(permissionTypeEEnum, PermissionType.ALLOW);
		addEEnumLiteral(permissionTypeEEnum, PermissionType.DENY);

		initEEnum(listOperatorEEnum, ListOperator.class, "ListOperator");
		addEEnumLiteral(listOperatorEEnum, ListOperator.CONTAINS);
		addEEnumLiteral(listOperatorEEnum, ListOperator.CONTAINS_ALL);

		initEEnum(stringOperatorEEnum, StringOperator.class, "StringOperator");
		addEEnumLiteral(stringOperatorEEnum, StringOperator.CONTAINS);
		addEEnumLiteral(stringOperatorEEnum, StringOperator.MATHCES);
		addEEnumLiteral(stringOperatorEEnum, StringOperator.EQIC);
		addEEnumLiteral(stringOperatorEEnum, StringOperator.STARTS_WITH);
		addEEnumLiteral(stringOperatorEEnum, StringOperator.ENDS_WITH);

		initEEnum(relationalOperatorEEnum, RelationalOperator.class, "RelationalOperator");
		addEEnumLiteral(relationalOperatorEEnum, RelationalOperator.EQ);
		addEEnumLiteral(relationalOperatorEEnum, RelationalOperator.NEQ);
		addEEnumLiteral(relationalOperatorEEnum, RelationalOperator.GT);
		addEEnumLiteral(relationalOperatorEEnum, RelationalOperator.LT);
		addEEnumLiteral(relationalOperatorEEnum, RelationalOperator.GTE);
		addEEnumLiteral(relationalOperatorEEnum, RelationalOperator.LTE);

		initEEnum(unaryOperatorEEnum, UnaryOperator.class, "UnaryOperator");
		addEEnumLiteral(unaryOperatorEEnum, UnaryOperator.IS_EMPTY);

		initEEnum(logicalOperatorTypeEEnum, LogicalOperatorType.class, "LogicalOperatorType");
		addEEnumLiteral(logicalOperatorTypeEEnum, LogicalOperatorType.AND);
		addEEnumLiteral(logicalOperatorTypeEEnum, LogicalOperatorType.OR);
		addEEnumLiteral(logicalOperatorTypeEEnum, LogicalOperatorType.XOR);
		addEEnumLiteral(logicalOperatorTypeEEnum, LogicalOperatorType.INVERSE);

		initEEnum(permissionModeEEnum, PermissionMode.class, "PermissionMode");
		addEEnumLiteral(permissionModeEEnum, PermissionMode.ALLOW_ALL_EXCEPT_PERMISSIONS);
		addEEnumLiteral(permissionModeEEnum, PermissionMode.DENY_ALL_EXCEPT_PERMISSIONS);

		// Create resource
		createResource(eNS_URI);
	}

} //SecurityPIMMetamodelPackageImpl
