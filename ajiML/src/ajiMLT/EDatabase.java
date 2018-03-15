/**
 */
package ajiMLT;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EDatabase</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ajiMLT.AjiMLTPackage#getEDatabase()
 * @model
 * @generated
 */
public enum EDatabase implements Enumerator {
	/**
	 * The '<em><b>Mongo DB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONGO_DB_VALUE
	 * @generated
	 * @ordered
	 */
	MONGO_DB(0, "MongoDB", "MongoDB"),

	/**
	 * The '<em><b>My SQL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MY_SQL_VALUE
	 * @generated
	 * @ordered
	 */
	MY_SQL(1, "MySQL", "MySQL");

	/**
	 * The '<em><b>Mongo DB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mongo DB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MONGO_DB
	 * @model name="MongoDB"
	 * @generated
	 * @ordered
	 */
	public static final int MONGO_DB_VALUE = 0;

	/**
	 * The '<em><b>My SQL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>My SQL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MY_SQL
	 * @model name="MySQL"
	 * @generated
	 * @ordered
	 */
	public static final int MY_SQL_VALUE = 1;

	/**
	 * An array of all the '<em><b>EDatabase</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EDatabase[] VALUES_ARRAY =
		new EDatabase[] {
			MONGO_DB,
			MY_SQL,
		};

	/**
	 * A public read-only list of all the '<em><b>EDatabase</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EDatabase> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EDatabase</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EDatabase get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EDatabase result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EDatabase</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EDatabase getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EDatabase result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EDatabase</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EDatabase get(int value) {
		switch (value) {
			case MONGO_DB_VALUE: return MONGO_DB;
			case MY_SQL_VALUE: return MY_SQL;
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
	private EDatabase(int value, String name, String literal) {
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
	
} //EDatabase
