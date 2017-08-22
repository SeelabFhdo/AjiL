/**
 */
package ajil.impl;

import ajil.AjilPackage;
import ajil.ConfigurationService;
import ajil.DiscoveryService;
import ajil.DomainModel;
import ajil.FunctionalService;
import ajil.ServiceInterface;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ajil.impl.FunctionalServiceImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link ajil.impl.FunctionalServiceImpl#getProvidedInterfaces <em>Provided Interfaces</em>}</li>
 *   <li>{@link ajil.impl.FunctionalServiceImpl#getServiceDependencies <em>Service Dependencies</em>}</li>
 *   <li>{@link ajil.impl.FunctionalServiceImpl#getDiscoveredBy <em>Discovered By</em>}</li>
 *   <li>{@link ajil.impl.FunctionalServiceImpl#getConfiguredBy <em>Configured By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionalServiceImpl extends MicroserviceImpl implements FunctionalService {
	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected DomainModel domain;

	/**
	 * The cached value of the '{@link #getProvidedInterfaces() <em>Provided Interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceInterface> providedInterfaces;

	/**
	 * The cached value of the '{@link #getServiceDependencies() <em>Service Dependencies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceInterface> serviceDependencies;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AjilPackage.Literals.FUNCTIONAL_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainModel getDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomain(DomainModel newDomain, NotificationChain msgs) {
		DomainModel oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AjilPackage.FUNCTIONAL_SERVICE__DOMAIN, oldDomain, newDomain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(DomainModel newDomain) {
		if (newDomain != domain) {
			NotificationChain msgs = null;
			if (domain != null)
				msgs = ((InternalEObject)domain).eInverseRemove(this, AjilPackage.DOMAIN_MODEL__OWNER, DomainModel.class, msgs);
			if (newDomain != null)
				msgs = ((InternalEObject)newDomain).eInverseAdd(this, AjilPackage.DOMAIN_MODEL__OWNER, DomainModel.class, msgs);
			msgs = basicSetDomain(newDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AjilPackage.FUNCTIONAL_SERVICE__DOMAIN, newDomain, newDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceInterface> getProvidedInterfaces() {
		if (providedInterfaces == null) {
			providedInterfaces = new EObjectContainmentWithInverseEList<ServiceInterface>(ServiceInterface.class, this, AjilPackage.FUNCTIONAL_SERVICE__PROVIDED_INTERFACES, AjilPackage.SERVICE_INTERFACE__OWNER);
		}
		return providedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceInterface> getServiceDependencies() {
		if (serviceDependencies == null) {
			serviceDependencies = new EObjectResolvingEList<ServiceInterface>(ServiceInterface.class, this, AjilPackage.FUNCTIONAL_SERVICE__SERVICE_DEPENDENCIES);
		}
		return serviceDependencies;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AjilPackage.FUNCTIONAL_SERVICE__DISCOVERED_BY, oldDiscoveredBy, discoveredBy));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AjilPackage.FUNCTIONAL_SERVICE__DISCOVERED_BY, oldDiscoveredBy, newDiscoveredBy);
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
				msgs = ((InternalEObject)discoveredBy).eInverseRemove(this, AjilPackage.DISCOVERY_SERVICE__KNOWN_FUNCTIONAL_SERVICES, DiscoveryService.class, msgs);
			if (newDiscoveredBy != null)
				msgs = ((InternalEObject)newDiscoveredBy).eInverseAdd(this, AjilPackage.DISCOVERY_SERVICE__KNOWN_FUNCTIONAL_SERVICES, DiscoveryService.class, msgs);
			msgs = basicSetDiscoveredBy(newDiscoveredBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AjilPackage.FUNCTIONAL_SERVICE__DISCOVERED_BY, newDiscoveredBy, newDiscoveredBy));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AjilPackage.FUNCTIONAL_SERVICE__CONFIGURED_BY, oldConfiguredBy, configuredBy));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AjilPackage.FUNCTIONAL_SERVICE__CONFIGURED_BY, oldConfiguredBy, newConfiguredBy);
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
				msgs = ((InternalEObject)configuredBy).eInverseRemove(this, AjilPackage.CONFIGURATION_SERVICE__STORED_CONFIGURATIONS, ConfigurationService.class, msgs);
			if (newConfiguredBy != null)
				msgs = ((InternalEObject)newConfiguredBy).eInverseAdd(this, AjilPackage.CONFIGURATION_SERVICE__STORED_CONFIGURATIONS, ConfigurationService.class, msgs);
			msgs = basicSetConfiguredBy(newConfiguredBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AjilPackage.FUNCTIONAL_SERVICE__CONFIGURED_BY, newConfiguredBy, newConfiguredBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AjilPackage.FUNCTIONAL_SERVICE__DOMAIN:
				if (domain != null)
					msgs = ((InternalEObject)domain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AjilPackage.FUNCTIONAL_SERVICE__DOMAIN, null, msgs);
				return basicSetDomain((DomainModel)otherEnd, msgs);
			case AjilPackage.FUNCTIONAL_SERVICE__PROVIDED_INTERFACES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProvidedInterfaces()).basicAdd(otherEnd, msgs);
			case AjilPackage.FUNCTIONAL_SERVICE__DISCOVERED_BY:
				if (discoveredBy != null)
					msgs = ((InternalEObject)discoveredBy).eInverseRemove(this, AjilPackage.DISCOVERY_SERVICE__KNOWN_FUNCTIONAL_SERVICES, DiscoveryService.class, msgs);
				return basicSetDiscoveredBy((DiscoveryService)otherEnd, msgs);
			case AjilPackage.FUNCTIONAL_SERVICE__CONFIGURED_BY:
				if (configuredBy != null)
					msgs = ((InternalEObject)configuredBy).eInverseRemove(this, AjilPackage.CONFIGURATION_SERVICE__STORED_CONFIGURATIONS, ConfigurationService.class, msgs);
				return basicSetConfiguredBy((ConfigurationService)otherEnd, msgs);
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
			case AjilPackage.FUNCTIONAL_SERVICE__DOMAIN:
				return basicSetDomain(null, msgs);
			case AjilPackage.FUNCTIONAL_SERVICE__PROVIDED_INTERFACES:
				return ((InternalEList<?>)getProvidedInterfaces()).basicRemove(otherEnd, msgs);
			case AjilPackage.FUNCTIONAL_SERVICE__DISCOVERED_BY:
				return basicSetDiscoveredBy(null, msgs);
			case AjilPackage.FUNCTIONAL_SERVICE__CONFIGURED_BY:
				return basicSetConfiguredBy(null, msgs);
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
			case AjilPackage.FUNCTIONAL_SERVICE__DOMAIN:
				return getDomain();
			case AjilPackage.FUNCTIONAL_SERVICE__PROVIDED_INTERFACES:
				return getProvidedInterfaces();
			case AjilPackage.FUNCTIONAL_SERVICE__SERVICE_DEPENDENCIES:
				return getServiceDependencies();
			case AjilPackage.FUNCTIONAL_SERVICE__DISCOVERED_BY:
				if (resolve) return getDiscoveredBy();
				return basicGetDiscoveredBy();
			case AjilPackage.FUNCTIONAL_SERVICE__CONFIGURED_BY:
				if (resolve) return getConfiguredBy();
				return basicGetConfiguredBy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AjilPackage.FUNCTIONAL_SERVICE__DOMAIN:
				setDomain((DomainModel)newValue);
				return;
			case AjilPackage.FUNCTIONAL_SERVICE__PROVIDED_INTERFACES:
				getProvidedInterfaces().clear();
				getProvidedInterfaces().addAll((Collection<? extends ServiceInterface>)newValue);
				return;
			case AjilPackage.FUNCTIONAL_SERVICE__SERVICE_DEPENDENCIES:
				getServiceDependencies().clear();
				getServiceDependencies().addAll((Collection<? extends ServiceInterface>)newValue);
				return;
			case AjilPackage.FUNCTIONAL_SERVICE__DISCOVERED_BY:
				setDiscoveredBy((DiscoveryService)newValue);
				return;
			case AjilPackage.FUNCTIONAL_SERVICE__CONFIGURED_BY:
				setConfiguredBy((ConfigurationService)newValue);
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
			case AjilPackage.FUNCTIONAL_SERVICE__DOMAIN:
				setDomain((DomainModel)null);
				return;
			case AjilPackage.FUNCTIONAL_SERVICE__PROVIDED_INTERFACES:
				getProvidedInterfaces().clear();
				return;
			case AjilPackage.FUNCTIONAL_SERVICE__SERVICE_DEPENDENCIES:
				getServiceDependencies().clear();
				return;
			case AjilPackage.FUNCTIONAL_SERVICE__DISCOVERED_BY:
				setDiscoveredBy((DiscoveryService)null);
				return;
			case AjilPackage.FUNCTIONAL_SERVICE__CONFIGURED_BY:
				setConfiguredBy((ConfigurationService)null);
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
			case AjilPackage.FUNCTIONAL_SERVICE__DOMAIN:
				return domain != null;
			case AjilPackage.FUNCTIONAL_SERVICE__PROVIDED_INTERFACES:
				return providedInterfaces != null && !providedInterfaces.isEmpty();
			case AjilPackage.FUNCTIONAL_SERVICE__SERVICE_DEPENDENCIES:
				return serviceDependencies != null && !serviceDependencies.isEmpty();
			case AjilPackage.FUNCTIONAL_SERVICE__DISCOVERED_BY:
				return discoveredBy != null;
			case AjilPackage.FUNCTIONAL_SERVICE__CONFIGURED_BY:
				return configuredBy != null;
		}
		return super.eIsSet(featureID);
	}

} //FunctionalServiceImpl
