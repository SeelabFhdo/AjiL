/**
 */
package ajiMLT.impl;

import ajiML.impl.UserManagementServiceImpl;

import ajiMLT.AjiMLTPackage;
import ajiMLT.EGenerator;
import ajiMLT.UserManagementServiceT;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Management Service T</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ajiMLT.impl.UserManagementServiceTImpl#getGenerator <em>Generator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserManagementServiceTImpl extends UserManagementServiceImpl implements UserManagementServiceT {
	/**
	 * The default value of the '{@link #getGenerator() <em>Generator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerator()
	 * @generated
	 * @ordered
	 */
	protected static final EGenerator GENERATOR_EDEFAULT = EGenerator.SPRING_CLOUD;

	/**
	 * The cached value of the '{@link #getGenerator() <em>Generator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerator()
	 * @generated
	 * @ordered
	 */
	protected EGenerator generator = GENERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserManagementServiceTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AjiMLTPackage.Literals.USER_MANAGEMENT_SERVICE_T;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EGenerator getGenerator() {
		return generator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerator(EGenerator newGenerator) {
		EGenerator oldGenerator = generator;
		generator = newGenerator == null ? GENERATOR_EDEFAULT : newGenerator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AjiMLTPackage.USER_MANAGEMENT_SERVICE_T__GENERATOR, oldGenerator, generator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AjiMLTPackage.USER_MANAGEMENT_SERVICE_T__GENERATOR:
				return getGenerator();
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
			case AjiMLTPackage.USER_MANAGEMENT_SERVICE_T__GENERATOR:
				setGenerator((EGenerator)newValue);
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
			case AjiMLTPackage.USER_MANAGEMENT_SERVICE_T__GENERATOR:
				setGenerator(GENERATOR_EDEFAULT);
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
			case AjiMLTPackage.USER_MANAGEMENT_SERVICE_T__GENERATOR:
				return generator != GENERATOR_EDEFAULT;
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
		result.append(" (generator: ");
		result.append(generator);
		result.append(')');
		return result.toString();
	}

} //UserManagementServiceTImpl
