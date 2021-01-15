/**
 */
package DynamicPIM.impl;

import DynamicPIM.Aggregate;
import DynamicPIM.DomainObject;
import DynamicPIM.DomainObjectOperation;
import DynamicPIM.DynamicPIMPackage;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DynamicPIM.impl.DomainObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link DynamicPIM.impl.DomainObjectImpl#isAggregateRoot <em>Aggregate Root</em>}</li>
 *   <li>{@link DynamicPIM.impl.DomainObjectImpl#getHasOperation <em>Has Operation</em>}</li>
 *   <li>{@link DynamicPIM.impl.DomainObjectImpl#getAggregate <em>Aggregate</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DomainObjectImpl extends SimpleTypeImpl implements DomainObject {
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
	 * The default value of the '{@link #isAggregateRoot() <em>Aggregate Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAggregateRoot()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AGGREGATE_ROOT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAggregateRoot() <em>Aggregate Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAggregateRoot()
	 * @generated
	 * @ordered
	 */
	protected boolean aggregateRoot = AGGREGATE_ROOT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasOperation() <em>Has Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainObjectOperation> hasOperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DynamicPIMPackage.Literals.DOMAIN_OBJECT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicPIMPackage.DOMAIN_OBJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAggregateRoot() {
		return aggregateRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAggregateRoot(boolean newAggregateRoot) {
		boolean oldAggregateRoot = aggregateRoot;
		aggregateRoot = newAggregateRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicPIMPackage.DOMAIN_OBJECT__AGGREGATE_ROOT, oldAggregateRoot, aggregateRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DomainObjectOperation> getHasOperation() {
		if (hasOperation == null) {
			hasOperation = new EObjectContainmentWithInverseEList<DomainObjectOperation>(DomainObjectOperation.class, this, DynamicPIMPackage.DOMAIN_OBJECT__HAS_OPERATION, DynamicPIMPackage.DOMAIN_OBJECT_OPERATION__DOMAINOBJECT);
		}
		return hasOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Aggregate getAggregate() {
		if (eContainerFeatureID() != DynamicPIMPackage.DOMAIN_OBJECT__AGGREGATE) return null;
		return (Aggregate)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAggregate(Aggregate newAggregate, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAggregate, DynamicPIMPackage.DOMAIN_OBJECT__AGGREGATE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAggregate(Aggregate newAggregate) {
		if (newAggregate != eInternalContainer() || (eContainerFeatureID() != DynamicPIMPackage.DOMAIN_OBJECT__AGGREGATE && newAggregate != null)) {
			if (EcoreUtil.isAncestor(this, newAggregate))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAggregate != null)
				msgs = ((InternalEObject)newAggregate).eInverseAdd(this, DynamicPIMPackage.AGGREGATE__DOMAINOBJECTS, Aggregate.class, msgs);
			msgs = basicSetAggregate(newAggregate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicPIMPackage.DOMAIN_OBJECT__AGGREGATE, newAggregate, newAggregate));
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
			case DynamicPIMPackage.DOMAIN_OBJECT__HAS_OPERATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasOperation()).basicAdd(otherEnd, msgs);
			case DynamicPIMPackage.DOMAIN_OBJECT__AGGREGATE:
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
			case DynamicPIMPackage.DOMAIN_OBJECT__HAS_OPERATION:
				return ((InternalEList<?>)getHasOperation()).basicRemove(otherEnd, msgs);
			case DynamicPIMPackage.DOMAIN_OBJECT__AGGREGATE:
				return basicSetAggregate(null, msgs);
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
			case DynamicPIMPackage.DOMAIN_OBJECT__AGGREGATE:
				return eInternalContainer().eInverseRemove(this, DynamicPIMPackage.AGGREGATE__DOMAINOBJECTS, Aggregate.class, msgs);
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
			case DynamicPIMPackage.DOMAIN_OBJECT__NAME:
				return getName();
			case DynamicPIMPackage.DOMAIN_OBJECT__AGGREGATE_ROOT:
				return isAggregateRoot();
			case DynamicPIMPackage.DOMAIN_OBJECT__HAS_OPERATION:
				return getHasOperation();
			case DynamicPIMPackage.DOMAIN_OBJECT__AGGREGATE:
				return getAggregate();
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
			case DynamicPIMPackage.DOMAIN_OBJECT__NAME:
				setName((String)newValue);
				return;
			case DynamicPIMPackage.DOMAIN_OBJECT__AGGREGATE_ROOT:
				setAggregateRoot((Boolean)newValue);
				return;
			case DynamicPIMPackage.DOMAIN_OBJECT__HAS_OPERATION:
				getHasOperation().clear();
				getHasOperation().addAll((Collection<? extends DomainObjectOperation>)newValue);
				return;
			case DynamicPIMPackage.DOMAIN_OBJECT__AGGREGATE:
				setAggregate((Aggregate)newValue);
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
			case DynamicPIMPackage.DOMAIN_OBJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DynamicPIMPackage.DOMAIN_OBJECT__AGGREGATE_ROOT:
				setAggregateRoot(AGGREGATE_ROOT_EDEFAULT);
				return;
			case DynamicPIMPackage.DOMAIN_OBJECT__HAS_OPERATION:
				getHasOperation().clear();
				return;
			case DynamicPIMPackage.DOMAIN_OBJECT__AGGREGATE:
				setAggregate((Aggregate)null);
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
			case DynamicPIMPackage.DOMAIN_OBJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DynamicPIMPackage.DOMAIN_OBJECT__AGGREGATE_ROOT:
				return aggregateRoot != AGGREGATE_ROOT_EDEFAULT;
			case DynamicPIMPackage.DOMAIN_OBJECT__HAS_OPERATION:
				return hasOperation != null && !hasOperation.isEmpty();
			case DynamicPIMPackage.DOMAIN_OBJECT__AGGREGATE:
				return getAggregate() != null;
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
		result.append(", aggregateRoot: ");
		result.append(aggregateRoot);
		result.append(')');
		return result.toString();
	}

} //DomainObjectImpl
