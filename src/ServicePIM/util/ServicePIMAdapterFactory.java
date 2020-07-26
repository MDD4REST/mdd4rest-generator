/**
 */
package ServicePIM.util;

import ServicePIM.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ServicePIM.ServicePIMPackage
 * @generated
 */
public class ServicePIMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ServicePIMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicePIMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ServicePIMPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServicePIMSwitch<Adapter> modelSwitch =
		new ServicePIMSwitch<Adapter>() {
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseCRUDActivity(CRUDActivity object) {
				return createCRUDActivityAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseInputRepresentation(InputRepresentation object) {
				return createInputRepresentationAdapter();
			}
			@Override
			public Adapter caseOutputRepresentation(OutputRepresentation object) {
				return createOutputRepresentationAdapter();
			}
			@Override
			public Adapter caseRESTfulServicePIM(RESTfulServicePIM object) {
				return createRESTfulServicePIMAdapter();
			}
			@Override
			public Adapter caseRelationship(Relationship object) {
				return createRelationshipAdapter();
			}
			@Override
			public Adapter caseApplication(Application object) {
				return createApplicationAdapter();
			}
			@Override
			public Adapter caseConfig(Config object) {
				return createConfigAdapter();
			}
			@Override
			public Adapter caseTypeDefinition(TypeDefinition object) {
				return createTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseEnumeration(Enumeration object) {
				return createEnumerationAdapter();
			}
			@Override
			public Adapter caseBasicType(BasicType object) {
				return createBasicTypeAdapter();
			}
			@Override
			public Adapter caseLiteral(Literal object) {
				return createLiteralAdapter();
			}
			@Override
			public Adapter caseActivity(Activity object) {
				return createActivityAdapter();
			}
			@Override
			public Adapter caseCreate(Create object) {
				return createCreateAdapter();
			}
			@Override
			public Adapter caseRead(Read object) {
				return createReadAdapter();
			}
			@Override
			public Adapter caseUpdate(Update object) {
				return createUpdateAdapter();
			}
			@Override
			public Adapter caseDelete(Delete object) {
				return createDeleteAdapter();
			}
			@Override
			public Adapter caseCustom(Custom object) {
				return createCustomAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ServicePIM.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePIM.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePIM.CRUDActivity <em>CRUD Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePIM.CRUDActivity
	 * @generated
	 */
	public Adapter createCRUDActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePIM.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePIM.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePIM.InputRepresentation <em>Input Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePIM.InputRepresentation
	 * @generated
	 */
	public Adapter createInputRepresentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePIM.OutputRepresentation <em>Output Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePIM.OutputRepresentation
	 * @generated
	 */
	public Adapter createOutputRepresentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePIM.RESTfulServicePIM <em>RES Tful Service PIM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePIM.RESTfulServicePIM
	 * @generated
	 */
	public Adapter createRESTfulServicePIMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePIM.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePIM.Relationship
	 * @generated
	 */
	public Adapter createRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePIM.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePIM.Application
	 * @generated
	 */
	public Adapter createApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePIM.Config <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePIM.Config
	 * @generated
	 */
	public Adapter createConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePIM.TypeDefinition <em>Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePIM.TypeDefinition
	 * @generated
	 */
	public Adapter createTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePIM.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePIM.Enumeration
	 * @generated
	 */
	public Adapter createEnumerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePIM.BasicType <em>Basic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePIM.BasicType
	 * @generated
	 */
	public Adapter createBasicTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePIM.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePIM.Literal
	 * @generated
	 */
	public Adapter createLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePIM.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePIM.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePIM.Create <em>Create</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePIM.Create
	 * @generated
	 */
	public Adapter createCreateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePIM.Read <em>Read</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePIM.Read
	 * @generated
	 */
	public Adapter createReadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePIM.Update <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePIM.Update
	 * @generated
	 */
	public Adapter createUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePIM.Delete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePIM.Delete
	 * @generated
	 */
	public Adapter createDeleteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ServicePIM.Custom <em>Custom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ServicePIM.Custom
	 * @generated
	 */
	public Adapter createCustomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ServicePIMAdapterFactory
