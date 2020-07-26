/**
 */
package QueryPIM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QueryPIM.Filter#getFilterType <em>Filter Type</em>}</li>
 *   <li>{@link QueryPIM.Filter#getFilterOperations <em>Filter Operations</em>}</li>
 * </ul>
 *
 * @see QueryPIM.QueryPIMMetamodelPackage#getFilter()
 * @model
 * @generated
 */
public interface Filter extends Query {
	/**
	 * Returns the value of the '<em><b>Filter Type</b></em>' attribute.
	 * The literals are from the enumeration {@link QueryPIM.FilterType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Type</em>' attribute.
	 * @see QueryPIM.FilterType
	 * @see #setFilterType(FilterType)
	 * @see QueryPIM.QueryPIMMetamodelPackage#getFilter_FilterType()
	 * @model required="true"
	 * @generated
	 */
	FilterType getFilterType();

	/**
	 * Sets the value of the '{@link QueryPIM.Filter#getFilterType <em>Filter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Type</em>' attribute.
	 * @see QueryPIM.FilterType
	 * @see #getFilterType()
	 * @generated
	 */
	void setFilterType(FilterType value);

	/**
	 * Returns the value of the '<em><b>Filter Operations</b></em>' containment reference list.
	 * The list contents are of type {@link QueryPIM.FilterOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Operations</em>' containment reference list.
	 * @see QueryPIM.QueryPIMMetamodelPackage#getFilter_FilterOperations()
	 * @model containment="true"
	 * @generated
	 */
	EList<FilterOperation> getFilterOperations();

} // Filter
