/**
 */
package ServicePIM;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Deployment Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ServicePIM.ServicePIMPackage#getDeploymentType()
 * @model
 * @generated
 */
public enum DeploymentType implements Enumerator {
	/**
	 * The '<em><b>DOCKER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCKER_VALUE
	 * @generated
	 * @ordered
	 */
	DOCKER(0, "DOCKER", "DOCKER"),

	/**
	 * The '<em><b>KUBERNETES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KUBERNETES_VALUE
	 * @generated
	 * @ordered
	 */
	KUBERNETES(1, "KUBERNETES", "KUBERNETES"),

	/**
	 * The '<em><b>OPENSHIFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPENSHIFT_VALUE
	 * @generated
	 * @ordered
	 */
	OPENSHIFT(2, "OPENSHIFT", "OPENSHIFT");

	/**
	 * The '<em><b>DOCKER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCKER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOCKER_VALUE = 0;

	/**
	 * The '<em><b>KUBERNETES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KUBERNETES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KUBERNETES_VALUE = 1;

	/**
	 * The '<em><b>OPENSHIFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPENSHIFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPENSHIFT_VALUE = 2;

	/**
	 * An array of all the '<em><b>Deployment Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DeploymentType[] VALUES_ARRAY =
		new DeploymentType[] {
			DOCKER,
			KUBERNETES,
			OPENSHIFT,
		};

	/**
	 * A public read-only list of all the '<em><b>Deployment Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DeploymentType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Deployment Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeploymentType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeploymentType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Deployment Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeploymentType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeploymentType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Deployment Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeploymentType get(int value) {
		switch (value) {
			case DOCKER_VALUE: return DOCKER;
			case KUBERNETES_VALUE: return KUBERNETES;
			case OPENSHIFT_VALUE: return OPENSHIFT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DeploymentType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //DeploymentType
