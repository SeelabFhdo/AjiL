/**
 */
package ajiMLT;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ajiMLT.AjiMLTPackage
 * @generated
 */
public interface AjiMLTFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AjiMLTFactory eINSTANCE = ajiMLT.impl.AjiMLTFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Functional Service T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functional Service T</em>'.
	 * @generated
	 */
	FunctionalServiceT createFunctionalServiceT();

	/**
	 * Returns a new object of class '<em>Discovery Service T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discovery Service T</em>'.
	 * @generated
	 */
	DiscoveryServiceT createDiscoveryServiceT();

	/**
	 * Returns a new object of class '<em>API Service T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>API Service T</em>'.
	 * @generated
	 */
	APIServiceT createAPIServiceT();

	/**
	 * Returns a new object of class '<em>Configuration Service T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration Service T</em>'.
	 * @generated
	 */
	ConfigurationServiceT createConfigurationServiceT();

	/**
	 * Returns a new object of class '<em>Security Service T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Service T</em>'.
	 * @generated
	 */
	SecurityServiceT createSecurityServiceT();

	/**
	 * Returns a new object of class '<em>Service Interface T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Interface T</em>'.
	 * @generated
	 */
	ServiceInterfaceT createServiceInterfaceT();

	/**
	 * Returns a new object of class '<em>User Management Service T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Management Service T</em>'.
	 * @generated
	 */
	UserManagementServiceT createUserManagementServiceT();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AjiMLTPackage getAjiMLTPackage();

} //AjiMLTFactory
