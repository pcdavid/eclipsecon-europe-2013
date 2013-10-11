/**
 */
package org.eclipse.sirius.example.tasks.model.tasks;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.sirius.example.tasks.model.tasks.Project#getIsLeadBy <em>Is Lead By</em>}</li>
 *   <li>{@link org.eclipse.sirius.example.tasks.model.tasks.Project#getVersions <em>Versions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.sirius.example.tasks.model.tasks.TasksPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends AbstractNamedElement {
	/**
	 * Returns the value of the '<em><b>Is Lead By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.example.tasks.model.tasks.Person#getLeads <em>Leads</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Lead By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Lead By</em>' reference.
	 * @see #setIsLeadBy(Person)
	 * @see org.eclipse.sirius.example.tasks.model.tasks.TasksPackage#getProject_IsLeadBy()
	 * @see org.eclipse.sirius.example.tasks.model.tasks.Person#getLeads
	 * @model opposite="leads"
	 * @generated
	 */
	Person getIsLeadBy();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.example.tasks.model.tasks.Project#getIsLeadBy <em>Is Lead By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Lead By</em>' reference.
	 * @see #getIsLeadBy()
	 * @generated
	 */
	void setIsLeadBy(Person value);

	/**
	 * Returns the value of the '<em><b>Versions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.example.tasks.model.tasks.ProjectVersion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Versions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Versions</em>' containment reference list.
	 * @see org.eclipse.sirius.example.tasks.model.tasks.TasksPackage#getProject_Versions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProjectVersion> getVersions();

} // Project
