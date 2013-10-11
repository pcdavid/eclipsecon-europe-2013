/**
 */
package org.eclipse.sirius.example.tasks.model.tasks;

import java.util.Date;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.sirius.example.tasks.model.tasks.ProjectVersion#getTasks <em>Tasks</em>}</li>
 *   <li>{@link org.eclipse.sirius.example.tasks.model.tasks.ProjectVersion#getReleased <em>Released</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.sirius.example.tasks.model.tasks.TasksPackage#getProjectVersion()
 * @model
 * @generated
 */
public interface ProjectVersion extends AbstractPlanableElement {
	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.example.tasks.model.tasks.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see org.eclipse.sirius.example.tasks.model.tasks.TasksPackage#getProjectVersion_Tasks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Task> getTasks();

	/**
	 * Returns the value of the '<em><b>Released</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Released</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Released</em>' attribute.
	 * @see #setReleased(Date)
	 * @see org.eclipse.sirius.example.tasks.model.tasks.TasksPackage#getProjectVersion_Released()
	 * @model
	 * @generated
	 */
	Date getReleased();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.example.tasks.model.tasks.ProjectVersion#getReleased <em>Released</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Released</em>' attribute.
	 * @see #getReleased()
	 * @generated
	 */
	void setReleased(Date value);

} // ProjectVersion
