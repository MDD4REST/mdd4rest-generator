/**
 */
package DynamicPIM.impl;

import DynamicPIM.Aggregate;
import DynamicPIM.Create;
import DynamicPIM.Delete;
import DynamicPIM.DynamicPIMPackage;
import DynamicPIM.Other;
import DynamicPIM.Read;
import DynamicPIM.Resource;

import DynamicPIM.ResourceActivity;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DynamicPIM.impl.ResourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link DynamicPIM.impl.ResourceImpl#getHasRelatedResource <em>Has Related Resource</em>}</li>
 *   <li>{@link DynamicPIM.impl.ResourceImpl#getIsRelatedResource <em>Is Related Resource</em>}</li>
 *   <li>{@link DynamicPIM.impl.ResourceImpl#getReadActivity <em>Read Activity</em>}</li>
 *   <li>{@link DynamicPIM.impl.ResourceImpl#getCreateActivity <em>Create Activity</em>}</li>
 *   <li>{@link DynamicPIM.impl.ResourceImpl#getDeleteActivity <em>Delete Activity</em>}</li>
 *   <li>{@link DynamicPIM.impl.ResourceImpl#getOtherActivities <em>Other Activities</em>}</li>
 *   <li>{@link DynamicPIM.impl.ResourceImpl#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link DynamicPIM.impl.ResourceImpl#getHasActivity <em>Has Activity</em>}</li>
 *   <li>{@link DynamicPIM.impl.ResourceImpl#getPathName <em>Path Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ResourceImpl extends EObjectImpl implements Resource {
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
	 * The cached value of the '{@link #getHasRelatedResource() <em>Has Related Resource</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasRelatedResource()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> hasRelatedResource;

	/**
	 * The cached value of the '{@link #getIsRelatedResource() <em>Is Related Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsRelatedResource()
	 * @generated
	 * @ordered
	 */
	protected Resource isRelatedResource;

	/**
	 * The cached value of the '{@link #getReadActivity() <em>Read Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadActivity()
	 * @generated
	 * @ordered
	 */
	protected Read readActivity;

	/**
	 * The cached value of the '{@link #getCreateActivity() <em>Create Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateActivity()
	 * @generated
	 * @ordered
	 */
	protected Create createActivity;

	/**
	 * The cached value of the '{@link #getDeleteActivity() <em>Delete Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleteActivity()
	 * @generated
	 * @ordered
	 */
	protected Delete deleteActivity;

	/**
	 * The cached value of the '{@link #getOtherActivities() <em>Other Activities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherActivities()
	 * @generated
	 * @ordered
	 */
	protected EList<Other> otherActivities;

	/**
	 * The cached value of the '{@link #getHasActivity() <em>Has Activity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceActivity> hasActivity;

	/**
	 * The default value of the '{@link #getPathName() <em>Path Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathName()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPathName() <em>Path Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathName()
	 * @generated
	 * @ordered
	 */
	protected String pathName = PATH_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DynamicPIMPackage.Literals.RESOURCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicPIMPackage.RESOURCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Resource> getHasRelatedResource() {
		if (hasRelatedResource == null) {
			hasRelatedResource = new EObjectWithInverseResolvingEList<Resource>(Resource.class, this, DynamicPIMPackage.RESOURCE__HAS_RELATED_RESOURCE, DynamicPIMPackage.RESOURCE__IS_RELATED_RESOURCE);
		}
		return hasRelatedResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resource getIsRelatedResource() {
		if (isRelatedResource != null && isRelatedResource.eIsProxy()) {
			InternalEObject oldIsRelatedResource = (InternalEObject)isRelatedResource;
			isRelatedResource = (Resource)eResolveProxy(oldIsRelatedResource);
			if (isRelatedResource != oldIsRelatedResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DynamicPIMPackage.RESOURCE__IS_RELATED_RESOURCE, oldIsRelatedResource, isRelatedResource));
			}
		}
		return isRelatedResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetIsRelatedResource() {
		return isRelatedResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsRelatedResource(Resource newIsRelatedResource, NotificationChain msgs) {
		Resource oldIsRelatedResource = isRelatedResource;
		isRelatedResource = newIsRelatedResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DynamicPIMPackage.RESOURCE__IS_RELATED_RESOURCE, oldIsRelatedResource, newIsRelatedResource);
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
	public void setIsRelatedResource(Resource newIsRelatedResource) {
		if (newIsRelatedResource != isRelatedResource) {
			NotificationChain msgs = null;
			if (isRelatedResource != null)
				msgs = ((InternalEObject)isRelatedResource).eInverseRemove(this, DynamicPIMPackage.RESOURCE__HAS_RELATED_RESOURCE, Resource.class, msgs);
			if (newIsRelatedResource != null)
				msgs = ((InternalEObject)newIsRelatedResource).eInverseAdd(this, DynamicPIMPackage.RESOURCE__HAS_RELATED_RESOURCE, Resource.class, msgs);
			msgs = basicSetIsRelatedResource(newIsRelatedResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicPIMPackage.RESOURCE__IS_RELATED_RESOURCE, newIsRelatedResource, newIsRelatedResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Read getReadActivity() {
		if (readActivity != null && readActivity.eIsProxy()) {
			InternalEObject oldReadActivity = (InternalEObject)readActivity;
			readActivity = (Read)eResolveProxy(oldReadActivity);
			if (readActivity != oldReadActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DynamicPIMPackage.RESOURCE__READ_ACTIVITY, oldReadActivity, readActivity));
			}
		}
		return readActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Read basicGetReadActivity() {
		return readActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReadActivity(Read newReadActivity) {
		Read oldReadActivity = readActivity;
		readActivity = newReadActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicPIMPackage.RESOURCE__READ_ACTIVITY, oldReadActivity, readActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Create getCreateActivity() {
		if (createActivity != null && createActivity.eIsProxy()) {
			InternalEObject oldCreateActivity = (InternalEObject)createActivity;
			createActivity = (Create)eResolveProxy(oldCreateActivity);
			if (createActivity != oldCreateActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DynamicPIMPackage.RESOURCE__CREATE_ACTIVITY, oldCreateActivity, createActivity));
			}
		}
		return createActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Create basicGetCreateActivity() {
		return createActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreateActivity(Create newCreateActivity) {
		Create oldCreateActivity = createActivity;
		createActivity = newCreateActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicPIMPackage.RESOURCE__CREATE_ACTIVITY, oldCreateActivity, createActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Delete getDeleteActivity() {
		if (deleteActivity != null && deleteActivity.eIsProxy()) {
			InternalEObject oldDeleteActivity = (InternalEObject)deleteActivity;
			deleteActivity = (Delete)eResolveProxy(oldDeleteActivity);
			if (deleteActivity != oldDeleteActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DynamicPIMPackage.RESOURCE__DELETE_ACTIVITY, oldDeleteActivity, deleteActivity));
			}
		}
		return deleteActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delete basicGetDeleteActivity() {
		return deleteActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeleteActivity(Delete newDeleteActivity) {
		Delete oldDeleteActivity = deleteActivity;
		deleteActivity = newDeleteActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicPIMPackage.RESOURCE__DELETE_ACTIVITY, oldDeleteActivity, deleteActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Other> getOtherActivities() {
		if (otherActivities == null) {
			otherActivities = new EObjectResolvingEList<Other>(Other.class, this, DynamicPIMPackage.RESOURCE__OTHER_ACTIVITIES);
		}
		return otherActivities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Aggregate getAggregate() {
		if (eContainerFeatureID() != DynamicPIMPackage.RESOURCE__AGGREGATE) return null;
		return (Aggregate)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAggregate(Aggregate newAggregate, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAggregate, DynamicPIMPackage.RESOURCE__AGGREGATE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAggregate(Aggregate newAggregate) {
		if (newAggregate != eInternalContainer() || (eContainerFeatureID() != DynamicPIMPackage.RESOURCE__AGGREGATE && newAggregate != null)) {
			if (EcoreUtil.isAncestor(this, newAggregate))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAggregate != null)
				msgs = ((InternalEObject)newAggregate).eInverseAdd(this, DynamicPIMPackage.AGGREGATE__HAS_RESOURCE, Aggregate.class, msgs);
			msgs = basicSetAggregate(newAggregate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicPIMPackage.RESOURCE__AGGREGATE, newAggregate, newAggregate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResourceActivity> getHasActivity() {
		if (hasActivity == null) {
			hasActivity = new EObjectContainmentEList<ResourceActivity>(ResourceActivity.class, this, DynamicPIMPackage.RESOURCE__HAS_ACTIVITY);
		}
		return hasActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPathName() {
		return pathName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPathName(String newPathName) {
		String oldPathName = pathName;
		pathName = newPathName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicPIMPackage.RESOURCE__PATH_NAME, oldPathName, pathName));
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
			case DynamicPIMPackage.RESOURCE__HAS_RELATED_RESOURCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasRelatedResource()).basicAdd(otherEnd, msgs);
			case DynamicPIMPackage.RESOURCE__IS_RELATED_RESOURCE:
				if (isRelatedResource != null)
					msgs = ((InternalEObject)isRelatedResource).eInverseRemove(this, DynamicPIMPackage.RESOURCE__HAS_RELATED_RESOURCE, Resource.class, msgs);
				return basicSetIsRelatedResource((Resource)otherEnd, msgs);
			case DynamicPIMPackage.RESOURCE__AGGREGATE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAggregate((Aggregate)otherEnd, msgs);
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
			case DynamicPIMPackage.RESOURCE__HAS_RELATED_RESOURCE:
				return ((InternalEList<?>)getHasRelatedResource()).basicRemove(otherEnd, msgs);
			case DynamicPIMPackage.RESOURCE__IS_RELATED_RESOURCE:
				return basicSetIsRelatedResource(null, msgs);
			case DynamicPIMPackage.RESOURCE__AGGREGATE:
				return basicSetAggregate(null, msgs);
			case DynamicPIMPackage.RESOURCE__HAS_ACTIVITY:
				return ((InternalEList<?>)getHasActivity()).basicRemove(otherEnd, msgs);
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
			case DynamicPIMPackage.RESOURCE__AGGREGATE:
				return eInternalContainer().eInverseRemove(this, DynamicPIMPackage.AGGREGATE__HAS_RESOURCE, Aggregate.class, msgs);
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
			case DynamicPIMPackage.RESOURCE__NAME:
				return getName();
			case DynamicPIMPackage.RESOURCE__HAS_RELATED_RESOURCE:
				return getHasRelatedResource();
			case DynamicPIMPackage.RESOURCE__IS_RELATED_RESOURCE:
				if (resolve) return getIsRelatedResource();
				return basicGetIsRelatedResource();
			case DynamicPIMPackage.RESOURCE__READ_ACTIVITY:
				if (resolve) return getReadActivity();
				return basicGetReadActivity();
			case DynamicPIMPackage.RESOURCE__CREATE_ACTIVITY:
				if (resolve) return getCreateActivity();
				return basicGetCreateActivity();
			case DynamicPIMPackage.RESOURCE__DELETE_ACTIVITY:
				if (resolve) return getDeleteActivity();
				return basicGetDeleteActivity();
			case DynamicPIMPackage.RESOURCE__OTHER_ACTIVITIES:
				return getOtherActivities();
			case DynamicPIMPackage.RESOURCE__AGGREGATE:
				return getAggregate();
			case DynamicPIMPackage.RESOURCE__HAS_ACTIVITY:
				return getHasActivity();
			case DynamicPIMPackage.RESOURCE__PATH_NAME:
				return getPathName();
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
			case DynamicPIMPackage.RESOURCE__NAME:
				setName((String)newValue);
				return;
			case DynamicPIMPackage.RESOURCE__HAS_RELATED_RESOURCE:
				getHasRelatedResource().clear();
				getHasRelatedResource().addAll((Collection<? extends Resource>)newValue);
				return;
			case DynamicPIMPackage.RESOURCE__IS_RELATED_RESOURCE:
				setIsRelatedResource((Resource)newValue);
				return;
			case DynamicPIMPackage.RESOURCE__READ_ACTIVITY:
				setReadActivity((Read)newValue);
				return;
			case DynamicPIMPackage.RESOURCE__CREATE_ACTIVITY:
				setCreateActivity((Create)newValue);
				return;
			case DynamicPIMPackage.RESOURCE__DELETE_ACTIVITY:
				setDeleteActivity((Delete)newValue);
				return;
			case DynamicPIMPackage.RESOURCE__OTHER_ACTIVITIES:
				getOtherActivities().clear();
				getOtherActivities().addAll((Collection<? extends Other>)newValue);
				return;
			case DynamicPIMPackage.RESOURCE__AGGREGATE:
				setAggregate((Aggregate)newValue);
				return;
			case DynamicPIMPackage.RESOURCE__HAS_ACTIVITY:
				getHasActivity().clear();
				getHasActivity().addAll((Collection<? extends ResourceActivity>)newValue);
				return;
			case DynamicPIMPackage.RESOURCE__PATH_NAME:
				setPathName((String)newValue);
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
			case DynamicPIMPackage.RESOURCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DynamicPIMPackage.RESOURCE__HAS_RELATED_RESOURCE:
				getHasRelatedResource().clear();
				return;
			case DynamicPIMPackage.RESOURCE__IS_RELATED_RESOURCE:
				setIsRelatedResource((Resource)null);
				return;
			case DynamicPIMPackage.RESOURCE__READ_ACTIVITY:
				setReadActivity((Read)null);
				return;
			case DynamicPIMPackage.RESOURCE__CREATE_ACTIVITY:
				setCreateActivity((Create)null);
				return;
			case DynamicPIMPackage.RESOURCE__DELETE_ACTIVITY:
				setDeleteActivity((Delete)null);
				return;
			case DynamicPIMPackage.RESOURCE__OTHER_ACTIVITIES:
				getOtherActivities().clear();
				return;
			case DynamicPIMPackage.RESOURCE__AGGREGATE:
				setAggregate((Aggregate)null);
				return;
			case DynamicPIMPackage.RESOURCE__HAS_ACTIVITY:
				getHasActivity().clear();
				return;
			case DynamicPIMPackage.RESOURCE__PATH_NAME:
				setPathName(PATH_NAME_EDEFAULT);
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
			case DynamicPIMPackage.RESOURCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DynamicPIMPackage.RESOURCE__HAS_RELATED_RESOURCE:
				return hasRelatedResource != null && !hasRelatedResource.isEmpty();
			case DynamicPIMPackage.RESOURCE__IS_RELATED_RESOURCE:
				return isRelatedResource != null;
			case DynamicPIMPackage.RESOURCE__READ_ACTIVITY:
				return readActivity != null;
			case DynamicPIMPackage.RESOURCE__CREATE_ACTIVITY:
				return createActivity != null;
			case DynamicPIMPackage.RESOURCE__DELETE_ACTIVITY:
				return deleteActivity != null;
			case DynamicPIMPackage.RESOURCE__OTHER_ACTIVITIES:
				return otherActivities != null && !otherActivities.isEmpty();
			case DynamicPIMPackage.RESOURCE__AGGREGATE:
				return getAggregate() != null;
			case DynamicPIMPackage.RESOURCE__HAS_ACTIVITY:
				return hasActivity != null && !hasActivity.isEmpty();
			case DynamicPIMPackage.RESOURCE__PATH_NAME:
				return PATH_NAME_EDEFAULT == null ? pathName != null : !PATH_NAME_EDEFAULT.equals(pathName);
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
		result.append(", pathName: ");
		result.append(pathName);
		result.append(')');
		return result.toString();
	}

} //ResourceImpl
