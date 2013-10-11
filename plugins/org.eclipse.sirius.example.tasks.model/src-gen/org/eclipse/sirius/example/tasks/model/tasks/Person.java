/**
 */
package org.eclipse.sirius.example.tasks.model.tasks;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.sirius.example.tasks.model.tasks.Person#getFirstName <em>First Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.example.tasks.model.tasks.Person#getLastName <em>Last Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.example.tasks.model.tasks.Person#getIsInvolvedInTasks <em>Is Involved In Tasks</em>}</li>
 *   <li>{@link org.eclipse.sirius.example.tasks.model.tasks.Person#getLeads <em>Leads</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.sirius.example.tasks.model.tasks.TasksPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see org.eclipse.sirius.example.tasks.model.tasks.TasksPackage#getPerson_FirstName()
	 * @model required="true"
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.example.tasks.model.tasks.Person#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see org.eclipse.sirius.example.tasks.model.tasks.TasksPackage#getPerson_LastName()
	 * @model required="true"
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.example.tasks.model.tasks.Person#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>Is Involved In Tasks</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.example.tasks.model.tasks.Task}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.example.tasks.model.tasks.Task#getAssignee <em>Assignee</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Involved In Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Involved In Tasks</em>' reference list.
	 * @see org.eclipse.sirius.example.tasks.model.tasks.TasksPackage#getPerson_IsInvolvedInTasks()
	 * @see org.eclipse.sirius.example.tasks.model.tasks.Task#getAssignee
	 * @model opposite="assignee"
	 * @generated
	 */
	EList<Task> getIsInvolvedInTasks();

	/**
	 * Returns the value of the '<em><b>Leads</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.example.tasks.model.tasks.Project}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.example.tasks.model.tasks.Project#getIsLeadBy <em>Is Lead By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leads</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leads</em>' reference list.
	 * @see org.eclipse.sirius.example.tasks.model.tasks.TasksPackage#getPerson_Leads()
	 * @see org.eclipse.sirius.example.tasks.model.tasks.Project#getIsLeadBy
	 * @model opposite="isLeadBy"
	 * @generated
	 */
	EList<Project> getLeads();

} // Person
