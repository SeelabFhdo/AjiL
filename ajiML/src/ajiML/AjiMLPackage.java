/**
 */
package ajiML;

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
 * @see ajiML.AjiMLFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface AjiMLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ajiML";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.fh-dortmund.de/idial/ajiML";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ajiML";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AjiMLPackage eINSTANCE = ajiML.impl.AjiMLPackageImpl.init();

	/**
	 * The meta object id for the '{@link ajiML.impl.MultiplicityImpl <em>Multiplicity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiML.impl.MultiplicityImpl
	 * @see ajiML.impl.AjiMLPackageImpl#getMultiplicity()
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
	 * The meta object id for the '{@link ajiML.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiML.impl.SystemImpl
	 * @see ajiML.impl.AjiMLPackageImpl#getSystem()
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
	 * The meta object id for the '{@link ajiML.impl.MicroserviceImpl <em>Microservice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiML.impl.MicroserviceImpl
	 * @see ajiML.impl.AjiMLPackageImpl#getMicroservice()
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
	 * The feature id for the '<em><b>Discovered By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__DISCOVERED_BY = 4;

	/**
	 * The feature id for the '<em><b>Configured By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__CONFIGURED_BY = 5;

	/**
	 * The feature id for the '<em><b>Secured By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__SECURED_BY = 6;

	/**
	 * The number of structural features of the '<em>Microservice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Microservice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ajiML.impl.InfrastructureServiceImpl <em>Infrastructure Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiML.impl.InfrastructureServiceImpl
	 * @see ajiML.impl.AjiMLPackageImpl#getInfrastructureService()
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
	 * The feature id for the '<em><b>Discovered By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_SERVICE__DISCOVERED_BY = MICROSERVICE__DISCOVERED_BY;

	/**
	 * The feature id for the '<em><b>Configured By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_SERVICE__CONFIGURED_BY = MICROSERVICE__CONFIGURED_BY;

	/**
	 * The feature id for the '<em><b>Secured By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_SERVICE__SECURED_BY = MICROSERVICE__SECURED_BY;

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
	 * The meta object id for the '{@link ajiML.impl.FunctionalServiceImpl <em>Functional Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiML.impl.FunctionalServiceImpl
	 * @see ajiML.impl.AjiMLPackageImpl#getFunctionalService()
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
	 * The feature id for the '<em><b>Discovered By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_SERVICE__DISCOVERED_BY = MICROSERVICE__DISCOVERED_BY;

	/**
	 * The feature id for the '<em><b>Configured By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_SERVICE__CONFIGURED_BY = MICROSERVICE__CONFIGURED_BY;

	/**
	 * The feature id for the '<em><b>Secured By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_SERVICE__SECURED_BY = MICROSERVICE__SECURED_BY;

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
	 * The number of structural features of the '<em>Functional Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_SERVICE_FEATURE_COUNT = MICROSERVICE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Functional Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_SERVICE_OPERATION_COUNT = MICROSERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ajiML.impl.DiscoveryServiceImpl <em>Discovery Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiML.impl.DiscoveryServiceImpl
	 * @see ajiML.impl.AjiMLPackageImpl#getDiscoveryService()
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
	 * The feature id for the '<em><b>Discovered By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_SERVICE__DISCOVERED_BY = INFRASTRUCTURE_SERVICE__DISCOVERED_BY;

	/**
	 * The feature id for the '<em><b>Configured By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_SERVICE__CONFIGURED_BY = INFRASTRUCTURE_SERVICE__CONFIGURED_BY;

	/**
	 * The feature id for the '<em><b>Secured By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_SERVICE__SECURED_BY = INFRASTRUCTURE_SERVICE__SECURED_BY;

	/**
	 * The feature id for the '<em><b>Discovered Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_SERVICE__DISCOVERED_SERVICES = INFRASTRUCTURE_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Discovery Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_SERVICE_FEATURE_COUNT = INFRASTRUCTURE_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Discovery Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_SERVICE_OPERATION_COUNT = INFRASTRUCTURE_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ajiML.impl.APIServiceImpl <em>API Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiML.impl.APIServiceImpl
	 * @see ajiML.impl.AjiMLPackageImpl#getAPIService()
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
	 * The feature id for the '<em><b>Discovered By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_SERVICE__DISCOVERED_BY = INFRASTRUCTURE_SERVICE__DISCOVERED_BY;

	/**
	 * The feature id for the '<em><b>Configured By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_SERVICE__CONFIGURED_BY = INFRASTRUCTURE_SERVICE__CONFIGURED_BY;

	/**
	 * The feature id for the '<em><b>Secured By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_SERVICE__SECURED_BY = INFRASTRUCTURE_SERVICE__SECURED_BY;

	/**
	 * The feature id for the '<em><b>Exposed Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_SERVICE__EXPOSED_SERVICES = INFRASTRUCTURE_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>API Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_SERVICE_FEATURE_COUNT = INFRASTRUCTURE_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>API Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_SERVICE_OPERATION_COUNT = INFRASTRUCTURE_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ajiML.impl.ConfigurationServiceImpl <em>Configuration Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiML.impl.ConfigurationServiceImpl
	 * @see ajiML.impl.AjiMLPackageImpl#getConfigurationService()
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
	int CONFIGURATION_SERVICE__DISCOVERED_BY = INFRASTRUCTURE_SERVICE__DISCOVERED_BY;

	/**
	 * The feature id for the '<em><b>Configured By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SERVICE__CONFIGURED_BY = INFRASTRUCTURE_SERVICE__CONFIGURED_BY;

	/**
	 * The feature id for the '<em><b>Secured By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SERVICE__SECURED_BY = INFRASTRUCTURE_SERVICE__SECURED_BY;

	/**
	 * The feature id for the '<em><b>Configured Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SERVICE__CONFIGURED_SERVICES = INFRASTRUCTURE_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Configuration Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SERVICE_FEATURE_COUNT = INFRASTRUCTURE_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Configuration Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SERVICE_OPERATION_COUNT = INFRASTRUCTURE_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ajiML.impl.SecurityServiceImpl <em>Security Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiML.impl.SecurityServiceImpl
	 * @see ajiML.impl.AjiMLPackageImpl#getSecurityService()
	 * @generated
	 */
	int SECURITY_SERVICE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SERVICE__NAME = INFRASTRUCTURE_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SERVICE__PORT = INFRASTRUCTURE_SERVICE__PORT;

	/**
	 * The feature id for the '<em><b>Load Balanced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SERVICE__LOAD_BALANCED = INFRASTRUCTURE_SERVICE__LOAD_BALANCED;

	/**
	 * The feature id for the '<em><b>Circuit Breaker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SERVICE__CIRCUIT_BREAKER = INFRASTRUCTURE_SERVICE__CIRCUIT_BREAKER;

	/**
	 * The feature id for the '<em><b>Discovered By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SERVICE__DISCOVERED_BY = INFRASTRUCTURE_SERVICE__DISCOVERED_BY;

	/**
	 * The feature id for the '<em><b>Configured By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SERVICE__CONFIGURED_BY = INFRASTRUCTURE_SERVICE__CONFIGURED_BY;

	/**
	 * The feature id for the '<em><b>Secured By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SERVICE__SECURED_BY = INFRASTRUCTURE_SERVICE__SECURED_BY;

	/**
	 * The feature id for the '<em><b>Secured Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SERVICE__SECURED_SERVICES = INFRASTRUCTURE_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Security Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SERVICE_FEATURE_COUNT = INFRASTRUCTURE_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Security Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SERVICE_OPERATION_COUNT = INFRASTRUCTURE_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ajiML.impl.UserManagementServiceImpl <em>User Management Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiML.impl.UserManagementServiceImpl
	 * @see ajiML.impl.AjiMLPackageImpl#getUserManagementService()
	 * @generated
	 */
	int USER_MANAGEMENT_SERVICE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_MANAGEMENT_SERVICE__NAME = INFRASTRUCTURE_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_MANAGEMENT_SERVICE__PORT = INFRASTRUCTURE_SERVICE__PORT;

	/**
	 * The feature id for the '<em><b>Load Balanced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_MANAGEMENT_SERVICE__LOAD_BALANCED = INFRASTRUCTURE_SERVICE__LOAD_BALANCED;

	/**
	 * The feature id for the '<em><b>Circuit Breaker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_MANAGEMENT_SERVICE__CIRCUIT_BREAKER = INFRASTRUCTURE_SERVICE__CIRCUIT_BREAKER;

	/**
	 * The feature id for the '<em><b>Discovered By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_MANAGEMENT_SERVICE__DISCOVERED_BY = INFRASTRUCTURE_SERVICE__DISCOVERED_BY;

	/**
	 * The feature id for the '<em><b>Configured By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_MANAGEMENT_SERVICE__CONFIGURED_BY = INFRASTRUCTURE_SERVICE__CONFIGURED_BY;

	/**
	 * The feature id for the '<em><b>Secured By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_MANAGEMENT_SERVICE__SECURED_BY = INFRASTRUCTURE_SERVICE__SECURED_BY;

	/**
	 * The feature id for the '<em><b>Provides Users</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_MANAGEMENT_SERVICE__PROVIDES_USERS = INFRASTRUCTURE_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>User Management Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_MANAGEMENT_SERVICE_FEATURE_COUNT = INFRASTRUCTURE_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>User Management Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_MANAGEMENT_SERVICE_OPERATION_COUNT = INFRASTRUCTURE_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ajiML.impl.ServiceInterfaceImpl <em>Service Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiML.impl.ServiceInterfaceImpl
	 * @see ajiML.impl.AjiMLPackageImpl#getServiceInterface()
	 * @generated
	 */
	int SERVICE_INTERFACE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Abilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE__ABILITIES = 2;

	/**
	 * The feature id for the '<em><b>Exposed To Gateways</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE__EXPOSED_TO_GATEWAYS = 3;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE__OWNER = 4;

	/**
	 * The number of structural features of the '<em>Service Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Service Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ajiML.impl.DataModelImpl <em>Data Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiML.impl.DataModelImpl
	 * @see ajiML.impl.AjiMLPackageImpl#getDataModel()
	 * @generated
	 */
	int DATA_MODEL = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__ENTITIES = 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__OWNER = 2;

	/**
	 * The number of structural features of the '<em>Data Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Data Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ajiML.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiML.impl.DataTypeImpl
	 * @see ajiML.impl.AjiMLPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 28;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ajiML.impl.ComplexDataTypeImpl <em>Complex Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiML.impl.ComplexDataTypeImpl
	 * @see ajiML.impl.AjiMLPackageImpl#getComplexDataType()
	 * @generated
	 */
	int COMPLEX_DATA_TYPE = 27;

	/**
	 * The number of structural features of the '<em>Complex Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_DATA_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Complex Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_DATA_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ajiML.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiML.impl.EntityImpl
	 * @see ajiML.impl.AjiMLPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = COMPLEX_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__PARENT = COMPLEX_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ATTRIBUTES = COMPLEX_DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__RELATIONS = COMPLEX_DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Domain Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__DOMAIN_MODEL = COMPLEX_DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = COMPLEX_DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = COMPLEX_DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ajiML.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiML.impl.RelationImpl
	 * @see ajiML.impl.AjiMLPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 13;

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
	 * The meta object id for the '{@link ajiML.impl.AbilityImpl <em>Ability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiML.impl.AbilityImpl
	 * @see ajiML.impl.AjiMLPackageImpl#getAbility()
	 * @generated
	 */
	int ABILITY = 14;

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
	 * The feature id for the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY__SUBJECT = 2;

	/**
	 * The number of structural features of the '<em>Ability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Ability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ajiML.impl.CreateImpl <em>Create</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiML.impl.CreateImpl
	 * @see ajiML.impl.AjiMLPackageImpl#getCreate()
	 * @generated
	 */
	int CREATE = 15;

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
	int CREATE__SUBJECT = ABILITY__SUBJECT;

	/**
	 * The number of structural features of the '<em>Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_FEATURE_COUNT = ABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OPERATION_COUNT = ABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ajiML.impl.ReadImpl <em>Read</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiML.impl.ReadImpl
	 * @see ajiML.impl.AjiMLPackageImpl#getRead()
	 * @generated
	 */
	int READ = 16;

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
	int READ__SUBJECT = ABILITY__SUBJECT;

	/**
	 * The number of structural features of the '<em>Read</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_FEATURE_COUNT = ABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Read</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_OPERATION_COUNT = ABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ajiML.impl.MultiReadImpl <em>Multi Read</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiML.impl.MultiReadImpl
	 * @see ajiML.impl.AjiMLPackageImpl#getMultiRead()
	 * @generated
	 */
	int MULTI_READ = 17;

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
	int MULTI_READ__SUBJECT = ABILITY__SUBJECT;

	/**
	 * The number of structural features of the '<em>Multi Read</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_READ_FEATURE_COUNT = ABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Multi Read</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_READ_OPERATION_COUNT = ABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ajiML.impl.UpdateImpl <em>Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiML.impl.UpdateImpl
	 * @see ajiML.impl.AjiMLPackageImpl#getUpdate()
	 * @generated
	 */
	int UPDATE = 18;

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
	int UPDATE__SUBJECT = ABILITY__SUBJECT;

	/**
	 * The number of structural features of the '<em>Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FEATURE_COUNT = ABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_OPERATION_COUNT = ABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ajiML.impl.DeleteImpl <em>Delete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiML.impl.DeleteImpl
	 * @see ajiML.impl.AjiMLPackageImpl#getDelete()
	 * @generated
	 */
	int DELETE = 19;

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
	int DELETE__SUBJECT = ABILITY__SUBJECT;

	/**
	 * The number of structural features of the '<em>Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_FEATURE_COUNT = ABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_OPERATION_COUNT = ABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ajiML.impl.CustomImpl <em>Custom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiML.impl.CustomImpl
	 * @see ajiML.impl.AjiMLPackageImpl#getCustom()
	 * @generated
	 */
	int CUSTOM = 20;

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
	 * The feature id for the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM__SUBJECT = ABILITY__SUBJECT;

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
	 * The meta object id for the '{@link ajiML.impl.PrimitiveDataTypeImpl <em>Primitive Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiML.impl.PrimitiveDataTypeImpl
	 * @see ajiML.impl.AjiMLPackageImpl#getPrimitiveDataType()
	 * @generated
	 */
	int PRIMITIVE_DATA_TYPE = 21;

	/**
	 * The number of structural features of the '<em>Primitive Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Primitive Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ajiML.impl.IntegerImpl <em>Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiML.impl.IntegerImpl
	 * @see ajiML.impl.AjiMLPackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 22;

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
	 * The meta object id for the '{@link ajiML.impl.BooleanImpl <em>Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiML.impl.BooleanImpl
	 * @see ajiML.impl.AjiMLPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 23;

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
	 * The meta object id for the '{@link ajiML.impl.FloatImpl <em>Float</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiML.impl.FloatImpl
	 * @see ajiML.impl.AjiMLPackageImpl#getFloat()
	 * @generated
	 */
	int FLOAT = 24;

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
	 * The meta object id for the '{@link ajiML.impl.StringImpl <em>String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiML.impl.StringImpl
	 * @see ajiML.impl.AjiMLPackageImpl#getString()
	 * @generated
	 */
	int STRING = 25;

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
	 * The meta object id for the '{@link ajiML.impl.CharImpl <em>Char</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiML.impl.CharImpl
	 * @see ajiML.impl.AjiMLPackageImpl#getChar()
	 * @generated
	 */
	int CHAR = 26;

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
	 * The meta object id for the '{@link ajiML.impl.DateImpl <em>Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiML.impl.DateImpl
	 * @see ajiML.impl.AjiMLPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__NAME = PRIMITIVE_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__TYPE = PRIMITIVE_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FEATURE_COUNT = PRIMITIVE_DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_OPERATION_COUNT = PRIMITIVE_DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ajiML.impl.LongImpl <em>Long</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiML.impl.LongImpl
	 * @see ajiML.impl.AjiMLPackageImpl#getLong()
	 * @generated
	 */
	int LONG = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG__NAME = PRIMITIVE_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG__TYPE = PRIMITIVE_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_FEATURE_COUNT = PRIMITIVE_DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_OPERATION_COUNT = PRIMITIVE_DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ajiML.EMultiplicity <em>EMultiplicity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiML.EMultiplicity
	 * @see ajiML.impl.AjiMLPackageImpl#getEMultiplicity()
	 * @generated
	 */
	int EMULTIPLICITY = 31;


	/**
	 * Returns the meta object for class '{@link ajiML.Multiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplicity</em>'.
	 * @see ajiML.Multiplicity
	 * @generated
	 */
	EClass getMultiplicity();

	/**
	 * Returns the meta object for the attribute '{@link ajiML.Multiplicity#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see ajiML.Multiplicity#getMultiplicity()
	 * @see #getMultiplicity()
	 * @generated
	 */
	EAttribute getMultiplicity_Multiplicity();

	/**
	 * Returns the meta object for class '{@link ajiML.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see ajiML.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the attribute '{@link ajiML.System#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ajiML.System#getName()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ajiML.System#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see ajiML.System#getServices()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Services();

	/**
	 * Returns the meta object for class '{@link ajiML.Microservice <em>Microservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Microservice</em>'.
	 * @see ajiML.Microservice
	 * @generated
	 */
	EClass getMicroservice();

	/**
	 * Returns the meta object for the attribute '{@link ajiML.Microservice#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ajiML.Microservice#getName()
	 * @see #getMicroservice()
	 * @generated
	 */
	EAttribute getMicroservice_Name();

	/**
	 * Returns the meta object for the attribute '{@link ajiML.Microservice#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see ajiML.Microservice#getPort()
	 * @see #getMicroservice()
	 * @generated
	 */
	EAttribute getMicroservice_Port();

	/**
	 * Returns the meta object for the attribute '{@link ajiML.Microservice#isLoadBalanced <em>Load Balanced</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Load Balanced</em>'.
	 * @see ajiML.Microservice#isLoadBalanced()
	 * @see #getMicroservice()
	 * @generated
	 */
	EAttribute getMicroservice_LoadBalanced();

	/**
	 * Returns the meta object for the attribute '{@link ajiML.Microservice#isCircuitBreaker <em>Circuit Breaker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Circuit Breaker</em>'.
	 * @see ajiML.Microservice#isCircuitBreaker()
	 * @see #getMicroservice()
	 * @generated
	 */
	EAttribute getMicroservice_CircuitBreaker();

	/**
	 * Returns the meta object for the reference '{@link ajiML.Microservice#getDiscoveredBy <em>Discovered By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Discovered By</em>'.
	 * @see ajiML.Microservice#getDiscoveredBy()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_DiscoveredBy();

	/**
	 * Returns the meta object for the reference '{@link ajiML.Microservice#getConfiguredBy <em>Configured By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Configured By</em>'.
	 * @see ajiML.Microservice#getConfiguredBy()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_ConfiguredBy();

	/**
	 * Returns the meta object for the reference '{@link ajiML.Microservice#getSecuredBy <em>Secured By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Secured By</em>'.
	 * @see ajiML.Microservice#getSecuredBy()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_SecuredBy();

	/**
	 * Returns the meta object for class '{@link ajiML.InfrastructureService <em>Infrastructure Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infrastructure Service</em>'.
	 * @see ajiML.InfrastructureService
	 * @generated
	 */
	EClass getInfrastructureService();

	/**
	 * Returns the meta object for class '{@link ajiML.FunctionalService <em>Functional Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Service</em>'.
	 * @see ajiML.FunctionalService
	 * @generated
	 */
	EClass getFunctionalService();

	/**
	 * Returns the meta object for the containment reference '{@link ajiML.FunctionalService#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain</em>'.
	 * @see ajiML.FunctionalService#getDomain()
	 * @see #getFunctionalService()
	 * @generated
	 */
	EReference getFunctionalService_Domain();

	/**
	 * Returns the meta object for the containment reference list '{@link ajiML.FunctionalService#getProvidedInterfaces <em>Provided Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provided Interfaces</em>'.
	 * @see ajiML.FunctionalService#getProvidedInterfaces()
	 * @see #getFunctionalService()
	 * @generated
	 */
	EReference getFunctionalService_ProvidedInterfaces();

	/**
	 * Returns the meta object for the reference list '{@link ajiML.FunctionalService#getServiceDependencies <em>Service Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service Dependencies</em>'.
	 * @see ajiML.FunctionalService#getServiceDependencies()
	 * @see #getFunctionalService()
	 * @generated
	 */
	EReference getFunctionalService_ServiceDependencies();

	/**
	 * Returns the meta object for class '{@link ajiML.DiscoveryService <em>Discovery Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discovery Service</em>'.
	 * @see ajiML.DiscoveryService
	 * @generated
	 */
	EClass getDiscoveryService();

	/**
	 * Returns the meta object for the reference list '{@link ajiML.DiscoveryService#getDiscoveredServices <em>Discovered Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Discovered Services</em>'.
	 * @see ajiML.DiscoveryService#getDiscoveredServices()
	 * @see #getDiscoveryService()
	 * @generated
	 */
	EReference getDiscoveryService_DiscoveredServices();

	/**
	 * Returns the meta object for class '{@link ajiML.APIService <em>API Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>API Service</em>'.
	 * @see ajiML.APIService
	 * @generated
	 */
	EClass getAPIService();

	/**
	 * Returns the meta object for the reference list '{@link ajiML.APIService#getExposedServices <em>Exposed Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exposed Services</em>'.
	 * @see ajiML.APIService#getExposedServices()
	 * @see #getAPIService()
	 * @generated
	 */
	EReference getAPIService_ExposedServices();

	/**
	 * Returns the meta object for class '{@link ajiML.ConfigurationService <em>Configuration Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Service</em>'.
	 * @see ajiML.ConfigurationService
	 * @generated
	 */
	EClass getConfigurationService();

	/**
	 * Returns the meta object for the reference list '{@link ajiML.ConfigurationService#getConfiguredServices <em>Configured Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Configured Services</em>'.
	 * @see ajiML.ConfigurationService#getConfiguredServices()
	 * @see #getConfigurationService()
	 * @generated
	 */
	EReference getConfigurationService_ConfiguredServices();

	/**
	 * Returns the meta object for class '{@link ajiML.SecurityService <em>Security Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Service</em>'.
	 * @see ajiML.SecurityService
	 * @generated
	 */
	EClass getSecurityService();

	/**
	 * Returns the meta object for the reference list '{@link ajiML.SecurityService#getSecuredServices <em>Secured Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Secured Services</em>'.
	 * @see ajiML.SecurityService#getSecuredServices()
	 * @see #getSecurityService()
	 * @generated
	 */
	EReference getSecurityService_SecuredServices();

	/**
	 * Returns the meta object for class '{@link ajiML.UserManagementService <em>User Management Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Management Service</em>'.
	 * @see ajiML.UserManagementService
	 * @generated
	 */
	EClass getUserManagementService();

	/**
	 * Returns the meta object for the reference list '{@link ajiML.UserManagementService#getProvidesUsers <em>Provides Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provides Users</em>'.
	 * @see ajiML.UserManagementService#getProvidesUsers()
	 * @see #getUserManagementService()
	 * @generated
	 */
	EReference getUserManagementService_ProvidesUsers();

	/**
	 * Returns the meta object for class '{@link ajiML.ServiceInterface <em>Service Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Interface</em>'.
	 * @see ajiML.ServiceInterface
	 * @generated
	 */
	EClass getServiceInterface();

	/**
	 * Returns the meta object for the attribute '{@link ajiML.ServiceInterface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ajiML.ServiceInterface#getName()
	 * @see #getServiceInterface()
	 * @generated
	 */
	EAttribute getServiceInterface_Name();

	/**
	 * Returns the meta object for the attribute '{@link ajiML.ServiceInterface#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see ajiML.ServiceInterface#getVersion()
	 * @see #getServiceInterface()
	 * @generated
	 */
	EAttribute getServiceInterface_Version();

	/**
	 * Returns the meta object for the containment reference list '{@link ajiML.ServiceInterface#getAbilities <em>Abilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abilities</em>'.
	 * @see ajiML.ServiceInterface#getAbilities()
	 * @see #getServiceInterface()
	 * @generated
	 */
	EReference getServiceInterface_Abilities();

	/**
	 * Returns the meta object for the reference list '{@link ajiML.ServiceInterface#getExposedToGateways <em>Exposed To Gateways</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exposed To Gateways</em>'.
	 * @see ajiML.ServiceInterface#getExposedToGateways()
	 * @see #getServiceInterface()
	 * @generated
	 */
	EReference getServiceInterface_ExposedToGateways();

	/**
	 * Returns the meta object for the container reference '{@link ajiML.ServiceInterface#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see ajiML.ServiceInterface#getOwner()
	 * @see #getServiceInterface()
	 * @generated
	 */
	EReference getServiceInterface_Owner();

	/**
	 * Returns the meta object for class '{@link ajiML.DataModel <em>Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Model</em>'.
	 * @see ajiML.DataModel
	 * @generated
	 */
	EClass getDataModel();

	/**
	 * Returns the meta object for the attribute '{@link ajiML.DataModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ajiML.DataModel#getName()
	 * @see #getDataModel()
	 * @generated
	 */
	EAttribute getDataModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ajiML.DataModel#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see ajiML.DataModel#getEntities()
	 * @see #getDataModel()
	 * @generated
	 */
	EReference getDataModel_Entities();

	/**
	 * Returns the meta object for the container reference '{@link ajiML.DataModel#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see ajiML.DataModel#getOwner()
	 * @see #getDataModel()
	 * @generated
	 */
	EReference getDataModel_Owner();

	/**
	 * Returns the meta object for class '{@link ajiML.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see ajiML.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link ajiML.Entity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ajiML.Entity#getName()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Name();

	/**
	 * Returns the meta object for the reference '{@link ajiML.Entity#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see ajiML.Entity#getParent()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link ajiML.Entity#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see ajiML.Entity#getAttributes()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link ajiML.Entity#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see ajiML.Entity#getRelations()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Relations();

	/**
	 * Returns the meta object for the container reference '{@link ajiML.Entity#getDomainModel <em>Domain Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Domain Model</em>'.
	 * @see ajiML.Entity#getDomainModel()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_DomainModel();

	/**
	 * Returns the meta object for class '{@link ajiML.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see ajiML.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the attribute '{@link ajiML.Relation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ajiML.Relation#getName()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Name();

	/**
	 * Returns the meta object for the container reference '{@link ajiML.Relation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source</em>'.
	 * @see ajiML.Relation#getSource()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Source();

	/**
	 * Returns the meta object for the reference '{@link ajiML.Relation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ajiML.Relation#getTarget()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Target();

	/**
	 * Returns the meta object for class '{@link ajiML.Ability <em>Ability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ability</em>'.
	 * @see ajiML.Ability
	 * @generated
	 */
	EClass getAbility();

	/**
	 * Returns the meta object for the attribute '{@link ajiML.Ability#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ajiML.Ability#getName()
	 * @see #getAbility()
	 * @generated
	 */
	EAttribute getAbility_Name();

	/**
	 * Returns the meta object for the container reference '{@link ajiML.Ability#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see ajiML.Ability#getOwner()
	 * @see #getAbility()
	 * @generated
	 */
	EReference getAbility_Owner();

	/**
	 * Returns the meta object for the reference '{@link ajiML.Ability#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subject</em>'.
	 * @see ajiML.Ability#getSubject()
	 * @see #getAbility()
	 * @generated
	 */
	EReference getAbility_Subject();

	/**
	 * Returns the meta object for class '{@link ajiML.Create <em>Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create</em>'.
	 * @see ajiML.Create
	 * @generated
	 */
	EClass getCreate();

	/**
	 * Returns the meta object for class '{@link ajiML.Read <em>Read</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read</em>'.
	 * @see ajiML.Read
	 * @generated
	 */
	EClass getRead();

	/**
	 * Returns the meta object for class '{@link ajiML.MultiRead <em>Multi Read</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Read</em>'.
	 * @see ajiML.MultiRead
	 * @generated
	 */
	EClass getMultiRead();

	/**
	 * Returns the meta object for class '{@link ajiML.Update <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update</em>'.
	 * @see ajiML.Update
	 * @generated
	 */
	EClass getUpdate();

	/**
	 * Returns the meta object for class '{@link ajiML.Delete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete</em>'.
	 * @see ajiML.Delete
	 * @generated
	 */
	EClass getDelete();

	/**
	 * Returns the meta object for class '{@link ajiML.Custom <em>Custom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom</em>'.
	 * @see ajiML.Custom
	 * @generated
	 */
	EClass getCustom();

	/**
	 * Returns the meta object for class '{@link ajiML.PrimitiveDataType <em>Primitive Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Data Type</em>'.
	 * @see ajiML.PrimitiveDataType
	 * @generated
	 */
	EClass getPrimitiveDataType();

	/**
	 * Returns the meta object for class '{@link ajiML.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer</em>'.
	 * @see ajiML.Integer
	 * @generated
	 */
	EClass getInteger();

	/**
	 * Returns the meta object for the attribute '{@link ajiML.Integer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ajiML.Integer#getName()
	 * @see #getInteger()
	 * @generated
	 */
	EAttribute getInteger_Name();

	/**
	 * Returns the meta object for the attribute '{@link ajiML.Integer#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ajiML.Integer#getType()
	 * @see #getInteger()
	 * @generated
	 */
	EAttribute getInteger_Type();

	/**
	 * Returns the meta object for class '{@link ajiML.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean</em>'.
	 * @see ajiML.Boolean
	 * @generated
	 */
	EClass getBoolean();

	/**
	 * Returns the meta object for the attribute '{@link ajiML.Boolean#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ajiML.Boolean#getName()
	 * @see #getBoolean()
	 * @generated
	 */
	EAttribute getBoolean_Name();

	/**
	 * Returns the meta object for the attribute '{@link ajiML.Boolean#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ajiML.Boolean#getType()
	 * @see #getBoolean()
	 * @generated
	 */
	EAttribute getBoolean_Type();

	/**
	 * Returns the meta object for class '{@link ajiML.Float <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float</em>'.
	 * @see ajiML.Float
	 * @generated
	 */
	EClass getFloat();

	/**
	 * Returns the meta object for the attribute '{@link ajiML.Float#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ajiML.Float#getName()
	 * @see #getFloat()
	 * @generated
	 */
	EAttribute getFloat_Name();

	/**
	 * Returns the meta object for the attribute '{@link ajiML.Float#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ajiML.Float#getType()
	 * @see #getFloat()
	 * @generated
	 */
	EAttribute getFloat_Type();

	/**
	 * Returns the meta object for class '{@link ajiML.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String</em>'.
	 * @see ajiML.String
	 * @generated
	 */
	EClass getString();

	/**
	 * Returns the meta object for the attribute '{@link ajiML.String#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ajiML.String#getName()
	 * @see #getString()
	 * @generated
	 */
	EAttribute getString_Name();

	/**
	 * Returns the meta object for the attribute '{@link ajiML.String#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ajiML.String#getType()
	 * @see #getString()
	 * @generated
	 */
	EAttribute getString_Type();

	/**
	 * Returns the meta object for class '{@link ajiML.Char <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Char</em>'.
	 * @see ajiML.Char
	 * @generated
	 */
	EClass getChar();

	/**
	 * Returns the meta object for the attribute '{@link ajiML.Char#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ajiML.Char#getName()
	 * @see #getChar()
	 * @generated
	 */
	EAttribute getChar_Name();

	/**
	 * Returns the meta object for the attribute '{@link ajiML.Char#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ajiML.Char#getType()
	 * @see #getChar()
	 * @generated
	 */
	EAttribute getChar_Type();

	/**
	 * Returns the meta object for class '{@link ajiML.ComplexDataType <em>Complex Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Data Type</em>'.
	 * @see ajiML.ComplexDataType
	 * @generated
	 */
	EClass getComplexDataType();

	/**
	 * Returns the meta object for class '{@link ajiML.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see ajiML.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for class '{@link ajiML.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date</em>'.
	 * @see ajiML.Date
	 * @generated
	 */
	EClass getDate();

	/**
	 * Returns the meta object for the attribute '{@link ajiML.Date#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ajiML.Date#getName()
	 * @see #getDate()
	 * @generated
	 */
	EAttribute getDate_Name();

	/**
	 * Returns the meta object for the attribute '{@link ajiML.Date#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ajiML.Date#getType()
	 * @see #getDate()
	 * @generated
	 */
	EAttribute getDate_Type();

	/**
	 * Returns the meta object for class '{@link ajiML.Long <em>Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Long</em>'.
	 * @see ajiML.Long
	 * @generated
	 */
	EClass getLong();

	/**
	 * Returns the meta object for the attribute '{@link ajiML.Long#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ajiML.Long#getName()
	 * @see #getLong()
	 * @generated
	 */
	EAttribute getLong_Name();

	/**
	 * Returns the meta object for the attribute '{@link ajiML.Long#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ajiML.Long#getType()
	 * @see #getLong()
	 * @generated
	 */
	EAttribute getLong_Type();

	/**
	 * Returns the meta object for enum '{@link ajiML.EMultiplicity <em>EMultiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EMultiplicity</em>'.
	 * @see ajiML.EMultiplicity
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
	AjiMLFactory getAjiMLFactory();

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
		 * The meta object literal for the '{@link ajiML.impl.MultiplicityImpl <em>Multiplicity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiML.impl.MultiplicityImpl
		 * @see ajiML.impl.AjiMLPackageImpl#getMultiplicity()
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
		 * The meta object literal for the '{@link ajiML.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiML.impl.SystemImpl
		 * @see ajiML.impl.AjiMLPackageImpl#getSystem()
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
		 * The meta object literal for the '{@link ajiML.impl.MicroserviceImpl <em>Microservice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiML.impl.MicroserviceImpl
		 * @see ajiML.impl.AjiMLPackageImpl#getMicroservice()
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
		 * The meta object literal for the '<em><b>Discovered By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__DISCOVERED_BY = eINSTANCE.getMicroservice_DiscoveredBy();

		/**
		 * The meta object literal for the '<em><b>Configured By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__CONFIGURED_BY = eINSTANCE.getMicroservice_ConfiguredBy();

		/**
		 * The meta object literal for the '<em><b>Secured By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__SECURED_BY = eINSTANCE.getMicroservice_SecuredBy();

		/**
		 * The meta object literal for the '{@link ajiML.impl.InfrastructureServiceImpl <em>Infrastructure Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiML.impl.InfrastructureServiceImpl
		 * @see ajiML.impl.AjiMLPackageImpl#getInfrastructureService()
		 * @generated
		 */
		EClass INFRASTRUCTURE_SERVICE = eINSTANCE.getInfrastructureService();

		/**
		 * The meta object literal for the '{@link ajiML.impl.FunctionalServiceImpl <em>Functional Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiML.impl.FunctionalServiceImpl
		 * @see ajiML.impl.AjiMLPackageImpl#getFunctionalService()
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
		 * The meta object literal for the '{@link ajiML.impl.DiscoveryServiceImpl <em>Discovery Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiML.impl.DiscoveryServiceImpl
		 * @see ajiML.impl.AjiMLPackageImpl#getDiscoveryService()
		 * @generated
		 */
		EClass DISCOVERY_SERVICE = eINSTANCE.getDiscoveryService();

		/**
		 * The meta object literal for the '<em><b>Discovered Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCOVERY_SERVICE__DISCOVERED_SERVICES = eINSTANCE.getDiscoveryService_DiscoveredServices();

		/**
		 * The meta object literal for the '{@link ajiML.impl.APIServiceImpl <em>API Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiML.impl.APIServiceImpl
		 * @see ajiML.impl.AjiMLPackageImpl#getAPIService()
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
		 * The meta object literal for the '{@link ajiML.impl.ConfigurationServiceImpl <em>Configuration Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiML.impl.ConfigurationServiceImpl
		 * @see ajiML.impl.AjiMLPackageImpl#getConfigurationService()
		 * @generated
		 */
		EClass CONFIGURATION_SERVICE = eINSTANCE.getConfigurationService();

		/**
		 * The meta object literal for the '<em><b>Configured Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_SERVICE__CONFIGURED_SERVICES = eINSTANCE.getConfigurationService_ConfiguredServices();

		/**
		 * The meta object literal for the '{@link ajiML.impl.SecurityServiceImpl <em>Security Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiML.impl.SecurityServiceImpl
		 * @see ajiML.impl.AjiMLPackageImpl#getSecurityService()
		 * @generated
		 */
		EClass SECURITY_SERVICE = eINSTANCE.getSecurityService();

		/**
		 * The meta object literal for the '<em><b>Secured Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_SERVICE__SECURED_SERVICES = eINSTANCE.getSecurityService_SecuredServices();

		/**
		 * The meta object literal for the '{@link ajiML.impl.UserManagementServiceImpl <em>User Management Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiML.impl.UserManagementServiceImpl
		 * @see ajiML.impl.AjiMLPackageImpl#getUserManagementService()
		 * @generated
		 */
		EClass USER_MANAGEMENT_SERVICE = eINSTANCE.getUserManagementService();

		/**
		 * The meta object literal for the '<em><b>Provides Users</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_MANAGEMENT_SERVICE__PROVIDES_USERS = eINSTANCE.getUserManagementService_ProvidesUsers();

		/**
		 * The meta object literal for the '{@link ajiML.impl.ServiceInterfaceImpl <em>Service Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiML.impl.ServiceInterfaceImpl
		 * @see ajiML.impl.AjiMLPackageImpl#getServiceInterface()
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
		 * The meta object literal for the '{@link ajiML.impl.DataModelImpl <em>Data Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiML.impl.DataModelImpl
		 * @see ajiML.impl.AjiMLPackageImpl#getDataModel()
		 * @generated
		 */
		EClass DATA_MODEL = eINSTANCE.getDataModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_MODEL__NAME = eINSTANCE.getDataModel_Name();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MODEL__ENTITIES = eINSTANCE.getDataModel_Entities();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MODEL__OWNER = eINSTANCE.getDataModel_Owner();

		/**
		 * The meta object literal for the '{@link ajiML.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiML.impl.EntityImpl
		 * @see ajiML.impl.AjiMLPackageImpl#getEntity()
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
		 * The meta object literal for the '<em><b>Domain Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__DOMAIN_MODEL = eINSTANCE.getEntity_DomainModel();

		/**
		 * The meta object literal for the '{@link ajiML.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiML.impl.RelationImpl
		 * @see ajiML.impl.AjiMLPackageImpl#getRelation()
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
		 * The meta object literal for the '{@link ajiML.impl.AbilityImpl <em>Ability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiML.impl.AbilityImpl
		 * @see ajiML.impl.AjiMLPackageImpl#getAbility()
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
		 * The meta object literal for the '<em><b>Subject</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABILITY__SUBJECT = eINSTANCE.getAbility_Subject();

		/**
		 * The meta object literal for the '{@link ajiML.impl.CreateImpl <em>Create</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiML.impl.CreateImpl
		 * @see ajiML.impl.AjiMLPackageImpl#getCreate()
		 * @generated
		 */
		EClass CREATE = eINSTANCE.getCreate();

		/**
		 * The meta object literal for the '{@link ajiML.impl.ReadImpl <em>Read</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiML.impl.ReadImpl
		 * @see ajiML.impl.AjiMLPackageImpl#getRead()
		 * @generated
		 */
		EClass READ = eINSTANCE.getRead();

		/**
		 * The meta object literal for the '{@link ajiML.impl.MultiReadImpl <em>Multi Read</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiML.impl.MultiReadImpl
		 * @see ajiML.impl.AjiMLPackageImpl#getMultiRead()
		 * @generated
		 */
		EClass MULTI_READ = eINSTANCE.getMultiRead();

		/**
		 * The meta object literal for the '{@link ajiML.impl.UpdateImpl <em>Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiML.impl.UpdateImpl
		 * @see ajiML.impl.AjiMLPackageImpl#getUpdate()
		 * @generated
		 */
		EClass UPDATE = eINSTANCE.getUpdate();

		/**
		 * The meta object literal for the '{@link ajiML.impl.DeleteImpl <em>Delete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiML.impl.DeleteImpl
		 * @see ajiML.impl.AjiMLPackageImpl#getDelete()
		 * @generated
		 */
		EClass DELETE = eINSTANCE.getDelete();

		/**
		 * The meta object literal for the '{@link ajiML.impl.CustomImpl <em>Custom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiML.impl.CustomImpl
		 * @see ajiML.impl.AjiMLPackageImpl#getCustom()
		 * @generated
		 */
		EClass CUSTOM = eINSTANCE.getCustom();

		/**
		 * The meta object literal for the '{@link ajiML.impl.PrimitiveDataTypeImpl <em>Primitive Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiML.impl.PrimitiveDataTypeImpl
		 * @see ajiML.impl.AjiMLPackageImpl#getPrimitiveDataType()
		 * @generated
		 */
		EClass PRIMITIVE_DATA_TYPE = eINSTANCE.getPrimitiveDataType();

		/**
		 * The meta object literal for the '{@link ajiML.impl.IntegerImpl <em>Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiML.impl.IntegerImpl
		 * @see ajiML.impl.AjiMLPackageImpl#getInteger()
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
		 * The meta object literal for the '{@link ajiML.impl.BooleanImpl <em>Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiML.impl.BooleanImpl
		 * @see ajiML.impl.AjiMLPackageImpl#getBoolean()
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
		 * The meta object literal for the '{@link ajiML.impl.FloatImpl <em>Float</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiML.impl.FloatImpl
		 * @see ajiML.impl.AjiMLPackageImpl#getFloat()
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
		 * The meta object literal for the '{@link ajiML.impl.StringImpl <em>String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiML.impl.StringImpl
		 * @see ajiML.impl.AjiMLPackageImpl#getString()
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
		 * The meta object literal for the '{@link ajiML.impl.CharImpl <em>Char</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiML.impl.CharImpl
		 * @see ajiML.impl.AjiMLPackageImpl#getChar()
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
		 * The meta object literal for the '{@link ajiML.impl.ComplexDataTypeImpl <em>Complex Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiML.impl.ComplexDataTypeImpl
		 * @see ajiML.impl.AjiMLPackageImpl#getComplexDataType()
		 * @generated
		 */
		EClass COMPLEX_DATA_TYPE = eINSTANCE.getComplexDataType();

		/**
		 * The meta object literal for the '{@link ajiML.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiML.impl.DataTypeImpl
		 * @see ajiML.impl.AjiMLPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link ajiML.impl.DateImpl <em>Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiML.impl.DateImpl
		 * @see ajiML.impl.AjiMLPackageImpl#getDate()
		 * @generated
		 */
		EClass DATE = eINSTANCE.getDate();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE__NAME = eINSTANCE.getDate_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE__TYPE = eINSTANCE.getDate_Type();

		/**
		 * The meta object literal for the '{@link ajiML.impl.LongImpl <em>Long</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiML.impl.LongImpl
		 * @see ajiML.impl.AjiMLPackageImpl#getLong()
		 * @generated
		 */
		EClass LONG = eINSTANCE.getLong();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LONG__NAME = eINSTANCE.getLong_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LONG__TYPE = eINSTANCE.getLong_Type();

		/**
		 * The meta object literal for the '{@link ajiML.EMultiplicity <em>EMultiplicity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiML.EMultiplicity
		 * @see ajiML.impl.AjiMLPackageImpl#getEMultiplicity()
		 * @generated
		 */
		EEnum EMULTIPLICITY = eINSTANCE.getEMultiplicity();

	}

} //AjiMLPackage
