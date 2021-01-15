/**
 */
package StaticPIM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subscribe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link StaticPIM.Subscribe#getEventBus <em>Event Bus</em>}</li>
 *   <li>{@link StaticPIM.Subscribe#getTopic <em>Topic</em>}</li>
 * </ul>
 *
 * @see StaticPIM.StaticPIMPackage#getSubscribe()
 * @model
 * @generated
 */
public interface Subscribe extends EObject {
	/**
	 * Returns the value of the '<em><b>Event Bus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Bus</em>' attribute.
	 * @see #setEventBus(String)
	 * @see StaticPIM.StaticPIMPackage#getSubscribe_EventBus()
	 * @model unique="false"
	 * @generated
	 */
	String getEventBus();

	/**
	 * Sets the value of the '{@link StaticPIM.Subscribe#getEventBus <em>Event Bus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Bus</em>' attribute.
	 * @see #getEventBus()
	 * @generated
	 */
	void setEventBus(String value);

	/**
	 * Returns the value of the '<em><b>Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic</em>' attribute.
	 * @see #setTopic(String)
	 * @see StaticPIM.StaticPIMPackage#getSubscribe_Topic()
	 * @model unique="false"
	 * @generated
	 */
	String getTopic();

	/**
	 * Sets the value of the '{@link StaticPIM.Subscribe#getTopic <em>Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic</em>' attribute.
	 * @see #getTopic()
	 * @generated
	 */
	void setTopic(String value);

} // Subscribe
