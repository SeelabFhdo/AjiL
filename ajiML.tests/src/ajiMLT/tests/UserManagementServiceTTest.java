/**
 */
package ajiMLT.tests;

import ajiML.tests.UserManagementServiceTest;

import ajiMLT.AjiMLTFactory;
import ajiMLT.UserManagementServiceT;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>User Management Service T</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UserManagementServiceTTest extends UserManagementServiceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UserManagementServiceTTest.class);
	}

	/**
	 * Constructs a new User Management Service T test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserManagementServiceTTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this User Management Service T test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UserManagementServiceT getFixture() {
		return (UserManagementServiceT)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AjiMLTFactory.eINSTANCE.createUserManagementServiceT());
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

} //UserManagementServiceTTest
