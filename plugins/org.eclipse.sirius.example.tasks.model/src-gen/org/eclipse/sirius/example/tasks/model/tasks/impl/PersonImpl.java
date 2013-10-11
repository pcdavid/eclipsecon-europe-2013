/**
 */
package org.eclipse.sirius.example.tasks.model.tasks.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.sirius.example.tasks.model.tasks.Person;
import org.eclipse.sirius.example.tasks.model.tasks.Project;
import org.eclipse.sirius.example.tasks.model.tasks.Task;
import org.eclipse.sirius.example.tasks.model.tasks.TasksPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.sirius.example.tasks.model.tasks.impl.PersonImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.example.tasks.model.tasks.impl.PersonImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.example.tasks.model.tasks.impl.PersonImpl#getIsInvolvedInTasks <em>Is Involved In Tasks</em>}</li>
 *   <li>{@link org.eclipse.sirius.example.tasks.model.tasks.impl.PersonImpl#getLeads <em>Leads</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonImpl extends EObjectImpl implements Person {
	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected String lastName = LAST_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIsInvolvedInTasks() <em>Is Involved In Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsInvolvedInTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> isInvolvedInTasks;

	/**
	 * The cached value of the '{@link #getLeads() <em>Leads</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeads()
	 * @generated
	 * @ordered
	 */
	protected EList<Project> leads;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TasksPackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasksPackage.PERSON__FIRST_NAME, oldFirstName, firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastName(String newLastName) {
		String oldLastName = lastName;
		lastName = newLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasksPackage.PERSON__LAST_NAME, oldLastName, lastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getIsInvolvedInTasks() {
		if (isInvolvedInTasks == null) {
			isInvolvedInTasks = new EObjectWithInverseResolvingEList<Task>(Task.class, this, TasksPackage.PERSON__IS_INVOLVED_IN_TASKS, TasksPackage.TASK__ASSIGNEE);
		}
		return isInvolvedInTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Project> getLeads() {
		if (leads == null) {
			leads = new EObjectWithInverseResolvingEList<Project>(Project.class, this, TasksPackage.PERSON__LEADS, TasksPackage.PROJECT__IS_LEAD_BY);
		}
		return leads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TasksPackage.PERSON__IS_INVOLVED_IN_TASKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsInvolvedInTasks()).basicAdd(otherEnd, msgs);
			case TasksPackage.PERSON__LEADS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLeads()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TasksPackage.PERSON__IS_INVOLVED_IN_TASKS:
				return ((InternalEList<?>)getIsInvolvedInTasks()).basicRemove(otherEnd, msgs);
			case TasksPackage.PERSON__LEADS:
				return ((InternalEList<?>)getLeads()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TasksPackage.PERSON__FIRST_NAME:
				return getFirstName();
			case TasksPackage.PERSON__LAST_NAME:
				return getLastName();
			case TasksPackage.PERSON__IS_INVOLVED_IN_TASKS:
				return getIsInvolvedInTasks();
			case TasksPackage.PERSON__LEADS:
				return getLeads();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TasksPackage.PERSON__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case TasksPackage.PERSON__LAST_NAME:
				setLastName((String)newValue);
				return;
			case TasksPackage.PERSON__IS_INVOLVED_IN_TASKS:
				getIsInvolvedInTasks().clear();
				getIsInvolvedInTasks().addAll((Collection<? extends Task>)newValue);
				return;
			case TasksPackage.PERSON__LEADS:
				getLeads().clear();
				getLeads().addAll((Collection<? extends Project>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TasksPackage.PERSON__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case TasksPackage.PERSON__LAST_NAME:
				setLastName(LAST_NAME_EDEFAULT);
				return;
			case TasksPackage.PERSON__IS_INVOLVED_IN_TASKS:
				getIsInvolvedInTasks().clear();
				return;
			case TasksPackage.PERSON__LEADS:
				getLeads().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TasksPackage.PERSON__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case TasksPackage.PERSON__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
			case TasksPackage.PERSON__IS_INVOLVED_IN_TASKS:
				return isInvolvedInTasks != null && !isInvolvedInTasks.isEmpty();
			case TasksPackage.PERSON__LEADS:
				return leads != null && !leads.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (firstName: ");
		result.append(firstName);
		result.append(", lastName: ");
		result.append(lastName);
		result.append(')');
		return result.toString();
	}

} //PersonImpl
