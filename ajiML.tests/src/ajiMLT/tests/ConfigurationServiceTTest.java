/**
 */
package ajiMLT.tests;

import ajiML.tests.ConfigurationServiceTest;

import ajiMLT.AjiMLTFactory;
import ajiMLT.ConfigurationServiceT;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Configuration Service T</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigurationServiceTTest extends ConfigurationServiceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConfigurationServiceTTest.class);
	}

	/**
	 * Constructs a new Configuration Service T test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationServiceTTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Configuration Service T test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ConfigurationServiceT getFixture() {
		return (ConfigurationServiceT)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AjiMLTFactory.eINSTANCE.createConfigurationServiceT());
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

} //ConfigurationServiceTTest
