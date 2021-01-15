/**
 */
package ActivityDiagramMetamodel.impl;

import ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage;
import ActivityDiagramMetamodel.ConstraintPin;
import ActivityDiagramMetamodel.DomainEvent;
import ActivityDiagramMetamodel.ReadModel;

import ActivityDiagramMetamodel.Supplier;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ActivityDiagramMetamodel.impl.DomainEventImpl#getReadmodel <em>Readmodel</em>}</li>
 *   <li>{@link ActivityDiagramMetamodel.impl.DomainEventImpl#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link ActivityDiagramMetamodel.impl.DomainEventImpl#getConstraint <em>Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainEventImpl extends ObjectNodeImpl implements DomainEvent {
	/**
	 * The cached value of the '{@link #getReadmodel() <em>Readmodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadmodel()
	 * @generated
	 * @ordered
	 */
	protected ReadModel readmodel;

	/**
	 * The cached value of the '{@link #getSupplier() <em>Supplier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplier()
	 * @generated
	 * @ordered
	 */
	protected Supplier supplier;

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected ConstraintPin constraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityDiagramMetamodelPackage.Literals.DOMAIN_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReadModel getReadmodel() {
		if (readmodel != null && readmodel.eIsProxy()) {
			InternalEObject oldReadmodel = (InternalEObject)readmodel;
			readmodel = (ReadModel)eResolveProxy(oldReadmodel);
			if (readmodel != oldReadmodel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivityDiagramMetamodelPackage.DOMAIN_EVENT__READMODEL, oldReadmodel, readmodel));
			}
		}
		return readmodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadModel basicGetReadmodel() {
		return readmodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadmodel(ReadModel newReadmodel, NotificationChain msgs) {
		ReadModel oldReadmodel = readmodel;
		readmodel = newReadmodel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivityDiagramMetamodelPackage.DOMAIN_EVENT__READMODEL, oldReadmodel, newReadmodel);
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
	public void setReadmodel(ReadModel newReadmodel) {
		if (newReadmodel != readmodel) {
			NotificationChain msgs = null;
			if (readmodel != null)
				msgs = ((InternalEObject)readmodel).eInverseRemove(this, ActivityDiagramMetamodelPackage.READ_MODEL__EVENT, ReadModel.class, msgs);
			if (newReadmodel != null)
				msgs = ((InternalEObject)newReadmodel).eInverseAdd(this, ActivityDiagramMetamodelPackage.READ_MODEL__EVENT, ReadModel.class, msgs);
			msgs = basicSetReadmodel(newReadmodel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityDiagramMetamodelPackage.DOMAIN_EVENT__READMODEL, newReadmodel, newReadmodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Supplier getSupplier() {
		if (supplier != null && supplier.eIsProxy()) {
			InternalEObject oldSupplier = (InternalEObject)supplier;
			supplier = (Supplier)eResolveProxy(oldSupplier);
			if (supplier != oldSupplier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivityDiagramMetamodelPackage.DOMAIN_EVENT__SUPPLIER, oldSupplier, supplier));
			}
		}
		return supplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Supplier basicGetSupplier() {
		return supplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupplier(Supplier newSupplier, NotificationChain msgs) {
		Supplier oldSupplier = supplier;
		supplier = newSupplier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivityDiagramMetamodelPackage.DOMAIN_EVENT__SUPPLIER, oldSupplier, newSupplier);
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
	public void setSupplier(Supplier newSupplier) {
		if (newSupplier != supplier) {
			NotificationChain msgs = null;
			if (supplier != null)
				msgs = ((InternalEObject)supplier).eInverseRemove(this, ActivityDiagramMetamodelPackage.SUPPLIER__TRIGGERS, Supplier.class, msgs);
			if (newSupplier != null)
				msgs = ((InternalEObject)newSupplier).eInverseAdd(this, ActivityDiagramMetamodelPackage.SUPPLIER__TRIGGERS, Supplier.class, msgs);
			msgs = basicSetSupplier(newSupplier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityDiagramMetamodelPackage.DOMAIN_EVENT__SUPPLIER, newSupplier, newSupplier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstraintPin getConstraint() {
		if (constraint != null && constraint.eIsProxy()) {
			InternalEObject oldConstraint = (InternalEObject)constraint;
			constraint = (ConstraintPin)eResolveProxy(oldConstraint);
			if (constraint != oldConstraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivityDiagramMetamodelPackage.DOMAIN_EVENT__CONSTRAINT, oldConstraint, constraint));
			}
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintPin basicGetConstraint() {
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraint(ConstraintPin newConstraint, NotificationChain msgs) {
		ConstraintPin oldConstraint = constraint;
		constraint = newConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivityDiagramMetamodelPackage.DOMAIN_EVENT__CONSTRAINT, oldConstraint, newConstraint);
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
	public void setConstraint(ConstraintPin newConstraint) {
		if (newConstraint != constraint) {
			NotificationChain msgs = null;
			if (constraint != null)
				msgs = ((InternalEObject)constraint).eInverseRemove(this, ActivityDiagramMetamodelPackage.CONSTRAINT_PIN__TRIGGERS, ConstraintPin.class, msgs);
			if (newConstraint != null)
				msgs = ((InternalEObject)newConstraint).eInverseAdd(this, ActivityDiagramMetamodelPackage.CONSTRAINT_PIN__TRIGGERS, ConstraintPin.class, msgs);
			msgs = basicSetConstraint(newConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityDiagramMetamodelPackage.DOMAIN_EVENT__CONSTRAINT, newConstraint, newConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivityDiagramMetamodelPackage.DOMAIN_EVENT__READMODEL:
				if (readmodel != null)
					msgs = ((InternalEObject)readmodel).eInverseRemove(this, ActivityDiagramMetamodelPackage.READ_MODEL__EVENT, ReadModel.class, msgs);
				return basicSetReadmodel((ReadModel)otherEnd, msgs);
			case ActivityDiagramMetamodelPackage.DOMAIN_EVENT__SUPPLIER:
				if (supplier != null)
					msgs = ((InternalEObject)supplier).eInverseRemove(this, ActivityDiagramMetamodelPackage.SUPPLIER__TRIGGERS, Supplier.class, msgs);
				return basicSetSupplier((Supplier)otherEnd, msgs);
			case ActivityDiagramMetamodelPackage.DOMAIN_EVENT__CONSTRAINT:
				if (constraint != null)
					msgs = ((InternalEObject)constraint).eInverseRemove(this, ActivityDiagramMetamodelPackage.CONSTRAINT_PIN__TRIGGERS, ConstraintPin.class, msgs);
				return basicSetConstraint((ConstraintPin)otherEnd, msgs);
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
			case ActivityDiagramMetamodelPackage.DOMAIN_EVENT__READMODEL:
				return basicSetReadmodel(null, msgs);
			case ActivityDiagramMetamodelPackage.DOMAIN_EVENT__SUPPLIER:
				return basicSetSupplier(null, msgs);
			case ActivityDiagramMetamodelPackage.DOMAIN_EVENT__CONSTRAINT:
				return basicSetConstraint(null, msgs);
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
			case ActivityDiagramMetamodelPackage.DOMAIN_EVENT__READMODEL:
				if (resolve) return getReadmodel();
				return basicGetReadmodel();
			case ActivityDiagramMetamodelPackage.DOMAIN_EVENT__SUPPLIER:
				if (resolve) return getSupplier();
				return basicGetSupplier();
			case ActivityDiagramMetamodelPackage.DOMAIN_EVENT__CONSTRAINT:
				if (resolve) return getConstraint();
				return basicGetConstraint();
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
			case ActivityDiagramMetamodelPackage.DOMAIN_EVENT__READMODEL:
				setReadmodel((ReadModel)newValue);
				return;
			case ActivityDiagramMetamodelPackage.DOMAIN_EVENT__SUPPLIER:
				setSupplier((Supplier)newValue);
				return;
			case ActivityDiagramMetamodelPackage.DOMAIN_EVENT__CONSTRAINT:
				setConstraint((ConstraintPin)newValue);
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
			case ActivityDiagramMetamodelPackage.DOMAIN_EVENT__READMODEL:
				setReadmodel((ReadModel)null);
				return;
			case ActivityDiagramMetamodelPackage.DOMAIN_EVENT__SUPPLIER:
				setSupplier((Supplier)null);
				return;
			case ActivityDiagramMetamodelPackage.DOMAIN_EVENT__CONSTRAINT:
				setConstraint((ConstraintPin)null);
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
			case ActivityDiagramMetamodelPackage.DOMAIN_EVENT__READMODEL:
				return readmodel != null;
			case ActivityDiagramMetamodelPackage.DOMAIN_EVENT__SUPPLIER:
				return supplier != null;
			case ActivityDiagramMetamodelPackage.DOMAIN_EVENT__CONSTRAINT:
				return constraint != null;
		}
		return super.eIsSet(featureID);
	}

} //DomainEventImpl
