/**
 */
package ajiMLT.tests;

import ajiML.tests.IntegerTest;

import ajiMLT.AjiMLTFactory;
import ajiMLT.IntergerT;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Interger T</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntergerTTest extends IntegerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IntergerTTest.class);
	}

	/**
	 * Constructs a new Interger T test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntergerTTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Interger T test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IntergerT getFixture() {
		return (IntergerT)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AjiMLTFactory.eINSTANCE.createIntergerT());
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

} //IntergerTTest
