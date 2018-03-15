/**
 */
package ajiMLT.tests;

import ajiML.tests.FunctionalServiceTest;

import ajiMLT.AjiMLTFactory;
import ajiMLT.FunctionalServiceT;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Functional Service T</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionalServiceTTest extends FunctionalServiceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FunctionalServiceTTest.class);
	}

	/**
	 * Constructs a new Functional Service T test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalServiceTTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Functional Service T test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FunctionalServiceT getFixture() {
		return (FunctionalServiceT)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AjiMLTFactory.eINSTANCE.createFunctionalServiceT());
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

} //FunctionalServiceTTest
