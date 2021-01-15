/**
 */
package StaticPIM.impl;

import StaticPIM.Application;
import StaticPIM.PIMDomain;
import StaticPIM.PrimitiveType;
import StaticPIM.StaticPIMPackage;

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
 * An implementation of the model object '<em><b>PIM Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link StaticPIM.impl.PIMDomainImpl#getName <em>Name</em>}</li>
 *   <li>{@link StaticPIM.impl.PIMDomainImpl#getBasePath <em>Base Path</em>}</li>
 *   <li>{@link StaticPIM.impl.PIMDomainImpl#getHasApplications <em>Has Applications</em>}</li>
 *   <li>{@link StaticPIM.impl.PIMDomainImpl#getPrimitiveTypes <em>Primitive Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PIMDomainImpl extends MinimalEObjectImpl.Container implements PIMDomain {
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
	 * The default value of the '{@link #getBasePath() <em>Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePath()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBasePath() <em>Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePath()
	 * @generated
	 * @ordered
	 */
	protected String basePath = BASE_PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasApplications() <em>Has Applications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasApplications()
	 * @generated
	 * @ordered
	 */
	protected EList<Application> hasApplications;

	/**
	 * The cached value of the '{@link #getPrimitiveTypes() <em>Primitive Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitiveTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<PrimitiveType> primitiveTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PIMDomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StaticPIMPackage.Literals.PIM_DOMAIN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StaticPIMPackage.PIM_DOMAIN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBasePath() {
		return basePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBasePath(String newBasePath) {
		String oldBasePath = basePath;
		basePath = newBasePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaticPIMPackage.PIM_DOMAIN__BASE_PATH, oldBasePath, basePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Application> getHasApplications() {
		if (hasApplications == null) {
			hasApplications = new EObjectContainmentEList<Application>(Application.class, this, StaticPIMPackage.PIM_DOMAIN__HAS_APPLICATIONS);
		}
		return hasApplications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PrimitiveType> getPrimitiveTypes() {
		if (primitiveTypes == null) {
			primitiveTypes = new EObjectContainmentEList<PrimitiveType>(PrimitiveType.class, this, StaticPIMPackage.PIM_DOMAIN__PRIMITIVE_TYPES);
		}
		return primitiveTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StaticPIMPackage.PIM_DOMAIN__HAS_APPLICATIONS:
				return ((InternalEList<?>)getHasApplications()).basicRemove(otherEnd, msgs);
			case StaticPIMPackage.PIM_DOMAIN__PRIMITIVE_TYPES:
				return ((InternalEList<?>)getPrimitiveTypes()).basicRemove(otherEnd, msgs);
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
			case StaticPIMPackage.PIM_DOMAIN__NAME:
				return getName();
			case StaticPIMPackage.PIM_DOMAIN__BASE_PATH:
				return getBasePath();
			case StaticPIMPackage.PIM_DOMAIN__HAS_APPLICATIONS:
				return getHasApplications();
			case StaticPIMPackage.PIM_DOMAIN__PRIMITIVE_TYPES:
				return getPrimitiveTypes();
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
			case StaticPIMPackage.PIM_DOMAIN__NAME:
				setName((String)newValue);
				return;
			case StaticPIMPackage.PIM_DOMAIN__BASE_PATH:
				setBasePath((String)newValue);
				return;
			case StaticPIMPackage.PIM_DOMAIN__HAS_APPLICATIONS:
				getHasApplications().clear();
				getHasApplications().addAll((Collection<? extends Application>)newValue);
				return;
			case StaticPIMPackage.PIM_DOMAIN__PRIMITIVE_TYPES:
				getPrimitiveTypes().clear();
				getPrimitiveTypes().addAll((Collection<? extends PrimitiveType>)newValue);
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
			case StaticPIMPackage.PIM_DOMAIN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StaticPIMPackage.PIM_DOMAIN__BASE_PATH:
				setBasePath(BASE_PATH_EDEFAULT);
				return;
			case StaticPIMPackage.PIM_DOMAIN__HAS_APPLICATIONS:
				getHasApplications().clear();
				return;
			case StaticPIMPackage.PIM_DOMAIN__PRIMITIVE_TYPES:
				getPrimitiveTypes().clear();
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
			case StaticPIMPackage.PIM_DOMAIN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StaticPIMPackage.PIM_DOMAIN__BASE_PATH:
				return BASE_PATH_EDEFAULT == null ? basePath != null : !BASE_PATH_EDEFAULT.equals(basePath);
			case StaticPIMPackage.PIM_DOMAIN__HAS_APPLICATIONS:
				return hasApplications != null && !hasApplications.isEmpty();
			case StaticPIMPackage.PIM_DOMAIN__PRIMITIVE_TYPES:
				return primitiveTypes != null && !primitiveTypes.isEmpty();
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
		result.append(", basePath: ");
		result.append(basePath);
		result.append(')');
		return result.toString();
	}

} //PIMDomainImpl
