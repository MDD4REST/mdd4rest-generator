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

} // Config
