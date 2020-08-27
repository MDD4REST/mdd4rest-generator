/**
 */
package ServicePIM;

import QueryPIM.Caching;
import QueryPIM.Filter;
import QueryPIM.Pagination;
import QueryPIM.ScopeSearch;
import QueryPIM.Select;
import QueryPIM.Sort;
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
 *   <li>{@link ServicePIM.Resource#getHasActivities <em>Has Activities</em>}</li>
 *   <li>{@link ServicePIM.Resource#getHasProperty <em>Has Property</em>}</li>
 *   <li>{@link ServicePIM.Resource#getHasOutputRepresentation <em>Has Output Representation</em>}</li>
 *   <li>{@link ServicePIM.Resource#getHasRelationship <em>Has Relationship</em>}</li>
 *   <li>{@link ServicePIM.Resource#getFilters <em>Filters</em>}</li>
 *   <li>{@link ServicePIM.Resource#getSort <em>Sort</em>}</li>
 *   <li>{@link ServicePIM.Resource#getSelect <em>Select</em>}</li>
 *   <li>{@link ServicePIM.Resource#getPagination <em>Pagination</em>}</li>
 *   <li>{@link ServicePIM.Resource#getScopesearch <em>Scopesearch</em>}</li>
 *   <li>{@link ServicePIM.Resource#getCaching <em>Caching</em>}</li>
 * </ul>
 *
 * @see ServicePIM.ServicePIMPackage#getResource()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueCRUDVerbs UniqueInputMediaTypes UniqueOutputMediaTypes UniqueNamingProperty AlgoResHaveNoProperties CRUDResHaveAtLeastOneProperty'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot UniqueInputMediaTypes='self.hasInputRepresentation-&gt;isUnique(MediaType)' UniqueOutputMediaTypes='self.hasOutputRepresentation-&gt;isUnique(MediaType)' UniqueNamingProperty='self.hasProperty-&gt;notEmpty() implies self.hasProperty-&gt;one(isNamingProperty = true)' AlgoResHaveNoProperties='(self.isAlgorithmic = true) implies self.hasProperty-&gt;isEmpty()' CRUDResHaveAtLeastOneProperty='(self.isAlgorithmic = false) implies self.hasProperty-&gt;notEmpty()'"
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
	 * @model unique="false" required="true"
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
	 * @model id="true" required="true"
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
	 * Returns the value of the '<em><b>Has Activities</b></em>' containment reference list.
	 * The list contents are of type {@link ServicePIM.Activity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Activities</em>' containment reference list.
	 * @see ServicePIM.ServicePIMPackage#getResource_HasActivities()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Activity> getHasActivities();

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
	 * Returns the value of the '<em><b>Has Relationship</b></em>' containment reference list.
	 * The list contents are of type {@link ServicePIM.Relationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Relationship</em>' containment reference list.
	 * @see ServicePIM.ServicePIMPackage#getResource_HasRelationship()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relationship> getHasRelationship();

	/**
	 * Returns the value of the '<em><b>Filters</b></em>' containment reference list.
	 * The list contents are of type {@link QueryPIM.Filter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filters</em>' containment reference list.
	 * @see ServicePIM.ServicePIMPackage#getResource_Filters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Filter> getFilters();

	/**
	 * Returns the value of the '<em><b>Sort</b></em>' containment reference list.
	 * The list contents are of type {@link QueryPIM.Sort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort</em>' containment reference list.
	 * @see ServicePIM.ServicePIMPackage#getResource_Sort()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sort> getSort();

	/**
	 * Returns the value of the '<em><b>Select</b></em>' containment reference list.
	 * The list contents are of type {@link QueryPIM.Select}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select</em>' containment reference list.
	 * @see ServicePIM.ServicePIMPackage#getResource_Select()
	 * @model containment="true"
	 * @generated
	 */
	EList<Select> getSelect();

	/**
	 * Returns the value of the '<em><b>Pagination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pagination</em>' containment reference.
	 * @see #setPagination(Pagination)
	 * @see ServicePIM.ServicePIMPackage#getResource_Pagination()
	 * @model containment="true"
	 * @generated
	 */
	Pagination getPagination();

	/**
	 * Sets the value of the '{@link ServicePIM.Resource#getPagination <em>Pagination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pagination</em>' containment reference.
	 * @see #getPagination()
	 * @generated
	 */
	void setPagination(Pagination value);

	/**
	 * Returns the value of the '<em><b>Scopesearch</b></em>' containment reference list.
	 * The list contents are of type {@link QueryPIM.ScopeSearch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scopesearch</em>' containment reference list.
	 * @see ServicePIM.ServicePIMPackage#getResource_Scopesearch()
	 * @model containment="true"
	 * @generated
	 */
	EList<ScopeSearch> getScopesearch();

	/**
	 * Returns the value of the '<em><b>Caching</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caching</em>' containment reference.
	 * @see #setCaching(Caching)
	 * @see ServicePIM.ServicePIMPackage#getResource_Caching()
	 * @model containment="true"
	 * @generated
	 */
	Caching getCaching();

	/**
	 * Sets the value of the '{@link ServicePIM.Resource#getCaching <em>Caching</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caching</em>' containment reference.
	 * @see #getCaching()
	 * @generated
	 */
	void setCaching(Caching value);

} // Resource
