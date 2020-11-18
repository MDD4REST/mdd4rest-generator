/**
 */
package ActivityDiagramMetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ActivityDiagramMetamodel.ObjectNode#getName <em>Name</em>}</li>
 *   <li>{@link ActivityDiagramMetamodel.ObjectNode#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link ActivityDiagramMetamodel.ObjectNode#isIsControlType <em>Is Control Type</em>}</li>
 *   <li>{@link ActivityDiagramMetamodel.ObjectNode#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @see ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage#getObjectNode()
 * @model annotation="gmf.node label='name' label.placement='internal'"
 * @generated
 */
public interface ObjectNode extends ActivityNode {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage#getObjectNode_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ActivityDiagramMetamodel.ObjectNode#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' containment reference.
	 * @see #setUpperBound(ValueSpecification)
	 * @see ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage#getObjectNode_UpperBound()
	 * @model containment="true"
	 * @generated
	 */
	ValueSpecification getUpperBound();

	/**
	 * Sets the value of the '{@link ActivityDiagramMetamodel.ObjectNode#getUpperBound <em>Upper Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' containment reference.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>Is Control Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Control Type</em>' attribute.
	 * @see #setIsControlType(boolean)
	 * @see ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage#getObjectNode_IsControlType()
	 * @model
	 * @generated
	 */
	boolean isIsControlType();

	/**
	 * Sets the value of the '{@link ActivityDiagramMetamodel.ObjectNode#isIsControlType <em>Is Control Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Control Type</em>' attribute.
	 * @see #isIsControlType()
	 * @generated
	 */
	void setIsControlType(boolean value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * The default value is <code>"FIFO"</code>.
	 * The literals are from the enumeration {@link ActivityDiagramMetamodel.ObjectNodeOrderingKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see ActivityDiagramMetamodel.ObjectNodeOrderingKind
	 * @see #setOrder(ObjectNodeOrderingKind)
	 * @see ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage#getObjectNode_Order()
	 * @model default="FIFO"
	 * @generated
	 */
	ObjectNodeOrderingKind getOrder();

	/**
	 * Sets the value of the '{@link ActivityDiagramMetamodel.ObjectNode#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see ActivityDiagramMetamodel.ObjectNodeOrderingKind
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(ObjectNodeOrderingKind value);

} // ObjectNode
