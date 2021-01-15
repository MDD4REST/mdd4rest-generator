/**
 */
package DynamicPIM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Singleton Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DynamicPIM.SingletonResource#getLookupField <em>Lookup Field</em>}</li>
 * </ul>
 *
 * @see DynamicPIM.DynamicPIMPackage#getSingletonResource()
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
	 * @see DynamicPIM.DynamicPIMPackage#getSingletonResource_LookupField()
	 * @model
	 * @generated
	 */
	String getLookupField();

	/**
	 * Sets the value of the '{@link DynamicPIM.SingletonResource#getLookupField <em>Lookup Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lookup Field</em>' attribute.
	 * @see #getLookupField()
	 * @generated
	 */
	void setLookupField(String value);

} // SingletonResource
