/**
 */
package SecurityPIM.util;

import SecurityPIM.*;

import ServicePIM.Property;
import ServicePIM.Resource;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see SecurityPIM.SecurityPIMMetamodelPackage
 * @generated
 */
public class SecurityPIMMetamodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SecurityPIMMetamodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityPIMMetamodelSwitch() {
		if (modelPackage == null) {
			modelPackage = SecurityPIMMetamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SecurityPIMMetamodelPackage.AUTHENTICATION: {
				Authentication authentication = (Authentication)theEObject;
				T result = caseAuthentication(authentication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPIMMetamodelPackage.AUTHORIZATION: {
				Authorization authorization = (Authorization)theEObject;
				T result = caseAuthorization(authorization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPIMMetamodelPackage.DECENTRAL_AUTH: {
				DecentralAuth decentralAuth = (DecentralAuth)theEObject;
				T result = caseDecentralAuth(decentralAuth);
				if (result == null) result = caseAuthentication(decentralAuth);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPIMMetamodelPackage.CENTERAL_AUTH: {
				CenteralAuth centeralAuth = (CenteralAuth)theEObject;
				T result = caseCenteralAuth(centeralAuth);
				if (result == null) result = caseAuthentication(centeralAuth);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPIMMetamodelPackage.UAA: {
				UAA uaa = (UAA)theEObject;
				T result = caseUAA(uaa);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPIMMetamodelPackage.OAUTH2: {
				OAuth2 oAuth2 = (OAuth2)theEObject;
				T result = caseOAuth2(oAuth2);
				if (result == null) result = caseAuthorization(oAuth2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPIMMetamodelPackage.BASIC: {
				Basic basic = (Basic)theEObject;
				T result = caseBasic(basic);
				if (result == null) result = caseAuthorization(basic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPIMMetamodelPackage.ROLE: {
				Role role = (Role)theEObject;
				T result = caseRole(role);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPIMMetamodelPackage.PERMISSION: {
				Permission permission = (Permission)theEObject;
				T result = casePermission(permission);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPIMMetamodelPackage.CONSTRAINT: {
				Constraint constraint = (Constraint)theEObject;
				T result = caseConstraint(constraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPIMMetamodelPackage.CONSTRAINT_OPERATOR: {
				ConstraintOperator constraintOperator = (ConstraintOperator)theEObject;
				T result = caseConstraintOperator(constraintOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPIMMetamodelPackage.ONE_PROPERTY_OPERATOR: {
				OnePropertyOperator onePropertyOperator = (OnePropertyOperator)theEObject;
				T result = caseOnePropertyOperator(onePropertyOperator);
				if (result == null) result = caseConstraintOperator(onePropertyOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPIMMetamodelPackage.TWO_PROPERTY_OPERATOR: {
				TwoPropertyOperator twoPropertyOperator = (TwoPropertyOperator)theEObject;
				T result = caseTwoPropertyOperator(twoPropertyOperator);
				if (result == null) result = caseConstraintOperator(twoPropertyOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPIMMetamodelPackage.ONE_RELATIONAL_OPERATOR: {
				OneRelationalOperator oneRelationalOperator = (OneRelationalOperator)theEObject;
				T result = caseOneRelationalOperator(oneRelationalOperator);
				if (result == null) result = caseOnePropertyOperator(oneRelationalOperator);
				if (result == null) result = caseConstraintOperator(oneRelationalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPIMMetamodelPackage.ONE_LIST_OPERATOR: {
				OneListOperator oneListOperator = (OneListOperator)theEObject;
				T result = caseOneListOperator(oneListOperator);
				if (result == null) result = caseOnePropertyOperator(oneListOperator);
				if (result == null) result = caseConstraintOperator(oneListOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPIMMetamodelPackage.ONE_STRING_OPERATOR: {
				OneStringOperator oneStringOperator = (OneStringOperator)theEObject;
				T result = caseOneStringOperator(oneStringOperator);
				if (result == null) result = caseOnePropertyOperator(oneStringOperator);
				if (result == null) result = caseConstraintOperator(oneStringOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPIMMetamodelPackage.ONE_UNARY_OPERATOR: {
				OneUnaryOperator oneUnaryOperator = (OneUnaryOperator)theEObject;
				T result = caseOneUnaryOperator(oneUnaryOperator);
				if (result == null) result = caseOnePropertyOperator(oneUnaryOperator);
				if (result == null) result = caseConstraintOperator(oneUnaryOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPIMMetamodelPackage.ONE_BOOLEAN_OPERATOR: {
				OneBooleanOperator oneBooleanOperator = (OneBooleanOperator)theEObject;
				T result = caseOneBooleanOperator(oneBooleanOperator);
				if (result == null) result = caseOnePropertyOperator(oneBooleanOperator);
				if (result == null) result = caseConstraintOperator(oneBooleanOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPIMMetamodelPackage.TWO_LIST_OPERATOR: {
				TwoListOperator twoListOperator = (TwoListOperator)theEObject;
				T result = caseTwoListOperator(twoListOperator);
				if (result == null) result = caseTwoPropertyOperator(twoListOperator);
				if (result == null) result = caseConstraintOperator(twoListOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPIMMetamodelPackage.TWO_RELATIONAL_OPERATOR: {
				TwoRelationalOperator twoRelationalOperator = (TwoRelationalOperator)theEObject;
				T result = caseTwoRelationalOperator(twoRelationalOperator);
				if (result == null) result = caseTwoPropertyOperator(twoRelationalOperator);
				if (result == null) result = caseConstraintOperator(twoRelationalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPIMMetamodelPackage.TWO_STRING_OPERATOR: {
				TwoStringOperator twoStringOperator = (TwoStringOperator)theEObject;
				T result = caseTwoStringOperator(twoStringOperator);
				if (result == null) result = caseTwoPropertyOperator(twoStringOperator);
				if (result == null) result = caseConstraintOperator(twoStringOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPIMMetamodelPackage.LOGICAL_OPERATOR: {
				LogicalOperator logicalOperator = (LogicalOperator)theEObject;
				T result = caseLogicalOperator(logicalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPIMMetamodelPackage.USER: {
				User user = (User)theEObject;
				T result = caseUser(user);
				if (result == null) result = caseResource(user);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPIMMetamodelPackage.CURRENT_USER: {
				CurrentUser currentUser = (CurrentUser)theEObject;
				T result = caseCurrentUser(currentUser);
				if (result == null) result = caseUser(currentUser);
				if (result == null) result = caseResource(currentUser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecurityPIMMetamodelPackage.USERNAME: {
				Username username = (Username)theEObject;
				T result = caseUsername(username);
				if (result == null) result = caseProperty(username);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authentication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authentication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthentication(Authentication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authorization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authorization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthorization(Authorization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decentral Auth</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decentral Auth</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecentralAuth(DecentralAuth object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Centeral Auth</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Centeral Auth</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCenteralAuth(CenteralAuth object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UAA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UAA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUAA(UAA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OAuth2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OAuth2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOAuth2(OAuth2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasic(Basic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Permission</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Permission</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePermission(Permission object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraint(Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintOperator(ConstraintOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>One Property Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>One Property Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnePropertyOperator(OnePropertyOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Two Property Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Two Property Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTwoPropertyOperator(TwoPropertyOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>One Relational Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>One Relational Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOneRelationalOperator(OneRelationalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>One List Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>One List Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOneListOperator(OneListOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>One String Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>One String Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOneStringOperator(OneStringOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>One Unary Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>One Unary Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOneUnaryOperator(OneUnaryOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>One Boolean Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>One Boolean Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOneBooleanOperator(OneBooleanOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Two List Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Two List Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTwoListOperator(TwoListOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Two Relational Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Two Relational Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTwoRelationalOperator(TwoRelationalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Two String Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Two String Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTwoStringOperator(TwoStringOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalOperator(LogicalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUser(User object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Current User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Current User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurrentUser(CurrentUser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Username</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Username</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsername(Username object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SecurityPIMMetamodelSwitch
