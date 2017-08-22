/**
 */
package ajil.impl;

import ajil.AjilPackage;
import ajil.ConfigurationService;
import ajil.DiscoveryService;
import ajil.FunctionalService;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ajil.impl.ConfigurationServiceImpl#getDiscoveredBy <em>Discovered By</em>}</li>
 *   <li>{@link ajil.impl.ConfigurationServiceImpl#getStoredConfigurations <em>Stored Configurations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationServiceImpl extends InfrastructureServiceImpl implements ConfigurationService {
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
	 * The cached value of the '{@link #getStoredConfigurations() <em>Stored Configurations</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoredConfigurations()
	 * @generated
	 * @ordered
	 */
	protected FunctionalService storedConfigurations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AjilPackage.Literals.CONFIGURATION_SERVICE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AjilPackage.CONFIGURATION_SERVICE__DISCOVERED_BY, oldDiscoveredBy, discoveredBy));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AjilPackage.CONFIGURATION_SERVICE__DISCOVERED_BY, oldDiscoveredBy, newDiscoveredBy);
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
				msgs = ((InternalEObject)discoveredBy).eInverseRemove(this, AjilPackage.DISCOVERY_SERVICE__KNOWN_CONFIGURATION_SERVICES, DiscoveryService.class, msgs);
			if (newDiscoveredBy != null)
				msgs = ((InternalEObject)newDiscoveredBy).eInverseAdd(this, AjilPackage.DISCOVERY_SERVICE__KNOWN_CONFIGURATION_SERVICES, DiscoveryService.class, msgs);
			msgs = basicSetDiscoveredBy(newDiscoveredBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AjilPackage.CONFIGURATION_SERVICE__DISCOVERED_BY, newDiscoveredBy, newDiscoveredBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalService getStoredConfigurations() {
		if (storedConfigurations != null && storedConfigurations.eIsProxy()) {
			InternalEObject oldStoredConfigurations = (InternalEObject)storedConfigurations;
			storedConfigurations = (FunctionalService)eResolveProxy(oldStoredConfigurations);
			if (storedConfigurations != oldStoredConfigurations) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AjilPackage.CONFIGURATION_SERVICE__STORED_CONFIGURATIONS, oldStoredConfigurations, storedConfigurations));
			}
		}
		return storedConfigurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalService basicGetStoredConfigurations() {
		return storedConfigurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStoredConfigurations(FunctionalService newStoredConfigurations, NotificationChain msgs) {
		FunctionalService oldStoredConfigurations = storedConfigurations;
		storedConfigurations = newStoredConfigurations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AjilPackage.CONFIGURATION_SERVICE__STORED_CONFIGURATIONS, oldStoredConfigurations, newStoredConfigurations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStoredConfigurations(FunctionalService newStoredConfigurations) {
		if (newStoredConfigurations != storedConfigurations) {
			NotificationChain msgs = null;
			if (storedConfigurations != null)
				msgs = ((InternalEObject)storedConfigurations).eInverseRemove(this, AjilPackage.FUNCTIONAL_SERVICE__CONFIGURED_BY, FunctionalService.class, msgs);
			if (newStoredConfigurations != null)
				msgs = ((InternalEObject)newStoredConfigurations).eInverseAdd(this, AjilPackage.FUNCTIONAL_SERVICE__CONFIGURED_BY, FunctionalService.class, msgs);
			msgs = basicSetStoredConfigurations(newStoredConfigurations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AjilPackage.CONFIGURATION_SERVICE__STORED_CONFIGURATIONS, newStoredConfigurations, newStoredConfigurations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AjilPackage.CONFIGURATION_SERVICE__DISCOVERED_BY:
				if (discoveredBy != null)
					msgs = ((InternalEObject)discoveredBy).eInverseRemove(this, AjilPackage.DISCOVERY_SERVICE__KNOWN_CONFIGURATION_SERVICES, DiscoveryService.class, msgs);
				return basicSetDiscoveredBy((DiscoveryService)otherEnd, msgs);
			case AjilPackage.CONFIGURATION_SERVICE__STORED_CONFIGURATIONS:
				if (storedConfigurations != null)
					msgs = ((InternalEObject)storedConfigurations).eInverseRemove(this, AjilPackage.FUNCTIONAL_SERVICE__CONFIGURED_BY, FunctionalService.class, msgs);
				return basicSetStoredConfigurations((FunctionalService)otherEnd, msgs);
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
			case AjilPackage.CONFIGURATION_SERVICE__DISCOVERED_BY:
				return basicSetDiscoveredBy(null, msgs);
			case AjilPackage.CONFIGURATION_SERVICE__STORED_CONFIGURATIONS:
				return basicSetStoredConfigurations(null, msgs);
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
			case AjilPackage.CONFIGURATION_SERVICE__DISCOVERED_BY:
				if (resolve) return getDiscoveredBy();
				return basicGetDiscoveredBy();
			case AjilPackage.CONFIGURATION_SERVICE__STORED_CONFIGURATIONS:
				if (resolve) return getStoredConfigurations();
				return basicGetStoredConfigurations();
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
			case AjilPackage.CONFIGURATION_SERVICE__DISCOVERED_BY:
				setDiscoveredBy((DiscoveryService)newValue);
				return;
			case AjilPackage.CONFIGURATION_SERVICE__STORED_CONFIGURATIONS:
				setStoredConfigurations((FunctionalService)newValue);
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
			case AjilPackage.CONFIGURATION_SERVICE__DISCOVERED_BY:
				setDiscoveredBy((DiscoveryService)null);
				return;
			case AjilPackage.CONFIGURATION_SERVICE__STORED_CONFIGURATIONS:
				setStoredConfigurations((FunctionalService)null);
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
			case AjilPackage.CONFIGURATION_SERVICE__DISCOVERED_BY:
				return discoveredBy != null;
			case AjilPackage.CONFIGURATION_SERVICE__STORED_CONFIGURATIONS:
				return storedConfigurations != null;
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationServiceImpl
