/**
 */
package transportModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>specific Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link transportModel.specificLine#getHasRoute <em>Has Route</em>}</li>
 *   <li>{@link transportModel.specificLine#getHasJourneyPatterns <em>Has Journey Patterns</em>}</li>
 *   <li>{@link transportModel.specificLine#getId <em>Id</em>}</li>
 *   <li>{@link transportModel.specificLine#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see transportModel.TransportModelPackage#getspecificLine()
 * @model
 * @generated
 */
public interface specificLine extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Route</b></em>' containment reference list.
	 * The list contents are of type {@link transportModel.route}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Route</em>' containment reference list.
	 * @see transportModel.TransportModelPackage#getspecificLine_HasRoute()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<route> getHasRoute();

	/**
	 * Returns the value of the '<em><b>Has Journey Patterns</b></em>' containment reference list.
	 * The list contents are of type {@link transportModel.journeyPatterns}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Journey Patterns</em>' containment reference list.
	 * @see transportModel.TransportModelPackage#getspecificLine_HasJourneyPatterns()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<journeyPatterns> getHasJourneyPatterns();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see transportModel.TransportModelPackage#getspecificLine_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link transportModel.specificLine#getId <em>Id</em>}' attribute.
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
	 * @see transportModel.TransportModelPackage#getspecificLine_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link transportModel.specificLine#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // specificLine
