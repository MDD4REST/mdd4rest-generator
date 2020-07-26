/**
 */
package ServicePIM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ServicePIM.Activity#isIsAuthenticatedRequired <em>Is Authenticated Required</em>}</li>
 * </ul>
 *
 * @see ServicePIM.ServicePIMPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Authenticated Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Authenticated Required</em>' attribute.
	 * @see #setIsAuthenticatedRequired(boolean)
	 * @see ServicePIM.ServicePIMPackage#getActivity_IsAuthenticatedRequired()
	 * @model
	 * @generated
	 */
	boolean isIsAuthenticatedRequired();

	/**
	 * Sets the value of the '{@link ServicePIM.Activity#isIsAuthenticatedRequired <em>Is Authenticated Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Authenticated Required</em>' attribute.
	 * @see #isIsAuthenticatedRequired()
	 * @generated
	 */
	void setIsAuthenticatedRequired(boolean value);

} // Activity
