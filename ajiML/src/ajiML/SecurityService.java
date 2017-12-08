/**
 */
package ajiML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ajiML.SecurityService#getSecuredServices <em>Secured Services</em>}</li>
 * </ul>
 *
 * @see ajiML.AjiMLPackage#getSecurityService()
 * @model
 * @generated
 */
public interface SecurityService extends InfrastructureService {
	/**
	 * Returns the value of the '<em><b>Secured Services</b></em>' reference list.
	 * The list contents are of type {@link ajiML.Microservice}.
	 * It is bidirectional and its opposite is '{@link ajiML.Microservice#getSecuredBy <em>Secured By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secured Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secured Services</em>' reference list.
	 * @see ajiML.AjiMLPackage#getSecurityService_SecuredServices()
	 * @see ajiML.Microservice#getSecuredBy
	 * @model opposite="securedBy"
	 * @generated
	 */
	EList<Microservice> getSecuredServices();

} // SecurityService
