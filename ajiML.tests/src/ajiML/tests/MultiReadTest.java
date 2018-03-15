/**
 */
package ajiML.tests;

import ajiML.AjiMLFactory;
import ajiML.MultiRead;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Multi Read</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MultiReadTest extends AbilityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MultiReadTest.class);
	}

	/**
	 * Constructs a new Multi Read test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiReadTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Multi Read test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MultiRead getFixture() {
		return (MultiRead)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AjiMLFactory.eINSTANCE.createMultiRead());
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

} //MultiReadTest
