/**
 */
package ajil;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ajil.FunctionalService#getDomain <em>Domain</em>}</li>
 *   <li>{@link ajil.FunctionalService#getProvidedInterfaces <em>Provided Interfaces</em>}</li>
 *   <li>{@link ajil.FunctionalService#getServiceDependencies <em>Service Dependencies</em>}</li>
 *   <li>{@link ajil.FunctionalService#getDiscoveredBy <em>Discovered By</em>}</li>
 *   <li>{@link ajil.FunctionalService#getConfiguredBy <em>Configured By</em>}</li>
 * </ul>
 *
 * @see ajil.AjilPackage#getFunctionalService()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='noSelfDependency'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL noSelfDependency='self.serviceDependencies-&gt;forAll(i : ServiceInterface | self.providedInterfaces-&gt;excludes(i))'"
 * @generated
 */
public interface FunctionalService extends Microservice {
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ajil.DomainModel#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' containment reference.
	 * @see #setDomain(DomainModel)
	 * @see ajil.AjilPackage#getFunctionalService_Domain()
	 * @see ajil.DomainModel#getOwner
	 * @model opposite="owner" containment="true" required="true"
	 * @generated
	 */
	DomainModel getDomain();

	/**
	 * Sets the value of the '{@link ajil.FunctionalService#getDomain <em>Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' containment reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(DomainModel value);

	/**
	 * Returns the value of the '<em><b>Provided Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link ajil.ServiceInterface}.
	 * It is bidirectional and its opposite is '{@link ajil.ServiceInterface#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Interfaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Interfaces</em>' containment reference list.
	 * @see ajil.AjilPackage#getFunctionalService_ProvidedInterfaces()
	 * @see ajil.ServiceInterface#getOwner
	 * @model opposite="owner" containment="true" required="true"
	 * @generated
	 */
	EList<ServiceInterface> getProvidedInterfaces();

	/**
	 * Returns the value of the '<em><b>Service Dependencies</b></em>' reference list.
	 * The list contents are of type {@link ajil.ServiceInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Dependencies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Dependencies</em>' reference list.
	 * @see ajil.AjilPackage#getFunctionalService_ServiceDependencies()
	 * @model
	 * @generated
	 */
	EList<ServiceInterface> getServiceDependencies();

	/**
	 * Returns the value of the '<em><b>Discovered By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ajil.DiscoveryService#getKnownFunctionalServices <em>Known Functional Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discovered By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discovered By</em>' reference.
	 * @see #setDiscoveredBy(DiscoveryService)
	 * @see ajil.AjilPackage#getFunctionalService_DiscoveredBy()
	 * @see ajil.DiscoveryService#getKnownFunctionalServices
	 * @model opposite="knownFunctionalServices"
	 * @generated
	 */
	DiscoveryService getDiscoveredBy();

	/**
	 * Sets the value of the '{@link ajil.FunctionalService#getDiscoveredBy <em>Discovered By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discovered By</em>' reference.
	 * @see #getDiscoveredBy()
	 * @generated
	 */
	void setDiscoveredBy(DiscoveryService value);

	/**
	 * Returns the value of the '<em><b>Configured By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ajil.ConfigurationService#getStoredConfigurations <em>Stored Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configured By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configured By</em>' reference.
	 * @see #setConfiguredBy(ConfigurationService)
	 * @see ajil.AjilPackage#getFunctionalService_ConfiguredBy()
	 * @see ajil.ConfigurationService#getStoredConfigurations
	 * @model opposite="storedConfigurations"
	 * @generated
	 */
	ConfigurationService getConfiguredBy();

	/**
	 * Sets the value of the '{@link ajil.FunctionalService#getConfiguredBy <em>Configured By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configured By</em>' reference.
	 * @see #getConfiguredBy()
	 * @generated
	 */
	void setConfiguredBy(ConfigurationService value);

} // FunctionalService
