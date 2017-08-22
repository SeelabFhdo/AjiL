/**
 */
package ajil.impl;

import ajil.AjilPackage;
import ajil.Microservice;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Microservice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ajil.impl.MicroserviceImpl#getName <em>Name</em>}</li>
 *   <li>{@link ajil.impl.MicroserviceImpl#getPort <em>Port</em>}</li>
 *   <li>{@link ajil.impl.MicroserviceImpl#isLoadBalanced <em>Load Balanced</em>}</li>
 *   <li>{@link ajil.impl.MicroserviceImpl#isCircuitBreaker <em>Circuit Breaker</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MicroserviceImpl extends MinimalEObjectImpl.Container implements Microservice {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "myService";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_EDEFAULT = 8888;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected int port = PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #isLoadBalanced() <em>Load Balanced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLoadBalanced()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOAD_BALANCED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isLoadBalanced() <em>Load Balanced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLoadBalanced()
	 * @generated
	 * @ordered
	 */
	protected boolean loadBalanced = LOAD_BALANCED_EDEFAULT;

	/**
	 * The default value of the '{@link #isCircuitBreaker() <em>Circuit Breaker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCircuitBreaker()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CIRCUIT_BREAKER_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isCircuitBreaker() <em>Circuit Breaker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCircuitBreaker()
	 * @generated
	 * @ordered
	 */
	protected boolean circuitBreaker = CIRCUIT_BREAKER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MicroserviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AjilPackage.Literals.MICROSERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AjilPackage.MICROSERVICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(int newPort) {
		int oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AjilPackage.MICROSERVICE__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLoadBalanced() {
		return loadBalanced;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadBalanced(boolean newLoadBalanced) {
		boolean oldLoadBalanced = loadBalanced;
		loadBalanced = newLoadBalanced;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AjilPackage.MICROSERVICE__LOAD_BALANCED, oldLoadBalanced, loadBalanced));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCircuitBreaker() {
		return circuitBreaker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCircuitBreaker(boolean newCircuitBreaker) {
		boolean oldCircuitBreaker = circuitBreaker;
		circuitBreaker = newCircuitBreaker;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AjilPackage.MICROSERVICE__CIRCUIT_BREAKER, oldCircuitBreaker, circuitBreaker));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AjilPackage.MICROSERVICE__NAME:
				return getName();
			case AjilPackage.MICROSERVICE__PORT:
				return getPort();
			case AjilPackage.MICROSERVICE__LOAD_BALANCED:
				return isLoadBalanced();
			case AjilPackage.MICROSERVICE__CIRCUIT_BREAKER:
				return isCircuitBreaker();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AjilPackage.MICROSERVICE__NAME:
				setName((String)newValue);
				return;
			case AjilPackage.MICROSERVICE__PORT:
				setPort((Integer)newValue);
				return;
			case AjilPackage.MICROSERVICE__LOAD_BALANCED:
				setLoadBalanced((Boolean)newValue);
				return;
			case AjilPackage.MICROSERVICE__CIRCUIT_BREAKER:
				setCircuitBreaker((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AjilPackage.MICROSERVICE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AjilPackage.MICROSERVICE__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case AjilPackage.MICROSERVICE__LOAD_BALANCED:
				setLoadBalanced(LOAD_BALANCED_EDEFAULT);
				return;
			case AjilPackage.MICROSERVICE__CIRCUIT_BREAKER:
				setCircuitBreaker(CIRCUIT_BREAKER_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AjilPackage.MICROSERVICE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AjilPackage.MICROSERVICE__PORT:
				return port != PORT_EDEFAULT;
			case AjilPackage.MICROSERVICE__LOAD_BALANCED:
				return loadBalanced != LOAD_BALANCED_EDEFAULT;
			case AjilPackage.MICROSERVICE__CIRCUIT_BREAKER:
				return circuitBreaker != CIRCUIT_BREAKER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", port: ");
		result.append(port);
		result.append(", loadBalanced: ");
		result.append(loadBalanced);
		result.append(", circuitBreaker: ");
		result.append(circuitBreaker);
		result.append(')');
		return result.toString();
	}

} //MicroserviceImpl
