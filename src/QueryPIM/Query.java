/**
 */
package QueryPIM;

import ServicePIM.Property;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QueryPIM.Query#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @see QueryPIM.QueryPIMMetamodelPackage#getQuery()
 * @model abstract="true"
 * @generated
 */
public interface Query extends EObject {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference list.
	 * The list contents are of type {@link ServicePIM.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference list.
	 * @see QueryPIM.QueryPIMMetamodelPackage#getQuery_Property()
	 * @model required="true"
	 * @generated
	 */
	EList<Property> getProperty();

} // Query
