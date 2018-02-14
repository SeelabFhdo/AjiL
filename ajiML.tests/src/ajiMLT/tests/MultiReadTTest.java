/**
 */
package ajiMLT.tests;

import ajiML.tests.MultiReadTest;

import ajiMLT.AjiMLTFactory;
import ajiMLT.MultiReadT;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Multi Read T</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MultiReadTTest extends MultiReadTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MultiReadTTest.class);
	}

	/**
	 * Constructs a new Multi Read T test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiReadTTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Multi Read T test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MultiReadT getFixture() {
		return (MultiReadT)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AjiMLTFactory.eINSTANCE.createMultiReadT());
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

} //MultiReadTTest
