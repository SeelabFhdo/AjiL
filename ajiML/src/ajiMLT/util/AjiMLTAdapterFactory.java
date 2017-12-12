/**
 */
package ajiMLT.util;

import ajiML.APIService;
import ajiML.ConfigurationService;
import ajiML.DiscoveryService;
import ajiML.FunctionalService;
import ajiML.InfrastructureService;
import ajiML.Microservice;
import ajiML.SecurityService;
import ajiML.ServiceInterface;
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
