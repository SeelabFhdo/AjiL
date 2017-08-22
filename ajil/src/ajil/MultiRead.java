/**
 */
package ajil;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Read</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ajil.MultiRead#getSubject <em>Subject</em>}</li>
 * </ul>
 *
 * @see ajil.AjilPackage#getMultiRead()
 * @model
 * @generated
 */
public interface MultiRead extends Ability {
	/**
	 * Returns the value of the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' reference.
	 * @see #setSubject(Entity)
	 * @see ajil.AjilPackage#getMultiRead_Subject()
	 * @model required="true"
	 * @generated
	 */
	Entity getSubject();

	/**
	 * Sets the value of the '{@link ajil.MultiRead#getSubject <em>Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Entity value);

} // MultiRead
