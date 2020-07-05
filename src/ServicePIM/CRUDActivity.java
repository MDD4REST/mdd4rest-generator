/**
 */
package ServicePIM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CRUD Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ServicePIM.CRUDActivity#getCRUDVerb <em>CRUD Verb</em>}</li>
 * </ul>
 *
 * @see ServicePIM.ServicePIMPackage#getCRUDActivity()
 * @model
 * @generated
 */
public interface CRUDActivity extends EObject {
	/**
	 * Returns the value of the '<em><b>CRUD Verb</b></em>' attribute.
	 * The literals are from the enumeration {@link ServicePIM.CRUDVerb}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CRUD Verb</em>' attribute.
	 * @see ServicePIM.CRUDVerb
	 * @see #setCRUDVerb(CRUDVerb)
	 * @see ServicePIM.ServicePIMPackage#getCRUDActivity_CRUDVerb()
	 * @model required="true"
	 * @generated
	 */
	CRUDVerb getCRUDVerb();

	/**
	 * Sets the value of the '{@link ServicePIM.CRUDActivity#getCRUDVerb <em>CRUD Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CRUD Verb</em>' attribute.
	 * @see ServicePIM.CRUDVerb
	 * @see #getCRUDVerb()
	 * @generated
	 */
	void setCRUDVerb(CRUDVerb value);

} // CRUDActivity
