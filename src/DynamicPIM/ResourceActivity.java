/**
 */
package DynamicPIM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DynamicPIM.ResourceActivity#isIsAuthenticatedRequired <em>Is Authenticated Required</em>}</li>
 *   <li>{@link DynamicPIM.ResourceActivity#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link DynamicPIM.ResourceActivity#getResource <em>Resource</em>}</li>
 *   <li>{@link DynamicPIM.ResourceActivity#getPathName <em>Path Name</em>}</li>
 * </ul>
 *
 * @see DynamicPIM.DynamicPIMPackage#getResourceActivity()
 * @model abstract="true"
 * @generated
 */
public interface ResourceActivity extends Operation {
	/**
	 * Returns the value of the '<em><b>Is Authenticated Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Authenticated Required</em>' attribute.
	 * @see #setIsAuthenticatedRequired(boolean)
	 * @see DynamicPIM.DynamicPIMPackage#getResourceActivity_IsAuthenticatedRequired()
	 * @model
	 * @generated
	 */
	boolean isIsAuthenticatedRequired();

	/**
	 * Sets the value of the '{@link DynamicPIM.ResourceActivity#isIsAuthenticatedRequired <em>Is Authenticated Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Authenticated Required</em>' attribute.
	 * @see #isIsAuthenticatedRequired()
	 * @generated
	 */
	void setIsAuthenticatedRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' reference.
	 * @see #setTrigger(ProcessOperation)
	 * @see DynamicPIM.DynamicPIMPackage#getResourceActivity_Trigger()
	 * @model
	 * @generated
	 */
	ProcessOperation getTrigger();

	/**
	 * Sets the value of the '{@link DynamicPIM.ResourceActivity#getTrigger <em>Trigger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' reference.
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(ProcessOperation value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(Resource)
	 * @see DynamicPIM.DynamicPIMPackage#getResourceActivity_Resource()
	 * @model
	 * @generated
	 */
	Resource getResource();

	/**
	 * Sets the value of the '{@link DynamicPIM.ResourceActivity#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Resource value);

	/**
	 * Returns the value of the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Name</em>' attribute.
	 * @see #setPathName(String)
	 * @see DynamicPIM.DynamicPIMPackage#getResourceActivity_PathName()
	 * @model
	 * @generated
	 */
	String getPathName();

	/**
	 * Sets the value of the '{@link DynamicPIM.ResourceActivity#getPathName <em>Path Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Name</em>' attribute.
	 * @see #getPathName()
	 * @generated
	 */
	void setPathName(String value);

} // ResourceActivity
