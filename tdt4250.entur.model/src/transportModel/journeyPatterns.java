/**
 */
package transportModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>journey Patterns</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link transportModel.journeyPatterns#getName <em>Name</em>}</li>
 *   <li>{@link transportModel.journeyPatterns#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see transportModel.TransportModelPackage#getjourneyPatterns()
 * @model
 * @generated
 */
public interface journeyPatterns extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see transportModel.TransportModelPackage#getjourneyPatterns_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link transportModel.journeyPatterns#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link transportModel.DirectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see transportModel.DirectionType
	 * @see #setDirection(DirectionType)
	 * @see transportModel.TransportModelPackage#getjourneyPatterns_Direction()
	 * @model required="true"
	 * @generated
	 */
	DirectionType getDirection();

	/**
	 * Sets the value of the '{@link transportModel.journeyPatterns#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see transportModel.DirectionType
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(DirectionType value);

} // journeyPatterns
