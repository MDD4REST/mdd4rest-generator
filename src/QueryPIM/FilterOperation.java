/**
 */
package QueryPIM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QueryPIM.FilterOperation#getFilterOperation <em>Filter Operation</em>}</li>
 *   <li>{@link QueryPIM.FilterOperation#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see QueryPIM.QueryPIMMetamodelPackage#getFilterOperation()
 * @model
 * @generated
 */
public interface FilterOperation extends EObject {
	/**
	 * Returns the value of the '<em><b>Filter Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link QueryPIM.FilterOperationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Operation</em>' attribute.
	 * @see QueryPIM.FilterOperationType
	 * @see #setFilterOperation(FilterOperationType)
	 * @see QueryPIM.QueryPIMMetamodelPackage#getFilterOperation_FilterOperation()
	 * @model required="true"
	 * @generated
	 */
	FilterOperationType getFilterOperation();

	/**
	 * Sets the value of the '{@link QueryPIM.FilterOperation#getFilterOperation <em>Filter Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Operation</em>' attribute.
	 * @see QueryPIM.FilterOperationType
	 * @see #getFilterOperation()
	 * @generated
	 */
	void setFilterOperation(FilterOperationType value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see QueryPIM.QueryPIMMetamodelPackage#getFilterOperation_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link QueryPIM.FilterOperation#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // FilterOperation
