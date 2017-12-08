/**
 */
package ajiML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Management Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ajiML.UserManagementService#getProvidesUsers <em>Provides Users</em>}</li>
 * </ul>
 *
 * @see ajiML.AjiMLPackage#getUserManagementService()
 * @model
 * @generated
 */
public interface UserManagementService extends InfrastructureService {
	/**
	 * Returns the value of the '<em><b>Provides Users</b></em>' reference list.
	 * The list contents are of type {@link ajiML.Microservice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provides Users</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provides Users</em>' reference list.
	 * @see ajiML.AjiMLPackage#getUserManagementService_ProvidesUsers()
	 * @model
	 * @generated
	 */
	EList<Microservice> getProvidesUsers();

} // UserManagementService
