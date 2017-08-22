/**
 */
package ajil;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ajil.ConfigurationService#getDiscoveredBy <em>Discovered By</em>}</li>
 *   <li>{@link ajil.ConfigurationService#getStoredConfigurations <em>Stored Configurations</em>}</li>
 * </ul>
 *
 * @see ajil.AjilPackage#getConfigurationService()
 * @model
 * @generated
 */
public interface ConfigurationService extends InfrastructureService {
	/**
	 * Returns the value of the '<em><b>Discovered By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ajil.DiscoveryService#getKnownConfigurationServices <em>Known Configuration Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discovered By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discovered By</em>' reference.
	 * @see #setDiscoveredBy(DiscoveryService)
	 * @see ajil.AjilPackage#getConfigurationService_DiscoveredBy()
	 * @see ajil.DiscoveryService#getKnownConfigurationServices
	 * @model opposite="knownConfigurationServices"
	 * @generated
	 */
	DiscoveryService getDiscoveredBy();

	/**
	 * Sets the value of the '{@link ajil.ConfigurationService#getDiscoveredBy <em>Discovered By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discovered By</em>' reference.
	 * @see #getDiscoveredBy()
	 * @generated
	 */
	void setDiscoveredBy(DiscoveryService value);

	/**
	 * Returns the value of the '<em><b>Stored Configurations</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ajil.FunctionalService#getConfiguredBy <em>Configured By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stored Configurations</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stored Configurations</em>' reference.
	 * @see #setStoredConfigurations(FunctionalService)
	 * @see ajil.AjilPackage#getConfigurationService_StoredConfigurations()
	 * @see ajil.FunctionalService#getConfiguredBy
	 * @model opposite="configuredBy"
	 * @generated
	 */
	FunctionalService getStoredConfigurations();

	/**
	 * Sets the value of the '{@link ajil.ConfigurationService#getStoredConfigurations <em>Stored Configurations</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stored Configurations</em>' reference.
	 * @see #getStoredConfigurations()
	 * @generated
	 */
	void setStoredConfigurations(FunctionalService value);

} // ConfigurationService
