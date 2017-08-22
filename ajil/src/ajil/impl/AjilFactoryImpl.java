/**
 */
package ajil.impl;

import ajil.APIService;
import ajil.AjilFactory;
import ajil.AjilPackage;
import ajil.Char;
import ajil.ConfigurationService;
import ajil.Create;
import ajil.Custom;
import ajil.Delete;
import ajil.DiscoveryService;
import ajil.DomainModel;
import ajil.ECommunicationMechanism;
import ajil.EMultiplicity;
import ajil.Entity;
import ajil.FunctionalService;
import ajil.MultiRead;
import ajil.Read;
import ajil.Relation;
import ajil.ServiceInterface;
import ajil.Update;

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
public class AjilFactoryImpl extends EFactoryImpl implements AjilFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AjilFactory init() {
		try {
			AjilFactory theAjilFactory = (AjilFactory)EPackage.Registry.INSTANCE.getEFactory(AjilPackage.eNS_URI);
			if (theAjilFactory != null) {
				return theAjilFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AjilFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AjilFactoryImpl() {
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
			case AjilPackage.SYSTEM: return createSystem();
			case AjilPackage.FUNCTIONAL_SERVICE: return createFunctionalService();
			case AjilPackage.DISCOVERY_SERVICE: return createDiscoveryService();
			case AjilPackage.API_SERVICE: return createAPIService();
			case AjilPackage.CONFIGURATION_SERVICE: return createConfigurationService();
			case AjilPackage.SERVICE_INTERFACE: return createServiceInterface();
			case AjilPackage.DOMAIN_MODEL: return createDomainModel();
			case AjilPackage.ENTITY: return createEntity();
			case AjilPackage.RELATION: return createRelation();
			case AjilPackage.CREATE: return createCreate();
			case AjilPackage.READ: return createRead();
			case AjilPackage.MULTI_READ: return createMultiRead();
			case AjilPackage.UPDATE: return createUpdate();
			case AjilPackage.DELETE: return createDelete();
			case AjilPackage.CUSTOM: return createCustom();
			case AjilPackage.INTEGER: return createInteger();
			case AjilPackage.BOOLEAN: return createBoolean();
			case AjilPackage.FLOAT: return createFloat();
			case AjilPackage.STRING: return createString();
			case AjilPackage.CHAR: return createChar();
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
			case AjilPackage.ECOMMUNICATION_MECHANISM:
				return createECommunicationMechanismFromString(eDataType, initialValue);
			case AjilPackage.EMULTIPLICITY:
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
			case AjilPackage.ECOMMUNICATION_MECHANISM:
				return convertECommunicationMechanismToString(eDataType, instanceValue);
			case AjilPackage.EMULTIPLICITY:
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
	public ajil.System createSystem() {
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
	public ServiceInterface createServiceInterface() {
		ServiceInterfaceImpl serviceInterface = new ServiceInterfaceImpl();
		return serviceInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainModel createDomainModel() {
		DomainModelImpl domainModel = new DomainModelImpl();
		return domainModel;
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
	public ajil.Integer createInteger() {
		IntegerImpl integer = new IntegerImpl();
		return integer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ajil.Boolean createBoolean() {
		BooleanImpl boolean_ = new BooleanImpl();
		return boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ajil.Float createFloat() {
		FloatImpl float_ = new FloatImpl();
		return float_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ajil.String createString() {
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
	public ECommunicationMechanism createECommunicationMechanismFromString(EDataType eDataType, String initialValue) {
		ECommunicationMechanism result = ECommunicationMechanism.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertECommunicationMechanismToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
	public AjilPackage getAjilPackage() {
		return (AjilPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AjilPackage getPackage() {
		return AjilPackage.eINSTANCE;
	}

} //AjilFactoryImpl
