/**
 */
package SecurityPIM.impl;

import SecurityPIM.Permission;
import SecurityPIM.PermissionMode;
import SecurityPIM.Role;
import SecurityPIM.SecurityPIMMetamodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SecurityPIM.impl.RoleImpl#getPermission <em>Permission</em>}</li>
 *   <li>{@link SecurityPIM.impl.RoleImpl#getName <em>Name</em>}</li>
 *   <li>{@link SecurityPIM.impl.RoleImpl#getPermissionMode <em>Permission Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleImpl extends MinimalEObjectImpl.Container implements Role {
	/**
	 * The cached value of the '{@link #getPermission() <em>Permission</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermission()
	 * @generated
	 * @ordered
	 */
	protected EList<Permission> permission;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPermissionMode() <em>Permission Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermissionMode()
	 * @generated
	 * @ordered
	 */
	protected static final PermissionMode PERMISSION_MODE_EDEFAULT = PermissionMode.ALLOW_ALL_EXCEPT_PERMISSIONS;

	/**
	 * The cached value of the '{@link #getPermissionMode() <em>Permission Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermissionMode()
	 * @generated
	 * @ordered
	 */
	protected PermissionMode permissionMode = PERMISSION_MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPIMMetamodelPackage.Literals.ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Permission> getPermission() {
		if (permission == null) {
			permission = new EObjectContainmentEList<Permission>(Permission.class, this, SecurityPIMMetamodelPackage.ROLE__PERMISSION);
		}
		return permission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPIMMetamodelPackage.ROLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PermissionMode getPermissionMode() {
		return permissionMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPermissionMode(PermissionMode newPermissionMode) {
		PermissionMode oldPermissionMode = permissionMode;
		permissionMode = newPermissionMode == null ? PERMISSION_MODE_EDEFAULT : newPermissionMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPIMMetamodelPackage.ROLE__PERMISSION_MODE, oldPermissionMode, permissionMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SecurityPIMMetamodelPackage.ROLE__PERMISSION:
				return ((InternalEList<?>)getPermission()).basicRemove(otherEnd, msgs);
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
			case SecurityPIMMetamodelPackage.ROLE__PERMISSION:
				return getPermission();
			case SecurityPIMMetamodelPackage.ROLE__NAME:
				return getName();
			case SecurityPIMMetamodelPackage.ROLE__PERMISSION_MODE:
				return getPermissionMode();
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
			case SecurityPIMMetamodelPackage.ROLE__PERMISSION:
				getPermission().clear();
				getPermission().addAll((Collection<? extends Permission>)newValue);
				return;
			case SecurityPIMMetamodelPackage.ROLE__NAME:
				setName((String)newValue);
				return;
			case SecurityPIMMetamodelPackage.ROLE__PERMISSION_MODE:
				setPermissionMode((PermissionMode)newValue);
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
			case SecurityPIMMetamodelPackage.ROLE__PERMISSION:
				getPermission().clear();
				return;
			case SecurityPIMMetamodelPackage.ROLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SecurityPIMMetamodelPackage.ROLE__PERMISSION_MODE:
				setPermissionMode(PERMISSION_MODE_EDEFAULT);
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
			case SecurityPIMMetamodelPackage.ROLE__PERMISSION:
				return permission != null && !permission.isEmpty();
			case SecurityPIMMetamodelPackage.ROLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SecurityPIMMetamodelPackage.ROLE__PERMISSION_MODE:
				return permissionMode != PERMISSION_MODE_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", permissionMode: ");
		result.append(permissionMode);
		result.append(')');
		return result.toString();
	}

} //RoleImpl
