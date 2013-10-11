/**
 */
package org.eclipse.sirius.example.tasks.model.tasks;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.sirius.example.tasks.model.tasks.TasksFactory
 * @model kind="package"
 * @generated
 */
public interface TasksPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tasks";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/sirius/examples/tasks";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tasks";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TasksPackage eINSTANCE = org.eclipse.sirius.example.tasks.model.tasks.impl.TasksPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.example.tasks.model.tasks.impl.AbstractNamedElementImpl <em>Abstract Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.example.tasks.model.tasks.impl.AbstractNamedElementImpl
	 * @see org.eclipse.sirius.example.tasks.model.tasks.impl.TasksPackageImpl#getAbstractNamedElement()
	 * @generated
	 */
	int ABSTRACT_NAMED_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Abstract Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.example.tasks.model.tasks.impl.AbstractPlanableElementImpl <em>Abstract Planable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.example.tasks.model.tasks.impl.AbstractPlanableElementImpl
	 * @see org.eclipse.sirius.example.tasks.model.tasks.impl.TasksPackageImpl#getAbstractPlanableElement()
	 * @generated
	 */
	int ABSTRACT_PLANABLE_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PLANABLE_ELEMENT__NAME = ABSTRACT_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PLANABLE_ELEMENT__DUE_DATE = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Estimated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PLANABLE_ELEMENT__ESTIMATED = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Remaining</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PLANABLE_ELEMENT__REMAINING = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Abstract Planable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PLANABLE_ELEMENT_FEATURE_COUNT = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.example.tasks.model.tasks.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.example.tasks.model.tasks.impl.TaskImpl
	 * @see org.eclipse.sirius.example.tasks.model.tasks.impl.TasksPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = ABSTRACT_PLANABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DUE_DATE = ABSTRACT_PLANABLE_ELEMENT__DUE_DATE;

	/**
	 * The feature id for the '<em><b>Estimated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ESTIMATED = ABSTRACT_PLANABLE_ELEMENT__ESTIMATED;

	/**
	 * The feature id for the '<em><b>Remaining</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__REMAINING = ABSTRACT_PLANABLE_ELEMENT__REMAINING;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__KIND = ABSTRACT_PLANABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PRIORITY = ABSTRACT_PLANABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ASSIGNEE = ABSTRACT_PLANABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = ABSTRACT_PLANABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.example.tasks.model.tasks.impl.ProjectVersionImpl <em>Project Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.example.tasks.model.tasks.impl.ProjectVersionImpl
	 * @see org.eclipse.sirius.example.tasks.model.tasks.impl.TasksPackageImpl#getProjectVersion()
	 * @generated
	 */
	int PROJECT_VERSION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_VERSION__NAME = ABSTRACT_PLANABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_VERSION__DUE_DATE = ABSTRACT_PLANABLE_ELEMENT__DUE_DATE;

	/**
	 * The feature id for the '<em><b>Estimated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_VERSION__ESTIMATED = ABSTRACT_PLANABLE_ELEMENT__ESTIMATED;

	/**
	 * The feature id for the '<em><b>Remaining</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_VERSION__REMAINING = ABSTRACT_PLANABLE_ELEMENT__REMAINING;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_VERSION__TASKS = ABSTRACT_PLANABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Released</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_VERSION__RELEASED = ABSTRACT_PLANABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Project Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_VERSION_FEATURE_COUNT = ABSTRACT_PLANABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.example.tasks.model.tasks.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.example.tasks.model.tasks.impl.PersonImpl
	 * @see org.eclipse.sirius.example.tasks.model.tasks.impl.TasksPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 4;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FIRST_NAME = 0;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LAST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Is Involved In Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__IS_INVOLVED_IN_TASKS = 2;

	/**
	 * The feature id for the '<em><b>Leads</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LEADS = 3;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.example.tasks.model.tasks.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.example.tasks.model.tasks.impl.ProjectImpl
	 * @see org.eclipse.sirius.example.tasks.model.tasks.impl.TasksPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = ABSTRACT_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Is Lead By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__IS_LEAD_BY = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__VERSIONS = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.example.tasks.model.tasks.impl.TaskRepositoryImpl <em>Task Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.example.tasks.model.tasks.impl.TaskRepositoryImpl
	 * @see org.eclipse.sirius.example.tasks.model.tasks.impl.TasksPackageImpl#getTaskRepository()
	 * @generated
	 */
	int TASK_REPOSITORY = 6;

	/**
	 * The feature id for the '<em><b>Projects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REPOSITORY__PROJECTS = 0;

	/**
	 * The feature id for the '<em><b>Persons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REPOSITORY__PERSONS = 1;

	/**
	 * The number of structural features of the '<em>Task Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REPOSITORY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.example.tasks.model.tasks.Priority <em>Priority</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.example.tasks.model.tasks.Priority
	 * @see org.eclipse.sirius.example.tasks.model.tasks.impl.TasksPackageImpl#getPriority()
	 * @generated
	 */
	int PRIORITY = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.sirius.example.tasks.model.tasks.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sirius.example.tasks.model.tasks.Type
	 * @see org.eclipse.sirius.example.tasks.model.tasks.impl.TasksPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 8;


	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.example.tasks.model.tasks.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see org.eclipse.sirius.example.tasks.model.tasks.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.example.tasks.model.tasks.Task#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.eclipse.sirius.example.tasks.model.tasks.Task#getKind()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Kind();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.example.tasks.model.tasks.Task#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see org.eclipse.sirius.example.tasks.model.tasks.Task#getPriority()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Priority();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.example.tasks.model.tasks.Task#getAssignee <em>Assignee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assignee</em>'.
	 * @see org.eclipse.sirius.example.tasks.model.tasks.Task#getAssignee()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Assignee();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.example.tasks.model.tasks.ProjectVersion <em>Project Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Version</em>'.
	 * @see org.eclipse.sirius.example.tasks.model.tasks.ProjectVersion
	 * @generated
	 */
	EClass getProjectVersion();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.example.tasks.model.tasks.ProjectVersion#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see org.eclipse.sirius.example.tasks.model.tasks.ProjectVersion#getTasks()
	 * @see #getProjectVersion()
	 * @generated
	 */
	EReference getProjectVersion_Tasks();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.example.tasks.model.tasks.ProjectVersion#getReleased <em>Released</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Released</em>'.
	 * @see org.eclipse.sirius.example.tasks.model.tasks.ProjectVersion#getReleased()
	 * @see #getProjectVersion()
	 * @generated
	 */
	EAttribute getProjectVersion_Released();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.example.tasks.model.tasks.AbstractNamedElement <em>Abstract Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Named Element</em>'.
	 * @see org.eclipse.sirius.example.tasks.model.tasks.AbstractNamedElement
	 * @generated
	 */
	EClass getAbstractNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.example.tasks.model.tasks.AbstractNamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.sirius.example.tasks.model.tasks.AbstractNamedElement#getName()
	 * @see #getAbstractNamedElement()
	 * @generated
	 */
	EAttribute getAbstractNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.example.tasks.model.tasks.AbstractPlanableElement <em>Abstract Planable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Planable Element</em>'.
	 * @see org.eclipse.sirius.example.tasks.model.tasks.AbstractPlanableElement
	 * @generated
	 */
	EClass getAbstractPlanableElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.example.tasks.model.tasks.AbstractPlanableElement#getDueDate <em>Due Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Due Date</em>'.
	 * @see org.eclipse.sirius.example.tasks.model.tasks.AbstractPlanableElement#getDueDate()
	 * @see #getAbstractPlanableElement()
	 * @generated
	 */
	EAttribute getAbstractPlanableElement_DueDate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.example.tasks.model.tasks.AbstractPlanableElement#getEstimated <em>Estimated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated</em>'.
	 * @see org.eclipse.sirius.example.tasks.model.tasks.AbstractPlanableElement#getEstimated()
	 * @see #getAbstractPlanableElement()
	 * @generated
	 */
	EAttribute getAbstractPlanableElement_Estimated();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.example.tasks.model.tasks.AbstractPlanableElement#getRemaining <em>Remaining</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remaining</em>'.
	 * @see org.eclipse.sirius.example.tasks.model.tasks.AbstractPlanableElement#getRemaining()
	 * @see #getAbstractPlanableElement()
	 * @generated
	 */
	EAttribute getAbstractPlanableElement_Remaining();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.example.tasks.model.tasks.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see org.eclipse.sirius.example.tasks.model.tasks.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.example.tasks.model.tasks.Person#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see org.eclipse.sirius.example.tasks.model.tasks.Person#getFirstName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sirius.example.tasks.model.tasks.Person#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see org.eclipse.sirius.example.tasks.model.tasks.Person#getLastName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_LastName();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.example.tasks.model.tasks.Person#getIsInvolvedInTasks <em>Is Involved In Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Involved In Tasks</em>'.
	 * @see org.eclipse.sirius.example.tasks.model.tasks.Person#getIsInvolvedInTasks()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_IsInvolvedInTasks();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.sirius.example.tasks.model.tasks.Person#getLeads <em>Leads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Leads</em>'.
	 * @see org.eclipse.sirius.example.tasks.model.tasks.Person#getLeads()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Leads();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.example.tasks.model.tasks.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see org.eclipse.sirius.example.tasks.model.tasks.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sirius.example.tasks.model.tasks.Project#getIsLeadBy <em>Is Lead By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Lead By</em>'.
	 * @see org.eclipse.sirius.example.tasks.model.tasks.Project#getIsLeadBy()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_IsLeadBy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.example.tasks.model.tasks.Project#getVersions <em>Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Versions</em>'.
	 * @see org.eclipse.sirius.example.tasks.model.tasks.Project#getVersions()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Versions();

	/**
	 * Returns the meta object for class '{@link org.eclipse.sirius.example.tasks.model.tasks.TaskRepository <em>Task Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Repository</em>'.
	 * @see org.eclipse.sirius.example.tasks.model.tasks.TaskRepository
	 * @generated
	 */
	EClass getTaskRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.example.tasks.model.tasks.TaskRepository#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Projects</em>'.
	 * @see org.eclipse.sirius.example.tasks.model.tasks.TaskRepository#getProjects()
	 * @see #getTaskRepository()
	 * @generated
	 */
	EReference getTaskRepository_Projects();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sirius.example.tasks.model.tasks.TaskRepository#getPersons <em>Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persons</em>'.
	 * @see org.eclipse.sirius.example.tasks.model.tasks.TaskRepository#getPersons()
	 * @see #getTaskRepository()
	 * @generated
	 */
	EReference getTaskRepository_Persons();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.sirius.example.tasks.model.tasks.Priority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Priority</em>'.
	 * @see org.eclipse.sirius.example.tasks.model.tasks.Priority
	 * @generated
	 */
	EEnum getPriority();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.sirius.example.tasks.model.tasks.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see org.eclipse.sirius.example.tasks.model.tasks.Type
	 * @generated
	 */
	EEnum getType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TasksFactory getTasksFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.example.tasks.model.tasks.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.example.tasks.model.tasks.impl.TaskImpl
		 * @see org.eclipse.sirius.example.tasks.model.tasks.impl.TasksPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__KIND = eINSTANCE.getTask_Kind();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__PRIORITY = eINSTANCE.getTask_Priority();

		/**
		 * The meta object literal for the '<em><b>Assignee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__ASSIGNEE = eINSTANCE.getTask_Assignee();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.example.tasks.model.tasks.impl.ProjectVersionImpl <em>Project Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.example.tasks.model.tasks.impl.ProjectVersionImpl
		 * @see org.eclipse.sirius.example.tasks.model.tasks.impl.TasksPackageImpl#getProjectVersion()
		 * @generated
		 */
		EClass PROJECT_VERSION = eINSTANCE.getProjectVersion();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_VERSION__TASKS = eINSTANCE.getProjectVersion_Tasks();

		/**
		 * The meta object literal for the '<em><b>Released</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_VERSION__RELEASED = eINSTANCE.getProjectVersion_Released();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.example.tasks.model.tasks.impl.AbstractNamedElementImpl <em>Abstract Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.example.tasks.model.tasks.impl.AbstractNamedElementImpl
		 * @see org.eclipse.sirius.example.tasks.model.tasks.impl.TasksPackageImpl#getAbstractNamedElement()
		 * @generated
		 */
		EClass ABSTRACT_NAMED_ELEMENT = eINSTANCE.getAbstractNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_NAMED_ELEMENT__NAME = eINSTANCE.getAbstractNamedElement_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.example.tasks.model.tasks.impl.AbstractPlanableElementImpl <em>Abstract Planable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.example.tasks.model.tasks.impl.AbstractPlanableElementImpl
		 * @see org.eclipse.sirius.example.tasks.model.tasks.impl.TasksPackageImpl#getAbstractPlanableElement()
		 * @generated
		 */
		EClass ABSTRACT_PLANABLE_ELEMENT = eINSTANCE.getAbstractPlanableElement();

		/**
		 * The meta object literal for the '<em><b>Due Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PLANABLE_ELEMENT__DUE_DATE = eINSTANCE.getAbstractPlanableElement_DueDate();

		/**
		 * The meta object literal for the '<em><b>Estimated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PLANABLE_ELEMENT__ESTIMATED = eINSTANCE.getAbstractPlanableElement_Estimated();

		/**
		 * The meta object literal for the '<em><b>Remaining</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PLANABLE_ELEMENT__REMAINING = eINSTANCE.getAbstractPlanableElement_Remaining();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.example.tasks.model.tasks.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.example.tasks.model.tasks.impl.PersonImpl
		 * @see org.eclipse.sirius.example.tasks.model.tasks.impl.TasksPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__FIRST_NAME = eINSTANCE.getPerson_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__LAST_NAME = eINSTANCE.getPerson_LastName();

		/**
		 * The meta object literal for the '<em><b>Is Involved In Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__IS_INVOLVED_IN_TASKS = eINSTANCE.getPerson_IsInvolvedInTasks();

		/**
		 * The meta object literal for the '<em><b>Leads</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__LEADS = eINSTANCE.getPerson_Leads();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.example.tasks.model.tasks.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.example.tasks.model.tasks.impl.ProjectImpl
		 * @see org.eclipse.sirius.example.tasks.model.tasks.impl.TasksPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Is Lead By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__IS_LEAD_BY = eINSTANCE.getProject_IsLeadBy();

		/**
		 * The meta object literal for the '<em><b>Versions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__VERSIONS = eINSTANCE.getProject_Versions();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.example.tasks.model.tasks.impl.TaskRepositoryImpl <em>Task Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.example.tasks.model.tasks.impl.TaskRepositoryImpl
		 * @see org.eclipse.sirius.example.tasks.model.tasks.impl.TasksPackageImpl#getTaskRepository()
		 * @generated
		 */
		EClass TASK_REPOSITORY = eINSTANCE.getTaskRepository();

		/**
		 * The meta object literal for the '<em><b>Projects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_REPOSITORY__PROJECTS = eINSTANCE.getTaskRepository_Projects();

		/**
		 * The meta object literal for the '<em><b>Persons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_REPOSITORY__PERSONS = eINSTANCE.getTaskRepository_Persons();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.example.tasks.model.tasks.Priority <em>Priority</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.example.tasks.model.tasks.Priority
		 * @see org.eclipse.sirius.example.tasks.model.tasks.impl.TasksPackageImpl#getPriority()
		 * @generated
		 */
		EEnum PRIORITY = eINSTANCE.getPriority();

		/**
		 * The meta object literal for the '{@link org.eclipse.sirius.example.tasks.model.tasks.Type <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sirius.example.tasks.model.tasks.Type
		 * @see org.eclipse.sirius.example.tasks.model.tasks.impl.TasksPackageImpl#getType()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getType();

	}

} //TasksPackage
