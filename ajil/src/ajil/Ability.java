/**
 */
package ajil;

import java.lang.String;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ajil.Ability#getName <em>Name</em>}</li>
 *   <li>{@link ajil.Ability#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see ajil.AjilPackage#getAbility()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueCapabilityName'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL uniqueCapabilityName='Ability.allInstances()-&gt;forAll(a : Ability | a &lt;&gt; self implies a.name &lt;&gt; self.name)'"
 * @generated
 */
public interface Ability extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ajil.AjilPackage#getAbility_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ajil.Ability#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ajil.ServiceInterface#getAbilities <em>Abilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see ajil.AjilPackage#getAbility_Owner()
	 * @see ajil.ServiceInterface#getAbilities
	 * @model opposite="abilities" required="true" changeable="false"
	 * @generated
	 */
	ServiceInterface getOwner();

} // Ability
