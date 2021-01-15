/**
 */
package DynamicPIM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DynamicPIM.Process#getHasOperation <em>Has Operation</em>}</li>
 *   <li>{@link DynamicPIM.Process#getName <em>Name</em>}</li>
 *   <li>{@link DynamicPIM.Process#getAggregate <em>Aggregate</em>}</li>
 * </ul>
 *
 * @see DynamicPIM.DynamicPIMPackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Operation</b></em>' containment reference list.
	 * The list contents are of type {@link DynamicPIM.ProcessOperation}.
	 * It is bidirectional and its opposite is '{@link DynamicPIM.ProcessOperation#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Operation</em>' containment reference list.
	 * @see DynamicPIM.DynamicPIMPackage#getProcess_HasOperation()
	 * @see DynamicPIM.ProcessOperation#getProcess
	 * @model opposite="process" containment="true" required="true"
	 * @generated
	 */
	EList<ProcessOperation> getHasOperation();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see DynamicPIM.DynamicPIMPackage#getProcess_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link DynamicPIM.Process#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Aggregate</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link DynamicPIM.Aggregate#getHasProcess <em>Has Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate</em>' container reference.
	 * @see #setAggregate(Aggregate)
	 * @see DynamicPIM.DynamicPIMPackage#getProcess_Aggregate()
	 * @see DynamicPIM.Aggregate#getHasProcess
	 * @model opposite="hasProcess" required="true" transient="false"
	 * @generated
	 */
	Aggregate getAggregate();

	/**
	 * Sets the value of the '{@link DynamicPIM.Process#getAggregate <em>Aggregate</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregate</em>' container reference.
	 * @see #getAggregate()
	 * @generated
	 */
	void setAggregate(Aggregate value);

} // Process
