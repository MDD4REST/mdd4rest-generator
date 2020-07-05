/**
 */
package ServicePIM;

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
 *   <li>{@link ServicePIM.OutputRepresentation#getOutputMediaType <em>Output Media Type</em>}</li>
 * </ul>
 *
 * @see ServicePIM.ServicePIMPackage#getOutputRepresentation()
 * @model
 * @generated
 */
public interface OutputRepresentation extends EObject {
	/**
	 * Returns the value of the '<em><b>Output Media Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ServicePIM.MediaType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Media Type</em>' attribute.
	 * @see ServicePIM.MediaType
	 * @see #setOutputMediaType(MediaType)
	 * @see ServicePIM.ServicePIMPackage#getOutputRepresentation_OutputMediaType()
	 * @model required="true"
	 * @generated
	 */
	MediaType getOutputMediaType();

	/**
	 * Sets the value of the '{@link ServicePIM.OutputRepresentation#getOutputMediaType <em>Output Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Media Type</em>' attribute.
	 * @see ServicePIM.MediaType
	 * @see #getOutputMediaType()
	 * @generated
	 */
	void setOutputMediaType(MediaType value);

} // OutputRepresentation
