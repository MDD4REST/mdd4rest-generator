/**
 */
package StaticPIM.impl;

import StaticPIM.Entity;
import StaticPIM.StaticPIMPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link StaticPIM.impl.EntityImpl#isScaffold <em>Scaffold</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityImpl extends DomainObjectImpl implements Entity {
	/**
	 * The default value of the '{@link #isScaffold() <em>Scaffold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isScaffold()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SCAFFOLD_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isScaffold() <em>Scaffold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isScaffold()
	 * @generated
	 * @ordered
	 */
	protected boolean scaffold = SCAFFOLD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StaticPIMPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isScaffold() {
		return scaffold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScaffold(boolean newScaffold) {
		boolean oldScaffold = scaffold;
		scaffold = newScaffold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaticPIMPackage.ENTITY__SCAFFOLD, oldScaffold, scaffold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StaticPIMPackage.ENTITY__SCAFFOLD:
				return isScaffold();
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
			case StaticPIMPackage.ENTITY__SCAFFOLD:
				setScaffold((Boolean)newValue);
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
			case StaticPIMPackage.ENTITY__SCAFFOLD:
				setScaffold(SCAFFOLD_EDEFAULT);
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
			case StaticPIMPackage.ENTITY__SCAFFOLD:
				return scaffold != SCAFFOLD_EDEFAULT;
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
		result.append(" (scaffold: ");
		result.append(scaffold);
		result.append(')');
		return result.toString();
	}

} //EntityImpl
