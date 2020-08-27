/**
 */
package ServicePIM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ServicePIM.Deployment#getDbType <em>Db Type</em>}</li>
 *   <li>{@link ServicePIM.Deployment#getDbUsername <em>Db Username</em>}</li>
 *   <li>{@link ServicePIM.Deployment#getDbIP <em>Db IP</em>}</li>
 *   <li>{@link ServicePIM.Deployment#getDbPassword <em>Db Password</em>}</li>
 *   <li>{@link ServicePIM.Deployment#getDbPort <em>Db Port</em>}</li>
 *   <li>{@link ServicePIM.Deployment#getDeploymentType <em>Deployment Type</em>}</li>
 *   <li>{@link ServicePIM.Deployment#getDirectoryPath <em>Directory Path</em>}</li>
 *   <li>{@link ServicePIM.Deployment#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see ServicePIM.ServicePIMPackage#getDeployment()
 * @model
 * @generated
 */
public interface Deployment extends EObject {
	/**
	 * Returns the value of the '<em><b>Db Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ServicePIM.DatabaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Type</em>' attribute.
	 * @see ServicePIM.DatabaseType
	 * @see #setDbType(DatabaseType)
	 * @see ServicePIM.ServicePIMPackage#getDeployment_DbType()
	 * @model
	 * @generated
	 */
	DatabaseType getDbType();

	/**
	 * Sets the value of the '{@link ServicePIM.Deployment#getDbType <em>Db Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Type</em>' attribute.
	 * @see ServicePIM.DatabaseType
	 * @see #getDbType()
	 * @generated
	 */
	void setDbType(DatabaseType value);

	/**
	 * Returns the value of the '<em><b>Db Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Username</em>' attribute.
	 * @see #setDbUsername(String)
	 * @see ServicePIM.ServicePIMPackage#getDeployment_DbUsername()
	 * @model
	 * @generated
	 */
	String getDbUsername();

	/**
	 * Sets the value of the '{@link ServicePIM.Deployment#getDbUsername <em>Db Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Username</em>' attribute.
	 * @see #getDbUsername()
	 * @generated
	 */
	void setDbUsername(String value);

	/**
	 * Returns the value of the '<em><b>Db IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db IP</em>' attribute.
	 * @see #setDbIP(String)
	 * @see ServicePIM.ServicePIMPackage#getDeployment_DbIP()
	 * @model
	 * @generated
	 */
	String getDbIP();

	/**
	 * Sets the value of the '{@link ServicePIM.Deployment#getDbIP <em>Db IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db IP</em>' attribute.
	 * @see #getDbIP()
	 * @generated
	 */
	void setDbIP(String value);

	/**
	 * Returns the value of the '<em><b>Db Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Password</em>' attribute.
	 * @see #setDbPassword(String)
	 * @see ServicePIM.ServicePIMPackage#getDeployment_DbPassword()
	 * @model
	 * @generated
	 */
	String getDbPassword();

	/**
	 * Sets the value of the '{@link ServicePIM.Deployment#getDbPassword <em>Db Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Password</em>' attribute.
	 * @see #getDbPassword()
	 * @generated
	 */
	void setDbPassword(String value);

	/**
	 * Returns the value of the '<em><b>Db Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Port</em>' attribute.
	 * @see #setDbPort(String)
	 * @see ServicePIM.ServicePIMPackage#getDeployment_DbPort()
	 * @model
	 * @generated
	 */
	String getDbPort();

	/**
	 * Sets the value of the '{@link ServicePIM.Deployment#getDbPort <em>Db Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Port</em>' attribute.
	 * @see #getDbPort()
	 * @generated
	 */
	void setDbPort(String value);

	/**
	 * Returns the value of the '<em><b>Deployment Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ServicePIM.DeploymentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment Type</em>' attribute.
	 * @see ServicePIM.DeploymentType
	 * @see #setDeploymentType(DeploymentType)
	 * @see ServicePIM.ServicePIMPackage#getDeployment_DeploymentType()
	 * @model
	 * @generated
	 */
	DeploymentType getDeploymentType();

	/**
	 * Sets the value of the '{@link ServicePIM.Deployment#getDeploymentType <em>Deployment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment Type</em>' attribute.
	 * @see ServicePIM.DeploymentType
	 * @see #getDeploymentType()
	 * @generated
	 */
	void setDeploymentType(DeploymentType value);

	/**
	 * Returns the value of the '<em><b>Directory Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directory Path</em>' attribute.
	 * @see #setDirectoryPath(String)
	 * @see ServicePIM.ServicePIMPackage#getDeployment_DirectoryPath()
	 * @model
	 * @generated
	 */
	String getDirectoryPath();

	/**
	 * Sets the value of the '{@link ServicePIM.Deployment#getDirectoryPath <em>Directory Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directory Path</em>' attribute.
	 * @see #getDirectoryPath()
	 * @generated
	 */
	void setDirectoryPath(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ServicePIM.ServicePIMPackage#getDeployment_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ServicePIM.Deployment#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Deployment
