/**
 */
package SecurityPIM.impl;

import SecurityPIM.OneStringOperator;
import SecurityPIM.SecurityPIMMetamodelPackage;
import SecurityPIM.StringOperator;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>One String Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SecurityPIM.impl.OneStringOperatorImpl#getValue <em>Value</em>}</li>
 *   <li>{@link SecurityPIM.impl.OneStringOperatorImpl#getStringOperator <em>String Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OneStringOperatorImpl extends OnePropertyOperatorImpl implements OneStringOperator {
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
	 * The default value of the '{@link #getStringOperator() <em>String Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringOperator()
	 * @generated
	 * @ordered
	 */
	protected static final StringOperator STRING_OPERATOR_EDEFAULT = StringOperator.CONTAINS;

	/**
	 * The cached value of the '{@link #getStringOperator() <em>String Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringOperator()
	 * @generated
	 * @ordered
	 */
	protected StringOperator stringOperator = STRING_OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OneStringOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPIMMetamodelPackage.Literals.ONE_STRING_OPERATOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPIMMetamodelPackage.ONE_STRING_OPERATOR__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringOperator getStringOperator() {
		return stringOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStringOperator(StringOperator newStringOperator) {
		StringOperator oldStringOperator = stringOperator;
		stringOperator = newStringOperator == null ? STRING_OPERATOR_EDEFAULT : newStringOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPIMMetamodelPackage.ONE_STRING_OPERATOR__STRING_OPERATOR, oldStringOperator, stringOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SecurityPIMMetamodelPackage.ONE_STRING_OPERATOR__VALUE:
				return getValue();
			case SecurityPIMMetamodelPackage.ONE_STRING_OPERATOR__STRING_OPERATOR:
				return getStringOperator();
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
			case SecurityPIMMetamodelPackage.ONE_STRING_OPERATOR__VALUE:
				setValue((String)newValue);
				return;
			case SecurityPIMMetamodelPackage.ONE_STRING_OPERATOR__STRING_OPERATOR:
				setStringOperator((StringOperator)newValue);
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
			case SecurityPIMMetamodelPackage.ONE_STRING_OPERATOR__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case SecurityPIMMetamodelPackage.ONE_STRING_OPERATOR__STRING_OPERATOR:
				setStringOperator(STRING_OPERATOR_EDEFAULT);
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
			case SecurityPIMMetamodelPackage.ONE_STRING_OPERATOR__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case SecurityPIMMetamodelPackage.ONE_STRING_OPERATOR__STRING_OPERATOR:
				return stringOperator != STRING_OPERATOR_EDEFAULT;
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
		result.append(", StringOperator: ");
		result.append(stringOperator);
		result.append(')');
		return result.toString();
	}

} //OneStringOperatorImpl
