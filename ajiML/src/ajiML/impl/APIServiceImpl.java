/**
 */
package ajiML.impl;

import ajiML.APIService;
import ajiML.AjiMLPackage;
import ajiML.ServiceInterface;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
 *   <li>{@link ajiML.impl.APIServiceImpl#getExposedServices <em>Exposed Services</em>}</li>
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
		return AjiMLPackage.Literals.API_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceInterface> getExposedServices() {
		if (exposedServices == null) {
			exposedServices = new EObjectWithInverseResolvingEList.ManyInverse<ServiceInterface>(ServiceInterface.class, this, AjiMLPackage.API_SERVICE__EXPOSED_SERVICES, AjiMLPackage.SERVICE_INTERFACE__EXPOSED_TO_GATEWAYS);
		}
		return exposedServices;
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
			case AjiMLPackage.API_SERVICE__EXPOSED_SERVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExposedServices()).basicAdd(otherEnd, msgs);
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
			case AjiMLPackage.API_SERVICE__EXPOSED_SERVICES:
				return ((InternalEList<?>)getExposedServices()).basicRemove(otherEnd, msgs);
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
			case AjiMLPackage.API_SERVICE__EXPOSED_SERVICES:
				return getExposedServices();
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
			case AjiMLPackage.API_SERVICE__EXPOSED_SERVICES:
				getExposedServices().clear();
				getExposedServices().addAll((Collection<? extends ServiceInterface>)newValue);
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
			case AjiMLPackage.API_SERVICE__EXPOSED_SERVICES:
				getExposedServices().clear();
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
			case AjiMLPackage.API_SERVICE__EXPOSED_SERVICES:
				return exposedServices != null && !exposedServices.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //APIServiceImpl
