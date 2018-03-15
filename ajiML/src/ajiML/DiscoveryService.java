/**
 */
package ajiML;

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
 *   <li>{@link ajiML.DiscoveryService#getDiscoveredServices <em>Discovered Services</em>}</li>
 * </ul>
 *
 * @see ajiML.AjiMLPackage#getDiscoveryService()
 * @model
 * @generated
 */
public interface DiscoveryService extends InfrastructureService {
	/**
	 * Returns the value of the '<em><b>Discovered Services</b></em>' reference list.
	 * The list contents are of type {@link ajiML.Microservice}.
	 * It is bidirectional and its opposite is '{@link ajiML.Microservice#getDiscoveredBy <em>Discovered By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discovered Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discovered Services</em>' reference list.
	 * @see ajiML.AjiMLPackage#getDiscoveryService_DiscoveredServices()
	 * @see ajiML.Microservice#getDiscoveredBy
	 * @model opposite="discoveredBy"
	 * @generated
	 */
	EList<Microservice> getDiscoveredServices();

} // DiscoveryService
