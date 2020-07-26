/**
 */
package QueryPIM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sort</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QueryPIM.Sort#getOrderby <em>Orderby</em>}</li>
 * </ul>
 *
 * @see QueryPIM.QueryPIMMetamodelPackage#getSort()
 * @model
 * @generated
 */
public interface Sort extends EObject {
	/**
	 * Returns the value of the '<em><b>Orderby</b></em>' containment reference list.
	 * The list contents are of type {@link QueryPIM.OrderBy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orderby</em>' containment reference list.
	 * @see QueryPIM.QueryPIMMetamodelPackage#getSort_Orderby()
	 * @model containment="true"
	 * @generated
	 */
	EList<OrderBy> getOrderby();

} // Sort
