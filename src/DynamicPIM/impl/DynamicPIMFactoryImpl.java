/**
 */
package DynamicPIM.impl;

import DynamicPIM.Aggregate;
import DynamicPIM.Application;
import DynamicPIM.BasicType;
import DynamicPIM.CollectionResource;
import DynamicPIM.CommandEvent;
import DynamicPIM.CommandOperation;
import DynamicPIM.ComplexType;
import DynamicPIM.Create;
import DynamicPIM.DTO;
import DynamicPIM.DefaultType;
import DynamicPIM.Delete;
import DynamicPIM.DomainEvent;
import DynamicPIM.DomainObjectOperation;
import DynamicPIM.DynamicPIMFactory;
import DynamicPIM.DynamicPIMPackage;
import DynamicPIM.Entity;
import DynamicPIM.Enumeration;
import DynamicPIM.MediaType;
import DynamicPIM.Operation;
import DynamicPIM.Other;
import DynamicPIM.PIMDynamic;
import DynamicPIM.Parameter;
import DynamicPIM.Policy;
import DynamicPIM.PrimitiveType;
import DynamicPIM.ProcessOperation;
import DynamicPIM.Project;
import DynamicPIM.Publish;
import DynamicPIM.QueryOperation;
import DynamicPIM.Read;
import DynamicPIM.Resource;
import DynamicPIM.SingletonResource;
import DynamicPIM.ValueObject;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DynamicPIMFactoryImpl extends EFactoryImpl implements DynamicPIMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DynamicPIMFactory init() {
		try {
			DynamicPIMFactory theDynamicPIMFactory = (DynamicPIMFactory)EPackage.Registry.INSTANCE.getEFactory(DynamicPIMPackage.eNS_URI);
			if (theDynamicPIMFactory != null) {
				return theDynamicPIMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DynamicPIMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicPIMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DynamicPIMPackage.APPLICATION: return createApplication();
			case DynamicPIMPackage.CREATE: return createCreate();
			case DynamicPIMPackage.READ: return createRead();
			case DynamicPIMPackage.OTHER: return createOther();
			case DynamicPIMPackage.DELETE: return createDelete();
			case DynamicPIMPackage.OPERATION: return createOperation();
			case DynamicPIMPackage.SINGLETON_RESOURCE: return createSingletonResource();
			case DynamicPIMPackage.PRIMITIVE_TYPE: return createPrimitiveType();
			case DynamicPIMPackage.PUBLISH: return createPublish();
			case DynamicPIMPackage.COMMAND_EVENT: return createCommandEvent();
			case DynamicPIMPackage.DOMAIN_EVENT: return createDomainEvent();
			case DynamicPIMPackage.DOMAIN_OBJECT_OPERATION: return createDomainObjectOperation();
			case DynamicPIMPackage.POLICY: return createPolicy();
			case DynamicPIMPackage.COMMAND_OPERATION: return createCommandOperation();
			case DynamicPIMPackage.QUERY_OPERATION: return createQueryOperation();
			case DynamicPIMPackage.PROCESS_OPERATION: return createProcessOperation();
			case DynamicPIMPackage.PROCESS: return createProcess();
			case DynamicPIMPackage.PROJECT: return createProject();
			case DynamicPIMPackage.COLLECTION_RESOURCE: return createCollectionResource();
			case DynamicPIMPackage.PARAMETER: return createParameter();
			case DynamicPIMPackage.AGGREGATE: return createAggregate();
			case DynamicPIMPackage.ENTITY: return createEntity();
			case DynamicPIMPackage.VALUE_OBJECT: return createValueObject();
			case DynamicPIMPackage.DTO: return createDTO();
			case DynamicPIMPackage.ENUMERATION: return createEnumeration();
			case DynamicPIMPackage.BASIC_TYPE: return createBasicType();
			case DynamicPIMPackage.COMPLEX_TYPE: return createComplexType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DynamicPIMPackage.MEDIA_TYPE:
				return createMediaTypeFromString(eDataType, initialValue);
			case DynamicPIMPackage.DEFAULT_TYPE:
				return createDefaultTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DynamicPIMPackage.MEDIA_TYPE:
				return convertMediaTypeToString(eDataType, instanceValue);
			case DynamicPIMPackage.DEFAULT_TYPE:
				return convertDefaultTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Application createApplication() {
		ApplicationImpl application = new ApplicationImpl();
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Create createCreate() {
		CreateImpl create = new CreateImpl();
		return create;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Read createRead() {
		ReadImpl read = new ReadImpl();
		return read;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Other createOther() {
		OtherImpl other = new OtherImpl();
		return other;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Delete createDelete() {
		DeleteImpl delete = new DeleteImpl();
		return delete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingletonResource createSingletonResource() {
		SingletonResourceImpl singletonResource = new SingletonResourceImpl();
		return singletonResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveType createPrimitiveType() {
		PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
		return primitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Publish createPublish() {
		PublishImpl publish = new PublishImpl();
		return publish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommandEvent createCommandEvent() {
		CommandEventImpl commandEvent = new CommandEventImpl();
		return commandEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainEvent createDomainEvent() {
		DomainEventImpl domainEvent = new DomainEventImpl();
		return domainEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainObjectOperation createDomainObjectOperation() {
		DomainObjectOperationImpl domainObjectOperation = new DomainObjectOperationImpl();
		return domainObjectOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Policy createPolicy() {
		PolicyImpl policy = new PolicyImpl();
		return policy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommandOperation createCommandOperation() {
		CommandOperationImpl commandOperation = new CommandOperationImpl();
		return commandOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QueryOperation createQueryOperation() {
		QueryOperationImpl queryOperation = new QueryOperationImpl();
		return queryOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessOperation createProcessOperation() {
		ProcessOperationImpl processOperation = new ProcessOperationImpl();
		return processOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DynamicPIM.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CollectionResource createCollectionResource() {
		CollectionResourceImpl collectionResource = new CollectionResourceImpl();
		return collectionResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Aggregate createAggregate() {
		AggregateImpl aggregate = new AggregateImpl();
		return aggregate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueObject createValueObject() {
		ValueObjectImpl valueObject = new ValueObjectImpl();
		return valueObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DTO createDTO() {
		DTOImpl dto = new DTOImpl();
		return dto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration createEnumeration() {
		EnumerationImpl enumeration = new EnumerationImpl();
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicType createBasicType() {
		BasicTypeImpl basicType = new BasicTypeImpl();
		return basicType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComplexType createComplexType() {
		ComplexTypeImpl complexType = new ComplexTypeImpl();
		return complexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaType createMediaTypeFromString(EDataType eDataType, String initialValue) {
		MediaType result = MediaType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMediaTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultType createDefaultTypeFromString(EDataType eDataType, String initialValue) {
		DefaultType result = DefaultType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDefaultTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DynamicPIMPackage getDynamicPIMPackage() {
		return (DynamicPIMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DynamicPIMPackage getPackage() {
		return DynamicPIMPackage.eINSTANCE;
	}

} //DynamicPIMFactoryImpl
