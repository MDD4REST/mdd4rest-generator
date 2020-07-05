/**
 */
package ServicePIM;

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
 *   <li>{@link ServicePIM.RESTfulServicePIM#getHasResources <em>Has Resources</em>}</li>
 *   <li>{@link ServicePIM.RESTfulServicePIM#getOutputPath <em>Output Path</em>}</li>
 *   <li>{@link ServicePIM.RESTfulServicePIM#getDbIP <em>Db IP</em>}</li>
 *   <li>{@link ServicePIM.RESTfulServicePIM#getDbPort <em>Db Port</em>}</li>
 *   <li>{@link ServicePIM.RESTfulServicePIM#getDbUsername <em>Db Username</em>}</li>
 *   <li>{@link ServicePIM.RESTfulServicePIM#getDbPassword <em>Db Password</em>}</li>
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
	 * @model required="true"
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
	 * Returns the value of the '<em><b>Output Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Path</em>' attribute.
	 * @see #setOutputPath(String)
	 * @see ServicePIM.ServicePIMPackage#getRESTfulServicePIM_OutputPath()
	 * @model required="true"
	 * @generated
	 */
	String getOutputPath();

	/**
	 * Sets the value of the '{@link ServicePIM.RESTfulServicePIM#getOutputPath <em>Output Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Path</em>' attribute.
	 * @see #getOutputPath()
	 * @generated
	 */
	void setOutputPath(String value);

	/**
	 * Returns the value of the '<em><b>Db IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db IP</em>' attribute.
	 * @see #setDbIP(String)
	 * @see ServicePIM.ServicePIMPackage#getRESTfulServicePIM_DbIP()
	 * @model
	 * @generated
	 */
	String getDbIP();

	/**
	 * Sets the value of the '{@link ServicePIM.RESTfulServicePIM#getDbIP <em>Db IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db IP</em>' attribute.
	 * @see #getDbIP()
	 * @generated
	 */
	void setDbIP(String value);

	/**
	 * Returns the value of the '<em><b>Db Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Port</em>' attribute.
	 * @see #setDbPort(String)
	 * @see ServicePIM.ServicePIMPackage#getRESTfulServicePIM_DbPort()
	 * @model
	 * @generated
	 */
	String getDbPort();

	/**
	 * Sets the value of the '{@link ServicePIM.RESTfulServicePIM#getDbPort <em>Db Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Port</em>' attribute.
	 * @see #getDbPort()
	 * @generated
	 */
	void setDbPort(String value);

	/**
	 * Returns the value of the '<em><b>Db Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Username</em>' attribute.
	 * @see #setDbUsername(String)
	 * @see ServicePIM.ServicePIMPackage#getRESTfulServicePIM_DbUsername()
	 * @model
	 * @generated
	 */
	String getDbUsername();

	/**
	 * Sets the value of the '{@link ServicePIM.RESTfulServicePIM#getDbUsername <em>Db Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Username</em>' attribute.
	 * @see #getDbUsername()
	 * @generated
	 */
	void setDbUsername(String value);

	/**
	 * Returns the value of the '<em><b>Db Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Password</em>' attribute.
	 * @see #setDbPassword(String)
	 * @see ServicePIM.ServicePIMPackage#getRESTfulServicePIM_DbPassword()
	 * @model
	 * @generated
	 */
	String getDbPassword();

	/**
	 * Sets the value of the '{@link ServicePIM.RESTfulServicePIM#getDbPassword <em>Db Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Password</em>' attribute.
	 * @see #getDbPassword()
	 * @generated
	 */
	void setDbPassword(String value);

} // RESTfulServicePIM
