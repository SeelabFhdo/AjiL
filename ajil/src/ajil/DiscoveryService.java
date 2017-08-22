/**
 */
package ajil;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discovery Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ajil.DiscoveryService#getKnownFunctionalServices <em>Known Functional Services</em>}</li>
 *   <li>{@link ajil.DiscoveryService#getKnownApiServices <em>Known Api Services</em>}</li>
 *   <li>{@link ajil.DiscoveryService#getKnownConfigurationServices <em>Known Configuration Services</em>}</li>
 * </ul>
 *
 * @see ajil.AjilPackage#getDiscoveryService()
 * @model
 * @generated
 */
public interface DiscoveryService extends InfrastructureService {
	/**
	 * Returns the value of the '<em><b>Known Functional Services</b></em>' reference list.
	 * The list contents are of type {@link ajil.FunctionalService}.
	 * It is bidirectional and its opposite is '{@link ajil.FunctionalService#getDiscoveredBy <em>Discovered By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Known Functional Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Known Functional Services</em>' reference list.
	 * @see ajil.AjilPackage#getDiscoveryService_KnownFunctionalServices()
	 * @see ajil.FunctionalService#getDiscoveredBy
	 * @model opposite="discoveredBy"
	 * @generated
	 */
	EList<FunctionalService> getKnownFunctionalServices();

	/**
	 * Returns the value of the '<em><b>Known Api Services</b></em>' reference list.
	 * The list contents are of type {@link ajil.APIService}.
	 * It is bidirectional and its opposite is '{@link ajil.APIService#getDiscoveredBy <em>Discovered By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Known Api Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Known Api Services</em>' reference list.
	 * @see ajil.AjilPackage#getDiscoveryService_KnownApiServices()
	 * @see ajil.APIService#getDiscoveredBy
	 * @model opposite="discoveredBy"
	 * @generated
	 */
	EList<APIService> getKnownApiServices();

	/**
	 * Returns the value of the '<em><b>Known Configuration Services</b></em>' reference list.
	 * The list contents are of type {@link ajil.ConfigurationService}.
	 * It is bidirectional and its opposite is '{@link ajil.ConfigurationService#getDiscoveredBy <em>Discovered By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Known Configuration Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Known Configuration Services</em>' reference list.
	 * @see ajil.AjilPackage#getDiscoveryService_KnownConfigurationServices()
	 * @see ajil.ConfigurationService#getDiscoveredBy
	 * @model opposite="discoveredBy"
	 * @generated
	 */
	EList<ConfigurationService> getKnownConfigurationServices();

} // DiscoveryService
