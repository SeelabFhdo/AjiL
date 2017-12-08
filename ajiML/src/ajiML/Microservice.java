/**
 */
package ajiML;

import java.lang.String;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Microservice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ajiML.Microservice#getName <em>Name</em>}</li>
 *   <li>{@link ajiML.Microservice#getPort <em>Port</em>}</li>
 *   <li>{@link ajiML.Microservice#isLoadBalanced <em>Load Balanced</em>}</li>
 *   <li>{@link ajiML.Microservice#isCircuitBreaker <em>Circuit Breaker</em>}</li>
 *   <li>{@link ajiML.Microservice#getDiscoveredBy <em>Discovered By</em>}</li>
 *   <li>{@link ajiML.Microservice#getConfiguredBy <em>Configured By</em>}</li>
 *   <li>{@link ajiML.Microservice#getSecuredBy <em>Secured By</em>}</li>
 * </ul>
 *
 * @see ajiML.AjiMLPackage#getMicroservice()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueServiceName uniqueServicePort'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL uniqueServiceName='Microservice.allInstances()-&gt;forAll(s : Microservice | s &lt;&gt; self implies s.name &lt;&gt; self.name)' uniqueServicePort='Microservice.allInstances()-&gt;forAll(p : Microservice | p &lt;&gt; self implies p.port &lt;&gt; self.port)'"
 * @generated
 */
public interface Microservice extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"myService"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ajiML.AjiMLPackage#getMicroservice_Name()
	 * @model default="myService" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ajiML.Microservice#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * The default value is <code>"8888"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see ajiML.AjiMLPackage#getMicroservice_Port()
	 * @model default="8888" required="true"
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link ajiML.Microservice#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

	/**
	 * Returns the value of the '<em><b>Load Balanced</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Balanced</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Balanced</em>' attribute.
	 * @see #setLoadBalanced(boolean)
	 * @see ajiML.AjiMLPackage#getMicroservice_LoadBalanced()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isLoadBalanced();

	/**
	 * Sets the value of the '{@link ajiML.Microservice#isLoadBalanced <em>Load Balanced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Balanced</em>' attribute.
	 * @see #isLoadBalanced()
	 * @generated
	 */
	void setLoadBalanced(boolean value);

	/**
	 * Returns the value of the '<em><b>Circuit Breaker</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Circuit Breaker</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Circuit Breaker</em>' attribute.
	 * @see #setCircuitBreaker(boolean)
	 * @see ajiML.AjiMLPackage#getMicroservice_CircuitBreaker()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isCircuitBreaker();

	/**
	 * Sets the value of the '{@link ajiML.Microservice#isCircuitBreaker <em>Circuit Breaker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Circuit Breaker</em>' attribute.
	 * @see #isCircuitBreaker()
	 * @generated
	 */
	void setCircuitBreaker(boolean value);

	/**
	 * Returns the value of the '<em><b>Discovered By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ajiML.DiscoveryService#getDiscoveredServices <em>Discovered Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discovered By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discovered By</em>' reference.
	 * @see #setDiscoveredBy(DiscoveryService)
	 * @see ajiML.AjiMLPackage#getMicroservice_DiscoveredBy()
	 * @see ajiML.DiscoveryService#getDiscoveredServices
	 * @model opposite="discoveredServices"
	 * @generated
	 */
	DiscoveryService getDiscoveredBy();

	/**
	 * Sets the value of the '{@link ajiML.Microservice#getDiscoveredBy <em>Discovered By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discovered By</em>' reference.
	 * @see #getDiscoveredBy()
	 * @generated
	 */
	void setDiscoveredBy(DiscoveryService value);

	/**
	 * Returns the value of the '<em><b>Configured By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ajiML.ConfigurationService#getConfiguredServices <em>Configured Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configured By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configured By</em>' reference.
	 * @see #setConfiguredBy(ConfigurationService)
	 * @see ajiML.AjiMLPackage#getMicroservice_ConfiguredBy()
	 * @see ajiML.ConfigurationService#getConfiguredServices
	 * @model opposite="configuredServices"
	 * @generated
	 */
	ConfigurationService getConfiguredBy();

	/**
	 * Sets the value of the '{@link ajiML.Microservice#getConfiguredBy <em>Configured By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configured By</em>' reference.
	 * @see #getConfiguredBy()
	 * @generated
	 */
	void setConfiguredBy(ConfigurationService value);

	/**
	 * Returns the value of the '<em><b>Secured By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ajiML.SecurityService#getSecuredServices <em>Secured Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secured By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secured By</em>' reference.
	 * @see #setSecuredBy(SecurityService)
	 * @see ajiML.AjiMLPackage#getMicroservice_SecuredBy()
	 * @see ajiML.SecurityService#getSecuredServices
	 * @model opposite="securedServices"
	 * @generated
	 */
	SecurityService getSecuredBy();

	/**
	 * Sets the value of the '{@link ajiML.Microservice#getSecuredBy <em>Secured By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secured By</em>' reference.
	 * @see #getSecuredBy()
	 * @generated
	 */
	void setSecuredBy(SecurityService value);

} // Microservice
