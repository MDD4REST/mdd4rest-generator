/**
 */
package sculptormetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sculptormetamodel.EnumValue#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see sculptormetamodel.SculptormetamodelPackage#getEnumValue()
 * @model
 * @generated
 */
public interface EnumValue extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link sculptormetamodel.EnumConstructorParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see sculptormetamodel.SculptormetamodelPackage#getEnumValue_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnumConstructorParameter> getParameters();

} // EnumValue
