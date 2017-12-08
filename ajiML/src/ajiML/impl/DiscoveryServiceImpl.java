/**
 */
package ajiML.impl;

import ajiML.AjiMLPackage;
import ajiML.DiscoveryService;
import ajiML.Microservice;

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
 *   <li>{@link ajiML.impl.DiscoveryServiceImpl#getDiscoveredServices <em>Discovered Services</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiscoveryServiceImpl extends InfrastructureServiceImpl implements DiscoveryService {
	/**
	 * The cached value of the '{@link #getDiscoveredServices() <em>Discovered Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscoveredServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Microservice> discoveredServices;

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
		return AjiMLPackage.Literals.DISCOVERY_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Microservice> getDiscoveredServices() {
		if (discoveredServices == null) {
			discoveredServices = new EObjectWithInverseResolvingEList<Microservice>(Microservice.class, this, AjiMLPackage.DISCOVERY_SERVICE__DISCOVERED_SERVICES, AjiMLPackage.MICROSERVICE__DISCOVERED_BY);
		}
		return discoveredServices;
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
			case AjiMLPackage.DISCOVERY_SERVICE__DISCOVERED_SERVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDiscoveredServices()).basicAdd(otherEnd, msgs);
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
			case AjiMLPackage.DISCOVERY_SERVICE__DISCOVERED_SERVICES:
				return ((InternalEList<?>)getDiscoveredServices()).basicRemove(otherEnd, msgs);
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
			case AjiMLPackage.DISCOVERY_SERVICE__DISCOVERED_SERVICES:
				return getDiscoveredServices();
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
			case AjiMLPackage.DISCOVERY_SERVICE__DISCOVERED_SERVICES:
				getDiscoveredServices().clear();
				getDiscoveredServices().addAll((Collection<? extends Microservice>)newValue);
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
			case AjiMLPackage.DISCOVERY_SERVICE__DISCOVERED_SERVICES:
				getDiscoveredServices().clear();
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
			case AjiMLPackage.DISCOVERY_SERVICE__DISCOVERED_SERVICES:
				return discoveredServices != null && !discoveredServices.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DiscoveryServiceImpl
