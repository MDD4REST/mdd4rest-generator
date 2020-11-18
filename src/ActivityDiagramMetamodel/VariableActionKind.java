/**
 */
package ActivityDiagramMetamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Variable Action Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage#getVariableActionKind()
 * @model
 * @generated
 */
public enum VariableActionKind implements Enumerator {
	/**
	 * The '<em><b>Clear Variable Action</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLEAR_VARIABLE_ACTION_VALUE
	 * @generated
	 * @ordered
	 */
	CLEAR_VARIABLE_ACTION(0, "clearVariableAction", "clearVariableAction"),

	/**
	 * The '<em><b>Write Variable Action</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRITE_VARIABLE_ACTION_VALUE
	 * @generated
	 * @ordered
	 */
	WRITE_VARIABLE_ACTION(1, "writeVariableAction", "writeVariableAction"),

	/**
	 * The '<em><b>Read Variable Action</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_VARIABLE_ACTION_VALUE
	 * @generated
	 * @ordered
	 */
	READ_VARIABLE_ACTION(2, "readVariableAction", "readVariableAction"),

	/**
	 * The '<em><b>Mathematical Variable Action</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MATHEMATICAL_VARIABLE_ACTION_VALUE
	 * @generated
	 * @ordered
	 */
	MATHEMATICAL_VARIABLE_ACTION(3, "mathematicalVariableAction", "mathematicalVariableAction");

	/**
	 * The '<em><b>Clear Variable Action</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLEAR_VARIABLE_ACTION
	 * @model name="clearVariableAction"
	 * @generated
	 * @ordered
	 */
	public static final int CLEAR_VARIABLE_ACTION_VALUE = 0;

	/**
	 * The '<em><b>Write Variable Action</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRITE_VARIABLE_ACTION
	 * @model name="writeVariableAction"
	 * @generated
	 * @ordered
	 */
	public static final int WRITE_VARIABLE_ACTION_VALUE = 1;

	/**
	 * The '<em><b>Read Variable Action</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_VARIABLE_ACTION
	 * @model name="readVariableAction"
	 * @generated
	 * @ordered
	 */
	public static final int READ_VARIABLE_ACTION_VALUE = 2;

	/**
	 * The '<em><b>Mathematical Variable Action</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MATHEMATICAL_VARIABLE_ACTION
	 * @model name="mathematicalVariableAction"
	 * @generated
	 * @ordered
	 */
	public static final int MATHEMATICAL_VARIABLE_ACTION_VALUE = 3;

	/**
	 * An array of all the '<em><b>Variable Action Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final VariableActionKind[] VALUES_ARRAY =
		new VariableActionKind[] {
			CLEAR_VARIABLE_ACTION,
			WRITE_VARIABLE_ACTION,
			READ_VARIABLE_ACTION,
			MATHEMATICAL_VARIABLE_ACTION,
		};

	/**
	 * A public read-only list of all the '<em><b>Variable Action Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<VariableActionKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Variable Action Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VariableActionKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VariableActionKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Variable Action Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VariableActionKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VariableActionKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Variable Action Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VariableActionKind get(int value) {
		switch (value) {
			case CLEAR_VARIABLE_ACTION_VALUE: return CLEAR_VARIABLE_ACTION;
			case WRITE_VARIABLE_ACTION_VALUE: return WRITE_VARIABLE_ACTION;
			case READ_VARIABLE_ACTION_VALUE: return READ_VARIABLE_ACTION;
			case MATHEMATICAL_VARIABLE_ACTION_VALUE: return MATHEMATICAL_VARIABLE_ACTION;
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
	private VariableActionKind(int value, String name, String literal) {
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
	
} //VariableActionKind
