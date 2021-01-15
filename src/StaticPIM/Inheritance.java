/**
 */
package StaticPIM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inheritance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link StaticPIM.Inheritance#getClass_ <em>Class</em>}</li>
 * </ul>
 *
 * @see StaticPIM.StaticPIMPackage#getInheritance()
 * @model
 * @generated
 */
public interface Inheritance extends EObject {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' reference.
	 * @see #setClass(DomainObject)
	 * @see StaticPIM.StaticPIMPackage#getInheritance_Class()
	 * @model required="true"
	 * @generated
	 */
	DomainObject getClass_();

	/**
	 * Sets the value of the '{@link StaticPIM.Inheritance#getClass_ <em>Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(DomainObject value);

} // Inheritance
