/**
 */
package StaticPIM.impl;

import StaticPIM.DomainObject;
import StaticPIM.DomainObjectOperation;
import StaticPIM.Inheritance;
import StaticPIM.Property;
import StaticPIM.Relation;
import StaticPIM.StaticPIMPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link StaticPIM.impl.DomainObjectImpl#getHasProperty <em>Has Property</em>}</li>
 *   <li>{@link StaticPIM.impl.DomainObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link StaticPIM.impl.DomainObjectImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link StaticPIM.impl.DomainObjectImpl#isAggregateRoot <em>Aggregate Root</em>}</li>
 *   <li>{@link StaticPIM.impl.DomainObjectImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link StaticPIM.impl.DomainObjectImpl#getHasRelationship <em>Has Relationship</em>}</li>
 *   <li>{@link StaticPIM.impl.DomainObjectImpl#getHasInheritance <em>Has Inheritance</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DomainObjectImpl extends TypeDefinitionImpl implements DomainObject {
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
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #isAggregateRoot() <em>Aggregate Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAggregateRoot()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AGGREGATE_ROOT_EDEFAULT = true;

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
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainObjectOperation> operations;

	/**
	 * The cached value of the '{@link #getHasRelationship() <em>Has Relationship</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasRelationship()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> hasRelationship;

	/**
	 * The cached value of the '{@link #getHasInheritance() <em>Has Inheritance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasInheritance()
	 * @generated
	 * @ordered
	 */
	protected Inheritance hasInheritance;

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
		return StaticPIMPackage.Literals.DOMAIN_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getHasProperty() {
		if (hasProperty == null) {
			hasProperty = new EObjectContainmentEList<Property>(Property.class, this, StaticPIMPackage.DOMAIN_OBJECT__HAS_PROPERTY);
		}
		return hasProperty;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StaticPIMPackage.DOMAIN_OBJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbstract(boolean newAbstract) {
		boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaticPIMPackage.DOMAIN_OBJECT__ABSTRACT, oldAbstract, abstract_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StaticPIMPackage.DOMAIN_OBJECT__AGGREGATE_ROOT, oldAggregateRoot, aggregateRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DomainObjectOperation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentWithInverseEList<DomainObjectOperation>(DomainObjectOperation.class, this, StaticPIMPackage.DOMAIN_OBJECT__OPERATIONS, StaticPIMPackage.DOMAIN_OBJECT_OPERATION__DOMAIN_OBJECT);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Relation> getHasRelationship() {
		if (hasRelationship == null) {
			hasRelationship = new EObjectContainmentEList<Relation>(Relation.class, this, StaticPIMPackage.DOMAIN_OBJECT__HAS_RELATIONSHIP);
		}
		return hasRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Inheritance getHasInheritance() {
		return hasInheritance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasInheritance(Inheritance newHasInheritance, NotificationChain msgs) {
		Inheritance oldHasInheritance = hasInheritance;
		hasInheritance = newHasInheritance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StaticPIMPackage.DOMAIN_OBJECT__HAS_INHERITANCE, oldHasInheritance, newHasInheritance);
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
	public void setHasInheritance(Inheritance newHasInheritance) {
		if (newHasInheritance != hasInheritance) {
			NotificationChain msgs = null;
			if (hasInheritance != null)
				msgs = ((InternalEObject)hasInheritance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StaticPIMPackage.DOMAIN_OBJECT__HAS_INHERITANCE, null, msgs);
			if (newHasInheritance != null)
				msgs = ((InternalEObject)newHasInheritance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StaticPIMPackage.DOMAIN_OBJECT__HAS_INHERITANCE, null, msgs);
			msgs = basicSetHasInheritance(newHasInheritance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaticPIMPackage.DOMAIN_OBJECT__HAS_INHERITANCE, newHasInheritance, newHasInheritance));
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
			case StaticPIMPackage.DOMAIN_OBJECT__OPERATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperations()).basicAdd(otherEnd, msgs);
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
			case StaticPIMPackage.DOMAIN_OBJECT__HAS_PROPERTY:
				return ((InternalEList<?>)getHasProperty()).basicRemove(otherEnd, msgs);
			case StaticPIMPackage.DOMAIN_OBJECT__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
			case StaticPIMPackage.DOMAIN_OBJECT__HAS_RELATIONSHIP:
				return ((InternalEList<?>)getHasRelationship()).basicRemove(otherEnd, msgs);
			case StaticPIMPackage.DOMAIN_OBJECT__HAS_INHERITANCE:
				return basicSetHasInheritance(null, msgs);
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
			case StaticPIMPackage.DOMAIN_OBJECT__HAS_PROPERTY:
				return getHasProperty();
			case StaticPIMPackage.DOMAIN_OBJECT__NAME:
				return getName();
			case StaticPIMPackage.DOMAIN_OBJECT__ABSTRACT:
				return isAbstract();
			case StaticPIMPackage.DOMAIN_OBJECT__AGGREGATE_ROOT:
				return isAggregateRoot();
			case StaticPIMPackage.DOMAIN_OBJECT__OPERATIONS:
				return getOperations();
			case StaticPIMPackage.DOMAIN_OBJECT__HAS_RELATIONSHIP:
				return getHasRelationship();
			case StaticPIMPackage.DOMAIN_OBJECT__HAS_INHERITANCE:
				return getHasInheritance();
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
			case StaticPIMPackage.DOMAIN_OBJECT__HAS_PROPERTY:
				getHasProperty().clear();
				getHasProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case StaticPIMPackage.DOMAIN_OBJECT__NAME:
				setName((String)newValue);
				return;
			case StaticPIMPackage.DOMAIN_OBJECT__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case StaticPIMPackage.DOMAIN_OBJECT__AGGREGATE_ROOT:
				setAggregateRoot((Boolean)newValue);
				return;
			case StaticPIMPackage.DOMAIN_OBJECT__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends DomainObjectOperation>)newValue);
				return;
			case StaticPIMPackage.DOMAIN_OBJECT__HAS_RELATIONSHIP:
				getHasRelationship().clear();
				getHasRelationship().addAll((Collection<? extends Relation>)newValue);
				return;
			case StaticPIMPackage.DOMAIN_OBJECT__HAS_INHERITANCE:
				setHasInheritance((Inheritance)newValue);
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
			case StaticPIMPackage.DOMAIN_OBJECT__HAS_PROPERTY:
				getHasProperty().clear();
				return;
			case StaticPIMPackage.DOMAIN_OBJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StaticPIMPackage.DOMAIN_OBJECT__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case StaticPIMPackage.DOMAIN_OBJECT__AGGREGATE_ROOT:
				setAggregateRoot(AGGREGATE_ROOT_EDEFAULT);
				return;
			case StaticPIMPackage.DOMAIN_OBJECT__OPERATIONS:
				getOperations().clear();
				return;
			case StaticPIMPackage.DOMAIN_OBJECT__HAS_RELATIONSHIP:
				getHasRelationship().clear();
				return;
			case StaticPIMPackage.DOMAIN_OBJECT__HAS_INHERITANCE:
				setHasInheritance((Inheritance)null);
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
			case StaticPIMPackage.DOMAIN_OBJECT__HAS_PROPERTY:
				return hasProperty != null && !hasProperty.isEmpty();
			case StaticPIMPackage.DOMAIN_OBJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StaticPIMPackage.DOMAIN_OBJECT__ABSTRACT:
				return abstract_ != ABSTRACT_EDEFAULT;
			case StaticPIMPackage.DOMAIN_OBJECT__AGGREGATE_ROOT:
				return aggregateRoot != AGGREGATE_ROOT_EDEFAULT;
			case StaticPIMPackage.DOMAIN_OBJECT__OPERATIONS:
				return operations != null && !operations.isEmpty();
			case StaticPIMPackage.DOMAIN_OBJECT__HAS_RELATIONSHIP:
				return hasRelationship != null && !hasRelationship.isEmpty();
			case StaticPIMPackage.DOMAIN_OBJECT__HAS_INHERITANCE:
				return hasInheritance != null;
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
		result.append(", abstract: ");
		result.append(abstract_);
		result.append(", aggregateRoot: ");
		result.append(aggregateRoot);
		result.append(')');
		return result.toString();
	}

} //DomainObjectImpl
