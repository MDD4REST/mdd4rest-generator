/**
 */
package ServicePIM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ServicePIM.Enumeration#getLiterals <em>Literals</em>}</li>
 *   <li>{@link ServicePIM.Enumeration#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see ServicePIM.ServicePIMPackage#getEnumeration()
 * @model
 * @generated
 */
public interface Enumeration extends TypeDefinition {
	/**
	 * Returns the value of the '<em><b>Literals</b></em>' containment reference list.
	 * The list contents are of type {@link ServicePIM.Literal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literals</em>' containment reference list.
	 * @see ServicePIM.ServicePIMPackage#getEnumeration_Literals()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Literal> getLiterals();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ServicePIM.ServicePIMPackage#getEnumeration_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ServicePIM.Enumeration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Enumeration
