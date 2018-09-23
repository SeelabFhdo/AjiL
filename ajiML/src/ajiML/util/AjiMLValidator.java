/**
 */
package ajiML.util;

import ajiML.APIService;
import ajiML.Ability;
import ajiML.AjiMLPackage;
import ajiML.Char;
import ajiML.ComplexDataType;
import ajiML.ConfigurationService;
import ajiML.Create;
import ajiML.Custom;
import ajiML.DataModel;
import ajiML.DataType;
import ajiML.Date;
import ajiML.Delete;
import ajiML.DiscoveryService;
import ajiML.EMultiplicity;
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

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see ajiML.AjiMLPackage
 * @generated
 */
public class AjiMLValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AjiMLValidator INSTANCE = new AjiMLValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "ajiML";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AjiMLValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return AjiMLPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case AjiMLPackage.MULTIPLICITY:
				return validateMultiplicity((Multiplicity)value, diagnostics, context);
			case AjiMLPackage.SYSTEM:
				return validateSystem((ajiML.System)value, diagnostics, context);
			case AjiMLPackage.MICROSERVICE:
				return validateMicroservice((Microservice)value, diagnostics, context);
			case AjiMLPackage.INFRASTRUCTURE_SERVICE:
				return validateInfrastructureService((InfrastructureService)value, diagnostics, context);
			case AjiMLPackage.FUNCTIONAL_SERVICE:
				return validateFunctionalService((FunctionalService)value, diagnostics, context);
			case AjiMLPackage.DISCOVERY_SERVICE:
				return validateDiscoveryService((DiscoveryService)value, diagnostics, context);
			case AjiMLPackage.API_SERVICE:
				return validateAPIService((APIService)value, diagnostics, context);
			case AjiMLPackage.CONFIGURATION_SERVICE:
				return validateConfigurationService((ConfigurationService)value, diagnostics, context);
			case AjiMLPackage.SECURITY_SERVICE:
				return validateSecurityService((SecurityService)value, diagnostics, context);
			case AjiMLPackage.USER_MANAGEMENT_SERVICE:
				return validateUserManagementService((UserManagementService)value, diagnostics, context);
			case AjiMLPackage.SERVICE_INTERFACE:
				return validateServiceInterface((ServiceInterface)value, diagnostics, context);
			case AjiMLPackage.DATA_MODEL:
				return validateDataModel((DataModel)value, diagnostics, context);
			case AjiMLPackage.ENTITY:
				return validateEntity((Entity)value, diagnostics, context);
			case AjiMLPackage.RELATION:
				return validateRelation((Relation)value, diagnostics, context);
			case AjiMLPackage.ABILITY:
				return validateAbility((Ability)value, diagnostics, context);
			case AjiMLPackage.CREATE:
				return validateCreate((Create)value, diagnostics, context);
			case AjiMLPackage.READ:
				return validateRead((Read)value, diagnostics, context);
			case AjiMLPackage.MULTI_READ:
				return validateMultiRead((MultiRead)value, diagnostics, context);
			case AjiMLPackage.UPDATE:
				return validateUpdate((Update)value, diagnostics, context);
			case AjiMLPackage.DELETE:
				return validateDelete((Delete)value, diagnostics, context);
			case AjiMLPackage.CUSTOM:
				return validateCustom((Custom)value, diagnostics, context);
			case AjiMLPackage.PRIMITIVE_DATA_TYPE:
				return validatePrimitiveDataType((PrimitiveDataType)value, diagnostics, context);
			case AjiMLPackage.INTEGER:
				return validateInteger((ajiML.Integer)value, diagnostics, context);
			case AjiMLPackage.BOOLEAN:
				return validateBoolean((ajiML.Boolean)value, diagnostics, context);
			case AjiMLPackage.FLOAT:
				return validateFloat((ajiML.Float)value, diagnostics, context);
			case AjiMLPackage.STRING:
				return validateString((ajiML.String)value, diagnostics, context);
			case AjiMLPackage.CHAR:
				return validateChar((Char)value, diagnostics, context);
			case AjiMLPackage.COMPLEX_DATA_TYPE:
				return validateComplexDataType((ComplexDataType)value, diagnostics, context);
			case AjiMLPackage.DATA_TYPE:
				return validateDataType((DataType)value, diagnostics, context);
			case AjiMLPackage.DATE:
				return validateDate((Date)value, diagnostics, context);
			case AjiMLPackage.LONG:
				return validateLong((ajiML.Long)value, diagnostics, context);
			case AjiMLPackage.EMULTIPLICITY:
				return validateEMultiplicity((EMultiplicity)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicity(Multiplicity multiplicity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(multiplicity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystem(ajiML.System system, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(system, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMicroservice(Microservice microservice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(microservice, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(microservice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(microservice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(microservice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(microservice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(microservice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(microservice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(microservice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(microservice, diagnostics, context);
		if (result || diagnostics != null) result &= validateMicroservice_uniqueServiceName(microservice, diagnostics, context);
		if (result || diagnostics != null) result &= validateMicroservice_uniqueServicePort(microservice, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the uniqueServiceName constraint of '<em>Microservice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MICROSERVICE__UNIQUE_SERVICE_NAME__EEXPRESSION = "Microservice.allInstances()->forAll(s : Microservice | s <> self implies s.name <> self.name)";

	/**
	 * Validates the uniqueServiceName constraint of '<em>Microservice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMicroservice_uniqueServiceName(Microservice microservice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AjiMLPackage.Literals.MICROSERVICE,
				 microservice,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "uniqueServiceName",
				 MICROSERVICE__UNIQUE_SERVICE_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the uniqueServicePort constraint of '<em>Microservice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MICROSERVICE__UNIQUE_SERVICE_PORT__EEXPRESSION = "Microservice.allInstances()->forAll(p : Microservice | p <> self implies p.port <> self.port)";

	/**
	 * Validates the uniqueServicePort constraint of '<em>Microservice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMicroservice_uniqueServicePort(Microservice microservice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AjiMLPackage.Literals.MICROSERVICE,
				 microservice,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "uniqueServicePort",
				 MICROSERVICE__UNIQUE_SERVICE_PORT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfrastructureService(InfrastructureService infrastructureService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(infrastructureService, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(infrastructureService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(infrastructureService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(infrastructureService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(infrastructureService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(infrastructureService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(infrastructureService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(infrastructureService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(infrastructureService, diagnostics, context);
		if (result || diagnostics != null) result &= validateMicroservice_uniqueServiceName(infrastructureService, diagnostics, context);
		if (result || diagnostics != null) result &= validateMicroservice_uniqueServicePort(infrastructureService, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalService(FunctionalService functionalService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(functionalService, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(functionalService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(functionalService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(functionalService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(functionalService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(functionalService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(functionalService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(functionalService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(functionalService, diagnostics, context);
		if (result || diagnostics != null) result &= validateMicroservice_uniqueServiceName(functionalService, diagnostics, context);
		if (result || diagnostics != null) result &= validateMicroservice_uniqueServicePort(functionalService, diagnostics, context);
		if (result || diagnostics != null) result &= validateFunctionalService_noSelfDependency(functionalService, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the noSelfDependency constraint of '<em>Functional Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FUNCTIONAL_SERVICE__NO_SELF_DEPENDENCY__EEXPRESSION = "self.serviceDependencies->forAll(i : ServiceInterface | self.providedInterfaces->excludes(i))";

	/**
	 * Validates the noSelfDependency constraint of '<em>Functional Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalService_noSelfDependency(FunctionalService functionalService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AjiMLPackage.Literals.FUNCTIONAL_SERVICE,
				 functionalService,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "noSelfDependency",
				 FUNCTIONAL_SERVICE__NO_SELF_DEPENDENCY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscoveryService(DiscoveryService discoveryService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(discoveryService, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(discoveryService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(discoveryService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(discoveryService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(discoveryService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(discoveryService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(discoveryService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(discoveryService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(discoveryService, diagnostics, context);
		if (result || diagnostics != null) result &= validateMicroservice_uniqueServiceName(discoveryService, diagnostics, context);
		if (result || diagnostics != null) result &= validateMicroservice_uniqueServicePort(discoveryService, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAPIService(APIService apiService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(apiService, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(apiService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(apiService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(apiService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(apiService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(apiService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(apiService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(apiService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(apiService, diagnostics, context);
		if (result || diagnostics != null) result &= validateMicroservice_uniqueServiceName(apiService, diagnostics, context);
		if (result || diagnostics != null) result &= validateMicroservice_uniqueServicePort(apiService, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfigurationService(ConfigurationService configurationService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(configurationService, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(configurationService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(configurationService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(configurationService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(configurationService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(configurationService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(configurationService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(configurationService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(configurationService, diagnostics, context);
		if (result || diagnostics != null) result &= validateMicroservice_uniqueServiceName(configurationService, diagnostics, context);
		if (result || diagnostics != null) result &= validateMicroservice_uniqueServicePort(configurationService, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityService(SecurityService securityService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(securityService, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(securityService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(securityService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(securityService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(securityService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(securityService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(securityService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(securityService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(securityService, diagnostics, context);
		if (result || diagnostics != null) result &= validateMicroservice_uniqueServiceName(securityService, diagnostics, context);
		if (result || diagnostics != null) result &= validateMicroservice_uniqueServicePort(securityService, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserManagementService(UserManagementService userManagementService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(userManagementService, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(userManagementService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(userManagementService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(userManagementService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(userManagementService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(userManagementService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(userManagementService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(userManagementService, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(userManagementService, diagnostics, context);
		if (result || diagnostics != null) result &= validateMicroservice_uniqueServiceName(userManagementService, diagnostics, context);
		if (result || diagnostics != null) result &= validateMicroservice_uniqueServicePort(userManagementService, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceInterface(ServiceInterface serviceInterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(serviceInterface, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(serviceInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(serviceInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(serviceInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(serviceInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(serviceInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(serviceInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(serviceInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(serviceInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceInterface_uniqueInterfaceName(serviceInterface, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the uniqueInterfaceName constraint of '<em>Service Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE_INTERFACE__UNIQUE_INTERFACE_NAME__EEXPRESSION = "ServiceInterface.allInstances()->forAll(s : ServiceInterface | s <> self implies s.name <> self.name)";

	/**
	 * Validates the uniqueInterfaceName constraint of '<em>Service Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceInterface_uniqueInterfaceName(ServiceInterface serviceInterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AjiMLPackage.Literals.SERVICE_INTERFACE,
				 serviceInterface,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "uniqueInterfaceName",
				 SERVICE_INTERFACE__UNIQUE_INTERFACE_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataModel(DataModel dataModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataModel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataModel_uniqueDomainName(dataModel, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the uniqueDomainName constraint of '<em>Data Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA_MODEL__UNIQUE_DOMAIN_NAME__EEXPRESSION = "DataModel.allInstances()->forAll(d : DataModel | d <> self implies d.name <> self.name)";

	/**
	 * Validates the uniqueDomainName constraint of '<em>Data Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataModel_uniqueDomainName(DataModel dataModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AjiMLPackage.Literals.DATA_MODEL,
				 dataModel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "uniqueDomainName",
				 DATA_MODEL__UNIQUE_DOMAIN_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(entity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_sealedDomainInheritance(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_uniqueEntityName(entity, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the sealedDomainInheritance constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTITY__SEALED_DOMAIN_INHERITANCE__EEXPRESSION = "if self.parent.oclIsUndefined() then true else if self.parent.domainModel = self.domainModel then true else false \n" +
		"endif endif";

	/**
	 * Validates the sealedDomainInheritance constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_sealedDomainInheritance(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AjiMLPackage.Literals.ENTITY,
				 entity,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "sealedDomainInheritance",
				 ENTITY__SEALED_DOMAIN_INHERITANCE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the uniqueEntityName constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTITY__UNIQUE_ENTITY_NAME__EEXPRESSION = "Entity.allInstances()->forAll(ent : Entity | ent <> self implies ent.name <> self.name)";

	/**
	 * Validates the uniqueEntityName constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_uniqueEntityName(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AjiMLPackage.Literals.ENTITY,
				 entity,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "uniqueEntityName",
				 ENTITY__UNIQUE_ENTITY_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelation(Relation relation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(relation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(relation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(relation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(relation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(relation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(relation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(relation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(relation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(relation, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelation_sealedDomain(relation, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelation_noSelfRelation(relation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the sealedDomain constraint of '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RELATION__SEALED_DOMAIN__EEXPRESSION = "self.source.domainModel = self.target.domainModel";

	/**
	 * Validates the sealedDomain constraint of '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelation_sealedDomain(Relation relation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AjiMLPackage.Literals.RELATION,
				 relation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "sealedDomain",
				 RELATION__SEALED_DOMAIN__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the noSelfRelation constraint of '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RELATION__NO_SELF_RELATION__EEXPRESSION = "self.source <> self.target";

	/**
	 * Validates the noSelfRelation constraint of '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelation_noSelfRelation(Relation relation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AjiMLPackage.Literals.RELATION,
				 relation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "noSelfRelation",
				 RELATION__NO_SELF_RELATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbility(Ability ability, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ability, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ability, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ability, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbility_uniqueCapabilityName(ability, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the uniqueCapabilityName constraint of '<em>Ability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ABILITY__UNIQUE_CAPABILITY_NAME__EEXPRESSION = "Ability.allInstances()->forAll(a : Ability | a <> self implies a.name <> self.name)";

	/**
	 * Validates the uniqueCapabilityName constraint of '<em>Ability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbility_uniqueCapabilityName(Ability ability, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(AjiMLPackage.Literals.ABILITY,
				 ability,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "uniqueCapabilityName",
				 ABILITY__UNIQUE_CAPABILITY_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreate(Create create, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(create, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(create, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(create, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(create, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(create, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(create, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(create, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(create, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(create, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbility_uniqueCapabilityName(create, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRead(Read read, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(read, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(read, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(read, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(read, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(read, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(read, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(read, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(read, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(read, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbility_uniqueCapabilityName(read, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiRead(MultiRead multiRead, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(multiRead, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(multiRead, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(multiRead, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(multiRead, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(multiRead, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(multiRead, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(multiRead, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(multiRead, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(multiRead, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbility_uniqueCapabilityName(multiRead, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpdate(Update update, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(update, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(update, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(update, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(update, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(update, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(update, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(update, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(update, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(update, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbility_uniqueCapabilityName(update, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelete(Delete delete, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(delete, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(delete, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(delete, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(delete, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(delete, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(delete, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(delete, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(delete, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(delete, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbility_uniqueCapabilityName(delete, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustom(Custom custom, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(custom, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(custom, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(custom, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(custom, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(custom, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(custom, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(custom, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(custom, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(custom, diagnostics, context);
		if (result || diagnostics != null) result &= validateAbility_uniqueCapabilityName(custom, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimitiveDataType(PrimitiveDataType primitiveDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(primitiveDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteger(ajiML.Integer integer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolean(ajiML.Boolean boolean_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolean_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloat(ajiML.Float float_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(float_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateString(ajiML.String string, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(string, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChar(Char char_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(char_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexDataType(ComplexDataType complexDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(complexDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDate(Date date, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(date, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLong(ajiML.Long long_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(long_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMultiplicity(EMultiplicity eMultiplicity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //AjiMLValidator
