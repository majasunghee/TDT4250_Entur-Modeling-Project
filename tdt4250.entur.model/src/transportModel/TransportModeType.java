/**
 */
package transportModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Transport Mode Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see transportModel.TransportModelPackage#getTransportModeType()
 * @model
 * @generated
 */
public enum TransportModeType implements Enumerator {
	/**
	 * The '<em><b>Bus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUS_VALUE
	 * @generated
	 * @ordered
	 */
	BUS(0, "Bus", "Bus"),

	/**
	 * The '<em><b>Air</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AIR_VALUE
	 * @generated
	 * @ordered
	 */
	AIR(1, "Air", "Air"),

	/**
	 * The '<em><b>Water</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WATER_VALUE
	 * @generated
	 * @ordered
	 */
	WATER(2, "Water", "Water"),

	/**
	 * The '<em><b>Rail</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RAIL_VALUE
	 * @generated
	 * @ordered
	 */
	RAIL(3, "Rail", "Rail"),

	/**
	 * The '<em><b>Lift</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIFT_VALUE
	 * @generated
	 * @ordered
	 */
	LIFT(4, "Lift", "Lift");

	/**
	 * The '<em><b>Bus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUS
	 * @model name="Bus"
	 * @generated
	 * @ordered
	 */
	public static final int BUS_VALUE = 0;

	/**
	 * The '<em><b>Air</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AIR
	 * @model name="Air"
	 * @generated
	 * @ordered
	 */
	public static final int AIR_VALUE = 1;

	/**
	 * The '<em><b>Water</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WATER
	 * @model name="Water"
	 * @generated
	 * @ordered
	 */
	public static final int WATER_VALUE = 2;

	/**
	 * The '<em><b>Rail</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RAIL
	 * @model name="Rail"
	 * @generated
	 * @ordered
	 */
	public static final int RAIL_VALUE = 3;

	/**
	 * The '<em><b>Lift</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIFT
	 * @model name="Lift"
	 * @generated
	 * @ordered
	 */
	public static final int LIFT_VALUE = 4;

	/**
	 * An array of all the '<em><b>Transport Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TransportModeType[] VALUES_ARRAY =
		new TransportModeType[] {
			BUS,
			AIR,
			WATER,
			RAIL,
			LIFT,
		};

	/**
	 * A public read-only list of all the '<em><b>Transport Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TransportModeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Transport Mode Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TransportModeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransportModeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transport Mode Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TransportModeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransportModeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transport Mode Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TransportModeType get(int value) {
		switch (value) {
			case BUS_VALUE: return BUS;
			case AIR_VALUE: return AIR;
			case WATER_VALUE: return WATER;
			case RAIL_VALUE: return RAIL;
			case LIFT_VALUE: return LIFT;
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
	private TransportModeType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	
} //TransportModeType
