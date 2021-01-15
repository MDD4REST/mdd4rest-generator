/**
 */
package StaticPIM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link StaticPIM.Service#getOtherDependencies <em>Other Dependencies</em>}</li>
 *   <li>{@link StaticPIM.Service#getServiceDependencies <em>Service Dependencies</em>}</li>
 *   <li>{@link StaticPIM.Service#isWebService <em>Web Service</em>}</li>
 *   <li>{@link StaticPIM.Service#isRemoteInterface <em>Remote Interface</em>}</li>
 *   <li>{@link StaticPIM.Service#isLocalInterface <em>Local Interface</em>}</li>
 *   <li>{@link StaticPIM.Service#getSubscribe <em>Subscribe</em>}</li>
 *   <li>{@link StaticPIM.Service#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @see StaticPIM.StaticPIMPackage#getService()
 * @model
 * @generated
 */
public interface Service extends EObject {
	/**
	 * Returns the value of the '<em><b>Other Dependencies</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Dependencies</em>' attribute list.
	 * @see StaticPIM.StaticPIMPackage#getService_OtherDependencies()
	 * @model
	 * @generated
	 */
	EList<String> getOtherDependencies();

	/**
	 * Returns the value of the '<em><b>Service Dependencies</b></em>' reference list.
	 * The list contents are of type {@link StaticPIM.Service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Dependencies</em>' reference list.
	 * @see StaticPIM.StaticPIMPackage#getService_ServiceDependencies()
	 * @model
	 * @generated
	 */
	EList<Service> getServiceDependencies();

	/**
	 * Returns the value of the '<em><b>Web Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Service</em>' attribute.
	 * @see #setWebService(boolean)
	 * @see StaticPIM.StaticPIMPackage#getService_WebService()
	 * @model unique="false"
	 * @generated
	 */
	boolean isWebService();

	/**
	 * Sets the value of the '{@link StaticPIM.Service#isWebService <em>Web Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Service</em>' attribute.
	 * @see #isWebService()
	 * @generated
	 */
	void setWebService(boolean value);

	/**
	 * Returns the value of the '<em><b>Remote Interface</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote Interface</em>' attribute.
	 * @see #setRemoteInterface(boolean)
	 * @see StaticPIM.StaticPIMPackage#getService_RemoteInterface()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isRemoteInterface();

	/**
	 * Sets the value of the '{@link StaticPIM.Service#isRemoteInterface <em>Remote Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Interface</em>' attribute.
	 * @see #isRemoteInterface()
	 * @generated
	 */
	void setRemoteInterface(boolean value);

	/**
	 * Returns the value of the '<em><b>Local Interface</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Interface</em>' attribute.
	 * @see #setLocalInterface(boolean)
	 * @see StaticPIM.StaticPIMPackage#getService_LocalInterface()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isLocalInterface();

	/**
	 * Sets the value of the '{@link StaticPIM.Service#isLocalInterface <em>Local Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Interface</em>' attribute.
	 * @see #isLocalInterface()
	 * @generated
	 */
	void setLocalInterface(boolean value);

	/**
	 * Returns the value of the '<em><b>Subscribe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscribe</em>' reference.
	 * @see #setSubscribe(Subscribe)
	 * @see StaticPIM.StaticPIMPackage#getService_Subscribe()
	 * @model
	 * @generated
	 */
	Subscribe getSubscribe();

	/**
	 * Sets the value of the '{@link StaticPIM.Service#getSubscribe <em>Subscribe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscribe</em>' reference.
	 * @see #getSubscribe()
	 * @generated
	 */
	void setSubscribe(Subscribe value);

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link StaticPIM.ServiceOperation}.
	 * It is bidirectional and its opposite is '{@link StaticPIM.ServiceOperation#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see StaticPIM.StaticPIMPackage#getService_Operations()
	 * @see StaticPIM.ServiceOperation#getService
	 * @model opposite="service" containment="true"
	 * @generated
	 */
	EList<ServiceOperation> getOperations();

} // Service
