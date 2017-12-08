/**
 */
package ajiMLT;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ECommunication Mechanism</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ajiMLT.AjiMLTPackage#getECommunicationMechanism()
 * @model
 * @generated
 */
public enum ECommunicationMechanism implements Enumerator {
	/**
	 * The '<em><b>RES Tful HTTP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RES_TFUL_HTTP_VALUE
	 * @generated
	 * @ordered
	 */
	RES_TFUL_HTTP(0, "RESTfulHTTP", "RESTfulHTTP"),

	/**
	 * The '<em><b>Publish Subscribe</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLISH_SUBSCRIBE_VALUE
	 * @generated
	 * @ordered
	 */
	PUBLISH_SUBSCRIBE(1, "PublishSubscribe", "PublishSubscribe");

	/**
	 * The '<em><b>RES Tful HTTP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RES Tful HTTP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RES_TFUL_HTTP
	 * @model name="RESTfulHTTP"
	 * @generated
	 * @ordered
	 */
	public static final int RES_TFUL_HTTP_VALUE = 0;

	/**
	 * The '<em><b>Publish Subscribe</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Publish Subscribe</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PUBLISH_SUBSCRIBE
	 * @model name="PublishSubscribe"
	 * @generated
	 * @ordered
	 */
	public static final int PUBLISH_SUBSCRIBE_VALUE = 1;

	/**
	 * An array of all the '<em><b>ECommunication Mechanism</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ECommunicationMechanism[] VALUES_ARRAY =
		new ECommunicationMechanism[] {
			RES_TFUL_HTTP,
			PUBLISH_SUBSCRIBE,
		};

	/**
	 * A public read-only list of all the '<em><b>ECommunication Mechanism</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ECommunicationMechanism> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ECommunication Mechanism</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ECommunicationMechanism get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ECommunicationMechanism result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ECommunication Mechanism</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ECommunicationMechanism getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ECommunicationMechanism result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ECommunication Mechanism</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ECommunicationMechanism get(int value) {
		switch (value) {
			case RES_TFUL_HTTP_VALUE: return RES_TFUL_HTTP;
			case PUBLISH_SUBSCRIBE_VALUE: return PUBLISH_SUBSCRIBE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ECommunicationMechanism(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ECommunicationMechanism
