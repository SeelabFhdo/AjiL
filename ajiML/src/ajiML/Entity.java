/**
 */
package ajiML;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ajiML.Entity#getName <em>Name</em>}</li>
 *   <li>{@link ajiML.Entity#getParent <em>Parent</em>}</li>
 *   <li>{@link ajiML.Entity#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link ajiML.Entity#getRelations <em>Relations</em>}</li>
 *   <li>{@link ajiML.Entity#getDomainModel <em>Domain Model</em>}</li>
 * </ul>
 *
 * @see ajiML.AjiMLPackage#getEntity()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='sealedDomainInheritance uniqueEntityName'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL sealedDomainInheritance='if self.parent.oclIsUndefined() then true else if self.parent.domainModel = self.domainModel then true else false \nendif endif' uniqueEntityName='Entity.allInstances()-&gt;forAll(ent : Entity | ent &lt;&gt; self implies ent.name &lt;&gt; self.name)'"
 * @generated
 */
public interface Entity extends ComplexDataType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"myEntity"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ajiML.AjiMLPackage#getEntity_Name()
	 * @model default="myEntity" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ajiML.Entity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Entity)
	 * @see ajiML.AjiMLPackage#getEntity_Parent()
	 * @model
	 * @generated
	 */
	Entity getParent();

	/**
	 * Sets the value of the '{@link ajiML.Entity#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Entity value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link ajiML.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see ajiML.AjiMLPackage#getEntity_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataType> getAttributes();

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link ajiML.Relation}.
	 * It is bidirectional and its opposite is '{@link ajiML.Relation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see ajiML.AjiMLPackage#getEntity_Relations()
	 * @see ajiML.Relation#getSource
	 * @model opposite="source" containment="true"
	 * @generated
	 */
	EList<Relation> getRelations();

	/**
	 * Returns the value of the '<em><b>Domain Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ajiML.DataModel#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Model</em>' container reference.
	 * @see ajiML.AjiMLPackage#getEntity_DomainModel()
	 * @see ajiML.DataModel#getEntities
	 * @model opposite="entities" required="true" changeable="false"
	 * @generated
	 */
	DataModel getDomainModel();

} // Entity
