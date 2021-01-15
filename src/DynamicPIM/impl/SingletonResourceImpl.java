/**
 */
package DynamicPIM.impl;

import DynamicPIM.DynamicPIMPackage;
import DynamicPIM.SingletonResource;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Singleton Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DynamicPIM.impl.SingletonResourceImpl#getLookupField <em>Lookup Field</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SingletonResourceImpl extends ResourceImpl implements SingletonResource {
	/**
	 * The default value of the '{@link #getLookupField() <em>Lookup Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLookupField()
	 * @generated
	 * @ordered
	 */
	protected static final String LOOKUP_FIELD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLookupField() <em>Lookup Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLookupField()
	 * @generated
	 * @ordered
	 */
	protected String lookupField = LOOKUP_FIELD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingletonResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DynamicPIMPackage.Literals.SINGLETON_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLookupField() {
		return lookupField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLookupField(String newLookupField) {
		String oldLookupField = lookupField;
		lookupField = newLookupField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicPIMPackage.SINGLETON_RESOURCE__LOOKUP_FIELD, oldLookupField, lookupField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DynamicPIMPackage.SINGLETON_RESOURCE__LOOKUP_FIELD:
				return getLookupField();
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
			case DynamicPIMPackage.SINGLETON_RESOURCE__LOOKUP_FIELD:
				setLookupField((String)newValue);
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
			case DynamicPIMPackage.SINGLETON_RESOURCE__LOOKUP_FIELD:
				setLookupField(LOOKUP_FIELD_EDEFAULT);
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
			case DynamicPIMPackage.SINGLETON_RESOURCE__LOOKUP_FIELD:
				return LOOKUP_FIELD_EDEFAULT == null ? lookupField != null : !LOOKUP_FIELD_EDEFAULT.equals(lookupField);
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
		result.append(" (lookupField: ");
		result.append(lookupField);
		result.append(')');
		return result.toString();
	}

} //SingletonResourceImpl
