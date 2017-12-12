/**
 */
package ajiMLT.impl;

import ajiML.AjiMLPackage;

import ajiML.impl.AjiMLPackageImpl;

import ajiMLT.APIServiceT;
import ajiMLT.AjiMLTFactory;
import ajiMLT.AjiMLTPackage;
import ajiMLT.ConfigurationServiceT;
import ajiMLT.DiscoveryServiceT;
import ajiMLT.ECommunicationMechanism;
import ajiMLT.EDatabase;
import ajiMLT.EGenerator;
import ajiMLT.EMultiplicity;
import ajiMLT.FunctionalServiceT;
import ajiMLT.SecurityServiceT;
import ajiMLT.ServiceInterfaceT;
import ajiMLT.SystemT;
import ajiMLT.UserManagementServiceT;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AjiMLTPackageImpl extends EPackageImpl implements AjiMLTPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalServiceTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discoveryServiceTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apiServiceTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationServiceTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityServiceTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceInterfaceTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userManagementServiceTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eGeneratorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eCommunicationMechanismEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eDatabaseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eMultiplicityEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ajiMLT.AjiMLTPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AjiMLTPackageImpl() {
		super(eNS_URI, AjiMLTFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AjiMLTPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AjiMLTPackage init() {
		if (isInited) return (AjiMLTPackage)EPackage.Registry.INSTANCE.getEPackage(AjiMLTPackage.eNS_URI);

		// Obtain or create and register package
		AjiMLTPackageImpl theAjiMLTPackage = (AjiMLTPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AjiMLTPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AjiMLTPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		AjiMLPackageImpl theAjiMLPackage = (AjiMLPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AjiMLPackage.eNS_URI) instanceof AjiMLPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AjiMLPackage.eNS_URI) : AjiMLPackage.eINSTANCE);

		// Create package meta-data objects
		theAjiMLTPackage.createPackageContents();
		theAjiMLPackage.createPackageContents();

		// Initialize created meta-data
		theAjiMLTPackage.initializePackageContents();
		theAjiMLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAjiMLTPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AjiMLTPackage.eNS_URI, theAjiMLTPackage);
		return theAjiMLTPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalServiceT() {
		return functionalServiceTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionalServiceT_Generator() {
		return (EAttribute)functionalServiceTEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionalServiceT_Database() {
		return (EAttribute)functionalServiceTEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionalServiceT_Containerized() {
		return (EAttribute)functionalServiceTEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscoveryServiceT() {
		return discoveryServiceTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscoveryServiceT_Generator() {
		return (EAttribute)discoveryServiceTEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPIServiceT() {
		return apiServiceTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPIServiceT_Generator() {
		return (EAttribute)apiServiceTEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationServiceT() {
		return configurationServiceTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationServiceT_Generator() {
		return (EAttribute)configurationServiceTEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityServiceT() {
		return securityServiceTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityServiceT_Generator() {
		return (EAttribute)securityServiceTEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityServiceT_CertificatePath() {
		return (EAttribute)securityServiceTEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityServiceT_CertificatePassword() {
		return (EAttribute)securityServiceTEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityServiceT_KeyPairName() {
		return (EAttribute)securityServiceTEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceInterfaceT() {
		return serviceInterfaceTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceInterfaceT_Mechanism() {
		return (EAttribute)serviceInterfaceTEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserManagementServiceT() {
		return userManagementServiceTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserManagementServiceT_Generator() {
		return (EAttribute)userManagementServiceTEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemT() {
		return systemTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEGenerator() {
		return eGeneratorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getECommunicationMechanism() {
		return eCommunicationMechanismEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEDatabase() {
		return eDatabaseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEMultiplicity() {
		return eMultiplicityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AjiMLTFactory getAjiMLTFactory() {
		return (AjiMLTFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		functionalServiceTEClass = createEClass(FUNCTIONAL_SERVICE_T);
		createEAttribute(functionalServiceTEClass, FUNCTIONAL_SERVICE_T__GENERATOR);
		createEAttribute(functionalServiceTEClass, FUNCTIONAL_SERVICE_T__DATABASE);
		createEAttribute(functionalServiceTEClass, FUNCTIONAL_SERVICE_T__CONTAINERIZED);

		discoveryServiceTEClass = createEClass(DISCOVERY_SERVICE_T);
		createEAttribute(discoveryServiceTEClass, DISCOVERY_SERVICE_T__GENERATOR);

		apiServiceTEClass = createEClass(API_SERVICE_T);
		createEAttribute(apiServiceTEClass, API_SERVICE_T__GENERATOR);

		configurationServiceTEClass = createEClass(CONFIGURATION_SERVICE_T);
		createEAttribute(configurationServiceTEClass, CONFIGURATION_SERVICE_T__GENERATOR);

		securityServiceTEClass = createEClass(SECURITY_SERVICE_T);
		createEAttribute(securityServiceTEClass, SECURITY_SERVICE_T__GENERATOR);
		createEAttribute(securityServiceTEClass, SECURITY_SERVICE_T__CERTIFICATE_PATH);
		createEAttribute(securityServiceTEClass, SECURITY_SERVICE_T__CERTIFICATE_PASSWORD);
		createEAttribute(securityServiceTEClass, SECURITY_SERVICE_T__KEY_PAIR_NAME);

		serviceInterfaceTEClass = createEClass(SERVICE_INTERFACE_T);
		createEAttribute(serviceInterfaceTEClass, SERVICE_INTERFACE_T__MECHANISM);

		userManagementServiceTEClass = createEClass(USER_MANAGEMENT_SERVICE_T);
		createEAttribute(userManagementServiceTEClass, USER_MANAGEMENT_SERVICE_T__GENERATOR);

		systemTEClass = createEClass(SYSTEM_T);

		// Create enums
		eGeneratorEEnum = createEEnum(EGENERATOR);
		eCommunicationMechanismEEnum = createEEnum(ECOMMUNICATION_MECHANISM);
		eDatabaseEEnum = createEEnum(EDATABASE);
		eMultiplicityEEnum = createEEnum(EMULTIPLICITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		AjiMLPackage theAjiMLPackage = (AjiMLPackage)EPackage.Registry.INSTANCE.getEPackage(AjiMLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		functionalServiceTEClass.getESuperTypes().add(theAjiMLPackage.getFunctionalService());
		discoveryServiceTEClass.getESuperTypes().add(theAjiMLPackage.getDiscoveryService());
		apiServiceTEClass.getESuperTypes().add(theAjiMLPackage.getAPIService());
		configurationServiceTEClass.getESuperTypes().add(theAjiMLPackage.getConfigurationService());
		securityServiceTEClass.getESuperTypes().add(theAjiMLPackage.getSecurityService());
		serviceInterfaceTEClass.getESuperTypes().add(theAjiMLPackage.getServiceInterface());
		userManagementServiceTEClass.getESuperTypes().add(theAjiMLPackage.getUserManagementService());
		systemTEClass.getESuperTypes().add(theAjiMLPackage.getSystem());

		// Initialize classes, features, and operations; add parameters
		initEClass(functionalServiceTEClass, FunctionalServiceT.class, "FunctionalServiceT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionalServiceT_Generator(), this.getEGenerator(), "generator", "SpringCloud", 1, 1, FunctionalServiceT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionalServiceT_Database(), this.getEDatabase(), "database", "MongoDB", 1, 1, FunctionalServiceT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionalServiceT_Containerized(), ecorePackage.getEBooleanObject(), "containerized", "false", 0, 1, FunctionalServiceT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(discoveryServiceTEClass, DiscoveryServiceT.class, "DiscoveryServiceT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiscoveryServiceT_Generator(), this.getEGenerator(), "generator", "SpringCloud", 1, 1, DiscoveryServiceT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apiServiceTEClass, APIServiceT.class, "APIServiceT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAPIServiceT_Generator(), this.getEGenerator(), "generator", "SpringCloud", 1, 1, APIServiceT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationServiceTEClass, ConfigurationServiceT.class, "ConfigurationServiceT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfigurationServiceT_Generator(), this.getEGenerator(), "generator", "SpringCloud", 1, 1, ConfigurationServiceT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityServiceTEClass, SecurityServiceT.class, "SecurityServiceT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecurityServiceT_Generator(), this.getEGenerator(), "generator", "SpringCloud", 1, 1, SecurityServiceT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityServiceT_CertificatePath(), ecorePackage.getEString(), "certificatePath", null, 0, 1, SecurityServiceT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityServiceT_CertificatePassword(), ecorePackage.getEString(), "certificatePassword", null, 0, 1, SecurityServiceT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityServiceT_KeyPairName(), ecorePackage.getEString(), "KeyPairName", null, 0, 1, SecurityServiceT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceInterfaceTEClass, ServiceInterfaceT.class, "ServiceInterfaceT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceInterfaceT_Mechanism(), this.getECommunicationMechanism(), "mechanism", "RESTfulHTTP", 1, 1, ServiceInterfaceT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userManagementServiceTEClass, UserManagementServiceT.class, "UserManagementServiceT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserManagementServiceT_Generator(), this.getEGenerator(), "generator", "SpringCloud", 1, 1, UserManagementServiceT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemTEClass, SystemT.class, "SystemT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(eGeneratorEEnum, EGenerator.class, "EGenerator");
		addEEnumLiteral(eGeneratorEEnum, EGenerator.SPRING_CLOUD);

		initEEnum(eCommunicationMechanismEEnum, ECommunicationMechanism.class, "ECommunicationMechanism");
		addEEnumLiteral(eCommunicationMechanismEEnum, ECommunicationMechanism.RES_TFUL_HTTP);
		addEEnumLiteral(eCommunicationMechanismEEnum, ECommunicationMechanism.PUBLISH_SUBSCRIBE);

		initEEnum(eDatabaseEEnum, EDatabase.class, "EDatabase");
		addEEnumLiteral(eDatabaseEEnum, EDatabase.MONGO_DB);
		addEEnumLiteral(eDatabaseEEnum, EDatabase.MY_SQL);

		initEEnum(eMultiplicityEEnum, EMultiplicity.class, "EMultiplicity");
		addEEnumLiteral(eMultiplicityEEnum, EMultiplicity.ONE);
		addEEnumLiteral(eMultiplicityEEnum, EMultiplicity.MANY);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ajiML", "ajiML.ecore#/"
		   });
	}

} //AjiMLTPackageImpl
