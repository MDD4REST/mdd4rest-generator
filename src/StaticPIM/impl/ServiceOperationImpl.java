/**
 */
package StaticPIM.impl;

import StaticPIM.Service;
import StaticPIM.ServiceOperation;
import StaticPIM.StaticPIMPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link StaticPIM.impl.ServiceOperationImpl#getServiceDelegate <em>Service Delegate</em>}</li>
 *   <li>{@link StaticPIM.impl.ServiceOperationImpl#getService <em>Service</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceOperationImpl extends OperationImpl implements ServiceOperation {
	/**
	 * The cached value of the '{@link #getServiceDelegate() <em>Service Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDelegate()
	 * @generated
	 * @ordered
	 */
	protected ServiceOperation serviceDelegate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StaticPIMPackage.Literals.SERVICE_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceOperation getServiceDelegate() {
		if (serviceDelegate != null && serviceDelegate.eIsProxy()) {
			InternalEObject oldServiceDelegate = (InternalEObject)serviceDelegate;
			serviceDelegate = (ServiceOperation)eResolveProxy(oldServiceDelegate);
			if (serviceDelegate != oldServiceDelegate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StaticPIMPackage.SERVICE_OPERATION__SERVICE_DELEGATE, oldServiceDelegate, serviceDelegate));
			}
		}
		return serviceDelegate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceOperation basicGetServiceDelegate() {
		return serviceDelegate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceDelegate(ServiceOperation newServiceDelegate) {
		ServiceOperation oldServiceDelegate = serviceDelegate;
		serviceDelegate = newServiceDelegate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaticPIMPackage.SERVICE_OPERATION__SERVICE_DELEGATE, oldServiceDelegate, serviceDelegate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Service getService() {
		if (eContainerFeatureID() != StaticPIMPackage.SERVICE_OPERATION__SERVICE) return null;
		return (Service)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service basicGetService() {
		if (eContainerFeatureID() != StaticPIMPackage.SERVICE_OPERATION__SERVICE) return null;
		return (Service)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetService(Service newService, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newService, StaticPIMPackage.SERVICE_OPERATION__SERVICE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setService(Service newService) {
		if (newService != eInternalContainer() || (eContainerFeatureID() != StaticPIMPackage.SERVICE_OPERATION__SERVICE && newService != null)) {
			if (EcoreUtil.isAncestor(this, newService))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newService != null)
				msgs = ((InternalEObject)newService).eInverseAdd(this, StaticPIMPackage.SERVICE__OPERATIONS, Service.class, msgs);
			msgs = basicSetService(newService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaticPIMPackage.SERVICE_OPERATION__SERVICE, newService, newService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StaticPIMPackage.SERVICE_OPERATION__SERVICE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetService((Service)otherEnd, msgs);
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
			case StaticPIMPackage.SERVICE_OPERATION__SERVICE:
				return basicSetService(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case StaticPIMPackage.SERVICE_OPERATION__SERVICE:
				return eInternalContainer().eInverseRemove(this, StaticPIMPackage.SERVICE__OPERATIONS, Service.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StaticPIMPackage.SERVICE_OPERATION__SERVICE_DELEGATE:
				if (resolve) return getServiceDelegate();
				return basicGetServiceDelegate();
			case StaticPIMPackage.SERVICE_OPERATION__SERVICE:
				if (resolve) return getService();
				return basicGetService();
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
			case StaticPIMPackage.SERVICE_OPERATION__SERVICE_DELEGATE:
				setServiceDelegate((ServiceOperation)newValue);
				return;
			case StaticPIMPackage.SERVICE_OPERATION__SERVICE:
				setService((Service)newValue);
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
			case StaticPIMPackage.SERVICE_OPERATION__SERVICE_DELEGATE:
				setServiceDelegate((ServiceOperation)null);
				return;
			case StaticPIMPackage.SERVICE_OPERATION__SERVICE:
				setService((Service)null);
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
			case StaticPIMPackage.SERVICE_OPERATION__SERVICE_DELEGATE:
				return serviceDelegate != null;
			case StaticPIMPackage.SERVICE_OPERATION__SERVICE:
				return basicGetService() != null;
		}
		return super.eIsSet(featureID);
	}

} //ServiceOperationImpl
