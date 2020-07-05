/**
 */
package ServicePIM;

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
 *   <li>{@link ServicePIM.Resource#isIsAlgorithmic <em>Is Algorithmic</em>}</li>
 *   <li>{@link ServicePIM.Resource#getName <em>Name</em>}</li>
 *   <li>{@link ServicePIM.Resource#getHasInputRepresentation <em>Has Input Representation</em>}</li>
 *   <li>{@link ServicePIM.Resource#getHasCRUDActivity <em>Has CRUD Activity</em>}</li>
 *   <li>{@link ServicePIM.Resource#getHasProperty <em>Has Property</em>}</li>
 *   <li>{@link ServicePIM.Resource#getHasOutputRepresentation <em>Has Output Representation</em>}</li>
 *   <li>{@link ServicePIM.Resource#getHasRelatedResource <em>Has Related Resource</em>}</li>
 *   <li>{@link ServicePIM.Resource#getIsRelatedResource <em>Is Related Resource</em>}</li>
 * </ul>
 *
 * @see ServicePIM.ServicePIMPackage#getResource()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueCRUDVerbs UniqueInputMediaTypes UniqueOutputMediaTypes UniqueNamingProperty AlgoResHaveNoProperties CRUDResHaveAtLeastOneProperty'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot UniqueCRUDVerbs='self.hasCRUDActivity-&gt;isUnique(CRUDVerb)' UniqueInputMediaTypes='self.hasInputRepresentation-&gt;isUnique(MediaType)' UniqueOutputMediaTypes='self.hasOutputRepresentation-&gt;isUnique(MediaType)' UniqueNamingProperty='self.hasProperty-&gt;notEmpty() implies self.hasProperty-&gt;one(isNamingProperty = true)' AlgoResHaveNoProperties='(self.isAlgorithmic = true) implies self.hasProperty-&gt;isEmpty()' CRUDResHaveAtLeastOneProperty='(self.isAlgorithmic = false) implies self.hasProperty-&gt;notEmpty()'"
 * @generated
 */
public interface Resource extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Algorithmic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Algorithmic</em>' attribute.
	 * @see #setIsAlgorithmic(boolean)
	 * @see ServicePIM.ServicePIMPackage#getResource_IsAlgorithmic()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsAlgorithmic();

	/**
	 * Sets the value of the '{@link ServicePIM.Resource#isIsAlgorithmic <em>Is Algorithmic</em>}' attribute.
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
	 * @see ServicePIM.ServicePIMPackage#getResource_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ServicePIM.Resource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Has Input Representation</b></em>' containment reference list.
	 * The list contents are of type {@link ServicePIM.InputRepresentation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Input Representation</em>' containment reference list.
	 * @see ServicePIM.ServicePIMPackage#getResource_HasInputRepresentation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<InputRepresentation> getHasInputRepresentation();

	/**
	 * Returns the value of the '<em><b>Has CRUD Activity</b></em>' containment reference list.
	 * The list contents are of type {@link ServicePIM.CRUDActivity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has CRUD Activity</em>' containment reference list.
	 * @see ServicePIM.ServicePIMPackage#getResource_HasCRUDActivity()
	 * @model containment="true" required="true" upper="4"
	 * @generated
	 */
	EList<CRUDActivity> getHasCRUDActivity();

	/**
	 * Returns the value of the '<em><b>Has Property</b></em>' containment reference list.
	 * The list contents are of type {@link ServicePIM.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Property</em>' containment reference list.
	 * @see ServicePIM.ServicePIMPackage#getResource_HasProperty()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getHasProperty();

	/**
	 * Returns the value of the '<em><b>Has Output Representation</b></em>' containment reference list.
	 * The list contents are of type {@link ServicePIM.OutputRepresentation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Output Representation</em>' containment reference list.
	 * @see ServicePIM.ServicePIMPackage#getResource_HasOutputRepresentation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<OutputRepresentation> getHasOutputRepresentation();

	/**
	 * Returns the value of the '<em><b>Has Related Resource</b></em>' containment reference list.
	 * The list contents are of type {@link ServicePIM.RelatedResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Related Resource</em>' containment reference list.
	 * @see ServicePIM.ServicePIMPackage#getResource_HasRelatedResource()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelatedResource> getHasRelatedResource();

	/**
	 * Returns the value of the '<em><b>Is Related Resource</b></em>' containment reference list.
	 * The list contents are of type {@link ServicePIM.RelatedResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Related Resource</em>' containment reference list.
	 * @see ServicePIM.ServicePIMPackage#getResource_IsRelatedResource()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelatedResource> getIsRelatedResource();

} // Resource
