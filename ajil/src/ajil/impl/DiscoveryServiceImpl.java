/**
 */
package ajil.impl;

import ajil.APIService;
import ajil.AjilPackage;
import ajil.ConfigurationService;
import ajil.DiscoveryService;
import ajil.FunctionalService;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discovery Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ajil.impl.DiscoveryServiceImpl#getKnownFunctionalServices <em>Known Functional Services</em>}</li>
 *   <li>{@link ajil.impl.DiscoveryServiceImpl#getKnownApiServices <em>Known Api Services</em>}</li>
 *   <li>{@link ajil.impl.DiscoveryServiceImpl#getKnownConfigurationServices <em>Known Configuration Services</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiscoveryServiceImpl extends InfrastructureServiceImpl implements DiscoveryService {
	/**
	 * The cached value of the '{@link #getKnownFunctionalServices() <em>Known Functional Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKnownFunctionalServices()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionalService> knownFunctionalServices;

	/**
	 * The cached value of the '{@link #getKnownApiServices() <em>Known Api Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKnownApiServices()
	 * @generated
	 * @ordered
	 */
	protected EList<APIService> knownApiServices;

	/**
	 * The cached value of the '{@link #getKnownConfigurationServices() <em>Known Configuration Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKnownConfigurationServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigurationService> knownConfigurationServices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscoveryServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AjilPackage.Literals.DISCOVERY_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionalService> getKnownFunctionalServices() {
		if (knownFunctionalServices == null) {
			knownFunctionalServices = new EObjectWithInverseResolvingEList<FunctionalService>(FunctionalService.class, this, AjilPackage.DISCOVERY_SERVICE__KNOWN_FUNCTIONAL_SERVICES, AjilPackage.FUNCTIONAL_SERVICE__DISCOVERED_BY);
		}
		return knownFunctionalServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<APIService> getKnownApiServices() {
		if (knownApiServices == null) {
			knownApiServices = new EObjectWithInverseResolvingEList<APIService>(APIService.class, this, AjilPackage.DISCOVERY_SERVICE__KNOWN_API_SERVICES, AjilPackage.API_SERVICE__DISCOVERED_BY);
		}
		return knownApiServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigurationService> getKnownConfigurationServices() {
		if (knownConfigurationServices == null) {
			knownConfigurationServices = new EObjectWithInverseResolvingEList<ConfigurationService>(ConfigurationService.class, this, AjilPackage.DISCOVERY_SERVICE__KNOWN_CONFIGURATION_SERVICES, AjilPackage.CONFIGURATION_SERVICE__DISCOVERED_BY);
		}
		return knownConfigurationServices;
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
			case AjilPackage.DISCOVERY_SERVICE__KNOWN_FUNCTIONAL_SERVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getKnownFunctionalServices()).basicAdd(otherEnd, msgs);
			case AjilPackage.DISCOVERY_SERVICE__KNOWN_API_SERVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getKnownApiServices()).basicAdd(otherEnd, msgs);
			case AjilPackage.DISCOVERY_SERVICE__KNOWN_CONFIGURATION_SERVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getKnownConfigurationServices()).basicAdd(otherEnd, msgs);
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
			case AjilPackage.DISCOVERY_SERVICE__KNOWN_FUNCTIONAL_SERVICES:
				return ((InternalEList<?>)getKnownFunctionalServices()).basicRemove(otherEnd, msgs);
			case AjilPackage.DISCOVERY_SERVICE__KNOWN_API_SERVICES:
				return ((InternalEList<?>)getKnownApiServices()).basicRemove(otherEnd, msgs);
			case AjilPackage.DISCOVERY_SERVICE__KNOWN_CONFIGURATION_SERVICES:
				return ((InternalEList<?>)getKnownConfigurationServices()).basicRemove(otherEnd, msgs);
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
			case AjilPackage.DISCOVERY_SERVICE__KNOWN_FUNCTIONAL_SERVICES:
				return getKnownFunctionalServices();
			case AjilPackage.DISCOVERY_SERVICE__KNOWN_API_SERVICES:
				return getKnownApiServices();
			case AjilPackage.DISCOVERY_SERVICE__KNOWN_CONFIGURATION_SERVICES:
				return getKnownConfigurationServices();
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
			case AjilPackage.DISCOVERY_SERVICE__KNOWN_FUNCTIONAL_SERVICES:
				getKnownFunctionalServices().clear();
				getKnownFunctionalServices().addAll((Collection<? extends FunctionalService>)newValue);
				return;
			case AjilPackage.DISCOVERY_SERVICE__KNOWN_API_SERVICES:
				getKnownApiServices().clear();
				getKnownApiServices().addAll((Collection<? extends APIService>)newValue);
				return;
			case AjilPackage.DISCOVERY_SERVICE__KNOWN_CONFIGURATION_SERVICES:
				getKnownConfigurationServices().clear();
				getKnownConfigurationServices().addAll((Collection<? extends ConfigurationService>)newValue);
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
			case AjilPackage.DISCOVERY_SERVICE__KNOWN_FUNCTIONAL_SERVICES:
				getKnownFunctionalServices().clear();
				return;
			case AjilPackage.DISCOVERY_SERVICE__KNOWN_API_SERVICES:
				getKnownApiServices().clear();
				return;
			case AjilPackage.DISCOVERY_SERVICE__KNOWN_CONFIGURATION_SERVICES:
				getKnownConfigurationServices().clear();
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
			case AjilPackage.DISCOVERY_SERVICE__KNOWN_FUNCTIONAL_SERVICES:
				return knownFunctionalServices != null && !knownFunctionalServices.isEmpty();
			case AjilPackage.DISCOVERY_SERVICE__KNOWN_API_SERVICES:
				return knownApiServices != null && !knownApiServices.isEmpty();
			case AjilPackage.DISCOVERY_SERVICE__KNOWN_CONFIGURATION_SERVICES:
				return knownConfigurationServices != null && !knownConfigurationServices.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DiscoveryServiceImpl
