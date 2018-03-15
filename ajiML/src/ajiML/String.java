/**
 */
package ajiML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ajiML.String#getName <em>Name</em>}</li>
 *   <li>{@link ajiML.String#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see ajiML.AjiMLPackage#getString()
 * @model
 * @generated
 */
public interface String extends PrimitiveDataType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"myString"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(java.lang.String)
	 * @see ajiML.AjiMLPackage#getString_Name()
	 * @model default="myString" required="true"
	 * @generated
	 */
	java.lang.String getName();

	/**
	 * Sets the value of the '{@link ajiML.String#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(java.lang.String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"String"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see ajiML.AjiMLPackage#getString_Type()
	 * @model default="String" required="true" changeable="false"
	 * @generated
	 */
	java.lang.String getType();

} // String
