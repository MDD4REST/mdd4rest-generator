/**
 */
package StaticPIM;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link StaticPIM.ServiceOperation#getServiceDelegate <em>Service Delegate</em>}</li>
 *   <li>{@link StaticPIM.ServiceOperation#getService <em>Service</em>}</li>
 * </ul>
 *
 * @see StaticPIM.StaticPIMPackage#getServiceOperation()
 * @model
 * @generated
 */
public interface ServiceOperation extends Operation {
	/**
	 * Returns the value of the '<em><b>Service Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Delegate</em>' reference.
	 * @see #setServiceDelegate(ServiceOperation)
	 * @see StaticPIM.StaticPIMPackage#getServiceOperation_ServiceDelegate()
	 * @model
	 * @generated
	 */
	ServiceOperation getServiceDelegate();

	/**
	 * Sets the value of the '{@link StaticPIM.ServiceOperation#getServiceDelegate <em>Service Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Delegate</em>' reference.
	 * @see #getServiceDelegate()
	 * @generated
	 */
	void setServiceDelegate(ServiceOperation value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link StaticPIM.Service#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' container reference.
	 * @see #setService(Service)
	 * @see StaticPIM.StaticPIMPackage#getServiceOperation_Service()
	 * @see StaticPIM.Service#getOperations
	 * @model opposite="operations" required="true" transient="false"
	 * @generated
	 */
	Service getService();

	/**
	 * Sets the value of the '{@link StaticPIM.ServiceOperation#getService <em>Service</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' container reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(Service value);

} // ServiceOperation
