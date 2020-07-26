/**
 */
package SecurityPIM.impl;

import SecurityPIM.ListOperator;
import SecurityPIM.SecurityPIMMetamodelPackage;
import SecurityPIM.TwoListOperator;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Two List Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SecurityPIM.impl.TwoListOperatorImpl#getListOperator <em>List Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TwoListOperatorImpl extends TwoPropertyOperatorImpl implements TwoListOperator {
	/**
	 * The default value of the '{@link #getListOperator() <em>List Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListOperator()
	 * @generated
	 * @ordered
	 */
	protected static final ListOperator LIST_OPERATOR_EDEFAULT = ListOperator.CONTAINS;

	/**
	 * The cached value of the '{@link #getListOperator() <em>List Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListOperator()
	 * @generated
	 * @ordered
	 */
	protected ListOperator listOperator = LIST_OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TwoListOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPIMMetamodelPackage.Literals.TWO_LIST_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListOperator getListOperator() {
		return listOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setListOperator(ListOperator newListOperator) {
		ListOperator oldListOperator = listOperator;
		listOperator = newListOperator == null ? LIST_OPERATOR_EDEFAULT : newListOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPIMMetamodelPackage.TWO_LIST_OPERATOR__LIST_OPERATOR, oldListOperator, listOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SecurityPIMMetamodelPackage.TWO_LIST_OPERATOR__LIST_OPERATOR:
				return getListOperator();
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
			case SecurityPIMMetamodelPackage.TWO_LIST_OPERATOR__LIST_OPERATOR:
				setListOperator((ListOperator)newValue);
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
			case SecurityPIMMetamodelPackage.TWO_LIST_OPERATOR__LIST_OPERATOR:
				setListOperator(LIST_OPERATOR_EDEFAULT);
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
			case SecurityPIMMetamodelPackage.TWO_LIST_OPERATOR__LIST_OPERATOR:
				return listOperator != LIST_OPERATOR_EDEFAULT;
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
		result.append(" (ListOperator: ");
		result.append(listOperator);
		result.append(')');
		return result.toString();
	}

} //TwoListOperatorImpl
