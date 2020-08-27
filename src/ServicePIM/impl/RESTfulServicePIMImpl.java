/**
 */
package ServicePIM.impl;

import SecurityPIM.Role;
import ServicePIM.Application;
import ServicePIM.BasicType;
import ServicePIM.Enumeration;
import ServicePIM.RESTfulServicePIM;
import ServicePIM.Resource;
import ServicePIM.ServicePIMPackage;
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
 * An implementation of the model object '<em><b>RES Tful Service PIM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ServicePIM.impl.RESTfulServicePIMImpl#getName <em>Name</em>}</li>
 *   <li>{@link ServicePIM.impl.RESTfulServicePIMImpl#getBasePath <em>Base Path</em>}</li>
 *   <li>{@link ServicePIM.impl.RESTfulServicePIMImpl#getHasApplications <em>Has Applications</em>}</li>
 *   <li>{@link ServicePIM.impl.RESTfulServicePIMImpl#getEnumerations <em>Enumerations</em>}</li>
 *   <li>{@link ServicePIM.impl.RESTfulServicePIMImpl#getHasResources <em>Has Resources</em>}</li>
 *   <li>{@link ServicePIM.impl.RESTfulServicePIMImpl#getHasRoles <em>Has Roles</em>}</li>
 *   <li>{@link ServicePIM.impl.RESTfulServicePIMImpl#getBasictypes <em>Basictypes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RESTfulServicePIMImpl extends MinimalEObjectImpl.Container implements RESTfulServicePIM {
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
	 * The cached value of the '{@link #getEnumerations() <em>Enumerations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumerations()
	 * @generated
	 * @ordered
	 */
	protected EList<Enumeration> enumerations;

	/**
	 * The cached value of the '{@link #getHasResources() <em>Has Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasResources()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> hasResources;

	/**
	 * The cached value of the '{@link #getHasRoles() <em>Has Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> hasRoles;

	/**
	 * The cached value of the '{@link #getBasictypes() <em>Basictypes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasictypes()
	 * @generated
	 * @ordered
	 */
	protected EList<BasicType> basictypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RESTfulServicePIMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePIMPackage.Literals.RES_TFUL_SERVICE_PIM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePIMPackage.RES_TFUL_SERVICE_PIM__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePIMPackage.RES_TFUL_SERVICE_PIM__BASE_PATH, oldBasePath, basePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Application> getHasApplications() {
		if (hasApplications == null) {
			hasApplications = new EObjectContainmentEList<Application>(Application.class, this, ServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_APPLICATIONS);
		}
		return hasApplications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Enumeration> getEnumerations() {
		if (enumerations == null) {
			enumerations = new EObjectContainmentEList<Enumeration>(Enumeration.class, this, ServicePIMPackage.RES_TFUL_SERVICE_PIM__ENUMERATIONS);
		}
		return enumerations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Resource> getHasResources() {
		if (hasResources == null) {
			hasResources = new EObjectContainmentEList<Resource>(Resource.class, this, ServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_RESOURCES);
		}
		return hasResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Role> getHasRoles() {
		if (hasRoles == null) {
			hasRoles = new EObjectContainmentEList<Role>(Role.class, this, ServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_ROLES);
		}
		return hasRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BasicType> getBasictypes() {
		if (basictypes == null) {
			basictypes = new EObjectContainmentEList<BasicType>(BasicType.class, this, ServicePIMPackage.RES_TFUL_SERVICE_PIM__BASICTYPES);
		}
		return basictypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_APPLICATIONS:
				return ((InternalEList<?>)getHasApplications()).basicRemove(otherEnd, msgs);
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__ENUMERATIONS:
				return ((InternalEList<?>)getEnumerations()).basicRemove(otherEnd, msgs);
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_RESOURCES:
				return ((InternalEList<?>)getHasResources()).basicRemove(otherEnd, msgs);
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_ROLES:
				return ((InternalEList<?>)getHasRoles()).basicRemove(otherEnd, msgs);
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__BASICTYPES:
				return ((InternalEList<?>)getBasictypes()).basicRemove(otherEnd, msgs);
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
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__NAME:
				return getName();
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__BASE_PATH:
				return getBasePath();
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_APPLICATIONS:
				return getHasApplications();
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__ENUMERATIONS:
				return getEnumerations();
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_RESOURCES:
				return getHasResources();
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_ROLES:
				return getHasRoles();
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__BASICTYPES:
				return getBasictypes();
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
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__NAME:
				setName((String)newValue);
				return;
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__BASE_PATH:
				setBasePath((String)newValue);
				return;
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_APPLICATIONS:
				getHasApplications().clear();
				getHasApplications().addAll((Collection<? extends Application>)newValue);
				return;
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__ENUMERATIONS:
				getEnumerations().clear();
				getEnumerations().addAll((Collection<? extends Enumeration>)newValue);
				return;
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_RESOURCES:
				getHasResources().clear();
				getHasResources().addAll((Collection<? extends Resource>)newValue);
				return;
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_ROLES:
				getHasRoles().clear();
				getHasRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__BASICTYPES:
				getBasictypes().clear();
				getBasictypes().addAll((Collection<? extends BasicType>)newValue);
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
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__BASE_PATH:
				setBasePath(BASE_PATH_EDEFAULT);
				return;
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_APPLICATIONS:
				getHasApplications().clear();
				return;
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__ENUMERATIONS:
				getEnumerations().clear();
				return;
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_RESOURCES:
				getHasResources().clear();
				return;
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_ROLES:
				getHasRoles().clear();
				return;
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__BASICTYPES:
				getBasictypes().clear();
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
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__BASE_PATH:
				return BASE_PATH_EDEFAULT == null ? basePath != null : !BASE_PATH_EDEFAULT.equals(basePath);
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_APPLICATIONS:
				return hasApplications != null && !hasApplications.isEmpty();
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__ENUMERATIONS:
				return enumerations != null && !enumerations.isEmpty();
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_RESOURCES:
				return hasResources != null && !hasResources.isEmpty();
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_ROLES:
				return hasRoles != null && !hasRoles.isEmpty();
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__BASICTYPES:
				return basictypes != null && !basictypes.isEmpty();
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

} //RESTfulServicePIMImpl
