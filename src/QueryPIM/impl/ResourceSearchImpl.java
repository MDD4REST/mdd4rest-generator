/**
 */
package QueryPIM.impl;

import QueryPIM.QueryPIMMetamodelPackage;
import QueryPIM.ResourceSearch;

import ServicePIM.Property;
import ServicePIM.Resource;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Search</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QueryPIM.impl.ResourceSearchImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link QueryPIM.impl.ResourceSearchImpl#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceSearchImpl extends MinimalEObjectImpl.Container implements ResourceSearch {
	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected Resource resource;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> property;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceSearchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPIMMetamodelPackage.Literals.RESOURCE_SEARCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resource getResource() {
		if (resource != null && resource.eIsProxy()) {
			InternalEObject oldResource = (InternalEObject)resource;
			resource = (Resource)eResolveProxy(oldResource);
			if (resource != oldResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QueryPIMMetamodelPackage.RESOURCE_SEARCH__RESOURCE, oldResource, resource));
			}
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResource(Resource newResource) {
		Resource oldResource = resource;
		resource = newResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPIMMetamodelPackage.RESOURCE_SEARCH__RESOURCE, oldResource, resource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProperty() {
		if (property == null) {
			property = new EObjectResolvingEList<Property>(Property.class, this, QueryPIMMetamodelPackage.RESOURCE_SEARCH__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QueryPIMMetamodelPackage.RESOURCE_SEARCH__RESOURCE:
				if (resolve) return getResource();
				return basicGetResource();
			case QueryPIMMetamodelPackage.RESOURCE_SEARCH__PROPERTY:
				return getProperty();
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
			case QueryPIMMetamodelPackage.RESOURCE_SEARCH__RESOURCE:
				setResource((Resource)newValue);
				return;
			case QueryPIMMetamodelPackage.RESOURCE_SEARCH__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends Property>)newValue);
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
			case QueryPIMMetamodelPackage.RESOURCE_SEARCH__RESOURCE:
				setResource((Resource)null);
				return;
			case QueryPIMMetamodelPackage.RESOURCE_SEARCH__PROPERTY:
				getProperty().clear();
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
			case QueryPIMMetamodelPackage.RESOURCE_SEARCH__RESOURCE:
				return resource != null;
			case QueryPIMMetamodelPackage.RESOURCE_SEARCH__PROPERTY:
				return property != null && !property.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResourceSearchImpl
