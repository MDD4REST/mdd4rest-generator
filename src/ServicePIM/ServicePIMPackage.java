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
	String eNS_URI = "src/metamodels/PIM/ServicePIMMetamodel.ecore";

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
	 * The feature id for the '<em><b>Has Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__HAS_ACTIVITIES = 3;

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
	 * The feature id for the '<em><b>Has Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__HAS_RELATIONSHIP = 6;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__FILTERS = 7;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__SORT = 8;

	/**
	 * The feature id for the '<em><b>Select</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__SELECT = 9;

	/**
	 * The feature id for the '<em><b>Pagination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__PAGINATION = 10;

	/**
	 * The feature id for the '<em><b>Scopesearch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__SCOPESEARCH = 11;

	/**
	 * The feature id for the '<em><b>Caching</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__CACHING = 12;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ServicePIM.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.impl.ActivityImpl
	 * @see ServicePIM.impl.ServicePIMPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 13;

	/**
	 * The feature id for the '<em><b>Is Authenticated Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__IS_AUTHENTICATED_REQUIRED = 0;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Is Authenticated Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD_ACTIVITY__IS_AUTHENTICATED_REQUIRED = ACTIVITY__IS_AUTHENTICATED_REQUIRED;

	/**
	 * The number of structural features of the '<em>CRUD Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD_ACTIVITY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>CRUD Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD_ACTIVITY_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Is Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_REQUIRED = 3;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__MIN = 4;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__MAX = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE = 6;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE_NAME = 7;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 8;

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
	 * The feature id for the '<em><b>Base Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_TFUL_SERVICE_PIM__BASE_PATH = 1;

	/**
	 * The feature id for the '<em><b>Has Applications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_TFUL_SERVICE_PIM__HAS_APPLICATIONS = 2;

	/**
	 * The feature id for the '<em><b>Enumerations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_TFUL_SERVICE_PIM__ENUMERATIONS = 3;

	/**
	 * The feature id for the '<em><b>Has Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_TFUL_SERVICE_PIM__HAS_RESOURCES = 4;

	/**
	 * The feature id for the '<em><b>Has Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_TFUL_SERVICE_PIM__HAS_ROLES = 5;

	/**
	 * The feature id for the '<em><b>Basictypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_TFUL_SERVICE_PIM__BASICTYPES = 6;

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
	 * The meta object id for the '{@link ServicePIM.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.impl.RelationshipImpl
	 * @see ServicePIM.impl.ServicePIMPackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 6;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__MULTIPLICITY = 0;

	/**
	 * The feature id for the '<em><b>From Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__FROM_RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>To Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TO_RESOURCE = 2;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ServicePIM.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.impl.ApplicationImpl
	 * @see ServicePIM.impl.ServicePIMPackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 7;

	/**
	 * The feature id for the '<em><b>Has Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__HAS_CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__RESOURCES = 1;

	/**
	 * The feature id for the '<em><b>Globalsearches</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__GLOBALSEARCHES = 2;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__ROLES = 3;

	/**
	 * The feature id for the '<em><b>Deployment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__DEPLOYMENT = 4;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ServicePIM.impl.ConfigImpl <em>Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.impl.ConfigImpl
	 * @see ServicePIM.impl.ServicePIMPackageImpl#getConfig()
	 * @generated
	 */
	int CONFIG = 8;

	/**
	 * The feature id for the '<em><b>Base Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__BASE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Application Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__APPLICATION_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Service Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__SERVICE_PORT = 2;

	/**
	 * The number of structural features of the '<em>Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ServicePIM.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.impl.TypeDefinitionImpl
	 * @see ServicePIM.impl.ServicePIMPackageImpl#getTypeDefinition()
	 * @generated
	 */
	int TYPE_DEFINITION = 9;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__TYPE_NAME = 0;

	/**
	 * The number of structural features of the '<em>Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ServicePIM.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.impl.EnumerationImpl
	 * @see ServicePIM.impl.ServicePIMPackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 10;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__TYPE_NAME = TYPE_DEFINITION__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__LITERALS = TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__NAME = TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = TYPE_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_OPERATION_COUNT = TYPE_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ServicePIM.impl.BasicTypeImpl <em>Basic Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.impl.BasicTypeImpl
	 * @see ServicePIM.impl.ServicePIMPackageImpl#getBasicType()
	 * @generated
	 */
	int BASIC_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__TYPE_NAME = TYPE_DEFINITION__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE__TYPE = TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Basic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE_FEATURE_COUNT = TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Basic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TYPE_OPERATION_COUNT = TYPE_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ServicePIM.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.impl.LiteralImpl
	 * @see ServicePIM.impl.ServicePIMPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ServicePIM.impl.CreateImpl <em>Create</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.impl.CreateImpl
	 * @see ServicePIM.impl.ServicePIMPackageImpl#getCreate()
	 * @generated
	 */
	int CREATE = 14;

	/**
	 * The feature id for the '<em><b>Is Authenticated Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__IS_AUTHENTICATED_REQUIRED = CRUD_ACTIVITY__IS_AUTHENTICATED_REQUIRED;

	/**
	 * The number of structural features of the '<em>Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_FEATURE_COUNT = CRUD_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OPERATION_COUNT = CRUD_ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ServicePIM.impl.ReadImpl <em>Read</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.impl.ReadImpl
	 * @see ServicePIM.impl.ServicePIMPackageImpl#getRead()
	 * @generated
	 */
	int READ = 15;

	/**
	 * The feature id for the '<em><b>Is Authenticated Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ__IS_AUTHENTICATED_REQUIRED = CRUD_ACTIVITY__IS_AUTHENTICATED_REQUIRED;

	/**
	 * The number of structural features of the '<em>Read</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_FEATURE_COUNT = CRUD_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Read</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_OPERATION_COUNT = CRUD_ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ServicePIM.impl.UpdateImpl <em>Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.impl.UpdateImpl
	 * @see ServicePIM.impl.ServicePIMPackageImpl#getUpdate()
	 * @generated
	 */
	int UPDATE = 16;

	/**
	 * The feature id for the '<em><b>Is Authenticated Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE__IS_AUTHENTICATED_REQUIRED = CRUD_ACTIVITY__IS_AUTHENTICATED_REQUIRED;

	/**
	 * The number of structural features of the '<em>Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FEATURE_COUNT = CRUD_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_OPERATION_COUNT = CRUD_ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ServicePIM.impl.DeleteImpl <em>Delete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.impl.DeleteImpl
	 * @see ServicePIM.impl.ServicePIMPackageImpl#getDelete()
	 * @generated
	 */
	int DELETE = 17;

	/**
	 * The feature id for the '<em><b>Is Authenticated Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__IS_AUTHENTICATED_REQUIRED = CRUD_ACTIVITY__IS_AUTHENTICATED_REQUIRED;

	/**
	 * The number of structural features of the '<em>Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_FEATURE_COUNT = CRUD_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_OPERATION_COUNT = CRUD_ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ServicePIM.impl.CustomImpl <em>Custom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.impl.CustomImpl
	 * @see ServicePIM.impl.ServicePIMPackageImpl#getCustom()
	 * @generated
	 */
	int CUSTOM = 18;

	/**
	 * The feature id for the '<em><b>Is Authenticated Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM__IS_AUTHENTICATED_REQUIRED = ACTIVITY__IS_AUTHENTICATED_REQUIRED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM__NAME = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Custom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Custom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ServicePIM.impl.DeploymentImpl <em>Deployment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.impl.DeploymentImpl
	 * @see ServicePIM.impl.ServicePIMPackageImpl#getDeployment()
	 * @generated
	 */
	int DEPLOYMENT = 19;

	/**
	 * The feature id for the '<em><b>Db Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__DB_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Db Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__DB_USERNAME = 1;

	/**
	 * The feature id for the '<em><b>Db IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__DB_IP = 2;

	/**
	 * The feature id for the '<em><b>Db Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__DB_PASSWORD = 3;

	/**
	 * The feature id for the '<em><b>Db Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__DB_PORT = 4;

	/**
	 * The feature id for the '<em><b>Deployment Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__DEPLOYMENT_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Directory Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__DIRECTORY_PATH = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__NAME = 7;

	/**
	 * The number of structural features of the '<em>Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ServicePIM.MediaType <em>Media Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.MediaType
	 * @see ServicePIM.impl.ServicePIMPackageImpl#getMediaType()
	 * @generated
	 */
	int MEDIA_TYPE = 20;

	/**
	 * The meta object id for the '{@link ServicePIM.Multiplicity <em>Multiplicity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.Multiplicity
	 * @see ServicePIM.impl.ServicePIMPackageImpl#getMultiplicity()
	 * @generated
	 */
	int MULTIPLICITY = 21;


	/**
	 * The meta object id for the '{@link ServicePIM.ApplicationType <em>Application Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.ApplicationType
	 * @see ServicePIM.impl.ServicePIMPackageImpl#getApplicationType()
	 * @generated
	 */
	int APPLICATION_TYPE = 22;

	/**
	 * The meta object id for the '{@link ServicePIM.PropertyType <em>Property Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.PropertyType
	 * @see ServicePIM.impl.ServicePIMPackageImpl#getPropertyType()
	 * @generated
	 */
	int PROPERTY_TYPE = 23;

	/**
	 * The meta object id for the '{@link ServicePIM.DeploymentType <em>Deployment Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.DeploymentType
	 * @see ServicePIM.impl.ServicePIMPackageImpl#getDeploymentType()
	 * @generated
	 */
	int DEPLOYMENT_TYPE = 24;

	/**
	 * The meta object id for the '{@link ServicePIM.DatabaseType <em>Database Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServicePIM.DatabaseType
	 * @see ServicePIM.impl.ServicePIMPackageImpl#getDatabaseType()
	 * @generated
	 */
	int DATABASE_TYPE = 25;

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
	 * Returns the meta object for the containment reference list '{@link ServicePIM.Resource#getHasActivities <em>Has Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Activities</em>'.
	 * @see ServicePIM.Resource#getHasActivities()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_HasActivities();

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
	 * Returns the meta object for the containment reference list '{@link ServicePIM.Resource#getHasRelationship <em>Has Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Relationship</em>'.
	 * @see ServicePIM.Resource#getHasRelationship()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_HasRelationship();

	/**
	 * Returns the meta object for the containment reference list '{@link ServicePIM.Resource#getFilters <em>Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filters</em>'.
	 * @see ServicePIM.Resource#getFilters()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Filters();

	/**
	 * Returns the meta object for the containment reference list '{@link ServicePIM.Resource#getSort <em>Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sort</em>'.
	 * @see ServicePIM.Resource#getSort()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Sort();

	/**
	 * Returns the meta object for the containment reference list '{@link ServicePIM.Resource#getSelect <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Select</em>'.
	 * @see ServicePIM.Resource#getSelect()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Select();

	/**
	 * Returns the meta object for the containment reference '{@link ServicePIM.Resource#getPagination <em>Pagination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pagination</em>'.
	 * @see ServicePIM.Resource#getPagination()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Pagination();

	/**
	 * Returns the meta object for the containment reference list '{@link ServicePIM.Resource#getScopesearch <em>Scopesearch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scopesearch</em>'.
	 * @see ServicePIM.Resource#getScopesearch()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Scopesearch();

	/**
	 * Returns the meta object for the containment reference '{@link ServicePIM.Resource#getCaching <em>Caching</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Caching</em>'.
	 * @see ServicePIM.Resource#getCaching()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Caching();

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
	 * Returns the meta object for the attribute '{@link ServicePIM.Property#isIsRequired <em>Is Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Required</em>'.
	 * @see ServicePIM.Property#isIsRequired()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_IsRequired();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.Property#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see ServicePIM.Property#getMin()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Min();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.Property#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see ServicePIM.Property#getMax()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Max();

	/**
	 * Returns the meta object for the reference '{@link ServicePIM.Property#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see ServicePIM.Property#getType()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Type();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.Property#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see ServicePIM.Property#getTypeName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_TypeName();

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
	 * Returns the meta object for the attribute '{@link ServicePIM.RESTfulServicePIM#getBasePath <em>Base Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Path</em>'.
	 * @see ServicePIM.RESTfulServicePIM#getBasePath()
	 * @see #getRESTfulServicePIM()
	 * @generated
	 */
	EAttribute getRESTfulServicePIM_BasePath();

	/**
	 * Returns the meta object for the containment reference list '{@link ServicePIM.RESTfulServicePIM#getHasApplications <em>Has Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Applications</em>'.
	 * @see ServicePIM.RESTfulServicePIM#getHasApplications()
	 * @see #getRESTfulServicePIM()
	 * @generated
	 */
	EReference getRESTfulServicePIM_HasApplications();

	/**
	 * Returns the meta object for the containment reference list '{@link ServicePIM.RESTfulServicePIM#getEnumerations <em>Enumerations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enumerations</em>'.
	 * @see ServicePIM.RESTfulServicePIM#getEnumerations()
	 * @see #getRESTfulServicePIM()
	 * @generated
	 */
	EReference getRESTfulServicePIM_Enumerations();

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
	 * Returns the meta object for the containment reference list '{@link ServicePIM.RESTfulServicePIM#getHasRoles <em>Has Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Roles</em>'.
	 * @see ServicePIM.RESTfulServicePIM#getHasRoles()
	 * @see #getRESTfulServicePIM()
	 * @generated
	 */
	EReference getRESTfulServicePIM_HasRoles();

	/**
	 * Returns the meta object for the containment reference list '{@link ServicePIM.RESTfulServicePIM#getBasictypes <em>Basictypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Basictypes</em>'.
	 * @see ServicePIM.RESTfulServicePIM#getBasictypes()
	 * @see #getRESTfulServicePIM()
	 * @generated
	 */
	EReference getRESTfulServicePIM_Basictypes();

	/**
	 * Returns the meta object for class '{@link ServicePIM.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see ServicePIM.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.Relationship#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see ServicePIM.Relationship#getMultiplicity()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_Multiplicity();

	/**
	 * Returns the meta object for the reference '{@link ServicePIM.Relationship#getFromResource <em>From Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Resource</em>'.
	 * @see ServicePIM.Relationship#getFromResource()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_FromResource();

	/**
	 * Returns the meta object for the reference '{@link ServicePIM.Relationship#getToResource <em>To Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Resource</em>'.
	 * @see ServicePIM.Relationship#getToResource()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_ToResource();

	/**
	 * Returns the meta object for class '{@link ServicePIM.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see ServicePIM.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the containment reference '{@link ServicePIM.Application#getHasConfig <em>Has Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Config</em>'.
	 * @see ServicePIM.Application#getHasConfig()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_HasConfig();

	/**
	 * Returns the meta object for the reference list '{@link ServicePIM.Application#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resources</em>'.
	 * @see ServicePIM.Application#getResources()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Resources();

	/**
	 * Returns the meta object for the containment reference '{@link ServicePIM.Application#getGlobalsearches <em>Globalsearches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Globalsearches</em>'.
	 * @see ServicePIM.Application#getGlobalsearches()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Globalsearches();

	/**
	 * Returns the meta object for the reference list '{@link ServicePIM.Application#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roles</em>'.
	 * @see ServicePIM.Application#getRoles()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Roles();

	/**
	 * Returns the meta object for the containment reference list '{@link ServicePIM.Application#getDeployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deployment</em>'.
	 * @see ServicePIM.Application#getDeployment()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Deployment();

	/**
	 * Returns the meta object for class '{@link ServicePIM.Config <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config</em>'.
	 * @see ServicePIM.Config
	 * @generated
	 */
	EClass getConfig();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.Config#getBaseName <em>Base Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Name</em>'.
	 * @see ServicePIM.Config#getBaseName()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_BaseName();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.Config#getApplicationType <em>Application Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application Type</em>'.
	 * @see ServicePIM.Config#getApplicationType()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_ApplicationType();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.Config#getServicePort <em>Service Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Port</em>'.
	 * @see ServicePIM.Config#getServicePort()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_ServicePort();

	/**
	 * Returns the meta object for class '{@link ServicePIM.TypeDefinition <em>Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Definition</em>'.
	 * @see ServicePIM.TypeDefinition
	 * @generated
	 */
	EClass getTypeDefinition();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.TypeDefinition#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see ServicePIM.TypeDefinition#getTypeName()
	 * @see #getTypeDefinition()
	 * @generated
	 */
	EAttribute getTypeDefinition_TypeName();

	/**
	 * Returns the meta object for class '{@link ServicePIM.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see ServicePIM.Enumeration
	 * @generated
	 */
	EClass getEnumeration();

	/**
	 * Returns the meta object for the containment reference list '{@link ServicePIM.Enumeration#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literals</em>'.
	 * @see ServicePIM.Enumeration#getLiterals()
	 * @see #getEnumeration()
	 * @generated
	 */
	EReference getEnumeration_Literals();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.Enumeration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ServicePIM.Enumeration#getName()
	 * @see #getEnumeration()
	 * @generated
	 */
	EAttribute getEnumeration_Name();

	/**
	 * Returns the meta object for class '{@link ServicePIM.BasicType <em>Basic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Type</em>'.
	 * @see ServicePIM.BasicType
	 * @generated
	 */
	EClass getBasicType();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.BasicType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ServicePIM.BasicType#getType()
	 * @see #getBasicType()
	 * @generated
	 */
	EAttribute getBasicType_Type();

	/**
	 * Returns the meta object for class '{@link ServicePIM.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see ServicePIM.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.Literal#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ServicePIM.Literal#getName()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Name();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.Literal#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ServicePIM.Literal#getValue()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Value();

	/**
	 * Returns the meta object for class '{@link ServicePIM.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see ServicePIM.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.Activity#isIsAuthenticatedRequired <em>Is Authenticated Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Authenticated Required</em>'.
	 * @see ServicePIM.Activity#isIsAuthenticatedRequired()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_IsAuthenticatedRequired();

	/**
	 * Returns the meta object for class '{@link ServicePIM.Create <em>Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create</em>'.
	 * @see ServicePIM.Create
	 * @generated
	 */
	EClass getCreate();

	/**
	 * Returns the meta object for class '{@link ServicePIM.Read <em>Read</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read</em>'.
	 * @see ServicePIM.Read
	 * @generated
	 */
	EClass getRead();

	/**
	 * Returns the meta object for class '{@link ServicePIM.Update <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update</em>'.
	 * @see ServicePIM.Update
	 * @generated
	 */
	EClass getUpdate();

	/**
	 * Returns the meta object for class '{@link ServicePIM.Delete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete</em>'.
	 * @see ServicePIM.Delete
	 * @generated
	 */
	EClass getDelete();

	/**
	 * Returns the meta object for class '{@link ServicePIM.Custom <em>Custom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom</em>'.
	 * @see ServicePIM.Custom
	 * @generated
	 */
	EClass getCustom();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.Custom#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ServicePIM.Custom#getName()
	 * @see #getCustom()
	 * @generated
	 */
	EAttribute getCustom_Name();

	/**
	 * Returns the meta object for class '{@link ServicePIM.Deployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment</em>'.
	 * @see ServicePIM.Deployment
	 * @generated
	 */
	EClass getDeployment();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.Deployment#getDbType <em>Db Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db Type</em>'.
	 * @see ServicePIM.Deployment#getDbType()
	 * @see #getDeployment()
	 * @generated
	 */
	EAttribute getDeployment_DbType();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.Deployment#getDbUsername <em>Db Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db Username</em>'.
	 * @see ServicePIM.Deployment#getDbUsername()
	 * @see #getDeployment()
	 * @generated
	 */
	EAttribute getDeployment_DbUsername();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.Deployment#getDbIP <em>Db IP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db IP</em>'.
	 * @see ServicePIM.Deployment#getDbIP()
	 * @see #getDeployment()
	 * @generated
	 */
	EAttribute getDeployment_DbIP();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.Deployment#getDbPassword <em>Db Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db Password</em>'.
	 * @see ServicePIM.Deployment#getDbPassword()
	 * @see #getDeployment()
	 * @generated
	 */
	EAttribute getDeployment_DbPassword();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.Deployment#getDbPort <em>Db Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db Port</em>'.
	 * @see ServicePIM.Deployment#getDbPort()
	 * @see #getDeployment()
	 * @generated
	 */
	EAttribute getDeployment_DbPort();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.Deployment#getDeploymentType <em>Deployment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deployment Type</em>'.
	 * @see ServicePIM.Deployment#getDeploymentType()
	 * @see #getDeployment()
	 * @generated
	 */
	EAttribute getDeployment_DeploymentType();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.Deployment#getDirectoryPath <em>Directory Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Directory Path</em>'.
	 * @see ServicePIM.Deployment#getDirectoryPath()
	 * @see #getDeployment()
	 * @generated
	 */
	EAttribute getDeployment_DirectoryPath();

	/**
	 * Returns the meta object for the attribute '{@link ServicePIM.Deployment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ServicePIM.Deployment#getName()
	 * @see #getDeployment()
	 * @generated
	 */
	EAttribute getDeployment_Name();

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
	 * Returns the meta object for enum '{@link ServicePIM.Multiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Multiplicity</em>'.
	 * @see ServicePIM.Multiplicity
	 * @generated
	 */
	EEnum getMultiplicity();

	/**
	 * Returns the meta object for enum '{@link ServicePIM.ApplicationType <em>Application Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Application Type</em>'.
	 * @see ServicePIM.ApplicationType
	 * @generated
	 */
	EEnum getApplicationType();

	/**
	 * Returns the meta object for enum '{@link ServicePIM.PropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property Type</em>'.
	 * @see ServicePIM.PropertyType
	 * @generated
	 */
	EEnum getPropertyType();

	/**
	 * Returns the meta object for enum '{@link ServicePIM.DeploymentType <em>Deployment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Deployment Type</em>'.
	 * @see ServicePIM.DeploymentType
	 * @generated
	 */
	EEnum getDeploymentType();

	/**
	 * Returns the meta object for enum '{@link ServicePIM.DatabaseType <em>Database Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Database Type</em>'.
	 * @see ServicePIM.DatabaseType
	 * @generated
	 */
	EEnum getDatabaseType();

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
		 * The meta object literal for the '<em><b>Has Activities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__HAS_ACTIVITIES = eINSTANCE.getResource_HasActivities();

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
		 * The meta object literal for the '<em><b>Has Relationship</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__HAS_RELATIONSHIP = eINSTANCE.getResource_HasRelationship();

		/**
		 * The meta object literal for the '<em><b>Filters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__FILTERS = eINSTANCE.getResource_Filters();

		/**
		 * The meta object literal for the '<em><b>Sort</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__SORT = eINSTANCE.getResource_Sort();

		/**
		 * The meta object literal for the '<em><b>Select</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__SELECT = eINSTANCE.getResource_Select();

		/**
		 * The meta object literal for the '<em><b>Pagination</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__PAGINATION = eINSTANCE.getResource_Pagination();

		/**
		 * The meta object literal for the '<em><b>Scopesearch</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__SCOPESEARCH = eINSTANCE.getResource_Scopesearch();

		/**
		 * The meta object literal for the '<em><b>Caching</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__CACHING = eINSTANCE.getResource_Caching();

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
		 * The meta object literal for the '<em><b>Is Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__IS_REQUIRED = eINSTANCE.getProperty_IsRequired();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__MIN = eINSTANCE.getProperty_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__MAX = eINSTANCE.getProperty_Max();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__TYPE = eINSTANCE.getProperty_Type();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__TYPE_NAME = eINSTANCE.getProperty_TypeName();

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
		 * The meta object literal for the '<em><b>Base Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RES_TFUL_SERVICE_PIM__BASE_PATH = eINSTANCE.getRESTfulServicePIM_BasePath();

		/**
		 * The meta object literal for the '<em><b>Has Applications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RES_TFUL_SERVICE_PIM__HAS_APPLICATIONS = eINSTANCE.getRESTfulServicePIM_HasApplications();

		/**
		 * The meta object literal for the '<em><b>Enumerations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RES_TFUL_SERVICE_PIM__ENUMERATIONS = eINSTANCE.getRESTfulServicePIM_Enumerations();

		/**
		 * The meta object literal for the '<em><b>Has Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RES_TFUL_SERVICE_PIM__HAS_RESOURCES = eINSTANCE.getRESTfulServicePIM_HasResources();

		/**
		 * The meta object literal for the '<em><b>Has Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RES_TFUL_SERVICE_PIM__HAS_ROLES = eINSTANCE.getRESTfulServicePIM_HasRoles();

		/**
		 * The meta object literal for the '<em><b>Basictypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RES_TFUL_SERVICE_PIM__BASICTYPES = eINSTANCE.getRESTfulServicePIM_Basictypes();

		/**
		 * The meta object literal for the '{@link ServicePIM.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.impl.RelationshipImpl
		 * @see ServicePIM.impl.ServicePIMPackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__MULTIPLICITY = eINSTANCE.getRelationship_Multiplicity();

		/**
		 * The meta object literal for the '<em><b>From Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__FROM_RESOURCE = eINSTANCE.getRelationship_FromResource();

		/**
		 * The meta object literal for the '<em><b>To Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__TO_RESOURCE = eINSTANCE.getRelationship_ToResource();

		/**
		 * The meta object literal for the '{@link ServicePIM.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.impl.ApplicationImpl
		 * @see ServicePIM.impl.ServicePIMPackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Has Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__HAS_CONFIG = eINSTANCE.getApplication_HasConfig();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__RESOURCES = eINSTANCE.getApplication_Resources();

		/**
		 * The meta object literal for the '<em><b>Globalsearches</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__GLOBALSEARCHES = eINSTANCE.getApplication_Globalsearches();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__ROLES = eINSTANCE.getApplication_Roles();

		/**
		 * The meta object literal for the '<em><b>Deployment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__DEPLOYMENT = eINSTANCE.getApplication_Deployment();

		/**
		 * The meta object literal for the '{@link ServicePIM.impl.ConfigImpl <em>Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.impl.ConfigImpl
		 * @see ServicePIM.impl.ServicePIMPackageImpl#getConfig()
		 * @generated
		 */
		EClass CONFIG = eINSTANCE.getConfig();

		/**
		 * The meta object literal for the '<em><b>Base Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__BASE_NAME = eINSTANCE.getConfig_BaseName();

		/**
		 * The meta object literal for the '<em><b>Application Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__APPLICATION_TYPE = eINSTANCE.getConfig_ApplicationType();

		/**
		 * The meta object literal for the '<em><b>Service Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__SERVICE_PORT = eINSTANCE.getConfig_ServicePort();

		/**
		 * The meta object literal for the '{@link ServicePIM.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.impl.TypeDefinitionImpl
		 * @see ServicePIM.impl.ServicePIMPackageImpl#getTypeDefinition()
		 * @generated
		 */
		EClass TYPE_DEFINITION = eINSTANCE.getTypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DEFINITION__TYPE_NAME = eINSTANCE.getTypeDefinition_TypeName();

		/**
		 * The meta object literal for the '{@link ServicePIM.impl.EnumerationImpl <em>Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.impl.EnumerationImpl
		 * @see ServicePIM.impl.ServicePIMPackageImpl#getEnumeration()
		 * @generated
		 */
		EClass ENUMERATION = eINSTANCE.getEnumeration();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION__LITERALS = eINSTANCE.getEnumeration_Literals();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION__NAME = eINSTANCE.getEnumeration_Name();

		/**
		 * The meta object literal for the '{@link ServicePIM.impl.BasicTypeImpl <em>Basic Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.impl.BasicTypeImpl
		 * @see ServicePIM.impl.ServicePIMPackageImpl#getBasicType()
		 * @generated
		 */
		EClass BASIC_TYPE = eINSTANCE.getBasicType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_TYPE__TYPE = eINSTANCE.getBasicType_Type();

		/**
		 * The meta object literal for the '{@link ServicePIM.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.impl.LiteralImpl
		 * @see ServicePIM.impl.ServicePIMPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__NAME = eINSTANCE.getLiteral_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__VALUE = eINSTANCE.getLiteral_Value();

		/**
		 * The meta object literal for the '{@link ServicePIM.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.impl.ActivityImpl
		 * @see ServicePIM.impl.ServicePIMPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Is Authenticated Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__IS_AUTHENTICATED_REQUIRED = eINSTANCE.getActivity_IsAuthenticatedRequired();

		/**
		 * The meta object literal for the '{@link ServicePIM.impl.CreateImpl <em>Create</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.impl.CreateImpl
		 * @see ServicePIM.impl.ServicePIMPackageImpl#getCreate()
		 * @generated
		 */
		EClass CREATE = eINSTANCE.getCreate();

		/**
		 * The meta object literal for the '{@link ServicePIM.impl.ReadImpl <em>Read</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.impl.ReadImpl
		 * @see ServicePIM.impl.ServicePIMPackageImpl#getRead()
		 * @generated
		 */
		EClass READ = eINSTANCE.getRead();

		/**
		 * The meta object literal for the '{@link ServicePIM.impl.UpdateImpl <em>Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.impl.UpdateImpl
		 * @see ServicePIM.impl.ServicePIMPackageImpl#getUpdate()
		 * @generated
		 */
		EClass UPDATE = eINSTANCE.getUpdate();

		/**
		 * The meta object literal for the '{@link ServicePIM.impl.DeleteImpl <em>Delete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.impl.DeleteImpl
		 * @see ServicePIM.impl.ServicePIMPackageImpl#getDelete()
		 * @generated
		 */
		EClass DELETE = eINSTANCE.getDelete();

		/**
		 * The meta object literal for the '{@link ServicePIM.impl.CustomImpl <em>Custom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.impl.CustomImpl
		 * @see ServicePIM.impl.ServicePIMPackageImpl#getCustom()
		 * @generated
		 */
		EClass CUSTOM = eINSTANCE.getCustom();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM__NAME = eINSTANCE.getCustom_Name();

		/**
		 * The meta object literal for the '{@link ServicePIM.impl.DeploymentImpl <em>Deployment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.impl.DeploymentImpl
		 * @see ServicePIM.impl.ServicePIMPackageImpl#getDeployment()
		 * @generated
		 */
		EClass DEPLOYMENT = eINSTANCE.getDeployment();

		/**
		 * The meta object literal for the '<em><b>Db Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT__DB_TYPE = eINSTANCE.getDeployment_DbType();

		/**
		 * The meta object literal for the '<em><b>Db Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT__DB_USERNAME = eINSTANCE.getDeployment_DbUsername();

		/**
		 * The meta object literal for the '<em><b>Db IP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT__DB_IP = eINSTANCE.getDeployment_DbIP();

		/**
		 * The meta object literal for the '<em><b>Db Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT__DB_PASSWORD = eINSTANCE.getDeployment_DbPassword();

		/**
		 * The meta object literal for the '<em><b>Db Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT__DB_PORT = eINSTANCE.getDeployment_DbPort();

		/**
		 * The meta object literal for the '<em><b>Deployment Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT__DEPLOYMENT_TYPE = eINSTANCE.getDeployment_DeploymentType();

		/**
		 * The meta object literal for the '<em><b>Directory Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT__DIRECTORY_PATH = eINSTANCE.getDeployment_DirectoryPath();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT__NAME = eINSTANCE.getDeployment_Name();

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
		 * The meta object literal for the '{@link ServicePIM.Multiplicity <em>Multiplicity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.Multiplicity
		 * @see ServicePIM.impl.ServicePIMPackageImpl#getMultiplicity()
		 * @generated
		 */
		EEnum MULTIPLICITY = eINSTANCE.getMultiplicity();

		/**
		 * The meta object literal for the '{@link ServicePIM.ApplicationType <em>Application Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.ApplicationType
		 * @see ServicePIM.impl.ServicePIMPackageImpl#getApplicationType()
		 * @generated
		 */
		EEnum APPLICATION_TYPE = eINSTANCE.getApplicationType();

		/**
		 * The meta object literal for the '{@link ServicePIM.PropertyType <em>Property Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.PropertyType
		 * @see ServicePIM.impl.ServicePIMPackageImpl#getPropertyType()
		 * @generated
		 */
		EEnum PROPERTY_TYPE = eINSTANCE.getPropertyType();

		/**
		 * The meta object literal for the '{@link ServicePIM.DeploymentType <em>Deployment Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.DeploymentType
		 * @see ServicePIM.impl.ServicePIMPackageImpl#getDeploymentType()
		 * @generated
		 */
		EEnum DEPLOYMENT_TYPE = eINSTANCE.getDeploymentType();

		/**
		 * The meta object literal for the '{@link ServicePIM.DatabaseType <em>Database Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServicePIM.DatabaseType
		 * @see ServicePIM.impl.ServicePIMPackageImpl#getDatabaseType()
		 * @generated
		 */
		EEnum DATABASE_TYPE = eINSTANCE.getDatabaseType();

	}

} //ServicePIMPackage
