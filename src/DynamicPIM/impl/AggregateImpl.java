/**
 */
package DynamicPIM.impl;

import DynamicPIM.Aggregate;
import DynamicPIM.Application;
import DynamicPIM.DomainObject;
import DynamicPIM.DynamicPIMPackage;
import DynamicPIM.Resource;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DynamicPIM.impl.AggregateImpl#getName <em>Name</em>}</li>
 *   <li>{@link DynamicPIM.impl.AggregateImpl#getHasProcess <em>Has Process</em>}</li>
 *   <li>{@link DynamicPIM.impl.AggregateImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link DynamicPIM.impl.AggregateImpl#getDomainobjects <em>Domainobjects</em>}</li>
 *   <li>{@link DynamicPIM.impl.AggregateImpl#getHasResource <em>Has Resource</em>}</li>
 *   <li>{@link DynamicPIM.impl.AggregateImpl#getAggregateRoot <em>Aggregate Root</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AggregateImpl extends EObjectImpl implements Aggregate {
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
	 * The cached value of the '{@link #getHasProcess() <em>Has Process</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasProcess()
	 * @generated
	 * @ordered
	 */
	protected EList<DynamicPIM.Process> hasProcess;

	/**
	 * The cached value of the '{@link #getDomainobjects() <em>Domainobjects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainobjects()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainObject> domainobjects;

	/**
	 * The cached value of the '{@link #getHasResource() <em>Has Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasResource()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> hasResource;

	/**
	 * The cached value of the '{@link #getAggregateRoot() <em>Aggregate Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregateRoot()
	 * @generated
	 * @ordered
	 */
	protected DomainObject aggregateRoot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AggregateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DynamicPIMPackage.Literals.AGGREGATE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicPIMPackage.AGGREGATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DynamicPIM.Process> getHasProcess() {
		if (hasProcess == null) {
			hasProcess = new EObjectContainmentWithInverseEList<DynamicPIM.Process>(DynamicPIM.Process.class, this, DynamicPIMPackage.AGGREGATE__HAS_PROCESS, DynamicPIMPackage.PROCESS__AGGREGATE);
		}
		return hasProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Application getApplication() {
		if (eContainerFeatureID() != DynamicPIMPackage.AGGREGATE__APPLICATION) return null;
		return (Application)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplication(Application newApplication, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newApplication, DynamicPIMPackage.AGGREGATE__APPLICATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApplication(Application newApplication) {
		if (newApplication != eInternalContainer() || (eContainerFeatureID() != DynamicPIMPackage.AGGREGATE__APPLICATION && newApplication != null)) {
			if (EcoreUtil.isAncestor(this, newApplication))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newApplication != null)
				msgs = ((InternalEObject)newApplication).eInverseAdd(this, DynamicPIMPackage.APPLICATION__HAS_AGGREGATE, Application.class, msgs);
			msgs = basicSetApplication(newApplication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicPIMPackage.AGGREGATE__APPLICATION, newApplication, newApplication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DomainObject> getDomainobjects() {
		if (domainobjects == null) {
			domainobjects = new EObjectContainmentWithInverseEList<DomainObject>(DomainObject.class, this, DynamicPIMPackage.AGGREGATE__DOMAINOBJECTS, DynamicPIMPackage.DOMAIN_OBJECT__AGGREGATE);
		}
		return domainobjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Resource> getHasResource() {
		if (hasResource == null) {
			hasResource = new EObjectContainmentWithInverseEList<Resource>(Resource.class, this, DynamicPIMPackage.AGGREGATE__HAS_RESOURCE, DynamicPIMPackage.RESOURCE__AGGREGATE);
		}
		return hasResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainObject getAggregateRoot() {
		if (aggregateRoot != null && aggregateRoot.eIsProxy()) {
			InternalEObject oldAggregateRoot = (InternalEObject)aggregateRoot;
			aggregateRoot = (DomainObject)eResolveProxy(oldAggregateRoot);
			if (aggregateRoot != oldAggregateRoot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DynamicPIMPackage.AGGREGATE__AGGREGATE_ROOT, oldAggregateRoot, aggregateRoot));
			}
		}
		return aggregateRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainObject basicGetAggregateRoot() {
		return aggregateRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAggregateRoot(DomainObject newAggregateRoot) {
		DomainObject oldAggregateRoot = aggregateRoot;
		aggregateRoot = newAggregateRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicPIMPackage.AGGREGATE__AGGREGATE_ROOT, oldAggregateRoot, aggregateRoot));
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
			case DynamicPIMPackage.AGGREGATE__HAS_PROCESS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasProcess()).basicAdd(otherEnd, msgs);
			case DynamicPIMPackage.AGGREGATE__APPLICATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetApplication((Application)otherEnd, msgs);
			case DynamicPIMPackage.AGGREGATE__DOMAINOBJECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDomainobjects()).basicAdd(otherEnd, msgs);
			case DynamicPIMPackage.AGGREGATE__HAS_RESOURCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasResource()).basicAdd(otherEnd, msgs);
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
			case DynamicPIMPackage.AGGREGATE__HAS_PROCESS:
				return ((InternalEList<?>)getHasProcess()).basicRemove(otherEnd, msgs);
			case DynamicPIMPackage.AGGREGATE__APPLICATION:
				return basicSetApplication(null, msgs);
			case DynamicPIMPackage.AGGREGATE__DOMAINOBJECTS:
				return ((InternalEList<?>)getDomainobjects()).basicRemove(otherEnd, msgs);
			case DynamicPIMPackage.AGGREGATE__HAS_RESOURCE:
				return ((InternalEList<?>)getHasResource()).basicRemove(otherEnd, msgs);
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
			case DynamicPIMPackage.AGGREGATE__APPLICATION:
				return eInternalContainer().eInverseRemove(this, DynamicPIMPackage.APPLICATION__HAS_AGGREGATE, Application.class, msgs);
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
			case DynamicPIMPackage.AGGREGATE__NAME:
				return getName();
			case DynamicPIMPackage.AGGREGATE__HAS_PROCESS:
				return getHasProcess();
			case DynamicPIMPackage.AGGREGATE__APPLICATION:
				return getApplication();
			case DynamicPIMPackage.AGGREGATE__DOMAINOBJECTS:
				return getDomainobjects();
			case DynamicPIMPackage.AGGREGATE__HAS_RESOURCE:
				return getHasResource();
			case DynamicPIMPackage.AGGREGATE__AGGREGATE_ROOT:
				if (resolve) return getAggregateRoot();
				return basicGetAggregateRoot();
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
			case DynamicPIMPackage.AGGREGATE__NAME:
				setName((String)newValue);
				return;
			case DynamicPIMPackage.AGGREGATE__HAS_PROCESS:
				getHasProcess().clear();
				getHasProcess().addAll((Collection<? extends DynamicPIM.Process>)newValue);
				return;
			case DynamicPIMPackage.AGGREGATE__APPLICATION:
				setApplication((Application)newValue);
				return;
			case DynamicPIMPackage.AGGREGATE__DOMAINOBJECTS:
				getDomainobjects().clear();
				getDomainobjects().addAll((Collection<? extends DomainObject>)newValue);
				return;
			case DynamicPIMPackage.AGGREGATE__HAS_RESOURCE:
				getHasResource().clear();
				getHasResource().addAll((Collection<? extends Resource>)newValue);
				return;
			case DynamicPIMPackage.AGGREGATE__AGGREGATE_ROOT:
				setAggregateRoot((DomainObject)newValue);
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
			case DynamicPIMPackage.AGGREGATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DynamicPIMPackage.AGGREGATE__HAS_PROCESS:
				getHasProcess().clear();
				return;
			case DynamicPIMPackage.AGGREGATE__APPLICATION:
				setApplication((Application)null);
				return;
			case DynamicPIMPackage.AGGREGATE__DOMAINOBJECTS:
				getDomainobjects().clear();
				return;
			case DynamicPIMPackage.AGGREGATE__HAS_RESOURCE:
				getHasResource().clear();
				return;
			case DynamicPIMPackage.AGGREGATE__AGGREGATE_ROOT:
				setAggregateRoot((DomainObject)null);
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
			case DynamicPIMPackage.AGGREGATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DynamicPIMPackage.AGGREGATE__HAS_PROCESS:
				return hasProcess != null && !hasProcess.isEmpty();
			case DynamicPIMPackage.AGGREGATE__APPLICATION:
				return getApplication() != null;
			case DynamicPIMPackage.AGGREGATE__DOMAINOBJECTS:
				return domainobjects != null && !domainobjects.isEmpty();
			case DynamicPIMPackage.AGGREGATE__HAS_RESOURCE:
				return hasResource != null && !hasResource.isEmpty();
			case DynamicPIMPackage.AGGREGATE__AGGREGATE_ROOT:
				return aggregateRoot != null;
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
		result.append(')');
		return result.toString();
	}

} //AggregateImpl
