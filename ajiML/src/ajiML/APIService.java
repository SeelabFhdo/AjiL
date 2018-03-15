/**
 */
package ajiML;

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
 *   <li>{@link ajiML.APIService#getExposedServices <em>Exposed Services</em>}</li>
 * </ul>
 *
 * @see ajiML.AjiMLPackage#getAPIService()
 * @model
 * @generated
 */
public interface APIService extends InfrastructureService {
	/**
	 * Returns the value of the '<em><b>Exposed Services</b></em>' reference list.
	 * The list contents are of type {@link ajiML.ServiceInterface}.
	 * It is bidirectional and its opposite is '{@link ajiML.ServiceInterface#getExposedToGateways <em>Exposed To Gateways</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exposed Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exposed Services</em>' reference list.
	 * @see ajiML.AjiMLPackage#getAPIService_ExposedServices()
	 * @see ajiML.ServiceInterface#getExposedToGateways
	 * @model opposite="exposedToGateways"
	 * @generated
	 */
	EList<ServiceInterface> getExposedServices();

} // APIService
