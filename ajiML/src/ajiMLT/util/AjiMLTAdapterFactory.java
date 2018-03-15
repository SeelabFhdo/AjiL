/**
 */
package ajiMLT.util;

import ajiML.APIService;
import ajiML.Ability;
import ajiML.Char;
import ajiML.ConfigurationService;
import ajiML.Create;
import ajiML.Custom;
import ajiML.DataModel;
import ajiML.Delete;
import ajiML.DiscoveryService;
import ajiML.Entity;
import ajiML.FunctionalService;
import ajiML.InfrastructureService;
import ajiML.Microservice;
import ajiML.MultiRead;
import ajiML.Multiplicity;
import ajiML.PrimitiveDataType;
import ajiML.Read;
import ajiML.Relation;
import ajiML.SecurityService;
import ajiML.ServiceInterface;
import ajiML.Update;
import ajiML.UserManagementService;

import ajiMLT.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ajiMLT.AjiMLTPackage
 * @generated
 */
public class AjiMLTAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AjiMLTPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AjiMLTAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AjiMLTPackage.eINSTANCE;
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
	protected AjiMLTSwitch<Adapter> modelSwitch =
		new AjiMLTSwitch<Adapter>() {
			@Override
			public Adapter caseFunctionalServiceT(FunctionalServiceT object) {
				return createFunctionalServiceTAdapter();
			}
			@Override
			public Adapter caseDiscoveryServiceT(DiscoveryServiceT object) {
				return createDiscoveryServiceTAdapter();
			}
			@Override
			public Adapter caseAPIServiceT(APIServiceT object) {
				return createAPIServiceTAdapter();
			}
			@Override
			public Adapter caseConfigurationServiceT(ConfigurationServiceT object) {
				return createConfigurationServiceTAdapter();
			}
			@Override
			public Adapter caseSecurityServiceT(SecurityServiceT object) {
				return createSecurityServiceTAdapter();
			}
			@Override
			public Adapter caseServiceInterfaceT(ServiceInterfaceT object) {
				return createServiceInterfaceTAdapter();
			}
			@Override
			public Adapter caseUserManagementServiceT(UserManagementServiceT object) {
				return createUserManagementServiceTAdapter();
			}
			@Override
			public Adapter caseSystemT(SystemT object) {
				return createSystemTAdapter();
			}
			@Override
			public Adapter caseDataModelT(DataModelT object) {
				return createDataModelTAdapter();
			}
			@Override
			public Adapter caseEntityT(EntityT object) {
				return createEntityTAdapter();
			}
			@Override
			public Adapter caseRelationT(RelationT object) {
				return createRelationTAdapter();
			}
			@Override
			public Adapter caseCreateT(CreateT object) {
				return createCreateTAdapter();
			}
			@Override
			public Adapter caseReadT(ReadT object) {
				return createReadTAdapter();
			}
			@Override
			public Adapter caseUpdateT(UpdateT object) {
				return createUpdateTAdapter();
			}
			@Override
			public Adapter caseDeleteT(DeleteT object) {
				return createDeleteTAdapter();
			}
			@Override
			public Adapter caseMultiReadT(MultiReadT object) {
				return createMultiReadTAdapter();
			}
			@Override
			public Adapter caseCustomT(CustomT object) {
				return createCustomTAdapter();
			}
			@Override
			public Adapter caseIntegerT(IntegerT object) {
				return createIntegerTAdapter();
			}
			@Override
			public Adapter caseBooleanT(BooleanT object) {
				return createBooleanTAdapter();
			}
			@Override
			public Adapter caseFloatT(FloatT object) {
				return createFloatTAdapter();
			}
			@Override
			public Adapter caseStringT(StringT object) {
				return createStringTAdapter();
			}
			@Override
			public Adapter caseCharT(CharT object) {
				return createCharTAdapter();
			}
			@Override
			public Adapter caseMicroservice(Microservice object) {
				return createMicroserviceAdapter();
			}
			@Override
			public Adapter caseFunctionalService(FunctionalService object) {
				return createFunctionalServiceAdapter();
			}
			@Override
			public Adapter caseInfrastructureService(InfrastructureService object) {
				return createInfrastructureServiceAdapter();
			}
			@Override
			public Adapter caseDiscoveryService(DiscoveryService object) {
				return createDiscoveryServiceAdapter();
			}
			@Override
			public Adapter caseAPIService(APIService object) {
				return createAPIServiceAdapter();
			}
			@Override
			public Adapter caseConfigurationService(ConfigurationService object) {
				return createConfigurationServiceAdapter();
			}
			@Override
			public Adapter caseSecurityService(SecurityService object) {
				return createSecurityServiceAdapter();
			}
			@Override
			public Adapter caseServiceInterface(ServiceInterface object) {
				return createServiceInterfaceAdapter();
			}
			@Override
			public Adapter caseUserManagementService(UserManagementService object) {
				return createUserManagementServiceAdapter();
			}
			@Override
			public Adapter caseSystem(ajiML.System object) {
				return createSystemAdapter();
			}
			@Override
			public Adapter caseDataModel(DataModel object) {
				return createDataModelAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseMultiplicity(Multiplicity object) {
				return createMultiplicityAdapter();
			}
			@Override
			public Adapter caseRelation(Relation object) {
				return createRelationAdapter();
			}
			@Override
			public Adapter caseAbility(Ability object) {
				return createAbilityAdapter();
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
			public Adapter caseMultiRead(MultiRead object) {
				return createMultiReadAdapter();
			}
			@Override
			public Adapter caseCustom(Custom object) {
				return createCustomAdapter();
			}
			@Override
			public Adapter casePrimitiveDataType(PrimitiveDataType object) {
				return createPrimitiveDataTypeAdapter();
			}
			@Override
			public Adapter caseInteger(ajiML.Integer object) {
				return createIntegerAdapter();
			}
			@Override
			public Adapter caseBoolean(ajiML.Boolean object) {
				return createBooleanAdapter();
			}
			@Override
			public Adapter caseFloat(ajiML.Float object) {
				return createFloatAdapter();
			}
			@Override
			public Adapter caseString(ajiML.String object) {
				return createStringAdapter();
			}
			@Override
			public Adapter caseChar(Char object) {
				return createCharAdapter();
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
	 * Creates a new adapter for an object of class '{@link ajiMLT.FunctionalServiceT <em>Functional Service T</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ajiMLT.FunctionalServiceT
	 * @generated
	 */
	public Adapter createFunctionalServiceTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ajiMLT.DiscoveryServiceT <em>Discovery Service T</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ajiMLT.DiscoveryServiceT
	 * @generated
	 */
	public Adapter createDiscoveryServiceTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ajiMLT.APIServiceT <em>API Service T</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ajiMLT.APIServiceT
	 * @generated
	 */
	public Adapter createAPIServiceTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ajiMLT.ConfigurationServiceT <em>Configuration Service T</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ajiMLT.ConfigurationServiceT
	 * @generated
	 */
	public Adapter createConfigurationServiceTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ajiMLT.SecurityServiceT <em>Security Service T</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ajiMLT.SecurityServiceT
	 * @generated
	 */
	public Adapter createSecurityServiceTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ajiMLT.ServiceInterfaceT <em>Service Interface T</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ajiMLT.ServiceInterfaceT
	 * @generated
	 */
	public Adapter createServiceInterfaceTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ajiMLT.UserManagementServiceT <em>User Management Service T</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ajiMLT.UserManagementServiceT
	 * @generated
	 */
	public Adapter createUserManagementServiceTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ajiMLT.SystemT <em>System T</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ajiMLT.SystemT
	 * @generated
	 */
	public Adapter createSystemTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ajiMLT.DataModelT <em>Data Model T</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ajiMLT.DataModelT
	 * @generated
	 */
	public Adapter createDataModelTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ajiMLT.EntityT <em>Entity T</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ajiMLT.EntityT
	 * @generated
	 */
	public Adapter createEntityTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ajiMLT.RelationT <em>Relation T</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ajiMLT.RelationT
	 * @generated
	 */
	public Adapter createRelationTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ajiMLT.CreateT <em>Create T</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ajiMLT.CreateT
	 * @generated
	 */
	public Adapter createCreateTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ajiMLT.ReadT <em>Read T</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ajiMLT.ReadT
	 * @generated
	 */
	public Adapter createReadTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ajiMLT.UpdateT <em>Update T</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ajiMLT.UpdateT
	 * @generated
	 */
	public Adapter createUpdateTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ajiMLT.DeleteT <em>Delete T</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ajiMLT.DeleteT
	 * @generated
	 */
	public Adapter createDeleteTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ajiMLT.MultiReadT <em>Multi Read T</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ajiMLT.MultiReadT
	 * @generated
	 */
	public Adapter createMultiReadTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ajiMLT.CustomT <em>Custom T</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ajiMLT.CustomT
	 * @generated
	 */
	public Adapter createCustomTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ajiMLT.IntegerT <em>Integer T</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ajiMLT.IntegerT
	 * @generated
	 */
	public Adapter createIntegerTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ajiMLT.BooleanT <em>Boolean T</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ajiMLT.BooleanT
	 * @generated
	 */
	public Adapter createBooleanTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ajiMLT.FloatT <em>Float T</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ajiMLT.FloatT
	 * @generated
	 */
	public Adapter createFloatTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ajiMLT.StringT <em>String T</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ajiMLT.StringT
	 * @generated
	 */
	public Adapter createStringTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ajiMLT.CharT <em>Char T</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ajiMLT.CharT
	 * @generated
	 */
	public Adapter createCharTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ajiML.Microservice <em>Microservice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ajiML.Microservice
	 * @generated
	 */
	public Adapter createMicroserviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ajiML.FunctionalService <em>Functional Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ajiML.FunctionalService
	 * @generated
	 */
	public Adapter createFunctionalServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ajiML.InfrastructureService <em>Infrastructure Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ajiML.InfrastructureService
	 * @generated
	 */
	public Adapter createInfrastructureServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ajiML.DiscoveryService <em>Discovery Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ajiML.DiscoveryService
	 * @generated
	 */
	public Adapter createDiscoveryServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ajiML.APIService <em>API Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ajiML.APIService
	 * @generated
	 */
	public Adapter createAPIServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ajiML.ConfigurationService <em>Configuration Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ajiML.ConfigurationService
	 * @generated
	 */
	public Adapter createConfigurationServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ajiML.SecurityService <em>Security Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ajiML.SecurityService
	 * @generated
	 */
	public Adapter createSecurityServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ajiML.ServiceInterface <em>Service Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ajiML.ServiceInterface
	 * @generated
	 */
	public Adapter createServiceInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ajiML.UserManagementService <em>User Management Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ajiML.UserManagementService
	 * @generated
	 */
	public Adapter createUserManagementServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ajiML.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ajiML.System
	 * @generated
	 */
	public Adapter createSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ajiML.DataModel <em>Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ajiML.DataModel
	 * @generated
	 */
	public Adapter createDataModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ajiML.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ajiML.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ajiML.Multiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ajiML.Multiplicity
	 * @generated
	 */
	public Adapter createMultiplicityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ajiML.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ajiML.Relation
	 * @generated
	 */
	public Adapter createRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ajiML.Ability <em>Ability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ajiML.Ability
	 * @generated
	 */
	public Adapter createAbilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ajiML.Create <em>Create</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ajiML.Create
	 * @generated
	 */
	public Adapter createCreateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ajiML.Read <em>Read</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ajiML.Read
	 * @generated
	 */
	public Adapter createReadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ajiML.Update <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ajiML.Update
	 * @generated
	 */
	public Adapter createUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ajiML.Delete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ajiML.Delete
	 * @generated
	 */
	public Adapter createDeleteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ajiML.MultiRead <em>Multi Read</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ajiML.MultiRead
	 * @generated
	 */
	public Adapter createMultiReadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ajiML.Custom <em>Custom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ajiML.Custom
	 * @generated
	 */
	public Adapter createCustomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ajiML.PrimitiveDataType <em>Primitive Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ajiML.PrimitiveDataType
	 * @generated
	 */
	public Adapter createPrimitiveDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ajiML.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ajiML.Integer
	 * @generated
	 */
	public Adapter createIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ajiML.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ajiML.Boolean
	 * @generated
	 */
	public Adapter createBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ajiML.Float <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ajiML.Float
	 * @generated
	 */
	public Adapter createFloatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ajiML.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ajiML.String
	 * @generated
	 */
	public Adapter createStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ajiML.Char <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ajiML.Char
	 * @generated
	 */
	public Adapter createCharAdapter() {
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

} //AjiMLTAdapterFactory
