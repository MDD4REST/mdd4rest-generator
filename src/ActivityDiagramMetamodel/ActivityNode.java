/**
 */
package ActivityDiagramMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ActivityDiagramMetamodel.ActivityNode#getIncomming <em>Incomming</em>}</li>
 *   <li>{@link ActivityDiagramMetamodel.ActivityNode#getOutcomming <em>Outcomming</em>}</li>
 *   <li>{@link ActivityDiagramMetamodel.ActivityNode#getActivitypartition <em>Activitypartition</em>}</li>
 * </ul>
 *
 * @see ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage#getActivityNode()
 * @model
 * @generated
 */
public interface ActivityNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Incomming</b></em>' reference list.
	 * The list contents are of type {@link ActivityDiagramMetamodel.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link ActivityDiagramMetamodel.ActivityEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incomming</em>' reference list.
	 * @see ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage#getActivityNode_Incomming()
	 * @see ActivityDiagramMetamodel.ActivityEdge#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<ActivityEdge> getIncomming();

	/**
	 * Returns the value of the '<em><b>Outcomming</b></em>' reference list.
	 * The list contents are of type {@link ActivityDiagramMetamodel.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link ActivityDiagramMetamodel.ActivityEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outcomming</em>' reference list.
	 * @see ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage#getActivityNode_Outcomming()
	 * @see ActivityDiagramMetamodel.ActivityEdge#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<ActivityEdge> getOutcomming();

	/**
	 * Returns the value of the '<em><b>Activitypartition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ActivityDiagramMetamodel.ActivityPartition#getActivitynode <em>Activitynode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitypartition</em>' container reference.
	 * @see #setActivitypartition(ActivityPartition)
	 * @see ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage#getActivityNode_Activitypartition()
	 * @see ActivityDiagramMetamodel.ActivityPartition#getActivitynode
	 * @model opposite="activitynode" transient="false"
	 * @generated
	 */
	ActivityPartition getActivitypartition();

	/**
	 * Sets the value of the '{@link ActivityDiagramMetamodel.ActivityNode#getActivitypartition <em>Activitypartition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activitypartition</em>' container reference.
	 * @see #getActivitypartition()
	 * @generated
	 */
	void setActivitypartition(ActivityPartition value);

} // ActivityNode
