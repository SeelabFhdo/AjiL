/**
 */
package ajiMLT.tests;

import ajiML.tests.APIServiceTest;

import ajiMLT.APIServiceT;
import ajiMLT.AjiMLTFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>API Service T</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class APIServiceTTest extends APIServiceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(APIServiceTTest.class);
	}

	/**
	 * Constructs a new API Service T test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APIServiceTTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this API Service T test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected APIServiceT getFixture() {
		return (APIServiceT)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AjiMLTFactory.eINSTANCE.createAPIServiceT());
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

} //APIServiceTTest
