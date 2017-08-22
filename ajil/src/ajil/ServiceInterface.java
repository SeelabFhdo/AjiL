/**
 */
package ajil;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ajil.ServiceInterface#getName <em>Name</em>}</li>
 *   <li>{@link ajil.ServiceInterface#getMechanism <em>Mechanism</em>}</li>
 *   <li>{@link ajil.ServiceInterface#getVersion <em>Version</em>}</li>
 *   <li>{@link ajil.ServiceInterface#getAbilities <em>Abilities</em>}</li>
 *   <li>{@link ajil.ServiceInterface#getExposedToGateways <em>Exposed To Gateways</em>}</li>
 *   <li>{@link ajil.ServiceInterface#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see ajil.AjilPackage#getServiceInterface()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueInterfaceName'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL uniqueInterfaceName='ServiceInterface.allInstances()-&gt;forAll(s : ServiceInterface | s &lt;&gt; self implies s.name &lt;&gt; self.name)'"
 * @generated
 */
public interface ServiceInterface extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"myInterface"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ajil.AjilPackage#getServiceInterface_Name()
	 * @model default="myInterface" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ajil.ServiceInterface#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mechanism</b></em>' attribute.
	 * The literals are from the enumeration {@link ajil.ECommunicationMechanism}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mechanism</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mechanism</em>' attribute.
	 * @see ajil.ECommunicationMechanism
	 * @see #setMechanism(ECommunicationMechanism)
	 * @see ajil.AjilPackage#getServiceInterface_Mechanism()
	 * @model required="true"
	 * @generated
	 */
	ECommunicationMechanism getMechanism();

	/**
	 * Sets the value of the '{@link ajil.ServiceInterface#getMechanism <em>Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mechanism</em>' attribute.
	 * @see ajil.ECommunicationMechanism
	 * @see #getMechanism()
	 * @generated
	 */
	void setMechanism(ECommunicationMechanism value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(int)
	 * @see ajil.AjilPackage#getServiceInterface_Version()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getVersion();

	/**
	 * Sets the value of the '{@link ajil.ServiceInterface#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(int value);

	/**
	 * Returns the value of the '<em><b>Abilities</b></em>' containment reference list.
	 * The list contents are of type {@link ajil.Ability}.
	 * It is bidirectional and its opposite is '{@link ajil.Ability#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abilities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abilities</em>' containment reference list.
	 * @see ajil.AjilPackage#getServiceInterface_Abilities()
	 * @see ajil.Ability#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<Ability> getAbilities();

	/**
	 * Returns the value of the '<em><b>Exposed To Gateways</b></em>' reference list.
	 * The list contents are of type {@link ajil.APIService}.
	 * It is bidirectional and its opposite is '{@link ajil.APIService#getExposedServices <em>Exposed Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exposed To Gateways</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exposed To Gateways</em>' reference list.
	 * @see ajil.AjilPackage#getServiceInterface_ExposedToGateways()
	 * @see ajil.APIService#getExposedServices
	 * @model opposite="exposedServices" changeable="false"
	 * @generated
	 */
	EList<APIService> getExposedToGateways();

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ajil.FunctionalService#getProvidedInterfaces <em>Provided Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see ajil.AjilPackage#getServiceInterface_Owner()
	 * @see ajil.FunctionalService#getProvidedInterfaces
	 * @model opposite="providedInterfaces" required="true" changeable="false"
	 * @generated
	 */
	FunctionalService getOwner();

} // ServiceInterface
