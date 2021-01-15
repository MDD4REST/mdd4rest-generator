/**
 */
package StaticPIM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link StaticPIM.Aggregate#getDomainobjects <em>Domainobjects</em>}</li>
 *   <li>{@link StaticPIM.Aggregate#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see StaticPIM.StaticPIMPackage#getAggregate()
 * @model
 * @generated
 */
public interface Aggregate extends EObject {
	/**
	 * Returns the value of the '<em><b>Domainobjects</b></em>' containment reference list.
	 * The list contents are of type {@link StaticPIM.DomainObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domainobjects</em>' containment reference list.
	 * @see StaticPIM.StaticPIMPackage#getAggregate_Domainobjects()
	 * @model containment="true"
	 * @generated
	 */
	EList<DomainObject> getDomainobjects();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see StaticPIM.StaticPIMPackage#getAggregate_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link StaticPIM.Aggregate#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Aggregate
