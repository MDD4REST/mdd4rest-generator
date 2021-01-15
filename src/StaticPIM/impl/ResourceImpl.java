/**
 */
package StaticPIM.impl;

import StaticPIM.CRUDActivity;
import StaticPIM.DTO;
import StaticPIM.InputRepresentation;
import StaticPIM.OutputRepresentation;
import StaticPIM.Resource;
import StaticPIM.StaticPIMPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link StaticPIM.impl.ResourceImpl#isIsAlgorithmic <em>Is Algorithmic</em>}</li>
 *   <li>{@link StaticPIM.impl.ResourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link StaticPIM.impl.ResourceImpl#getHasInputRepresentation <em>Has Input Representation</em>}</li>
 *   <li>{@link StaticPIM.impl.ResourceImpl#getHasActivities <em>Has Activities</em>}</li>
 *   <li>{@link StaticPIM.impl.ResourceImpl#getHasOutputRepresentation <em>Has Output Representation</em>}</li>
 *   <li>{@link StaticPIM.impl.ResourceImpl#getModel <em>Model</em>}</li>
 *   <li>{@link StaticPIM.impl.ResourceImpl#getHasRelatedResource <em>Has Related Resource</em>}</li>
 *   <li>{@link StaticPIM.impl.ResourceImpl#getIsRelatedResource <em>Is Related Resource</em>}</li>
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
	protected EList<CRUDActivity> hasActivities;

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
	 * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected DTO model;

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
	 * The cached value of the '{@link #getIsRelatedResource() <em>Is Related Resource</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsRelatedResource()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> isRelatedResource;

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
		return StaticPIMPackage.Literals.RESOURCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StaticPIMPackage.RESOURCE__IS_ALGORITHMIC, oldIsAlgorithmic, isAlgorithmic));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StaticPIMPackage.RESOURCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InputRepresentation> getHasInputRepresentation() {
		if (hasInputRepresentation == null) {
			hasInputRepresentation = new EObjectContainmentEList<InputRepresentation>(InputRepresentation.class, this, StaticPIMPackage.RESOURCE__HAS_INPUT_REPRESENTATION);
		}
		return hasInputRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CRUDActivity> getHasActivities() {
		if (hasActivities == null) {
			hasActivities = new EObjectContainmentEList<CRUDActivity>(CRUDActivity.class, this, StaticPIMPackage.RESOURCE__HAS_ACTIVITIES);
		}
		return hasActivities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OutputRepresentation> getHasOutputRepresentation() {
		if (hasOutputRepresentation == null) {
			hasOutputRepresentation = new EObjectContainmentEList<OutputRepresentation>(OutputRepresentation.class, this, StaticPIMPackage.RESOURCE__HAS_OUTPUT_REPRESENTATION);
		}
		return hasOutputRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DTO getModel() {
		if (model != null && model.eIsProxy()) {
			InternalEObject oldModel = (InternalEObject)model;
			model = (DTO)eResolveProxy(oldModel);
			if (model != oldModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StaticPIMPackage.RESOURCE__MODEL, oldModel, model));
			}
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTO basicGetModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModel(DTO newModel) {
		DTO oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaticPIMPackage.RESOURCE__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Resource> getHasRelatedResource() {
		if (hasRelatedResource == null) {
			hasRelatedResource = new EObjectResolvingEList<Resource>(Resource.class, this, StaticPIMPackage.RESOURCE__HAS_RELATED_RESOURCE);
		}
		return hasRelatedResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Resource> getIsRelatedResource() {
		if (isRelatedResource == null) {
			isRelatedResource = new EObjectResolvingEList<Resource>(Resource.class, this, StaticPIMPackage.RESOURCE__IS_RELATED_RESOURCE);
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
			case StaticPIMPackage.RESOURCE__HAS_INPUT_REPRESENTATION:
				return ((InternalEList<?>)getHasInputRepresentation()).basicRemove(otherEnd, msgs);
			case StaticPIMPackage.RESOURCE__HAS_ACTIVITIES:
				return ((InternalEList<?>)getHasActivities()).basicRemove(otherEnd, msgs);
			case StaticPIMPackage.RESOURCE__HAS_OUTPUT_REPRESENTATION:
				return ((InternalEList<?>)getHasOutputRepresentation()).basicRemove(otherEnd, msgs);
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
			case StaticPIMPackage.RESOURCE__IS_ALGORITHMIC:
				return isIsAlgorithmic();
			case StaticPIMPackage.RESOURCE__NAME:
				return getName();
			case StaticPIMPackage.RESOURCE__HAS_INPUT_REPRESENTATION:
				return getHasInputRepresentation();
			case StaticPIMPackage.RESOURCE__HAS_ACTIVITIES:
				return getHasActivities();
			case StaticPIMPackage.RESOURCE__HAS_OUTPUT_REPRESENTATION:
				return getHasOutputRepresentation();
			case StaticPIMPackage.RESOURCE__MODEL:
				if (resolve) return getModel();
				return basicGetModel();
			case StaticPIMPackage.RESOURCE__HAS_RELATED_RESOURCE:
				return getHasRelatedResource();
			case StaticPIMPackage.RESOURCE__IS_RELATED_RESOURCE:
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
			case StaticPIMPackage.RESOURCE__IS_ALGORITHMIC:
				setIsAlgorithmic((Boolean)newValue);
				return;
			case StaticPIMPackage.RESOURCE__NAME:
				setName((String)newValue);
				return;
			case StaticPIMPackage.RESOURCE__HAS_INPUT_REPRESENTATION:
				getHasInputRepresentation().clear();
				getHasInputRepresentation().addAll((Collection<? extends InputRepresentation>)newValue);
				return;
			case StaticPIMPackage.RESOURCE__HAS_ACTIVITIES:
				getHasActivities().clear();
				getHasActivities().addAll((Collection<? extends CRUDActivity>)newValue);
				return;
			case StaticPIMPackage.RESOURCE__HAS_OUTPUT_REPRESENTATION:
				getHasOutputRepresentation().clear();
				getHasOutputRepresentation().addAll((Collection<? extends OutputRepresentation>)newValue);
				return;
			case StaticPIMPackage.RESOURCE__MODEL:
				setModel((DTO)newValue);
				return;
			case StaticPIMPackage.RESOURCE__HAS_RELATED_RESOURCE:
				getHasRelatedResource().clear();
				getHasRelatedResource().addAll((Collection<? extends Resource>)newValue);
				return;
			case StaticPIMPackage.RESOURCE__IS_RELATED_RESOURCE:
				getIsRelatedResource().clear();
				getIsRelatedResource().addAll((Collection<? extends Resource>)newValue);
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
			case StaticPIMPackage.RESOURCE__IS_ALGORITHMIC:
				setIsAlgorithmic(IS_ALGORITHMIC_EDEFAULT);
				return;
			case StaticPIMPackage.RESOURCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StaticPIMPackage.RESOURCE__HAS_INPUT_REPRESENTATION:
				getHasInputRepresentation().clear();
				return;
			case StaticPIMPackage.RESOURCE__HAS_ACTIVITIES:
				getHasActivities().clear();
				return;
			case StaticPIMPackage.RESOURCE__HAS_OUTPUT_REPRESENTATION:
				getHasOutputRepresentation().clear();
				return;
			case StaticPIMPackage.RESOURCE__MODEL:
				setModel((DTO)null);
				return;
			case StaticPIMPackage.RESOURCE__HAS_RELATED_RESOURCE:
				getHasRelatedResource().clear();
				return;
			case StaticPIMPackage.RESOURCE__IS_RELATED_RESOURCE:
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
			case StaticPIMPackage.RESOURCE__IS_ALGORITHMIC:
				return isAlgorithmic != IS_ALGORITHMIC_EDEFAULT;
			case StaticPIMPackage.RESOURCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StaticPIMPackage.RESOURCE__HAS_INPUT_REPRESENTATION:
				return hasInputRepresentation != null && !hasInputRepresentation.isEmpty();
			case StaticPIMPackage.RESOURCE__HAS_ACTIVITIES:
				return hasActivities != null && !hasActivities.isEmpty();
			case StaticPIMPackage.RESOURCE__HAS_OUTPUT_REPRESENTATION:
				return hasOutputRepresentation != null && !hasOutputRepresentation.isEmpty();
			case StaticPIMPackage.RESOURCE__MODEL:
				return model != null;
			case StaticPIMPackage.RESOURCE__HAS_RELATED_RESOURCE:
				return hasRelatedResource != null && !hasRelatedResource.isEmpty();
			case StaticPIMPackage.RESOURCE__IS_RELATED_RESOURCE:
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
