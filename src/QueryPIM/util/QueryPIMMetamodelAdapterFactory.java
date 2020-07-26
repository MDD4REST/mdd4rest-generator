/**
 */
package QueryPIM.util;

import QueryPIM.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see QueryPIM.QueryPIMMetamodelPackage
 * @generated
 */
public class QueryPIMMetamodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QueryPIMMetamodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryPIMMetamodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = QueryPIMMetamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryPIMMetamodelSwitch<Adapter> modelSwitch =
		new QueryPIMMetamodelSwitch<Adapter>() {
			@Override
			public Adapter caseOrderBy(OrderBy object) {
				return createOrderByAdapter();
			}
			@Override
			public Adapter caseSelect(Select object) {
				return createSelectAdapter();
			}
			@Override
			public Adapter caseGlobalSearch(GlobalSearch object) {
				return createGlobalSearchAdapter();
			}
			@Override
			public Adapter caseScopeSearch(ScopeSearch object) {
				return createScopeSearchAdapter();
			}
			@Override
			public Adapter caseResourceSearch(ResourceSearch object) {
				return createResourceSearchAdapter();
			}
			@Override
			public Adapter casePagination(Pagination object) {
				return createPaginationAdapter();
			}
			@Override
			public Adapter caseSort(Sort object) {
				return createSortAdapter();
			}
			@Override
			public Adapter caseQuery(Query object) {
				return createQueryAdapter();
			}
			@Override
			public Adapter caseFilterOperation(FilterOperation object) {
				return createFilterOperationAdapter();
			}
			@Override
			public Adapter caseFilter(Filter object) {
				return createFilterAdapter();
			}
			@Override
			public Adapter caseCaching(Caching object) {
				return createCachingAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link QueryPIM.OrderBy <em>Order By</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QueryPIM.OrderBy
	 * @generated
	 */
	public Adapter createOrderByAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QueryPIM.Select <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QueryPIM.Select
	 * @generated
	 */
	public Adapter createSelectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QueryPIM.GlobalSearch <em>Global Search</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QueryPIM.GlobalSearch
	 * @generated
	 */
	public Adapter createGlobalSearchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QueryPIM.ScopeSearch <em>Scope Search</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QueryPIM.ScopeSearch
	 * @generated
	 */
	public Adapter createScopeSearchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QueryPIM.ResourceSearch <em>Resource Search</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QueryPIM.ResourceSearch
	 * @generated
	 */
	public Adapter createResourceSearchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QueryPIM.Pagination <em>Pagination</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QueryPIM.Pagination
	 * @generated
	 */
	public Adapter createPaginationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QueryPIM.Sort <em>Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QueryPIM.Sort
	 * @generated
	 */
	public Adapter createSortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QueryPIM.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QueryPIM.Query
	 * @generated
	 */
	public Adapter createQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QueryPIM.FilterOperation <em>Filter Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QueryPIM.FilterOperation
	 * @generated
	 */
	public Adapter createFilterOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QueryPIM.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QueryPIM.Filter
	 * @generated
	 */
	public Adapter createFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QueryPIM.Caching <em>Caching</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QueryPIM.Caching
	 * @generated
	 */
	public Adapter createCachingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //QueryPIMMetamodelAdapterFactory
