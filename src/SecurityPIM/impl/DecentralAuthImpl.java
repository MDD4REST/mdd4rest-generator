/**
 */
package SecurityPIM.impl;

import SecurityPIM.Authorization;
import SecurityPIM.DecentralAuth;
import SecurityPIM.SecurityPIMMetamodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decentral Auth</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SecurityPIM.impl.DecentralAuthImpl#getAuthorization <em>Authorization</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DecentralAuthImpl extends AuthenticationImpl implements DecentralAuth {
	/**
	 * The cached value of the '{@link #getAuthorization() <em>Authorization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorization()
	 * @generated
	 * @ordered
	 */
	protected EList<Authorization> authorization;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecentralAuthImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPIMMetamodelPackage.Literals.DECENTRAL_AUTH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Authorization> getAuthorization() {
		if (authorization == null) {
			authorization = new EObjectContainmentEList<Authorization>(Authorization.class, this, SecurityPIMMetamodelPackage.DECENTRAL_AUTH__AUTHORIZATION);
		}
		return authorization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SecurityPIMMetamodelPackage.DECENTRAL_AUTH__AUTHORIZATION:
				return ((InternalEList<?>)getAuthorization()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SecurityPIMMetamodelPackage.DECENTRAL_AUTH__AUTHORIZATION:
				return getAuthorization();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SecurityPIMMetamodelPackage.DECENTRAL_AUTH__AUTHORIZATION:
				getAuthorization().clear();
				getAuthorization().addAll((Collection<? extends Authorization>)newValue);
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
			case SecurityPIMMetamodelPackage.DECENTRAL_AUTH__AUTHORIZATION:
				getAuthorization().clear();
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
			case SecurityPIMMetamodelPackage.DECENTRAL_AUTH__AUTHORIZATION:
				return authorization != null && !authorization.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DecentralAuthImpl
