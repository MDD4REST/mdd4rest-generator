/**
 */
package QueryPIM.impl;

import QueryPIM.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QueryPIMMetamodelFactoryImpl extends EFactoryImpl implements QueryPIMMetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QueryPIMMetamodelFactory init() {
		try {
			QueryPIMMetamodelFactory theQueryPIMMetamodelFactory = (QueryPIMMetamodelFactory)EPackage.Registry.INSTANCE.getEFactory(QueryPIMMetamodelPackage.eNS_URI);
			if (theQueryPIMMetamodelFactory != null) {
				return theQueryPIMMetamodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QueryPIMMetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryPIMMetamodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QueryPIMMetamodelPackage.ORDER_BY: return createOrderBy();
			case QueryPIMMetamodelPackage.SELECT: return createSelect();
			case QueryPIMMetamodelPackage.GLOBAL_SEARCH: return createGlobalSearch();
			case QueryPIMMetamodelPackage.SCOPE_SEARCH: return createScopeSearch();
			case QueryPIMMetamodelPackage.RESOURCE_SEARCH: return createResourceSearch();
			case QueryPIMMetamodelPackage.PAGINATION: return createPagination();
			case QueryPIMMetamodelPackage.SORT: return createSort();
			case QueryPIMMetamodelPackage.FILTER_OPERATION: return createFilterOperation();
			case QueryPIMMetamodelPackage.FILTER: return createFilter();
			case QueryPIMMetamodelPackage.CACHING: return createCaching();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case QueryPIMMetamodelPackage.FILTER_OPERATION_TYPE:
				return createFilterOperationTypeFromString(eDataType, initialValue);
			case QueryPIMMetamodelPackage.ORDER_DIRECTION:
				return createOrderDirectionFromString(eDataType, initialValue);
			case QueryPIMMetamodelPackage.FILTER_TYPE:
				return createFilterTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case QueryPIMMetamodelPackage.FILTER_OPERATION_TYPE:
				return convertFilterOperationTypeToString(eDataType, instanceValue);
			case QueryPIMMetamodelPackage.ORDER_DIRECTION:
				return convertOrderDirectionToString(eDataType, instanceValue);
			case QueryPIMMetamodelPackage.FILTER_TYPE:
				return convertFilterTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderBy createOrderBy() {
		OrderByImpl orderBy = new OrderByImpl();
		return orderBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Select createSelect() {
		SelectImpl select = new SelectImpl();
		return select;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlobalSearch createGlobalSearch() {
		GlobalSearchImpl globalSearch = new GlobalSearchImpl();
		return globalSearch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScopeSearch createScopeSearch() {
		ScopeSearchImpl scopeSearch = new ScopeSearchImpl();
		return scopeSearch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceSearch createResourceSearch() {
		ResourceSearchImpl resourceSearch = new ResourceSearchImpl();
		return resourceSearch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pagination createPagination() {
		PaginationImpl pagination = new PaginationImpl();
		return pagination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sort createSort() {
		SortImpl sort = new SortImpl();
		return sort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FilterOperation createFilterOperation() {
		FilterOperationImpl filterOperation = new FilterOperationImpl();
		return filterOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Filter createFilter() {
		FilterImpl filter = new FilterImpl();
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Caching createCaching() {
		CachingImpl caching = new CachingImpl();
		return caching;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterOperationType createFilterOperationTypeFromString(EDataType eDataType, String initialValue) {
		FilterOperationType result = FilterOperationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFilterOperationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderDirection createOrderDirectionFromString(EDataType eDataType, String initialValue) {
		OrderDirection result = OrderDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrderDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType createFilterTypeFromString(EDataType eDataType, String initialValue) {
		FilterType result = FilterType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFilterTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QueryPIMMetamodelPackage getQueryPIMMetamodelPackage() {
		return (QueryPIMMetamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QueryPIMMetamodelPackage getPackage() {
		return QueryPIMMetamodelPackage.eINSTANCE;
	}

} //QueryPIMMetamodelFactoryImpl
