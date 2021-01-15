/**
 */
package DynamicPIM;

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
 *   <li>{@link DynamicPIM.Aggregate#getName <em>Name</em>}</li>
 *   <li>{@link DynamicPIM.Aggregate#getHasProcess <em>Has Process</em>}</li>
 *   <li>{@link DynamicPIM.Aggregate#getApplication <em>Application</em>}</li>
 *   <li>{@link DynamicPIM.Aggregate#getDomainobjects <em>Domainobjects</em>}</li>
 *   <li>{@link DynamicPIM.Aggregate#getHasResource <em>Has Resource</em>}</li>
 *   <li>{@link DynamicPIM.Aggregate#getAggregateRoot <em>Aggregate Root</em>}</li>
 * </ul>
 *
 * @see DynamicPIM.DynamicPIMPackage#getAggregate()
 * @model
 * @generated
 */
public interface Aggregate extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see DynamicPIM.DynamicPIMPackage#getAggregate_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link DynamicPIM.Aggregate#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Has Process</b></em>' containment reference list.
	 * The list contents are of type {@link DynamicPIM.Process}.
	 * It is bidirectional and its opposite is '{@link DynamicPIM.Process#getAggregate <em>Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Process</em>' containment reference list.
	 * @see DynamicPIM.DynamicPIMPackage#getAggregate_HasProcess()
	 * @see DynamicPIM.Process#getAggregate
	 * @model opposite="aggregate" containment="true"
	 * @generated
	 */
	EList<DynamicPIM.Process> getHasProcess();

	/**
	 * Returns the value of the '<em><b>Application</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link DynamicPIM.Application#getHasAggregate <em>Has Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' container reference.
	 * @see #setApplication(Application)
	 * @see DynamicPIM.DynamicPIMPackage#getAggregate_Application()
	 * @see DynamicPIM.Application#getHasAggregate
	 * @model opposite="hasAggregate" required="true" transient="false"
	 * @generated
	 */
	Application getApplication();

	/**
	 * Sets the value of the '{@link DynamicPIM.Aggregate#getApplication <em>Application</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' container reference.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(Application value);

	/**
	 * Returns the value of the '<em><b>Domainobjects</b></em>' containment reference list.
	 * The list contents are of type {@link DynamicPIM.DomainObject}.
	 * It is bidirectional and its opposite is '{@link DynamicPIM.DomainObject#getAggregate <em>Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domainobjects</em>' containment reference list.
	 * @see DynamicPIM.DynamicPIMPackage#getAggregate_Domainobjects()
	 * @see DynamicPIM.DomainObject#getAggregate
	 * @model opposite="aggregate" containment="true"
	 * @generated
	 */
	EList<DomainObject> getDomainobjects();

	/**
	 * Returns the value of the '<em><b>Has Resource</b></em>' containment reference list.
	 * The list contents are of type {@link DynamicPIM.Resource}.
	 * It is bidirectional and its opposite is '{@link DynamicPIM.Resource#getAggregate <em>Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Resource</em>' containment reference list.
	 * @see DynamicPIM.DynamicPIMPackage#getAggregate_HasResource()
	 * @see DynamicPIM.Resource#getAggregate
	 * @model opposite="aggregate" containment="true"
	 * @generated
	 */
	EList<Resource> getHasResource();

	/**
	 * Returns the value of the '<em><b>Aggregate Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate Root</em>' reference.
	 * @see #setAggregateRoot(DomainObject)
	 * @see DynamicPIM.DynamicPIMPackage#getAggregate_AggregateRoot()
	 * @model required="true"
	 * @generated
	 */
	DomainObject getAggregateRoot();

	/**
	 * Sets the value of the '{@link DynamicPIM.Aggregate#getAggregateRoot <em>Aggregate Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregate Root</em>' reference.
	 * @see #getAggregateRoot()
	 * @generated
	 */
	void setAggregateRoot(DomainObject value);

} // Aggregate
