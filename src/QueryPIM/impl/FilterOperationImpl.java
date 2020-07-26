/**
 */
package QueryPIM.impl;

import QueryPIM.FilterOperation;
import QueryPIM.FilterOperationType;
import QueryPIM.QueryPIMMetamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QueryPIM.impl.FilterOperationImpl#getFilterOperation <em>Filter Operation</em>}</li>
 *   <li>{@link QueryPIM.impl.FilterOperationImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FilterOperationImpl extends MinimalEObjectImpl.Container implements FilterOperation {
	/**
	 * The default value of the '{@link #getFilterOperation() <em>Filter Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterOperation()
	 * @generated
	 * @ordered
	 */
	protected static final FilterOperationType FILTER_OPERATION_EDEFAULT = FilterOperationType.EQ;

	/**
	 * The cached value of the '{@link #getFilterOperation() <em>Filter Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterOperation()
	 * @generated
	 * @ordered
	 */
	protected FilterOperationType filterOperation = FILTER_OPERATION_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPIMMetamodelPackage.Literals.FILTER_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FilterOperationType getFilterOperation() {
		return filterOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFilterOperation(FilterOperationType newFilterOperation) {
		FilterOperationType oldFilterOperation = filterOperation;
		filterOperation = newFilterOperation == null ? FILTER_OPERATION_EDEFAULT : newFilterOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPIMMetamodelPackage.FILTER_OPERATION__FILTER_OPERATION, oldFilterOperation, filterOperation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPIMMetamodelPackage.FILTER_OPERATION__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QueryPIMMetamodelPackage.FILTER_OPERATION__FILTER_OPERATION:
				return getFilterOperation();
			case QueryPIMMetamodelPackage.FILTER_OPERATION__VALUE:
				return getValue();
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
			case QueryPIMMetamodelPackage.FILTER_OPERATION__FILTER_OPERATION:
				setFilterOperation((FilterOperationType)newValue);
				return;
			case QueryPIMMetamodelPackage.FILTER_OPERATION__VALUE:
				setValue((String)newValue);
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
			case QueryPIMMetamodelPackage.FILTER_OPERATION__FILTER_OPERATION:
				setFilterOperation(FILTER_OPERATION_EDEFAULT);
				return;
			case QueryPIMMetamodelPackage.FILTER_OPERATION__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case QueryPIMMetamodelPackage.FILTER_OPERATION__FILTER_OPERATION:
				return filterOperation != FILTER_OPERATION_EDEFAULT;
			case QueryPIMMetamodelPackage.FILTER_OPERATION__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
		result.append(" (filterOperation: ");
		result.append(filterOperation);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //FilterOperationImpl
