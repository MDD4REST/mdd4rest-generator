/**
 */
package QueryPIM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see QueryPIM.QueryPIMMetamodelPackage
 * @generated
 */
public interface QueryPIMMetamodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QueryPIMMetamodelFactory eINSTANCE = QueryPIM.impl.QueryPIMMetamodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Order By</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Order By</em>'.
	 * @generated
	 */
	OrderBy createOrderBy();

	/**
	 * Returns a new object of class '<em>Select</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Select</em>'.
	 * @generated
	 */
	Select createSelect();

	/**
	 * Returns a new object of class '<em>Global Search</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Global Search</em>'.
	 * @generated
	 */
	GlobalSearch createGlobalSearch();

	/**
	 * Returns a new object of class '<em>Scope Search</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scope Search</em>'.
	 * @generated
	 */
	ScopeSearch createScopeSearch();

	/**
	 * Returns a new object of class '<em>Resource Search</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Search</em>'.
	 * @generated
	 */
	ResourceSearch createResourceSearch();

	/**
	 * Returns a new object of class '<em>Pagination</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pagination</em>'.
	 * @generated
	 */
	Pagination createPagination();

	/**
	 * Returns a new object of class '<em>Sort</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sort</em>'.
	 * @generated
	 */
	Sort createSort();

	/**
	 * Returns a new object of class '<em>Filter Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter Operation</em>'.
	 * @generated
	 */
	FilterOperation createFilterOperation();

	/**
	 * Returns a new object of class '<em>Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter</em>'.
	 * @generated
	 */
	Filter createFilter();

	/**
	 * Returns a new object of class '<em>Caching</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Caching</em>'.
	 * @generated
	 */
	Caching createCaching();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QueryPIMMetamodelPackage getQueryPIMMetamodelPackage();

} //QueryPIMMetamodelFactory
