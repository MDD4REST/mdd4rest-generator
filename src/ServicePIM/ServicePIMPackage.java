/**
 */
package ServicePIM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ServicePIM.ServicePIMFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface ServicePIMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ServicePIM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "src/metamodels/PIMMetamodel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mde";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ServicePIMPackage eINSTANCE = ServicePIM.impl.ServicePIMPackageImpl.init();

	/**
	 * The meta object id for the '{@link ServicePIM.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.impl.ResourceImpl
	 * @see ServicePIM.impl.ServicePIMPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Is Algorithmic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__IS_ALGORITHMIC = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Has Input Representation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__HAS_INPUT_REPRESENTATION = 2;

	/**
	 * The feature id for the '<em><b>Has CRUD Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__HAS_CRUD_ACTIVITY = 3;

	/**
	 * The feature id for the '<em><b>Has Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__HAS_PROPERTY = 4;

	/**
	 * The feature id for the '<em><b>Has Output Representation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__HAS_OUTPUT_REPRESENTATION = 5;

	/**
	 * The feature id for the '<em><b>Has Related Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__HAS_RELATED_RESOURCE = 6;

	/**
	 * The feature id for the '<em><b>Is Related Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__IS_RELATED_RESOURCE = 7;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ServicePIM.impl.CRUDActivityImpl <em>CRUD Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.impl.CRUDActivityImpl
	 * @see ServicePIM.impl.ServicePIMPackageImpl#getCRUDActivity()
	 * @generated
	 */
	int CRUD_ACTIVITY = 1;

	/**
	 * The feature id for the '<em><b>CRUD Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD_ACTIVITY__CRUD_VERB = 0;

	/**
	 * The number of structural features of the '<em>CRUD Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD_ACTIVITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>CRUD Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD_ACTIVITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ServicePIM.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.impl.PropertyImpl
	 * @see ServicePIM.impl.ServicePIMPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 2;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_UNIQUE = 0;

	/**
	 * The feature id for the '<em><b>Is Naming Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_NAMING_PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ServicePIM.impl.InputRepresentationImpl <em>Input Representation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.impl.InputRepresentationImpl
	 * @see ServicePIM.impl.ServicePIMPackageImpl#getInputRepresentation()
	 * @generated
	 */
	int INPUT_REPRESENTATION = 3;

	/**
	 * The feature id for the '<em><b>Input Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_REPRESENTATION__INPUT_MEDIA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Input Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_REPRESENTATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Input Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_REPRESENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ServicePIM.impl.OutputRepresentationImpl <em>Output Representation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.impl.OutputRepresentationImpl
	 * @see ServicePIM.impl.ServicePIMPackageImpl#getOutputRepresentation()
	 * @generated
	 */
	int OUTPUT_REPRESENTATION = 4;

	/**
	 * The feature id for the '<em><b>Output Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_REPRESENTATION__OUTPUT_MEDIA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Output Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_REPRESENTATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Output Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_REPRESENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ServicePIM.impl.RESTfulServicePIMImpl <em>RES Tful Service PIM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.impl.RESTfulServicePIMImpl
	 * @see ServicePIM.impl.ServicePIMPackageImpl#getRESTfulServicePIM()
	 * @generated
	 */
	int RES_TFUL_SERVICE_PIM = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_TFUL_SERVICE_PIM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Has Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_TFUL_SERVICE_PIM__HAS_RESOURCES = 1;

	/**
	 * The feature id for the '<em><b>Output Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_TFUL_SERVICE_PIM__OUTPUT_PATH = 2;

	/**
	 * The feature id for the '<em><b>Db IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_TFUL_SERVICE_PIM__DB_IP = 3;

	/**
	 * The feature id for the '<em><b>Db Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_TFUL_SERVICE_PIM__DB_PORT = 4;

	/**
	 * The feature id for the '<em><b>Db Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_TFUL_SERVICE_PIM__DB_USERNAME = 5;

	/**
	 * The feature id for the '<em><b>Db Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_TFUL_SERVICE_PIM__DB_PASSWORD = 6;

	/**
	 * The number of structural features of the '<em>RES Tful Service PIM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_TFUL_SERVICE_PIM_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>RES Tful Service PIM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_TFUL_SERVICE_PIM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ServicePIM.impl.RelatedResourceImpl <em>Related Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.impl.RelatedResourceImpl
	 * @see ServicePIM.impl.ServicePIMPackageImpl#getRelatedResource()
	 * @generated
	 */
	int RELATED_RESOURCE = 6;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_RESOURCE__MULTIPLICITY = 0;

	/**
	 * The feature id for the '<em><b>From Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_RESOURCE__FROM_RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>To Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_RESOURCE__TO_RESOURCE = 2;

	/**
	 * The number of structural features of the '<em>Related Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_RESOURCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Related Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATED_RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ServicePIM.MediaType <em>Media Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.MediaType
	 * @see ServicePIM.impl.ServicePIMPackageImpl#getMediaType()
	 * @generated
	 */
	int MEDIA_TYPE = 7;

	/**
	 * The meta object id for the '{@link ServicePIM.CRUDVerb <em>CRUD Verb</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.CRUDVerb
	 * @see ServicePIM.impl.ServicePIMPackageImpl#getCRUDVerb()
	 * @generated
	 */
	int CRUD_VERB = 8;


	/**
	 * The meta object id for the '{@link ServicePIM.Multiplicity <em>Multiplicity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.Multiplicity
	 * @see ServicePIM.impl.ServicePIMPackageImpl#getMultiplicity()
	 * @generated
	 */
	int MULTIPLICITY = 9;


	/**
	 * Returns the meta object for class '{@link ServicePIM.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see ServicePIM.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.Resource#isIsAlgorithmic <em>Is Algorithmic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Algorithmic</em>'.
	 * @see ServicePIM.Resource#isIsAlgorithmic()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_IsAlgorithmic();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.Resource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ServicePIM.Resource#getName()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ServicePIM.Resource#getHasInputRepresentation <em>Has Input Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Input Representation</em>'.
	 * @see ServicePIM.Resource#getHasInputRepresentation()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_HasInputRepresentation();

	/**
	 * Returns the meta object for the containment reference list '{@link ServicePIM.Resource#getHasCRUDActivity <em>Has CRUD Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has CRUD Activity</em>'.
	 * @see ServicePIM.Resource#getHasCRUDActivity()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_HasCRUDActivity();

	/**
	 * Returns the meta object for the containment reference list '{@link ServicePIM.Resource#getHasProperty <em>Has Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Property</em>'.
	 * @see ServicePIM.Resource#getHasProperty()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_HasProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link ServicePIM.Resource#getHasOutputRepresentation <em>Has Output Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Output Representation</em>'.
	 * @see ServicePIM.Resource#getHasOutputRepresentation()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_HasOutputRepresentation();

	/**
	 * Returns the meta object for the containment reference list '{@link ServicePIM.Resource#getHasRelatedResource <em>Has Related Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Related Resource</em>'.
	 * @see ServicePIM.Resource#getHasRelatedResource()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_HasRelatedResource();

	/**
	 * Returns the meta object for the containment reference list '{@link ServicePIM.Resource#getIsRelatedResource <em>Is Related Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Is Related Resource</em>'.
	 * @see ServicePIM.Resource#getIsRelatedResource()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_IsRelatedResource();

	/**
	 * Returns the meta object for class '{@link ServicePIM.CRUDActivity <em>CRUD Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CRUD Activity</em>'.
	 * @see ServicePIM.CRUDActivity
	 * @generated
	 */
	EClass getCRUDActivity();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.CRUDActivity#getCRUDVerb <em>CRUD Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CRUD Verb</em>'.
	 * @see ServicePIM.CRUDActivity#getCRUDVerb()
	 * @see #getCRUDActivity()
	 * @generated
	 */
	EAttribute getCRUDActivity_CRUDVerb();

	/**
	 * Returns the meta object for class '{@link ServicePIM.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see ServicePIM.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.Property#isIsUnique <em>Is Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unique</em>'.
	 * @see ServicePIM.Property#isIsUnique()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_IsUnique();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.Property#isIsNamingProperty <em>Is Naming Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Naming Property</em>'.
	 * @see ServicePIM.Property#isIsNamingProperty()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_IsNamingProperty();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ServicePIM.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.Property#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ServicePIM.Property#getType()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Type();

	/**
	 * Returns the meta object for class '{@link ServicePIM.InputRepresentation <em>Input Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Representation</em>'.
	 * @see ServicePIM.InputRepresentation
	 * @generated
	 */
	EClass getInputRepresentation();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.InputRepresentation#getInputMediaType <em>Input Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Media Type</em>'.
	 * @see ServicePIM.InputRepresentation#getInputMediaType()
	 * @see #getInputRepresentation()
	 * @generated
	 */
	EAttribute getInputRepresentation_InputMediaType();

	/**
	 * Returns the meta object for class '{@link ServicePIM.OutputRepresentation <em>Output Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Representation</em>'.
	 * @see ServicePIM.OutputRepresentation
	 * @generated
	 */
	EClass getOutputRepresentation();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.OutputRepresentation#getOutputMediaType <em>Output Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Media Type</em>'.
	 * @see ServicePIM.OutputRepresentation#getOutputMediaType()
	 * @see #getOutputRepresentation()
	 * @generated
	 */
	EAttribute getOutputRepresentation_OutputMediaType();

	/**
	 * Returns the meta object for class '{@link ServicePIM.RESTfulServicePIM <em>RES Tful Service PIM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RES Tful Service PIM</em>'.
	 * @see ServicePIM.RESTfulServicePIM
	 * @generated
	 */
	EClass getRESTfulServicePIM();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.RESTfulServicePIM#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ServicePIM.RESTfulServicePIM#getName()
	 * @see #getRESTfulServicePIM()
	 * @generated
	 */
	EAttribute getRESTfulServicePIM_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ServicePIM.RESTfulServicePIM#getHasResources <em>Has Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Resources</em>'.
	 * @see ServicePIM.RESTfulServicePIM#getHasResources()
	 * @see #getRESTfulServicePIM()
	 * @generated
	 */
	EReference getRESTfulServicePIM_HasResources();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.RESTfulServicePIM#getOutputPath <em>Output Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Path</em>'.
	 * @see ServicePIM.RESTfulServicePIM#getOutputPath()
	 * @see #getRESTfulServicePIM()
	 * @generated
	 */
	EAttribute getRESTfulServicePIM_OutputPath();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.RESTfulServicePIM#getDbIP <em>Db IP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db IP</em>'.
	 * @see ServicePIM.RESTfulServicePIM#getDbIP()
	 * @see #getRESTfulServicePIM()
	 * @generated
	 */
	EAttribute getRESTfulServicePIM_DbIP();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.RESTfulServicePIM#getDbPort <em>Db Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db Port</em>'.
	 * @see ServicePIM.RESTfulServicePIM#getDbPort()
	 * @see #getRESTfulServicePIM()
	 * @generated
	 */
	EAttribute getRESTfulServicePIM_DbPort();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.RESTfulServicePIM#getDbUsername <em>Db Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db Username</em>'.
	 * @see ServicePIM.RESTfulServicePIM#getDbUsername()
	 * @see #getRESTfulServicePIM()
	 * @generated
	 */
	EAttribute getRESTfulServicePIM_DbUsername();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.RESTfulServicePIM#getDbPassword <em>Db Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db Password</em>'.
	 * @see ServicePIM.RESTfulServicePIM#getDbPassword()
	 * @see #getRESTfulServicePIM()
	 * @generated
	 */
	EAttribute getRESTfulServicePIM_DbPassword();

	/**
	 * Returns the meta object for class '{@link ServicePIM.RelatedResource <em>Related Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Related Resource</em>'.
	 * @see ServicePIM.RelatedResource
	 * @generated
	 */
	EClass getRelatedResource();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.RelatedResource#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see ServicePIM.RelatedResource#getMultiplicity()
	 * @see #getRelatedResource()
	 * @generated
	 */
	EAttribute getRelatedResource_Multiplicity();

	/**
	 * Returns the meta object for the reference '{@link ServicePIM.RelatedResource#getFromResource <em>From Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Resource</em>'.
	 * @see ServicePIM.RelatedResource#getFromResource()
	 * @see #getRelatedResource()
	 * @generated
	 */
	EReference getRelatedResource_FromResource();

	/**
	 * Returns the meta object for the reference '{@link ServicePIM.RelatedResource#getToResource <em>To Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Resource</em>'.
	 * @see ServicePIM.RelatedResource#getToResource()
	 * @see #getRelatedResource()
	 * @generated
	 */
	EReference getRelatedResource_ToResource();

	/**
	 * Returns the meta object for enum '{@link ServicePIM.MediaType <em>Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Media Type</em>'.
	 * @see ServicePIM.MediaType
	 * @generated
	 */
	EEnum getMediaType();

	/**
	 * Returns the meta object for enum '{@link ServicePIM.CRUDVerb <em>CRUD Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CRUD Verb</em>'.
	 * @see ServicePIM.CRUDVerb
	 * @generated
	 */
	EEnum getCRUDVerb();

	/**
	 * Returns the meta object for enum '{@link ServicePIM.Multiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Multiplicity</em>'.
	 * @see ServicePIM.Multiplicity
	 * @generated
	 */
	EEnum getMultiplicity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ServicePIMFactory getServicePIMFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ServicePIM.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.impl.ResourceImpl
		 * @see ServicePIM.impl.ServicePIMPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Is Algorithmic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__IS_ALGORITHMIC = eINSTANCE.getResource_IsAlgorithmic();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__NAME = eINSTANCE.getResource_Name();

		/**
		 * The meta object literal for the '<em><b>Has Input Representation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__HAS_INPUT_REPRESENTATION = eINSTANCE.getResource_HasInputRepresentation();

		/**
		 * The meta object literal for the '<em><b>Has CRUD Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__HAS_CRUD_ACTIVITY = eINSTANCE.getResource_HasCRUDActivity();

		/**
		 * The meta object literal for the '<em><b>Has Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__HAS_PROPERTY = eINSTANCE.getResource_HasProperty();

		/**
		 * The meta object literal for the '<em><b>Has Output Representation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__HAS_OUTPUT_REPRESENTATION = eINSTANCE.getResource_HasOutputRepresentation();

		/**
		 * The meta object literal for the '<em><b>Has Related Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__HAS_RELATED_RESOURCE = eINSTANCE.getResource_HasRelatedResource();

		/**
		 * The meta object literal for the '<em><b>Is Related Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__IS_RELATED_RESOURCE = eINSTANCE.getResource_IsRelatedResource();

		/**
		 * The meta object literal for the '{@link ServicePIM.impl.CRUDActivityImpl <em>CRUD Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.impl.CRUDActivityImpl
		 * @see ServicePIM.impl.ServicePIMPackageImpl#getCRUDActivity()
		 * @generated
		 */
		EClass CRUD_ACTIVITY = eINSTANCE.getCRUDActivity();

		/**
		 * The meta object literal for the '<em><b>CRUD Verb</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRUD_ACTIVITY__CRUD_VERB = eINSTANCE.getCRUDActivity_CRUDVerb();

		/**
		 * The meta object literal for the '{@link ServicePIM.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.impl.PropertyImpl
		 * @see ServicePIM.impl.ServicePIMPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Is Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__IS_UNIQUE = eINSTANCE.getProperty_IsUnique();

		/**
		 * The meta object literal for the '<em><b>Is Naming Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__IS_NAMING_PROPERTY = eINSTANCE.getProperty_IsNamingProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__TYPE = eINSTANCE.getProperty_Type();

		/**
		 * The meta object literal for the '{@link ServicePIM.impl.InputRepresentationImpl <em>Input Representation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.impl.InputRepresentationImpl
		 * @see ServicePIM.impl.ServicePIMPackageImpl#getInputRepresentation()
		 * @generated
		 */
		EClass INPUT_REPRESENTATION = eINSTANCE.getInputRepresentation();

		/**
		 * The meta object literal for the '<em><b>Input Media Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_REPRESENTATION__INPUT_MEDIA_TYPE = eINSTANCE.getInputRepresentation_InputMediaType();

		/**
		 * The meta object literal for the '{@link ServicePIM.impl.OutputRepresentationImpl <em>Output Representation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.impl.OutputRepresentationImpl
		 * @see ServicePIM.impl.ServicePIMPackageImpl#getOutputRepresentation()
		 * @generated
		 */
		EClass OUTPUT_REPRESENTATION = eINSTANCE.getOutputRepresentation();

		/**
		 * The meta object literal for the '<em><b>Output Media Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_REPRESENTATION__OUTPUT_MEDIA_TYPE = eINSTANCE.getOutputRepresentation_OutputMediaType();

		/**
		 * The meta object literal for the '{@link ServicePIM.impl.RESTfulServicePIMImpl <em>RES Tful Service PIM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.impl.RESTfulServicePIMImpl
		 * @see ServicePIM.impl.ServicePIMPackageImpl#getRESTfulServicePIM()
		 * @generated
		 */
		EClass RES_TFUL_SERVICE_PIM = eINSTANCE.getRESTfulServicePIM();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RES_TFUL_SERVICE_PIM__NAME = eINSTANCE.getRESTfulServicePIM_Name();

		/**
		 * The meta object literal for the '<em><b>Has Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RES_TFUL_SERVICE_PIM__HAS_RESOURCES = eINSTANCE.getRESTfulServicePIM_HasResources();

		/**
		 * The meta object literal for the '<em><b>Output Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RES_TFUL_SERVICE_PIM__OUTPUT_PATH = eINSTANCE.getRESTfulServicePIM_OutputPath();

		/**
		 * The meta object literal for the '<em><b>Db IP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RES_TFUL_SERVICE_PIM__DB_IP = eINSTANCE.getRESTfulServicePIM_DbIP();

		/**
		 * The meta object literal for the '<em><b>Db Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RES_TFUL_SERVICE_PIM__DB_PORT = eINSTANCE.getRESTfulServicePIM_DbPort();

		/**
		 * The meta object literal for the '<em><b>Db Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RES_TFUL_SERVICE_PIM__DB_USERNAME = eINSTANCE.getRESTfulServicePIM_DbUsername();

		/**
		 * The meta object literal for the '<em><b>Db Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RES_TFUL_SERVICE_PIM__DB_PASSWORD = eINSTANCE.getRESTfulServicePIM_DbPassword();

		/**
		 * The meta object literal for the '{@link ServicePIM.impl.RelatedResourceImpl <em>Related Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.impl.RelatedResourceImpl
		 * @see ServicePIM.impl.ServicePIMPackageImpl#getRelatedResource()
		 * @generated
		 */
		EClass RELATED_RESOURCE = eINSTANCE.getRelatedResource();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATED_RESOURCE__MULTIPLICITY = eINSTANCE.getRelatedResource_Multiplicity();

		/**
		 * The meta object literal for the '<em><b>From Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATED_RESOURCE__FROM_RESOURCE = eINSTANCE.getRelatedResource_FromResource();

		/**
		 * The meta object literal for the '<em><b>To Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATED_RESOURCE__TO_RESOURCE = eINSTANCE.getRelatedResource_ToResource();

		/**
		 * The meta object literal for the '{@link ServicePIM.MediaType <em>Media Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.MediaType
		 * @see ServicePIM.impl.ServicePIMPackageImpl#getMediaType()
		 * @generated
		 */
		EEnum MEDIA_TYPE = eINSTANCE.getMediaType();

		/**
		 * The meta object literal for the '{@link ServicePIM.CRUDVerb <em>CRUD Verb</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.CRUDVerb
		 * @see ServicePIM.impl.ServicePIMPackageImpl#getCRUDVerb()
		 * @generated
		 */
		EEnum CRUD_VERB = eINSTANCE.getCRUDVerb();

		/**
		 * The meta object literal for the '{@link ServicePIM.Multiplicity <em>Multiplicity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.Multiplicity
		 * @see ServicePIM.impl.ServicePIMPackageImpl#getMultiplicity()
		 * @generated
		 */
		EEnum MULTIPLICITY = eINSTANCE.getMultiplicity();

	}

} //ServicePIMPackage
