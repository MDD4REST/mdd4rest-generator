/**
 */
package ServicePIM.impl;

import ServicePIM.CRUDActivity;
import ServicePIM.InputRepresentation;
import ServicePIM.OutputRepresentation;
import ServicePIM.Property;
import ServicePIM.RelatedResource;
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
 *   <li>{@link ServicePIM.impl.ResourceImpl#getHasCRUDActivity <em>Has CRUD Activity</em>}</li>
 *   <li>{@link ServicePIM.impl.ResourceImpl#getHasProperty <em>Has Property</em>}</li>
 *   <li>{@link ServicePIM.impl.ResourceImpl#getHasOutputRepresentation <em>Has Output Representation</em>}</li>
 *   <li>{@link ServicePIM.impl.ResourceImpl#getHasRelatedResource <em>Has Related Resource</em>}</li>
 *   <li>{@link ServicePIM.impl.ResourceImpl#getIsRelatedResource <em>Is Related Resource</em>}</li>
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
	 * The cached value of the '{@link #getHasCRUDActivity() <em>Has CRUD Activity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasCRUDActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<CRUDActivity> hasCRUDActivity;

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
	 * The cached value of the '{@link #getHasRelatedResource() <em>Has Related Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasRelatedResource()
	 * @generated
	 * @ordered
	 */
	protected EList<RelatedResource> hasRelatedResource;

	/**
	 * The cached value of the '{@link #getIsRelatedResource() <em>Is Related Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsRelatedResource()
	 * @generated
	 * @ordered
	 */
	protected EList<RelatedResource> isRelatedResource;

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
	public EList<CRUDActivity> getHasCRUDActivity() {
		if (hasCRUDActivity == null) {
			hasCRUDActivity = new EObjectContainmentEList<CRUDActivity>(CRUDActivity.class, this, ServicePIMPackage.RESOURCE__HAS_CRUD_ACTIVITY);
		}
		return hasCRUDActivity;
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
	public EList<RelatedResource> getHasRelatedResource() {
		if (hasRelatedResource == null) {
			hasRelatedResource = new EObjectContainmentEList<RelatedResource>(RelatedResource.class, this, ServicePIMPackage.RESOURCE__HAS_RELATED_RESOURCE);
		}
		return hasRelatedResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedResource> getIsRelatedResource() {
		if (isRelatedResource == null) {
			isRelatedResource = new EObjectContainmentEList<RelatedResource>(RelatedResource.class, this, ServicePIMPackage.RESOURCE__IS_RELATED_RESOURCE);
		}
		return isRelatedResource;
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
			case ServicePIMPackage.RESOURCE__HAS_CRUD_ACTIVITY:
				return ((InternalEList<?>)getHasCRUDActivity()).basicRemove(otherEnd, msgs);
			case ServicePIMPackage.RESOURCE__HAS_PROPERTY:
				return ((InternalEList<?>)getHasProperty()).basicRemove(otherEnd, msgs);
			case ServicePIMPackage.RESOURCE__HAS_OUTPUT_REPRESENTATION:
				return ((InternalEList<?>)getHasOutputRepresentation()).basicRemove(otherEnd, msgs);
			case ServicePIMPackage.RESOURCE__HAS_RELATED_RESOURCE:
				return ((InternalEList<?>)getHasRelatedResource()).basicRemove(otherEnd, msgs);
			case ServicePIMPackage.RESOURCE__IS_RELATED_RESOURCE:
				return ((InternalEList<?>)getIsRelatedResource()).basicRemove(otherEnd, msgs);
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
			case ServicePIMPackage.RESOURCE__HAS_CRUD_ACTIVITY:
				return getHasCRUDActivity();
			case ServicePIMPackage.RESOURCE__HAS_PROPERTY:
				return getHasProperty();
			case ServicePIMPackage.RESOURCE__HAS_OUTPUT_REPRESENTATION:
				return getHasOutputRepresentation();
			case ServicePIMPackage.RESOURCE__HAS_RELATED_RESOURCE:
				return getHasRelatedResource();
			case ServicePIMPackage.RESOURCE__IS_RELATED_RESOURCE:
				return getIsRelatedResource();
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
			case ServicePIMPackage.RESOURCE__HAS_CRUD_ACTIVITY:
				getHasCRUDActivity().clear();
				getHasCRUDActivity().addAll((Collection<? extends CRUDActivity>)newValue);
				return;
			case ServicePIMPackage.RESOURCE__HAS_PROPERTY:
				getHasProperty().clear();
				getHasProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case ServicePIMPackage.RESOURCE__HAS_OUTPUT_REPRESENTATION:
				getHasOutputRepresentation().clear();
				getHasOutputRepresentation().addAll((Collection<? extends OutputRepresentation>)newValue);
				return;
			case ServicePIMPackage.RESOURCE__HAS_RELATED_RESOURCE:
				getHasRelatedResource().clear();
				getHasRelatedResource().addAll((Collection<? extends RelatedResource>)newValue);
				return;
			case ServicePIMPackage.RESOURCE__IS_RELATED_RESOURCE:
				getIsRelatedResource().clear();
				getIsRelatedResource().addAll((Collection<? extends RelatedResource>)newValue);
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
			case ServicePIMPackage.RESOURCE__HAS_CRUD_ACTIVITY:
				getHasCRUDActivity().clear();
				return;
			case ServicePIMPackage.RESOURCE__HAS_PROPERTY:
				getHasProperty().clear();
				return;
			case ServicePIMPackage.RESOURCE__HAS_OUTPUT_REPRESENTATION:
				getHasOutputRepresentation().clear();
				return;
			case ServicePIMPackage.RESOURCE__HAS_RELATED_RESOURCE:
				getHasRelatedResource().clear();
				return;
			case ServicePIMPackage.RESOURCE__IS_RELATED_RESOURCE:
				getIsRelatedResource().clear();
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
			case ServicePIMPackage.RESOURCE__HAS_CRUD_ACTIVITY:
				return hasCRUDActivity != null && !hasCRUDActivity.isEmpty();
			case ServicePIMPackage.RESOURCE__HAS_PROPERTY:
				return hasProperty != null && !hasProperty.isEmpty();
			case ServicePIMPackage.RESOURCE__HAS_OUTPUT_REPRESENTATION:
				return hasOutputRepresentation != null && !hasOutputRepresentation.isEmpty();
			case ServicePIMPackage.RESOURCE__HAS_RELATED_RESOURCE:
				return hasRelatedResource != null && !hasRelatedResource.isEmpty();
			case ServicePIMPackage.RESOURCE__IS_RELATED_RESOURCE:
				return isRelatedResource != null && !isRelatedResource.isEmpty();
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
