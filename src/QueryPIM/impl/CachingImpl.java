/**
 */
package QueryPIM.impl;

import QueryPIM.Caching;
import QueryPIM.QueryPIMMetamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Caching</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QueryPIM.impl.CachingImpl#getCachingType <em>Caching Type</em>}</li>
 *   <li>{@link QueryPIM.impl.CachingImpl#getExpiration <em>Expiration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CachingImpl extends MinimalEObjectImpl.Container implements Caching {
	/**
	 * The default value of the '{@link #getCachingType() <em>Caching Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCachingType()
	 * @generated
	 * @ordered
	 */
	protected static final String CACHING_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCachingType() <em>Caching Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCachingType()
	 * @generated
	 * @ordered
	 */
	protected String cachingType = CACHING_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpiration() <em>Expiration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiration()
	 * @generated
	 * @ordered
	 */
	protected static final int EXPIRATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getExpiration() <em>Expiration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiration()
	 * @generated
	 * @ordered
	 */
	protected int expiration = EXPIRATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CachingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPIMMetamodelPackage.Literals.CACHING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCachingType() {
		return cachingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCachingType(String newCachingType) {
		String oldCachingType = cachingType;
		cachingType = newCachingType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPIMMetamodelPackage.CACHING__CACHING_TYPE, oldCachingType, cachingType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getExpiration() {
		return expiration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpiration(int newExpiration) {
		int oldExpiration = expiration;
		expiration = newExpiration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPIMMetamodelPackage.CACHING__EXPIRATION, oldExpiration, expiration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QueryPIMMetamodelPackage.CACHING__CACHING_TYPE:
				return getCachingType();
			case QueryPIMMetamodelPackage.CACHING__EXPIRATION:
				return getExpiration();
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
			case QueryPIMMetamodelPackage.CACHING__CACHING_TYPE:
				setCachingType((String)newValue);
				return;
			case QueryPIMMetamodelPackage.CACHING__EXPIRATION:
				setExpiration((Integer)newValue);
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
			case QueryPIMMetamodelPackage.CACHING__CACHING_TYPE:
				setCachingType(CACHING_TYPE_EDEFAULT);
				return;
			case QueryPIMMetamodelPackage.CACHING__EXPIRATION:
				setExpiration(EXPIRATION_EDEFAULT);
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
			case QueryPIMMetamodelPackage.CACHING__CACHING_TYPE:
				return CACHING_TYPE_EDEFAULT == null ? cachingType != null : !CACHING_TYPE_EDEFAULT.equals(cachingType);
			case QueryPIMMetamodelPackage.CACHING__EXPIRATION:
				return expiration != EXPIRATION_EDEFAULT;
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
		result.append(" (cachingType: ");
		result.append(cachingType);
		result.append(", Expiration: ");
		result.append(expiration);
		result.append(')');
		return result.toString();
	}

} //CachingImpl
