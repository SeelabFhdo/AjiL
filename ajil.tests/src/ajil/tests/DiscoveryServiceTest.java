/**
 */
package ajil.tests;

import ajil.AjilFactory;
import ajil.DiscoveryService;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Discovery Service</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiscoveryServiceTest extends InfrastructureServiceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DiscoveryServiceTest.class);
	}

	/**
	 * Constructs a new Discovery Service test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscoveryServiceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Discovery Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DiscoveryService getFixture() {
		return (DiscoveryService)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AjilFactory.eINSTANCE.createDiscoveryService());
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

} //DiscoveryServiceTest
