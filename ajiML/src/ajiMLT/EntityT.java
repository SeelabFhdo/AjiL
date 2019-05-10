/**
 */
package ajiMLT;

import ajiML.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity T</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ajiMLT.EntityT#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see ajiMLT.AjiMLTPackage#getEntityT()
 * @model
 * @generated
 */
public interface EntityT extends Entity {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"NORMAL"</code>.
	 * The literals are from the enumeration {@link ajiMLT.EEntitySpecifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see ajiMLT.EEntitySpecifier
	 * @see #setType(EEntitySpecifier)
	 * @see ajiMLT.AjiMLTPackage#getEntityT_Type()
	 * @model default="NORMAL"
	 * @generated
	 */
	EEntitySpecifier getType();

	/**
	 * Sets the value of the '{@link ajiMLT.EntityT#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see ajiMLT.EEntitySpecifier
	 * @see #getType()
	 * @generated
	 */
	void setType(EEntitySpecifier value);

} // EntityT
