/**
 */
package ajil;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ajil.DomainModel#getName <em>Name</em>}</li>
 *   <li>{@link ajil.DomainModel#getEntities <em>Entities</em>}</li>
 *   <li>{@link ajil.DomainModel#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see ajil.AjilPackage#getDomainModel()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueDomainName'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL uniqueDomainName='DomainModel.allInstances()-&gt;forAll(d : DomainModel | d &lt;&gt; self implies d.name &lt;&gt; self.name)'"
 * @generated
 */
public interface DomainModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"myDomainModel"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ajil.AjilPackage#getDomainModel_Name()
	 * @model default="myDomainModel" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ajil.DomainModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link ajil.Entity}.
	 * It is bidirectional and its opposite is '{@link ajil.Entity#getDomainModel <em>Domain Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see ajil.AjilPackage#getDomainModel_Entities()
	 * @see ajil.Entity#getDomainModel
	 * @model opposite="domainModel" containment="true"
	 * @generated
	 */
	EList<Entity> getEntities();

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ajil.FunctionalService#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see ajil.AjilPackage#getDomainModel_Owner()
	 * @see ajil.FunctionalService#getDomain
	 * @model opposite="domain" required="true" transient="false" changeable="false"
	 * @generated
	 */
	FunctionalService getOwner();

} // DomainModel
