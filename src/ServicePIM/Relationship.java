/**
 */
package ServicePIM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ServicePIM.Relationship#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link ServicePIM.Relationship#getFromResource <em>From Resource</em>}</li>
 *   <li>{@link ServicePIM.Relationship#getToResource <em>To Resource</em>}</li>
 * </ul>
 *
 * @see ServicePIM.ServicePIMPackage#getRelationship()
 * @model
 * @generated
 */
public interface Relationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' attribute.
	 * The literals are from the enumeration {@link ServicePIM.Multiplicity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' attribute.
	 * @see ServicePIM.Multiplicity
	 * @see #setMultiplicity(Multiplicity)
	 * @see ServicePIM.ServicePIMPackage#getRelationship_Multiplicity()
	 * @model unique="false" required="true"
	 * @generated
	 */
	Multiplicity getMultiplicity();

	/**
	 * Sets the value of the '{@link ServicePIM.Relationship#getMultiplicity <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' attribute.
	 * @see ServicePIM.Multiplicity
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(Multiplicity value);

	/**
	 * Returns the value of the '<em><b>From Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Resource</em>' reference.
	 * @see #setFromResource(Resource)
	 * @see ServicePIM.ServicePIMPackage#getRelationship_FromResource()
	 * @model required="true"
	 * @generated
	 */
	Resource getFromResource();

	/**
	 * Sets the value of the '{@link ServicePIM.Relationship#getFromResource <em>From Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Resource</em>' reference.
	 * @see #getFromResource()
	 * @generated
	 */
	void setFromResource(Resource value);

	/**
	 * Returns the value of the '<em><b>To Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Resource</em>' reference.
	 * @see #setToResource(Resource)
	 * @see ServicePIM.ServicePIMPackage#getRelationship_ToResource()
	 * @model required="true"
	 * @generated
	 */
	Resource getToResource();

	/**
	 * Sets the value of the '{@link ServicePIM.Relationship#getToResource <em>To Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Resource</em>' reference.
	 * @see #getToResource()
	 * @generated
	 */
	void setToResource(Resource value);

} // Relationship
