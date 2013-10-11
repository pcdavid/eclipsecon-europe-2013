/**
 */
package org.eclipse.sirius.example.tasks.model.tasks;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.sirius.example.tasks.model.tasks.Task#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.sirius.example.tasks.model.tasks.Task#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.eclipse.sirius.example.tasks.model.tasks.Task#getAssignee <em>Assignee</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.sirius.example.tasks.model.tasks.TasksPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends AbstractPlanableElement {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.sirius.example.tasks.model.tasks.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.sirius.example.tasks.model.tasks.Type
	 * @see #setKind(Type)
	 * @see org.eclipse.sirius.example.tasks.model.tasks.TasksPackage#getTask_Kind()
	 * @model required="true"
	 * @generated
	 */
	Type getKind();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.example.tasks.model.tasks.Task#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.sirius.example.tasks.model.tasks.Type
	 * @see #getKind()
	 * @generated
	 */
	void setKind(Type value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * The default value is <code>"Normal"</code>.
	 * The literals are from the enumeration {@link org.eclipse.sirius.example.tasks.model.tasks.Priority}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see org.eclipse.sirius.example.tasks.model.tasks.Priority
	 * @see #setPriority(Priority)
	 * @see org.eclipse.sirius.example.tasks.model.tasks.TasksPackage#getTask_Priority()
	 * @model default="Normal" required="true"
	 * @generated
	 */
	Priority getPriority();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.example.tasks.model.tasks.Task#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see org.eclipse.sirius.example.tasks.model.tasks.Priority
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(Priority value);

	/**
	 * Returns the value of the '<em><b>Assignee</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.example.tasks.model.tasks.Person#getIsInvolvedInTasks <em>Is Involved In Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignee</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignee</em>' reference.
	 * @see #setAssignee(Person)
	 * @see org.eclipse.sirius.example.tasks.model.tasks.TasksPackage#getTask_Assignee()
	 * @see org.eclipse.sirius.example.tasks.model.tasks.Person#getIsInvolvedInTasks
	 * @model opposite="isInvolvedInTasks"
	 * @generated
	 */
	Person getAssignee();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.example.tasks.model.tasks.Task#getAssignee <em>Assignee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignee</em>' reference.
	 * @see #getAssignee()
	 * @generated
	 */
	void setAssignee(Person value);

} // Task
