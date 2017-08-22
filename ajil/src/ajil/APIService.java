/**
 */
package ajil;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>API Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ajil.APIService#getExposedServices <em>Exposed Services</em>}</li>
 *   <li>{@link ajil.APIService#getDiscoveredBy <em>Discovered By</em>}</li>
 * </ul>
 *
 * @see ajil.AjilPackage#getAPIService()
 * @model
 * @generated
 */
public interface APIService extends InfrastructureService {
	/**
	 * Returns the value of the '<em><b>Exposed Services</b></em>' reference list.
	 * The list contents are of type {@link ajil.ServiceInterface}.
	 * It is bidirectional and its opposite is '{@link ajil.ServiceInterface#getExposedToGateways <em>Exposed To Gateways</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exposed Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exposed Services</em>' reference list.
	 * @see ajil.AjilPackage#getAPIService_ExposedServices()
	 * @see ajil.ServiceInterface#getExposedToGateways
	 * @model opposite="exposedToGateways"
	 * @generated
	 */
	EList<ServiceInterface> getExposedServices();

	/**
	 * Returns the value of the '<em><b>Discovered By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ajil.DiscoveryService#getKnownApiServices <em>Known Api Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discovered By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discovered By</em>' reference.
	 * @see #setDiscoveredBy(DiscoveryService)
	 * @see ajil.AjilPackage#getAPIService_DiscoveredBy()
	 * @see ajil.DiscoveryService#getKnownApiServices
	 * @model opposite="knownApiServices"
	 * @generated
	 */
	DiscoveryService getDiscoveredBy();

	/**
	 * Sets the value of the '{@link ajil.APIService#getDiscoveredBy <em>Discovered By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discovered By</em>' reference.
	 * @see #getDiscoveredBy()
	 * @generated
	 */
	void setDiscoveredBy(DiscoveryService value);

} // APIService
