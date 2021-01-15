/**
 */
package DynamicPIM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PIM Dynamic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DynamicPIM.PIMDynamic#getName <em>Name</em>}</li>
 *   <li>{@link DynamicPIM.PIMDynamic#getBasePath <em>Base Path</em>}</li>
 *   <li>{@link DynamicPIM.PIMDynamic#getHasApplication <em>Has Application</em>}</li>
 *   <li>{@link DynamicPIM.PIMDynamic#getPrimitiveTypes <em>Primitive Types</em>}</li>
 * </ul>
 *
 * @see DynamicPIM.DynamicPIMPackage#getPIMDynamic()
 * @model
 * @generated
 */
public interface PIMDynamic extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see DynamicPIM.DynamicPIMPackage#getPIMDynamic_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link DynamicPIM.PIMDynamic#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Base Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Path</em>' attribute.
	 * @see #setBasePath(String)
	 * @see DynamicPIM.DynamicPIMPackage#getPIMDynamic_BasePath()
	 * @model required="true"
	 * @generated
	 */
	String getBasePath();

	/**
	 * Sets the value of the '{@link DynamicPIM.PIMDynamic#getBasePath <em>Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Path</em>' attribute.
	 * @see #getBasePath()
	 * @generated
	 */
	void setBasePath(String value);

	/**
	 * Returns the value of the '<em><b>Has Application</b></em>' containment reference list.
	 * The list contents are of type {@link DynamicPIM.Application}.
	 * It is bidirectional and its opposite is '{@link DynamicPIM.Application#getPimdomain <em>Pimdomain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Application</em>' containment reference list.
	 * @see DynamicPIM.DynamicPIMPackage#getPIMDynamic_HasApplication()
	 * @see DynamicPIM.Application#getPimdomain
	 * @model opposite="pimdomain" containment="true" required="true"
	 * @generated
	 */
	EList<Application> getHasApplication();

	/**
	 * Returns the value of the '<em><b>Primitive Types</b></em>' containment reference list.
	 * The list contents are of type {@link DynamicPIM.PrimitiveType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive Types</em>' containment reference list.
	 * @see DynamicPIM.DynamicPIMPackage#getPIMDynamic_PrimitiveTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<PrimitiveType> getPrimitiveTypes();

} // PIMDynamic
