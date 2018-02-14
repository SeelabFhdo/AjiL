/**
 */
package ajiMLT;

import ajiML.AjiMLPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @see ajiMLT.AjiMLTFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ajiML='ajiML.ecore#/'"
 * @generated
 */
public interface AjiMLTPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ajiMLT";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.fh-dortmund.de/idial/ajiML/tech";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ajiMLT";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AjiMLTPackage eINSTANCE = ajiMLT.impl.AjiMLTPackageImpl.init();

	/**
	 * The meta object id for the '{@link ajiMLT.impl.FunctionalServiceTImpl <em>Functional Service T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiMLT.impl.FunctionalServiceTImpl
	 * @see ajiMLT.impl.AjiMLTPackageImpl#getFunctionalServiceT()
	 * @generated
	 */
	int FUNCTIONAL_SERVICE_T = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_SERVICE_T__NAME = AjiMLPackage.FUNCTIONAL_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_SERVICE_T__PORT = AjiMLPackage.FUNCTIONAL_SERVICE__PORT;

	/**
	 * The feature id for the '<em><b>Load Balanced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_SERVICE_T__LOAD_BALANCED = AjiMLPackage.FUNCTIONAL_SERVICE__LOAD_BALANCED;

	/**
	 * The feature id for the '<em><b>Circuit Breaker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_SERVICE_T__CIRCUIT_BREAKER = AjiMLPackage.FUNCTIONAL_SERVICE__CIRCUIT_BREAKER;

	/**
	 * The feature id for the '<em><b>Discovered By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_SERVICE_T__DISCOVERED_BY = AjiMLPackage.FUNCTIONAL_SERVICE__DISCOVERED_BY;

	/**
	 * The feature id for the '<em><b>Configured By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_SERVICE_T__CONFIGURED_BY = AjiMLPackage.FUNCTIONAL_SERVICE__CONFIGURED_BY;

	/**
	 * The feature id for the '<em><b>Secured By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_SERVICE_T__SECURED_BY = AjiMLPackage.FUNCTIONAL_SERVICE__SECURED_BY;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_SERVICE_T__DOMAIN = AjiMLPackage.FUNCTIONAL_SERVICE__DOMAIN;

	/**
	 * The feature id for the '<em><b>Provided Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_SERVICE_T__PROVIDED_INTERFACES = AjiMLPackage.FUNCTIONAL_SERVICE__PROVIDED_INTERFACES;

	/**
	 * The feature id for the '<em><b>Service Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_SERVICE_T__SERVICE_DEPENDENCIES = AjiMLPackage.FUNCTIONAL_SERVICE__SERVICE_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_SERVICE_T__GENERATOR = AjiMLPackage.FUNCTIONAL_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Database</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_SERVICE_T__DATABASE = AjiMLPackage.FUNCTIONAL_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Containerized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_SERVICE_T__CONTAINERIZED = AjiMLPackage.FUNCTIONAL_SERVICE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Functional Service T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_SERVICE_T_FEATURE_COUNT = AjiMLPackage.FUNCTIONAL_SERVICE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Functional Service T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_SERVICE_T_OPERATION_COUNT = AjiMLPackage.FUNCTIONAL_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ajiMLT.impl.DiscoveryServiceTImpl <em>Discovery Service T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiMLT.impl.DiscoveryServiceTImpl
	 * @see ajiMLT.impl.AjiMLTPackageImpl#getDiscoveryServiceT()
	 * @generated
	 */
	int DISCOVERY_SERVICE_T = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_SERVICE_T__NAME = AjiMLPackage.DISCOVERY_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_SERVICE_T__PORT = AjiMLPackage.DISCOVERY_SERVICE__PORT;

	/**
	 * The feature id for the '<em><b>Load Balanced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_SERVICE_T__LOAD_BALANCED = AjiMLPackage.DISCOVERY_SERVICE__LOAD_BALANCED;

	/**
	 * The feature id for the '<em><b>Circuit Breaker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_SERVICE_T__CIRCUIT_BREAKER = AjiMLPackage.DISCOVERY_SERVICE__CIRCUIT_BREAKER;

	/**
	 * The feature id for the '<em><b>Discovered By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_SERVICE_T__DISCOVERED_BY = AjiMLPackage.DISCOVERY_SERVICE__DISCOVERED_BY;

	/**
	 * The feature id for the '<em><b>Configured By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_SERVICE_T__CONFIGURED_BY = AjiMLPackage.DISCOVERY_SERVICE__CONFIGURED_BY;

	/**
	 * The feature id for the '<em><b>Secured By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_SERVICE_T__SECURED_BY = AjiMLPackage.DISCOVERY_SERVICE__SECURED_BY;

	/**
	 * The feature id for the '<em><b>Discovered Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_SERVICE_T__DISCOVERED_SERVICES = AjiMLPackage.DISCOVERY_SERVICE__DISCOVERED_SERVICES;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_SERVICE_T__GENERATOR = AjiMLPackage.DISCOVERY_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Discovery Service T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_SERVICE_T_FEATURE_COUNT = AjiMLPackage.DISCOVERY_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Discovery Service T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_SERVICE_T_OPERATION_COUNT = AjiMLPackage.DISCOVERY_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ajiMLT.impl.APIServiceTImpl <em>API Service T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiMLT.impl.APIServiceTImpl
	 * @see ajiMLT.impl.AjiMLTPackageImpl#getAPIServiceT()
	 * @generated
	 */
	int API_SERVICE_T = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_SERVICE_T__NAME = AjiMLPackage.API_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_SERVICE_T__PORT = AjiMLPackage.API_SERVICE__PORT;

	/**
	 * The feature id for the '<em><b>Load Balanced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_SERVICE_T__LOAD_BALANCED = AjiMLPackage.API_SERVICE__LOAD_BALANCED;

	/**
	 * The feature id for the '<em><b>Circuit Breaker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_SERVICE_T__CIRCUIT_BREAKER = AjiMLPackage.API_SERVICE__CIRCUIT_BREAKER;

	/**
	 * The feature id for the '<em><b>Discovered By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_SERVICE_T__DISCOVERED_BY = AjiMLPackage.API_SERVICE__DISCOVERED_BY;

	/**
	 * The feature id for the '<em><b>Configured By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_SERVICE_T__CONFIGURED_BY = AjiMLPackage.API_SERVICE__CONFIGURED_BY;

	/**
	 * The feature id for the '<em><b>Secured By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_SERVICE_T__SECURED_BY = AjiMLPackage.API_SERVICE__SECURED_BY;

	/**
	 * The feature id for the '<em><b>Exposed Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_SERVICE_T__EXPOSED_SERVICES = AjiMLPackage.API_SERVICE__EXPOSED_SERVICES;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_SERVICE_T__GENERATOR = AjiMLPackage.API_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>API Service T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_SERVICE_T_FEATURE_COUNT = AjiMLPackage.API_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>API Service T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_SERVICE_T_OPERATION_COUNT = AjiMLPackage.API_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ajiMLT.impl.ConfigurationServiceTImpl <em>Configuration Service T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiMLT.impl.ConfigurationServiceTImpl
	 * @see ajiMLT.impl.AjiMLTPackageImpl#getConfigurationServiceT()
	 * @generated
	 */
	int CONFIGURATION_SERVICE_T = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SERVICE_T__NAME = AjiMLPackage.CONFIGURATION_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SERVICE_T__PORT = AjiMLPackage.CONFIGURATION_SERVICE__PORT;

	/**
	 * The feature id for the '<em><b>Load Balanced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SERVICE_T__LOAD_BALANCED = AjiMLPackage.CONFIGURATION_SERVICE__LOAD_BALANCED;

	/**
	 * The feature id for the '<em><b>Circuit Breaker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SERVICE_T__CIRCUIT_BREAKER = AjiMLPackage.CONFIGURATION_SERVICE__CIRCUIT_BREAKER;

	/**
	 * The feature id for the '<em><b>Discovered By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SERVICE_T__DISCOVERED_BY = AjiMLPackage.CONFIGURATION_SERVICE__DISCOVERED_BY;

	/**
	 * The feature id for the '<em><b>Configured By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SERVICE_T__CONFIGURED_BY = AjiMLPackage.CONFIGURATION_SERVICE__CONFIGURED_BY;

	/**
	 * The feature id for the '<em><b>Secured By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SERVICE_T__SECURED_BY = AjiMLPackage.CONFIGURATION_SERVICE__SECURED_BY;

	/**
	 * The feature id for the '<em><b>Configured Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SERVICE_T__CONFIGURED_SERVICES = AjiMLPackage.CONFIGURATION_SERVICE__CONFIGURED_SERVICES;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SERVICE_T__GENERATOR = AjiMLPackage.CONFIGURATION_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Configuration Service T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SERVICE_T_FEATURE_COUNT = AjiMLPackage.CONFIGURATION_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Configuration Service T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SERVICE_T_OPERATION_COUNT = AjiMLPackage.CONFIGURATION_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ajiMLT.impl.SecurityServiceTImpl <em>Security Service T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiMLT.impl.SecurityServiceTImpl
	 * @see ajiMLT.impl.AjiMLTPackageImpl#getSecurityServiceT()
	 * @generated
	 */
	int SECURITY_SERVICE_T = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SERVICE_T__NAME = AjiMLPackage.SECURITY_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SERVICE_T__PORT = AjiMLPackage.SECURITY_SERVICE__PORT;

	/**
	 * The feature id for the '<em><b>Load Balanced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SERVICE_T__LOAD_BALANCED = AjiMLPackage.SECURITY_SERVICE__LOAD_BALANCED;

	/**
	 * The feature id for the '<em><b>Circuit Breaker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SERVICE_T__CIRCUIT_BREAKER = AjiMLPackage.SECURITY_SERVICE__CIRCUIT_BREAKER;

	/**
	 * The feature id for the '<em><b>Discovered By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SERVICE_T__DISCOVERED_BY = AjiMLPackage.SECURITY_SERVICE__DISCOVERED_BY;

	/**
	 * The feature id for the '<em><b>Configured By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SERVICE_T__CONFIGURED_BY = AjiMLPackage.SECURITY_SERVICE__CONFIGURED_BY;

	/**
	 * The feature id for the '<em><b>Secured By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SERVICE_T__SECURED_BY = AjiMLPackage.SECURITY_SERVICE__SECURED_BY;

	/**
	 * The feature id for the '<em><b>Secured Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SERVICE_T__SECURED_SERVICES = AjiMLPackage.SECURITY_SERVICE__SECURED_SERVICES;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SERVICE_T__GENERATOR = AjiMLPackage.SECURITY_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Certificate Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SERVICE_T__CERTIFICATE_PATH = AjiMLPackage.SECURITY_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Certificate Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SERVICE_T__CERTIFICATE_PASSWORD = AjiMLPackage.SECURITY_SERVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Key Pair Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SERVICE_T__KEY_PAIR_NAME = AjiMLPackage.SECURITY_SERVICE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Public Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SERVICE_T__PUBLIC_KEY = AjiMLPackage.SECURITY_SERVICE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Security Service T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SERVICE_T_FEATURE_COUNT = AjiMLPackage.SECURITY_SERVICE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Security Service T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SERVICE_T_OPERATION_COUNT = AjiMLPackage.SECURITY_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ajiMLT.impl.ServiceInterfaceTImpl <em>Service Interface T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiMLT.impl.ServiceInterfaceTImpl
	 * @see ajiMLT.impl.AjiMLTPackageImpl#getServiceInterfaceT()
	 * @generated
	 */
	int SERVICE_INTERFACE_T = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_T__NAME = AjiMLPackage.SERVICE_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_T__VERSION = AjiMLPackage.SERVICE_INTERFACE__VERSION;

	/**
	 * The feature id for the '<em><b>Abilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_T__ABILITIES = AjiMLPackage.SERVICE_INTERFACE__ABILITIES;

	/**
	 * The feature id for the '<em><b>Exposed To Gateways</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_T__EXPOSED_TO_GATEWAYS = AjiMLPackage.SERVICE_INTERFACE__EXPOSED_TO_GATEWAYS;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_T__OWNER = AjiMLPackage.SERVICE_INTERFACE__OWNER;

	/**
	 * The feature id for the '<em><b>Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_T__MECHANISM = AjiMLPackage.SERVICE_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service Interface T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_T_FEATURE_COUNT = AjiMLPackage.SERVICE_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Service Interface T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INTERFACE_T_OPERATION_COUNT = AjiMLPackage.SERVICE_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ajiMLT.impl.UserManagementServiceTImpl <em>User Management Service T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiMLT.impl.UserManagementServiceTImpl
	 * @see ajiMLT.impl.AjiMLTPackageImpl#getUserManagementServiceT()
	 * @generated
	 */
	int USER_MANAGEMENT_SERVICE_T = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_MANAGEMENT_SERVICE_T__NAME = AjiMLPackage.USER_MANAGEMENT_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_MANAGEMENT_SERVICE_T__PORT = AjiMLPackage.USER_MANAGEMENT_SERVICE__PORT;

	/**
	 * The feature id for the '<em><b>Load Balanced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_MANAGEMENT_SERVICE_T__LOAD_BALANCED = AjiMLPackage.USER_MANAGEMENT_SERVICE__LOAD_BALANCED;

	/**
	 * The feature id for the '<em><b>Circuit Breaker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_MANAGEMENT_SERVICE_T__CIRCUIT_BREAKER = AjiMLPackage.USER_MANAGEMENT_SERVICE__CIRCUIT_BREAKER;

	/**
	 * The feature id for the '<em><b>Discovered By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_MANAGEMENT_SERVICE_T__DISCOVERED_BY = AjiMLPackage.USER_MANAGEMENT_SERVICE__DISCOVERED_BY;

	/**
	 * The feature id for the '<em><b>Configured By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_MANAGEMENT_SERVICE_T__CONFIGURED_BY = AjiMLPackage.USER_MANAGEMENT_SERVICE__CONFIGURED_BY;

	/**
	 * The feature id for the '<em><b>Secured By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_MANAGEMENT_SERVICE_T__SECURED_BY = AjiMLPackage.USER_MANAGEMENT_SERVICE__SECURED_BY;

	/**
	 * The feature id for the '<em><b>Provides Users</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_MANAGEMENT_SERVICE_T__PROVIDES_USERS = AjiMLPackage.USER_MANAGEMENT_SERVICE__PROVIDES_USERS;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_MANAGEMENT_SERVICE_T__GENERATOR = AjiMLPackage.USER_MANAGEMENT_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>User Management Service T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_MANAGEMENT_SERVICE_T_FEATURE_COUNT = AjiMLPackage.USER_MANAGEMENT_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>User Management Service T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_MANAGEMENT_SERVICE_T_OPERATION_COUNT = AjiMLPackage.USER_MANAGEMENT_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ajiMLT.impl.SystemTImpl <em>System T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiMLT.impl.SystemTImpl
	 * @see ajiMLT.impl.AjiMLTPackageImpl#getSystemT()
	 * @generated
	 */
	int SYSTEM_T = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_T__NAME = AjiMLPackage.SYSTEM__NAME;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_T__SERVICES = AjiMLPackage.SYSTEM__SERVICES;

	/**
	 * The number of structural features of the '<em>System T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_T_FEATURE_COUNT = AjiMLPackage.SYSTEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>System T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_T_OPERATION_COUNT = AjiMLPackage.SYSTEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ajiMLT.impl.DataModelTImpl <em>Data Model T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiMLT.impl.DataModelTImpl
	 * @see ajiMLT.impl.AjiMLTPackageImpl#getDataModelT()
	 * @generated
	 */
	int DATA_MODEL_T = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL_T__NAME = AjiMLPackage.DATA_MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL_T__ENTITIES = AjiMLPackage.DATA_MODEL__ENTITIES;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL_T__OWNER = AjiMLPackage.DATA_MODEL__OWNER;

	/**
	 * The number of structural features of the '<em>Data Model T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL_T_FEATURE_COUNT = AjiMLPackage.DATA_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Model T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL_T_OPERATION_COUNT = AjiMLPackage.DATA_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ajiMLT.impl.EntityTImpl <em>Entity T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiMLT.impl.EntityTImpl
	 * @see ajiMLT.impl.AjiMLTPackageImpl#getEntityT()
	 * @generated
	 */
	int ENTITY_T = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_T__NAME = AjiMLPackage.ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_T__PARENT = AjiMLPackage.ENTITY__PARENT;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_T__ATTRIBUTES = AjiMLPackage.ENTITY__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_T__RELATIONS = AjiMLPackage.ENTITY__RELATIONS;

	/**
	 * The feature id for the '<em><b>Domain Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_T__DOMAIN_MODEL = AjiMLPackage.ENTITY__DOMAIN_MODEL;

	/**
	 * The number of structural features of the '<em>Entity T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_T_FEATURE_COUNT = AjiMLPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Entity T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_T_OPERATION_COUNT = AjiMLPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ajiMLT.impl.RelationTImpl <em>Relation T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiMLT.impl.RelationTImpl
	 * @see ajiMLT.impl.AjiMLTPackageImpl#getRelationT()
	 * @generated
	 */
	int RELATION_T = 10;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_T__MULTIPLICITY = AjiMLPackage.RELATION__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_T__NAME = AjiMLPackage.RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_T__SOURCE = AjiMLPackage.RELATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_T__TARGET = AjiMLPackage.RELATION__TARGET;

	/**
	 * The number of structural features of the '<em>Relation T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_T_FEATURE_COUNT = AjiMLPackage.RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Relation T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_T_OPERATION_COUNT = AjiMLPackage.RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ajiMLT.impl.CreateTImpl <em>Create T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiMLT.impl.CreateTImpl
	 * @see ajiMLT.impl.AjiMLTPackageImpl#getCreateT()
	 * @generated
	 */
	int CREATE_T = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_T__NAME = AjiMLPackage.CREATE__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_T__OWNER = AjiMLPackage.CREATE__OWNER;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_T__SUBJECT = AjiMLPackage.CREATE__SUBJECT;

	/**
	 * The number of structural features of the '<em>Create T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_T_FEATURE_COUNT = AjiMLPackage.CREATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_T_OPERATION_COUNT = AjiMLPackage.CREATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ajiMLT.impl.ReadTImpl <em>Read T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiMLT.impl.ReadTImpl
	 * @see ajiMLT.impl.AjiMLTPackageImpl#getReadT()
	 * @generated
	 */
	int READ_T = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_T__NAME = AjiMLPackage.READ__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_T__OWNER = AjiMLPackage.READ__OWNER;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_T__SUBJECT = AjiMLPackage.READ__SUBJECT;

	/**
	 * The number of structural features of the '<em>Read T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_T_FEATURE_COUNT = AjiMLPackage.READ_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Read T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_T_OPERATION_COUNT = AjiMLPackage.READ_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ajiMLT.impl.UpdateTImpl <em>Update T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiMLT.impl.UpdateTImpl
	 * @see ajiMLT.impl.AjiMLTPackageImpl#getUpdateT()
	 * @generated
	 */
	int UPDATE_T = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_T__NAME = AjiMLPackage.UPDATE__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_T__OWNER = AjiMLPackage.UPDATE__OWNER;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_T__SUBJECT = AjiMLPackage.UPDATE__SUBJECT;

	/**
	 * The number of structural features of the '<em>Update T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_T_FEATURE_COUNT = AjiMLPackage.UPDATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Update T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_T_OPERATION_COUNT = AjiMLPackage.UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ajiMLT.impl.DeleteTImpl <em>Delete T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiMLT.impl.DeleteTImpl
	 * @see ajiMLT.impl.AjiMLTPackageImpl#getDeleteT()
	 * @generated
	 */
	int DELETE_T = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_T__NAME = AjiMLPackage.DELETE__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_T__OWNER = AjiMLPackage.DELETE__OWNER;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_T__SUBJECT = AjiMLPackage.DELETE__SUBJECT;

	/**
	 * The number of structural features of the '<em>Delete T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_T_FEATURE_COUNT = AjiMLPackage.DELETE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Delete T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_T_OPERATION_COUNT = AjiMLPackage.DELETE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ajiMLT.impl.MultiReadTImpl <em>Multi Read T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiMLT.impl.MultiReadTImpl
	 * @see ajiMLT.impl.AjiMLTPackageImpl#getMultiReadT()
	 * @generated
	 */
	int MULTI_READ_T = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_READ_T__NAME = AjiMLPackage.MULTI_READ__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_READ_T__OWNER = AjiMLPackage.MULTI_READ__OWNER;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_READ_T__SUBJECT = AjiMLPackage.MULTI_READ__SUBJECT;

	/**
	 * The number of structural features of the '<em>Multi Read T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_READ_T_FEATURE_COUNT = AjiMLPackage.MULTI_READ_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Multi Read T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_READ_T_OPERATION_COUNT = AjiMLPackage.MULTI_READ_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ajiMLT.impl.CustomTImpl <em>Custom T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiMLT.impl.CustomTImpl
	 * @see ajiMLT.impl.AjiMLTPackageImpl#getCustomT()
	 * @generated
	 */
	int CUSTOM_T = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_T__NAME = AjiMLPackage.CUSTOM__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_T__OWNER = AjiMLPackage.CUSTOM__OWNER;

	/**
	 * The number of structural features of the '<em>Custom T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_T_FEATURE_COUNT = AjiMLPackage.CUSTOM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Custom T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_T_OPERATION_COUNT = AjiMLPackage.CUSTOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ajiMLT.impl.IntergerTImpl <em>Interger T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiMLT.impl.IntergerTImpl
	 * @see ajiMLT.impl.AjiMLTPackageImpl#getIntergerT()
	 * @generated
	 */
	int INTERGER_T = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERGER_T__NAME = AjiMLPackage.INTEGER__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERGER_T__TYPE = AjiMLPackage.INTEGER__TYPE;

	/**
	 * The number of structural features of the '<em>Interger T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERGER_T_FEATURE_COUNT = AjiMLPackage.INTEGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interger T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERGER_T_OPERATION_COUNT = AjiMLPackage.INTEGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ajiMLT.impl.BooleanTImpl <em>Boolean T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiMLT.impl.BooleanTImpl
	 * @see ajiMLT.impl.AjiMLTPackageImpl#getBooleanT()
	 * @generated
	 */
	int BOOLEAN_T = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_T__NAME = AjiMLPackage.BOOLEAN__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_T__TYPE = AjiMLPackage.BOOLEAN__TYPE;

	/**
	 * The number of structural features of the '<em>Boolean T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_T_FEATURE_COUNT = AjiMLPackage.BOOLEAN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_T_OPERATION_COUNT = AjiMLPackage.BOOLEAN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ajiMLT.impl.FloatTImpl <em>Float T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiMLT.impl.FloatTImpl
	 * @see ajiMLT.impl.AjiMLTPackageImpl#getFloatT()
	 * @generated
	 */
	int FLOAT_T = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_T__NAME = AjiMLPackage.FLOAT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_T__TYPE = AjiMLPackage.FLOAT__TYPE;

	/**
	 * The number of structural features of the '<em>Float T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_T_FEATURE_COUNT = AjiMLPackage.FLOAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Float T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_T_OPERATION_COUNT = AjiMLPackage.FLOAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ajiMLT.impl.StringTImpl <em>String T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiMLT.impl.StringTImpl
	 * @see ajiMLT.impl.AjiMLTPackageImpl#getStringT()
	 * @generated
	 */
	int STRING_T = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_T__NAME = AjiMLPackage.STRING__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_T__TYPE = AjiMLPackage.STRING__TYPE;

	/**
	 * The number of structural features of the '<em>String T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_T_FEATURE_COUNT = AjiMLPackage.STRING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>String T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_T_OPERATION_COUNT = AjiMLPackage.STRING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ajiMLT.impl.CharTImpl <em>Char T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiMLT.impl.CharTImpl
	 * @see ajiMLT.impl.AjiMLTPackageImpl#getCharT()
	 * @generated
	 */
	int CHAR_T = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_T__NAME = AjiMLPackage.CHAR__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_T__TYPE = AjiMLPackage.CHAR__TYPE;

	/**
	 * The number of structural features of the '<em>Char T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_T_FEATURE_COUNT = AjiMLPackage.CHAR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Char T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_T_OPERATION_COUNT = AjiMLPackage.CHAR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ajiMLT.EGenerator <em>EGenerator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiMLT.EGenerator
	 * @see ajiMLT.impl.AjiMLTPackageImpl#getEGenerator()
	 * @generated
	 */
	int EGENERATOR = 22;

	/**
	 * The meta object id for the '{@link ajiMLT.ECommunicationMechanism <em>ECommunication Mechanism</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiMLT.ECommunicationMechanism
	 * @see ajiMLT.impl.AjiMLTPackageImpl#getECommunicationMechanism()
	 * @generated
	 */
	int ECOMMUNICATION_MECHANISM = 23;

	/**
	 * The meta object id for the '{@link ajiMLT.EDatabase <em>EDatabase</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiMLT.EDatabase
	 * @see ajiMLT.impl.AjiMLTPackageImpl#getEDatabase()
	 * @generated
	 */
	int EDATABASE = 24;

	/**
	 * The meta object id for the '{@link ajiMLT.EMultiplicity <em>EMultiplicity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ajiMLT.EMultiplicity
	 * @see ajiMLT.impl.AjiMLTPackageImpl#getEMultiplicity()
	 * @generated
	 */
	int EMULTIPLICITY = 25;


	/**
	 * Returns the meta object for class '{@link ajiMLT.FunctionalServiceT <em>Functional Service T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Service T</em>'.
	 * @see ajiMLT.FunctionalServiceT
	 * @generated
	 */
	EClass getFunctionalServiceT();

	/**
	 * Returns the meta object for the attribute '{@link ajiMLT.FunctionalServiceT#getGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generator</em>'.
	 * @see ajiMLT.FunctionalServiceT#getGenerator()
	 * @see #getFunctionalServiceT()
	 * @generated
	 */
	EAttribute getFunctionalServiceT_Generator();

	/**
	 * Returns the meta object for the attribute '{@link ajiMLT.FunctionalServiceT#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database</em>'.
	 * @see ajiMLT.FunctionalServiceT#getDatabase()
	 * @see #getFunctionalServiceT()
	 * @generated
	 */
	EAttribute getFunctionalServiceT_Database();

	/**
	 * Returns the meta object for the attribute '{@link ajiMLT.FunctionalServiceT#getContainerized <em>Containerized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Containerized</em>'.
	 * @see ajiMLT.FunctionalServiceT#getContainerized()
	 * @see #getFunctionalServiceT()
	 * @generated
	 */
	EAttribute getFunctionalServiceT_Containerized();

	/**
	 * Returns the meta object for class '{@link ajiMLT.DiscoveryServiceT <em>Discovery Service T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discovery Service T</em>'.
	 * @see ajiMLT.DiscoveryServiceT
	 * @generated
	 */
	EClass getDiscoveryServiceT();

	/**
	 * Returns the meta object for the attribute '{@link ajiMLT.DiscoveryServiceT#getGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generator</em>'.
	 * @see ajiMLT.DiscoveryServiceT#getGenerator()
	 * @see #getDiscoveryServiceT()
	 * @generated
	 */
	EAttribute getDiscoveryServiceT_Generator();

	/**
	 * Returns the meta object for class '{@link ajiMLT.APIServiceT <em>API Service T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>API Service T</em>'.
	 * @see ajiMLT.APIServiceT
	 * @generated
	 */
	EClass getAPIServiceT();

	/**
	 * Returns the meta object for the attribute '{@link ajiMLT.APIServiceT#getGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generator</em>'.
	 * @see ajiMLT.APIServiceT#getGenerator()
	 * @see #getAPIServiceT()
	 * @generated
	 */
	EAttribute getAPIServiceT_Generator();

	/**
	 * Returns the meta object for class '{@link ajiMLT.ConfigurationServiceT <em>Configuration Service T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Service T</em>'.
	 * @see ajiMLT.ConfigurationServiceT
	 * @generated
	 */
	EClass getConfigurationServiceT();

	/**
	 * Returns the meta object for the attribute '{@link ajiMLT.ConfigurationServiceT#getGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generator</em>'.
	 * @see ajiMLT.ConfigurationServiceT#getGenerator()
	 * @see #getConfigurationServiceT()
	 * @generated
	 */
	EAttribute getConfigurationServiceT_Generator();

	/**
	 * Returns the meta object for class '{@link ajiMLT.SecurityServiceT <em>Security Service T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Service T</em>'.
	 * @see ajiMLT.SecurityServiceT
	 * @generated
	 */
	EClass getSecurityServiceT();

	/**
	 * Returns the meta object for the attribute '{@link ajiMLT.SecurityServiceT#getGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generator</em>'.
	 * @see ajiMLT.SecurityServiceT#getGenerator()
	 * @see #getSecurityServiceT()
	 * @generated
	 */
	EAttribute getSecurityServiceT_Generator();

	/**
	 * Returns the meta object for the attribute '{@link ajiMLT.SecurityServiceT#getCertificatePath <em>Certificate Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Certificate Path</em>'.
	 * @see ajiMLT.SecurityServiceT#getCertificatePath()
	 * @see #getSecurityServiceT()
	 * @generated
	 */
	EAttribute getSecurityServiceT_CertificatePath();

	/**
	 * Returns the meta object for the attribute '{@link ajiMLT.SecurityServiceT#getCertificatePassword <em>Certificate Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Certificate Password</em>'.
	 * @see ajiMLT.SecurityServiceT#getCertificatePassword()
	 * @see #getSecurityServiceT()
	 * @generated
	 */
	EAttribute getSecurityServiceT_CertificatePassword();

	/**
	 * Returns the meta object for the attribute '{@link ajiMLT.SecurityServiceT#getKeyPairName <em>Key Pair Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Pair Name</em>'.
	 * @see ajiMLT.SecurityServiceT#getKeyPairName()
	 * @see #getSecurityServiceT()
	 * @generated
	 */
	EAttribute getSecurityServiceT_KeyPairName();

	/**
	 * Returns the meta object for the attribute '{@link ajiMLT.SecurityServiceT#getPublicKey <em>Public Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public Key</em>'.
	 * @see ajiMLT.SecurityServiceT#getPublicKey()
	 * @see #getSecurityServiceT()
	 * @generated
	 */
	EAttribute getSecurityServiceT_PublicKey();

	/**
	 * Returns the meta object for class '{@link ajiMLT.ServiceInterfaceT <em>Service Interface T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Interface T</em>'.
	 * @see ajiMLT.ServiceInterfaceT
	 * @generated
	 */
	EClass getServiceInterfaceT();

	/**
	 * Returns the meta object for the attribute '{@link ajiMLT.ServiceInterfaceT#getMechanism <em>Mechanism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mechanism</em>'.
	 * @see ajiMLT.ServiceInterfaceT#getMechanism()
	 * @see #getServiceInterfaceT()
	 * @generated
	 */
	EAttribute getServiceInterfaceT_Mechanism();

	/**
	 * Returns the meta object for class '{@link ajiMLT.UserManagementServiceT <em>User Management Service T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Management Service T</em>'.
	 * @see ajiMLT.UserManagementServiceT
	 * @generated
	 */
	EClass getUserManagementServiceT();

	/**
	 * Returns the meta object for the attribute '{@link ajiMLT.UserManagementServiceT#getGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generator</em>'.
	 * @see ajiMLT.UserManagementServiceT#getGenerator()
	 * @see #getUserManagementServiceT()
	 * @generated
	 */
	EAttribute getUserManagementServiceT_Generator();

	/**
	 * Returns the meta object for class '{@link ajiMLT.SystemT <em>System T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System T</em>'.
	 * @see ajiMLT.SystemT
	 * @generated
	 */
	EClass getSystemT();

	/**
	 * Returns the meta object for class '{@link ajiMLT.DataModelT <em>Data Model T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Model T</em>'.
	 * @see ajiMLT.DataModelT
	 * @generated
	 */
	EClass getDataModelT();

	/**
	 * Returns the meta object for class '{@link ajiMLT.EntityT <em>Entity T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity T</em>'.
	 * @see ajiMLT.EntityT
	 * @generated
	 */
	EClass getEntityT();

	/**
	 * Returns the meta object for class '{@link ajiMLT.RelationT <em>Relation T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation T</em>'.
	 * @see ajiMLT.RelationT
	 * @generated
	 */
	EClass getRelationT();

	/**
	 * Returns the meta object for class '{@link ajiMLT.CreateT <em>Create T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create T</em>'.
	 * @see ajiMLT.CreateT
	 * @generated
	 */
	EClass getCreateT();

	/**
	 * Returns the meta object for class '{@link ajiMLT.ReadT <em>Read T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read T</em>'.
	 * @see ajiMLT.ReadT
	 * @generated
	 */
	EClass getReadT();

	/**
	 * Returns the meta object for class '{@link ajiMLT.UpdateT <em>Update T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update T</em>'.
	 * @see ajiMLT.UpdateT
	 * @generated
	 */
	EClass getUpdateT();

	/**
	 * Returns the meta object for class '{@link ajiMLT.DeleteT <em>Delete T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete T</em>'.
	 * @see ajiMLT.DeleteT
	 * @generated
	 */
	EClass getDeleteT();

	/**
	 * Returns the meta object for class '{@link ajiMLT.MultiReadT <em>Multi Read T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Read T</em>'.
	 * @see ajiMLT.MultiReadT
	 * @generated
	 */
	EClass getMultiReadT();

	/**
	 * Returns the meta object for class '{@link ajiMLT.CustomT <em>Custom T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom T</em>'.
	 * @see ajiMLT.CustomT
	 * @generated
	 */
	EClass getCustomT();

	/**
	 * Returns the meta object for class '{@link ajiMLT.IntergerT <em>Interger T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interger T</em>'.
	 * @see ajiMLT.IntergerT
	 * @generated
	 */
	EClass getIntergerT();

	/**
	 * Returns the meta object for class '{@link ajiMLT.BooleanT <em>Boolean T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean T</em>'.
	 * @see ajiMLT.BooleanT
	 * @generated
	 */
	EClass getBooleanT();

	/**
	 * Returns the meta object for class '{@link ajiMLT.FloatT <em>Float T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float T</em>'.
	 * @see ajiMLT.FloatT
	 * @generated
	 */
	EClass getFloatT();

	/**
	 * Returns the meta object for class '{@link ajiMLT.StringT <em>String T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String T</em>'.
	 * @see ajiMLT.StringT
	 * @generated
	 */
	EClass getStringT();

	/**
	 * Returns the meta object for class '{@link ajiMLT.CharT <em>Char T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Char T</em>'.
	 * @see ajiMLT.CharT
	 * @generated
	 */
	EClass getCharT();

	/**
	 * Returns the meta object for enum '{@link ajiMLT.EGenerator <em>EGenerator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EGenerator</em>'.
	 * @see ajiMLT.EGenerator
	 * @generated
	 */
	EEnum getEGenerator();

	/**
	 * Returns the meta object for enum '{@link ajiMLT.ECommunicationMechanism <em>ECommunication Mechanism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ECommunication Mechanism</em>'.
	 * @see ajiMLT.ECommunicationMechanism
	 * @generated
	 */
	EEnum getECommunicationMechanism();

	/**
	 * Returns the meta object for enum '{@link ajiMLT.EDatabase <em>EDatabase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EDatabase</em>'.
	 * @see ajiMLT.EDatabase
	 * @generated
	 */
	EEnum getEDatabase();

	/**
	 * Returns the meta object for enum '{@link ajiMLT.EMultiplicity <em>EMultiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EMultiplicity</em>'.
	 * @see ajiMLT.EMultiplicity
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
	AjiMLTFactory getAjiMLTFactory();

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
		 * The meta object literal for the '{@link ajiMLT.impl.FunctionalServiceTImpl <em>Functional Service T</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiMLT.impl.FunctionalServiceTImpl
		 * @see ajiMLT.impl.AjiMLTPackageImpl#getFunctionalServiceT()
		 * @generated
		 */
		EClass FUNCTIONAL_SERVICE_T = eINSTANCE.getFunctionalServiceT();

		/**
		 * The meta object literal for the '<em><b>Generator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTIONAL_SERVICE_T__GENERATOR = eINSTANCE.getFunctionalServiceT_Generator();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTIONAL_SERVICE_T__DATABASE = eINSTANCE.getFunctionalServiceT_Database();

		/**
		 * The meta object literal for the '<em><b>Containerized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTIONAL_SERVICE_T__CONTAINERIZED = eINSTANCE.getFunctionalServiceT_Containerized();

		/**
		 * The meta object literal for the '{@link ajiMLT.impl.DiscoveryServiceTImpl <em>Discovery Service T</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiMLT.impl.DiscoveryServiceTImpl
		 * @see ajiMLT.impl.AjiMLTPackageImpl#getDiscoveryServiceT()
		 * @generated
		 */
		EClass DISCOVERY_SERVICE_T = eINSTANCE.getDiscoveryServiceT();

		/**
		 * The meta object literal for the '<em><b>Generator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOVERY_SERVICE_T__GENERATOR = eINSTANCE.getDiscoveryServiceT_Generator();

		/**
		 * The meta object literal for the '{@link ajiMLT.impl.APIServiceTImpl <em>API Service T</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiMLT.impl.APIServiceTImpl
		 * @see ajiMLT.impl.AjiMLTPackageImpl#getAPIServiceT()
		 * @generated
		 */
		EClass API_SERVICE_T = eINSTANCE.getAPIServiceT();

		/**
		 * The meta object literal for the '<em><b>Generator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_SERVICE_T__GENERATOR = eINSTANCE.getAPIServiceT_Generator();

		/**
		 * The meta object literal for the '{@link ajiMLT.impl.ConfigurationServiceTImpl <em>Configuration Service T</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiMLT.impl.ConfigurationServiceTImpl
		 * @see ajiMLT.impl.AjiMLTPackageImpl#getConfigurationServiceT()
		 * @generated
		 */
		EClass CONFIGURATION_SERVICE_T = eINSTANCE.getConfigurationServiceT();

		/**
		 * The meta object literal for the '<em><b>Generator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_SERVICE_T__GENERATOR = eINSTANCE.getConfigurationServiceT_Generator();

		/**
		 * The meta object literal for the '{@link ajiMLT.impl.SecurityServiceTImpl <em>Security Service T</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiMLT.impl.SecurityServiceTImpl
		 * @see ajiMLT.impl.AjiMLTPackageImpl#getSecurityServiceT()
		 * @generated
		 */
		EClass SECURITY_SERVICE_T = eINSTANCE.getSecurityServiceT();

		/**
		 * The meta object literal for the '<em><b>Generator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_SERVICE_T__GENERATOR = eINSTANCE.getSecurityServiceT_Generator();

		/**
		 * The meta object literal for the '<em><b>Certificate Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_SERVICE_T__CERTIFICATE_PATH = eINSTANCE.getSecurityServiceT_CertificatePath();

		/**
		 * The meta object literal for the '<em><b>Certificate Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_SERVICE_T__CERTIFICATE_PASSWORD = eINSTANCE.getSecurityServiceT_CertificatePassword();

		/**
		 * The meta object literal for the '<em><b>Key Pair Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_SERVICE_T__KEY_PAIR_NAME = eINSTANCE.getSecurityServiceT_KeyPairName();

		/**
		 * The meta object literal for the '<em><b>Public Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_SERVICE_T__PUBLIC_KEY = eINSTANCE.getSecurityServiceT_PublicKey();

		/**
		 * The meta object literal for the '{@link ajiMLT.impl.ServiceInterfaceTImpl <em>Service Interface T</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiMLT.impl.ServiceInterfaceTImpl
		 * @see ajiMLT.impl.AjiMLTPackageImpl#getServiceInterfaceT()
		 * @generated
		 */
		EClass SERVICE_INTERFACE_T = eINSTANCE.getServiceInterfaceT();

		/**
		 * The meta object literal for the '<em><b>Mechanism</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_INTERFACE_T__MECHANISM = eINSTANCE.getServiceInterfaceT_Mechanism();

		/**
		 * The meta object literal for the '{@link ajiMLT.impl.UserManagementServiceTImpl <em>User Management Service T</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiMLT.impl.UserManagementServiceTImpl
		 * @see ajiMLT.impl.AjiMLTPackageImpl#getUserManagementServiceT()
		 * @generated
		 */
		EClass USER_MANAGEMENT_SERVICE_T = eINSTANCE.getUserManagementServiceT();

		/**
		 * The meta object literal for the '<em><b>Generator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_MANAGEMENT_SERVICE_T__GENERATOR = eINSTANCE.getUserManagementServiceT_Generator();

		/**
		 * The meta object literal for the '{@link ajiMLT.impl.SystemTImpl <em>System T</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiMLT.impl.SystemTImpl
		 * @see ajiMLT.impl.AjiMLTPackageImpl#getSystemT()
		 * @generated
		 */
		EClass SYSTEM_T = eINSTANCE.getSystemT();

		/**
		 * The meta object literal for the '{@link ajiMLT.impl.DataModelTImpl <em>Data Model T</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiMLT.impl.DataModelTImpl
		 * @see ajiMLT.impl.AjiMLTPackageImpl#getDataModelT()
		 * @generated
		 */
		EClass DATA_MODEL_T = eINSTANCE.getDataModelT();

		/**
		 * The meta object literal for the '{@link ajiMLT.impl.EntityTImpl <em>Entity T</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiMLT.impl.EntityTImpl
		 * @see ajiMLT.impl.AjiMLTPackageImpl#getEntityT()
		 * @generated
		 */
		EClass ENTITY_T = eINSTANCE.getEntityT();

		/**
		 * The meta object literal for the '{@link ajiMLT.impl.RelationTImpl <em>Relation T</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiMLT.impl.RelationTImpl
		 * @see ajiMLT.impl.AjiMLTPackageImpl#getRelationT()
		 * @generated
		 */
		EClass RELATION_T = eINSTANCE.getRelationT();

		/**
		 * The meta object literal for the '{@link ajiMLT.impl.CreateTImpl <em>Create T</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiMLT.impl.CreateTImpl
		 * @see ajiMLT.impl.AjiMLTPackageImpl#getCreateT()
		 * @generated
		 */
		EClass CREATE_T = eINSTANCE.getCreateT();

		/**
		 * The meta object literal for the '{@link ajiMLT.impl.ReadTImpl <em>Read T</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiMLT.impl.ReadTImpl
		 * @see ajiMLT.impl.AjiMLTPackageImpl#getReadT()
		 * @generated
		 */
		EClass READ_T = eINSTANCE.getReadT();

		/**
		 * The meta object literal for the '{@link ajiMLT.impl.UpdateTImpl <em>Update T</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiMLT.impl.UpdateTImpl
		 * @see ajiMLT.impl.AjiMLTPackageImpl#getUpdateT()
		 * @generated
		 */
		EClass UPDATE_T = eINSTANCE.getUpdateT();

		/**
		 * The meta object literal for the '{@link ajiMLT.impl.DeleteTImpl <em>Delete T</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiMLT.impl.DeleteTImpl
		 * @see ajiMLT.impl.AjiMLTPackageImpl#getDeleteT()
		 * @generated
		 */
		EClass DELETE_T = eINSTANCE.getDeleteT();

		/**
		 * The meta object literal for the '{@link ajiMLT.impl.MultiReadTImpl <em>Multi Read T</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiMLT.impl.MultiReadTImpl
		 * @see ajiMLT.impl.AjiMLTPackageImpl#getMultiReadT()
		 * @generated
		 */
		EClass MULTI_READ_T = eINSTANCE.getMultiReadT();

		/**
		 * The meta object literal for the '{@link ajiMLT.impl.CustomTImpl <em>Custom T</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiMLT.impl.CustomTImpl
		 * @see ajiMLT.impl.AjiMLTPackageImpl#getCustomT()
		 * @generated
		 */
		EClass CUSTOM_T = eINSTANCE.getCustomT();

		/**
		 * The meta object literal for the '{@link ajiMLT.impl.IntergerTImpl <em>Interger T</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiMLT.impl.IntergerTImpl
		 * @see ajiMLT.impl.AjiMLTPackageImpl#getIntergerT()
		 * @generated
		 */
		EClass INTERGER_T = eINSTANCE.getIntergerT();

		/**
		 * The meta object literal for the '{@link ajiMLT.impl.BooleanTImpl <em>Boolean T</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiMLT.impl.BooleanTImpl
		 * @see ajiMLT.impl.AjiMLTPackageImpl#getBooleanT()
		 * @generated
		 */
		EClass BOOLEAN_T = eINSTANCE.getBooleanT();

		/**
		 * The meta object literal for the '{@link ajiMLT.impl.FloatTImpl <em>Float T</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiMLT.impl.FloatTImpl
		 * @see ajiMLT.impl.AjiMLTPackageImpl#getFloatT()
		 * @generated
		 */
		EClass FLOAT_T = eINSTANCE.getFloatT();

		/**
		 * The meta object literal for the '{@link ajiMLT.impl.StringTImpl <em>String T</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiMLT.impl.StringTImpl
		 * @see ajiMLT.impl.AjiMLTPackageImpl#getStringT()
		 * @generated
		 */
		EClass STRING_T = eINSTANCE.getStringT();

		/**
		 * The meta object literal for the '{@link ajiMLT.impl.CharTImpl <em>Char T</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiMLT.impl.CharTImpl
		 * @see ajiMLT.impl.AjiMLTPackageImpl#getCharT()
		 * @generated
		 */
		EClass CHAR_T = eINSTANCE.getCharT();

		/**
		 * The meta object literal for the '{@link ajiMLT.EGenerator <em>EGenerator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiMLT.EGenerator
		 * @see ajiMLT.impl.AjiMLTPackageImpl#getEGenerator()
		 * @generated
		 */
		EEnum EGENERATOR = eINSTANCE.getEGenerator();

		/**
		 * The meta object literal for the '{@link ajiMLT.ECommunicationMechanism <em>ECommunication Mechanism</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiMLT.ECommunicationMechanism
		 * @see ajiMLT.impl.AjiMLTPackageImpl#getECommunicationMechanism()
		 * @generated
		 */
		EEnum ECOMMUNICATION_MECHANISM = eINSTANCE.getECommunicationMechanism();

		/**
		 * The meta object literal for the '{@link ajiMLT.EDatabase <em>EDatabase</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiMLT.EDatabase
		 * @see ajiMLT.impl.AjiMLTPackageImpl#getEDatabase()
		 * @generated
		 */
		EEnum EDATABASE = eINSTANCE.getEDatabase();

		/**
		 * The meta object literal for the '{@link ajiMLT.EMultiplicity <em>EMultiplicity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ajiMLT.EMultiplicity
		 * @see ajiMLT.impl.AjiMLTPackageImpl#getEMultiplicity()
		 * @generated
		 */
		EEnum EMULTIPLICITY = eINSTANCE.getEMultiplicity();

	}

} //AjiMLTPackage
