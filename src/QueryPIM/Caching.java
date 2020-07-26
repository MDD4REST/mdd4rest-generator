/**
 */
package QueryPIM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Caching</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QueryPIM.Caching#getCachingType <em>Caching Type</em>}</li>
 *   <li>{@link QueryPIM.Caching#getExpiration <em>Expiration</em>}</li>
 * </ul>
 *
 * @see QueryPIM.QueryPIMMetamodelPackage#getCaching()
 * @model
 * @generated
 */
public interface Caching extends EObject {
	/**
	 * Returns the value of the '<em><b>Caching Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caching Type</em>' attribute.
	 * @see #setCachingType(String)
	 * @see QueryPIM.QueryPIMMetamodelPackage#getCaching_CachingType()
	 * @model
	 * @generated
	 */
	String getCachingType();

	/**
	 * Sets the value of the '{@link QueryPIM.Caching#getCachingType <em>Caching Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caching Type</em>' attribute.
	 * @see #getCachingType()
	 * @generated
	 */
	void setCachingType(String value);

	/**
	 * Returns the value of the '<em><b>Expiration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiration</em>' attribute.
	 * @see #setExpiration(int)
	 * @see QueryPIM.QueryPIMMetamodelPackage#getCaching_Expiration()
	 * @model
	 * @generated
	 */
	int getExpiration();

	/**
	 * Sets the value of the '{@link QueryPIM.Caching#getExpiration <em>Expiration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiration</em>' attribute.
	 * @see #getExpiration()
	 * @generated
	 */
	void setExpiration(int value);

} // Caching
