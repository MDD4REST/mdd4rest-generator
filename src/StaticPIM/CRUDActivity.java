/**
 */
package StaticPIM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CRUD Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link StaticPIM.CRUDActivity#isIsAuthenticatedRequired <em>Is Authenticated Required</em>}</li>
 *   <li>{@link StaticPIM.CRUDActivity#isIsCustom <em>Is Custom</em>}</li>
 *   <li>{@link StaticPIM.CRUDActivity#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @see StaticPIM.StaticPIMPackage#getCRUDActivity()
 * @model
 * @generated
 */
public interface CRUDActivity extends Operation {
	/**
	 * Returns the value of the '<em><b>Is Authenticated Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Authenticated Required</em>' attribute.
	 * @see #setIsAuthenticatedRequired(boolean)
	 * @see StaticPIM.StaticPIMPackage#getCRUDActivity_IsAuthenticatedRequired()
	 * @model unique="false"
	 * @generated
	 */
	boolean isIsAuthenticatedRequired();

	/**
	 * Sets the value of the '{@link StaticPIM.CRUDActivity#isIsAuthenticatedRequired <em>Is Authenticated Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Authenticated Required</em>' attribute.
	 * @see #isIsAuthenticatedRequired()
	 * @generated
	 */
	void setIsAuthenticatedRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Custom</em>' attribute.
	 * @see #setIsCustom(boolean)
	 * @see StaticPIM.StaticPIMPackage#getCRUDActivity_IsCustom()
	 * @model unique="false"
	 * @generated
	 */
	boolean isIsCustom();

	/**
	 * Sets the value of the '{@link StaticPIM.CRUDActivity#isIsCustom <em>Is Custom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Custom</em>' attribute.
	 * @see #isIsCustom()
	 * @generated
	 */
	void setIsCustom(boolean value);

	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' reference.
	 * @see #setDelegate(Service)
	 * @see StaticPIM.StaticPIMPackage#getCRUDActivity_Delegate()
	 * @model
	 * @generated
	 */
	Service getDelegate();

	/**
	 * Sets the value of the '{@link StaticPIM.CRUDActivity#getDelegate <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(Service value);

} // CRUDActivity
