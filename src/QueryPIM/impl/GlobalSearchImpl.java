/**
 */
package QueryPIM.impl;

import QueryPIM.GlobalSearch;
import QueryPIM.QueryPIMMetamodelPackage;
import QueryPIM.ResourceSearch;

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
 * An implementation of the model object '<em><b>Global Search</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QueryPIM.impl.GlobalSearchImpl#getResourcesearch <em>Resourcesearch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlobalSearchImpl extends MinimalEObjectImpl.Container implements GlobalSearch {
	/**
	 * The cached value of the '{@link #getResourcesearch() <em>Resourcesearch</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourcesearch()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceSearch> resourcesearch;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalSearchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPIMMetamodelPackage.Literals.GLOBAL_SEARCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResourceSearch> getResourcesearch() {
		if (resourcesearch == null) {
			resourcesearch = new EObjectContainmentEList<ResourceSearch>(ResourceSearch.class, this, QueryPIMMetamodelPackage.GLOBAL_SEARCH__RESOURCESEARCH);
		}
		return resourcesearch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPIMMetamodelPackage.GLOBAL_SEARCH__RESOURCESEARCH:
				return ((InternalEList<?>)getResourcesearch()).basicRemove(otherEnd, msgs);
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
			case QueryPIMMetamodelPackage.GLOBAL_SEARCH__RESOURCESEARCH:
				return getResourcesearch();
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
			case QueryPIMMetamodelPackage.GLOBAL_SEARCH__RESOURCESEARCH:
				getResourcesearch().clear();
				getResourcesearch().addAll((Collection<? extends ResourceSearch>)newValue);
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
			case QueryPIMMetamodelPackage.GLOBAL_SEARCH__RESOURCESEARCH:
				getResourcesearch().clear();
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
			case QueryPIMMetamodelPackage.GLOBAL_SEARCH__RESOURCESEARCH:
				return resourcesearch != null && !resourcesearch.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GlobalSearchImpl
