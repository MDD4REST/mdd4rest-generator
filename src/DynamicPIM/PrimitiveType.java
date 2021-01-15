/**
 */
package DynamicPIM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DynamicPIM.PrimitiveType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see DynamicPIM.DynamicPIMPackage#getPrimitiveType()
 * @model
 * @generated
 */
public interface PrimitiveType extends SimpleType {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link DynamicPIM.DefaultType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see DynamicPIM.DefaultType
	 * @see #setType(DefaultType)
	 * @see DynamicPIM.DynamicPIMPackage#getPrimitiveType_Type()
	 * @model
	 * @generated
	 */
	DefaultType getType();

	/**
	 * Sets the value of the '{@link DynamicPIM.PrimitiveType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see DynamicPIM.DefaultType
	 * @see #getType()
	 * @generated
	 */
	void setType(DefaultType value);

} // PrimitiveType
