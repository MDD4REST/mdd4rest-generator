/**
 */
package ActivityDiagramMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ActivityDiagramMetamodel.ActivityDiagram#getName <em>Name</em>}</li>
 *   <li>{@link ActivityDiagramMetamodel.ActivityDiagram#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link ActivityDiagramMetamodel.ActivityDiagram#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link ActivityDiagramMetamodel.ActivityDiagram#isIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link ActivityDiagramMetamodel.ActivityDiagram#isIsSingleExecution <em>Is Single Execution</em>}</li>
 *   <li>{@link ActivityDiagramMetamodel.ActivityDiagram#getActivityedge <em>Activityedge</em>}</li>
 *   <li>{@link ActivityDiagramMetamodel.ActivityDiagram#getActivitynode <em>Activitynode</em>}</li>
 *   <li>{@link ActivityDiagramMetamodel.ActivityDiagram#getVariable <em>Variable</em>}</li>
 *   <li>{@link ActivityDiagramMetamodel.ActivityDiagram#getActivitypartition <em>Activitypartition</em>}</li>
 * </ul>
 *
 * @see ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage#getActivityDiagram()
 * @model annotation="gmf.diagram"
 * @generated
 */
public interface ActivityDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage#getActivityDiagram_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ActivityDiagramMetamodel.ActivityDiagram#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Precondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precondition</em>' attribute.
	 * @see #setPrecondition(String)
	 * @see ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage#getActivityDiagram_Precondition()
	 * @model
	 * @generated
	 */
	String getPrecondition();

	/**
	 * Sets the value of the '{@link ActivityDiagramMetamodel.ActivityDiagram#getPrecondition <em>Precondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precondition</em>' attribute.
	 * @see #getPrecondition()
	 * @generated
	 */
	void setPrecondition(String value);

	/**
	 * Returns the value of the '<em><b>Postcondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postcondition</em>' attribute.
	 * @see #setPostcondition(String)
	 * @see ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage#getActivityDiagram_Postcondition()
	 * @model
	 * @generated
	 */
	String getPostcondition();

	/**
	 * Sets the value of the '{@link ActivityDiagramMetamodel.ActivityDiagram#getPostcondition <em>Postcondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postcondition</em>' attribute.
	 * @see #getPostcondition()
	 * @generated
	 */
	void setPostcondition(String value);

	/**
	 * Returns the value of the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Read Only</em>' attribute.
	 * @see #setIsReadOnly(boolean)
	 * @see ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage#getActivityDiagram_IsReadOnly()
	 * @model
	 * @generated
	 */
	boolean isIsReadOnly();

	/**
	 * Sets the value of the '{@link ActivityDiagramMetamodel.ActivityDiagram#isIsReadOnly <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Read Only</em>' attribute.
	 * @see #isIsReadOnly()
	 * @generated
	 */
	void setIsReadOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Single Execution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Single Execution</em>' attribute.
	 * @see #setIsSingleExecution(boolean)
	 * @see ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage#getActivityDiagram_IsSingleExecution()
	 * @model
	 * @generated
	 */
	boolean isIsSingleExecution();

	/**
	 * Sets the value of the '{@link ActivityDiagramMetamodel.ActivityDiagram#isIsSingleExecution <em>Is Single Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Single Execution</em>' attribute.
	 * @see #isIsSingleExecution()
	 * @generated
	 */
	void setIsSingleExecution(boolean value);

	/**
	 * Returns the value of the '<em><b>Activityedge</b></em>' containment reference list.
	 * The list contents are of type {@link ActivityDiagramMetamodel.ActivityEdge}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activityedge</em>' containment reference list.
	 * @see ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage#getActivityDiagram_Activityedge()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActivityEdge> getActivityedge();

	/**
	 * Returns the value of the '<em><b>Activitynode</b></em>' containment reference list.
	 * The list contents are of type {@link ActivityDiagramMetamodel.ActivityNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitynode</em>' containment reference list.
	 * @see ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage#getActivityDiagram_Activitynode()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActivityNode> getActivitynode();

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
	 * The list contents are of type {@link ActivityDiagramMetamodel.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference list.
	 * @see ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage#getActivityDiagram_Variable()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariable();

	/**
	 * Returns the value of the '<em><b>Activitypartition</b></em>' containment reference list.
	 * The list contents are of type {@link ActivityDiagramMetamodel.ActivityPartition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitypartition</em>' containment reference list.
	 * @see ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage#getActivityDiagram_Activitypartition()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActivityPartition> getActivitypartition();

} // ActivityDiagram
