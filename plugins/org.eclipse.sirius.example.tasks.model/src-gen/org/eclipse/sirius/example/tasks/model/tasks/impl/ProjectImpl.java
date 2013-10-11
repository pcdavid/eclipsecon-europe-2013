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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.sirius.example.tasks.model.tasks.Person;
import org.eclipse.sirius.example.tasks.model.tasks.Project;
import org.eclipse.sirius.example.tasks.model.tasks.ProjectVersion;
import org.eclipse.sirius.example.tasks.model.tasks.TasksPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.sirius.example.tasks.model.tasks.impl.ProjectImpl#getIsLeadBy <em>Is Lead By</em>}</li>
 *   <li>{@link org.eclipse.sirius.example.tasks.model.tasks.impl.ProjectImpl#getVersions <em>Versions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProjectImpl extends AbstractNamedElementImpl implements Project {
	/**
	 * The cached value of the '{@link #getIsLeadBy() <em>Is Lead By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsLeadBy()
	 * @generated
	 * @ordered
	 */
	protected Person isLeadBy;

	/**
	 * The cached value of the '{@link #getVersions() <em>Versions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersions()
	 * @generated
	 * @ordered
	 */
	protected EList<ProjectVersion> versions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TasksPackage.Literals.PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getIsLeadBy() {
		if (isLeadBy != null && isLeadBy.eIsProxy()) {
			InternalEObject oldIsLeadBy = (InternalEObject)isLeadBy;
			isLeadBy = (Person)eResolveProxy(oldIsLeadBy);
			if (isLeadBy != oldIsLeadBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TasksPackage.PROJECT__IS_LEAD_BY, oldIsLeadBy, isLeadBy));
			}
		}
		return isLeadBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetIsLeadBy() {
		return isLeadBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsLeadBy(Person newIsLeadBy, NotificationChain msgs) {
		Person oldIsLeadBy = isLeadBy;
		isLeadBy = newIsLeadBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TasksPackage.PROJECT__IS_LEAD_BY, oldIsLeadBy, newIsLeadBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLeadBy(Person newIsLeadBy) {
		if (newIsLeadBy != isLeadBy) {
			NotificationChain msgs = null;
			if (isLeadBy != null)
				msgs = ((InternalEObject)isLeadBy).eInverseRemove(this, TasksPackage.PERSON__LEADS, Person.class, msgs);
			if (newIsLeadBy != null)
				msgs = ((InternalEObject)newIsLeadBy).eInverseAdd(this, TasksPackage.PERSON__LEADS, Person.class, msgs);
			msgs = basicSetIsLeadBy(newIsLeadBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasksPackage.PROJECT__IS_LEAD_BY, newIsLeadBy, newIsLeadBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProjectVersion> getVersions() {
		if (versions == null) {
			versions = new EObjectContainmentEList<ProjectVersion>(ProjectVersion.class, this, TasksPackage.PROJECT__VERSIONS);
		}
		return versions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TasksPackage.PROJECT__IS_LEAD_BY:
				if (isLeadBy != null)
					msgs = ((InternalEObject)isLeadBy).eInverseRemove(this, TasksPackage.PERSON__LEADS, Person.class, msgs);
				return basicSetIsLeadBy((Person)otherEnd, msgs);
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
			case TasksPackage.PROJECT__IS_LEAD_BY:
				return basicSetIsLeadBy(null, msgs);
			case TasksPackage.PROJECT__VERSIONS:
				return ((InternalEList<?>)getVersions()).basicRemove(otherEnd, msgs);
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
			case TasksPackage.PROJECT__IS_LEAD_BY:
				if (resolve) return getIsLeadBy();
				return basicGetIsLeadBy();
			case TasksPackage.PROJECT__VERSIONS:
				return getVersions();
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
			case TasksPackage.PROJECT__IS_LEAD_BY:
				setIsLeadBy((Person)newValue);
				return;
			case TasksPackage.PROJECT__VERSIONS:
				getVersions().clear();
				getVersions().addAll((Collection<? extends ProjectVersion>)newValue);
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
			case TasksPackage.PROJECT__IS_LEAD_BY:
				setIsLeadBy((Person)null);
				return;
			case TasksPackage.PROJECT__VERSIONS:
				getVersions().clear();
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
			case TasksPackage.PROJECT__IS_LEAD_BY:
				return isLeadBy != null;
			case TasksPackage.PROJECT__VERSIONS:
				return versions != null && !versions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProjectImpl
