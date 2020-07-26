/**
 */
package SecurityPIM.util;

import SecurityPIM.*;

import ServicePIM.Property;
import ServicePIM.Resource;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see SecurityPIM.SecurityPIMMetamodelPackage
 * @generated
 */
public class SecurityPIMMetamodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SecurityPIMMetamodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityPIMMetamodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SecurityPIMMetamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityPIMMetamodelSwitch<Adapter> modelSwitch =
		new SecurityPIMMetamodelSwitch<Adapter>() {
			@Override
			public Adapter caseAuthentication(Authentication object) {
				return createAuthenticationAdapter();
			}
			@Override
			public Adapter caseAuthorization(Authorization object) {
				return createAuthorizationAdapter();
			}
			@Override
			public Adapter caseDecentralAuth(DecentralAuth object) {
				return createDecentralAuthAdapter();
			}
			@Override
			public Adapter caseCenteralAuth(CenteralAuth object) {
				return createCenteralAuthAdapter();
			}
			@Override
			public Adapter caseUAA(UAA object) {
				return createUAAAdapter();
			}
			@Override
			public Adapter caseOAuth2(OAuth2 object) {
				return createOAuth2Adapter();
			}
			@Override
			public Adapter caseBasic(Basic object) {
				return createBasicAdapter();
			}
			@Override
			public Adapter caseRole(Role object) {
				return createRoleAdapter();
			}
			@Override
			public Adapter casePermission(Permission object) {
				return createPermissionAdapter();
			}
			@Override
			public Adapter caseConstraint(Constraint object) {
				return createConstraintAdapter();
			}
			@Override
			public Adapter caseConstraintOperator(ConstraintOperator object) {
				return createConstraintOperatorAdapter();
			}
			@Override
			public Adapter caseOnePropertyOperator(OnePropertyOperator object) {
				return createOnePropertyOperatorAdapter();
			}
			@Override
			public Adapter caseTwoPropertyOperator(TwoPropertyOperator object) {
				return createTwoPropertyOperatorAdapter();
			}
			@Override
			public Adapter caseOneRelationalOperator(OneRelationalOperator object) {
				return createOneRelationalOperatorAdapter();
			}
			@Override
			public Adapter caseOneListOperator(OneListOperator object) {
				return createOneListOperatorAdapter();
			}
			@Override
			public Adapter caseOneStringOperator(OneStringOperator object) {
				return createOneStringOperatorAdapter();
			}
			@Override
			public Adapter caseOneUnaryOperator(OneUnaryOperator object) {
				return createOneUnaryOperatorAdapter();
			}
			@Override
			public Adapter caseOneBooleanOperator(OneBooleanOperator object) {
				return createOneBooleanOperatorAdapter();
			}
			@Override
			public Adapter caseTwoListOperator(TwoListOperator object) {
				return createTwoListOperatorAdapter();
			}
			@Override
			public Adapter caseTwoRelationalOperator(TwoRelationalOperator object) {
				return createTwoRelationalOperatorAdapter();
			}
			@Override
			public Adapter caseTwoStringOperator(TwoStringOperator object) {
				return createTwoStringOperatorAdapter();
			}
			@Override
			public Adapter caseLogicalOperator(LogicalOperator object) {
				return createLogicalOperatorAdapter();
			}
			@Override
			public Adapter caseUser(User object) {
				return createUserAdapter();
			}
			@Override
			public Adapter caseCurrentUser(CurrentUser object) {
				return createCurrentUserAdapter();
			}
			@Override
			public Adapter caseUsername(Username object) {
				return createUsernameAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link SecurityPIM.Authentication <em>Authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecurityPIM.Authentication
	 * @generated
	 */
	public Adapter createAuthenticationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecurityPIM.Authorization <em>Authorization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecurityPIM.Authorization
	 * @generated
	 */
	public Adapter createAuthorizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecurityPIM.DecentralAuth <em>Decentral Auth</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecurityPIM.DecentralAuth
	 * @generated
	 */
	public Adapter createDecentralAuthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecurityPIM.CenteralAuth <em>Centeral Auth</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecurityPIM.CenteralAuth
	 * @generated
	 */
	public Adapter createCenteralAuthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecurityPIM.UAA <em>UAA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecurityPIM.UAA
	 * @generated
	 */
	public Adapter createUAAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecurityPIM.OAuth2 <em>OAuth2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecurityPIM.OAuth2
	 * @generated
	 */
	public Adapter createOAuth2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecurityPIM.Basic <em>Basic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecurityPIM.Basic
	 * @generated
	 */
	public Adapter createBasicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecurityPIM.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecurityPIM.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecurityPIM.Permission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecurityPIM.Permission
	 * @generated
	 */
	public Adapter createPermissionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecurityPIM.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecurityPIM.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecurityPIM.ConstraintOperator <em>Constraint Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecurityPIM.ConstraintOperator
	 * @generated
	 */
	public Adapter createConstraintOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecurityPIM.OnePropertyOperator <em>One Property Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecurityPIM.OnePropertyOperator
	 * @generated
	 */
	public Adapter createOnePropertyOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecurityPIM.TwoPropertyOperator <em>Two Property Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecurityPIM.TwoPropertyOperator
	 * @generated
	 */
	public Adapter createTwoPropertyOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecurityPIM.OneRelationalOperator <em>One Relational Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecurityPIM.OneRelationalOperator
	 * @generated
	 */
	public Adapter createOneRelationalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecurityPIM.OneListOperator <em>One List Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecurityPIM.OneListOperator
	 * @generated
	 */
	public Adapter createOneListOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecurityPIM.OneStringOperator <em>One String Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecurityPIM.OneStringOperator
	 * @generated
	 */
	public Adapter createOneStringOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecurityPIM.OneUnaryOperator <em>One Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecurityPIM.OneUnaryOperator
	 * @generated
	 */
	public Adapter createOneUnaryOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecurityPIM.OneBooleanOperator <em>One Boolean Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecurityPIM.OneBooleanOperator
	 * @generated
	 */
	public Adapter createOneBooleanOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecurityPIM.TwoListOperator <em>Two List Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecurityPIM.TwoListOperator
	 * @generated
	 */
	public Adapter createTwoListOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecurityPIM.TwoRelationalOperator <em>Two Relational Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecurityPIM.TwoRelationalOperator
	 * @generated
	 */
	public Adapter createTwoRelationalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecurityPIM.TwoStringOperator <em>Two String Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecurityPIM.TwoStringOperator
	 * @generated
	 */
	public Adapter createTwoStringOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecurityPIM.LogicalOperator <em>Logical Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecurityPIM.LogicalOperator
	 * @generated
	 */
	public Adapter createLogicalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecurityPIM.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecurityPIM.User
	 * @generated
	 */
	public Adapter createUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecurityPIM.CurrentUser <em>Current User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecurityPIM.CurrentUser
	 * @generated
	 */
	public Adapter createCurrentUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SecurityPIM.Username <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SecurityPIM.Username
	 * @generated
	 */
	public Adapter createUsernameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePIM.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePIM.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePIM.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePIM.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SecurityPIMMetamodelAdapterFactory
