/**
 */
package ajiMLT.tests;

import ajiML.tests.IntegerTest;

import ajiMLT.AjiMLTFactory;
import ajiMLT.IntegerT;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Integer T</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntegerTTest extends IntegerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IntegerTTest.class);
	}

	/**
	 * Constructs a new Integer T test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerTTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Integer T test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IntegerT getFixture() {
		return (IntegerT)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AjiMLTFactory.eINSTANCE.createIntegerT());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //IntegerTTest
