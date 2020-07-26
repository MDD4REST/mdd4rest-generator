/**
 */
package SecurityPIM.impl;

import SecurityPIM.Constraint;
import SecurityPIM.ConstraintOperator;
import SecurityPIM.LogicalOperator;
import SecurityPIM.SecurityPIMMetamodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SecurityPIM.impl.ConstraintImpl#getConstraintoperator <em>Constraintoperator</em>}</li>
 *   <li>{@link SecurityPIM.impl.ConstraintImpl#getLogicaloperators <em>Logicaloperators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstraintImpl extends MinimalEObjectImpl.Container implements Constraint {
	/**
	 * The cached value of the '{@link #getConstraintoperator() <em>Constraintoperator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintoperator()
	 * @generated
	 * @ordered
	 */
	protected EList<ConstraintOperator> constraintoperator;

	/**
	 * The cached value of the '{@link #getLogicaloperators() <em>Logicaloperators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicaloperators()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalOperator> logicaloperators;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPIMMetamodelPackage.Literals.CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConstraintOperator> getConstraintoperator() {
		if (constraintoperator == null) {
			constraintoperator = new EObjectContainmentEList<ConstraintOperator>(ConstraintOperator.class, this, SecurityPIMMetamodelPackage.CONSTRAINT__CONSTRAINTOPERATOR);
		}
		return constraintoperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LogicalOperator> getLogicaloperators() {
		if (logicaloperators == null) {
			logicaloperators = new EObjectContainmentEList<LogicalOperator>(LogicalOperator.class, this, SecurityPIMMetamodelPackage.CONSTRAINT__LOGICALOPERATORS);
		}
		return logicaloperators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SecurityPIMMetamodelPackage.CONSTRAINT__CONSTRAINTOPERATOR:
				return ((InternalEList<?>)getConstraintoperator()).basicRemove(otherEnd, msgs);
			case SecurityPIMMetamodelPackage.CONSTRAINT__LOGICALOPERATORS:
				return ((InternalEList<?>)getLogicaloperators()).basicRemove(otherEnd, msgs);
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
			case SecurityPIMMetamodelPackage.CONSTRAINT__CONSTRAINTOPERATOR:
				return getConstraintoperator();
			case SecurityPIMMetamodelPackage.CONSTRAINT__LOGICALOPERATORS:
				return getLogicaloperators();
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
			case SecurityPIMMetamodelPackage.CONSTRAINT__CONSTRAINTOPERATOR:
				getConstraintoperator().clear();
				getConstraintoperator().addAll((Collection<? extends ConstraintOperator>)newValue);
				return;
			case SecurityPIMMetamodelPackage.CONSTRAINT__LOGICALOPERATORS:
				getLogicaloperators().clear();
				getLogicaloperators().addAll((Collection<? extends LogicalOperator>)newValue);
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
			case SecurityPIMMetamodelPackage.CONSTRAINT__CONSTRAINTOPERATOR:
				getConstraintoperator().clear();
				return;
			case SecurityPIMMetamodelPackage.CONSTRAINT__LOGICALOPERATORS:
				getLogicaloperators().clear();
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
			case SecurityPIMMetamodelPackage.CONSTRAINT__CONSTRAINTOPERATOR:
				return constraintoperator != null && !constraintoperator.isEmpty();
			case SecurityPIMMetamodelPackage.CONSTRAINT__LOGICALOPERATORS:
				return logicaloperators != null && !logicaloperators.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConstraintImpl
