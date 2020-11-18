/**
 */
package ActivityDiagramMetamodel.impl;

import ActivityDiagramMetamodel.Action;
import ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage;
import ActivityDiagramMetamodel.InputPin;
import ActivityDiagramMetamodel.ModelingTestPackage;
import ActivityDiagramMetamodel.OutputPin;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ActivityDiagramMetamodel.impl.ActionImpl#getName <em>Name</em>}</li>
 *   <li>{@link ActivityDiagramMetamodel.impl.ActionImpl#getInputpin <em>Inputpin</em>}</li>
 *   <li>{@link ActivityDiagramMetamodel.impl.ActionImpl#getOutputpin <em>Outputpin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends ExecutableNodeImpl implements Action {
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
	 * The cached value of the '{@link #getInputpin() <em>Inputpin</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputpin()
	 * @generated
	 * @ordered
	 */
	protected EList<InputPin> inputpin;

	/**
	 * The cached value of the '{@link #getOutputpin() <em>Outputpin</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputpin()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputPin> outputpin;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityDiagramMetamodelPackage.Literals.ACTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityDiagramMetamodelPackage.ACTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InputPin> getInputpin() {
		if (inputpin == null) {
			inputpin = new EObjectContainmentEList<InputPin>(InputPin.class, this, ActivityDiagramMetamodelPackage.ACTION__INPUTPIN);
		}
		return inputpin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OutputPin> getOutputpin() {
		if (outputpin == null) {
			outputpin = new EObjectContainmentEList<OutputPin>(OutputPin.class, this, ActivityDiagramMetamodelPackage.ACTION__OUTPUTPIN);
		}
		return outputpin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivityDiagramMetamodelPackage.ACTION__INPUTPIN:
				return ((InternalEList<?>)getInputpin()).basicRemove(otherEnd, msgs);
			case ActivityDiagramMetamodelPackage.ACTION__OUTPUTPIN:
				return ((InternalEList<?>)getOutputpin()).basicRemove(otherEnd, msgs);
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
			case ActivityDiagramMetamodelPackage.ACTION__NAME:
				return getName();
			case ActivityDiagramMetamodelPackage.ACTION__INPUTPIN:
				return getInputpin();
			case ActivityDiagramMetamodelPackage.ACTION__OUTPUTPIN:
				return getOutputpin();
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
			case ActivityDiagramMetamodelPackage.ACTION__NAME:
				setName((String)newValue);
				return;
			case ActivityDiagramMetamodelPackage.ACTION__INPUTPIN:
				getInputpin().clear();
				getInputpin().addAll((Collection<? extends InputPin>)newValue);
				return;
			case ActivityDiagramMetamodelPackage.ACTION__OUTPUTPIN:
				getOutputpin().clear();
				getOutputpin().addAll((Collection<? extends OutputPin>)newValue);
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
			case ActivityDiagramMetamodelPackage.ACTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ActivityDiagramMetamodelPackage.ACTION__INPUTPIN:
				getInputpin().clear();
				return;
			case ActivityDiagramMetamodelPackage.ACTION__OUTPUTPIN:
				getOutputpin().clear();
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
			case ActivityDiagramMetamodelPackage.ACTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ActivityDiagramMetamodelPackage.ACTION__INPUTPIN:
				return inputpin != null && !inputpin.isEmpty();
			case ActivityDiagramMetamodelPackage.ACTION__OUTPUTPIN:
				return outputpin != null && !outputpin.isEmpty();
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

} //ActionImpl
