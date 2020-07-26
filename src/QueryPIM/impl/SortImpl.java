/**
 */
package QueryPIM.impl;

import QueryPIM.OrderBy;
import QueryPIM.QueryPIMMetamodelPackage;
import QueryPIM.Sort;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sort</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QueryPIM.impl.SortImpl#getOrderby <em>Orderby</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SortImpl extends MinimalEObjectImpl.Container implements Sort {
	/**
	 * The cached value of the '{@link #getOrderby() <em>Orderby</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderby()
	 * @generated
	 * @ordered
	 */
	protected EList<OrderBy> orderby;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPIMMetamodelPackage.Literals.SORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OrderBy> getOrderby() {
		if (orderby == null) {
			orderby = new EObjectContainmentEList<OrderBy>(OrderBy.class, this, QueryPIMMetamodelPackage.SORT__ORDERBY);
		}
		return orderby;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPIMMetamodelPackage.SORT__ORDERBY:
				return ((InternalEList<?>)getOrderby()).basicRemove(otherEnd, msgs);
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
			case QueryPIMMetamodelPackage.SORT__ORDERBY:
				return getOrderby();
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
			case QueryPIMMetamodelPackage.SORT__ORDERBY:
				getOrderby().clear();
				getOrderby().addAll((Collection<? extends OrderBy>)newValue);
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
			case QueryPIMMetamodelPackage.SORT__ORDERBY:
				getOrderby().clear();
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
			case QueryPIMMetamodelPackage.SORT__ORDERBY:
				return orderby != null && !orderby.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SortImpl
