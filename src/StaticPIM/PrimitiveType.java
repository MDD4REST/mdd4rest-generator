/**
 */
package StaticPIM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link StaticPIM.PrimitiveType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see StaticPIM.StaticPIMPackage#getPrimitiveType()
 * @model
 * @generated
 */
public interface PrimitiveType extends TypeDefinition {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link StaticPIM.DefaultType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see StaticPIM.DefaultType
	 * @see #setType(DefaultType)
	 * @see StaticPIM.StaticPIMPackage#getPrimitiveType_Type()
	 * @model unique="false"
	 * @generated
	 */
	DefaultType getType();

	/**
	 * Sets the value of the '{@link StaticPIM.PrimitiveType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see StaticPIM.DefaultType
	 * @see #getType()
	 * @generated
	 */
	void setType(DefaultType value);

} // PrimitiveType
