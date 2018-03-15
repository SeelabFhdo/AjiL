/**
 */
package ajiML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ajiML.Multiplicity#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 *
 * @see ajiML.AjiMLPackage#getMultiplicity()
 * @model abstract="true"
 * @generated
 */
public interface Multiplicity extends EObject {
	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' attribute.
	 * The literals are from the enumeration {@link ajiML.EMultiplicity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' attribute.
	 * @see ajiML.EMultiplicity
	 * @see #setMultiplicity(EMultiplicity)
	 * @see ajiML.AjiMLPackage#getMultiplicity_Multiplicity()
	 * @model required="true"
	 * @generated
	 */
	EMultiplicity getMultiplicity();

	/**
	 * Sets the value of the '{@link ajiML.Multiplicity#getMultiplicity <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' attribute.
	 * @see ajiML.EMultiplicity
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(EMultiplicity value);

} // Multiplicity
