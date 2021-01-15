/**
 */
package DynamicPIM;

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
 *   <li>{@link DynamicPIM.Resource#getName <em>Name</em>}</li>
 *   <li>{@link DynamicPIM.Resource#getHasRelatedResource <em>Has Related Resource</em>}</li>
 *   <li>{@link DynamicPIM.Resource#getIsRelatedResource <em>Is Related Resource</em>}</li>
 *   <li>{@link DynamicPIM.Resource#getReadActivity <em>Read Activity</em>}</li>
 *   <li>{@link DynamicPIM.Resource#getCreateActivity <em>Create Activity</em>}</li>
 *   <li>{@link DynamicPIM.Resource#getDeleteActivity <em>Delete Activity</em>}</li>
 *   <li>{@link DynamicPIM.Resource#getOtherActivities <em>Other Activities</em>}</li>
 *   <li>{@link DynamicPIM.Resource#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link DynamicPIM.Resource#getHasActivity <em>Has Activity</em>}</li>
 *   <li>{@link DynamicPIM.Resource#getPathName <em>Path Name</em>}</li>
 * </ul>
 *
 * @see DynamicPIM.DynamicPIMPackage#getResource()
 * @model abstract="true"
 * @generated
 */
public interface Resource extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see DynamicPIM.DynamicPIMPackage#getResource_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link DynamicPIM.Resource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Has Related Resource</b></em>' reference list.
	 * The list contents are of type {@link DynamicPIM.Resource}.
	 * It is bidirectional and its opposite is '{@link DynamicPIM.Resource#getIsRelatedResource <em>Is Related Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Related Resource</em>' reference list.
	 * @see DynamicPIM.DynamicPIMPackage#getResource_HasRelatedResource()
	 * @see DynamicPIM.Resource#getIsRelatedResource
	 * @model opposite="isRelatedResource"
	 * @generated
	 */
	EList<Resource> getHasRelatedResource();

	/**
	 * Returns the value of the '<em><b>Is Related Resource</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link DynamicPIM.Resource#getHasRelatedResource <em>Has Related Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Related Resource</em>' reference.
	 * @see #setIsRelatedResource(Resource)
	 * @see DynamicPIM.DynamicPIMPackage#getResource_IsRelatedResource()
	 * @see DynamicPIM.Resource#getHasRelatedResource
	 * @model opposite="hasRelatedResource"
	 * @generated
	 */
	Resource getIsRelatedResource();

	/**
	 * Sets the value of the '{@link DynamicPIM.Resource#getIsRelatedResource <em>Is Related Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Related Resource</em>' reference.
	 * @see #getIsRelatedResource()
	 * @generated
	 */
	void setIsRelatedResource(Resource value);

	/**
	 * Returns the value of the '<em><b>Read Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Activity</em>' reference.
	 * @see #setReadActivity(Read)
	 * @see DynamicPIM.DynamicPIMPackage#getResource_ReadActivity()
	 * @model
	 * @generated
	 */
	Read getReadActivity();

	/**
	 * Sets the value of the '{@link DynamicPIM.Resource#getReadActivity <em>Read Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Activity</em>' reference.
	 * @see #getReadActivity()
	 * @generated
	 */
	void setReadActivity(Read value);

	/**
	 * Returns the value of the '<em><b>Create Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Activity</em>' reference.
	 * @see #setCreateActivity(Create)
	 * @see DynamicPIM.DynamicPIMPackage#getResource_CreateActivity()
	 * @model
	 * @generated
	 */
	Create getCreateActivity();

	/**
	 * Sets the value of the '{@link DynamicPIM.Resource#getCreateActivity <em>Create Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Activity</em>' reference.
	 * @see #getCreateActivity()
	 * @generated
	 */
	void setCreateActivity(Create value);

	/**
	 * Returns the value of the '<em><b>Delete Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Activity</em>' reference.
	 * @see #setDeleteActivity(Delete)
	 * @see DynamicPIM.DynamicPIMPackage#getResource_DeleteActivity()
	 * @model
	 * @generated
	 */
	Delete getDeleteActivity();

	/**
	 * Sets the value of the '{@link DynamicPIM.Resource#getDeleteActivity <em>Delete Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete Activity</em>' reference.
	 * @see #getDeleteActivity()
	 * @generated
	 */
	void setDeleteActivity(Delete value);

	/**
	 * Returns the value of the '<em><b>Other Activities</b></em>' reference list.
	 * The list contents are of type {@link DynamicPIM.Other}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Activities</em>' reference list.
	 * @see DynamicPIM.DynamicPIMPackage#getResource_OtherActivities()
	 * @model
	 * @generated
	 */
	EList<Other> getOtherActivities();

	/**
	 * Returns the value of the '<em><b>Aggregate</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link DynamicPIM.Aggregate#getHasResource <em>Has Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate</em>' container reference.
	 * @see #setAggregate(Aggregate)
	 * @see DynamicPIM.DynamicPIMPackage#getResource_Aggregate()
	 * @see DynamicPIM.Aggregate#getHasResource
	 * @model opposite="hasResource" transient="false"
	 * @generated
	 */
	Aggregate getAggregate();

	/**
	 * Sets the value of the '{@link DynamicPIM.Resource#getAggregate <em>Aggregate</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregate</em>' container reference.
	 * @see #getAggregate()
	 * @generated
	 */
	void setAggregate(Aggregate value);

	/**
	 * Returns the value of the '<em><b>Has Activity</b></em>' containment reference list.
	 * The list contents are of type {@link DynamicPIM.ResourceActivity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Activity</em>' containment reference list.
	 * @see DynamicPIM.DynamicPIMPackage#getResource_HasActivity()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceActivity> getHasActivity();

	/**
	 * Returns the value of the '<em><b>Path Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Name</em>' attribute.
	 * @see #setPathName(String)
	 * @see DynamicPIM.DynamicPIMPackage#getResource_PathName()
	 * @model
	 * @generated
	 */
	String getPathName();

	/**
	 * Sets the value of the '{@link DynamicPIM.Resource#getPathName <em>Path Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Name</em>' attribute.
	 * @see #getPathName()
	 * @generated
	 */
	void setPathName(String value);

} // Resource
