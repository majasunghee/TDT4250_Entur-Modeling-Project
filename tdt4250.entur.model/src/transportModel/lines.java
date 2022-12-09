/**
 */
package transportModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>lines</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link transportModel.lines#getRoutes <em>Routes</em>}</li>
 *   <li>{@link transportModel.lines#getId <em>Id</em>}</li>
 *   <li>{@link transportModel.lines#getName <em>Name</em>}</li>
 *   <li>{@link transportModel.lines#getTransportMode <em>Transport Mode</em>}</li>
 *   <li>{@link transportModel.lines#getBikesAllowed <em>Bikes Allowed</em>}</li>
 * </ul>
 *
 * @see transportModel.TransportModelPackage#getlines()
 * @model
 * @generated
 */
public interface lines extends EObject {
	/**
	 * Returns the value of the '<em><b>Routes</b></em>' containment reference list.
	 * The list contents are of type {@link transportModel.route}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routes</em>' containment reference list.
	 * @see transportModel.TransportModelPackage#getlines_Routes()
	 * @model containment="true"
	 * @generated
	 */
	EList<route> getRoutes();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see transportModel.TransportModelPackage#getlines_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link transportModel.lines#getId <em>Id</em>}' attribute.
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
	 * @see transportModel.TransportModelPackage#getlines_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link transportModel.lines#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Transport Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link transportModel.TransportModeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport Mode</em>' attribute.
	 * @see transportModel.TransportModeType
	 * @see #setTransportMode(TransportModeType)
	 * @see transportModel.TransportModelPackage#getlines_TransportMode()
	 * @model dataType="transportModel.TransportModeType" required="true"
	 * @generated
	 */
	TransportModeType getTransportMode();

	/**
	 * Sets the value of the '{@link transportModel.lines#getTransportMode <em>Transport Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport Mode</em>' attribute.
	 * @see transportModel.TransportModeType
	 * @see #getTransportMode()
	 * @generated
	 */
	void setTransportMode(TransportModeType value);

	/**
	 * Returns the value of the '<em><b>Bikes Allowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bikes Allowed</em>' attribute.
	 * @see #setBikesAllowed(Boolean)
	 * @see transportModel.TransportModelPackage#getlines_BikesAllowed()
	 * @model required="true"
	 * @generated
	 */
	Boolean getBikesAllowed();

	/**
	 * Sets the value of the '{@link transportModel.lines#getBikesAllowed <em>Bikes Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bikes Allowed</em>' attribute.
	 * @see #getBikesAllowed()
	 * @generated
	 */
	void setBikesAllowed(Boolean value);

} // lines
