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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ajiMLT.AjiMLTPackage
 * @generated
 */
public class AjiMLTSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AjiMLTPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AjiMLTSwitch() {
		if (modelPackage == null) {
			modelPackage = AjiMLTPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AjiMLTPackage.FUNCTIONAL_SERVICE_T: {
				FunctionalServiceT functionalServiceT = (FunctionalServiceT)theEObject;
				T result = caseFunctionalServiceT(functionalServiceT);
				if (result == null) result = caseFunctionalService(functionalServiceT);
				if (result == null) result = caseMicroservice(functionalServiceT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AjiMLTPackage.DISCOVERY_SERVICE_T: {
				DiscoveryServiceT discoveryServiceT = (DiscoveryServiceT)theEObject;
				T result = caseDiscoveryServiceT(discoveryServiceT);
				if (result == null) result = caseDiscoveryService(discoveryServiceT);
				if (result == null) result = caseInfrastructureService(discoveryServiceT);
				if (result == null) result = caseMicroservice(discoveryServiceT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AjiMLTPackage.API_SERVICE_T: {
				APIServiceT apiServiceT = (APIServiceT)theEObject;
				T result = caseAPIServiceT(apiServiceT);
				if (result == null) result = caseAPIService(apiServiceT);
				if (result == null) result = caseInfrastructureService(apiServiceT);
				if (result == null) result = caseMicroservice(apiServiceT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AjiMLTPackage.CONFIGURATION_SERVICE_T: {
				ConfigurationServiceT configurationServiceT = (ConfigurationServiceT)theEObject;
				T result = caseConfigurationServiceT(configurationServiceT);
				if (result == null) result = caseConfigurationService(configurationServiceT);
				if (result == null) result = caseInfrastructureService(configurationServiceT);
				if (result == null) result = caseMicroservice(configurationServiceT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AjiMLTPackage.SECURITY_SERVICE_T: {
				SecurityServiceT securityServiceT = (SecurityServiceT)theEObject;
				T result = caseSecurityServiceT(securityServiceT);
				if (result == null) result = caseSecurityService(securityServiceT);
				if (result == null) result = caseInfrastructureService(securityServiceT);
				if (result == null) result = caseMicroservice(securityServiceT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AjiMLTPackage.SERVICE_INTERFACE_T: {
				ServiceInterfaceT serviceInterfaceT = (ServiceInterfaceT)theEObject;
				T result = caseServiceInterfaceT(serviceInterfaceT);
				if (result == null) result = caseServiceInterface(serviceInterfaceT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AjiMLTPackage.USER_MANAGEMENT_SERVICE_T: {
				UserManagementServiceT userManagementServiceT = (UserManagementServiceT)theEObject;
				T result = caseUserManagementServiceT(userManagementServiceT);
				if (result == null) result = caseUserManagementService(userManagementServiceT);
				if (result == null) result = caseInfrastructureService(userManagementServiceT);
				if (result == null) result = caseMicroservice(userManagementServiceT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AjiMLTPackage.SYSTEM_T: {
				SystemT systemT = (SystemT)theEObject;
				T result = caseSystemT(systemT);
				if (result == null) result = caseSystem(systemT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Service T</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Service T</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalServiceT(FunctionalServiceT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discovery Service T</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discovery Service T</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscoveryServiceT(DiscoveryServiceT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>API Service T</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>API Service T</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPIServiceT(APIServiceT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration Service T</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration Service T</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationServiceT(ConfigurationServiceT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Service T</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Service T</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityServiceT(SecurityServiceT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Interface T</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Interface T</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceInterfaceT(ServiceInterfaceT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Management Service T</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Management Service T</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserManagementServiceT(UserManagementServiceT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System T</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System T</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemT(SystemT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Microservice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Microservice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMicroservice(Microservice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalService(FunctionalService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Infrastructure Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Infrastructure Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfrastructureService(InfrastructureService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discovery Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discovery Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscoveryService(DiscoveryService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>API Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>API Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPIService(APIService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationService(ConfigurationService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityService(SecurityService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceInterface(ServiceInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Management Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Management Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserManagementService(UserManagementService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystem(ajiML.System object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AjiMLTSwitch
