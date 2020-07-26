/**
 */
package SecurityPIM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decentral Auth</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SecurityPIM.DecentralAuth#getAuthorization <em>Authorization</em>}</li>
 * </ul>
 *
 * @see SecurityPIM.SecurityPIMMetamodelPackage#getDecentralAuth()
 * @model
 * @generated
 */
public interface DecentralAuth extends Authentication {
	/**
	 * Returns the value of the '<em><b>Authorization</b></em>' containment reference list.
	 * The list contents are of type {@link SecurityPIM.Authorization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorization</em>' containment reference list.
	 * @see SecurityPIM.SecurityPIMMetamodelPackage#getDecentralAuth_Authorization()
	 * @model containment="true"
	 * @generated
	 */
	EList<Authorization> getAuthorization();

} // DecentralAuth
