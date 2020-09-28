/**
 */
package ServicePIM.impl;

import QueryPIM.GlobalSearch;
import SecurityPIM.Role;
import ServicePIM.Application;
import ServicePIM.Config;
import ServicePIM.Deployment;
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ServicePIM.impl.ApplicationImpl#getHasConfig <em>Has Config</em>}</li>
 *   <li>{@link ServicePIM.impl.ApplicationImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link ServicePIM.impl.ApplicationImpl#getGlobalsearches <em>Globalsearches</em>}</li>
 *   <li>{@link ServicePIM.impl.ApplicationImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link ServicePIM.impl.ApplicationImpl#getDeployment <em>Deployment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationImpl extends MinimalEObjectImpl.Container implements Application {
	/**
	 * The cached value of the '{@link #getHasConfig() <em>Has Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasConfig()
	 * @generated
	 * @ordered
	 */
	protected Config hasConfig;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> resources;

	/**
	 * The cached value of the '{@link #getGlobalsearches() <em>Globalsearches</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalsearches()
	 * @generated
	 * @ordered
	 */
	protected GlobalSearch globalsearches;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> roles;

	/**
	 * The cached value of the '{@link #getDeployment() <em>Deployment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployment()
	 * @generated
	 * @ordered
	 */
	protected EList<Deployment> deployment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePIMPackage.Literals.APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Config getHasConfig() {
		return hasConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasConfig(Config newHasConfig, NotificationChain msgs) {
		Config oldHasConfig = hasConfig;
		hasConfig = newHasConfig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicePIMPackage.APPLICATION__HAS_CONFIG, oldHasConfig, newHasConfig);
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
	public void setHasConfig(Config newHasConfig) {
		if (newHasConfig != hasConfig) {
			NotificationChain msgs = null;
			if (hasConfig != null)
				msgs = ((InternalEObject)hasConfig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicePIMPackage.APPLICATION__HAS_CONFIG, null, msgs);
			if (newHasConfig != null)
				msgs = ((InternalEObject)newHasConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServicePIMPackage.APPLICATION__HAS_CONFIG, null, msgs);
			msgs = basicSetHasConfig(newHasConfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePIMPackage.APPLICATION__HAS_CONFIG, newHasConfig, newHasConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Resource> getResources() {
		if (resources == null) {
			resources = new EObjectWithInverseResolvingEList.ManyInverse<Resource>(Resource.class, this, ServicePIMPackage.APPLICATION__RESOURCES, ServicePIMPackage.RESOURCE__APPLICATIONS);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlobalSearch getGlobalsearches() {
		return globalsearches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobalsearches(GlobalSearch newGlobalsearches, NotificationChain msgs) {
		GlobalSearch oldGlobalsearches = globalsearches;
		globalsearches = newGlobalsearches;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicePIMPackage.APPLICATION__GLOBALSEARCHES, oldGlobalsearches, newGlobalsearches);
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
	public void setGlobalsearches(GlobalSearch newGlobalsearches) {
		if (newGlobalsearches != globalsearches) {
			NotificationChain msgs = null;
			if (globalsearches != null)
				msgs = ((InternalEObject)globalsearches).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicePIMPackage.APPLICATION__GLOBALSEARCHES, null, msgs);
			if (newGlobalsearches != null)
				msgs = ((InternalEObject)newGlobalsearches).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServicePIMPackage.APPLICATION__GLOBALSEARCHES, null, msgs);
			msgs = basicSetGlobalsearches(newGlobalsearches, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePIMPackage.APPLICATION__GLOBALSEARCHES, newGlobalsearches, newGlobalsearches));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectResolvingEList<Role>(Role.class, this, ServicePIMPackage.APPLICATION__ROLES);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Deployment> getDeployment() {
		if (deployment == null) {
			deployment = new EObjectContainmentEList<Deployment>(Deployment.class, this, ServicePIMPackage.APPLICATION__DEPLOYMENT);
		}
		return deployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServicePIMPackage.APPLICATION__RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResources()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServicePIMPackage.APPLICATION__HAS_CONFIG:
				return basicSetHasConfig(null, msgs);
			case ServicePIMPackage.APPLICATION__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case ServicePIMPackage.APPLICATION__GLOBALSEARCHES:
				return basicSetGlobalsearches(null, msgs);
			case ServicePIMPackage.APPLICATION__DEPLOYMENT:
				return ((InternalEList<?>)getDeployment()).basicRemove(otherEnd, msgs);
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
			case ServicePIMPackage.APPLICATION__HAS_CONFIG:
				return getHasConfig();
			case ServicePIMPackage.APPLICATION__RESOURCES:
				return getResources();
			case ServicePIMPackage.APPLICATION__GLOBALSEARCHES:
				return getGlobalsearches();
			case ServicePIMPackage.APPLICATION__ROLES:
				return getRoles();
			case ServicePIMPackage.APPLICATION__DEPLOYMENT:
				return getDeployment();
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
			case ServicePIMPackage.APPLICATION__HAS_CONFIG:
				setHasConfig((Config)newValue);
				return;
			case ServicePIMPackage.APPLICATION__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends Resource>)newValue);
				return;
			case ServicePIMPackage.APPLICATION__GLOBALSEARCHES:
				setGlobalsearches((GlobalSearch)newValue);
				return;
			case ServicePIMPackage.APPLICATION__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case ServicePIMPackage.APPLICATION__DEPLOYMENT:
				getDeployment().clear();
				getDeployment().addAll((Collection<? extends Deployment>)newValue);
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
			case ServicePIMPackage.APPLICATION__HAS_CONFIG:
				setHasConfig((Config)null);
				return;
			case ServicePIMPackage.APPLICATION__RESOURCES:
				getResources().clear();
				return;
			case ServicePIMPackage.APPLICATION__GLOBALSEARCHES:
				setGlobalsearches((GlobalSearch)null);
				return;
			case ServicePIMPackage.APPLICATION__ROLES:
				getRoles().clear();
				return;
			case ServicePIMPackage.APPLICATION__DEPLOYMENT:
				getDeployment().clear();
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
			case ServicePIMPackage.APPLICATION__HAS_CONFIG:
				return hasConfig != null;
			case ServicePIMPackage.APPLICATION__RESOURCES:
				return resources != null && !resources.isEmpty();
			case ServicePIMPackage.APPLICATION__GLOBALSEARCHES:
				return globalsearches != null;
			case ServicePIMPackage.APPLICATION__ROLES:
				return roles != null && !roles.isEmpty();
			case ServicePIMPackage.APPLICATION__DEPLOYMENT:
				return deployment != null && !deployment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ApplicationImpl
