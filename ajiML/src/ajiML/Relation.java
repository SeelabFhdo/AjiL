/**
 */
package ajiML;

import java.lang.String;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ajiML.Relation#getName <em>Name</em>}</li>
 *   <li>{@link ajiML.Relation#getSource <em>Source</em>}</li>
 *   <li>{@link ajiML.Relation#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see ajiML.AjiMLPackage#getRelation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='sealedDomain noSelfRelation'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL sealedDomain='self.source.domainModel = self.target.domainModel' noSelfRelation='self.source &lt;&gt; self.target'"
 * @generated
 */
public interface Relation extends Multiplicity {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"myRelation"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ajiML.AjiMLPackage#getRelation_Name()
	 * @model default="myRelation"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ajiML.Relation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ajiML.Entity#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' container reference.
	 * @see ajiML.AjiMLPackage#getRelation_Source()
	 * @see ajiML.Entity#getRelations
	 * @model opposite="relations" required="true" transient="false" changeable="false"
	 * @generated
	 */
	Entity getSource();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Entity)
	 * @see ajiML.AjiMLPackage#getRelation_Target()
	 * @model required="true"
	 * @generated
	 */
	Entity getTarget();

	/**
	 * Sets the value of the '{@link ajiML.Relation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Entity value);

} // Relation
