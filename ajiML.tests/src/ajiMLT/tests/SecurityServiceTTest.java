/**
 */
package ajiMLT.tests;

import ajiML.tests.SecurityServiceTest;

import ajiMLT.AjiMLTFactory;
import ajiMLT.SecurityServiceT;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Security Service T</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SecurityServiceTTest extends SecurityServiceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SecurityServiceTTest.class);
	}

	/**
	 * Constructs a new Security Service T test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityServiceTTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Security Service T test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SecurityServiceT getFixture() {
		return (SecurityServiceT)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AjiMLTFactory.eINSTANCE.createSecurityServiceT());
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

} //SecurityServiceTTest
