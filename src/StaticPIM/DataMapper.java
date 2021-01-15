/**
 */
package StaticPIM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Mapper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link StaticPIM.DataMapper#getEntity <em>Entity</em>}</li>
 *   <li>{@link StaticPIM.DataMapper#getDto <em>Dto</em>}</li>
 *   <li>{@link StaticPIM.DataMapper#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see StaticPIM.StaticPIMPackage#getDataMapper()
 * @model
 * @generated
 */
public interface DataMapper extends EObject {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference list.
	 * The list contents are of type {@link StaticPIM.DomainObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference list.
	 * @see StaticPIM.StaticPIMPackage#getDataMapper_Entity()
	 * @model required="true"
	 * @generated
	 */
	EList<DomainObject> getEntity();

	/**
	 * Returns the value of the '<em><b>Dto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dto</em>' reference.
	 * @see #setDto(DTO)
	 * @see StaticPIM.StaticPIMPackage#getDataMapper_Dto()
	 * @model required="true"
	 * @generated
	 */
	DTO getDto();

	/**
	 * Sets the value of the '{@link StaticPIM.DataMapper#getDto <em>Dto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dto</em>' reference.
	 * @see #getDto()
	 * @generated
	 */
	void setDto(DTO value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see StaticPIM.StaticPIMPackage#getDataMapper_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link StaticPIM.DataMapper#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // DataMapper
