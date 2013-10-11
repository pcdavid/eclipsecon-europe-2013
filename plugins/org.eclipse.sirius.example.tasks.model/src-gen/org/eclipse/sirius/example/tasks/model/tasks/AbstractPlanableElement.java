/**
 */
package org.eclipse.sirius.example.tasks.model.tasks;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Planable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.sirius.example.tasks.model.tasks.AbstractPlanableElement#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link org.eclipse.sirius.example.tasks.model.tasks.AbstractPlanableElement#getEstimated <em>Estimated</em>}</li>
 *   <li>{@link org.eclipse.sirius.example.tasks.model.tasks.AbstractPlanableElement#getRemaining <em>Remaining</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.sirius.example.tasks.model.tasks.TasksPackage#getAbstractPlanableElement()
 * @model abstract="true"
 * @generated
 */
public interface AbstractPlanableElement extends AbstractNamedElement {
	/**
	 * Returns the value of the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Due Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Due Date</em>' attribute.
	 * @see #setDueDate(Date)
	 * @see org.eclipse.sirius.example.tasks.model.tasks.TasksPackage#getAbstractPlanableElement_DueDate()
	 * @model required="true"
	 * @generated
	 */
	Date getDueDate();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.example.tasks.model.tasks.AbstractPlanableElement#getDueDate <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Due Date</em>' attribute.
	 * @see #getDueDate()
	 * @generated
	 */
	void setDueDate(Date value);

	/**
	 * Returns the value of the '<em><b>Estimated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated</em>' attribute.
	 * @see #setEstimated(float)
	 * @see org.eclipse.sirius.example.tasks.model.tasks.TasksPackage#getAbstractPlanableElement_Estimated()
	 * @model
	 * @generated
	 */
	float getEstimated();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.example.tasks.model.tasks.AbstractPlanableElement#getEstimated <em>Estimated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated</em>' attribute.
	 * @see #getEstimated()
	 * @generated
	 */
	void setEstimated(float value);

	/**
	 * Returns the value of the '<em><b>Remaining</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remaining</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remaining</em>' attribute.
	 * @see #setRemaining(float)
	 * @see org.eclipse.sirius.example.tasks.model.tasks.TasksPackage#getAbstractPlanableElement_Remaining()
	 * @model default="0"
	 * @generated
	 */
	float getRemaining();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.example.tasks.model.tasks.AbstractPlanableElement#getRemaining <em>Remaining</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remaining</em>' attribute.
	 * @see #getRemaining()
	 * @generated
	 */
	void setRemaining(float value);

} // AbstractPlanableElement
