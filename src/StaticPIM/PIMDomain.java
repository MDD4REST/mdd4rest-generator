/**
 */
package StaticPIM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PIM Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link StaticPIM.PIMDomain#getName <em>Name</em>}</li>
 *   <li>{@link StaticPIM.PIMDomain#getBasePath <em>Base Path</em>}</li>
 *   <li>{@link StaticPIM.PIMDomain#getHasApplications <em>Has Applications</em>}</li>
 *   <li>{@link StaticPIM.PIMDomain#getPrimitiveTypes <em>Primitive Types</em>}</li>
 * </ul>
 *
 * @see StaticPIM.StaticPIMPackage#getPIMDomain()
 * @model
 * @generated
 */
public interface PIMDomain extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see StaticPIM.StaticPIMPackage#getPIMDomain_Name()
	 * @model unique="false" id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link StaticPIM.PIMDomain#getName <em>Name</em>}' attribute.
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
	 * @see StaticPIM.StaticPIMPackage#getPIMDomain_BasePath()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getBasePath();

	/**
	 * Sets the value of the '{@link StaticPIM.PIMDomain#getBasePath <em>Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Path</em>' attribute.
	 * @see #getBasePath()
	 * @generated
	 */
	void setBasePath(String value);

	/**
	 * Returns the value of the '<em><b>Has Applications</b></em>' containment reference list.
	 * The list contents are of type {@link StaticPIM.Application}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Applications</em>' containment reference list.
	 * @see StaticPIM.StaticPIMPackage#getPIMDomain_HasApplications()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Application> getHasApplications();

	/**
	 * Returns the value of the '<em><b>Primitive Types</b></em>' containment reference list.
	 * The list contents are of type {@link StaticPIM.PrimitiveType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive Types</em>' containment reference list.
	 * @see StaticPIM.StaticPIMPackage#getPIMDomain_PrimitiveTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<PrimitiveType> getPrimitiveTypes();

} // PIMDomain
