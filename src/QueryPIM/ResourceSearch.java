/**
 */
package QueryPIM;

import ServicePIM.Property;
import ServicePIM.Resource;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Search</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QueryPIM.ResourceSearch#getResource <em>Resource</em>}</li>
 *   <li>{@link QueryPIM.ResourceSearch#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @see QueryPIM.QueryPIMMetamodelPackage#getResourceSearch()
 * @model annotation="http://www.obeo.fr/dsl/dnc/archetype archetype='Role'"
 * @generated
 */
public interface ResourceSearch extends EObject {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(Resource)
	 * @see QueryPIM.QueryPIMMetamodelPackage#getResourceSearch_Resource()
	 * @model required="true"
	 * @generated
	 */
	Resource getResource();

	/**
	 * Sets the value of the '{@link QueryPIM.ResourceSearch#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Resource value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference list.
	 * The list contents are of type {@link ServicePIM.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference list.
	 * @see QueryPIM.QueryPIMMetamodelPackage#getResourceSearch_Property()
	 * @model
	 * @generated
	 */
	EList<Property> getProperty();

} // ResourceSearch
