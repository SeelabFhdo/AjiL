/**
 */
package ajiMLT.impl;

import ajiML.impl.FunctionalServiceImpl;

import ajiMLT.AjiMLTPackage;
import ajiMLT.EDatabase;
import ajiMLT.EGenerator;
import ajiMLT.FunctionalServiceT;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Service T</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ajiMLT.impl.FunctionalServiceTImpl#getGenerator <em>Generator</em>}</li>
 *   <li>{@link ajiMLT.impl.FunctionalServiceTImpl#getDatabase <em>Database</em>}</li>
 *   <li>{@link ajiMLT.impl.FunctionalServiceTImpl#getContainerized <em>Containerized</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionalServiceTImpl extends FunctionalServiceImpl implements FunctionalServiceT {
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
	 * The default value of the '{@link #getDatabase() <em>Database</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabase()
	 * @generated
	 * @ordered
	 */
	protected static final EDatabase DATABASE_EDEFAULT = EDatabase.MONGO_DB;

	/**
	 * The cached value of the '{@link #getDatabase() <em>Database</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabase()
	 * @generated
	 * @ordered
	 */
	protected EDatabase database = DATABASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContainerized() <em>Containerized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerized()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CONTAINERIZED_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getContainerized() <em>Containerized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerized()
	 * @generated
	 * @ordered
	 */
	protected Boolean containerized = CONTAINERIZED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalServiceTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AjiMLTPackage.Literals.FUNCTIONAL_SERVICE_T;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AjiMLTPackage.FUNCTIONAL_SERVICE_T__GENERATOR, oldGenerator, generator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDatabase getDatabase() {
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabase(EDatabase newDatabase) {
		EDatabase oldDatabase = database;
		database = newDatabase == null ? DATABASE_EDEFAULT : newDatabase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AjiMLTPackage.FUNCTIONAL_SERVICE_T__DATABASE, oldDatabase, database));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getContainerized() {
		return containerized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerized(Boolean newContainerized) {
		Boolean oldContainerized = containerized;
		containerized = newContainerized;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AjiMLTPackage.FUNCTIONAL_SERVICE_T__CONTAINERIZED, oldContainerized, containerized));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AjiMLTPackage.FUNCTIONAL_SERVICE_T__GENERATOR:
				return getGenerator();
			case AjiMLTPackage.FUNCTIONAL_SERVICE_T__DATABASE:
				return getDatabase();
			case AjiMLTPackage.FUNCTIONAL_SERVICE_T__CONTAINERIZED:
				return getContainerized();
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
			case AjiMLTPackage.FUNCTIONAL_SERVICE_T__GENERATOR:
				setGenerator((EGenerator)newValue);
				return;
			case AjiMLTPackage.FUNCTIONAL_SERVICE_T__DATABASE:
				setDatabase((EDatabase)newValue);
				return;
			case AjiMLTPackage.FUNCTIONAL_SERVICE_T__CONTAINERIZED:
				setContainerized((Boolean)newValue);
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
			case AjiMLTPackage.FUNCTIONAL_SERVICE_T__GENERATOR:
				setGenerator(GENERATOR_EDEFAULT);
				return;
			case AjiMLTPackage.FUNCTIONAL_SERVICE_T__DATABASE:
				setDatabase(DATABASE_EDEFAULT);
				return;
			case AjiMLTPackage.FUNCTIONAL_SERVICE_T__CONTAINERIZED:
				setContainerized(CONTAINERIZED_EDEFAULT);
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
			case AjiMLTPackage.FUNCTIONAL_SERVICE_T__GENERATOR:
				return generator != GENERATOR_EDEFAULT;
			case AjiMLTPackage.FUNCTIONAL_SERVICE_T__DATABASE:
				return database != DATABASE_EDEFAULT;
			case AjiMLTPackage.FUNCTIONAL_SERVICE_T__CONTAINERIZED:
				return CONTAINERIZED_EDEFAULT == null ? containerized != null : !CONTAINERIZED_EDEFAULT.equals(containerized);
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
		result.append(", database: ");
		result.append(database);
		result.append(", containerized: ");
		result.append(containerized);
		result.append(')');
		return result.toString();
	}

} //FunctionalServiceTImpl
