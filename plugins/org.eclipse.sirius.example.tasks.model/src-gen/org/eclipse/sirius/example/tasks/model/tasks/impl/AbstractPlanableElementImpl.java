/**
 */
package org.eclipse.sirius.example.tasks.model.tasks.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sirius.example.tasks.model.tasks.AbstractPlanableElement;
import org.eclipse.sirius.example.tasks.model.tasks.TasksPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Planable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.sirius.example.tasks.model.tasks.impl.AbstractPlanableElementImpl#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link org.eclipse.sirius.example.tasks.model.tasks.impl.AbstractPlanableElementImpl#getEstimated <em>Estimated</em>}</li>
 *   <li>{@link org.eclipse.sirius.example.tasks.model.tasks.impl.AbstractPlanableElementImpl#getRemaining <em>Remaining</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractPlanableElementImpl extends AbstractNamedElementImpl implements AbstractPlanableElement {
	/**
	 * The default value of the '{@link #getDueDate() <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DUE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDueDate() <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDate()
	 * @generated
	 * @ordered
	 */
	protected Date dueDate = DUE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstimated() <em>Estimated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimated()
	 * @generated
	 * @ordered
	 */
	protected static final float ESTIMATED_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getEstimated() <em>Estimated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimated()
	 * @generated
	 * @ordered
	 */
	protected float estimated = ESTIMATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemaining() <em>Remaining</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemaining()
	 * @generated
	 * @ordered
	 */
	protected static final float REMAINING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRemaining() <em>Remaining</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemaining()
	 * @generated
	 * @ordered
	 */
	protected float remaining = REMAINING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractPlanableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TasksPackage.Literals.ABSTRACT_PLANABLE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDueDate() {
		return dueDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDueDate(Date newDueDate) {
		Date oldDueDate = dueDate;
		dueDate = newDueDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasksPackage.ABSTRACT_PLANABLE_ELEMENT__DUE_DATE, oldDueDate, dueDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getEstimated() {
		return estimated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstimated(float newEstimated) {
		float oldEstimated = estimated;
		estimated = newEstimated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasksPackage.ABSTRACT_PLANABLE_ELEMENT__ESTIMATED, oldEstimated, estimated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRemaining() {
		return remaining;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemaining(float newRemaining) {
		float oldRemaining = remaining;
		remaining = newRemaining;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasksPackage.ABSTRACT_PLANABLE_ELEMENT__REMAINING, oldRemaining, remaining));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TasksPackage.ABSTRACT_PLANABLE_ELEMENT__DUE_DATE:
				return getDueDate();
			case TasksPackage.ABSTRACT_PLANABLE_ELEMENT__ESTIMATED:
				return getEstimated();
			case TasksPackage.ABSTRACT_PLANABLE_ELEMENT__REMAINING:
				return getRemaining();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TasksPackage.ABSTRACT_PLANABLE_ELEMENT__DUE_DATE:
				setDueDate((Date)newValue);
				return;
			case TasksPackage.ABSTRACT_PLANABLE_ELEMENT__ESTIMATED:
				setEstimated((Float)newValue);
				return;
			case TasksPackage.ABSTRACT_PLANABLE_ELEMENT__REMAINING:
				setRemaining((Float)newValue);
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
			case TasksPackage.ABSTRACT_PLANABLE_ELEMENT__DUE_DATE:
				setDueDate(DUE_DATE_EDEFAULT);
				return;
			case TasksPackage.ABSTRACT_PLANABLE_ELEMENT__ESTIMATED:
				setEstimated(ESTIMATED_EDEFAULT);
				return;
			case TasksPackage.ABSTRACT_PLANABLE_ELEMENT__REMAINING:
				setRemaining(REMAINING_EDEFAULT);
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
			case TasksPackage.ABSTRACT_PLANABLE_ELEMENT__DUE_DATE:
				return DUE_DATE_EDEFAULT == null ? dueDate != null : !DUE_DATE_EDEFAULT.equals(dueDate);
			case TasksPackage.ABSTRACT_PLANABLE_ELEMENT__ESTIMATED:
				return estimated != ESTIMATED_EDEFAULT;
			case TasksPackage.ABSTRACT_PLANABLE_ELEMENT__REMAINING:
				return remaining != REMAINING_EDEFAULT;
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
		result.append(" (dueDate: ");
		result.append(dueDate);
		result.append(", estimated: ");
		result.append(estimated);
		result.append(", remaining: ");
		result.append(remaining);
		result.append(')');
		return result.toString();
	}

} //AbstractPlanableElementImpl
