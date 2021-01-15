/**
 */
package DynamicPIM.impl;

import DynamicPIM.Aggregate;
import DynamicPIM.DynamicPIMPackage;
import DynamicPIM.ProcessOperation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DynamicPIM.impl.ProcessImpl#getHasOperation <em>Has Operation</em>}</li>
 *   <li>{@link DynamicPIM.impl.ProcessImpl#getName <em>Name</em>}</li>
 *   <li>{@link DynamicPIM.impl.ProcessImpl#getAggregate <em>Aggregate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessImpl extends EObjectImpl implements DynamicPIM.Process {
	/**
	 * The cached value of the '{@link #getHasOperation() <em>Has Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessOperation> hasOperation;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DynamicPIMPackage.Literals.PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProcessOperation> getHasOperation() {
		if (hasOperation == null) {
			hasOperation = new EObjectContainmentWithInverseEList<ProcessOperation>(ProcessOperation.class, this, DynamicPIMPackage.PROCESS__HAS_OPERATION, DynamicPIMPackage.PROCESS_OPERATION__PROCESS);
		}
		return hasOperation;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicPIMPackage.PROCESS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Aggregate getAggregate() {
		if (eContainerFeatureID() != DynamicPIMPackage.PROCESS__AGGREGATE) return null;
		return (Aggregate)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAggregate(Aggregate newAggregate, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAggregate, DynamicPIMPackage.PROCESS__AGGREGATE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAggregate(Aggregate newAggregate) {
		if (newAggregate != eInternalContainer() || (eContainerFeatureID() != DynamicPIMPackage.PROCESS__AGGREGATE && newAggregate != null)) {
			if (EcoreUtil.isAncestor(this, newAggregate))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAggregate != null)
				msgs = ((InternalEObject)newAggregate).eInverseAdd(this, DynamicPIMPackage.AGGREGATE__HAS_PROCESS, Aggregate.class, msgs);
			msgs = basicSetAggregate(newAggregate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicPIMPackage.PROCESS__AGGREGATE, newAggregate, newAggregate));
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
			case DynamicPIMPackage.PROCESS__HAS_OPERATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasOperation()).basicAdd(otherEnd, msgs);
			case DynamicPIMPackage.PROCESS__AGGREGATE:
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
			case DynamicPIMPackage.PROCESS__HAS_OPERATION:
				return ((InternalEList<?>)getHasOperation()).basicRemove(otherEnd, msgs);
			case DynamicPIMPackage.PROCESS__AGGREGATE:
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
			case DynamicPIMPackage.PROCESS__AGGREGATE:
				return eInternalContainer().eInverseRemove(this, DynamicPIMPackage.AGGREGATE__HAS_PROCESS, Aggregate.class, msgs);
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
			case DynamicPIMPackage.PROCESS__HAS_OPERATION:
				return getHasOperation();
			case DynamicPIMPackage.PROCESS__NAME:
				return getName();
			case DynamicPIMPackage.PROCESS__AGGREGATE:
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
			case DynamicPIMPackage.PROCESS__HAS_OPERATION:
				getHasOperation().clear();
				getHasOperation().addAll((Collection<? extends ProcessOperation>)newValue);
				return;
			case DynamicPIMPackage.PROCESS__NAME:
				setName((String)newValue);
				return;
			case DynamicPIMPackage.PROCESS__AGGREGATE:
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
			case DynamicPIMPackage.PROCESS__HAS_OPERATION:
				getHasOperation().clear();
				return;
			case DynamicPIMPackage.PROCESS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DynamicPIMPackage.PROCESS__AGGREGATE:
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
			case DynamicPIMPackage.PROCESS__HAS_OPERATION:
				return hasOperation != null && !hasOperation.isEmpty();
			case DynamicPIMPackage.PROCESS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DynamicPIMPackage.PROCESS__AGGREGATE:
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
		result.append(')');
		return result.toString();
	}

} //ProcessImpl
