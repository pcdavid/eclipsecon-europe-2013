/**
 */
package org.eclipse.sirius.example.tasks.model.tasks;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.sirius.example.tasks.model.tasks.TaskRepository#getProjects <em>Projects</em>}</li>
 *   <li>{@link org.eclipse.sirius.example.tasks.model.tasks.TaskRepository#getPersons <em>Persons</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.sirius.example.tasks.model.tasks.TasksPackage#getTaskRepository()
 * @model
 * @generated
 */
public interface TaskRepository extends EObject {
	/**
	 * Returns the value of the '<em><b>Projects</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.example.tasks.model.tasks.Project}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projects</em>' containment reference list.
	 * @see org.eclipse.sirius.example.tasks.model.tasks.TasksPackage#getTaskRepository_Projects()
	 * @model containment="true"
	 * @generated
	 */
	EList<Project> getProjects();

	/**
	 * Returns the value of the '<em><b>Persons</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.example.tasks.model.tasks.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persons</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persons</em>' containment reference list.
	 * @see org.eclipse.sirius.example.tasks.model.tasks.TasksPackage#getTaskRepository_Persons()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getPersons();

} // TaskRepository
