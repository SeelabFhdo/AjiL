/**
 */
package ajiMLT.tests;

import ajiML.tests.DataModelTest;
import ajiMLT.AjiMLTFactory;
import ajiMLT.DataModelT;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Data Model T</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataModelTTest extends DataModelTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DataModelTTest.class);
	}

	/**
	 * Constructs a new Data Model T test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataModelTTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Data Model T test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DataModelT getFixture() {
		return (DataModelT)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AjiMLTFactory.eINSTANCE.createDataModelT());
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

} //DataModelTTest
