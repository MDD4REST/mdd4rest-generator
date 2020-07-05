/**
 */
package ServicePIM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ServicePIM.ServicePIMPackage
 * @generated
 */
public interface ServicePIMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ServicePIMFactory eINSTANCE = ServicePIM.impl.ServicePIMFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource</em>'.
	 * @generated
	 */
	Resource createResource();

	/**
	 * Returns a new object of class '<em>CRUD Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CRUD Activity</em>'.
	 * @generated
	 */
	CRUDActivity createCRUDActivity();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>Input Representation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Representation</em>'.
	 * @generated
	 */
	InputRepresentation createInputRepresentation();

	/**
	 * Returns a new object of class '<em>Output Representation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Representation</em>'.
	 * @generated
	 */
	OutputRepresentation createOutputRepresentation();

	/**
	 * Returns a new object of class '<em>RES Tful Service PIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RES Tful Service PIM</em>'.
	 * @generated
	 */
	RESTfulServicePIM createRESTfulServicePIM();

	/**
	 * Returns a new object of class '<em>Related Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Related Resource</em>'.
	 * @generated
	 */
	RelatedResource createRelatedResource();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ServicePIMPackage getServicePIMPackage();

} //ServicePIMFactory
