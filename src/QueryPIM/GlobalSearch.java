/**
 */
package QueryPIM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Search</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QueryPIM.GlobalSearch#getResourcesearch <em>Resourcesearch</em>}</li>
 * </ul>
 *
 * @see QueryPIM.QueryPIMMetamodelPackage#getGlobalSearch()
 * @model
 * @generated
 */
public interface GlobalSearch extends EObject {
	/**
	 * Returns the value of the '<em><b>Resourcesearch</b></em>' containment reference list.
	 * The list contents are of type {@link QueryPIM.ResourceSearch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resourcesearch</em>' containment reference list.
	 * @see QueryPIM.QueryPIMMetamodelPackage#getGlobalSearch_Resourcesearch()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceSearch> getResourcesearch();

} // GlobalSearch
