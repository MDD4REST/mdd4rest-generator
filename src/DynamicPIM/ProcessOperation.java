/**
 */
package DynamicPIM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DynamicPIM.ProcessOperation#getDelegate <em>Delegate</em>}</li>
 *   <li>{@link DynamicPIM.ProcessOperation#getPolicy <em>Policy</em>}</li>
 *   <li>{@link DynamicPIM.ProcessOperation#getProcess <em>Process</em>}</li>
 * </ul>
 *
 * @see DynamicPIM.DynamicPIMPackage#getProcessOperation()
 * @model
 * @generated
 */
public interface ProcessOperation extends Operation {
	/**
	 * Returns the value of the '<em><b>Delegate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate</em>' reference.
	 * @see #setDelegate(ProcessOperation)
	 * @see DynamicPIM.DynamicPIMPackage#getProcessOperation_Delegate()
	 * @model
	 * @generated
	 */
	ProcessOperation getDelegate();

	/**
	 * Sets the value of the '{@link DynamicPIM.ProcessOperation#getDelegate <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate</em>' reference.
	 * @see #getDelegate()
	 * @generated
	 */
	void setDelegate(ProcessOperation value);

	/**
	 * Returns the value of the '<em><b>Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy</em>' containment reference.
	 * @see #setPolicy(Policy)
	 * @see DynamicPIM.DynamicPIMPackage#getProcessOperation_Policy()
	 * @model containment="true"
	 * @generated
	 */
	Policy getPolicy();

	/**
	 * Sets the value of the '{@link DynamicPIM.ProcessOperation#getPolicy <em>Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy</em>' containment reference.
	 * @see #getPolicy()
	 * @generated
	 */
	void setPolicy(Policy value);

	/**
	 * Returns the value of the '<em><b>Process</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link DynamicPIM.Process#getHasOperation <em>Has Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' container reference.
	 * @see #setProcess(DynamicPIM.Process)
	 * @see DynamicPIM.DynamicPIMPackage#getProcessOperation_Process()
	 * @see DynamicPIM.Process#getHasOperation
	 * @model opposite="hasOperation" required="true" transient="false"
	 * @generated
	 */
	DynamicPIM.Process getProcess();

	/**
	 * Sets the value of the '{@link DynamicPIM.ProcessOperation#getProcess <em>Process</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process</em>' container reference.
	 * @see #getProcess()
	 * @generated
	 */
	void setProcess(DynamicPIM.Process value);

} // ProcessOperation
