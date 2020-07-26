/**
 */
package ServicePIM.impl;

import ServicePIM.Activity;
import ServicePIM.ServicePIMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ServicePIM.impl.ActivityImpl#isIsAuthenticatedRequired <em>Is Authenticated Required</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityImpl extends MinimalEObjectImpl.Container implements Activity {
	/**
	 * The default value of the '{@link #isIsAuthenticatedRequired() <em>Is Authenticated Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAuthenticatedRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_AUTHENTICATED_REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAuthenticatedRequired() <em>Is Authenticated Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAuthenticatedRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean isAuthenticatedRequired = IS_AUTHENTICATED_REQUIRED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePIMPackage.Literals.ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsAuthenticatedRequired() {
		return isAuthenticatedRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsAuthenticatedRequired(boolean newIsAuthenticatedRequired) {
		boolean oldIsAuthenticatedRequired = isAuthenticatedRequired;
		isAuthenticatedRequired = newIsAuthenticatedRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePIMPackage.ACTIVITY__IS_AUTHENTICATED_REQUIRED, oldIsAuthenticatedRequired, isAuthenticatedRequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicePIMPackage.ACTIVITY__IS_AUTHENTICATED_REQUIRED:
				return isIsAuthenticatedRequired();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ServicePIMPackage.ACTIVITY__IS_AUTHENTICATED_REQUIRED:
				setIsAuthenticatedRequired((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ServicePIMPackage.ACTIVITY__IS_AUTHENTICATED_REQUIRED:
				setIsAuthenticatedRequired(IS_AUTHENTICATED_REQUIRED_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ServicePIMPackage.ACTIVITY__IS_AUTHENTICATED_REQUIRED:
				return isAuthenticatedRequired != IS_AUTHENTICATED_REQUIRED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isAuthenticatedRequired: ");
		result.append(isAuthenticatedRequired);
		result.append(')');
		return result.toString();
	}

} //ActivityImpl
