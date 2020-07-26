/**
 */
package QueryPIM;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Filter Operation Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see QueryPIM.QueryPIMMetamodelPackage#getFilterOperationType()
 * @model
 * @generated
 */
public enum FilterOperationType implements Enumerator {
	/**
	 * The '<em><b>EQ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQ_VALUE
	 * @generated
	 * @ordered
	 */
	EQ(0, "EQ", "EQ"),

	/**
	 * The '<em><b>LTE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LTE_VALUE
	 * @generated
	 * @ordered
	 */
	LTE(1, "LTE", "LTE"),

	/**
	 * The '<em><b>GTE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GTE_VALUE
	 * @generated
	 * @ordered
	 */
	GTE(2, "GTE", "GTE"),

	/**
	 * The '<em><b>EXISTS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXISTS_VALUE
	 * @generated
	 * @ordered
	 */
	EXISTS(3, "EXISTS", "EXISTS"),

	/**
	 * The '<em><b>REGEX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGEX_VALUE
	 * @generated
	 * @ordered
	 */
	REGEX(4, "REGEX", "REGEX"),

	/**
	 * The '<em><b>BEFORE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEFORE_VALUE
	 * @generated
	 * @ordered
	 */
	BEFORE(5, "BEFORE", "BEFORE"),

	/**
	 * The '<em><b>AFTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFTER_VALUE
	 * @generated
	 * @ordered
	 */
	AFTER(6, "AFTER", "AFTER");

	/**
	 * The '<em><b>EQ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EQ_VALUE = 0;

	/**
	 * The '<em><b>LTE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LTE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LTE_VALUE = 1;

	/**
	 * The '<em><b>GTE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GTE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GTE_VALUE = 2;

	/**
	 * The '<em><b>EXISTS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXISTS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXISTS_VALUE = 3;

	/**
	 * The '<em><b>REGEX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGEX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REGEX_VALUE = 4;

	/**
	 * The '<em><b>BEFORE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEFORE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BEFORE_VALUE = 5;

	/**
	 * The '<em><b>AFTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFTER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AFTER_VALUE = 6;

	/**
	 * An array of all the '<em><b>Filter Operation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FilterOperationType[] VALUES_ARRAY =
		new FilterOperationType[] {
			EQ,
			LTE,
			GTE,
			EXISTS,
			REGEX,
			BEFORE,
			AFTER,
		};

	/**
	 * A public read-only list of all the '<em><b>Filter Operation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FilterOperationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Filter Operation Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FilterOperationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FilterOperationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Filter Operation Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FilterOperationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FilterOperationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Filter Operation Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FilterOperationType get(int value) {
		switch (value) {
			case EQ_VALUE: return EQ;
			case LTE_VALUE: return LTE;
			case GTE_VALUE: return GTE;
			case EXISTS_VALUE: return EXISTS;
			case REGEX_VALUE: return REGEX;
			case BEFORE_VALUE: return BEFORE;
			case AFTER_VALUE: return AFTER;
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
	private FilterOperationType(int value, String name, String literal) {
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
	
} //FilterOperationType
