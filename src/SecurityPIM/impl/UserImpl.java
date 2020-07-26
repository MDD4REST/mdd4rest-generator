/**
 */
package SecurityPIM.impl;

import SecurityPIM.SecurityPIMMetamodelPackage;
import SecurityPIM.User;

import SecurityPIM.Username;
import ServicePIM.impl.ResourceImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SecurityPIM.impl.UserImpl#getUsername <em>Username</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserImpl extends ResourceImpl implements User {
	/**
	 * The cached value of the '{@link #getUsername() <em>Username</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected Username username;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPIMMetamodelPackage.Literals.USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Username getUsername() {
		return username;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsername(Username newUsername, NotificationChain msgs) {
		Username oldUsername = username;
		username = newUsername;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SecurityPIMMetamodelPackage.USER__USERNAME, oldUsername, newUsername);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsername(Username newUsername) {
		if (newUsername != username) {
			NotificationChain msgs = null;
			if (username != null)
				msgs = ((InternalEObject)username).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SecurityPIMMetamodelPackage.USER__USERNAME, null, msgs);
			if (newUsername != null)
				msgs = ((InternalEObject)newUsername).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SecurityPIMMetamodelPackage.USER__USERNAME, null, msgs);
			msgs = basicSetUsername(newUsername, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPIMMetamodelPackage.USER__USERNAME, newUsername, newUsername));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SecurityPIMMetamodelPackage.USER__USERNAME:
				return basicSetUsername(null, msgs);
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
			case SecurityPIMMetamodelPackage.USER__USERNAME:
				return getUsername();
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
			case SecurityPIMMetamodelPackage.USER__USERNAME:
				setUsername((Username)newValue);
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
			case SecurityPIMMetamodelPackage.USER__USERNAME:
				setUsername((Username)null);
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
			case SecurityPIMMetamodelPackage.USER__USERNAME:
				return username != null;
		}
		return super.eIsSet(featureID);
	}

} //UserImpl
