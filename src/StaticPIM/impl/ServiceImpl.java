/**
 */
package StaticPIM.impl;

import StaticPIM.Service;
import StaticPIM.ServiceOperation;
import StaticPIM.StaticPIMPackage;
import StaticPIM.Subscribe;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link StaticPIM.impl.ServiceImpl#getOtherDependencies <em>Other Dependencies</em>}</li>
 *   <li>{@link StaticPIM.impl.ServiceImpl#getServiceDependencies <em>Service Dependencies</em>}</li>
 *   <li>{@link StaticPIM.impl.ServiceImpl#isWebService <em>Web Service</em>}</li>
 *   <li>{@link StaticPIM.impl.ServiceImpl#isRemoteInterface <em>Remote Interface</em>}</li>
 *   <li>{@link StaticPIM.impl.ServiceImpl#isLocalInterface <em>Local Interface</em>}</li>
 *   <li>{@link StaticPIM.impl.ServiceImpl#getSubscribe <em>Subscribe</em>}</li>
 *   <li>{@link StaticPIM.impl.ServiceImpl#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceImpl extends MinimalEObjectImpl.Container implements Service {
	/**
	 * The cached value of the '{@link #getOtherDependencies() <em>Other Dependencies</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherDependencies;

	/**
	 * The cached value of the '{@link #getServiceDependencies() <em>Service Dependencies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> serviceDependencies;

	/**
	 * The default value of the '{@link #isWebService() <em>Web Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWebService()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WEB_SERVICE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWebService() <em>Web Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWebService()
	 * @generated
	 * @ordered
	 */
	protected boolean webService = WEB_SERVICE_EDEFAULT;

	/**
	 * The default value of the '{@link #isRemoteInterface() <em>Remote Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoteInterface()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REMOTE_INTERFACE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isRemoteInterface() <em>Remote Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemoteInterface()
	 * @generated
	 * @ordered
	 */
	protected boolean remoteInterface = REMOTE_INTERFACE_EDEFAULT;

	/**
	 * The default value of the '{@link #isLocalInterface() <em>Local Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocalInterface()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOCAL_INTERFACE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isLocalInterface() <em>Local Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocalInterface()
	 * @generated
	 * @ordered
	 */
	protected boolean localInterface = LOCAL_INTERFACE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubscribe() <em>Subscribe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscribe()
	 * @generated
	 * @ordered
	 */
	protected Subscribe subscribe;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceOperation> operations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StaticPIMPackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherDependencies() {
		if (otherDependencies == null) {
			otherDependencies = new EDataTypeUniqueEList<String>(String.class, this, StaticPIMPackage.SERVICE__OTHER_DEPENDENCIES);
		}
		return otherDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Service> getServiceDependencies() {
		if (serviceDependencies == null) {
			serviceDependencies = new EObjectResolvingEList<Service>(Service.class, this, StaticPIMPackage.SERVICE__SERVICE_DEPENDENCIES);
		}
		return serviceDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isWebService() {
		return webService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebService(boolean newWebService) {
		boolean oldWebService = webService;
		webService = newWebService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaticPIMPackage.SERVICE__WEB_SERVICE, oldWebService, webService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRemoteInterface() {
		return remoteInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemoteInterface(boolean newRemoteInterface) {
		boolean oldRemoteInterface = remoteInterface;
		remoteInterface = newRemoteInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaticPIMPackage.SERVICE__REMOTE_INTERFACE, oldRemoteInterface, remoteInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isLocalInterface() {
		return localInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalInterface(boolean newLocalInterface) {
		boolean oldLocalInterface = localInterface;
		localInterface = newLocalInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaticPIMPackage.SERVICE__LOCAL_INTERFACE, oldLocalInterface, localInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Subscribe getSubscribe() {
		if (subscribe != null && subscribe.eIsProxy()) {
			InternalEObject oldSubscribe = (InternalEObject)subscribe;
			subscribe = (Subscribe)eResolveProxy(oldSubscribe);
			if (subscribe != oldSubscribe) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StaticPIMPackage.SERVICE__SUBSCRIBE, oldSubscribe, subscribe));
			}
		}
		return subscribe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subscribe basicGetSubscribe() {
		return subscribe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubscribe(Subscribe newSubscribe) {
		Subscribe oldSubscribe = subscribe;
		subscribe = newSubscribe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaticPIMPackage.SERVICE__SUBSCRIBE, oldSubscribe, subscribe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ServiceOperation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentWithInverseEList<ServiceOperation>(ServiceOperation.class, this, StaticPIMPackage.SERVICE__OPERATIONS, StaticPIMPackage.SERVICE_OPERATION__SERVICE);
		}
		return operations;
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
			case StaticPIMPackage.SERVICE__OPERATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperations()).basicAdd(otherEnd, msgs);
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
			case StaticPIMPackage.SERVICE__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
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
			case StaticPIMPackage.SERVICE__OTHER_DEPENDENCIES:
				return getOtherDependencies();
			case StaticPIMPackage.SERVICE__SERVICE_DEPENDENCIES:
				return getServiceDependencies();
			case StaticPIMPackage.SERVICE__WEB_SERVICE:
				return isWebService();
			case StaticPIMPackage.SERVICE__REMOTE_INTERFACE:
				return isRemoteInterface();
			case StaticPIMPackage.SERVICE__LOCAL_INTERFACE:
				return isLocalInterface();
			case StaticPIMPackage.SERVICE__SUBSCRIBE:
				if (resolve) return getSubscribe();
				return basicGetSubscribe();
			case StaticPIMPackage.SERVICE__OPERATIONS:
				return getOperations();
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
			case StaticPIMPackage.SERVICE__OTHER_DEPENDENCIES:
				getOtherDependencies().clear();
				getOtherDependencies().addAll((Collection<? extends String>)newValue);
				return;
			case StaticPIMPackage.SERVICE__SERVICE_DEPENDENCIES:
				getServiceDependencies().clear();
				getServiceDependencies().addAll((Collection<? extends Service>)newValue);
				return;
			case StaticPIMPackage.SERVICE__WEB_SERVICE:
				setWebService((Boolean)newValue);
				return;
			case StaticPIMPackage.SERVICE__REMOTE_INTERFACE:
				setRemoteInterface((Boolean)newValue);
				return;
			case StaticPIMPackage.SERVICE__LOCAL_INTERFACE:
				setLocalInterface((Boolean)newValue);
				return;
			case StaticPIMPackage.SERVICE__SUBSCRIBE:
				setSubscribe((Subscribe)newValue);
				return;
			case StaticPIMPackage.SERVICE__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends ServiceOperation>)newValue);
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
			case StaticPIMPackage.SERVICE__OTHER_DEPENDENCIES:
				getOtherDependencies().clear();
				return;
			case StaticPIMPackage.SERVICE__SERVICE_DEPENDENCIES:
				getServiceDependencies().clear();
				return;
			case StaticPIMPackage.SERVICE__WEB_SERVICE:
				setWebService(WEB_SERVICE_EDEFAULT);
				return;
			case StaticPIMPackage.SERVICE__REMOTE_INTERFACE:
				setRemoteInterface(REMOTE_INTERFACE_EDEFAULT);
				return;
			case StaticPIMPackage.SERVICE__LOCAL_INTERFACE:
				setLocalInterface(LOCAL_INTERFACE_EDEFAULT);
				return;
			case StaticPIMPackage.SERVICE__SUBSCRIBE:
				setSubscribe((Subscribe)null);
				return;
			case StaticPIMPackage.SERVICE__OPERATIONS:
				getOperations().clear();
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
			case StaticPIMPackage.SERVICE__OTHER_DEPENDENCIES:
				return otherDependencies != null && !otherDependencies.isEmpty();
			case StaticPIMPackage.SERVICE__SERVICE_DEPENDENCIES:
				return serviceDependencies != null && !serviceDependencies.isEmpty();
			case StaticPIMPackage.SERVICE__WEB_SERVICE:
				return webService != WEB_SERVICE_EDEFAULT;
			case StaticPIMPackage.SERVICE__REMOTE_INTERFACE:
				return remoteInterface != REMOTE_INTERFACE_EDEFAULT;
			case StaticPIMPackage.SERVICE__LOCAL_INTERFACE:
				return localInterface != LOCAL_INTERFACE_EDEFAULT;
			case StaticPIMPackage.SERVICE__SUBSCRIBE:
				return subscribe != null;
			case StaticPIMPackage.SERVICE__OPERATIONS:
				return operations != null && !operations.isEmpty();
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
		result.append(" (otherDependencies: ");
		result.append(otherDependencies);
		result.append(", webService: ");
		result.append(webService);
		result.append(", remoteInterface: ");
		result.append(remoteInterface);
		result.append(", localInterface: ");
		result.append(localInterface);
		result.append(')');
		return result.toString();
	}

} //ServiceImpl
