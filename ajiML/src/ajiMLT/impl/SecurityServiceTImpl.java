/**
 */
package ajiMLT.impl;

import ajiML.impl.SecurityServiceImpl;

import ajiMLT.AjiMLTPackage;
import ajiMLT.EGenerator;
import ajiMLT.SecurityServiceT;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Service T</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ajiMLT.impl.SecurityServiceTImpl#getGenerator <em>Generator</em>}</li>
 *   <li>{@link ajiMLT.impl.SecurityServiceTImpl#getCertificatePath <em>Certificate Path</em>}</li>
 *   <li>{@link ajiMLT.impl.SecurityServiceTImpl#getCertificatePassword <em>Certificate Password</em>}</li>
 *   <li>{@link ajiMLT.impl.SecurityServiceTImpl#getKeyPairName <em>Key Pair Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityServiceTImpl extends SecurityServiceImpl implements SecurityServiceT {
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
	 * The default value of the '{@link #getCertificatePath() <em>Certificate Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificatePath()
	 * @generated
	 * @ordered
	 */
	protected static final String CERTIFICATE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCertificatePath() <em>Certificate Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificatePath()
	 * @generated
	 * @ordered
	 */
	protected String certificatePath = CERTIFICATE_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getCertificatePassword() <em>Certificate Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificatePassword()
	 * @generated
	 * @ordered
	 */
	protected static final String CERTIFICATE_PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCertificatePassword() <em>Certificate Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificatePassword()
	 * @generated
	 * @ordered
	 */
	protected String certificatePassword = CERTIFICATE_PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeyPairName() <em>Key Pair Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyPairName()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_PAIR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyPairName() <em>Key Pair Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyPairName()
	 * @generated
	 * @ordered
	 */
	protected String keyPairName = KEY_PAIR_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityServiceTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AjiMLTPackage.Literals.SECURITY_SERVICE_T;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AjiMLTPackage.SECURITY_SERVICE_T__GENERATOR, oldGenerator, generator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCertificatePath() {
		return certificatePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCertificatePath(String newCertificatePath) {
		String oldCertificatePath = certificatePath;
		certificatePath = newCertificatePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AjiMLTPackage.SECURITY_SERVICE_T__CERTIFICATE_PATH, oldCertificatePath, certificatePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCertificatePassword() {
		return certificatePassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCertificatePassword(String newCertificatePassword) {
		String oldCertificatePassword = certificatePassword;
		certificatePassword = newCertificatePassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AjiMLTPackage.SECURITY_SERVICE_T__CERTIFICATE_PASSWORD, oldCertificatePassword, certificatePassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeyPairName() {
		return keyPairName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyPairName(String newKeyPairName) {
		String oldKeyPairName = keyPairName;
		keyPairName = newKeyPairName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AjiMLTPackage.SECURITY_SERVICE_T__KEY_PAIR_NAME, oldKeyPairName, keyPairName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AjiMLTPackage.SECURITY_SERVICE_T__GENERATOR:
				return getGenerator();
			case AjiMLTPackage.SECURITY_SERVICE_T__CERTIFICATE_PATH:
				return getCertificatePath();
			case AjiMLTPackage.SECURITY_SERVICE_T__CERTIFICATE_PASSWORD:
				return getCertificatePassword();
			case AjiMLTPackage.SECURITY_SERVICE_T__KEY_PAIR_NAME:
				return getKeyPairName();
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
			case AjiMLTPackage.SECURITY_SERVICE_T__GENERATOR:
				setGenerator((EGenerator)newValue);
				return;
			case AjiMLTPackage.SECURITY_SERVICE_T__CERTIFICATE_PATH:
				setCertificatePath((String)newValue);
				return;
			case AjiMLTPackage.SECURITY_SERVICE_T__CERTIFICATE_PASSWORD:
				setCertificatePassword((String)newValue);
				return;
			case AjiMLTPackage.SECURITY_SERVICE_T__KEY_PAIR_NAME:
				setKeyPairName((String)newValue);
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
			case AjiMLTPackage.SECURITY_SERVICE_T__GENERATOR:
				setGenerator(GENERATOR_EDEFAULT);
				return;
			case AjiMLTPackage.SECURITY_SERVICE_T__CERTIFICATE_PATH:
				setCertificatePath(CERTIFICATE_PATH_EDEFAULT);
				return;
			case AjiMLTPackage.SECURITY_SERVICE_T__CERTIFICATE_PASSWORD:
				setCertificatePassword(CERTIFICATE_PASSWORD_EDEFAULT);
				return;
			case AjiMLTPackage.SECURITY_SERVICE_T__KEY_PAIR_NAME:
				setKeyPairName(KEY_PAIR_NAME_EDEFAULT);
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
			case AjiMLTPackage.SECURITY_SERVICE_T__GENERATOR:
				return generator != GENERATOR_EDEFAULT;
			case AjiMLTPackage.SECURITY_SERVICE_T__CERTIFICATE_PATH:
				return CERTIFICATE_PATH_EDEFAULT == null ? certificatePath != null : !CERTIFICATE_PATH_EDEFAULT.equals(certificatePath);
			case AjiMLTPackage.SECURITY_SERVICE_T__CERTIFICATE_PASSWORD:
				return CERTIFICATE_PASSWORD_EDEFAULT == null ? certificatePassword != null : !CERTIFICATE_PASSWORD_EDEFAULT.equals(certificatePassword);
			case AjiMLTPackage.SECURITY_SERVICE_T__KEY_PAIR_NAME:
				return KEY_PAIR_NAME_EDEFAULT == null ? keyPairName != null : !KEY_PAIR_NAME_EDEFAULT.equals(keyPairName);
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
		result.append(", certificatePath: ");
		result.append(certificatePath);
		result.append(", certificatePassword: ");
		result.append(certificatePassword);
		result.append(", KeyPairName: ");
		result.append(keyPairName);
		result.append(')');
		return result.toString();
	}

} //SecurityServiceTImpl
