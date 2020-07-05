/**
 */
package ServicePIM.impl;

import ServicePIM.Multiplicity;
import ServicePIM.RelatedResource;
import ServicePIM.Resource;
import ServicePIM.ServicePIMPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Related Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ServicePIM.impl.RelatedResourceImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link ServicePIM.impl.RelatedResourceImpl#getFromResource <em>From Resource</em>}</li>
 *   <li>{@link ServicePIM.impl.RelatedResourceImpl#getToResource <em>To Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelatedResourceImpl extends MinimalEObjectImpl.Container implements RelatedResource {
	/**
	 * The default value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final Multiplicity MULTIPLICITY_EDEFAULT = Multiplicity.ONE_TO_MANY;

	/**
	 * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected Multiplicity multiplicity = MULTIPLICITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFromResource() <em>From Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromResource()
	 * @generated
	 * @ordered
	 */
	protected Resource fromResource;

	/**
	 * The cached value of the '{@link #getToResource() <em>To Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToResource()
	 * @generated
	 * @ordered
	 */
	protected Resource toResource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatedResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePIMPackage.Literals.RELATED_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Multiplicity getMultiplicity() {
		return multiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiplicity(Multiplicity newMultiplicity) {
		Multiplicity oldMultiplicity = multiplicity;
		multiplicity = newMultiplicity == null ? MULTIPLICITY_EDEFAULT : newMultiplicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePIMPackage.RELATED_RESOURCE__MULTIPLICITY, oldMultiplicity, multiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resource getFromResource() {
		if (fromResource != null && fromResource.eIsProxy()) {
			InternalEObject oldFromResource = (InternalEObject)fromResource;
			fromResource = (Resource)eResolveProxy(oldFromResource);
			if (fromResource != oldFromResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServicePIMPackage.RELATED_RESOURCE__FROM_RESOURCE, oldFromResource, fromResource));
			}
		}
		return fromResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetFromResource() {
		return fromResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromResource(Resource newFromResource) {
		Resource oldFromResource = fromResource;
		fromResource = newFromResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePIMPackage.RELATED_RESOURCE__FROM_RESOURCE, oldFromResource, fromResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resource getToResource() {
		if (toResource != null && toResource.eIsProxy()) {
			InternalEObject oldToResource = (InternalEObject)toResource;
			toResource = (Resource)eResolveProxy(oldToResource);
			if (toResource != oldToResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServicePIMPackage.RELATED_RESOURCE__TO_RESOURCE, oldToResource, toResource));
			}
		}
		return toResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetToResource() {
		return toResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToResource(Resource newToResource) {
		Resource oldToResource = toResource;
		toResource = newToResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePIMPackage.RELATED_RESOURCE__TO_RESOURCE, oldToResource, toResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicePIMPackage.RELATED_RESOURCE__MULTIPLICITY:
				return getMultiplicity();
			case ServicePIMPackage.RELATED_RESOURCE__FROM_RESOURCE:
				if (resolve) return getFromResource();
				return basicGetFromResource();
			case ServicePIMPackage.RELATED_RESOURCE__TO_RESOURCE:
				if (resolve) return getToResource();
				return basicGetToResource();
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
			case ServicePIMPackage.RELATED_RESOURCE__MULTIPLICITY:
				setMultiplicity((Multiplicity)newValue);
				return;
			case ServicePIMPackage.RELATED_RESOURCE__FROM_RESOURCE:
				setFromResource((Resource)newValue);
				return;
			case ServicePIMPackage.RELATED_RESOURCE__TO_RESOURCE:
				setToResource((Resource)newValue);
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
			case ServicePIMPackage.RELATED_RESOURCE__MULTIPLICITY:
				setMultiplicity(MULTIPLICITY_EDEFAULT);
				return;
			case ServicePIMPackage.RELATED_RESOURCE__FROM_RESOURCE:
				setFromResource((Resource)null);
				return;
			case ServicePIMPackage.RELATED_RESOURCE__TO_RESOURCE:
				setToResource((Resource)null);
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
			case ServicePIMPackage.RELATED_RESOURCE__MULTIPLICITY:
				return multiplicity != MULTIPLICITY_EDEFAULT;
			case ServicePIMPackage.RELATED_RESOURCE__FROM_RESOURCE:
				return fromResource != null;
			case ServicePIMPackage.RELATED_RESOURCE__TO_RESOURCE:
				return toResource != null;
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
		result.append(" (multiplicity: ");
		result.append(multiplicity);
		result.append(')');
		return result.toString();
	}

} //RelatedResourceImpl
