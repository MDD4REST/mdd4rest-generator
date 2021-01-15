/**
 */
package StaticPIM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link StaticPIM.TypeDefinition#getTypeName <em>Type Name</em>}</li>
 * </ul>
 *
 * @see StaticPIM.StaticPIMPackage#getTypeDefinition()
 * @model abstract="true"
 * @generated
 */
public interface TypeDefinition extends EObject {

	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Name</em>' attribute.
	 * @see #setTypeName(String)
	 * @see StaticPIM.StaticPIMPackage#getTypeDefinition_TypeName()
	 * @model unique="false" id="true" required="true"
	 * @generated
	 */
	String getTypeName();

	/**
	 * Sets the value of the '{@link StaticPIM.TypeDefinition#getTypeName <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' attribute.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(String value);
} // TypeDefinition
