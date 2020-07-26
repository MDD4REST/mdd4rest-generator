/**
 */
package SecurityPIM.impl;

import SecurityPIM.Constraint;
import SecurityPIM.Permission;
import SecurityPIM.PermissionType;
import SecurityPIM.SecurityPIMMetamodelPackage;

import ServicePIM.Activity;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Permission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SecurityPIM.impl.PermissionImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link SecurityPIM.impl.PermissionImpl#getPermissionType <em>Permission Type</em>}</li>
 *   <li>{@link SecurityPIM.impl.PermissionImpl#getActivity <em>Activity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PermissionImpl extends MinimalEObjectImpl.Container implements Permission {
	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraint;

	/**
	 * The default value of the '{@link #getPermissionType() <em>Permission Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermissionType()
	 * @generated
	 * @ordered
	 */
	protected static final PermissionType PERMISSION_TYPE_EDEFAULT = PermissionType.ALLOW;

	/**
	 * The cached value of the '{@link #getPermissionType() <em>Permission Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermissionType()
	 * @generated
	 * @ordered
	 */
	protected PermissionType permissionType = PERMISSION_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> activity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PermissionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPIMMetamodelPackage.Literals.PERMISSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Constraint> getConstraint() {
		if (constraint == null) {
			constraint = new EObjectContainmentEList<Constraint>(Constraint.class, this, SecurityPIMMetamodelPackage.PERMISSION__CONSTRAINT);
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PermissionType getPermissionType() {
		return permissionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPermissionType(PermissionType newPermissionType) {
		PermissionType oldPermissionType = permissionType;
		permissionType = newPermissionType == null ? PERMISSION_TYPE_EDEFAULT : newPermissionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPIMMetamodelPackage.PERMISSION__PERMISSION_TYPE, oldPermissionType, permissionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Activity> getActivity() {
		if (activity == null) {
			activity = new EObjectResolvingEList<Activity>(Activity.class, this, SecurityPIMMetamodelPackage.PERMISSION__ACTIVITY);
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SecurityPIMMetamodelPackage.PERMISSION__CONSTRAINT:
				return ((InternalEList<?>)getConstraint()).basicRemove(otherEnd, msgs);
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
			case SecurityPIMMetamodelPackage.PERMISSION__CONSTRAINT:
				return getConstraint();
			case SecurityPIMMetamodelPackage.PERMISSION__PERMISSION_TYPE:
				return getPermissionType();
			case SecurityPIMMetamodelPackage.PERMISSION__ACTIVITY:
				return getActivity();
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
			case SecurityPIMMetamodelPackage.PERMISSION__CONSTRAINT:
				getConstraint().clear();
				getConstraint().addAll((Collection<? extends Constraint>)newValue);
				return;
			case SecurityPIMMetamodelPackage.PERMISSION__PERMISSION_TYPE:
				setPermissionType((PermissionType)newValue);
				return;
			case SecurityPIMMetamodelPackage.PERMISSION__ACTIVITY:
				getActivity().clear();
				getActivity().addAll((Collection<? extends Activity>)newValue);
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
			case SecurityPIMMetamodelPackage.PERMISSION__CONSTRAINT:
				getConstraint().clear();
				return;
			case SecurityPIMMetamodelPackage.PERMISSION__PERMISSION_TYPE:
				setPermissionType(PERMISSION_TYPE_EDEFAULT);
				return;
			case SecurityPIMMetamodelPackage.PERMISSION__ACTIVITY:
				getActivity().clear();
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
			case SecurityPIMMetamodelPackage.PERMISSION__CONSTRAINT:
				return constraint != null && !constraint.isEmpty();
			case SecurityPIMMetamodelPackage.PERMISSION__PERMISSION_TYPE:
				return permissionType != PERMISSION_TYPE_EDEFAULT;
			case SecurityPIMMetamodelPackage.PERMISSION__ACTIVITY:
				return activity != null && !activity.isEmpty();
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
		result.append(" (permissionType: ");
		result.append(permissionType);
		result.append(')');
		return result.toString();
	}

} //PermissionImpl
