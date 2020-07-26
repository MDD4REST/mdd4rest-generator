/**
 */
package SecurityPIM;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>String Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see SecurityPIM.SecurityPIMMetamodelPackage#getStringOperator()
 * @model
 * @generated
 */
public enum StringOperator implements Enumerator {
	/**
	 * The '<em><b>CONTAINS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTAINS_VALUE
	 * @generated
	 * @ordered
	 */
	CONTAINS(0, "CONTAINS", "CONTAINS"),

	/**
	 * The '<em><b>MATHCES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MATHCES_VALUE
	 * @generated
	 * @ordered
	 */
	MATHCES(1, "MATHCES", "MATHCES"),

	/**
	 * The '<em><b>EQIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQIC_VALUE
	 * @generated
	 * @ordered
	 */
	EQIC(2, "EQIC", "EQIC"),

	/**
	 * The '<em><b>STARTS WITH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STARTS_WITH_VALUE
	 * @generated
	 * @ordered
	 */
	STARTS_WITH(3, "STARTS_WITH", "STARTS_WITH"),

	/**
	 * The '<em><b>ENDS WITH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENDS_WITH_VALUE
	 * @generated
	 * @ordered
	 */
	ENDS_WITH(4, "ENDS_WITH", "ENDS_WITH");

	/**
	 * The '<em><b>CONTAINS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTAINS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONTAINS_VALUE = 0;

	/**
	 * The '<em><b>MATHCES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MATHCES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MATHCES_VALUE = 1;

	/**
	 * The '<em><b>EQIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQIC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EQIC_VALUE = 2;

	/**
	 * The '<em><b>STARTS WITH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STARTS_WITH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STARTS_WITH_VALUE = 3;

	/**
	 * The '<em><b>ENDS WITH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENDS_WITH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ENDS_WITH_VALUE = 4;

	/**
	 * An array of all the '<em><b>String Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StringOperator[] VALUES_ARRAY =
		new StringOperator[] {
			CONTAINS,
			MATHCES,
			EQIC,
			STARTS_WITH,
			ENDS_WITH,
		};

	/**
	 * A public read-only list of all the '<em><b>String Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StringOperator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>String Operator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StringOperator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StringOperator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>String Operator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StringOperator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StringOperator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>String Operator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StringOperator get(int value) {
		switch (value) {
			case CONTAINS_VALUE: return CONTAINS;
			case MATHCES_VALUE: return MATHCES;
			case EQIC_VALUE: return EQIC;
			case STARTS_WITH_VALUE: return STARTS_WITH;
			case ENDS_WITH_VALUE: return ENDS_WITH;
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
	private StringOperator(int value, String name, String literal) {
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
	
} //StringOperator
