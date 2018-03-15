/**
 */
package ajiML.impl;

import ajiML.AjiMLPackage;
import ajiML.Microservice;
import ajiML.UserManagementService;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Management Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ajiML.impl.UserManagementServiceImpl#getProvidesUsers <em>Provides Users</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserManagementServiceImpl extends InfrastructureServiceImpl implements UserManagementService {
	/**
	 * The cached value of the '{@link #getProvidesUsers() <em>Provides Users</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidesUsers()
	 * @generated
	 * @ordered
	 */
	protected EList<Microservice> providesUsers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserManagementServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AjiMLPackage.Literals.USER_MANAGEMENT_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Microservice> getProvidesUsers() {
		if (providesUsers == null) {
			providesUsers = new EObjectResolvingEList<Microservice>(Microservice.class, this, AjiMLPackage.USER_MANAGEMENT_SERVICE__PROVIDES_USERS);
		}
		return providesUsers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AjiMLPackage.USER_MANAGEMENT_SERVICE__PROVIDES_USERS:
				return getProvidesUsers();
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
			case AjiMLPackage.USER_MANAGEMENT_SERVICE__PROVIDES_USERS:
				getProvidesUsers().clear();
				getProvidesUsers().addAll((Collection<? extends Microservice>)newValue);
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
			case AjiMLPackage.USER_MANAGEMENT_SERVICE__PROVIDES_USERS:
				getProvidesUsers().clear();
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
			case AjiMLPackage.USER_MANAGEMENT_SERVICE__PROVIDES_USERS:
				return providesUsers != null && !providesUsers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UserManagementServiceImpl
