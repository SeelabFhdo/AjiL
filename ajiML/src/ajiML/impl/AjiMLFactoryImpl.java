/**
 */
package ajiML.impl;

import ajiML.APIService;
import ajiML.AjiMLFactory;
import ajiML.AjiMLPackage;
import ajiML.Char;
import ajiML.ConfigurationService;
import ajiML.Create;
import ajiML.Custom;
import ajiML.DataModel;
import ajiML.Date;
import ajiML.Delete;
import ajiML.DiscoveryService;
import ajiML.EMultiplicity;
import ajiML.Entity;
import ajiML.FunctionalService;
import ajiML.MultiRead;
import ajiML.Read;
import ajiML.Relation;
import ajiML.SecurityService;
import ajiML.ServiceInterface;
import ajiML.Update;
import ajiML.UserManagementService;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AjiMLFactoryImpl extends EFactoryImpl implements AjiMLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AjiMLFactory init() {
		try {
			AjiMLFactory theAjiMLFactory = (AjiMLFactory)EPackage.Registry.INSTANCE.getEFactory(AjiMLPackage.eNS_URI);
			if (theAjiMLFactory != null) {
				return theAjiMLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AjiMLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AjiMLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AjiMLPackage.SYSTEM: return createSystem();
			case AjiMLPackage.FUNCTIONAL_SERVICE: return createFunctionalService();
			case AjiMLPackage.DISCOVERY_SERVICE: return createDiscoveryService();
			case AjiMLPackage.API_SERVICE: return createAPIService();
			case AjiMLPackage.CONFIGURATION_SERVICE: return createConfigurationService();
			case AjiMLPackage.SECURITY_SERVICE: return createSecurityService();
			case AjiMLPackage.USER_MANAGEMENT_SERVICE: return createUserManagementService();
			case AjiMLPackage.SERVICE_INTERFACE: return createServiceInterface();
			case AjiMLPackage.DATA_MODEL: return createDataModel();
			case AjiMLPackage.ENTITY: return createEntity();
			case AjiMLPackage.RELATION: return createRelation();
			case AjiMLPackage.CREATE: return createCreate();
			case AjiMLPackage.READ: return createRead();
			case AjiMLPackage.MULTI_READ: return createMultiRead();
			case AjiMLPackage.UPDATE: return createUpdate();
			case AjiMLPackage.DELETE: return createDelete();
			case AjiMLPackage.CUSTOM: return createCustom();
			case AjiMLPackage.INTEGER: return createInteger();
			case AjiMLPackage.BOOLEAN: return createBoolean();
			case AjiMLPackage.FLOAT: return createFloat();
			case AjiMLPackage.STRING: return createString();
			case AjiMLPackage.CHAR: return createChar();
			case AjiMLPackage.DATE: return createDate();
			case AjiMLPackage.LONG: return createLong();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AjiMLPackage.EMULTIPLICITY:
				return createEMultiplicityFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AjiMLPackage.EMULTIPLICITY:
				return convertEMultiplicityToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ajiML.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalService createFunctionalService() {
		FunctionalServiceImpl functionalService = new FunctionalServiceImpl();
		return functionalService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscoveryService createDiscoveryService() {
		DiscoveryServiceImpl discoveryService = new DiscoveryServiceImpl();
		return discoveryService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APIService createAPIService() {
		APIServiceImpl apiService = new APIServiceImpl();
		return apiService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationService createConfigurationService() {
		ConfigurationServiceImpl configurationService = new ConfigurationServiceImpl();
		return configurationService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityService createSecurityService() {
		SecurityServiceImpl securityService = new SecurityServiceImpl();
		return securityService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserManagementService createUserManagementService() {
		UserManagementServiceImpl userManagementService = new UserManagementServiceImpl();
		return userManagementService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceInterface createServiceInterface() {
		ServiceInterfaceImpl serviceInterface = new ServiceInterfaceImpl();
		return serviceInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataModel createDataModel() {
		DataModelImpl dataModel = new DataModelImpl();
		return dataModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation createRelation() {
		RelationImpl relation = new RelationImpl();
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Create createCreate() {
		CreateImpl create = new CreateImpl();
		return create;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Read createRead() {
		ReadImpl read = new ReadImpl();
		return read;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiRead createMultiRead() {
		MultiReadImpl multiRead = new MultiReadImpl();
		return multiRead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Update createUpdate() {
		UpdateImpl update = new UpdateImpl();
		return update;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delete createDelete() {
		DeleteImpl delete = new DeleteImpl();
		return delete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Custom createCustom() {
		CustomImpl custom = new CustomImpl();
		return custom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ajiML.Integer createInteger() {
		IntegerImpl integer = new IntegerImpl();
		return integer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ajiML.Boolean createBoolean() {
		BooleanImpl boolean_ = new BooleanImpl();
		return boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ajiML.Float createFloat() {
		FloatImpl float_ = new FloatImpl();
		return float_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ajiML.String createString() {
		StringImpl string = new StringImpl();
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Char createChar() {
		CharImpl char_ = new CharImpl();
		return char_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createDate() {
		DateImpl date = new DateImpl();
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ajiML.Long createLong() {
		LongImpl long_ = new LongImpl();
		return long_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMultiplicity createEMultiplicityFromString(EDataType eDataType, String initialValue) {
		EMultiplicity result = EMultiplicity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEMultiplicityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AjiMLPackage getAjiMLPackage() {
		return (AjiMLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AjiMLPackage getPackage() {
		return AjiMLPackage.eINSTANCE;
	}

} //AjiMLFactoryImpl
