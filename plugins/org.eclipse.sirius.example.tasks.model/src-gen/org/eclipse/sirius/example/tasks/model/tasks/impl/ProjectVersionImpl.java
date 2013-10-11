/**
 */
package org.eclipse.sirius.example.tasks.model.tasks.impl;

import java.util.Collection;

import java.util.Date;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.sirius.example.tasks.model.tasks.ProjectVersion;
import org.eclipse.sirius.example.tasks.model.tasks.Task;
import org.eclipse.sirius.example.tasks.model.tasks.TasksPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.sirius.example.tasks.model.tasks.impl.ProjectVersionImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link org.eclipse.sirius.example.tasks.model.tasks.impl.ProjectVersionImpl#getReleased <em>Released</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProjectVersionImpl extends AbstractPlanableElementImpl implements ProjectVersion {
	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> tasks;

	/**
	 * The default value of the '{@link #getReleased() <em>Released</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleased()
	 * @generated
	 * @ordered
	 */
	protected static final Date RELEASED_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getReleased() <em>Released</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleased()
	 * @generated
	 * @ordered
	 */
	protected Date released = RELEASED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectVersionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TasksPackage.Literals.PROJECT_VERSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTasks() {
		if (tasks == null) {
			tasks = new EObjectContainmentEList<Task>(Task.class, this, TasksPackage.PROJECT_VERSION__TASKS);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getReleased() {
		return released;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReleased(Date newReleased) {
		Date oldReleased = released;
		released = newReleased;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasksPackage.PROJECT_VERSION__RELEASED, oldReleased, released));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TasksPackage.PROJECT_VERSION__TASKS:
				return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
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
			case TasksPackage.PROJECT_VERSION__TASKS:
				return getTasks();
			case TasksPackage.PROJECT_VERSION__RELEASED:
				return getReleased();
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
			case TasksPackage.PROJECT_VERSION__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends Task>)newValue);
				return;
			case TasksPackage.PROJECT_VERSION__RELEASED:
				setReleased((Date)newValue);
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
			case TasksPackage.PROJECT_VERSION__TASKS:
				getTasks().clear();
				return;
			case TasksPackage.PROJECT_VERSION__RELEASED:
				setReleased(RELEASED_EDEFAULT);
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
			case TasksPackage.PROJECT_VERSION__TASKS:
				return tasks != null && !tasks.isEmpty();
			case TasksPackage.PROJECT_VERSION__RELEASED:
				return RELEASED_EDEFAULT == null ? released != null : !RELEASED_EDEFAULT.equals(released);
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
		result.append(" (released: ");
		result.append(released);
		result.append(')');
		return result.toString();
	}

} //ProjectVersionImpl
