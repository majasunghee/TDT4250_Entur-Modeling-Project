/**
 */
package transportModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>route</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link transportModel.route#getStopPlaces <em>Stop Places</em>}</li>
 *   <li>{@link transportModel.route#getJourneyPatterns <em>Journey Patterns</em>}</li>
 *   <li>{@link transportModel.route#getId <em>Id</em>}</li>
 *   <li>{@link transportModel.route#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see transportModel.TransportModelPackage#getroute()
 * @model
 * @generated
 */
public interface route extends EObject {
	/**
	 * Returns the value of the '<em><b>Stop Places</b></em>' containment reference list.
	 * The list contents are of type {@link transportModel.stopPlace}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Places</em>' containment reference list.
	 * @see transportModel.TransportModelPackage#getroute_StopPlaces()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<stopPlace> getStopPlaces();

	/**
	 * Returns the value of the '<em><b>Journey Patterns</b></em>' containment reference list.
	 * The list contents are of type {@link transportModel.journeyPatterns}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Journey Patterns</em>' containment reference list.
	 * @see transportModel.TransportModelPackage#getroute_JourneyPatterns()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<journeyPatterns> getJourneyPatterns();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see transportModel.TransportModelPackage#getroute_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link transportModel.route#getId <em>Id</em>}' attribute.
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
	 * @see transportModel.TransportModelPackage#getroute_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link transportModel.route#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // route
