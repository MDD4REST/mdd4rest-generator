/**
 */
package StaticPIM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Representation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link StaticPIM.InputRepresentation#getInputMediaType <em>Input Media Type</em>}</li>
 * </ul>
 *
 * @see StaticPIM.StaticPIMPackage#getInputRepresentation()
 * @model
 * @generated
 */
public interface InputRepresentation extends EObject {
	/**
	 * Returns the value of the '<em><b>Input Media Type</b></em>' attribute.
	 * The literals are from the enumeration {@link StaticPIM.MediaType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Media Type</em>' attribute.
	 * @see StaticPIM.MediaType
	 * @see #setInputMediaType(MediaType)
	 * @see StaticPIM.StaticPIMPackage#getInputRepresentation_InputMediaType()
	 * @model unique="false" required="true"
	 * @generated
	 */
	MediaType getInputMediaType();

	/**
	 * Sets the value of the '{@link StaticPIM.InputRepresentation#getInputMediaType <em>Input Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Media Type</em>' attribute.
	 * @see StaticPIM.MediaType
	 * @see #getInputMediaType()
	 * @generated
	 */
	void setInputMediaType(MediaType value);

} // InputRepresentation
