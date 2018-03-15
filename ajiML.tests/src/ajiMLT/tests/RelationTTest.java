/**
 */
package ajiMLT.tests;

import ajiML.tests.RelationTest;

import ajiMLT.AjiMLTFactory;
import ajiMLT.RelationT;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Relation T</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationTTest extends RelationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RelationTTest.class);
	}

	/**
	 * Constructs a new Relation T test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationTTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Relation T test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RelationT getFixture() {
		return (RelationT)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AjiMLTFactory.eINSTANCE.createRelationT());
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

} //RelationTTest
