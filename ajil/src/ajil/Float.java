/**
 */
package ajil;

import java.lang.String;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Float</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ajil.Float#getName <em>Name</em>}</li>
 *   <li>{@link ajil.Float#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see ajil.AjilPackage#getFloat()
 * @model
 * @generated
 */
public interface Float extends PrimitiveDataType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"myFloat"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ajil.AjilPackage#getFloat_Name()
	 * @model default="myFloat" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ajil.Float#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"Float"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see ajil.AjilPackage#getFloat_Type()
	 * @model default="Float" required="true" changeable="false"
	 * @generated
	 */
	String getType();

} // Float
