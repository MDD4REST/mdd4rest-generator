/**
 */
package QueryPIM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pagination</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QueryPIM.Pagination#getLimit <em>Limit</em>}</li>
 *   <li>{@link QueryPIM.Pagination#getOffset <em>Offset</em>}</li>
 * </ul>
 *
 * @see QueryPIM.QueryPIMMetamodelPackage#getPagination()
 * @model
 * @generated
 */
public interface Pagination extends EObject {
	/**
	 * Returns the value of the '<em><b>Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limit</em>' attribute.
	 * @see #setLimit(int)
	 * @see QueryPIM.QueryPIMMetamodelPackage#getPagination_Limit()
	 * @model required="true"
	 * @generated
	 */
	int getLimit();

	/**
	 * Sets the value of the '{@link QueryPIM.Pagination#getLimit <em>Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limit</em>' attribute.
	 * @see #getLimit()
	 * @generated
	 */
	void setLimit(int value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #setOffset(int)
	 * @see QueryPIM.QueryPIMMetamodelPackage#getPagination_Offset()
	 * @model
	 * @generated
	 */
	int getOffset();

	/**
	 * Sets the value of the '{@link QueryPIM.Pagination#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(int value);

} // Pagination
