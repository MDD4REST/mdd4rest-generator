/**
 */
package ServicePIM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ServicePIM.Config#getBaseName <em>Base Name</em>}</li>
 *   <li>{@link ServicePIM.Config#getApplicationType <em>Application Type</em>}</li>
 *   <li>{@link ServicePIM.Config#getServicePort <em>Service Port</em>}</li>
 *   <li>{@link ServicePIM.Config#getDbIP <em>Db IP</em>}</li>
 *   <li>{@link ServicePIM.Config#getDbPort <em>Db Port</em>}</li>
 *   <li>{@link ServicePIM.Config#getDbUsername <em>Db Username</em>}</li>
 *   <li>{@link ServicePIM.Config#getDbPassword <em>Db Password</em>}</li>
 * </ul>
 *
 * @see ServicePIM.ServicePIMPackage#getConfig()
 * @model
 * @generated
 */
public interface Config extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Name</em>' attribute.
	 * @see #setBaseName(String)
	 * @see ServicePIM.ServicePIMPackage#getConfig_BaseName()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getBaseName();

	/**
	 * Sets the value of the '{@link ServicePIM.Config#getBaseName <em>Base Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Name</em>' attribute.
	 * @see #getBaseName()
	 * @generated
	 */
	void setBaseName(String value);

	/**
	 * Returns the value of the '<em><b>Application Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ServicePIM.ApplicationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Type</em>' attribute.
	 * @see ServicePIM.ApplicationType
	 * @see #setApplicationType(ApplicationType)
	 * @see ServicePIM.ServicePIMPackage#getConfig_ApplicationType()
	 * @model required="true"
	 * @generated
	 */
	ApplicationType getApplicationType();

	/**
	 * Sets the value of the '{@link ServicePIM.Config#getApplicationType <em>Application Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Type</em>' attribute.
	 * @see ServicePIM.ApplicationType
	 * @see #getApplicationType()
	 * @generated
	 */
	void setApplicationType(ApplicationType value);

	/**
	 * Returns the value of the '<em><b>Service Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Port</em>' attribute.
	 * @see #setServicePort(String)
	 * @see ServicePIM.ServicePIMPackage#getConfig_ServicePort()
	 * @model required="true"
	 * @generated
	 */
	String getServicePort();

	/**
	 * Sets the value of the '{@link ServicePIM.Config#getServicePort <em>Service Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Port</em>' attribute.
	 * @see #getServicePort()
	 * @generated
	 */
	void setServicePort(String value);

	/**
	 * Returns the value of the '<em><b>Db IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db IP</em>' attribute.
	 * @see #setDbIP(String)
	 * @see ServicePIM.ServicePIMPackage#getConfig_DbIP()
	 * @model
	 * @generated
	 */
	String getDbIP();

	/**
	 * Sets the value of the '{@link ServicePIM.Config#getDbIP <em>Db IP</em>}' attribute.
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
	 * @see ServicePIM.ServicePIMPackage#getConfig_DbPort()
	 * @model
	 * @generated
	 */
	String getDbPort();

	/**
	 * Sets the value of the '{@link ServicePIM.Config#getDbPort <em>Db Port</em>}' attribute.
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
	 * @see ServicePIM.ServicePIMPackage#getConfig_DbUsername()
	 * @model
	 * @generated
	 */
	String getDbUsername();

	/**
	 * Sets the value of the '{@link ServicePIM.Config#getDbUsername <em>Db Username</em>}' attribute.
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
	 * @see ServicePIM.ServicePIMPackage#getConfig_DbPassword()
	 * @model
	 * @generated
	 */
	String getDbPassword();

	/**
	 * Sets the value of the '{@link ServicePIM.Config#getDbPassword <em>Db Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Password</em>' attribute.
	 * @see #getDbPassword()
	 * @generated
	 */
	void setDbPassword(String value);

} // Config
