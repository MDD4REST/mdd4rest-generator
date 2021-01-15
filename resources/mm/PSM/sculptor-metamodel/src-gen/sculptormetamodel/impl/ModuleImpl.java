/**
 */
package sculptormetamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import sculptormetamodel.Application;
import sculptormetamodel.Consumer;
import sculptormetamodel.DomainObject;
import sculptormetamodel.Resource;
import sculptormetamodel.SculptormetamodelPackage;
import sculptormetamodel.Service;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sculptormetamodel.impl.ModuleImpl#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link sculptormetamodel.impl.ModuleImpl#isExternal <em>External</em>}</li>
 *   <li>{@link sculptormetamodel.impl.ModuleImpl#getPersistenceUnit <em>Persistence Unit</em>}</li>
 *   <li>{@link sculptormetamodel.impl.ModuleImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link sculptormetamodel.impl.ModuleImpl#getDomainObjects <em>Domain Objects</em>}</li>
 *   <li>{@link sculptormetamodel.impl.ModuleImpl#getServices <em>Services</em>}</li>
 *   <li>{@link sculptormetamodel.impl.ModuleImpl#getConsumers <em>Consumers</em>}</li>
 *   <li>{@link sculptormetamodel.impl.ModuleImpl#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleImpl extends NamedElementImpl implements sculptormetamodel.Module {
	/**
	 * The default value of the '{@link #getBasePackage() <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePackage()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBasePackage() <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePackage()
	 * @generated
	 * @ordered
	 */
	protected String basePackage = BASE_PACKAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #isExternal() <em>External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExternal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXTERNAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExternal() <em>External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExternal()
	 * @generated
	 * @ordered
	 */
	protected boolean external = EXTERNAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPersistenceUnit() <em>Persistence Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistenceUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSISTENCE_UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPersistenceUnit() <em>Persistence Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistenceUnit()
	 * @generated
	 * @ordered
	 */
	protected String persistenceUnit = PERSISTENCE_UNIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDomainObjects() <em>Domain Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainObject> domainObjects;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> services;

	/**
	 * The cached value of the '{@link #getConsumers() <em>Consumers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumers()
	 * @generated
	 * @ordered
	 */
	protected EList<Consumer> consumers;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> resources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SculptormetamodelPackage.Literals.MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBasePackage() {
		return basePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasePackage(String newBasePackage) {
		String oldBasePackage = basePackage;
		basePackage = newBasePackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptormetamodelPackage.MODULE__BASE_PACKAGE, oldBasePackage, basePackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExternal() {
		return external;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternal(boolean newExternal) {
		boolean oldExternal = external;
		external = newExternal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptormetamodelPackage.MODULE__EXTERNAL, oldExternal, external));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPersistenceUnit() {
		return persistenceUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersistenceUnit(String newPersistenceUnit) {
		String oldPersistenceUnit = persistenceUnit;
		persistenceUnit = newPersistenceUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptormetamodelPackage.MODULE__PERSISTENCE_UNIT, oldPersistenceUnit, persistenceUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application getApplication() {
		if (eContainerFeatureID() != SculptormetamodelPackage.MODULE__APPLICATION) return null;
		return (Application)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application basicGetApplication() {
		if (eContainerFeatureID() != SculptormetamodelPackage.MODULE__APPLICATION) return null;
		return (Application)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplication(Application newApplication, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newApplication, SculptormetamodelPackage.MODULE__APPLICATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplication(Application newApplication) {
		if (newApplication != eInternalContainer() || (eContainerFeatureID() != SculptormetamodelPackage.MODULE__APPLICATION && newApplication != null)) {
			if (EcoreUtil.isAncestor(this, newApplication))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newApplication != null)
				msgs = ((InternalEObject)newApplication).eInverseAdd(this, SculptormetamodelPackage.APPLICATION__MODULES, Application.class, msgs);
			msgs = basicSetApplication(newApplication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SculptormetamodelPackage.MODULE__APPLICATION, newApplication, newApplication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainObject> getDomainObjects() {
		if (domainObjects == null) {
			domainObjects = new EObjectContainmentWithInverseEList<DomainObject>(DomainObject.class, this, SculptormetamodelPackage.MODULE__DOMAIN_OBJECTS, SculptormetamodelPackage.DOMAIN_OBJECT__MODULE);
		}
		return domainObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getServices() {
		if (services == null) {
			services = new EObjectContainmentWithInverseEList<Service>(Service.class, this, SculptormetamodelPackage.MODULE__SERVICES, SculptormetamodelPackage.SERVICE__MODULE);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Consumer> getConsumers() {
		if (consumers == null) {
			consumers = new EObjectContainmentWithInverseEList<Consumer>(Consumer.class, this, SculptormetamodelPackage.MODULE__CONSUMERS, SculptormetamodelPackage.CONSUMER__MODULE);
		}
		return consumers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentWithInverseEList<Resource>(Resource.class, this, SculptormetamodelPackage.MODULE__RESOURCES, SculptormetamodelPackage.RESOURCE__MODULE);
		}
		return resources;
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
			case SculptormetamodelPackage.MODULE__APPLICATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetApplication((Application)otherEnd, msgs);
			case SculptormetamodelPackage.MODULE__DOMAIN_OBJECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDomainObjects()).basicAdd(otherEnd, msgs);
			case SculptormetamodelPackage.MODULE__SERVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServices()).basicAdd(otherEnd, msgs);
			case SculptormetamodelPackage.MODULE__CONSUMERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConsumers()).basicAdd(otherEnd, msgs);
			case SculptormetamodelPackage.MODULE__RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResources()).basicAdd(otherEnd, msgs);
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
			case SculptormetamodelPackage.MODULE__APPLICATION:
				return basicSetApplication(null, msgs);
			case SculptormetamodelPackage.MODULE__DOMAIN_OBJECTS:
				return ((InternalEList<?>)getDomainObjects()).basicRemove(otherEnd, msgs);
			case SculptormetamodelPackage.MODULE__SERVICES:
				return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
			case SculptormetamodelPackage.MODULE__CONSUMERS:
				return ((InternalEList<?>)getConsumers()).basicRemove(otherEnd, msgs);
			case SculptormetamodelPackage.MODULE__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
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
			case SculptormetamodelPackage.MODULE__APPLICATION:
				return eInternalContainer().eInverseRemove(this, SculptormetamodelPackage.APPLICATION__MODULES, Application.class, msgs);
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
			case SculptormetamodelPackage.MODULE__BASE_PACKAGE:
				return getBasePackage();
			case SculptormetamodelPackage.MODULE__EXTERNAL:
				return isExternal();
			case SculptormetamodelPackage.MODULE__PERSISTENCE_UNIT:
				return getPersistenceUnit();
			case SculptormetamodelPackage.MODULE__APPLICATION:
				if (resolve) return getApplication();
				return basicGetApplication();
			case SculptormetamodelPackage.MODULE__DOMAIN_OBJECTS:
				return getDomainObjects();
			case SculptormetamodelPackage.MODULE__SERVICES:
				return getServices();
			case SculptormetamodelPackage.MODULE__CONSUMERS:
				return getConsumers();
			case SculptormetamodelPackage.MODULE__RESOURCES:
				return getResources();
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
			case SculptormetamodelPackage.MODULE__BASE_PACKAGE:
				setBasePackage((String)newValue);
				return;
			case SculptormetamodelPackage.MODULE__EXTERNAL:
				setExternal((Boolean)newValue);
				return;
			case SculptormetamodelPackage.MODULE__PERSISTENCE_UNIT:
				setPersistenceUnit((String)newValue);
				return;
			case SculptormetamodelPackage.MODULE__APPLICATION:
				setApplication((Application)newValue);
				return;
			case SculptormetamodelPackage.MODULE__DOMAIN_OBJECTS:
				getDomainObjects().clear();
				getDomainObjects().addAll((Collection<? extends DomainObject>)newValue);
				return;
			case SculptormetamodelPackage.MODULE__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends Service>)newValue);
				return;
			case SculptormetamodelPackage.MODULE__CONSUMERS:
				getConsumers().clear();
				getConsumers().addAll((Collection<? extends Consumer>)newValue);
				return;
			case SculptormetamodelPackage.MODULE__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends Resource>)newValue);
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
			case SculptormetamodelPackage.MODULE__BASE_PACKAGE:
				setBasePackage(BASE_PACKAGE_EDEFAULT);
				return;
			case SculptormetamodelPackage.MODULE__EXTERNAL:
				setExternal(EXTERNAL_EDEFAULT);
				return;
			case SculptormetamodelPackage.MODULE__PERSISTENCE_UNIT:
				setPersistenceUnit(PERSISTENCE_UNIT_EDEFAULT);
				return;
			case SculptormetamodelPackage.MODULE__APPLICATION:
				setApplication((Application)null);
				return;
			case SculptormetamodelPackage.MODULE__DOMAIN_OBJECTS:
				getDomainObjects().clear();
				return;
			case SculptormetamodelPackage.MODULE__SERVICES:
				getServices().clear();
				return;
			case SculptormetamodelPackage.MODULE__CONSUMERS:
				getConsumers().clear();
				return;
			case SculptormetamodelPackage.MODULE__RESOURCES:
				getResources().clear();
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
			case SculptormetamodelPackage.MODULE__BASE_PACKAGE:
				return BASE_PACKAGE_EDEFAULT == null ? basePackage != null : !BASE_PACKAGE_EDEFAULT.equals(basePackage);
			case SculptormetamodelPackage.MODULE__EXTERNAL:
				return external != EXTERNAL_EDEFAULT;
			case SculptormetamodelPackage.MODULE__PERSISTENCE_UNIT:
				return PERSISTENCE_UNIT_EDEFAULT == null ? persistenceUnit != null : !PERSISTENCE_UNIT_EDEFAULT.equals(persistenceUnit);
			case SculptormetamodelPackage.MODULE__APPLICATION:
				return basicGetApplication() != null;
			case SculptormetamodelPackage.MODULE__DOMAIN_OBJECTS:
				return domainObjects != null && !domainObjects.isEmpty();
			case SculptormetamodelPackage.MODULE__SERVICES:
				return services != null && !services.isEmpty();
			case SculptormetamodelPackage.MODULE__CONSUMERS:
				return consumers != null && !consumers.isEmpty();
			case SculptormetamodelPackage.MODULE__RESOURCES:
				return resources != null && !resources.isEmpty();
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
		result.append(" (basePackage: ");
		result.append(basePackage);
		result.append(", external: ");
		result.append(external);
		result.append(", persistenceUnit: ");
		result.append(persistenceUnit);
		result.append(')');
		return result.toString();
	}

} //ModuleImpl
