/**
 */
package StaticPIM.impl;

import StaticPIM.CRUDActivity;
import StaticPIM.Service;
import StaticPIM.StaticPIMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CRUD Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link StaticPIM.impl.CRUDActivityImpl#isIsAuthenticatedRequired <em>Is Authenticated Required</em>}</li>
 *   <li>{@link StaticPIM.impl.CRUDActivityImpl#isIsCustom <em>Is Custom</em>}</li>
 *   <li>{@link StaticPIM.impl.CRUDActivityImpl#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CRUDActivityImpl extends OperationImpl implements CRUDActivity {
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
	 * The default value of the '{@link #isIsCustom() <em>Is Custom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCustom()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CUSTOM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsCustom() <em>Is Custom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCustom()
	 * @generated
	 * @ordered
	 */
	protected boolean isCustom = IS_CUSTOM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDelegate() <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegate()
	 * @generated
	 * @ordered
	 */
	protected Service delegate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CRUDActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StaticPIMPackage.Literals.CRUD_ACTIVITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StaticPIMPackage.CRUD_ACTIVITY__IS_AUTHENTICATED_REQUIRED, oldIsAuthenticatedRequired, isAuthenticatedRequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsCustom() {
		return isCustom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsCustom(boolean newIsCustom) {
		boolean oldIsCustom = isCustom;
		isCustom = newIsCustom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaticPIMPackage.CRUD_ACTIVITY__IS_CUSTOM, oldIsCustom, isCustom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Service getDelegate() {
		if (delegate != null && delegate.eIsProxy()) {
			InternalEObject oldDelegate = (InternalEObject)delegate;
			delegate = (Service)eResolveProxy(oldDelegate);
			if (delegate != oldDelegate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StaticPIMPackage.CRUD_ACTIVITY__DELEGATE, oldDelegate, delegate));
			}
		}
		return delegate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service basicGetDelegate() {
		return delegate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDelegate(Service newDelegate) {
		Service oldDelegate = delegate;
		delegate = newDelegate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaticPIMPackage.CRUD_ACTIVITY__DELEGATE, oldDelegate, delegate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StaticPIMPackage.CRUD_ACTIVITY__IS_AUTHENTICATED_REQUIRED:
				return isIsAuthenticatedRequired();
			case StaticPIMPackage.CRUD_ACTIVITY__IS_CUSTOM:
				return isIsCustom();
			case StaticPIMPackage.CRUD_ACTIVITY__DELEGATE:
				if (resolve) return getDelegate();
				return basicGetDelegate();
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
			case StaticPIMPackage.CRUD_ACTIVITY__IS_AUTHENTICATED_REQUIRED:
				setIsAuthenticatedRequired((Boolean)newValue);
				return;
			case StaticPIMPackage.CRUD_ACTIVITY__IS_CUSTOM:
				setIsCustom((Boolean)newValue);
				return;
			case StaticPIMPackage.CRUD_ACTIVITY__DELEGATE:
				setDelegate((Service)newValue);
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
			case StaticPIMPackage.CRUD_ACTIVITY__IS_AUTHENTICATED_REQUIRED:
				setIsAuthenticatedRequired(IS_AUTHENTICATED_REQUIRED_EDEFAULT);
				return;
			case StaticPIMPackage.CRUD_ACTIVITY__IS_CUSTOM:
				setIsCustom(IS_CUSTOM_EDEFAULT);
				return;
			case StaticPIMPackage.CRUD_ACTIVITY__DELEGATE:
				setDelegate((Service)null);
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
			case StaticPIMPackage.CRUD_ACTIVITY__IS_AUTHENTICATED_REQUIRED:
				return isAuthenticatedRequired != IS_AUTHENTICATED_REQUIRED_EDEFAULT;
			case StaticPIMPackage.CRUD_ACTIVITY__IS_CUSTOM:
				return isCustom != IS_CUSTOM_EDEFAULT;
			case StaticPIMPackage.CRUD_ACTIVITY__DELEGATE:
				return delegate != null;
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
		result.append(", isCustom: ");
		result.append(isCustom);
		result.append(')');
		return result.toString();
	}

} //CRUDActivityImpl
