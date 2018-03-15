/**
 */
package ajiML.util;

import ajiML.APIService;
import ajiML.Ability;
import ajiML.AjiMLPackage;
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
 * @see ajiML.AjiMLPackage
 * @generated
 */
public class AjiMLSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AjiMLPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AjiMLSwitch() {
		if (modelPackage == null) {
			modelPackage = AjiMLPackage.eINSTANCE;
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
			case AjiMLPackage.MULTIPLICITY: {
				Multiplicity multiplicity = (Multiplicity)theEObject;
				T result = caseMultiplicity(multiplicity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AjiMLPackage.SYSTEM: {
				ajiML.System system = (ajiML.System)theEObject;
				T result = caseSystem(system);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AjiMLPackage.MICROSERVICE: {
				Microservice microservice = (Microservice)theEObject;
				T result = caseMicroservice(microservice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AjiMLPackage.INFRASTRUCTURE_SERVICE: {
				InfrastructureService infrastructureService = (InfrastructureService)theEObject;
				T result = caseInfrastructureService(infrastructureService);
				if (result == null) result = caseMicroservice(infrastructureService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AjiMLPackage.FUNCTIONAL_SERVICE: {
				FunctionalService functionalService = (FunctionalService)theEObject;
				T result = caseFunctionalService(functionalService);
				if (result == null) result = caseMicroservice(functionalService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AjiMLPackage.DISCOVERY_SERVICE: {
				DiscoveryService discoveryService = (DiscoveryService)theEObject;
				T result = caseDiscoveryService(discoveryService);
				if (result == null) result = caseInfrastructureService(discoveryService);
				if (result == null) result = caseMicroservice(discoveryService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AjiMLPackage.API_SERVICE: {
				APIService apiService = (APIService)theEObject;
				T result = caseAPIService(apiService);
				if (result == null) result = caseInfrastructureService(apiService);
				if (result == null) result = caseMicroservice(apiService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AjiMLPackage.CONFIGURATION_SERVICE: {
				ConfigurationService configurationService = (ConfigurationService)theEObject;
				T result = caseConfigurationService(configurationService);
				if (result == null) result = caseInfrastructureService(configurationService);
				if (result == null) result = caseMicroservice(configurationService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AjiMLPackage.SECURITY_SERVICE: {
				SecurityService securityService = (SecurityService)theEObject;
				T result = caseSecurityService(securityService);
				if (result == null) result = caseInfrastructureService(securityService);
				if (result == null) result = caseMicroservice(securityService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AjiMLPackage.USER_MANAGEMENT_SERVICE: {
				UserManagementService userManagementService = (UserManagementService)theEObject;
				T result = caseUserManagementService(userManagementService);
				if (result == null) result = caseInfrastructureService(userManagementService);
				if (result == null) result = caseMicroservice(userManagementService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AjiMLPackage.SERVICE_INTERFACE: {
				ServiceInterface serviceInterface = (ServiceInterface)theEObject;
				T result = caseServiceInterface(serviceInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AjiMLPackage.DATA_MODEL: {
				DataModel dataModel = (DataModel)theEObject;
				T result = caseDataModel(dataModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AjiMLPackage.ENTITY: {
				Entity entity = (Entity)theEObject;
				T result = caseEntity(entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AjiMLPackage.RELATION: {
				Relation relation = (Relation)theEObject;
				T result = caseRelation(relation);
				if (result == null) result = caseMultiplicity(relation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AjiMLPackage.ABILITY: {
				Ability ability = (Ability)theEObject;
				T result = caseAbility(ability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AjiMLPackage.CREATE: {
				Create create = (Create)theEObject;
				T result = caseCreate(create);
				if (result == null) result = caseAbility(create);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AjiMLPackage.READ: {
				Read read = (Read)theEObject;
				T result = caseRead(read);
				if (result == null) result = caseAbility(read);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AjiMLPackage.MULTI_READ: {
				MultiRead multiRead = (MultiRead)theEObject;
				T result = caseMultiRead(multiRead);
				if (result == null) result = caseAbility(multiRead);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AjiMLPackage.UPDATE: {
				Update update = (Update)theEObject;
				T result = caseUpdate(update);
				if (result == null) result = caseAbility(update);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AjiMLPackage.DELETE: {
				Delete delete = (Delete)theEObject;
				T result = caseDelete(delete);
				if (result == null) result = caseAbility(delete);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AjiMLPackage.CUSTOM: {
				Custom custom = (Custom)theEObject;
				T result = caseCustom(custom);
				if (result == null) result = caseAbility(custom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AjiMLPackage.PRIMITIVE_DATA_TYPE: {
				PrimitiveDataType primitiveDataType = (PrimitiveDataType)theEObject;
				T result = casePrimitiveDataType(primitiveDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AjiMLPackage.INTEGER: {
				ajiML.Integer integer = (ajiML.Integer)theEObject;
				T result = caseInteger(integer);
				if (result == null) result = casePrimitiveDataType(integer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AjiMLPackage.BOOLEAN: {
				ajiML.Boolean boolean_ = (ajiML.Boolean)theEObject;
				T result = caseBoolean(boolean_);
				if (result == null) result = casePrimitiveDataType(boolean_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AjiMLPackage.FLOAT: {
				ajiML.Float float_ = (ajiML.Float)theEObject;
				T result = caseFloat(float_);
				if (result == null) result = casePrimitiveDataType(float_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AjiMLPackage.STRING: {
				ajiML.String string = (ajiML.String)theEObject;
				T result = caseString(string);
				if (result == null) result = casePrimitiveDataType(string);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AjiMLPackage.CHAR: {
				Char char_ = (Char)theEObject;
				T result = caseChar(char_);
				if (result == null) result = casePrimitiveDataType(char_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplicity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplicity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplicity(Multiplicity object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Data Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataModel(DataModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelation(Relation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbility(Ability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreate(Create object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRead(Read object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Read</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Read</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiRead(MultiRead object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdate(Update object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelete(Delete object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustom(Custom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveDataType(PrimitiveDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteger(ajiML.Integer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean(ajiML.Boolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloat(ajiML.Float object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString(ajiML.String object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChar(Char object) {
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

} //AjiMLSwitch
