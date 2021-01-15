/**
 */
package StaticPIM;

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
 *   <li>{@link StaticPIM.DomainObject#getHasProperty <em>Has Property</em>}</li>
 *   <li>{@link StaticPIM.DomainObject#getName <em>Name</em>}</li>
 *   <li>{@link StaticPIM.DomainObject#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link StaticPIM.DomainObject#isAggregateRoot <em>Aggregate Root</em>}</li>
 *   <li>{@link StaticPIM.DomainObject#getOperations <em>Operations</em>}</li>
 *   <li>{@link StaticPIM.DomainObject#getHasRelationship <em>Has Relationship</em>}</li>
 *   <li>{@link StaticPIM.DomainObject#getHasInheritance <em>Has Inheritance</em>}</li>
 * </ul>
 *
 * @see StaticPIM.StaticPIMPackage#getDomainObject()
 * @model abstract="true"
 * @generated
 */
public interface DomainObject extends TypeDefinition {
	/**
	 * Returns the value of the '<em><b>Has Property</b></em>' containment reference list.
	 * The list contents are of type {@link StaticPIM.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Property</em>' containment reference list.
	 * @see StaticPIM.StaticPIMPackage#getDomainObject_HasProperty()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getHasProperty();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see StaticPIM.StaticPIMPackage#getDomainObject_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link StaticPIM.DomainObject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see StaticPIM.StaticPIMPackage#getDomainObject_Abstract()
	 * @model unique="false"
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link StaticPIM.DomainObject#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Aggregate Root</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate Root</em>' attribute.
	 * @see #setAggregateRoot(boolean)
	 * @see StaticPIM.StaticPIMPackage#getDomainObject_AggregateRoot()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isAggregateRoot();

	/**
	 * Sets the value of the '{@link StaticPIM.DomainObject#isAggregateRoot <em>Aggregate Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregate Root</em>' attribute.
	 * @see #isAggregateRoot()
	 * @generated
	 */
	void setAggregateRoot(boolean value);

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link StaticPIM.DomainObjectOperation}.
	 * It is bidirectional and its opposite is '{@link StaticPIM.DomainObjectOperation#getDomainObject <em>Domain Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see StaticPIM.StaticPIMPackage#getDomainObject_Operations()
	 * @see StaticPIM.DomainObjectOperation#getDomainObject
	 * @model opposite="domainObject" containment="true"
	 * @generated
	 */
	EList<DomainObjectOperation> getOperations();

	/**
	 * Returns the value of the '<em><b>Has Relationship</b></em>' containment reference list.
	 * The list contents are of type {@link StaticPIM.Relation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Relationship</em>' containment reference list.
	 * @see StaticPIM.StaticPIMPackage#getDomainObject_HasRelationship()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relation> getHasRelationship();

	/**
	 * Returns the value of the '<em><b>Has Inheritance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Inheritance</em>' containment reference.
	 * @see #setHasInheritance(Inheritance)
	 * @see StaticPIM.StaticPIMPackage#getDomainObject_HasInheritance()
	 * @model containment="true"
	 * @generated
	 */
	Inheritance getHasInheritance();

	/**
	 * Sets the value of the '{@link StaticPIM.DomainObject#getHasInheritance <em>Has Inheritance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Inheritance</em>' containment reference.
	 * @see #getHasInheritance()
	 * @generated
	 */
	void setHasInheritance(Inheritance value);

} // DomainObject
