/**
 */
package ajil;

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
 *   <li>{@link ajil.Microservice#getName <em>Name</em>}</li>
 *   <li>{@link ajil.Microservice#getPort <em>Port</em>}</li>
 *   <li>{@link ajil.Microservice#isLoadBalanced <em>Load Balanced</em>}</li>
 *   <li>{@link ajil.Microservice#isCircuitBreaker <em>Circuit Breaker</em>}</li>
 * </ul>
 *
 * @see ajil.AjilPackage#getMicroservice()
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
	 * @see ajil.AjilPackage#getMicroservice_Name()
	 * @model default="myService" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ajil.Microservice#getName <em>Name</em>}' attribute.
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
	 * @see ajil.AjilPackage#getMicroservice_Port()
	 * @model default="8888" required="true"
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link ajil.Microservice#getPort <em>Port</em>}' attribute.
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
	 * @see ajil.AjilPackage#getMicroservice_LoadBalanced()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isLoadBalanced();

	/**
	 * Sets the value of the '{@link ajil.Microservice#isLoadBalanced <em>Load Balanced</em>}' attribute.
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
	 * @see ajil.AjilPackage#getMicroservice_CircuitBreaker()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isCircuitBreaker();

	/**
	 * Sets the value of the '{@link ajil.Microservice#isCircuitBreaker <em>Circuit Breaker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Circuit Breaker</em>' attribute.
	 * @see #isCircuitBreaker()
	 * @generated
	 */
	void setCircuitBreaker(boolean value);

} // Microservice
