/**
 */
package QueryPIM.impl;

import QueryPIM.OrderBy;
import QueryPIM.OrderDirection;
import QueryPIM.QueryPIMMetamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order By</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QueryPIM.impl.OrderByImpl#getOrderDirection <em>Order Direction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderByImpl extends QueryImpl implements OrderBy {
	/**
	 * The default value of the '{@link #getOrderDirection() <em>Order Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderDirection()
	 * @generated
	 * @ordered
	 */
	protected static final OrderDirection ORDER_DIRECTION_EDEFAULT = OrderDirection.ASC;

	/**
	 * The cached value of the '{@link #getOrderDirection() <em>Order Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderDirection()
	 * @generated
	 * @ordered
	 */
	protected OrderDirection orderDirection = ORDER_DIRECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderByImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPIMMetamodelPackage.Literals.ORDER_BY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderDirection getOrderDirection() {
		return orderDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderDirection(OrderDirection newOrderDirection) {
		OrderDirection oldOrderDirection = orderDirection;
		orderDirection = newOrderDirection == null ? ORDER_DIRECTION_EDEFAULT : newOrderDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPIMMetamodelPackage.ORDER_BY__ORDER_DIRECTION, oldOrderDirection, orderDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QueryPIMMetamodelPackage.ORDER_BY__ORDER_DIRECTION:
				return getOrderDirection();
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
			case QueryPIMMetamodelPackage.ORDER_BY__ORDER_DIRECTION:
				setOrderDirection((OrderDirection)newValue);
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
			case QueryPIMMetamodelPackage.ORDER_BY__ORDER_DIRECTION:
				setOrderDirection(ORDER_DIRECTION_EDEFAULT);
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
			case QueryPIMMetamodelPackage.ORDER_BY__ORDER_DIRECTION:
				return orderDirection != ORDER_DIRECTION_EDEFAULT;
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
		result.append(" (orderDirection: ");
		result.append(orderDirection);
		result.append(')');
		return result.toString();
	}

} //OrderByImpl
