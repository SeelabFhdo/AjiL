/**
 */
package ajiMLT;

import ajiML.ServiceInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Interface T</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ajiMLT.ServiceInterfaceT#getMechanism <em>Mechanism</em>}</li>
 * </ul>
 *
 * @see ajiMLT.AjiMLTPackage#getServiceInterfaceT()
 * @model
 * @generated
 */
public interface ServiceInterfaceT extends ServiceInterface {
	/**
	 * Returns the value of the '<em><b>Mechanism</b></em>' attribute.
	 * The default value is <code>"RESTfulHTTP"</code>.
	 * The literals are from the enumeration {@link ajiMLT.ECommunicationMechanism}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mechanism</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mechanism</em>' attribute.
	 * @see ajiMLT.ECommunicationMechanism
	 * @see #setMechanism(ECommunicationMechanism)
	 * @see ajiMLT.AjiMLTPackage#getServiceInterfaceT_Mechanism()
	 * @model default="RESTfulHTTP" required="true"
	 * @generated
	 */
	ECommunicationMechanism getMechanism();

	/**
	 * Sets the value of the '{@link ajiMLT.ServiceInterfaceT#getMechanism <em>Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mechanism</em>' attribute.
	 * @see ajiMLT.ECommunicationMechanism
	 * @see #getMechanism()
	 * @generated
	 */
	void setMechanism(ECommunicationMechanism value);

} // ServiceInterfaceT
