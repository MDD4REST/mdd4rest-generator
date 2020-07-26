/**
 */
package SecurityPIM;

import ServicePIM.Activity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SecurityPIM.Permission#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link SecurityPIM.Permission#getPermissionType <em>Permission Type</em>}</li>
 *   <li>{@link SecurityPIM.Permission#getActivity <em>Activity</em>}</li>
 * </ul>
 *
 * @see SecurityPIM.SecurityPIMMetamodelPackage#getPermission()
 * @model
 * @generated
 */
public interface Permission extends EObject {
	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link SecurityPIM.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference list.
	 * @see SecurityPIM.SecurityPIMMetamodelPackage#getPermission_Constraint()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraint();

	/**
	 * Returns the value of the '<em><b>Permission Type</b></em>' attribute.
	 * The literals are from the enumeration {@link SecurityPIM.PermissionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permission Type</em>' attribute.
	 * @see SecurityPIM.PermissionType
	 * @see #setPermissionType(PermissionType)
	 * @see SecurityPIM.SecurityPIMMetamodelPackage#getPermission_PermissionType()
	 * @model
	 * @generated
	 */
	PermissionType getPermissionType();

	/**
	 * Sets the value of the '{@link SecurityPIM.Permission#getPermissionType <em>Permission Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permission Type</em>' attribute.
	 * @see SecurityPIM.PermissionType
	 * @see #getPermissionType()
	 * @generated
	 */
	void setPermissionType(PermissionType value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' reference list.
	 * The list contents are of type {@link ServicePIM.Activity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' reference list.
	 * @see SecurityPIM.SecurityPIMMetamodelPackage#getPermission_Activity()
	 * @model required="true"
	 * @generated
	 */
	EList<Activity> getActivity();

} // Permission
