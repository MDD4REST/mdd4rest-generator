/**
 */
package SecurityPIM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authentication</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see SecurityPIM.SecurityPIMMetamodelPackage#getAuthentication()
 * @model abstract="true"
 * @generated
 */
public interface Authentication extends EObject {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	User currentUser();
} // Authentication
