/**
 */
package ajiML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ajiML.ConfigurationService#getConfiguredServices <em>Configured Services</em>}</li>
 * </ul>
 *
 * @see ajiML.AjiMLPackage#getConfigurationService()
 * @model
 * @generated
 */
public interface ConfigurationService extends InfrastructureService {
	/**
	 * Returns the value of the '<em><b>Configured Services</b></em>' reference list.
	 * The list contents are of type {@link ajiML.Microservice}.
	 * It is bidirectional and its opposite is '{@link ajiML.Microservice#getConfiguredBy <em>Configured By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configured Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configured Services</em>' reference list.
	 * @see ajiML.AjiMLPackage#getConfigurationService_ConfiguredServices()
	 * @see ajiML.Microservice#getConfiguredBy
	 * @model opposite="configuredBy"
	 * @generated
	 */
	EList<Microservice> getConfiguredServices();

} // ConfigurationService
