/**
 */
package ajiMLT;

import ajiML.SecurityService;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Service T</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ajiMLT.SecurityServiceT#getGenerator <em>Generator</em>}</li>
 *   <li>{@link ajiMLT.SecurityServiceT#getCertificatePath <em>Certificate Path</em>}</li>
 *   <li>{@link ajiMLT.SecurityServiceT#getCertificatePassword <em>Certificate Password</em>}</li>
 *   <li>{@link ajiMLT.SecurityServiceT#getKeyPairName <em>Key Pair Name</em>}</li>
 * </ul>
 *
 * @see ajiMLT.AjiMLTPackage#getSecurityServiceT()
 * @model
 * @generated
 */
public interface SecurityServiceT extends SecurityService {
	/**
	 * Returns the value of the '<em><b>Generator</b></em>' attribute.
	 * The default value is <code>"SpringCloud"</code>.
	 * The literals are from the enumeration {@link ajiMLT.EGenerator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator</em>' attribute.
	 * @see ajiMLT.EGenerator
	 * @see #setGenerator(EGenerator)
	 * @see ajiMLT.AjiMLTPackage#getSecurityServiceT_Generator()
	 * @model default="SpringCloud" required="true"
	 * @generated
	 */
	EGenerator getGenerator();

	/**
	 * Sets the value of the '{@link ajiMLT.SecurityServiceT#getGenerator <em>Generator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator</em>' attribute.
	 * @see ajiMLT.EGenerator
	 * @see #getGenerator()
	 * @generated
	 */
	void setGenerator(EGenerator value);

	/**
	 * Returns the value of the '<em><b>Certificate Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Certificate Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Certificate Path</em>' attribute.
	 * @see #setCertificatePath(String)
	 * @see ajiMLT.AjiMLTPackage#getSecurityServiceT_CertificatePath()
	 * @model
	 * @generated
	 */
	String getCertificatePath();

	/**
	 * Sets the value of the '{@link ajiMLT.SecurityServiceT#getCertificatePath <em>Certificate Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certificate Path</em>' attribute.
	 * @see #getCertificatePath()
	 * @generated
	 */
	void setCertificatePath(String value);

	/**
	 * Returns the value of the '<em><b>Certificate Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Certificate Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Certificate Password</em>' attribute.
	 * @see #setCertificatePassword(String)
	 * @see ajiMLT.AjiMLTPackage#getSecurityServiceT_CertificatePassword()
	 * @model
	 * @generated
	 */
	String getCertificatePassword();

	/**
	 * Sets the value of the '{@link ajiMLT.SecurityServiceT#getCertificatePassword <em>Certificate Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certificate Password</em>' attribute.
	 * @see #getCertificatePassword()
	 * @generated
	 */
	void setCertificatePassword(String value);

	/**
	 * Returns the value of the '<em><b>Key Pair Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Pair Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Pair Name</em>' attribute.
	 * @see #setKeyPairName(String)
	 * @see ajiMLT.AjiMLTPackage#getSecurityServiceT_KeyPairName()
	 * @model
	 * @generated
	 */
	String getKeyPairName();

	/**
	 * Sets the value of the '{@link ajiMLT.SecurityServiceT#getKeyPairName <em>Key Pair Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Pair Name</em>' attribute.
	 * @see #getKeyPairName()
	 * @generated
	 */
	void setKeyPairName(String value);

} // SecurityServiceT
