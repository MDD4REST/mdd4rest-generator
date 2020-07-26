/**
 */
package ServicePIM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ServicePIM.Custom#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see ServicePIM.ServicePIMPackage#getCustom()
 * @model
 * @generated
 */
public interface Custom extends Activity {

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ServicePIM.ServicePIMPackage#getCustom_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ServicePIM.Custom#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);
} // Custom
