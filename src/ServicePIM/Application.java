/**
 */
package ServicePIM;

import QueryPIM.GlobalSearch;
import SecurityPIM.Role;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ServicePIM.Application#getHasConfig <em>Has Config</em>}</li>
 *   <li>{@link ServicePIM.Application#getResources <em>Resources</em>}</li>
 *   <li>{@link ServicePIM.Application#getGlobalsearches <em>Globalsearches</em>}</li>
 *   <li>{@link ServicePIM.Application#getRoles <em>Roles</em>}</li>
 *   <li>{@link ServicePIM.Application#getDeployment <em>Deployment</em>}</li>
 * </ul>
 *
 * @see ServicePIM.ServicePIMPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Config</em>' containment reference.
	 * @see #setHasConfig(Config)
	 * @see ServicePIM.ServicePIMPackage#getApplication_HasConfig()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Config getHasConfig();

	/**
	 * Sets the value of the '{@link ServicePIM.Application#getHasConfig <em>Has Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Config</em>' containment reference.
	 * @see #getHasConfig()
	 * @generated
	 */
	void setHasConfig(Config value);

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' reference list.
	 * The list contents are of type {@link ServicePIM.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' reference list.
	 * @see ServicePIM.ServicePIMPackage#getApplication_Resources()
	 * @model required="true"
	 * @generated
	 */
	EList<Resource> getResources();

	/**
	 * Returns the value of the '<em><b>Globalsearches</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Globalsearches</em>' containment reference.
	 * @see #setGlobalsearches(GlobalSearch)
	 * @see ServicePIM.ServicePIMPackage#getApplication_Globalsearches()
	 * @model containment="true"
	 * @generated
	 */
	GlobalSearch getGlobalsearches();

	/**
	 * Sets the value of the '{@link ServicePIM.Application#getGlobalsearches <em>Globalsearches</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Globalsearches</em>' containment reference.
	 * @see #getGlobalsearches()
	 * @generated
	 */
	void setGlobalsearches(GlobalSearch value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link SecurityPIM.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see ServicePIM.ServicePIMPackage#getApplication_Roles()
	 * @model
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Deployment</b></em>' containment reference list.
	 * The list contents are of type {@link ServicePIM.Deployment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment</em>' containment reference list.
	 * @see ServicePIM.ServicePIMPackage#getApplication_Deployment()
	 * @model containment="true"
	 * @generated
	 */
	EList<Deployment> getDeployment();

} // Application
