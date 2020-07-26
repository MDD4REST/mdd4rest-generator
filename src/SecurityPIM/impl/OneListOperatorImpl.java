/**
 */
package SecurityPIM.impl;

import SecurityPIM.ListOperator;
import SecurityPIM.OneListOperator;
import SecurityPIM.SecurityPIMMetamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>One List Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SecurityPIM.impl.OneListOperatorImpl#getValue <em>Value</em>}</li>
 *   <li>{@link SecurityPIM.impl.OneListOperatorImpl#getListOperator <em>List Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OneListOperatorImpl extends OnePropertyOperatorImpl implements OneListOperator {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

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
	protected OneListOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPIMMetamodelPackage.Literals.ONE_LIST_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPIMMetamodelPackage.ONE_LIST_OPERATOR__VALUE, oldValue, value));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPIMMetamodelPackage.ONE_LIST_OPERATOR__LIST_OPERATOR, oldListOperator, listOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SecurityPIMMetamodelPackage.ONE_LIST_OPERATOR__VALUE:
				return getValue();
			case SecurityPIMMetamodelPackage.ONE_LIST_OPERATOR__LIST_OPERATOR:
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
			case SecurityPIMMetamodelPackage.ONE_LIST_OPERATOR__VALUE:
				setValue((String)newValue);
				return;
			case SecurityPIMMetamodelPackage.ONE_LIST_OPERATOR__LIST_OPERATOR:
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
			case SecurityPIMMetamodelPackage.ONE_LIST_OPERATOR__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case SecurityPIMMetamodelPackage.ONE_LIST_OPERATOR__LIST_OPERATOR:
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
			case SecurityPIMMetamodelPackage.ONE_LIST_OPERATOR__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case SecurityPIMMetamodelPackage.ONE_LIST_OPERATOR__LIST_OPERATOR:
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
		result.append(" (value: ");
		result.append(value);
		result.append(", ListOperator: ");
		result.append(listOperator);
		result.append(')');
		return result.toString();
	}

} //OneListOperatorImpl
