/**
 */
package ajiMLT.tests;

import ajiML.tests.ServiceInterfaceTest;

import ajiMLT.AjiMLTFactory;
import ajiMLT.ServiceInterfaceT;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Service Interface T</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceInterfaceTTest extends ServiceInterfaceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ServiceInterfaceTTest.class);
	}

	/**
	 * Constructs a new Service Interface T test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceInterfaceTTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Service Interface T test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ServiceInterfaceT getFixture() {
		return (ServiceInterfaceT)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AjiMLTFactory.eINSTANCE.createServiceInterfaceT());
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

} //ServiceInterfaceTTest
