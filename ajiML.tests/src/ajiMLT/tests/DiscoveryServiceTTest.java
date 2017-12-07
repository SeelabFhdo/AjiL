/**
 */
package ajiMLT.tests;

import ajiML.tests.DiscoveryServiceTest;

import ajiMLT.AjiMLTFactory;
import ajiMLT.DiscoveryServiceT;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Discovery Service T</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiscoveryServiceTTest extends DiscoveryServiceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DiscoveryServiceTTest.class);
	}

	/**
	 * Constructs a new Discovery Service T test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscoveryServiceTTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Discovery Service T test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DiscoveryServiceT getFixture() {
		return (DiscoveryServiceT)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AjiMLTFactory.eINSTANCE.createDiscoveryServiceT());
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

} //DiscoveryServiceTTest
