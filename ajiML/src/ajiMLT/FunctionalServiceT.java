/**
 */
package ajiMLT;

import ajiML.FunctionalService;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Service T</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ajiMLT.FunctionalServiceT#getDatabase <em>Database</em>}</li>
 *   <li>{@link ajiMLT.FunctionalServiceT#getContainerized <em>Containerized</em>}</li>
 * </ul>
 *
 * @see ajiMLT.AjiMLTPackage#getFunctionalServiceT()
 * @model
 * @generated
 */
public interface FunctionalServiceT extends FunctionalService, GeneratorDescriptor {
	/**
	 * Returns the value of the '<em><b>Database</b></em>' attribute.
	 * The default value is <code>"MongoDB"</code>.
	 * The literals are from the enumeration {@link ajiMLT.EDatabase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database</em>' attribute.
	 * @see ajiMLT.EDatabase
	 * @see #setDatabase(EDatabase)
	 * @see ajiMLT.AjiMLTPackage#getFunctionalServiceT_Database()
	 * @model default="MongoDB" required="true"
	 * @generated
	 */
	EDatabase getDatabase();

	/**
	 * Sets the value of the '{@link ajiMLT.FunctionalServiceT#getDatabase <em>Database</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database</em>' attribute.
	 * @see ajiMLT.EDatabase
	 * @see #getDatabase()
	 * @generated
	 */
	void setDatabase(EDatabase value);

	/**
	 * Returns the value of the '<em><b>Containerized</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * The literals are from the enumeration {@link ajiMLT.EContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containerized</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containerized</em>' attribute.
	 * @see ajiMLT.EContainer
	 * @see #setContainerized(EContainer)
	 * @see ajiMLT.AjiMLTPackage#getFunctionalServiceT_Containerized()
	 * @model default="None" required="true"
	 * @generated
	 */
	EContainer getContainerized();

	/**
	 * Sets the value of the '{@link ajiMLT.FunctionalServiceT#getContainerized <em>Containerized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containerized</em>' attribute.
	 * @see ajiMLT.EContainer
	 * @see #getContainerized()
	 * @generated
	 */
	void setContainerized(EContainer value);

} // FunctionalServiceT
