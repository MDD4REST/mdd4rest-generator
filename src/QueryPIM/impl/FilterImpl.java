/**
 */
package QueryPIM.impl;

import QueryPIM.Filter;
import QueryPIM.FilterOperation;
import QueryPIM.FilterType;
import QueryPIM.QueryPIMMetamodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QueryPIM.impl.FilterImpl#getFilterType <em>Filter Type</em>}</li>
 *   <li>{@link QueryPIM.impl.FilterImpl#getFilterOperations <em>Filter Operations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FilterImpl extends QueryImpl implements Filter {
	/**
	 * The default value of the '{@link #getFilterType() <em>Filter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterType()
	 * @generated
	 * @ordered
	 */
	protected static final FilterType FILTER_TYPE_EDEFAULT = FilterType.STRING;

	/**
	 * The cached value of the '{@link #getFilterType() <em>Filter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterType()
	 * @generated
	 * @ordered
	 */
	protected FilterType filterType = FILTER_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFilterOperations() <em>Filter Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<FilterOperation> filterOperations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPIMMetamodelPackage.Literals.FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FilterType getFilterType() {
		return filterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFilterType(FilterType newFilterType) {
		FilterType oldFilterType = filterType;
		filterType = newFilterType == null ? FILTER_TYPE_EDEFAULT : newFilterType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPIMMetamodelPackage.FILTER__FILTER_TYPE, oldFilterType, filterType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FilterOperation> getFilterOperations() {
		if (filterOperations == null) {
			filterOperations = new EObjectContainmentEList<FilterOperation>(FilterOperation.class, this, QueryPIMMetamodelPackage.FILTER__FILTER_OPERATIONS);
		}
		return filterOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPIMMetamodelPackage.FILTER__FILTER_OPERATIONS:
				return ((InternalEList<?>)getFilterOperations()).basicRemove(otherEnd, msgs);
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
			case QueryPIMMetamodelPackage.FILTER__FILTER_TYPE:
				return getFilterType();
			case QueryPIMMetamodelPackage.FILTER__FILTER_OPERATIONS:
				return getFilterOperations();
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
			case QueryPIMMetamodelPackage.FILTER__FILTER_TYPE:
				setFilterType((FilterType)newValue);
				return;
			case QueryPIMMetamodelPackage.FILTER__FILTER_OPERATIONS:
				getFilterOperations().clear();
				getFilterOperations().addAll((Collection<? extends FilterOperation>)newValue);
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
			case QueryPIMMetamodelPackage.FILTER__FILTER_TYPE:
				setFilterType(FILTER_TYPE_EDEFAULT);
				return;
			case QueryPIMMetamodelPackage.FILTER__FILTER_OPERATIONS:
				getFilterOperations().clear();
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
			case QueryPIMMetamodelPackage.FILTER__FILTER_TYPE:
				return filterType != FILTER_TYPE_EDEFAULT;
			case QueryPIMMetamodelPackage.FILTER__FILTER_OPERATIONS:
				return filterOperations != null && !filterOperations.isEmpty();
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
		result.append(" (filterType: ");
		result.append(filterType);
		result.append(')');
		return result.toString();
	}

} //FilterImpl
