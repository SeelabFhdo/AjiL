/**
 */
package ajiML.impl;

import ajiML.AjiMLPackage;
import ajiML.ConfigurationService;
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
 * An implementation of the model object '<em><b>Configuration Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ajiML.impl.ConfigurationServiceImpl#getConfiguredServices <em>Configured Services</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationServiceImpl extends InfrastructureServiceImpl implements ConfigurationService {
	/**
	 * The cached value of the '{@link #getConfiguredServices() <em>Configured Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguredServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Microservice> configuredServices;

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
		return AjiMLPackage.Literals.CONFIGURATION_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Microservice> getConfiguredServices() {
		if (configuredServices == null) {
			configuredServices = new EObjectWithInverseResolvingEList<Microservice>(Microservice.class, this, AjiMLPackage.CONFIGURATION_SERVICE__CONFIGURED_SERVICES, AjiMLPackage.MICROSERVICE__CONFIGURED_BY);
		}
		return configuredServices;
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
			case AjiMLPackage.CONFIGURATION_SERVICE__CONFIGURED_SERVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConfiguredServices()).basicAdd(otherEnd, msgs);
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
			case AjiMLPackage.CONFIGURATION_SERVICE__CONFIGURED_SERVICES:
				return ((InternalEList<?>)getConfiguredServices()).basicRemove(otherEnd, msgs);
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
			case AjiMLPackage.CONFIGURATION_SERVICE__CONFIGURED_SERVICES:
				return getConfiguredServices();
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
			case AjiMLPackage.CONFIGURATION_SERVICE__CONFIGURED_SERVICES:
				getConfiguredServices().clear();
				getConfiguredServices().addAll((Collection<? extends Microservice>)newValue);
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
			case AjiMLPackage.CONFIGURATION_SERVICE__CONFIGURED_SERVICES:
				getConfiguredServices().clear();
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
			case AjiMLPackage.CONFIGURATION_SERVICE__CONFIGURED_SERVICES:
				return configuredServices != null && !configuredServices.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationServiceImpl
