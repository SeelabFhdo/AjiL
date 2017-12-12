/**
 */
package ajiMLT.impl;

import ajiMLT.*;

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
public class AjiMLTFactoryImpl extends EFactoryImpl implements AjiMLTFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AjiMLTFactory init() {
		try {
			AjiMLTFactory theAjiMLTFactory = (AjiMLTFactory)EPackage.Registry.INSTANCE.getEFactory(AjiMLTPackage.eNS_URI);
			if (theAjiMLTFactory != null) {
				return theAjiMLTFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AjiMLTFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AjiMLTFactoryImpl() {
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
			case AjiMLTPackage.FUNCTIONAL_SERVICE_T: return createFunctionalServiceT();
			case AjiMLTPackage.DISCOVERY_SERVICE_T: return createDiscoveryServiceT();
			case AjiMLTPackage.API_SERVICE_T: return createAPIServiceT();
			case AjiMLTPackage.CONFIGURATION_SERVICE_T: return createConfigurationServiceT();
			case AjiMLTPackage.SECURITY_SERVICE_T: return createSecurityServiceT();
			case AjiMLTPackage.SERVICE_INTERFACE_T: return createServiceInterfaceT();
			case AjiMLTPackage.USER_MANAGEMENT_SERVICE_T: return createUserManagementServiceT();
			case AjiMLTPackage.SYSTEM_T: return createSystemT();
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
			case AjiMLTPackage.EGENERATOR:
				return createEGeneratorFromString(eDataType, initialValue);
			case AjiMLTPackage.ECOMMUNICATION_MECHANISM:
				return createECommunicationMechanismFromString(eDataType, initialValue);
			case AjiMLTPackage.EDATABASE:
				return createEDatabaseFromString(eDataType, initialValue);
			case AjiMLTPackage.EMULTIPLICITY:
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
			case AjiMLTPackage.EGENERATOR:
				return convertEGeneratorToString(eDataType, instanceValue);
			case AjiMLTPackage.ECOMMUNICATION_MECHANISM:
				return convertECommunicationMechanismToString(eDataType, instanceValue);
			case AjiMLTPackage.EDATABASE:
				return convertEDatabaseToString(eDataType, instanceValue);
			case AjiMLTPackage.EMULTIPLICITY:
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
	public FunctionalServiceT createFunctionalServiceT() {
		FunctionalServiceTImpl functionalServiceT = new FunctionalServiceTImpl();
		return functionalServiceT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscoveryServiceT createDiscoveryServiceT() {
		DiscoveryServiceTImpl discoveryServiceT = new DiscoveryServiceTImpl();
		return discoveryServiceT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APIServiceT createAPIServiceT() {
		APIServiceTImpl apiServiceT = new APIServiceTImpl();
		return apiServiceT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationServiceT createConfigurationServiceT() {
		ConfigurationServiceTImpl configurationServiceT = new ConfigurationServiceTImpl();
		return configurationServiceT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityServiceT createSecurityServiceT() {
		SecurityServiceTImpl securityServiceT = new SecurityServiceTImpl();
		return securityServiceT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceInterfaceT createServiceInterfaceT() {
		ServiceInterfaceTImpl serviceInterfaceT = new ServiceInterfaceTImpl();
		return serviceInterfaceT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserManagementServiceT createUserManagementServiceT() {
		UserManagementServiceTImpl userManagementServiceT = new UserManagementServiceTImpl();
		return userManagementServiceT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemT createSystemT() {
		SystemTImpl systemT = new SystemTImpl();
		return systemT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EGenerator createEGeneratorFromString(EDataType eDataType, String initialValue) {
		EGenerator result = EGenerator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEGeneratorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
	public EDatabase createEDatabaseFromString(EDataType eDataType, String initialValue) {
		EDatabase result = EDatabase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEDatabaseToString(EDataType eDataType, Object instanceValue) {
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
	public AjiMLTPackage getAjiMLTPackage() {
		return (AjiMLTPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AjiMLTPackage getPackage() {
		return AjiMLTPackage.eINSTANCE;
	}

} //AjiMLTFactoryImpl
