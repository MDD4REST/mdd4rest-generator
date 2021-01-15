/**
 */
package StaticPIM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link StaticPIM.Resource#isIsAlgorithmic <em>Is Algorithmic</em>}</li>
 *   <li>{@link StaticPIM.Resource#getName <em>Name</em>}</li>
 *   <li>{@link StaticPIM.Resource#getHasInputRepresentation <em>Has Input Representation</em>}</li>
 *   <li>{@link StaticPIM.Resource#getHasActivities <em>Has Activities</em>}</li>
 *   <li>{@link StaticPIM.Resource#getHasOutputRepresentation <em>Has Output Representation</em>}</li>
 *   <li>{@link StaticPIM.Resource#getModel <em>Model</em>}</li>
 *   <li>{@link StaticPIM.Resource#getHasRelatedResource <em>Has Related Resource</em>}</li>
 *   <li>{@link StaticPIM.Resource#getIsRelatedResource <em>Is Related Resource</em>}</li>
 * </ul>
 *
 * @see StaticPIM.StaticPIMPackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Algorithmic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Algorithmic</em>' attribute.
	 * @see #setIsAlgorithmic(boolean)
	 * @see StaticPIM.StaticPIMPackage#getResource_IsAlgorithmic()
	 * @model unique="false" required="true"
	 * @generated
	 */
	boolean isIsAlgorithmic();

	/**
	 * Sets the value of the '{@link StaticPIM.Resource#isIsAlgorithmic <em>Is Algorithmic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Algorithmic</em>' attribute.
	 * @see #isIsAlgorithmic()
	 * @generated
	 */
	void setIsAlgorithmic(boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see StaticPIM.StaticPIMPackage#getResource_Name()
	 * @model unique="false" id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link StaticPIM.Resource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Has Input Representation</b></em>' containment reference list.
	 * The list contents are of type {@link StaticPIM.InputRepresentation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Input Representation</em>' containment reference list.
	 * @see StaticPIM.StaticPIMPackage#getResource_HasInputRepresentation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<InputRepresentation> getHasInputRepresentation();

	/**
	 * Returns the value of the '<em><b>Has Activities</b></em>' containment reference list.
	 * The list contents are of type {@link StaticPIM.CRUDActivity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Activities</em>' containment reference list.
	 * @see StaticPIM.StaticPIMPackage#getResource_HasActivities()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CRUDActivity> getHasActivities();

	/**
	 * Returns the value of the '<em><b>Has Output Representation</b></em>' containment reference list.
	 * The list contents are of type {@link StaticPIM.OutputRepresentation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Output Representation</em>' containment reference list.
	 * @see StaticPIM.StaticPIMPackage#getResource_HasOutputRepresentation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<OutputRepresentation> getHasOutputRepresentation();

	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(DTO)
	 * @see StaticPIM.StaticPIMPackage#getResource_Model()
	 * @model required="true"
	 * @generated
	 */
	DTO getModel();

	/**
	 * Sets the value of the '{@link StaticPIM.Resource#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(DTO value);

	/**
	 * Returns the value of the '<em><b>Has Related Resource</b></em>' reference list.
	 * The list contents are of type {@link StaticPIM.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Related Resource</em>' reference list.
	 * @see StaticPIM.StaticPIMPackage#getResource_HasRelatedResource()
	 * @model
	 * @generated
	 */
	EList<Resource> getHasRelatedResource();

	/**
	 * Returns the value of the '<em><b>Is Related Resource</b></em>' reference list.
	 * The list contents are of type {@link StaticPIM.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Related Resource</em>' reference list.
	 * @see StaticPIM.StaticPIMPackage#getResource_IsRelatedResource()
	 * @model
	 * @generated
	 */
	EList<Resource> getIsRelatedResource();

} // Resource
