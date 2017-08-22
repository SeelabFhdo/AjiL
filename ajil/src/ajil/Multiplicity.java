/**
 */
package ajil;

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
 *   <li>{@link ajil.Multiplicity#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 *
 * @see ajil.AjilPackage#getMultiplicity()
 * @model abstract="true"
 * @generated
 */
public interface Multiplicity extends EObject {
	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' attribute.
	 * The literals are from the enumeration {@link ajil.EMultiplicity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' attribute.
	 * @see ajil.EMultiplicity
	 * @see #setMultiplicity(EMultiplicity)
	 * @see ajil.AjilPackage#getMultiplicity_Multiplicity()
	 * @model required="true"
	 * @generated
	 */
	EMultiplicity getMultiplicity();

	/**
	 * Sets the value of the '{@link ajil.Multiplicity#getMultiplicity <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' attribute.
	 * @see ajil.EMultiplicity
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(EMultiplicity value);

} // Multiplicity
