/**
 */
package SecurityPIM.impl;

import SecurityPIM.ConstraintOperator;
import SecurityPIM.SecurityPIMMetamodelPackage;

import ServicePIM.Property;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SecurityPIM.impl.ConstraintOperatorImpl#getRightOperand <em>Right Operand</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ConstraintOperatorImpl extends MinimalEObjectImpl.Container implements ConstraintOperator {
	/**
	 * The cached value of the '{@link #getRightOperand() <em>Right Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightOperand()
	 * @generated
	 * @ordered
	 */
	protected Property rightOperand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPIMMetamodelPackage.Literals.CONSTRAINT_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Property getRightOperand() {
		if (rightOperand != null && rightOperand.eIsProxy()) {
			InternalEObject oldRightOperand = (InternalEObject)rightOperand;
			rightOperand = (Property)eResolveProxy(oldRightOperand);
			if (rightOperand != oldRightOperand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SecurityPIMMetamodelPackage.CONSTRAINT_OPERATOR__RIGHT_OPERAND, oldRightOperand, rightOperand));
			}
		}
		return rightOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetRightOperand() {
		return rightOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRightOperand(Property newRightOperand) {
		Property oldRightOperand = rightOperand;
		rightOperand = newRightOperand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPIMMetamodelPackage.CONSTRAINT_OPERATOR__RIGHT_OPERAND, oldRightOperand, rightOperand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SecurityPIMMetamodelPackage.CONSTRAINT_OPERATOR__RIGHT_OPERAND:
				if (resolve) return getRightOperand();
				return basicGetRightOperand();
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
			case SecurityPIMMetamodelPackage.CONSTRAINT_OPERATOR__RIGHT_OPERAND:
				setRightOperand((Property)newValue);
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
			case SecurityPIMMetamodelPackage.CONSTRAINT_OPERATOR__RIGHT_OPERAND:
				setRightOperand((Property)null);
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
			case SecurityPIMMetamodelPackage.CONSTRAINT_OPERATOR__RIGHT_OPERAND:
				return rightOperand != null;
		}
		return super.eIsSet(featureID);
	}

} //ConstraintOperatorImpl
