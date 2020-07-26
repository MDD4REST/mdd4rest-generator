/**
 */
package SecurityPIM;

import ServicePIM.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SecurityPIM.User#getUsername <em>Username</em>}</li>
 * </ul>
 *
 * @see SecurityPIM.SecurityPIMMetamodelPackage#getUser()
 * @model
 * @generated
 */
public interface User extends Resource {

	/**
	 * Returns the value of the '<em><b>Username</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' containment reference.
	 * @see #setUsername(Username)
	 * @see SecurityPIM.SecurityPIMMetamodelPackage#getUser_Username()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Username getUsername();

	/**
	 * Sets the value of the '{@link SecurityPIM.User#getUsername <em>Username</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' containment reference.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(Username value);
} // User
