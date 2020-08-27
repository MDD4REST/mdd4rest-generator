/**
 */
package ServicePIM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ServicePIM.BasicType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see ServicePIM.ServicePIMPackage#getBasicType()
 * @model
 * @generated
 */
public interface BasicType extends TypeDefinition {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ServicePIM.PropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see ServicePIM.PropertyType
	 * @see #setType(PropertyType)
	 * @see ServicePIM.ServicePIMPackage#getBasicType_Type()
	 * @model
	 * @generated
	 */
	PropertyType getType();

	/**
	 * Sets the value of the '{@link ServicePIM.BasicType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see ServicePIM.PropertyType
	 * @see #getType()
	 * @generated
	 */
	void setType(PropertyType value);

} // BasicType
