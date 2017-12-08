/**
 */
package ajiML.impl;

import ajiML.AjiMLPackage;
import ajiML.ConfigurationService;
import ajiML.DiscoveryService;
import ajiML.Microservice;
import ajiML.SecurityService;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
 *   <li>{@link ajiML.impl.MicroserviceImpl#getName <em>Name</em>}</li>
 *   <li>{@link ajiML.impl.MicroserviceImpl#getPort <em>Port</em>}</li>
 *   <li>{@link ajiML.impl.MicroserviceImpl#isLoadBalanced <em>Load Balanced</em>}</li>
 *   <li>{@link ajiML.impl.MicroserviceImpl#isCircuitBreaker <em>Circuit Breaker</em>}</li>
 *   <li>{@link ajiML.impl.MicroserviceImpl#getDiscoveredBy <em>Discovered By</em>}</li>
 *   <li>{@link ajiML.impl.MicroserviceImpl#getConfiguredBy <em>Configured By</em>}</li>
 *   <li>{@link ajiML.impl.MicroserviceImpl#getSecuredBy <em>Secured By</em>}</li>
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
	 * The cached value of the '{@link #getDiscoveredBy() <em>Discovered By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscoveredBy()
	 * @generated
	 * @ordered
	 */
	protected DiscoveryService discoveredBy;

	/**
	 * The cached value of the '{@link #getConfiguredBy() <em>Configured By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguredBy()
	 * @generated
	 * @ordered
	 */
	protected ConfigurationService configuredBy;

	/**
	 * The cached value of the '{@link #getSecuredBy() <em>Secured By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecuredBy()
	 * @generated
	 * @ordered
	 */
	protected SecurityService securedBy;

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
		return AjiMLPackage.Literals.MICROSERVICE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AjiMLPackage.MICROSERVICE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AjiMLPackage.MICROSERVICE__PORT, oldPort, port));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AjiMLPackage.MICROSERVICE__LOAD_BALANCED, oldLoadBalanced, loadBalanced));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AjiMLPackage.MICROSERVICE__CIRCUIT_BREAKER, oldCircuitBreaker, circuitBreaker));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscoveryService getDiscoveredBy() {
		if (discoveredBy != null && discoveredBy.eIsProxy()) {
			InternalEObject oldDiscoveredBy = (InternalEObject)discoveredBy;
			discoveredBy = (DiscoveryService)eResolveProxy(oldDiscoveredBy);
			if (discoveredBy != oldDiscoveredBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AjiMLPackage.MICROSERVICE__DISCOVERED_BY, oldDiscoveredBy, discoveredBy));
			}
		}
		return discoveredBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscoveryService basicGetDiscoveredBy() {
		return discoveredBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiscoveredBy(DiscoveryService newDiscoveredBy, NotificationChain msgs) {
		DiscoveryService oldDiscoveredBy = discoveredBy;
		discoveredBy = newDiscoveredBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AjiMLPackage.MICROSERVICE__DISCOVERED_BY, oldDiscoveredBy, newDiscoveredBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscoveredBy(DiscoveryService newDiscoveredBy) {
		if (newDiscoveredBy != discoveredBy) {
			NotificationChain msgs = null;
			if (discoveredBy != null)
				msgs = ((InternalEObject)discoveredBy).eInverseRemove(this, AjiMLPackage.DISCOVERY_SERVICE__DISCOVERED_SERVICES, DiscoveryService.class, msgs);
			if (newDiscoveredBy != null)
				msgs = ((InternalEObject)newDiscoveredBy).eInverseAdd(this, AjiMLPackage.DISCOVERY_SERVICE__DISCOVERED_SERVICES, DiscoveryService.class, msgs);
			msgs = basicSetDiscoveredBy(newDiscoveredBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AjiMLPackage.MICROSERVICE__DISCOVERED_BY, newDiscoveredBy, newDiscoveredBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationService getConfiguredBy() {
		if (configuredBy != null && configuredBy.eIsProxy()) {
			InternalEObject oldConfiguredBy = (InternalEObject)configuredBy;
			configuredBy = (ConfigurationService)eResolveProxy(oldConfiguredBy);
			if (configuredBy != oldConfiguredBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AjiMLPackage.MICROSERVICE__CONFIGURED_BY, oldConfiguredBy, configuredBy));
			}
		}
		return configuredBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationService basicGetConfiguredBy() {
		return configuredBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfiguredBy(ConfigurationService newConfiguredBy, NotificationChain msgs) {
		ConfigurationService oldConfiguredBy = configuredBy;
		configuredBy = newConfiguredBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AjiMLPackage.MICROSERVICE__CONFIGURED_BY, oldConfiguredBy, newConfiguredBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiguredBy(ConfigurationService newConfiguredBy) {
		if (newConfiguredBy != configuredBy) {
			NotificationChain msgs = null;
			if (configuredBy != null)
				msgs = ((InternalEObject)configuredBy).eInverseRemove(this, AjiMLPackage.CONFIGURATION_SERVICE__CONFIGURED_SERVICES, ConfigurationService.class, msgs);
			if (newConfiguredBy != null)
				msgs = ((InternalEObject)newConfiguredBy).eInverseAdd(this, AjiMLPackage.CONFIGURATION_SERVICE__CONFIGURED_SERVICES, ConfigurationService.class, msgs);
			msgs = basicSetConfiguredBy(newConfiguredBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AjiMLPackage.MICROSERVICE__CONFIGURED_BY, newConfiguredBy, newConfiguredBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityService getSecuredBy() {
		if (securedBy != null && securedBy.eIsProxy()) {
			InternalEObject oldSecuredBy = (InternalEObject)securedBy;
			securedBy = (SecurityService)eResolveProxy(oldSecuredBy);
			if (securedBy != oldSecuredBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AjiMLPackage.MICROSERVICE__SECURED_BY, oldSecuredBy, securedBy));
			}
		}
		return securedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityService basicGetSecuredBy() {
		return securedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecuredBy(SecurityService newSecuredBy, NotificationChain msgs) {
		SecurityService oldSecuredBy = securedBy;
		securedBy = newSecuredBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AjiMLPackage.MICROSERVICE__SECURED_BY, oldSecuredBy, newSecuredBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecuredBy(SecurityService newSecuredBy) {
		if (newSecuredBy != securedBy) {
			NotificationChain msgs = null;
			if (securedBy != null)
				msgs = ((InternalEObject)securedBy).eInverseRemove(this, AjiMLPackage.SECURITY_SERVICE__SECURED_SERVICES, SecurityService.class, msgs);
			if (newSecuredBy != null)
				msgs = ((InternalEObject)newSecuredBy).eInverseAdd(this, AjiMLPackage.SECURITY_SERVICE__SECURED_SERVICES, SecurityService.class, msgs);
			msgs = basicSetSecuredBy(newSecuredBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AjiMLPackage.MICROSERVICE__SECURED_BY, newSecuredBy, newSecuredBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AjiMLPackage.MICROSERVICE__DISCOVERED_BY:
				if (discoveredBy != null)
					msgs = ((InternalEObject)discoveredBy).eInverseRemove(this, AjiMLPackage.DISCOVERY_SERVICE__DISCOVERED_SERVICES, DiscoveryService.class, msgs);
				return basicSetDiscoveredBy((DiscoveryService)otherEnd, msgs);
			case AjiMLPackage.MICROSERVICE__CONFIGURED_BY:
				if (configuredBy != null)
					msgs = ((InternalEObject)configuredBy).eInverseRemove(this, AjiMLPackage.CONFIGURATION_SERVICE__CONFIGURED_SERVICES, ConfigurationService.class, msgs);
				return basicSetConfiguredBy((ConfigurationService)otherEnd, msgs);
			case AjiMLPackage.MICROSERVICE__SECURED_BY:
				if (securedBy != null)
					msgs = ((InternalEObject)securedBy).eInverseRemove(this, AjiMLPackage.SECURITY_SERVICE__SECURED_SERVICES, SecurityService.class, msgs);
				return basicSetSecuredBy((SecurityService)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AjiMLPackage.MICROSERVICE__DISCOVERED_BY:
				return basicSetDiscoveredBy(null, msgs);
			case AjiMLPackage.MICROSERVICE__CONFIGURED_BY:
				return basicSetConfiguredBy(null, msgs);
			case AjiMLPackage.MICROSERVICE__SECURED_BY:
				return basicSetSecuredBy(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AjiMLPackage.MICROSERVICE__NAME:
				return getName();
			case AjiMLPackage.MICROSERVICE__PORT:
				return getPort();
			case AjiMLPackage.MICROSERVICE__LOAD_BALANCED:
				return isLoadBalanced();
			case AjiMLPackage.MICROSERVICE__CIRCUIT_BREAKER:
				return isCircuitBreaker();
			case AjiMLPackage.MICROSERVICE__DISCOVERED_BY:
				if (resolve) return getDiscoveredBy();
				return basicGetDiscoveredBy();
			case AjiMLPackage.MICROSERVICE__CONFIGURED_BY:
				if (resolve) return getConfiguredBy();
				return basicGetConfiguredBy();
			case AjiMLPackage.MICROSERVICE__SECURED_BY:
				if (resolve) return getSecuredBy();
				return basicGetSecuredBy();
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
			case AjiMLPackage.MICROSERVICE__NAME:
				setName((String)newValue);
				return;
			case AjiMLPackage.MICROSERVICE__PORT:
				setPort((Integer)newValue);
				return;
			case AjiMLPackage.MICROSERVICE__LOAD_BALANCED:
				setLoadBalanced((Boolean)newValue);
				return;
			case AjiMLPackage.MICROSERVICE__CIRCUIT_BREAKER:
				setCircuitBreaker((Boolean)newValue);
				return;
			case AjiMLPackage.MICROSERVICE__DISCOVERED_BY:
				setDiscoveredBy((DiscoveryService)newValue);
				return;
			case AjiMLPackage.MICROSERVICE__CONFIGURED_BY:
				setConfiguredBy((ConfigurationService)newValue);
				return;
			case AjiMLPackage.MICROSERVICE__SECURED_BY:
				setSecuredBy((SecurityService)newValue);
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
			case AjiMLPackage.MICROSERVICE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AjiMLPackage.MICROSERVICE__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case AjiMLPackage.MICROSERVICE__LOAD_BALANCED:
				setLoadBalanced(LOAD_BALANCED_EDEFAULT);
				return;
			case AjiMLPackage.MICROSERVICE__CIRCUIT_BREAKER:
				setCircuitBreaker(CIRCUIT_BREAKER_EDEFAULT);
				return;
			case AjiMLPackage.MICROSERVICE__DISCOVERED_BY:
				setDiscoveredBy((DiscoveryService)null);
				return;
			case AjiMLPackage.MICROSERVICE__CONFIGURED_BY:
				setConfiguredBy((ConfigurationService)null);
				return;
			case AjiMLPackage.MICROSERVICE__SECURED_BY:
				setSecuredBy((SecurityService)null);
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
			case AjiMLPackage.MICROSERVICE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AjiMLPackage.MICROSERVICE__PORT:
				return port != PORT_EDEFAULT;
			case AjiMLPackage.MICROSERVICE__LOAD_BALANCED:
				return loadBalanced != LOAD_BALANCED_EDEFAULT;
			case AjiMLPackage.MICROSERVICE__CIRCUIT_BREAKER:
				return circuitBreaker != CIRCUIT_BREAKER_EDEFAULT;
			case AjiMLPackage.MICROSERVICE__DISCOVERED_BY:
				return discoveredBy != null;
			case AjiMLPackage.MICROSERVICE__CONFIGURED_BY:
				return configuredBy != null;
			case AjiMLPackage.MICROSERVICE__SECURED_BY:
				return securedBy != null;
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
