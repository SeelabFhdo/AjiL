/**
 */
package ajiML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ajiML.FunctionalService#getDomain <em>Domain</em>}</li>
 *   <li>{@link ajiML.FunctionalService#getProvidedInterfaces <em>Provided Interfaces</em>}</li>
 *   <li>{@link ajiML.FunctionalService#getServiceDependencies <em>Service Dependencies</em>}</li>
 * </ul>
 *
 * @see ajiML.AjiMLPackage#getFunctionalService()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='noSelfDependency'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL noSelfDependency='self.serviceDependencies-&gt;forAll(i : ServiceInterface | self.providedInterfaces-&gt;excludes(i))'"
 * @generated
 */
public interface FunctionalService extends Microservice {
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ajiML.DataModel#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' containment reference.
	 * @see #setDomain(DataModel)
	 * @see ajiML.AjiMLPackage#getFunctionalService_Domain()
	 * @see ajiML.DataModel#getOwner
	 * @model opposite="owner" containment="true" required="true"
	 * @generated
	 */
	DataModel getDomain();

	/**
	 * Sets the value of the '{@link ajiML.FunctionalService#getDomain <em>Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' containment reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(DataModel value);

	/**
	 * Returns the value of the '<em><b>Provided Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link ajiML.ServiceInterface}.
	 * It is bidirectional and its opposite is '{@link ajiML.ServiceInterface#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Interfaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Interfaces</em>' containment reference list.
	 * @see ajiML.AjiMLPackage#getFunctionalService_ProvidedInterfaces()
	 * @see ajiML.ServiceInterface#getOwner
	 * @model opposite="owner" containment="true" required="true"
	 * @generated
	 */
	EList<ServiceInterface> getProvidedInterfaces();

	/**
	 * Returns the value of the '<em><b>Service Dependencies</b></em>' reference list.
	 * The list contents are of type {@link ajiML.ServiceInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Dependencies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Dependencies</em>' reference list.
	 * @see ajiML.AjiMLPackage#getFunctionalService_ServiceDependencies()
	 * @model
	 * @generated
	 */
	EList<ServiceInterface> getServiceDependencies();

} // FunctionalService
