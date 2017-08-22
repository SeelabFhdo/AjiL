/**
 */
package ajil;

import java.lang.String;

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
 * @see ajil.AjilFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface AjilPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ajil";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ajil";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ajil";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AjilPackage eINSTANCE = ajil.impl.AjilPackageImpl.init();

	/**
	 * The meta object id for the '{@link ajil.impl.MultiplicityImpl <em>Multiplicity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajil.impl.MultiplicityImpl
	 * @see ajil.impl.AjilPackageImpl#getMultiplicity()
	 * @generated
	 */
	int MULTIPLICITY = 0;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY__MULTIPLICITY = 0;

	/**
	 * The number of structural features of the '<em>Multiplicity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Multiplicity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ajil.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajil.impl.SystemImpl
	 * @see ajil.impl.AjilPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SERVICES = 1;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ajil.impl.MicroserviceImpl <em>Microservice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajil.impl.MicroserviceImpl
	 * @see ajil.impl.AjilPackageImpl#getMicroservice()
	 * @generated
	 */
	int MICROSERVICE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__PORT = 1;

	/**
	 * The feature id for the '<em><b>Load Balanced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__LOAD_BALANCED = 2;

	/**
	 * The feature id for the '<em><b>Circuit Breaker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__CIRCUIT_BREAKER = 3;

	/**
	 * The number of structural features of the '<em>Microservice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Microservice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ajil.impl.InfrastructureServiceImpl <em>Infrastructure Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajil.impl.InfrastructureServiceImpl
	 * @see ajil.impl.AjilPackageImpl#getInfrastructureService()
	 * @generated
	 */
	int INFRASTRUCTURE_SERVICE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_SERVICE__NAME = MICROSERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_SERVICE__PORT = MICROSERVICE__PORT;

	/**
	 * The feature id for the '<em><b>Load Balanced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_SERVICE__LOAD_BALANCED = MICROSERVICE__LOAD_BALANCED;

	/**
	 * The feature id for the '<em><b>Circuit Breaker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_SERVICE__CIRCUIT_BREAKER = MICROSERVICE__CIRCUIT_BREAKER;

	/**
	 * The number of structural features of the '<em>Infrastructure Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_SERVICE_FEATURE_COUNT = MICROSERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Infrastructure Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_SERVICE_OPERATION_COUNT = MICROSERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ajil.impl.FunctionalServiceImpl <em>Functional Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajil.impl.FunctionalServiceImpl
	 * @see ajil.impl.AjilPackageImpl#getFunctionalService()
	 * @generated
	 */
	int FUNCTIONAL_SERVICE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_SERVICE__NAME = MICROSERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_SERVICE__PORT = MICROSERVICE__PORT;

	/**
	 * The feature id for the '<em><b>Load Balanced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_SERVICE__LOAD_BALANCED = MICROSERVICE__LOAD_BALANCED;

	/**
	 * The feature id for the '<em><b>Circuit Breaker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_SERVICE__CIRCUIT_BREAKER = MICROSERVICE__CIRCUIT_BREAKER;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_SERVICE__DOMAIN = MICROSERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provided Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_SERVICE__PROVIDED_INTERFACES = MICROSERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Service Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_SERVICE__SERVICE_DEPENDENCIES = MICROSERVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Discovered By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_SERVICE__DISCOVERED_BY = MICROSERVICE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Configured By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_SERVICE__CONFIGURED_BY = MICROSERVICE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Functional Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_SERVICE_FEATURE_COUNT = MICROSERVICE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Functional Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_SERVICE_OPERATION_COUNT = MICROSERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ajil.impl.DiscoveryServiceImpl <em>Discovery Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajil.impl.DiscoveryServiceImpl
	 * @see ajil.impl.AjilPackageImpl#getDiscoveryService()
	 * @generated
	 */
	int DISCOVERY_SERVICE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_SERVICE__NAME = INFRASTRUCTURE_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_SERVICE__PORT = INFRASTRUCTURE_SERVICE__PORT;

	/**
	 * The feature id for the '<em><b>Load Balanced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_SERVICE__LOAD_BALANCED = INFRASTRUCTURE_SERVICE__LOAD_BALANCED;

	/**
	 * The feature id for the '<em><b>Circuit Breaker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_SERVICE__CIRCUIT_BREAKER = INFRASTRUCTURE_SERVICE__CIRCUIT_BREAKER;

	/**
	 * The feature id for the '<em><b>Known Functional Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_SERVICE__KNOWN_FUNCTIONAL_SERVICES = INFRASTRUCTURE_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Known Api Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_SERVICE__KNOWN_API_SERVICES = INFRASTRUCTURE_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Known Configuration Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_SERVICE__KNOWN_CONFIGURATION_SERVICES = INFRASTRUCTURE_SERVICE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Discovery Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_SERVICE_FEATURE_COUNT = INFRASTRUCTURE_SERVICE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Discovery Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_SERVICE_OPERATION_COUNT = INFRASTRUCTURE_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ajil.impl.APIServiceImpl <em>API Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajil.impl.APIServiceImpl
	 * @see ajil.impl.AjilPackageImpl#getAPIService()
	 * @generated
	 */
	int API_SERVICE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_SERVICE__NAME = INFRASTRUCTURE_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_SERVICE__PORT = INFRASTRUCTURE_SERVICE__PORT;

	/**
	 * The feature id for the '<em><b>Load Balanced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_SERVICE__LOAD_BALANCED = INFRASTRUCTURE_SERVICE__LOAD_BALANCED;

	/**
	 * The feature id for the '<em><b>Circuit Breaker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_SERVICE__CIRCUIT_BREAKER = INFRASTRUCTURE_SERVICE__CIRCUIT_BREAKER;

	/**
	 * The feature id for the '<em><b>Exposed Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_SERVICE__EXPOSED_SERVICES = INFRASTRUCTURE_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Discovered By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_SERVICE__DISCOVERED_BY = INFRASTRUCTURE_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>API Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_SERVICE_FEATURE_COUNT = INFRASTRUCTURE_SERVICE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>API Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_SERVICE_OPERATION_COUNT = INFRASTRUCTURE_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ajil.impl.ConfigurationServiceImpl <em>Configuration Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajil.impl.ConfigurationServiceImpl
	 * @see ajil.impl.AjilPackageImpl#getConfigurationService()
	 * @generated
	 */
	int CONFIGURATION_SERVICE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SERVICE__NAME = INFRASTRUCTURE_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SERVICE__PORT = INFRASTRUCTURE_SERVICE__PORT;

	/**
	 * The feature id for the '<em><b>Load Balanced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SERVICE__LOAD_BALANCED = INFRASTRUCTURE_SERVICE__LOAD_BALANCED;

	/**
	 * The feature id for the '<em><b>Circuit Breaker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SERVICE__CIRCUIT_BREAKER = INFRASTRUCTURE_SERVICE__CIRCUIT_BREAKER;

	/**
	 * The feature id for the '<em><b>Discovered By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SERVICE__DISCOVERED_BY = INFRASTRUCTURE_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stored Configurations</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SERVICE__STORED_CONFIGURATIONS = INFRASTRUCTURE_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Configuration Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SERVICE_FEATURE_COUNT = INFRASTRUCTURE_SERVICE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Configuration Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SERVICE_OPERATION_COUNT = INFRASTRUCTURE_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ajil.impl.ServiceInterfaceImpl <em>Service Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajil.impl.ServiceInterfaceImpl
	 * @see ajil.impl.AjilPackageImpl#getServiceInterface()
	 * @generated
	 */
	int SERVICE_INTERFACE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE__MECHANISM = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE__VERSION = 2;

	/**
	 * The feature id for the '<em><b>Abilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE__ABILITIES = 3;

	/**
	 * The feature id for the '<em><b>Exposed To Gateways</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE__EXPOSED_TO_GATEWAYS = 4;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE__OWNER = 5;

	/**
	 * The number of structural features of the '<em>Service Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Service Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ajil.impl.DomainModelImpl <em>Domain Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajil.impl.DomainModelImpl
	 * @see ajil.impl.AjilPackageImpl#getDomainModel()
	 * @generated
	 */
	int DOMAIN_MODEL = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL__ENTITIES = 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL__OWNER = 2;

	/**
	 * The number of structural features of the '<em>Domain Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Domain Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ajil.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajil.impl.EntityImpl
	 * @see ajil.impl.AjilPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__PARENT = 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ATTRIBUTES = 2;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__RELATIONS = 3;

	/**
	 * The feature id for the '<em><b>Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__PERSISTENT = 4;

	/**
	 * The feature id for the '<em><b>Domain Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__DOMAIN_MODEL = 5;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ajil.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajil.impl.RelationImpl
	 * @see ajil.impl.AjilPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 11;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__MULTIPLICITY = MULTIPLICITY__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__NAME = MULTIPLICITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__SOURCE = MULTIPLICITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__TARGET = MULTIPLICITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = MULTIPLICITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATION_COUNT = MULTIPLICITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ajil.impl.AbilityImpl <em>Ability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajil.impl.AbilityImpl
	 * @see ajil.impl.AjilPackageImpl#getAbility()
	 * @generated
	 */
	int ABILITY = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY__OWNER = 1;

	/**
	 * The number of structural features of the '<em>Ability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Ability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ajil.impl.CreateImpl <em>Create</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajil.impl.CreateImpl
	 * @see ajil.impl.AjilPackageImpl#getCreate()
	 * @generated
	 */
	int CREATE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__NAME = ABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__OWNER = ABILITY__OWNER;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__SUBJECT = ABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_FEATURE_COUNT = ABILITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OPERATION_COUNT = ABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ajil.impl.ReadImpl <em>Read</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajil.impl.ReadImpl
	 * @see ajil.impl.AjilPackageImpl#getRead()
	 * @generated
	 */
	int READ = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ__NAME = ABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ__OWNER = ABILITY__OWNER;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ__SUBJECT = ABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Read</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_FEATURE_COUNT = ABILITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Read</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_OPERATION_COUNT = ABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ajil.impl.MultiReadImpl <em>Multi Read</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajil.impl.MultiReadImpl
	 * @see ajil.impl.AjilPackageImpl#getMultiRead()
	 * @generated
	 */
	int MULTI_READ = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_READ__NAME = ABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_READ__OWNER = ABILITY__OWNER;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_READ__SUBJECT = ABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multi Read</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_READ_FEATURE_COUNT = ABILITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Multi Read</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_READ_OPERATION_COUNT = ABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ajil.impl.UpdateImpl <em>Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajil.impl.UpdateImpl
	 * @see ajil.impl.AjilPackageImpl#getUpdate()
	 * @generated
	 */
	int UPDATE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE__NAME = ABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE__OWNER = ABILITY__OWNER;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE__SUBJECT = ABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FEATURE_COUNT = ABILITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_OPERATION_COUNT = ABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ajil.impl.DeleteImpl <em>Delete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajil.impl.DeleteImpl
	 * @see ajil.impl.AjilPackageImpl#getDelete()
	 * @generated
	 */
	int DELETE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__NAME = ABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__OWNER = ABILITY__OWNER;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__SUBJECT = ABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_FEATURE_COUNT = ABILITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_OPERATION_COUNT = ABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ajil.impl.CustomImpl <em>Custom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajil.impl.CustomImpl
	 * @see ajil.impl.AjilPackageImpl#getCustom()
	 * @generated
	 */
	int CUSTOM = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM__NAME = ABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM__OWNER = ABILITY__OWNER;

	/**
	 * The number of structural features of the '<em>Custom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FEATURE_COUNT = ABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Custom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OPERATION_COUNT = ABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ajil.impl.PrimitiveDataTypeImpl <em>Primitive Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajil.impl.PrimitiveDataTypeImpl
	 * @see ajil.impl.AjilPackageImpl#getPrimitiveDataType()
	 * @generated
	 */
	int PRIMITIVE_DATA_TYPE = 19;

	/**
	 * The number of structural features of the '<em>Primitive Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Primitive Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ajil.impl.IntegerImpl <em>Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajil.impl.IntegerImpl
	 * @see ajil.impl.AjilPackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__NAME = PRIMITIVE_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__TYPE = PRIMITIVE_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FEATURE_COUNT = PRIMITIVE_DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPERATION_COUNT = PRIMITIVE_DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ajil.impl.BooleanImpl <em>Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajil.impl.BooleanImpl
	 * @see ajil.impl.AjilPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__NAME = PRIMITIVE_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__TYPE = PRIMITIVE_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FEATURE_COUNT = PRIMITIVE_DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION_COUNT = PRIMITIVE_DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ajil.impl.FloatImpl <em>Float</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajil.impl.FloatImpl
	 * @see ajil.impl.AjilPackageImpl#getFloat()
	 * @generated
	 */
	int FLOAT = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT__NAME = PRIMITIVE_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT__TYPE = PRIMITIVE_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_FEATURE_COUNT = PRIMITIVE_DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_OPERATION_COUNT = PRIMITIVE_DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ajil.impl.StringImpl <em>String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajil.impl.StringImpl
	 * @see ajil.impl.AjilPackageImpl#getString()
	 * @generated
	 */
	int STRING = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__NAME = PRIMITIVE_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__TYPE = PRIMITIVE_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FEATURE_COUNT = PRIMITIVE_DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPERATION_COUNT = PRIMITIVE_DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ajil.impl.CharImpl <em>Char</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajil.impl.CharImpl
	 * @see ajil.impl.AjilPackageImpl#getChar()
	 * @generated
	 */
	int CHAR = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR__NAME = PRIMITIVE_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR__TYPE = PRIMITIVE_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Char</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_FEATURE_COUNT = PRIMITIVE_DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Char</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_OPERATION_COUNT = PRIMITIVE_DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ajil.ECommunicationMechanism <em>ECommunication Mechanism</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajil.ECommunicationMechanism
	 * @see ajil.impl.AjilPackageImpl#getECommunicationMechanism()
	 * @generated
	 */
	int ECOMMUNICATION_MECHANISM = 25;

	/**
	 * The meta object id for the '{@link ajil.EMultiplicity <em>EMultiplicity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajil.EMultiplicity
	 * @see ajil.impl.AjilPackageImpl#getEMultiplicity()
	 * @generated
	 */
	int EMULTIPLICITY = 26;


	/**
	 * Returns the meta object for class '{@link ajil.Multiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplicity</em>'.
	 * @see ajil.Multiplicity
	 * @generated
	 */
	EClass getMultiplicity();

	/**
	 * Returns the meta object for the attribute '{@link ajil.Multiplicity#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see ajil.Multiplicity#getMultiplicity()
	 * @see #getMultiplicity()
	 * @generated
	 */
	EAttribute getMultiplicity_Multiplicity();

	/**
	 * Returns the meta object for class '{@link ajil.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see ajil.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the attribute '{@link ajil.System#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ajil.System#getName()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ajil.System#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see ajil.System#getServices()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Services();

	/**
	 * Returns the meta object for class '{@link ajil.Microservice <em>Microservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Microservice</em>'.
	 * @see ajil.Microservice
	 * @generated
	 */
	EClass getMicroservice();

	/**
	 * Returns the meta object for the attribute '{@link ajil.Microservice#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ajil.Microservice#getName()
	 * @see #getMicroservice()
	 * @generated
	 */
	EAttribute getMicroservice_Name();

	/**
	 * Returns the meta object for the attribute '{@link ajil.Microservice#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see ajil.Microservice#getPort()
	 * @see #getMicroservice()
	 * @generated
	 */
	EAttribute getMicroservice_Port();

	/**
	 * Returns the meta object for the attribute '{@link ajil.Microservice#isLoadBalanced <em>Load Balanced</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Load Balanced</em>'.
	 * @see ajil.Microservice#isLoadBalanced()
	 * @see #getMicroservice()
	 * @generated
	 */
	EAttribute getMicroservice_LoadBalanced();

	/**
	 * Returns the meta object for the attribute '{@link ajil.Microservice#isCircuitBreaker <em>Circuit Breaker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Circuit Breaker</em>'.
	 * @see ajil.Microservice#isCircuitBreaker()
	 * @see #getMicroservice()
	 * @generated
	 */
	EAttribute getMicroservice_CircuitBreaker();

	/**
	 * Returns the meta object for class '{@link ajil.InfrastructureService <em>Infrastructure Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infrastructure Service</em>'.
	 * @see ajil.InfrastructureService
	 * @generated
	 */
	EClass getInfrastructureService();

	/**
	 * Returns the meta object for class '{@link ajil.FunctionalService <em>Functional Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Service</em>'.
	 * @see ajil.FunctionalService
	 * @generated
	 */
	EClass getFunctionalService();

	/**
	 * Returns the meta object for the containment reference '{@link ajil.FunctionalService#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain</em>'.
	 * @see ajil.FunctionalService#getDomain()
	 * @see #getFunctionalService()
	 * @generated
	 */
	EReference getFunctionalService_Domain();

	/**
	 * Returns the meta object for the containment reference list '{@link ajil.FunctionalService#getProvidedInterfaces <em>Provided Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provided Interfaces</em>'.
	 * @see ajil.FunctionalService#getProvidedInterfaces()
	 * @see #getFunctionalService()
	 * @generated
	 */
	EReference getFunctionalService_ProvidedInterfaces();

	/**
	 * Returns the meta object for the reference list '{@link ajil.FunctionalService#getServiceDependencies <em>Service Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Dependencies</em>'.
	 * @see ajil.FunctionalService#getServiceDependencies()
	 * @see #getFunctionalService()
	 * @generated
	 */
	EReference getFunctionalService_ServiceDependencies();

	/**
	 * Returns the meta object for the reference '{@link ajil.FunctionalService#getDiscoveredBy <em>Discovered By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Discovered By</em>'.
	 * @see ajil.FunctionalService#getDiscoveredBy()
	 * @see #getFunctionalService()
	 * @generated
	 */
	EReference getFunctionalService_DiscoveredBy();

	/**
	 * Returns the meta object for the reference '{@link ajil.FunctionalService#getConfiguredBy <em>Configured By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Configured By</em>'.
	 * @see ajil.FunctionalService#getConfiguredBy()
	 * @see #getFunctionalService()
	 * @generated
	 */
	EReference getFunctionalService_ConfiguredBy();

	/**
	 * Returns the meta object for class '{@link ajil.DiscoveryService <em>Discovery Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discovery Service</em>'.
	 * @see ajil.DiscoveryService
	 * @generated
	 */
	EClass getDiscoveryService();

	/**
	 * Returns the meta object for the reference list '{@link ajil.DiscoveryService#getKnownFunctionalServices <em>Known Functional Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Known Functional Services</em>'.
	 * @see ajil.DiscoveryService#getKnownFunctionalServices()
	 * @see #getDiscoveryService()
	 * @generated
	 */
	EReference getDiscoveryService_KnownFunctionalServices();

	/**
	 * Returns the meta object for the reference list '{@link ajil.DiscoveryService#getKnownApiServices <em>Known Api Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Known Api Services</em>'.
	 * @see ajil.DiscoveryService#getKnownApiServices()
	 * @see #getDiscoveryService()
	 * @generated
	 */
	EReference getDiscoveryService_KnownApiServices();

	/**
	 * Returns the meta object for the reference list '{@link ajil.DiscoveryService#getKnownConfigurationServices <em>Known Configuration Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Known Configuration Services</em>'.
	 * @see ajil.DiscoveryService#getKnownConfigurationServices()
	 * @see #getDiscoveryService()
	 * @generated
	 */
	EReference getDiscoveryService_KnownConfigurationServices();

	/**
	 * Returns the meta object for class '{@link ajil.APIService <em>API Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>API Service</em>'.
	 * @see ajil.APIService
	 * @generated
	 */
	EClass getAPIService();

	/**
	 * Returns the meta object for the reference list '{@link ajil.APIService#getExposedServices <em>Exposed Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exposed Services</em>'.
	 * @see ajil.APIService#getExposedServices()
	 * @see #getAPIService()
	 * @generated
	 */
	EReference getAPIService_ExposedServices();

	/**
	 * Returns the meta object for the reference '{@link ajil.APIService#getDiscoveredBy <em>Discovered By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Discovered By</em>'.
	 * @see ajil.APIService#getDiscoveredBy()
	 * @see #getAPIService()
	 * @generated
	 */
	EReference getAPIService_DiscoveredBy();

	/**
	 * Returns the meta object for class '{@link ajil.ConfigurationService <em>Configuration Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Service</em>'.
	 * @see ajil.ConfigurationService
	 * @generated
	 */
	EClass getConfigurationService();

	/**
	 * Returns the meta object for the reference '{@link ajil.ConfigurationService#getDiscoveredBy <em>Discovered By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Discovered By</em>'.
	 * @see ajil.ConfigurationService#getDiscoveredBy()
	 * @see #getConfigurationService()
	 * @generated
	 */
	EReference getConfigurationService_DiscoveredBy();

	/**
	 * Returns the meta object for the reference '{@link ajil.ConfigurationService#getStoredConfigurations <em>Stored Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Stored Configurations</em>'.
	 * @see ajil.ConfigurationService#getStoredConfigurations()
	 * @see #getConfigurationService()
	 * @generated
	 */
	EReference getConfigurationService_StoredConfigurations();

	/**
	 * Returns the meta object for class '{@link ajil.ServiceInterface <em>Service Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Interface</em>'.
	 * @see ajil.ServiceInterface
	 * @generated
	 */
	EClass getServiceInterface();

	/**
	 * Returns the meta object for the attribute '{@link ajil.ServiceInterface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ajil.ServiceInterface#getName()
	 * @see #getServiceInterface()
	 * @generated
	 */
	EAttribute getServiceInterface_Name();

	/**
	 * Returns the meta object for the attribute '{@link ajil.ServiceInterface#getMechanism <em>Mechanism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mechanism</em>'.
	 * @see ajil.ServiceInterface#getMechanism()
	 * @see #getServiceInterface()
	 * @generated
	 */
	EAttribute getServiceInterface_Mechanism();

	/**
	 * Returns the meta object for the attribute '{@link ajil.ServiceInterface#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see ajil.ServiceInterface#getVersion()
	 * @see #getServiceInterface()
	 * @generated
	 */
	EAttribute getServiceInterface_Version();

	/**
	 * Returns the meta object for the containment reference list '{@link ajil.ServiceInterface#getAbilities <em>Abilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abilities</em>'.
	 * @see ajil.ServiceInterface#getAbilities()
	 * @see #getServiceInterface()
	 * @generated
	 */
	EReference getServiceInterface_Abilities();

	/**
	 * Returns the meta object for the reference list '{@link ajil.ServiceInterface#getExposedToGateways <em>Exposed To Gateways</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exposed To Gateways</em>'.
	 * @see ajil.ServiceInterface#getExposedToGateways()
	 * @see #getServiceInterface()
	 * @generated
	 */
	EReference getServiceInterface_ExposedToGateways();

	/**
	 * Returns the meta object for the container reference '{@link ajil.ServiceInterface#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see ajil.ServiceInterface#getOwner()
	 * @see #getServiceInterface()
	 * @generated
	 */
	EReference getServiceInterface_Owner();

	/**
	 * Returns the meta object for class '{@link ajil.DomainModel <em>Domain Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Model</em>'.
	 * @see ajil.DomainModel
	 * @generated
	 */
	EClass getDomainModel();

	/**
	 * Returns the meta object for the attribute '{@link ajil.DomainModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ajil.DomainModel#getName()
	 * @see #getDomainModel()
	 * @generated
	 */
	EAttribute getDomainModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ajil.DomainModel#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see ajil.DomainModel#getEntities()
	 * @see #getDomainModel()
	 * @generated
	 */
	EReference getDomainModel_Entities();

	/**
	 * Returns the meta object for the container reference '{@link ajil.DomainModel#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see ajil.DomainModel#getOwner()
	 * @see #getDomainModel()
	 * @generated
	 */
	EReference getDomainModel_Owner();

	/**
	 * Returns the meta object for class '{@link ajil.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see ajil.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link ajil.Entity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ajil.Entity#getName()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Name();

	/**
	 * Returns the meta object for the reference '{@link ajil.Entity#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see ajil.Entity#getParent()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link ajil.Entity#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see ajil.Entity#getAttributes()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link ajil.Entity#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see ajil.Entity#getRelations()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Relations();

	/**
	 * Returns the meta object for the attribute '{@link ajil.Entity#isPersistent <em>Persistent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistent</em>'.
	 * @see ajil.Entity#isPersistent()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Persistent();

	/**
	 * Returns the meta object for the container reference '{@link ajil.Entity#getDomainModel <em>Domain Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Domain Model</em>'.
	 * @see ajil.Entity#getDomainModel()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_DomainModel();

	/**
	 * Returns the meta object for class '{@link ajil.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see ajil.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the attribute '{@link ajil.Relation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ajil.Relation#getName()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Name();

	/**
	 * Returns the meta object for the container reference '{@link ajil.Relation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source</em>'.
	 * @see ajil.Relation#getSource()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Source();

	/**
	 * Returns the meta object for the reference '{@link ajil.Relation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ajil.Relation#getTarget()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Target();

	/**
	 * Returns the meta object for class '{@link ajil.Ability <em>Ability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ability</em>'.
	 * @see ajil.Ability
	 * @generated
	 */
	EClass getAbility();

	/**
	 * Returns the meta object for the attribute '{@link ajil.Ability#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ajil.Ability#getName()
	 * @see #getAbility()
	 * @generated
	 */
	EAttribute getAbility_Name();

	/**
	 * Returns the meta object for the container reference '{@link ajil.Ability#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see ajil.Ability#getOwner()
	 * @see #getAbility()
	 * @generated
	 */
	EReference getAbility_Owner();

	/**
	 * Returns the meta object for class '{@link ajil.Create <em>Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create</em>'.
	 * @see ajil.Create
	 * @generated
	 */
	EClass getCreate();

	/**
	 * Returns the meta object for the reference '{@link ajil.Create#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subject</em>'.
	 * @see ajil.Create#getSubject()
	 * @see #getCreate()
	 * @generated
	 */
	EReference getCreate_Subject();

	/**
	 * Returns the meta object for class '{@link ajil.Read <em>Read</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read</em>'.
	 * @see ajil.Read
	 * @generated
	 */
	EClass getRead();

	/**
	 * Returns the meta object for the reference '{@link ajil.Read#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subject</em>'.
	 * @see ajil.Read#getSubject()
	 * @see #getRead()
	 * @generated
	 */
	EReference getRead_Subject();

	/**
	 * Returns the meta object for class '{@link ajil.MultiRead <em>Multi Read</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Read</em>'.
	 * @see ajil.MultiRead
	 * @generated
	 */
	EClass getMultiRead();

	/**
	 * Returns the meta object for the reference '{@link ajil.MultiRead#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subject</em>'.
	 * @see ajil.MultiRead#getSubject()
	 * @see #getMultiRead()
	 * @generated
	 */
	EReference getMultiRead_Subject();

	/**
	 * Returns the meta object for class '{@link ajil.Update <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update</em>'.
	 * @see ajil.Update
	 * @generated
	 */
	EClass getUpdate();

	/**
	 * Returns the meta object for the reference '{@link ajil.Update#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subject</em>'.
	 * @see ajil.Update#getSubject()
	 * @see #getUpdate()
	 * @generated
	 */
	EReference getUpdate_Subject();

	/**
	 * Returns the meta object for class '{@link ajil.Delete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete</em>'.
	 * @see ajil.Delete
	 * @generated
	 */
	EClass getDelete();

	/**
	 * Returns the meta object for the reference '{@link ajil.Delete#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subject</em>'.
	 * @see ajil.Delete#getSubject()
	 * @see #getDelete()
	 * @generated
	 */
	EReference getDelete_Subject();

	/**
	 * Returns the meta object for class '{@link ajil.Custom <em>Custom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom</em>'.
	 * @see ajil.Custom
	 * @generated
	 */
	EClass getCustom();

	/**
	 * Returns the meta object for class '{@link ajil.PrimitiveDataType <em>Primitive Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Data Type</em>'.
	 * @see ajil.PrimitiveDataType
	 * @generated
	 */
	EClass getPrimitiveDataType();

	/**
	 * Returns the meta object for class '{@link ajil.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer</em>'.
	 * @see ajil.Integer
	 * @generated
	 */
	EClass getInteger();

	/**
	 * Returns the meta object for the attribute '{@link ajil.Integer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ajil.Integer#getName()
	 * @see #getInteger()
	 * @generated
	 */
	EAttribute getInteger_Name();

	/**
	 * Returns the meta object for the attribute '{@link ajil.Integer#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ajil.Integer#getType()
	 * @see #getInteger()
	 * @generated
	 */
	EAttribute getInteger_Type();

	/**
	 * Returns the meta object for class '{@link ajil.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean</em>'.
	 * @see ajil.Boolean
	 * @generated
	 */
	EClass getBoolean();

	/**
	 * Returns the meta object for the attribute '{@link ajil.Boolean#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ajil.Boolean#getName()
	 * @see #getBoolean()
	 * @generated
	 */
	EAttribute getBoolean_Name();

	/**
	 * Returns the meta object for the attribute '{@link ajil.Boolean#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ajil.Boolean#getType()
	 * @see #getBoolean()
	 * @generated
	 */
	EAttribute getBoolean_Type();

	/**
	 * Returns the meta object for class '{@link ajil.Float <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float</em>'.
	 * @see ajil.Float
	 * @generated
	 */
	EClass getFloat();

	/**
	 * Returns the meta object for the attribute '{@link ajil.Float#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ajil.Float#getName()
	 * @see #getFloat()
	 * @generated
	 */
	EAttribute getFloat_Name();

	/**
	 * Returns the meta object for the attribute '{@link ajil.Float#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ajil.Float#getType()
	 * @see #getFloat()
	 * @generated
	 */
	EAttribute getFloat_Type();

	/**
	 * Returns the meta object for class '{@link ajil.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String</em>'.
	 * @see ajil.String
	 * @generated
	 */
	EClass getString();

	/**
	 * Returns the meta object for the attribute '{@link ajil.String#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ajil.String#getName()
	 * @see #getString()
	 * @generated
	 */
	EAttribute getString_Name();

	/**
	 * Returns the meta object for the attribute '{@link ajil.String#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ajil.String#getType()
	 * @see #getString()
	 * @generated
	 */
	EAttribute getString_Type();

	/**
	 * Returns the meta object for class '{@link ajil.Char <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Char</em>'.
	 * @see ajil.Char
	 * @generated
	 */
	EClass getChar();

	/**
	 * Returns the meta object for the attribute '{@link ajil.Char#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ajil.Char#getName()
	 * @see #getChar()
	 * @generated
	 */
	EAttribute getChar_Name();

	/**
	 * Returns the meta object for the attribute '{@link ajil.Char#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ajil.Char#getType()
	 * @see #getChar()
	 * @generated
	 */
	EAttribute getChar_Type();

	/**
	 * Returns the meta object for enum '{@link ajil.ECommunicationMechanism <em>ECommunication Mechanism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ECommunication Mechanism</em>'.
	 * @see ajil.ECommunicationMechanism
	 * @generated
	 */
	EEnum getECommunicationMechanism();

	/**
	 * Returns the meta object for enum '{@link ajil.EMultiplicity <em>EMultiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EMultiplicity</em>'.
	 * @see ajil.EMultiplicity
	 * @generated
	 */
	EEnum getEMultiplicity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AjilFactory getAjilFactory();

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
		 * The meta object literal for the '{@link ajil.impl.MultiplicityImpl <em>Multiplicity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajil.impl.MultiplicityImpl
		 * @see ajil.impl.AjilPackageImpl#getMultiplicity()
		 * @generated
		 */
		EClass MULTIPLICITY = eINSTANCE.getMultiplicity();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY__MULTIPLICITY = eINSTANCE.getMultiplicity_Multiplicity();

		/**
		 * The meta object literal for the '{@link ajil.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajil.impl.SystemImpl
		 * @see ajil.impl.AjilPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__NAME = eINSTANCE.getSystem_Name();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__SERVICES = eINSTANCE.getSystem_Services();

		/**
		 * The meta object literal for the '{@link ajil.impl.MicroserviceImpl <em>Microservice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajil.impl.MicroserviceImpl
		 * @see ajil.impl.AjilPackageImpl#getMicroservice()
		 * @generated
		 */
		EClass MICROSERVICE = eINSTANCE.getMicroservice();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICROSERVICE__NAME = eINSTANCE.getMicroservice_Name();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICROSERVICE__PORT = eINSTANCE.getMicroservice_Port();

		/**
		 * The meta object literal for the '<em><b>Load Balanced</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICROSERVICE__LOAD_BALANCED = eINSTANCE.getMicroservice_LoadBalanced();

		/**
		 * The meta object literal for the '<em><b>Circuit Breaker</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICROSERVICE__CIRCUIT_BREAKER = eINSTANCE.getMicroservice_CircuitBreaker();

		/**
		 * The meta object literal for the '{@link ajil.impl.InfrastructureServiceImpl <em>Infrastructure Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajil.impl.InfrastructureServiceImpl
		 * @see ajil.impl.AjilPackageImpl#getInfrastructureService()
		 * @generated
		 */
		EClass INFRASTRUCTURE_SERVICE = eINSTANCE.getInfrastructureService();

		/**
		 * The meta object literal for the '{@link ajil.impl.FunctionalServiceImpl <em>Functional Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajil.impl.FunctionalServiceImpl
		 * @see ajil.impl.AjilPackageImpl#getFunctionalService()
		 * @generated
		 */
		EClass FUNCTIONAL_SERVICE = eINSTANCE.getFunctionalService();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_SERVICE__DOMAIN = eINSTANCE.getFunctionalService_Domain();

		/**
		 * The meta object literal for the '<em><b>Provided Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_SERVICE__PROVIDED_INTERFACES = eINSTANCE.getFunctionalService_ProvidedInterfaces();

		/**
		 * The meta object literal for the '<em><b>Service Dependencies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_SERVICE__SERVICE_DEPENDENCIES = eINSTANCE.getFunctionalService_ServiceDependencies();

		/**
		 * The meta object literal for the '<em><b>Discovered By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_SERVICE__DISCOVERED_BY = eINSTANCE.getFunctionalService_DiscoveredBy();

		/**
		 * The meta object literal for the '<em><b>Configured By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_SERVICE__CONFIGURED_BY = eINSTANCE.getFunctionalService_ConfiguredBy();

		/**
		 * The meta object literal for the '{@link ajil.impl.DiscoveryServiceImpl <em>Discovery Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajil.impl.DiscoveryServiceImpl
		 * @see ajil.impl.AjilPackageImpl#getDiscoveryService()
		 * @generated
		 */
		EClass DISCOVERY_SERVICE = eINSTANCE.getDiscoveryService();

		/**
		 * The meta object literal for the '<em><b>Known Functional Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCOVERY_SERVICE__KNOWN_FUNCTIONAL_SERVICES = eINSTANCE.getDiscoveryService_KnownFunctionalServices();

		/**
		 * The meta object literal for the '<em><b>Known Api Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCOVERY_SERVICE__KNOWN_API_SERVICES = eINSTANCE.getDiscoveryService_KnownApiServices();

		/**
		 * The meta object literal for the '<em><b>Known Configuration Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCOVERY_SERVICE__KNOWN_CONFIGURATION_SERVICES = eINSTANCE.getDiscoveryService_KnownConfigurationServices();

		/**
		 * The meta object literal for the '{@link ajil.impl.APIServiceImpl <em>API Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajil.impl.APIServiceImpl
		 * @see ajil.impl.AjilPackageImpl#getAPIService()
		 * @generated
		 */
		EClass API_SERVICE = eINSTANCE.getAPIService();

		/**
		 * The meta object literal for the '<em><b>Exposed Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API_SERVICE__EXPOSED_SERVICES = eINSTANCE.getAPIService_ExposedServices();

		/**
		 * The meta object literal for the '<em><b>Discovered By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API_SERVICE__DISCOVERED_BY = eINSTANCE.getAPIService_DiscoveredBy();

		/**
		 * The meta object literal for the '{@link ajil.impl.ConfigurationServiceImpl <em>Configuration Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajil.impl.ConfigurationServiceImpl
		 * @see ajil.impl.AjilPackageImpl#getConfigurationService()
		 * @generated
		 */
		EClass CONFIGURATION_SERVICE = eINSTANCE.getConfigurationService();

		/**
		 * The meta object literal for the '<em><b>Discovered By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_SERVICE__DISCOVERED_BY = eINSTANCE.getConfigurationService_DiscoveredBy();

		/**
		 * The meta object literal for the '<em><b>Stored Configurations</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_SERVICE__STORED_CONFIGURATIONS = eINSTANCE.getConfigurationService_StoredConfigurations();

		/**
		 * The meta object literal for the '{@link ajil.impl.ServiceInterfaceImpl <em>Service Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajil.impl.ServiceInterfaceImpl
		 * @see ajil.impl.AjilPackageImpl#getServiceInterface()
		 * @generated
		 */
		EClass SERVICE_INTERFACE = eINSTANCE.getServiceInterface();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_INTERFACE__NAME = eINSTANCE.getServiceInterface_Name();

		/**
		 * The meta object literal for the '<em><b>Mechanism</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_INTERFACE__MECHANISM = eINSTANCE.getServiceInterface_Mechanism();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_INTERFACE__VERSION = eINSTANCE.getServiceInterface_Version();

		/**
		 * The meta object literal for the '<em><b>Abilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_INTERFACE__ABILITIES = eINSTANCE.getServiceInterface_Abilities();

		/**
		 * The meta object literal for the '<em><b>Exposed To Gateways</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_INTERFACE__EXPOSED_TO_GATEWAYS = eINSTANCE.getServiceInterface_ExposedToGateways();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_INTERFACE__OWNER = eINSTANCE.getServiceInterface_Owner();

		/**
		 * The meta object literal for the '{@link ajil.impl.DomainModelImpl <em>Domain Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajil.impl.DomainModelImpl
		 * @see ajil.impl.AjilPackageImpl#getDomainModel()
		 * @generated
		 */
		EClass DOMAIN_MODEL = eINSTANCE.getDomainModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_MODEL__NAME = eINSTANCE.getDomainModel_Name();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_MODEL__ENTITIES = eINSTANCE.getDomainModel_Entities();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_MODEL__OWNER = eINSTANCE.getDomainModel_Owner();

		/**
		 * The meta object literal for the '{@link ajil.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajil.impl.EntityImpl
		 * @see ajil.impl.AjilPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__PARENT = eINSTANCE.getEntity_Parent();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ATTRIBUTES = eINSTANCE.getEntity_Attributes();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__RELATIONS = eINSTANCE.getEntity_Relations();

		/**
		 * The meta object literal for the '<em><b>Persistent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__PERSISTENT = eINSTANCE.getEntity_Persistent();

		/**
		 * The meta object literal for the '<em><b>Domain Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__DOMAIN_MODEL = eINSTANCE.getEntity_DomainModel();

		/**
		 * The meta object literal for the '{@link ajil.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajil.impl.RelationImpl
		 * @see ajil.impl.AjilPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__NAME = eINSTANCE.getRelation_Name();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__SOURCE = eINSTANCE.getRelation_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__TARGET = eINSTANCE.getRelation_Target();

		/**
		 * The meta object literal for the '{@link ajil.impl.AbilityImpl <em>Ability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajil.impl.AbilityImpl
		 * @see ajil.impl.AjilPackageImpl#getAbility()
		 * @generated
		 */
		EClass ABILITY = eINSTANCE.getAbility();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABILITY__NAME = eINSTANCE.getAbility_Name();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABILITY__OWNER = eINSTANCE.getAbility_Owner();

		/**
		 * The meta object literal for the '{@link ajil.impl.CreateImpl <em>Create</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajil.impl.CreateImpl
		 * @see ajil.impl.AjilPackageImpl#getCreate()
		 * @generated
		 */
		EClass CREATE = eINSTANCE.getCreate();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE__SUBJECT = eINSTANCE.getCreate_Subject();

		/**
		 * The meta object literal for the '{@link ajil.impl.ReadImpl <em>Read</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajil.impl.ReadImpl
		 * @see ajil.impl.AjilPackageImpl#getRead()
		 * @generated
		 */
		EClass READ = eINSTANCE.getRead();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ__SUBJECT = eINSTANCE.getRead_Subject();

		/**
		 * The meta object literal for the '{@link ajil.impl.MultiReadImpl <em>Multi Read</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajil.impl.MultiReadImpl
		 * @see ajil.impl.AjilPackageImpl#getMultiRead()
		 * @generated
		 */
		EClass MULTI_READ = eINSTANCE.getMultiRead();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_READ__SUBJECT = eINSTANCE.getMultiRead_Subject();

		/**
		 * The meta object literal for the '{@link ajil.impl.UpdateImpl <em>Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajil.impl.UpdateImpl
		 * @see ajil.impl.AjilPackageImpl#getUpdate()
		 * @generated
		 */
		EClass UPDATE = eINSTANCE.getUpdate();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE__SUBJECT = eINSTANCE.getUpdate_Subject();

		/**
		 * The meta object literal for the '{@link ajil.impl.DeleteImpl <em>Delete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajil.impl.DeleteImpl
		 * @see ajil.impl.AjilPackageImpl#getDelete()
		 * @generated
		 */
		EClass DELETE = eINSTANCE.getDelete();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELETE__SUBJECT = eINSTANCE.getDelete_Subject();

		/**
		 * The meta object literal for the '{@link ajil.impl.CustomImpl <em>Custom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajil.impl.CustomImpl
		 * @see ajil.impl.AjilPackageImpl#getCustom()
		 * @generated
		 */
		EClass CUSTOM = eINSTANCE.getCustom();

		/**
		 * The meta object literal for the '{@link ajil.impl.PrimitiveDataTypeImpl <em>Primitive Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajil.impl.PrimitiveDataTypeImpl
		 * @see ajil.impl.AjilPackageImpl#getPrimitiveDataType()
		 * @generated
		 */
		EClass PRIMITIVE_DATA_TYPE = eINSTANCE.getPrimitiveDataType();

		/**
		 * The meta object literal for the '{@link ajil.impl.IntegerImpl <em>Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajil.impl.IntegerImpl
		 * @see ajil.impl.AjilPackageImpl#getInteger()
		 * @generated
		 */
		EClass INTEGER = eINSTANCE.getInteger();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER__NAME = eINSTANCE.getInteger_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER__TYPE = eINSTANCE.getInteger_Type();

		/**
		 * The meta object literal for the '{@link ajil.impl.BooleanImpl <em>Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajil.impl.BooleanImpl
		 * @see ajil.impl.AjilPackageImpl#getBoolean()
		 * @generated
		 */
		EClass BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN__NAME = eINSTANCE.getBoolean_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN__TYPE = eINSTANCE.getBoolean_Type();

		/**
		 * The meta object literal for the '{@link ajil.impl.FloatImpl <em>Float</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajil.impl.FloatImpl
		 * @see ajil.impl.AjilPackageImpl#getFloat()
		 * @generated
		 */
		EClass FLOAT = eINSTANCE.getFloat();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT__NAME = eINSTANCE.getFloat_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT__TYPE = eINSTANCE.getFloat_Type();

		/**
		 * The meta object literal for the '{@link ajil.impl.StringImpl <em>String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajil.impl.StringImpl
		 * @see ajil.impl.AjilPackageImpl#getString()
		 * @generated
		 */
		EClass STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING__NAME = eINSTANCE.getString_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING__TYPE = eINSTANCE.getString_Type();

		/**
		 * The meta object literal for the '{@link ajil.impl.CharImpl <em>Char</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajil.impl.CharImpl
		 * @see ajil.impl.AjilPackageImpl#getChar()
		 * @generated
		 */
		EClass CHAR = eINSTANCE.getChar();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAR__NAME = eINSTANCE.getChar_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAR__TYPE = eINSTANCE.getChar_Type();

		/**
		 * The meta object literal for the '{@link ajil.ECommunicationMechanism <em>ECommunication Mechanism</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajil.ECommunicationMechanism
		 * @see ajil.impl.AjilPackageImpl#getECommunicationMechanism()
		 * @generated
		 */
		EEnum ECOMMUNICATION_MECHANISM = eINSTANCE.getECommunicationMechanism();

		/**
		 * The meta object literal for the '{@link ajil.EMultiplicity <em>EMultiplicity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajil.EMultiplicity
		 * @see ajil.impl.AjilPackageImpl#getEMultiplicity()
		 * @generated
		 */
		EEnum EMULTIPLICITY = eINSTANCE.getEMultiplicity();

	}

} //AjilPackage
