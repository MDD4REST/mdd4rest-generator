/**
 */
package ServicePIM;

import SecurityPIM.Role;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RES Tful Service PIM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ServicePIM.RESTfulServicePIM#getName <em>Name</em>}</li>
 *   <li>{@link ServicePIM.RESTfulServicePIM#getBasePath <em>Base Path</em>}</li>
 *   <li>{@link ServicePIM.RESTfulServicePIM#getHasApplications <em>Has Applications</em>}</li>
 *   <li>{@link ServicePIM.RESTfulServicePIM#getEnumerations <em>Enumerations</em>}</li>
 *   <li>{@link ServicePIM.RESTfulServicePIM#getHasResources <em>Has Resources</em>}</li>
 *   <li>{@link ServicePIM.RESTfulServicePIM#getHasRoles <em>Has Roles</em>}</li>
 * </ul>
 *
 * @see ServicePIM.ServicePIMPackage#getRESTfulServicePIM()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueResourceNames'"
 * @generated
 */
public interface RESTfulServicePIM extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ServicePIM.ServicePIMPackage#getRESTfulServicePIM_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ServicePIM.RESTfulServicePIM#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Base Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Path</em>' attribute.
	 * @see #setBasePath(String)
	 * @see ServicePIM.ServicePIMPackage#getRESTfulServicePIM_BasePath()
	 * @model required="true"
	 * @generated
	 */
	String getBasePath();

	/**
	 * Sets the value of the '{@link ServicePIM.RESTfulServicePIM#getBasePath <em>Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Path</em>' attribute.
	 * @see #getBasePath()
	 * @generated
	 */
	void setBasePath(String value);

	/**
	 * Returns the value of the '<em><b>Has Applications</b></em>' containment reference list.
	 * The list contents are of type {@link ServicePIM.Application}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Applications</em>' containment reference list.
	 * @see ServicePIM.ServicePIMPackage#getRESTfulServicePIM_HasApplications()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Application> getHasApplications();

	/**
	 * Returns the value of the '<em><b>Enumerations</b></em>' containment reference list.
	 * The list contents are of type {@link ServicePIM.Enumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumerations</em>' containment reference list.
	 * @see ServicePIM.ServicePIMPackage#getRESTfulServicePIM_Enumerations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Enumeration> getEnumerations();

	/**
	 * Returns the value of the '<em><b>Has Resources</b></em>' containment reference list.
	 * The list contents are of type {@link ServicePIM.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Resources</em>' containment reference list.
	 * @see ServicePIM.ServicePIMPackage#getRESTfulServicePIM_HasResources()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Resource> getHasResources();

	/**
	 * Returns the value of the '<em><b>Has Roles</b></em>' containment reference list.
	 * The list contents are of type {@link SecurityPIM.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Roles</em>' containment reference list.
	 * @see ServicePIM.ServicePIMPackage#getRESTfulServicePIM_HasRoles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role> getHasRoles();

} // RESTfulServicePIM
