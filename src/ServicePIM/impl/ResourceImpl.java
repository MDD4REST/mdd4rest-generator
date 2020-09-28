/**
 */
package ServicePIM.impl;

import QueryPIM.Caching;
import QueryPIM.Filter;
import QueryPIM.Pagination;
import QueryPIM.ScopeSearch;
import QueryPIM.Select;
import QueryPIM.Sort;
import ServicePIM.Activity;
import ServicePIM.Application;
import ServicePIM.InputRepresentation;
import ServicePIM.OutputRepresentation;
import ServicePIM.Property;
import ServicePIM.Relationship;
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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ServicePIM.impl.ResourceImpl#isIsAlgorithmic <em>Is Algorithmic</em>}</li>
 *   <li>{@link ServicePIM.impl.ResourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link ServicePIM.impl.ResourceImpl#getHasInputRepresentation <em>Has Input Representation</em>}</li>
 *   <li>{@link ServicePIM.impl.ResourceImpl#getHasActivities <em>Has Activities</em>}</li>
 *   <li>{@link ServicePIM.impl.ResourceImpl#getHasProperty <em>Has Property</em>}</li>
 *   <li>{@link ServicePIM.impl.ResourceImpl#getHasOutputRepresentation <em>Has Output Representation</em>}</li>
 *   <li>{@link ServicePIM.impl.ResourceImpl#getHasRelationship <em>Has Relationship</em>}</li>
 *   <li>{@link ServicePIM.impl.ResourceImpl#getFilters <em>Filters</em>}</li>
 *   <li>{@link ServicePIM.impl.ResourceImpl#getSort <em>Sort</em>}</li>
 *   <li>{@link ServicePIM.impl.ResourceImpl#getSelect <em>Select</em>}</li>
 *   <li>{@link ServicePIM.impl.ResourceImpl#getPagination <em>Pagination</em>}</li>
 *   <li>{@link ServicePIM.impl.ResourceImpl#getScopesearch <em>Scopesearch</em>}</li>
 *   <li>{@link ServicePIM.impl.ResourceImpl#getCaching <em>Caching</em>}</li>
 *   <li>{@link ServicePIM.impl.ResourceImpl#getApplications <em>Applications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceImpl extends MinimalEObjectImpl.Container implements Resource {
	/**
	 * The default value of the '{@link #isIsAlgorithmic() <em>Is Algorithmic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAlgorithmic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ALGORITHMIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAlgorithmic() <em>Is Algorithmic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAlgorithmic()
	 * @generated
	 * @ordered
	 */
	protected boolean isAlgorithmic = IS_ALGORITHMIC_EDEFAULT;

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
	 * The cached value of the '{@link #getHasInputRepresentation() <em>Has Input Representation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasInputRepresentation()
	 * @generated
	 * @ordered
	 */
	protected EList<InputRepresentation> hasInputRepresentation;

	/**
	 * The cached value of the '{@link #getHasActivities() <em>Has Activities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasActivities()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> hasActivities;

	/**
	 * The cached value of the '{@link #getHasProperty() <em>Has Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> hasProperty;

	/**
	 * The cached value of the '{@link #getHasOutputRepresentation() <em>Has Output Representation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasOutputRepresentation()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputRepresentation> hasOutputRepresentation;

	/**
	 * The cached value of the '{@link #getHasRelationship() <em>Has Relationship</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasRelationship()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> hasRelationship;

	/**
	 * The cached value of the '{@link #getFilters() <em>Filters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilters()
	 * @generated
	 * @ordered
	 */
	protected EList<Filter> filters;

	/**
	 * The cached value of the '{@link #getSort() <em>Sort</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSort()
	 * @generated
	 * @ordered
	 */
	protected EList<Sort> sort;

	/**
	 * The cached value of the '{@link #getSelect() <em>Select</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelect()
	 * @generated
	 * @ordered
	 */
	protected EList<Select> select;

	/**
	 * The cached value of the '{@link #getPagination() <em>Pagination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPagination()
	 * @generated
	 * @ordered
	 */
	protected Pagination pagination;

	/**
	 * The cached value of the '{@link #getScopesearch() <em>Scopesearch</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScopesearch()
	 * @generated
	 * @ordered
	 */
	protected EList<ScopeSearch> scopesearch;

	/**
	 * The cached value of the '{@link #getCaching() <em>Caching</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaching()
	 * @generated
	 * @ordered
	 */
	protected Caching caching;

	/**
	 * The cached value of the '{@link #getApplications() <em>Applications</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplications()
	 * @generated
	 * @ordered
	 */
	protected EList<Application> applications;

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
		return ServicePIMPackage.Literals.RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsAlgorithmic() {
		return isAlgorithmic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsAlgorithmic(boolean newIsAlgorithmic) {
		boolean oldIsAlgorithmic = isAlgorithmic;
		isAlgorithmic = newIsAlgorithmic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePIMPackage.RESOURCE__IS_ALGORITHMIC, oldIsAlgorithmic, isAlgorithmic));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePIMPackage.RESOURCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InputRepresentation> getHasInputRepresentation() {
		if (hasInputRepresentation == null) {
			hasInputRepresentation = new EObjectContainmentEList<InputRepresentation>(InputRepresentation.class, this, ServicePIMPackage.RESOURCE__HAS_INPUT_REPRESENTATION);
		}
		return hasInputRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Activity> getHasActivities() {
		if (hasActivities == null) {
			hasActivities = new EObjectContainmentEList<Activity>(Activity.class, this, ServicePIMPackage.RESOURCE__HAS_ACTIVITIES);
		}
		return hasActivities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getHasProperty() {
		if (hasProperty == null) {
			hasProperty = new EObjectContainmentEList<Property>(Property.class, this, ServicePIMPackage.RESOURCE__HAS_PROPERTY);
		}
		return hasProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OutputRepresentation> getHasOutputRepresentation() {
		if (hasOutputRepresentation == null) {
			hasOutputRepresentation = new EObjectContainmentEList<OutputRepresentation>(OutputRepresentation.class, this, ServicePIMPackage.RESOURCE__HAS_OUTPUT_REPRESENTATION);
		}
		return hasOutputRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Relationship> getHasRelationship() {
		if (hasRelationship == null) {
			hasRelationship = new EObjectContainmentEList<Relationship>(Relationship.class, this, ServicePIMPackage.RESOURCE__HAS_RELATIONSHIP);
		}
		return hasRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Filter> getFilters() {
		if (filters == null) {
			filters = new EObjectContainmentEList<Filter>(Filter.class, this, ServicePIMPackage.RESOURCE__FILTERS);
		}
		return filters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Sort> getSort() {
		if (sort == null) {
			sort = new EObjectContainmentEList<Sort>(Sort.class, this, ServicePIMPackage.RESOURCE__SORT);
		}
		return sort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Select> getSelect() {
		if (select == null) {
			select = new EObjectContainmentEList<Select>(Select.class, this, ServicePIMPackage.RESOURCE__SELECT);
		}
		return select;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pagination getPagination() {
		return pagination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPagination(Pagination newPagination, NotificationChain msgs) {
		Pagination oldPagination = pagination;
		pagination = newPagination;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicePIMPackage.RESOURCE__PAGINATION, oldPagination, newPagination);
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
	public void setPagination(Pagination newPagination) {
		if (newPagination != pagination) {
			NotificationChain msgs = null;
			if (pagination != null)
				msgs = ((InternalEObject)pagination).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicePIMPackage.RESOURCE__PAGINATION, null, msgs);
			if (newPagination != null)
				msgs = ((InternalEObject)newPagination).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServicePIMPackage.RESOURCE__PAGINATION, null, msgs);
			msgs = basicSetPagination(newPagination, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePIMPackage.RESOURCE__PAGINATION, newPagination, newPagination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ScopeSearch> getScopesearch() {
		if (scopesearch == null) {
			scopesearch = new EObjectContainmentEList<ScopeSearch>(ScopeSearch.class, this, ServicePIMPackage.RESOURCE__SCOPESEARCH);
		}
		return scopesearch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Caching getCaching() {
		return caching;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaching(Caching newCaching, NotificationChain msgs) {
		Caching oldCaching = caching;
		caching = newCaching;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicePIMPackage.RESOURCE__CACHING, oldCaching, newCaching);
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
	public void setCaching(Caching newCaching) {
		if (newCaching != caching) {
			NotificationChain msgs = null;
			if (caching != null)
				msgs = ((InternalEObject)caching).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicePIMPackage.RESOURCE__CACHING, null, msgs);
			if (newCaching != null)
				msgs = ((InternalEObject)newCaching).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServicePIMPackage.RESOURCE__CACHING, null, msgs);
			msgs = basicSetCaching(newCaching, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePIMPackage.RESOURCE__CACHING, newCaching, newCaching));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Application> getApplications() {
		if (applications == null) {
			applications = new EObjectWithInverseResolvingEList.ManyInverse<Application>(Application.class, this, ServicePIMPackage.RESOURCE__APPLICATIONS, ServicePIMPackage.APPLICATION__RESOURCES);
		}
		return applications;
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
			case ServicePIMPackage.RESOURCE__APPLICATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getApplications()).basicAdd(otherEnd, msgs);
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
			case ServicePIMPackage.RESOURCE__HAS_INPUT_REPRESENTATION:
				return ((InternalEList<?>)getHasInputRepresentation()).basicRemove(otherEnd, msgs);
			case ServicePIMPackage.RESOURCE__HAS_ACTIVITIES:
				return ((InternalEList<?>)getHasActivities()).basicRemove(otherEnd, msgs);
			case ServicePIMPackage.RESOURCE__HAS_PROPERTY:
				return ((InternalEList<?>)getHasProperty()).basicRemove(otherEnd, msgs);
			case ServicePIMPackage.RESOURCE__HAS_OUTPUT_REPRESENTATION:
				return ((InternalEList<?>)getHasOutputRepresentation()).basicRemove(otherEnd, msgs);
			case ServicePIMPackage.RESOURCE__HAS_RELATIONSHIP:
				return ((InternalEList<?>)getHasRelationship()).basicRemove(otherEnd, msgs);
			case ServicePIMPackage.RESOURCE__FILTERS:
				return ((InternalEList<?>)getFilters()).basicRemove(otherEnd, msgs);
			case ServicePIMPackage.RESOURCE__SORT:
				return ((InternalEList<?>)getSort()).basicRemove(otherEnd, msgs);
			case ServicePIMPackage.RESOURCE__SELECT:
				return ((InternalEList<?>)getSelect()).basicRemove(otherEnd, msgs);
			case ServicePIMPackage.RESOURCE__PAGINATION:
				return basicSetPagination(null, msgs);
			case ServicePIMPackage.RESOURCE__SCOPESEARCH:
				return ((InternalEList<?>)getScopesearch()).basicRemove(otherEnd, msgs);
			case ServicePIMPackage.RESOURCE__CACHING:
				return basicSetCaching(null, msgs);
			case ServicePIMPackage.RESOURCE__APPLICATIONS:
				return ((InternalEList<?>)getApplications()).basicRemove(otherEnd, msgs);
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
			case ServicePIMPackage.RESOURCE__IS_ALGORITHMIC:
				return isIsAlgorithmic();
			case ServicePIMPackage.RESOURCE__NAME:
				return getName();
			case ServicePIMPackage.RESOURCE__HAS_INPUT_REPRESENTATION:
				return getHasInputRepresentation();
			case ServicePIMPackage.RESOURCE__HAS_ACTIVITIES:
				return getHasActivities();
			case ServicePIMPackage.RESOURCE__HAS_PROPERTY:
				return getHasProperty();
			case ServicePIMPackage.RESOURCE__HAS_OUTPUT_REPRESENTATION:
				return getHasOutputRepresentation();
			case ServicePIMPackage.RESOURCE__HAS_RELATIONSHIP:
				return getHasRelationship();
			case ServicePIMPackage.RESOURCE__FILTERS:
				return getFilters();
			case ServicePIMPackage.RESOURCE__SORT:
				return getSort();
			case ServicePIMPackage.RESOURCE__SELECT:
				return getSelect();
			case ServicePIMPackage.RESOURCE__PAGINATION:
				return getPagination();
			case ServicePIMPackage.RESOURCE__SCOPESEARCH:
				return getScopesearch();
			case ServicePIMPackage.RESOURCE__CACHING:
				return getCaching();
			case ServicePIMPackage.RESOURCE__APPLICATIONS:
				return getApplications();
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
			case ServicePIMPackage.RESOURCE__IS_ALGORITHMIC:
				setIsAlgorithmic((Boolean)newValue);
				return;
			case ServicePIMPackage.RESOURCE__NAME:
				setName((String)newValue);
				return;
			case ServicePIMPackage.RESOURCE__HAS_INPUT_REPRESENTATION:
				getHasInputRepresentation().clear();
				getHasInputRepresentation().addAll((Collection<? extends InputRepresentation>)newValue);
				return;
			case ServicePIMPackage.RESOURCE__HAS_ACTIVITIES:
				getHasActivities().clear();
				getHasActivities().addAll((Collection<? extends Activity>)newValue);
				return;
			case ServicePIMPackage.RESOURCE__HAS_PROPERTY:
				getHasProperty().clear();
				getHasProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case ServicePIMPackage.RESOURCE__HAS_OUTPUT_REPRESENTATION:
				getHasOutputRepresentation().clear();
				getHasOutputRepresentation().addAll((Collection<? extends OutputRepresentation>)newValue);
				return;
			case ServicePIMPackage.RESOURCE__HAS_RELATIONSHIP:
				getHasRelationship().clear();
				getHasRelationship().addAll((Collection<? extends Relationship>)newValue);
				return;
			case ServicePIMPackage.RESOURCE__FILTERS:
				getFilters().clear();
				getFilters().addAll((Collection<? extends Filter>)newValue);
				return;
			case ServicePIMPackage.RESOURCE__SORT:
				getSort().clear();
				getSort().addAll((Collection<? extends Sort>)newValue);
				return;
			case ServicePIMPackage.RESOURCE__SELECT:
				getSelect().clear();
				getSelect().addAll((Collection<? extends Select>)newValue);
				return;
			case ServicePIMPackage.RESOURCE__PAGINATION:
				setPagination((Pagination)newValue);
				return;
			case ServicePIMPackage.RESOURCE__SCOPESEARCH:
				getScopesearch().clear();
				getScopesearch().addAll((Collection<? extends ScopeSearch>)newValue);
				return;
			case ServicePIMPackage.RESOURCE__CACHING:
				setCaching((Caching)newValue);
				return;
			case ServicePIMPackage.RESOURCE__APPLICATIONS:
				getApplications().clear();
				getApplications().addAll((Collection<? extends Application>)newValue);
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
			case ServicePIMPackage.RESOURCE__IS_ALGORITHMIC:
				setIsAlgorithmic(IS_ALGORITHMIC_EDEFAULT);
				return;
			case ServicePIMPackage.RESOURCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ServicePIMPackage.RESOURCE__HAS_INPUT_REPRESENTATION:
				getHasInputRepresentation().clear();
				return;
			case ServicePIMPackage.RESOURCE__HAS_ACTIVITIES:
				getHasActivities().clear();
				return;
			case ServicePIMPackage.RESOURCE__HAS_PROPERTY:
				getHasProperty().clear();
				return;
			case ServicePIMPackage.RESOURCE__HAS_OUTPUT_REPRESENTATION:
				getHasOutputRepresentation().clear();
				return;
			case ServicePIMPackage.RESOURCE__HAS_RELATIONSHIP:
				getHasRelationship().clear();
				return;
			case ServicePIMPackage.RESOURCE__FILTERS:
				getFilters().clear();
				return;
			case ServicePIMPackage.RESOURCE__SORT:
				getSort().clear();
				return;
			case ServicePIMPackage.RESOURCE__SELECT:
				getSelect().clear();
				return;
			case ServicePIMPackage.RESOURCE__PAGINATION:
				setPagination((Pagination)null);
				return;
			case ServicePIMPackage.RESOURCE__SCOPESEARCH:
				getScopesearch().clear();
				return;
			case ServicePIMPackage.RESOURCE__CACHING:
				setCaching((Caching)null);
				return;
			case ServicePIMPackage.RESOURCE__APPLICATIONS:
				getApplications().clear();
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
			case ServicePIMPackage.RESOURCE__IS_ALGORITHMIC:
				return isAlgorithmic != IS_ALGORITHMIC_EDEFAULT;
			case ServicePIMPackage.RESOURCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ServicePIMPackage.RESOURCE__HAS_INPUT_REPRESENTATION:
				return hasInputRepresentation != null && !hasInputRepresentation.isEmpty();
			case ServicePIMPackage.RESOURCE__HAS_ACTIVITIES:
				return hasActivities != null && !hasActivities.isEmpty();
			case ServicePIMPackage.RESOURCE__HAS_PROPERTY:
				return hasProperty != null && !hasProperty.isEmpty();
			case ServicePIMPackage.RESOURCE__HAS_OUTPUT_REPRESENTATION:
				return hasOutputRepresentation != null && !hasOutputRepresentation.isEmpty();
			case ServicePIMPackage.RESOURCE__HAS_RELATIONSHIP:
				return hasRelationship != null && !hasRelationship.isEmpty();
			case ServicePIMPackage.RESOURCE__FILTERS:
				return filters != null && !filters.isEmpty();
			case ServicePIMPackage.RESOURCE__SORT:
				return sort != null && !sort.isEmpty();
			case ServicePIMPackage.RESOURCE__SELECT:
				return select != null && !select.isEmpty();
			case ServicePIMPackage.RESOURCE__PAGINATION:
				return pagination != null;
			case ServicePIMPackage.RESOURCE__SCOPESEARCH:
				return scopesearch != null && !scopesearch.isEmpty();
			case ServicePIMPackage.RESOURCE__CACHING:
				return caching != null;
			case ServicePIMPackage.RESOURCE__APPLICATIONS:
				return applications != null && !applications.isEmpty();
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
		result.append(" (isAlgorithmic: ");
		result.append(isAlgorithmic);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ResourceImpl
