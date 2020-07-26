/**
 */
package ServicePIM;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Application Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ServicePIM.ServicePIMPackage#getApplicationType()
 * @model
 * @generated
 */
public enum ApplicationType implements Enumerator {
	/**
	 * The '<em><b>MICROSERVICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MICROSERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	MICROSERVICE(0, "MICROSERVICE", "MICROSERVICE"),

	/**
	 * The '<em><b>GATEWAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GATEWAY_VALUE
	 * @generated
	 * @ordered
	 */
	GATEWAY(1, "GATEWAY", "GATEWAY"),

	/**
	 * The '<em><b>MONOLITH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONOLITH_VALUE
	 * @generated
	 * @ordered
	 */
	MONOLITH(2, "MONOLITH", "MONOLITH");

	/**
	 * The '<em><b>MICROSERVICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MICROSERVICE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MICROSERVICE_VALUE = 0;

	/**
	 * The '<em><b>GATEWAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GATEWAY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GATEWAY_VALUE = 1;

	/**
	 * The '<em><b>MONOLITH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONOLITH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MONOLITH_VALUE = 2;

	/**
	 * An array of all the '<em><b>Application Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ApplicationType[] VALUES_ARRAY =
		new ApplicationType[] {
			MICROSERVICE,
			GATEWAY,
			MONOLITH,
		};

	/**
	 * A public read-only list of all the '<em><b>Application Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ApplicationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Application Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ApplicationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ApplicationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Application Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ApplicationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ApplicationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Application Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ApplicationType get(int value) {
		switch (value) {
			case MICROSERVICE_VALUE: return MICROSERVICE;
			case GATEWAY_VALUE: return GATEWAY;
			case MONOLITH_VALUE: return MONOLITH;
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
	private ApplicationType(int value, String name, String literal) {
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
	
} //ApplicationType
