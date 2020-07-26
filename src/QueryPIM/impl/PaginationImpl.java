/**
 */
package QueryPIM.impl;

import QueryPIM.Pagination;
import QueryPIM.QueryPIMMetamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pagination</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QueryPIM.impl.PaginationImpl#getLimit <em>Limit</em>}</li>
 *   <li>{@link QueryPIM.impl.PaginationImpl#getOffset <em>Offset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaginationImpl extends MinimalEObjectImpl.Container implements Pagination {
	/**
	 * The default value of the '{@link #getLimit() <em>Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimit()
	 * @generated
	 * @ordered
	 */
	protected static final int LIMIT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLimit() <em>Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimit()
	 * @generated
	 * @ordered
	 */
	protected int limit = LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected static final int OFFSET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected int offset = OFFSET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaginationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPIMMetamodelPackage.Literals.PAGINATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLimit() {
		return limit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLimit(int newLimit) {
		int oldLimit = limit;
		limit = newLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPIMMetamodelPackage.PAGINATION__LIMIT, oldLimit, limit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOffset(int newOffset) {
		int oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPIMMetamodelPackage.PAGINATION__OFFSET, oldOffset, offset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QueryPIMMetamodelPackage.PAGINATION__LIMIT:
				return getLimit();
			case QueryPIMMetamodelPackage.PAGINATION__OFFSET:
				return getOffset();
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
			case QueryPIMMetamodelPackage.PAGINATION__LIMIT:
				setLimit((Integer)newValue);
				return;
			case QueryPIMMetamodelPackage.PAGINATION__OFFSET:
				setOffset((Integer)newValue);
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
			case QueryPIMMetamodelPackage.PAGINATION__LIMIT:
				setLimit(LIMIT_EDEFAULT);
				return;
			case QueryPIMMetamodelPackage.PAGINATION__OFFSET:
				setOffset(OFFSET_EDEFAULT);
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
			case QueryPIMMetamodelPackage.PAGINATION__LIMIT:
				return limit != LIMIT_EDEFAULT;
			case QueryPIMMetamodelPackage.PAGINATION__OFFSET:
				return offset != OFFSET_EDEFAULT;
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
		result.append(" (limit: ");
		result.append(limit);
		result.append(", offset: ");
		result.append(offset);
		result.append(')');
		return result.toString();
	}

} //PaginationImpl
