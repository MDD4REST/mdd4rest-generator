/**
 */
package SecurityPIM.impl;

import SecurityPIM.SecurityPIMMetamodelPackage;
import SecurityPIM.TwoPropertyOperator;

import ServicePIM.Property;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Two Property Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SecurityPIM.impl.TwoPropertyOperatorImpl#getLeftOperand <em>Left Operand</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TwoPropertyOperatorImpl extends ConstraintOperatorImpl implements TwoPropertyOperator {
	/**
	 * The cached value of the '{@link #getLeftOperand() <em>Left Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftOperand()
	 * @generated
	 * @ordered
	 */
	protected Property leftOperand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TwoPropertyOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPIMMetamodelPackage.Literals.TWO_PROPERTY_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Property getLeftOperand() {
		if (leftOperand != null && leftOperand.eIsProxy()) {
			InternalEObject oldLeftOperand = (InternalEObject)leftOperand;
			leftOperand = (Property)eResolveProxy(oldLeftOperand);
			if (leftOperand != oldLeftOperand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SecurityPIMMetamodelPackage.TWO_PROPERTY_OPERATOR__LEFT_OPERAND, oldLeftOperand, leftOperand));
			}
		}
		return leftOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetLeftOperand() {
		return leftOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLeftOperand(Property newLeftOperand) {
		Property oldLeftOperand = leftOperand;
		leftOperand = newLeftOperand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPIMMetamodelPackage.TWO_PROPERTY_OPERATOR__LEFT_OPERAND, oldLeftOperand, leftOperand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SecurityPIMMetamodelPackage.TWO_PROPERTY_OPERATOR__LEFT_OPERAND:
				if (resolve) return getLeftOperand();
				return basicGetLeftOperand();
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
			case SecurityPIMMetamodelPackage.TWO_PROPERTY_OPERATOR__LEFT_OPERAND:
				setLeftOperand((Property)newValue);
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
			case SecurityPIMMetamodelPackage.TWO_PROPERTY_OPERATOR__LEFT_OPERAND:
				setLeftOperand((Property)null);
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
			case SecurityPIMMetamodelPackage.TWO_PROPERTY_OPERATOR__LEFT_OPERAND:
				return leftOperand != null;
		}
		return super.eIsSet(featureID);
	}

} //TwoPropertyOperatorImpl
