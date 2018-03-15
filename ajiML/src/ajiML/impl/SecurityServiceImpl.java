/**
 */
package ajiML.impl;

import ajiML.AjiMLPackage;
import ajiML.Microservice;
import ajiML.SecurityService;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ajiML.impl.SecurityServiceImpl#getSecuredServices <em>Secured Services</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityServiceImpl extends InfrastructureServiceImpl implements SecurityService {
	/**
	 * The cached value of the '{@link #getSecuredServices() <em>Secured Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecuredServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Microservice> securedServices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AjiMLPackage.Literals.SECURITY_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Microservice> getSecuredServices() {
		if (securedServices == null) {
			securedServices = new EObjectWithInverseResolvingEList<Microservice>(Microservice.class, this, AjiMLPackage.SECURITY_SERVICE__SECURED_SERVICES, AjiMLPackage.MICROSERVICE__SECURED_BY);
		}
		return securedServices;
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
			case AjiMLPackage.SECURITY_SERVICE__SECURED_SERVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSecuredServices()).basicAdd(otherEnd, msgs);
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
			case AjiMLPackage.SECURITY_SERVICE__SECURED_SERVICES:
				return ((InternalEList<?>)getSecuredServices()).basicRemove(otherEnd, msgs);
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
			case AjiMLPackage.SECURITY_SERVICE__SECURED_SERVICES:
				return getSecuredServices();
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
			case AjiMLPackage.SECURITY_SERVICE__SECURED_SERVICES:
				getSecuredServices().clear();
				getSecuredServices().addAll((Collection<? extends Microservice>)newValue);
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
			case AjiMLPackage.SECURITY_SERVICE__SECURED_SERVICES:
				getSecuredServices().clear();
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
			case AjiMLPackage.SECURITY_SERVICE__SECURED_SERVICES:
				return securedServices != null && !securedServices.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SecurityServiceImpl
