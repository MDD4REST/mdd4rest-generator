/**
 */
package SecurityPIM.impl;

import SecurityPIM.Authentication;
import SecurityPIM.SecurityPIMMetamodelPackage;

import SecurityPIM.User;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authentication</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class AuthenticationImpl extends MinimalEObjectImpl.Container implements Authentication {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthenticationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPIMMetamodelPackage.Literals.AUTHENTICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public User currentUser() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SecurityPIMMetamodelPackage.AUTHENTICATION___CURRENT_USER:
				return currentUser();
		}
		return super.eInvoke(operationID, arguments);
	}

} //AuthenticationImpl
