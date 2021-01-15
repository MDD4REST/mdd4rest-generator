/**
 */
package DynamicPIM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DynamicPIM.DomainObject#getName <em>Name</em>}</li>
 *   <li>{@link DynamicPIM.DomainObject#isAggregateRoot <em>Aggregate Root</em>}</li>
 *   <li>{@link DynamicPIM.DomainObject#getHasOperation <em>Has Operation</em>}</li>
 *   <li>{@link DynamicPIM.DomainObject#getAggregate <em>Aggregate</em>}</li>
 * </ul>
 *
 * @see DynamicPIM.DynamicPIMPackage#getDomainObject()
 * @model abstract="true"
 * @generated
 */
public interface DomainObject extends SimpleType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see DynamicPIM.DynamicPIMPackage#getDomainObject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link DynamicPIM.DomainObject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Aggregate Root</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate Root</em>' attribute.
	 * @see #setAggregateRoot(boolean)
	 * @see DynamicPIM.DynamicPIMPackage#getDomainObject_AggregateRoot()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isAggregateRoot();

	/**
	 * Sets the value of the '{@link DynamicPIM.DomainObject#isAggregateRoot <em>Aggregate Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregate Root</em>' attribute.
	 * @see #isAggregateRoot()
	 * @generated
	 */
	void setAggregateRoot(boolean value);

	/**
	 * Returns the value of the '<em><b>Has Operation</b></em>' containment reference list.
	 * The list contents are of type {@link DynamicPIM.DomainObjectOperation}.
	 * It is bidirectional and its opposite is '{@link DynamicPIM.DomainObjectOperation#getDomainobject <em>Domainobject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Operation</em>' containment reference list.
	 * @see DynamicPIM.DynamicPIMPackage#getDomainObject_HasOperation()
	 * @see DynamicPIM.DomainObjectOperation#getDomainobject
	 * @model opposite="domainobject" containment="true"
	 * @generated
	 */
	EList<DomainObjectOperation> getHasOperation();

	/**
	 * Returns the value of the '<em><b>Aggregate</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link DynamicPIM.Aggregate#getDomainobjects <em>Domainobjects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate</em>' container reference.
	 * @see #setAggregate(Aggregate)
	 * @see DynamicPIM.DynamicPIMPackage#getDomainObject_Aggregate()
	 * @see DynamicPIM.Aggregate#getDomainobjects
	 * @model opposite="domainobjects" required="true" transient="false"
	 * @generated
	 */
	Aggregate getAggregate();

	/**
	 * Sets the value of the '{@link DynamicPIM.DomainObject#getAggregate <em>Aggregate</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregate</em>' container reference.
	 * @see #getAggregate()
	 * @generated
	 */
	void setAggregate(Aggregate value);

} // DomainObject
