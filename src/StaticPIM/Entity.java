/**
 */
package StaticPIM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link StaticPIM.Entity#isScaffold <em>Scaffold</em>}</li>
 * </ul>
 *
 * @see StaticPIM.StaticPIMPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends DomainObject {

	/**
	 * Returns the value of the '<em><b>Scaffold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scaffold</em>' attribute.
	 * @see #setScaffold(boolean)
	 * @see StaticPIM.StaticPIMPackage#getEntity_Scaffold()
	 * @model unique="false"
	 * @generated
	 */
	boolean isScaffold();

	/**
	 * Sets the value of the '{@link StaticPIM.Entity#isScaffold <em>Scaffold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scaffold</em>' attribute.
	 * @see #isScaffold()
	 * @generated
	 */
	void setScaffold(boolean value);
} // Entity
