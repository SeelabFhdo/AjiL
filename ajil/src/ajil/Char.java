/**
 */
package ajil;

import java.lang.String;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Char</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ajil.Char#getName <em>Name</em>}</li>
 *   <li>{@link ajil.Char#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see ajil.AjilPackage#getChar()
 * @model
 * @generated
 */
public interface Char extends PrimitiveDataType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"myChar"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ajil.AjilPackage#getChar_Name()
	 * @model default="myChar" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ajil.Char#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"Char"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see ajil.AjilPackage#getChar_Type()
	 * @model default="Char" required="true" changeable="false"
	 * @generated
	 */
	String getType();

} // Char
