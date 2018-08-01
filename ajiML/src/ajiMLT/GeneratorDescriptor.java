/**
 */
package ajiMLT;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ajiMLT.GeneratorDescriptor#getGenerator <em>Generator</em>}</li>
 * </ul>
 *
 * @see ajiMLT.AjiMLTPackage#getGeneratorDescriptor()
 * @model abstract="true"
 * @generated
 */
public interface GeneratorDescriptor extends EObject {
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
	 * @see ajiMLT.AjiMLTPackage#getGeneratorDescriptor_Generator()
	 * @model default="SpringCloud" required="true"
	 * @generated
	 */
	EGenerator getGenerator();

	/**
	 * Sets the value of the '{@link ajiMLT.GeneratorDescriptor#getGenerator <em>Generator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator</em>' attribute.
	 * @see ajiMLT.EGenerator
	 * @see #getGenerator()
	 * @generated
	 */
	void setGenerator(EGenerator value);

} // GeneratorDescriptor
