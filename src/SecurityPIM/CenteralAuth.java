/**
 */
package SecurityPIM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Centeral Auth</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SecurityPIM.CenteralAuth#getUaa <em>Uaa</em>}</li>
 * </ul>
 *
 * @see SecurityPIM.SecurityPIMMetamodelPackage#getCenteralAuth()
 * @model
 * @generated
 */
public interface CenteralAuth extends Authentication {
	/**
	 * Returns the value of the '<em><b>Uaa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uaa</em>' reference.
	 * @see #setUaa(UAA)
	 * @see SecurityPIM.SecurityPIMMetamodelPackage#getCenteralAuth_Uaa()
	 * @model required="true"
	 * @generated
	 */
	UAA getUaa();

	/**
	 * Sets the value of the '{@link SecurityPIM.CenteralAuth#getUaa <em>Uaa</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uaa</em>' reference.
	 * @see #getUaa()
	 * @generated
	 */
	void setUaa(UAA value);

} // CenteralAuth
