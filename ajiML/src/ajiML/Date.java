/**
 */
package ajiML;

import java.lang.String;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ajiML.Date#getName <em>Name</em>}</li>
 *   <li>{@link ajiML.Date#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see ajiML.AjiMLPackage#getDate()
 * @model
 * @generated
 */
public interface Date extends PrimitiveDataType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"myInteger"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ajiML.AjiMLPackage#getDate_Name()
	 * @model default="myInteger" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ajiML.Date#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"Integer"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see ajiML.AjiMLPackage#getDate_Type()
	 * @model default="Integer" required="true" changeable="false"
	 * @generated
	 */
	String getType();

} // Date
