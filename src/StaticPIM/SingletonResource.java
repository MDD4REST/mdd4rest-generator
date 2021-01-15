/**
 */
package StaticPIM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Singleton Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link StaticPIM.SingletonResource#getLookupField <em>Lookup Field</em>}</li>
 * </ul>
 *
 * @see StaticPIM.StaticPIMPackage#getSingletonResource()
 * @model
 * @generated
 */
public interface SingletonResource extends Resource {
	/**
	 * Returns the value of the '<em><b>Lookup Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lookup Field</em>' attribute.
	 * @see #setLookupField(String)
	 * @see StaticPIM.StaticPIMPackage#getSingletonResource_LookupField()
	 * @model unique="false"
	 * @generated
	 */
	String getLookupField();

	/**
	 * Sets the value of the '{@link StaticPIM.SingletonResource#getLookupField <em>Lookup Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lookup Field</em>' attribute.
	 * @see #getLookupField()
	 * @generated
	 */
	void setLookupField(String value);

} // SingletonResource
