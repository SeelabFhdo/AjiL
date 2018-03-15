/**
 */
package ajiMLT.tests;

import ajiML.tests.BooleanTest;

import ajiMLT.AjiMLTFactory;
import ajiMLT.BooleanT;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Boolean T</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BooleanTTest extends BooleanTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BooleanTTest.class);
	}

	/**
	 * Constructs a new Boolean T test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanTTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Boolean T test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BooleanT getFixture() {
		return (BooleanT)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AjiMLTFactory.eINSTANCE.createBooleanT());
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

} //BooleanTTest
