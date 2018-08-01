/**
 */
package ajiMLT.impl;

import ajiML.AjiMLPackage;

import ajiML.impl.AjiMLPackageImpl;

import ajiMLT.APIServiceT;
import ajiMLT.AjiMLTFactory;
import ajiMLT.AjiMLTPackage;
import ajiMLT.BooleanT;
import ajiMLT.CharT;
import ajiMLT.ConfigurationServiceT;
import ajiMLT.CreateT;
import ajiMLT.CustomT;
import ajiMLT.DataModelT;
import ajiMLT.DateT;
import ajiMLT.DeleteT;
import ajiMLT.DiscoveryServiceT;
import ajiMLT.ECommunicationMechanism;
import ajiMLT.EContainer;
import ajiMLT.EDatabase;
import ajiMLT.EEntitySpecifier;
import ajiMLT.EGenerator;
import ajiMLT.EMultiplicity;
import ajiMLT.EntityT;
import ajiMLT.FloatT;
import ajiMLT.FunctionalServiceT;
import ajiMLT.GeneratorDescriptor;
import ajiMLT.IntegerT;
import ajiMLT.LongT;
import ajiMLT.MultiReadT;
import ajiMLT.ReadT;
import ajiMLT.RelationT;
import ajiMLT.SecurityServiceT;
import ajiMLT.ServiceInterfaceT;
import ajiMLT.StringT;
import ajiMLT.SystemT;
import ajiMLT.UpdateT;
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
	private EClass generatorDescriptorEClass = null;

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
	private EClass dataModelTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiReadTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass longTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTEClass = null;

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
	private EEnum eContainerEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eMultiplicityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eEntitySpecifierEEnum = null;

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
		Object registeredAjiMLTPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AjiMLTPackageImpl theAjiMLTPackage = registeredAjiMLTPackage instanceof AjiMLTPackageImpl ? (AjiMLTPackageImpl)registeredAjiMLTPackage : new AjiMLTPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AjiMLPackage.eNS_URI);
		AjiMLPackageImpl theAjiMLPackage = (AjiMLPackageImpl)(registeredPackage instanceof AjiMLPackageImpl ? registeredPackage : AjiMLPackage.eINSTANCE);

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
	public EClass getGeneratorDescriptor() {
		return generatorDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneratorDescriptor_Generator() {
		return (EAttribute)generatorDescriptorEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getFunctionalServiceT_Database() {
		return (EAttribute)functionalServiceTEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionalServiceT_Containerized() {
		return (EAttribute)functionalServiceTEClass.getEStructuralFeatures().get(1);
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
	public EClass getAPIServiceT() {
		return apiServiceTEClass;
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
	public EClass getSecurityServiceT() {
		return securityServiceTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityServiceT_CertificatePath() {
		return (EAttribute)securityServiceTEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityServiceT_CertificatePassword() {
		return (EAttribute)securityServiceTEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityServiceT_KeyPairName() {
		return (EAttribute)securityServiceTEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityServiceT_PublicKey() {
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
	public EClass getSystemT() {
		return systemTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataModelT() {
		return dataModelTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityT() {
		return entityTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityT_Type() {
		return (EAttribute)entityTEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationT() {
		return relationTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateT() {
		return createTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadT() {
		return readTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateT() {
		return updateTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeleteT() {
		return deleteTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiReadT() {
		return multiReadTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomT() {
		return customTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerT() {
		return integerTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanT() {
		return booleanTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloatT() {
		return floatTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringT() {
		return stringTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharT() {
		return charTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLongT() {
		return longTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateT() {
		return dateTEClass;
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
	public EEnum getEContainer() {
		return eContainerEEnum;
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
	public EEnum getEEntitySpecifier() {
		return eEntitySpecifierEEnum;
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
		generatorDescriptorEClass = createEClass(GENERATOR_DESCRIPTOR);
		createEAttribute(generatorDescriptorEClass, GENERATOR_DESCRIPTOR__GENERATOR);

		functionalServiceTEClass = createEClass(FUNCTIONAL_SERVICE_T);
		createEAttribute(functionalServiceTEClass, FUNCTIONAL_SERVICE_T__DATABASE);
		createEAttribute(functionalServiceTEClass, FUNCTIONAL_SERVICE_T__CONTAINERIZED);

		discoveryServiceTEClass = createEClass(DISCOVERY_SERVICE_T);

		apiServiceTEClass = createEClass(API_SERVICE_T);

		configurationServiceTEClass = createEClass(CONFIGURATION_SERVICE_T);

		securityServiceTEClass = createEClass(SECURITY_SERVICE_T);
		createEAttribute(securityServiceTEClass, SECURITY_SERVICE_T__CERTIFICATE_PATH);
		createEAttribute(securityServiceTEClass, SECURITY_SERVICE_T__CERTIFICATE_PASSWORD);
		createEAttribute(securityServiceTEClass, SECURITY_SERVICE_T__KEY_PAIR_NAME);
		createEAttribute(securityServiceTEClass, SECURITY_SERVICE_T__PUBLIC_KEY);

		serviceInterfaceTEClass = createEClass(SERVICE_INTERFACE_T);
		createEAttribute(serviceInterfaceTEClass, SERVICE_INTERFACE_T__MECHANISM);

		userManagementServiceTEClass = createEClass(USER_MANAGEMENT_SERVICE_T);

		systemTEClass = createEClass(SYSTEM_T);

		dataModelTEClass = createEClass(DATA_MODEL_T);

		entityTEClass = createEClass(ENTITY_T);
		createEAttribute(entityTEClass, ENTITY_T__TYPE);

		relationTEClass = createEClass(RELATION_T);

		createTEClass = createEClass(CREATE_T);

		readTEClass = createEClass(READ_T);

		updateTEClass = createEClass(UPDATE_T);

		deleteTEClass = createEClass(DELETE_T);

		multiReadTEClass = createEClass(MULTI_READ_T);

		customTEClass = createEClass(CUSTOM_T);

		integerTEClass = createEClass(INTEGER_T);

		booleanTEClass = createEClass(BOOLEAN_T);

		floatTEClass = createEClass(FLOAT_T);

		stringTEClass = createEClass(STRING_T);

		charTEClass = createEClass(CHAR_T);

		longTEClass = createEClass(LONG_T);

		dateTEClass = createEClass(DATE_T);

		// Create enums
		eGeneratorEEnum = createEEnum(EGENERATOR);
		eCommunicationMechanismEEnum = createEEnum(ECOMMUNICATION_MECHANISM);
		eDatabaseEEnum = createEEnum(EDATABASE);
		eContainerEEnum = createEEnum(ECONTAINER);
		eMultiplicityEEnum = createEEnum(EMULTIPLICITY);
		eEntitySpecifierEEnum = createEEnum(EENTITY_SPECIFIER);
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
		functionalServiceTEClass.getESuperTypes().add(this.getGeneratorDescriptor());
		discoveryServiceTEClass.getESuperTypes().add(theAjiMLPackage.getDiscoveryService());
		discoveryServiceTEClass.getESuperTypes().add(this.getGeneratorDescriptor());
		apiServiceTEClass.getESuperTypes().add(theAjiMLPackage.getAPIService());
		apiServiceTEClass.getESuperTypes().add(this.getGeneratorDescriptor());
		configurationServiceTEClass.getESuperTypes().add(theAjiMLPackage.getConfigurationService());
		configurationServiceTEClass.getESuperTypes().add(this.getGeneratorDescriptor());
		securityServiceTEClass.getESuperTypes().add(theAjiMLPackage.getSecurityService());
		securityServiceTEClass.getESuperTypes().add(this.getGeneratorDescriptor());
		serviceInterfaceTEClass.getESuperTypes().add(theAjiMLPackage.getServiceInterface());
		userManagementServiceTEClass.getESuperTypes().add(theAjiMLPackage.getUserManagementService());
		userManagementServiceTEClass.getESuperTypes().add(this.getGeneratorDescriptor());
		systemTEClass.getESuperTypes().add(theAjiMLPackage.getSystem());
		dataModelTEClass.getESuperTypes().add(theAjiMLPackage.getDataModel());
		entityTEClass.getESuperTypes().add(theAjiMLPackage.getEntity());
		relationTEClass.getESuperTypes().add(theAjiMLPackage.getRelation());
		createTEClass.getESuperTypes().add(theAjiMLPackage.getCreate());
		readTEClass.getESuperTypes().add(theAjiMLPackage.getRead());
		updateTEClass.getESuperTypes().add(theAjiMLPackage.getUpdate());
		deleteTEClass.getESuperTypes().add(theAjiMLPackage.getDelete());
		multiReadTEClass.getESuperTypes().add(theAjiMLPackage.getMultiRead());
		customTEClass.getESuperTypes().add(theAjiMLPackage.getCustom());
		integerTEClass.getESuperTypes().add(theAjiMLPackage.getInteger());
		booleanTEClass.getESuperTypes().add(theAjiMLPackage.getBoolean());
		floatTEClass.getESuperTypes().add(theAjiMLPackage.getFloat());
		stringTEClass.getESuperTypes().add(theAjiMLPackage.getString());
		charTEClass.getESuperTypes().add(theAjiMLPackage.getChar());
		longTEClass.getESuperTypes().add(theAjiMLPackage.getLong());
		dateTEClass.getESuperTypes().add(theAjiMLPackage.getDate());

		// Initialize classes, features, and operations; add parameters
		initEClass(generatorDescriptorEClass, GeneratorDescriptor.class, "GeneratorDescriptor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeneratorDescriptor_Generator(), this.getEGenerator(), "generator", "SpringCloud", 1, 1, GeneratorDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionalServiceTEClass, FunctionalServiceT.class, "FunctionalServiceT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionalServiceT_Database(), this.getEDatabase(), "database", "MongoDB", 1, 1, FunctionalServiceT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionalServiceT_Containerized(), this.getEContainer(), "containerized", "None", 1, 1, FunctionalServiceT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(discoveryServiceTEClass, DiscoveryServiceT.class, "DiscoveryServiceT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(apiServiceTEClass, APIServiceT.class, "APIServiceT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(configurationServiceTEClass, ConfigurationServiceT.class, "ConfigurationServiceT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(securityServiceTEClass, SecurityServiceT.class, "SecurityServiceT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecurityServiceT_CertificatePath(), ecorePackage.getEString(), "certificatePath", null, 0, 1, SecurityServiceT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityServiceT_CertificatePassword(), ecorePackage.getEString(), "certificatePassword", null, 0, 1, SecurityServiceT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityServiceT_KeyPairName(), ecorePackage.getEString(), "KeyPairName", null, 0, 1, SecurityServiceT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityServiceT_PublicKey(), ecorePackage.getEString(), "publicKey", null, 0, 1, SecurityServiceT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceInterfaceTEClass, ServiceInterfaceT.class, "ServiceInterfaceT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceInterfaceT_Mechanism(), this.getECommunicationMechanism(), "mechanism", "RESTfulHTTP", 1, 1, ServiceInterfaceT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userManagementServiceTEClass, UserManagementServiceT.class, "UserManagementServiceT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemTEClass, SystemT.class, "SystemT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataModelTEClass, DataModelT.class, "DataModelT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entityTEClass, EntityT.class, "EntityT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntityT_Type(), this.getEEntitySpecifier(), "type", "NORMAL", 0, 1, EntityT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationTEClass, RelationT.class, "RelationT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(createTEClass, CreateT.class, "CreateT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(readTEClass, ReadT.class, "ReadT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(updateTEClass, UpdateT.class, "UpdateT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deleteTEClass, DeleteT.class, "DeleteT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiReadTEClass, MultiReadT.class, "MultiReadT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(customTEClass, CustomT.class, "CustomT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(integerTEClass, IntegerT.class, "IntegerT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanTEClass, BooleanT.class, "BooleanT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(floatTEClass, FloatT.class, "FloatT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringTEClass, StringT.class, "StringT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(charTEClass, CharT.class, "CharT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(longTEClass, LongT.class, "LongT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dateTEClass, DateT.class, "DateT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(eGeneratorEEnum, EGenerator.class, "EGenerator");
		addEEnumLiteral(eGeneratorEEnum, EGenerator.SPRING_CLOUD);

		initEEnum(eCommunicationMechanismEEnum, ECommunicationMechanism.class, "ECommunicationMechanism");
		addEEnumLiteral(eCommunicationMechanismEEnum, ECommunicationMechanism.RES_TFUL_HTTP);
		addEEnumLiteral(eCommunicationMechanismEEnum, ECommunicationMechanism.MQTT);

		initEEnum(eDatabaseEEnum, EDatabase.class, "EDatabase");
		addEEnumLiteral(eDatabaseEEnum, EDatabase.MONGO_DB);
		addEEnumLiteral(eDatabaseEEnum, EDatabase.MY_SQL);

		initEEnum(eContainerEEnum, EContainer.class, "EContainer");
		addEEnumLiteral(eContainerEEnum, EContainer.NONE);
		addEEnumLiteral(eContainerEEnum, EContainer.DOCKER);

		initEEnum(eMultiplicityEEnum, EMultiplicity.class, "EMultiplicity");
		addEEnumLiteral(eMultiplicityEEnum, EMultiplicity.ONE);
		addEEnumLiteral(eMultiplicityEEnum, EMultiplicity.MANY);

		initEEnum(eEntitySpecifierEEnum, EEntitySpecifier.class, "EEntitySpecifier");
		addEEnumLiteral(eEntitySpecifierEEnum, EEntitySpecifier.NORMAL);
		addEEnumLiteral(eEntitySpecifierEEnum, EEntitySpecifier.PROXY);
		addEEnumLiteral(eEntitySpecifierEEnum, EEntitySpecifier.DATATRANSFER);

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
