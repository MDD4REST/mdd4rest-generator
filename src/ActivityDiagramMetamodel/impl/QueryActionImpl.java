/**
 */
package ActivityDiagramMetamodel.impl;

import ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage;
import ActivityDiagramMetamodel.Aggregate;
import ActivityDiagramMetamodel.QueryAction;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ActivityDiagramMetamodel.impl.QueryActionImpl#getAggregate <em>Aggregate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueryActionImpl extends ActionImpl implements QueryAction {
	/**
	 * The cached value of the '{@link #getAggregate() <em>Aggregate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregate()
	 * @generated
	 * @ordered
	 */
	protected Aggregate aggregate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityDiagramMetamodelPackage.Literals.QUERY_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Aggregate getAggregate() {
		if (aggregate != null && aggregate.eIsProxy()) {
			InternalEObject oldAggregate = (InternalEObject)aggregate;
			aggregate = (Aggregate)eResolveProxy(oldAggregate);
			if (aggregate != oldAggregate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivityDiagramMetamodelPackage.QUERY_ACTION__AGGREGATE, oldAggregate, aggregate));
			}
		}
		return aggregate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aggregate basicGetAggregate() {
		return aggregate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAggregate(Aggregate newAggregate, NotificationChain msgs) {
		Aggregate oldAggregate = aggregate;
		aggregate = newAggregate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivityDiagramMetamodelPackage.QUERY_ACTION__AGGREGATE, oldAggregate, newAggregate);
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
	public void setAggregate(Aggregate newAggregate) {
		if (newAggregate != aggregate) {
			NotificationChain msgs = null;
			if (aggregate != null)
				msgs = ((InternalEObject)aggregate).eInverseRemove(this, ActivityDiagramMetamodelPackage.AGGREGATE__QUERY, Aggregate.class, msgs);
			if (newAggregate != null)
				msgs = ((InternalEObject)newAggregate).eInverseAdd(this, ActivityDiagramMetamodelPackage.AGGREGATE__QUERY, Aggregate.class, msgs);
			msgs = basicSetAggregate(newAggregate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityDiagramMetamodelPackage.QUERY_ACTION__AGGREGATE, newAggregate, newAggregate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivityDiagramMetamodelPackage.QUERY_ACTION__AGGREGATE:
				if (aggregate != null)
					msgs = ((InternalEObject)aggregate).eInverseRemove(this, ActivityDiagramMetamodelPackage.AGGREGATE__QUERY, Aggregate.class, msgs);
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
			case ActivityDiagramMetamodelPackage.QUERY_ACTION__AGGREGATE:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActivityDiagramMetamodelPackage.QUERY_ACTION__AGGREGATE:
				if (resolve) return getAggregate();
				return basicGetAggregate();
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
			case ActivityDiagramMetamodelPackage.QUERY_ACTION__AGGREGATE:
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
			case ActivityDiagramMetamodelPackage.QUERY_ACTION__AGGREGATE:
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
			case ActivityDiagramMetamodelPackage.QUERY_ACTION__AGGREGATE:
				return aggregate != null;
		}
		return super.eIsSet(featureID);
	}

} //QueryActionImpl
