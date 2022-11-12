/**
 */
package transportModel;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link transportModel.journeyPatterns#getHasStopPlace <em>Has Stop Place</em>}</li>
 *   <li>{@link transportModel.journeyPatterns#getId <em>Id</em>}</li>
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
	 * Returns the value of the '<em><b>Has Stop Place</b></em>' containment reference list.
	 * The list contents are of type {@link transportModel.stopPlace}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Stop Place</em>' containment reference list.
	 * @see transportModel.TransportModelPackage#getjourneyPatterns_HasStopPlace()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<stopPlace> getHasStopPlace();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see transportModel.TransportModelPackage#getjourneyPatterns_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link transportModel.journeyPatterns#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see transportModel.TransportModelPackage#getjourneyPatterns_Name()
	 * @model
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
	 * @model
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
