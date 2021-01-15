/**
 */
package DynamicPIM;

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
 *   <li>{@link DynamicPIM.Application#getName <em>Name</em>}</li>
 *   <li>{@link DynamicPIM.Application#getHasAggregate <em>Has Aggregate</em>}</li>
 *   <li>{@link DynamicPIM.Application#getProject <em>Project</em>}</li>
 *   <li>{@link DynamicPIM.Application#getComplextypes <em>Complextypes</em>}</li>
 * </ul>
 *
 * @see DynamicPIM.DynamicPIMPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see DynamicPIM.DynamicPIMPackage#getApplication_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link DynamicPIM.Application#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Has Aggregate</b></em>' containment reference list.
	 * The list contents are of type {@link DynamicPIM.Aggregate}.
	 * It is bidirectional and its opposite is '{@link DynamicPIM.Aggregate#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Aggregate</em>' containment reference list.
	 * @see DynamicPIM.DynamicPIMPackage#getApplication_HasAggregate()
	 * @see DynamicPIM.Aggregate#getApplication
	 * @model opposite="application" containment="true" required="true"
	 * @generated
	 */
	EList<Aggregate> getHasAggregate();

	/**
	 * Returns the value of the '<em><b>Project</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link DynamicPIM.Project#getHasApplication <em>Has Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' container reference.
	 * @see #setProject(Project)
	 * @see DynamicPIM.DynamicPIMPackage#getApplication_Project()
	 * @see DynamicPIM.Project#getHasApplication
	 * @model opposite="hasApplication" required="true" transient="false"
	 * @generated
	 */
	Project getProject();

	/**
	 * Sets the value of the '{@link DynamicPIM.Application#getProject <em>Project</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' container reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(Project value);

	/**
	 * Returns the value of the '<em><b>Complextypes</b></em>' containment reference list.
	 * The list contents are of type {@link DynamicPIM.ComplexType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complextypes</em>' containment reference list.
	 * @see DynamicPIM.DynamicPIMPackage#getApplication_Complextypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComplexType> getComplextypes();

} // Application
