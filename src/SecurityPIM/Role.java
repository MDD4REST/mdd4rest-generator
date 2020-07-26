/**
 */
package SecurityPIM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SecurityPIM.Role#getPermission <em>Permission</em>}</li>
 *   <li>{@link SecurityPIM.Role#getName <em>Name</em>}</li>
 *   <li>{@link SecurityPIM.Role#getPermissionMode <em>Permission Mode</em>}</li>
 * </ul>
 *
 * @see SecurityPIM.SecurityPIMMetamodelPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends EObject {
	/**
	 * Returns the value of the '<em><b>Permission</b></em>' containment reference list.
	 * The list contents are of type {@link SecurityPIM.Permission}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permission</em>' containment reference list.
	 * @see SecurityPIM.SecurityPIMMetamodelPackage#getRole_Permission()
	 * @model containment="true"
	 * @generated
	 */
	EList<Permission> getPermission();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see SecurityPIM.SecurityPIMMetamodelPackage#getRole_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SecurityPIM.Role#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Permission Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link SecurityPIM.PermissionMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permission Mode</em>' attribute.
	 * @see SecurityPIM.PermissionMode
	 * @see #setPermissionMode(PermissionMode)
	 * @see SecurityPIM.SecurityPIMMetamodelPackage#getRole_PermissionMode()
	 * @model
	 * @generated
	 */
	PermissionMode getPermissionMode();

	/**
	 * Sets the value of the '{@link SecurityPIM.Role#getPermissionMode <em>Permission Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permission Mode</em>' attribute.
	 * @see SecurityPIM.PermissionMode
	 * @see #getPermissionMode()
	 * @generated
	 */
	void setPermissionMode(PermissionMode value);

} // Role
