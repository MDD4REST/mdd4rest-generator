/**
 */
package SecurityPIM.impl;

import SecurityPIM.CenteralAuth;
import SecurityPIM.SecurityPIMMetamodelPackage;
import SecurityPIM.UAA;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Centeral Auth</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SecurityPIM.impl.CenteralAuthImpl#getUaa <em>Uaa</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CenteralAuthImpl extends AuthenticationImpl implements CenteralAuth {
	/**
	 * The cached value of the '{@link #getUaa() <em>Uaa</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUaa()
	 * @generated
	 * @ordered
	 */
	protected UAA uaa;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CenteralAuthImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPIMMetamodelPackage.Literals.CENTERAL_AUTH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UAA getUaa() {
		if (uaa != null && uaa.eIsProxy()) {
			InternalEObject oldUaa = (InternalEObject)uaa;
			uaa = (UAA)eResolveProxy(oldUaa);
			if (uaa != oldUaa) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SecurityPIMMetamodelPackage.CENTERAL_AUTH__UAA, oldUaa, uaa));
			}
		}
		return uaa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UAA basicGetUaa() {
		return uaa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUaa(UAA newUaa) {
		UAA oldUaa = uaa;
		uaa = newUaa;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPIMMetamodelPackage.CENTERAL_AUTH__UAA, oldUaa, uaa));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SecurityPIMMetamodelPackage.CENTERAL_AUTH__UAA:
				if (resolve) return getUaa();
				return basicGetUaa();
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
			case SecurityPIMMetamodelPackage.CENTERAL_AUTH__UAA:
				setUaa((UAA)newValue);
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
			case SecurityPIMMetamodelPackage.CENTERAL_AUTH__UAA:
				setUaa((UAA)null);
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
			case SecurityPIMMetamodelPackage.CENTERAL_AUTH__UAA:
				return uaa != null;
		}
		return super.eIsSet(featureID);
	}

} //CenteralAuthImpl
