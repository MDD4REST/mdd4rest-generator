/**
 */
package StaticPIM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Representation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link StaticPIM.OutputRepresentation#getOutputMediaType <em>Output Media Type</em>}</li>
 * </ul>
 *
 * @see StaticPIM.StaticPIMPackage#getOutputRepresentation()
 * @model
 * @generated
 */
public interface OutputRepresentation extends EObject {
	/**
	 * Returns the value of the '<em><b>Output Media Type</b></em>' attribute.
	 * The literals are from the enumeration {@link StaticPIM.MediaType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Media Type</em>' attribute.
	 * @see StaticPIM.MediaType
	 * @see #setOutputMediaType(MediaType)
	 * @see StaticPIM.StaticPIMPackage#getOutputRepresentation_OutputMediaType()
	 * @model unique="false" required="true"
	 * @generated
	 */
	MediaType getOutputMediaType();

	/**
	 * Sets the value of the '{@link StaticPIM.OutputRepresentation#getOutputMediaType <em>Output Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Media Type</em>' attribute.
	 * @see StaticPIM.MediaType
	 * @see #getOutputMediaType()
	 * @generated
	 */
	void setOutputMediaType(MediaType value);

} // OutputRepresentation
