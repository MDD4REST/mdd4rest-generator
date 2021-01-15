/**
 */
package StaticPIM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link StaticPIM.Application#getResources <em>Resources</em>}</li>
 *   <li>{@link StaticPIM.Application#getAggregates <em>Aggregates</em>}</li>
 *   <li>{@link StaticPIM.Application#getServices <em>Services</em>}</li>
 *   <li>{@link StaticPIM.Application#getDatamapper <em>Datamapper</em>}</li>
 *   <li>{@link StaticPIM.Application#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see StaticPIM.StaticPIMPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends EObject {
	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link StaticPIM.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see StaticPIM.StaticPIMPackage#getApplication_Resources()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Resource> getResources();

	/**
	 * Returns the value of the '<em><b>Aggregates</b></em>' containment reference list.
	 * The list contents are of type {@link StaticPIM.Aggregate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregates</em>' containment reference list.
	 * @see StaticPIM.StaticPIMPackage#getApplication_Aggregates()
	 * @model containment="true"
	 * @generated
	 */
	EList<Aggregate> getAggregates();

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link StaticPIM.Service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see StaticPIM.StaticPIMPackage#getApplication_Services()
	 * @model containment="true"
	 * @generated
	 */
	EList<Service> getServices();

	/**
	 * Returns the value of the '<em><b>Datamapper</b></em>' containment reference list.
	 * The list contents are of type {@link StaticPIM.DataMapper}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datamapper</em>' containment reference list.
	 * @see StaticPIM.StaticPIMPackage#getApplication_Datamapper()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataMapper> getDatamapper();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see StaticPIM.StaticPIMPackage#getApplication_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link StaticPIM.Application#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Application
