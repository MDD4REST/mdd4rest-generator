/**
 */
package QueryPIM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see QueryPIM.QueryPIMMetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface QueryPIMMetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "QueryPIM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "src/metamodels/PIM/QueryPIMMetamodel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mde";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QueryPIMMetamodelPackage eINSTANCE = QueryPIM.impl.QueryPIMMetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link QueryPIM.impl.QueryImpl <em>Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryPIM.impl.QueryImpl
	 * @see QueryPIM.impl.QueryPIMMetamodelPackageImpl#getQuery()
	 * @generated
	 */
	int QUERY = 7;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__PROPERTY = 0;

	/**
	 * The number of structural features of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QueryPIM.impl.OrderByImpl <em>Order By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryPIM.impl.OrderByImpl
	 * @see QueryPIM.impl.QueryPIMMetamodelPackageImpl#getOrderBy()
	 * @generated
	 */
	int ORDER_BY = 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_BY__PROPERTY = QUERY__PROPERTY;

	/**
	 * The feature id for the '<em><b>Order Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_BY__ORDER_DIRECTION = QUERY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Order By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_BY_FEATURE_COUNT = QUERY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Order By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_BY_OPERATION_COUNT = QUERY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QueryPIM.impl.SelectImpl <em>Select</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryPIM.impl.SelectImpl
	 * @see QueryPIM.impl.QueryPIMMetamodelPackageImpl#getSelect()
	 * @generated
	 */
	int SELECT = 1;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__PROPERTY = QUERY__PROPERTY;

	/**
	 * The number of structural features of the '<em>Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_FEATURE_COUNT = QUERY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_OPERATION_COUNT = QUERY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QueryPIM.impl.GlobalSearchImpl <em>Global Search</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryPIM.impl.GlobalSearchImpl
	 * @see QueryPIM.impl.QueryPIMMetamodelPackageImpl#getGlobalSearch()
	 * @generated
	 */
	int GLOBAL_SEARCH = 2;

	/**
	 * The feature id for the '<em><b>Resourcesearch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SEARCH__RESOURCESEARCH = 0;

	/**
	 * The number of structural features of the '<em>Global Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SEARCH_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Global Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SEARCH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QueryPIM.impl.ScopeSearchImpl <em>Scope Search</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryPIM.impl.ScopeSearchImpl
	 * @see QueryPIM.impl.QueryPIMMetamodelPackageImpl#getScopeSearch()
	 * @generated
	 */
	int SCOPE_SEARCH = 3;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SEARCH__PROPERTY = QUERY__PROPERTY;

	/**
	 * The number of structural features of the '<em>Scope Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SEARCH_FEATURE_COUNT = QUERY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Scope Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_SEARCH_OPERATION_COUNT = QUERY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QueryPIM.impl.ResourceSearchImpl <em>Resource Search</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryPIM.impl.ResourceSearchImpl
	 * @see QueryPIM.impl.QueryPIMMetamodelPackageImpl#getResourceSearch()
	 * @generated
	 */
	int RESOURCE_SEARCH = 4;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SEARCH__RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SEARCH__PROPERTY = 1;

	/**
	 * The number of structural features of the '<em>Resource Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SEARCH_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Resource Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SEARCH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QueryPIM.impl.PaginationImpl <em>Pagination</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryPIM.impl.PaginationImpl
	 * @see QueryPIM.impl.QueryPIMMetamodelPackageImpl#getPagination()
	 * @generated
	 */
	int PAGINATION = 5;

	/**
	 * The feature id for the '<em><b>Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION__LIMIT = 0;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION__OFFSET = 1;

	/**
	 * The number of structural features of the '<em>Pagination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Pagination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QueryPIM.impl.SortImpl <em>Sort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryPIM.impl.SortImpl
	 * @see QueryPIM.impl.QueryPIMMetamodelPackageImpl#getSort()
	 * @generated
	 */
	int SORT = 6;

	/**
	 * The feature id for the '<em><b>Orderby</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT__ORDERBY = 0;

	/**
	 * The number of structural features of the '<em>Sort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Sort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QueryPIM.impl.FilterOperationImpl <em>Filter Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryPIM.impl.FilterOperationImpl
	 * @see QueryPIM.impl.QueryPIMMetamodelPackageImpl#getFilterOperation()
	 * @generated
	 */
	int FILTER_OPERATION = 8;

	/**
	 * The feature id for the '<em><b>Filter Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_OPERATION__FILTER_OPERATION = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_OPERATION__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Filter Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_OPERATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Filter Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QueryPIM.impl.FilterImpl <em>Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryPIM.impl.FilterImpl
	 * @see QueryPIM.impl.QueryPIMMetamodelPackageImpl#getFilter()
	 * @generated
	 */
	int FILTER = 9;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__PROPERTY = QUERY__PROPERTY;

	/**
	 * The feature id for the '<em><b>Filter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__FILTER_TYPE = QUERY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__FILTER_OPERATIONS = QUERY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FEATURE_COUNT = QUERY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_OPERATION_COUNT = QUERY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QueryPIM.impl.CachingImpl <em>Caching</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryPIM.impl.CachingImpl
	 * @see QueryPIM.impl.QueryPIMMetamodelPackageImpl#getCaching()
	 * @generated
	 */
	int CACHING = 10;

	/**
	 * The feature id for the '<em><b>Caching Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHING__CACHING_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Expiration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHING__EXPIRATION = 1;

	/**
	 * The number of structural features of the '<em>Caching</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Caching</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QueryPIM.FilterOperationType <em>Filter Operation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryPIM.FilterOperationType
	 * @see QueryPIM.impl.QueryPIMMetamodelPackageImpl#getFilterOperationType()
	 * @generated
	 */
	int FILTER_OPERATION_TYPE = 11;

	/**
	 * The meta object id for the '{@link QueryPIM.OrderDirection <em>Order Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryPIM.OrderDirection
	 * @see QueryPIM.impl.QueryPIMMetamodelPackageImpl#getOrderDirection()
	 * @generated
	 */
	int ORDER_DIRECTION = 12;

	/**
	 * The meta object id for the '{@link QueryPIM.FilterType <em>Filter Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryPIM.FilterType
	 * @see QueryPIM.impl.QueryPIMMetamodelPackageImpl#getFilterType()
	 * @generated
	 */
	int FILTER_TYPE = 13;


	/**
	 * Returns the meta object for class '{@link QueryPIM.OrderBy <em>Order By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order By</em>'.
	 * @see QueryPIM.OrderBy
	 * @generated
	 */
	EClass getOrderBy();

	/**
	 * Returns the meta object for the attribute '{@link QueryPIM.OrderBy#getOrderDirection <em>Order Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Direction</em>'.
	 * @see QueryPIM.OrderBy#getOrderDirection()
	 * @see #getOrderBy()
	 * @generated
	 */
	EAttribute getOrderBy_OrderDirection();

	/**
	 * Returns the meta object for class '{@link QueryPIM.Select <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select</em>'.
	 * @see QueryPIM.Select
	 * @generated
	 */
	EClass getSelect();

	/**
	 * Returns the meta object for class '{@link QueryPIM.GlobalSearch <em>Global Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Search</em>'.
	 * @see QueryPIM.GlobalSearch
	 * @generated
	 */
	EClass getGlobalSearch();

	/**
	 * Returns the meta object for the containment reference list '{@link QueryPIM.GlobalSearch#getResourcesearch <em>Resourcesearch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resourcesearch</em>'.
	 * @see QueryPIM.GlobalSearch#getResourcesearch()
	 * @see #getGlobalSearch()
	 * @generated
	 */
	EReference getGlobalSearch_Resourcesearch();

	/**
	 * Returns the meta object for class '{@link QueryPIM.ScopeSearch <em>Scope Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scope Search</em>'.
	 * @see QueryPIM.ScopeSearch
	 * @generated
	 */
	EClass getScopeSearch();

	/**
	 * Returns the meta object for class '{@link QueryPIM.ResourceSearch <em>Resource Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Search</em>'.
	 * @see QueryPIM.ResourceSearch
	 * @generated
	 */
	EClass getResourceSearch();

	/**
	 * Returns the meta object for the reference '{@link QueryPIM.ResourceSearch#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see QueryPIM.ResourceSearch#getResource()
	 * @see #getResourceSearch()
	 * @generated
	 */
	EReference getResourceSearch_Resource();

	/**
	 * Returns the meta object for the reference list '{@link QueryPIM.ResourceSearch#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Property</em>'.
	 * @see QueryPIM.ResourceSearch#getProperty()
	 * @see #getResourceSearch()
	 * @generated
	 */
	EReference getResourceSearch_Property();

	/**
	 * Returns the meta object for class '{@link QueryPIM.Pagination <em>Pagination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pagination</em>'.
	 * @see QueryPIM.Pagination
	 * @generated
	 */
	EClass getPagination();

	/**
	 * Returns the meta object for the attribute '{@link QueryPIM.Pagination#getLimit <em>Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Limit</em>'.
	 * @see QueryPIM.Pagination#getLimit()
	 * @see #getPagination()
	 * @generated
	 */
	EAttribute getPagination_Limit();

	/**
	 * Returns the meta object for the attribute '{@link QueryPIM.Pagination#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see QueryPIM.Pagination#getOffset()
	 * @see #getPagination()
	 * @generated
	 */
	EAttribute getPagination_Offset();

	/**
	 * Returns the meta object for class '{@link QueryPIM.Sort <em>Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sort</em>'.
	 * @see QueryPIM.Sort
	 * @generated
	 */
	EClass getSort();

	/**
	 * Returns the meta object for the containment reference list '{@link QueryPIM.Sort#getOrderby <em>Orderby</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Orderby</em>'.
	 * @see QueryPIM.Sort#getOrderby()
	 * @see #getSort()
	 * @generated
	 */
	EReference getSort_Orderby();

	/**
	 * Returns the meta object for class '{@link QueryPIM.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query</em>'.
	 * @see QueryPIM.Query
	 * @generated
	 */
	EClass getQuery();

	/**
	 * Returns the meta object for the reference list '{@link QueryPIM.Query#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Property</em>'.
	 * @see QueryPIM.Query#getProperty()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_Property();

	/**
	 * Returns the meta object for class '{@link QueryPIM.FilterOperation <em>Filter Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Operation</em>'.
	 * @see QueryPIM.FilterOperation
	 * @generated
	 */
	EClass getFilterOperation();

	/**
	 * Returns the meta object for the attribute '{@link QueryPIM.FilterOperation#getFilterOperation <em>Filter Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter Operation</em>'.
	 * @see QueryPIM.FilterOperation#getFilterOperation()
	 * @see #getFilterOperation()
	 * @generated
	 */
	EAttribute getFilterOperation_FilterOperation();

	/**
	 * Returns the meta object for the attribute '{@link QueryPIM.FilterOperation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see QueryPIM.FilterOperation#getValue()
	 * @see #getFilterOperation()
	 * @generated
	 */
	EAttribute getFilterOperation_Value();

	/**
	 * Returns the meta object for class '{@link QueryPIM.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter</em>'.
	 * @see QueryPIM.Filter
	 * @generated
	 */
	EClass getFilter();

	/**
	 * Returns the meta object for the attribute '{@link QueryPIM.Filter#getFilterType <em>Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter Type</em>'.
	 * @see QueryPIM.Filter#getFilterType()
	 * @see #getFilter()
	 * @generated
	 */
	EAttribute getFilter_FilterType();

	/**
	 * Returns the meta object for the containment reference list '{@link QueryPIM.Filter#getFilterOperations <em>Filter Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filter Operations</em>'.
	 * @see QueryPIM.Filter#getFilterOperations()
	 * @see #getFilter()
	 * @generated
	 */
	EReference getFilter_FilterOperations();

	/**
	 * Returns the meta object for class '{@link QueryPIM.Caching <em>Caching</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Caching</em>'.
	 * @see QueryPIM.Caching
	 * @generated
	 */
	EClass getCaching();

	/**
	 * Returns the meta object for the attribute '{@link QueryPIM.Caching#getCachingType <em>Caching Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caching Type</em>'.
	 * @see QueryPIM.Caching#getCachingType()
	 * @see #getCaching()
	 * @generated
	 */
	EAttribute getCaching_CachingType();

	/**
	 * Returns the meta object for the attribute '{@link QueryPIM.Caching#getExpiration <em>Expiration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiration</em>'.
	 * @see QueryPIM.Caching#getExpiration()
	 * @see #getCaching()
	 * @generated
	 */
	EAttribute getCaching_Expiration();

	/**
	 * Returns the meta object for enum '{@link QueryPIM.FilterOperationType <em>Filter Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Filter Operation Type</em>'.
	 * @see QueryPIM.FilterOperationType
	 * @generated
	 */
	EEnum getFilterOperationType();

	/**
	 * Returns the meta object for enum '{@link QueryPIM.OrderDirection <em>Order Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Order Direction</em>'.
	 * @see QueryPIM.OrderDirection
	 * @generated
	 */
	EEnum getOrderDirection();

	/**
	 * Returns the meta object for enum '{@link QueryPIM.FilterType <em>Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Filter Type</em>'.
	 * @see QueryPIM.FilterType
	 * @generated
	 */
	EEnum getFilterType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QueryPIMMetamodelFactory getQueryPIMMetamodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link QueryPIM.impl.OrderByImpl <em>Order By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryPIM.impl.OrderByImpl
		 * @see QueryPIM.impl.QueryPIMMetamodelPackageImpl#getOrderBy()
		 * @generated
		 */
		EClass ORDER_BY = eINSTANCE.getOrderBy();

		/**
		 * The meta object literal for the '<em><b>Order Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_BY__ORDER_DIRECTION = eINSTANCE.getOrderBy_OrderDirection();

		/**
		 * The meta object literal for the '{@link QueryPIM.impl.SelectImpl <em>Select</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryPIM.impl.SelectImpl
		 * @see QueryPIM.impl.QueryPIMMetamodelPackageImpl#getSelect()
		 * @generated
		 */
		EClass SELECT = eINSTANCE.getSelect();

		/**
		 * The meta object literal for the '{@link QueryPIM.impl.GlobalSearchImpl <em>Global Search</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryPIM.impl.GlobalSearchImpl
		 * @see QueryPIM.impl.QueryPIMMetamodelPackageImpl#getGlobalSearch()
		 * @generated
		 */
		EClass GLOBAL_SEARCH = eINSTANCE.getGlobalSearch();

		/**
		 * The meta object literal for the '<em><b>Resourcesearch</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_SEARCH__RESOURCESEARCH = eINSTANCE.getGlobalSearch_Resourcesearch();

		/**
		 * The meta object literal for the '{@link QueryPIM.impl.ScopeSearchImpl <em>Scope Search</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryPIM.impl.ScopeSearchImpl
		 * @see QueryPIM.impl.QueryPIMMetamodelPackageImpl#getScopeSearch()
		 * @generated
		 */
		EClass SCOPE_SEARCH = eINSTANCE.getScopeSearch();

		/**
		 * The meta object literal for the '{@link QueryPIM.impl.ResourceSearchImpl <em>Resource Search</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryPIM.impl.ResourceSearchImpl
		 * @see QueryPIM.impl.QueryPIMMetamodelPackageImpl#getResourceSearch()
		 * @generated
		 */
		EClass RESOURCE_SEARCH = eINSTANCE.getResourceSearch();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_SEARCH__RESOURCE = eINSTANCE.getResourceSearch_Resource();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_SEARCH__PROPERTY = eINSTANCE.getResourceSearch_Property();

		/**
		 * The meta object literal for the '{@link QueryPIM.impl.PaginationImpl <em>Pagination</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryPIM.impl.PaginationImpl
		 * @see QueryPIM.impl.QueryPIMMetamodelPackageImpl#getPagination()
		 * @generated
		 */
		EClass PAGINATION = eINSTANCE.getPagination();

		/**
		 * The meta object literal for the '<em><b>Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGINATION__LIMIT = eINSTANCE.getPagination_Limit();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGINATION__OFFSET = eINSTANCE.getPagination_Offset();

		/**
		 * The meta object literal for the '{@link QueryPIM.impl.SortImpl <em>Sort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryPIM.impl.SortImpl
		 * @see QueryPIM.impl.QueryPIMMetamodelPackageImpl#getSort()
		 * @generated
		 */
		EClass SORT = eINSTANCE.getSort();

		/**
		 * The meta object literal for the '<em><b>Orderby</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORT__ORDERBY = eINSTANCE.getSort_Orderby();

		/**
		 * The meta object literal for the '{@link QueryPIM.impl.QueryImpl <em>Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryPIM.impl.QueryImpl
		 * @see QueryPIM.impl.QueryPIMMetamodelPackageImpl#getQuery()
		 * @generated
		 */
		EClass QUERY = eINSTANCE.getQuery();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__PROPERTY = eINSTANCE.getQuery_Property();

		/**
		 * The meta object literal for the '{@link QueryPIM.impl.FilterOperationImpl <em>Filter Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryPIM.impl.FilterOperationImpl
		 * @see QueryPIM.impl.QueryPIMMetamodelPackageImpl#getFilterOperation()
		 * @generated
		 */
		EClass FILTER_OPERATION = eINSTANCE.getFilterOperation();

		/**
		 * The meta object literal for the '<em><b>Filter Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER_OPERATION__FILTER_OPERATION = eINSTANCE.getFilterOperation_FilterOperation();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER_OPERATION__VALUE = eINSTANCE.getFilterOperation_Value();

		/**
		 * The meta object literal for the '{@link QueryPIM.impl.FilterImpl <em>Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryPIM.impl.FilterImpl
		 * @see QueryPIM.impl.QueryPIMMetamodelPackageImpl#getFilter()
		 * @generated
		 */
		EClass FILTER = eINSTANCE.getFilter();

		/**
		 * The meta object literal for the '<em><b>Filter Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER__FILTER_TYPE = eINSTANCE.getFilter_FilterType();

		/**
		 * The meta object literal for the '<em><b>Filter Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER__FILTER_OPERATIONS = eINSTANCE.getFilter_FilterOperations();

		/**
		 * The meta object literal for the '{@link QueryPIM.impl.CachingImpl <em>Caching</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryPIM.impl.CachingImpl
		 * @see QueryPIM.impl.QueryPIMMetamodelPackageImpl#getCaching()
		 * @generated
		 */
		EClass CACHING = eINSTANCE.getCaching();

		/**
		 * The meta object literal for the '<em><b>Caching Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHING__CACHING_TYPE = eINSTANCE.getCaching_CachingType();

		/**
		 * The meta object literal for the '<em><b>Expiration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHING__EXPIRATION = eINSTANCE.getCaching_Expiration();

		/**
		 * The meta object literal for the '{@link QueryPIM.FilterOperationType <em>Filter Operation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryPIM.FilterOperationType
		 * @see QueryPIM.impl.QueryPIMMetamodelPackageImpl#getFilterOperationType()
		 * @generated
		 */
		EEnum FILTER_OPERATION_TYPE = eINSTANCE.getFilterOperationType();

		/**
		 * The meta object literal for the '{@link QueryPIM.OrderDirection <em>Order Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryPIM.OrderDirection
		 * @see QueryPIM.impl.QueryPIMMetamodelPackageImpl#getOrderDirection()
		 * @generated
		 */
		EEnum ORDER_DIRECTION = eINSTANCE.getOrderDirection();

		/**
		 * The meta object literal for the '{@link QueryPIM.FilterType <em>Filter Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryPIM.FilterType
		 * @see QueryPIM.impl.QueryPIMMetamodelPackageImpl#getFilterType()
		 * @generated
		 */
		EEnum FILTER_TYPE = eINSTANCE.getFilterType();

	}

} //QueryPIMMetamodelPackage
