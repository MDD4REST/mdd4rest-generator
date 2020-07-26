/**
 */
package QueryPIM.impl;

import QueryPIM.Caching;
import QueryPIM.Filter;
import QueryPIM.FilterOperation;
import QueryPIM.FilterOperationType;
import QueryPIM.FilterType;
import QueryPIM.GlobalSearch;
import QueryPIM.OrderBy;
import QueryPIM.OrderDirection;
import QueryPIM.Pagination;
import QueryPIM.Query;
import QueryPIM.QueryPIMMetamodelFactory;
import QueryPIM.QueryPIMMetamodelPackage;
import QueryPIM.ResourceSearch;
import QueryPIM.ScopeSearch;
import QueryPIM.Select;
import QueryPIM.Sort;

import SecurityPIM.SecurityPIMMetamodelPackage;

import SecurityPIM.impl.SecurityPIMMetamodelPackageImpl;

import ServicePIM.ServicePIMPackage;

import ServicePIM.impl.ServicePIMPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QueryPIMMetamodelPackageImpl extends EPackageImpl implements QueryPIMMetamodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderByEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalSearchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scopeSearchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceSearchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paginationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cachingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum filterOperationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum orderDirectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum filterTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see QueryPIM.QueryPIMMetamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QueryPIMMetamodelPackageImpl() {
		super(eNS_URI, QueryPIMMetamodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link QueryPIMMetamodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QueryPIMMetamodelPackage init() {
		if (isInited) return (QueryPIMMetamodelPackage)EPackage.Registry.INSTANCE.getEPackage(QueryPIMMetamodelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredQueryPIMMetamodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		QueryPIMMetamodelPackageImpl theQueryPIMMetamodelPackage = registeredQueryPIMMetamodelPackage instanceof QueryPIMMetamodelPackageImpl ? (QueryPIMMetamodelPackageImpl)registeredQueryPIMMetamodelPackage : new QueryPIMMetamodelPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ServicePIMPackage.eNS_URI);
		ServicePIMPackageImpl theServicePIMPackage = (ServicePIMPackageImpl)(registeredPackage instanceof ServicePIMPackageImpl ? registeredPackage : ServicePIMPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SecurityPIMMetamodelPackage.eNS_URI);
		SecurityPIMMetamodelPackageImpl theSecurityPIMMetamodelPackage = (SecurityPIMMetamodelPackageImpl)(registeredPackage instanceof SecurityPIMMetamodelPackageImpl ? registeredPackage : SecurityPIMMetamodelPackage.eINSTANCE);

		// Create package meta-data objects
		theQueryPIMMetamodelPackage.createPackageContents();
		theServicePIMPackage.createPackageContents();
		theSecurityPIMMetamodelPackage.createPackageContents();

		// Initialize created meta-data
		theQueryPIMMetamodelPackage.initializePackageContents();
		theServicePIMPackage.initializePackageContents();
		theSecurityPIMMetamodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQueryPIMMetamodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QueryPIMMetamodelPackage.eNS_URI, theQueryPIMMetamodelPackage);
		return theQueryPIMMetamodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderBy() {
		return orderByEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderBy_OrderDirection() {
		return (EAttribute)orderByEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSelect() {
		return selectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlobalSearch() {
		return globalSearchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlobalSearch_Resourcesearch() {
		return (EReference)globalSearchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScopeSearch() {
		return scopeSearchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceSearch() {
		return resourceSearchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceSearch_Resource() {
		return (EReference)resourceSearchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceSearch_Property() {
		return (EReference)resourceSearchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPagination() {
		return paginationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPagination_Limit() {
		return (EAttribute)paginationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPagination_Offset() {
		return (EAttribute)paginationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSort() {
		return sortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSort_Orderby() {
		return (EReference)sortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQuery() {
		return queryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQuery_Property() {
		return (EReference)queryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFilterOperation() {
		return filterOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFilterOperation_FilterOperation() {
		return (EAttribute)filterOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFilterOperation_Value() {
		return (EAttribute)filterOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFilter() {
		return filterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFilter_FilterType() {
		return (EAttribute)filterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFilter_FilterOperations() {
		return (EReference)filterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCaching() {
		return cachingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCaching_CachingType() {
		return (EAttribute)cachingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCaching_Expiration() {
		return (EAttribute)cachingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFilterOperationType() {
		return filterOperationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOrderDirection() {
		return orderDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFilterType() {
		return filterTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QueryPIMMetamodelFactory getQueryPIMMetamodelFactory() {
		return (QueryPIMMetamodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		orderByEClass = createEClass(ORDER_BY);
		createEAttribute(orderByEClass, ORDER_BY__ORDER_DIRECTION);

		selectEClass = createEClass(SELECT);

		globalSearchEClass = createEClass(GLOBAL_SEARCH);
		createEReference(globalSearchEClass, GLOBAL_SEARCH__RESOURCESEARCH);

		scopeSearchEClass = createEClass(SCOPE_SEARCH);

		resourceSearchEClass = createEClass(RESOURCE_SEARCH);
		createEReference(resourceSearchEClass, RESOURCE_SEARCH__RESOURCE);
		createEReference(resourceSearchEClass, RESOURCE_SEARCH__PROPERTY);

		paginationEClass = createEClass(PAGINATION);
		createEAttribute(paginationEClass, PAGINATION__LIMIT);
		createEAttribute(paginationEClass, PAGINATION__OFFSET);

		sortEClass = createEClass(SORT);
		createEReference(sortEClass, SORT__ORDERBY);

		queryEClass = createEClass(QUERY);
		createEReference(queryEClass, QUERY__PROPERTY);

		filterOperationEClass = createEClass(FILTER_OPERATION);
		createEAttribute(filterOperationEClass, FILTER_OPERATION__FILTER_OPERATION);
		createEAttribute(filterOperationEClass, FILTER_OPERATION__VALUE);

		filterEClass = createEClass(FILTER);
		createEAttribute(filterEClass, FILTER__FILTER_TYPE);
		createEReference(filterEClass, FILTER__FILTER_OPERATIONS);

		cachingEClass = createEClass(CACHING);
		createEAttribute(cachingEClass, CACHING__CACHING_TYPE);
		createEAttribute(cachingEClass, CACHING__EXPIRATION);

		// Create enums
		filterOperationTypeEEnum = createEEnum(FILTER_OPERATION_TYPE);
		orderDirectionEEnum = createEEnum(ORDER_DIRECTION);
		filterTypeEEnum = createEEnum(FILTER_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ServicePIMPackage theServicePIMPackage = (ServicePIMPackage)EPackage.Registry.INSTANCE.getEPackage(ServicePIMPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		orderByEClass.getESuperTypes().add(this.getQuery());
		selectEClass.getESuperTypes().add(this.getQuery());
		scopeSearchEClass.getESuperTypes().add(this.getQuery());
		filterEClass.getESuperTypes().add(this.getQuery());

		// Initialize classes, features, and operations; add parameters
		initEClass(orderByEClass, OrderBy.class, "OrderBy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderBy_OrderDirection(), this.getOrderDirection(), "orderDirection", null, 0, 1, OrderBy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectEClass, Select.class, "Select", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(globalSearchEClass, GlobalSearch.class, "GlobalSearch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlobalSearch_Resourcesearch(), this.getResourceSearch(), null, "resourcesearch", null, 0, -1, GlobalSearch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scopeSearchEClass, ScopeSearch.class, "ScopeSearch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resourceSearchEClass, ResourceSearch.class, "ResourceSearch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceSearch_Resource(), theServicePIMPackage.getResource(), null, "resource", null, 1, 1, ResourceSearch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceSearch_Property(), theServicePIMPackage.getProperty(), null, "property", null, 0, -1, ResourceSearch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paginationEClass, Pagination.class, "Pagination", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPagination_Limit(), ecorePackage.getEInt(), "limit", null, 1, 1, Pagination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPagination_Offset(), ecorePackage.getEInt(), "offset", null, 0, 1, Pagination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sortEClass, Sort.class, "Sort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSort_Orderby(), this.getOrderBy(), null, "orderby", null, 0, -1, Sort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryEClass, Query.class, "Query", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuery_Property(), theServicePIMPackage.getProperty(), null, "property", null, 1, -1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filterOperationEClass, FilterOperation.class, "FilterOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFilterOperation_FilterOperation(), this.getFilterOperationType(), "filterOperation", null, 1, 1, FilterOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilterOperation_Value(), ecorePackage.getEString(), "value", null, 0, 1, FilterOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filterEClass, Filter.class, "Filter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFilter_FilterType(), this.getFilterType(), "filterType", null, 1, 1, Filter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilter_FilterOperations(), this.getFilterOperation(), null, "filterOperations", null, 0, -1, Filter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cachingEClass, Caching.class, "Caching", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCaching_CachingType(), ecorePackage.getEString(), "cachingType", null, 0, 1, Caching.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCaching_Expiration(), ecorePackage.getEInt(), "Expiration", null, 0, 1, Caching.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(filterOperationTypeEEnum, FilterOperationType.class, "FilterOperationType");
		addEEnumLiteral(filterOperationTypeEEnum, FilterOperationType.EQ);
		addEEnumLiteral(filterOperationTypeEEnum, FilterOperationType.LTE);
		addEEnumLiteral(filterOperationTypeEEnum, FilterOperationType.GTE);
		addEEnumLiteral(filterOperationTypeEEnum, FilterOperationType.EXISTS);
		addEEnumLiteral(filterOperationTypeEEnum, FilterOperationType.REGEX);
		addEEnumLiteral(filterOperationTypeEEnum, FilterOperationType.BEFORE);
		addEEnumLiteral(filterOperationTypeEEnum, FilterOperationType.AFTER);

		initEEnum(orderDirectionEEnum, OrderDirection.class, "OrderDirection");
		addEEnumLiteral(orderDirectionEEnum, OrderDirection.ASC);
		addEEnumLiteral(orderDirectionEEnum, OrderDirection.DESC);

		initEEnum(filterTypeEEnum, FilterType.class, "FilterType");
		addEEnumLiteral(filterTypeEEnum, FilterType.STRING);
		addEEnumLiteral(filterTypeEEnum, FilterType.NUMBER);
		addEEnumLiteral(filterTypeEEnum, FilterType.SELECT);
		addEEnumLiteral(filterTypeEEnum, FilterType.DATE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.obeo.fr/dsl/dnc/archetype
		createArchetypeAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.obeo.fr/dsl/dnc/archetype</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createArchetypeAnnotations() {
		String source = "http://www.obeo.fr/dsl/dnc/archetype";
		addAnnotation
		  (resourceSearchEClass,
		   source,
		   new String[] {
			   "archetype", "Role"
		   });
	}

} //QueryPIMMetamodelPackageImpl
