/**
 */
package ajil.impl;

import ajil.APIService;
import ajil.AjilPackage;
import ajil.DiscoveryService;
import ajil.ServiceInterface;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>API Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ajil.impl.APIServiceImpl#getExposedServices <em>Exposed Services</em>}</li>
 *   <li>{@link ajil.impl.APIServiceImpl#getDiscoveredBy <em>Discovered By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APIServiceImpl extends InfrastructureServiceImpl implements APIService {
	/**
	 * The cached value of the '{@link #getExposedServices() <em>Exposed Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposedServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceInterface> exposedServices;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APIServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AjilPackage.Literals.API_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceInterface> getExposedServices() {
		if (exposedServices == null) {
			exposedServices = new EObjectWithInverseResolvingEList.ManyInverse<ServiceInterface>(ServiceInterface.class, this, AjilPackage.API_SERVICE__EXPOSED_SERVICES, AjilPackage.SERVICE_INTERFACE__EXPOSED_TO_GATEWAYS);
		}
		return exposedServices;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AjilPackage.API_SERVICE__DISCOVERED_BY, oldDiscoveredBy, discoveredBy));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AjilPackage.API_SERVICE__DISCOVERED_BY, oldDiscoveredBy, newDiscoveredBy);
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
				msgs = ((InternalEObject)discoveredBy).eInverseRemove(this, AjilPackage.DISCOVERY_SERVICE__KNOWN_API_SERVICES, DiscoveryService.class, msgs);
			if (newDiscoveredBy != null)
				msgs = ((InternalEObject)newDiscoveredBy).eInverseAdd(this, AjilPackage.DISCOVERY_SERVICE__KNOWN_API_SERVICES, DiscoveryService.class, msgs);
			msgs = basicSetDiscoveredBy(newDiscoveredBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AjilPackage.API_SERVICE__DISCOVERED_BY, newDiscoveredBy, newDiscoveredBy));
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
			case AjilPackage.API_SERVICE__EXPOSED_SERVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExposedServices()).basicAdd(otherEnd, msgs);
			case AjilPackage.API_SERVICE__DISCOVERED_BY:
				if (discoveredBy != null)
					msgs = ((InternalEObject)discoveredBy).eInverseRemove(this, AjilPackage.DISCOVERY_SERVICE__KNOWN_API_SERVICES, DiscoveryService.class, msgs);
				return basicSetDiscoveredBy((DiscoveryService)otherEnd, msgs);
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
			case AjilPackage.API_SERVICE__EXPOSED_SERVICES:
				return ((InternalEList<?>)getExposedServices()).basicRemove(otherEnd, msgs);
			case AjilPackage.API_SERVICE__DISCOVERED_BY:
				return basicSetDiscoveredBy(null, msgs);
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
			case AjilPackage.API_SERVICE__EXPOSED_SERVICES:
				return getExposedServices();
			case AjilPackage.API_SERVICE__DISCOVERED_BY:
				if (resolve) return getDiscoveredBy();
				return basicGetDiscoveredBy();
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
			case AjilPackage.API_SERVICE__EXPOSED_SERVICES:
				getExposedServices().clear();
				getExposedServices().addAll((Collection<? extends ServiceInterface>)newValue);
				return;
			case AjilPackage.API_SERVICE__DISCOVERED_BY:
				setDiscoveredBy((DiscoveryService)newValue);
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
			case AjilPackage.API_SERVICE__EXPOSED_SERVICES:
				getExposedServices().clear();
				return;
			case AjilPackage.API_SERVICE__DISCOVERED_BY:
				setDiscoveredBy((DiscoveryService)null);
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
			case AjilPackage.API_SERVICE__EXPOSED_SERVICES:
				return exposedServices != null && !exposedServices.isEmpty();
			case AjilPackage.API_SERVICE__DISCOVERED_BY:
				return discoveredBy != null;
		}
		return super.eIsSet(featureID);
	}

} //APIServiceImpl
