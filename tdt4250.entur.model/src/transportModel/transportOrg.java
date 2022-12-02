/**
 */
package transportModel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>transport Org</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link transportModel.transportOrg#getName <em>Name</em>}</li>
 *   <li>{@link transportModel.transportOrg#getHasOperator <em>Has Operator</em>}</li>
 * </ul>
 *
 * @see transportModel.TransportModelPackage#gettransportOrg()
 * @model
 * @generated
 */
public interface transportOrg extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see transportModel.TransportModelPackage#gettransportOrg_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link transportModel.transportOrg#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Has Operator</b></em>' containment reference list.
	 * The list contents are of type {@link transportModel.operator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Operator</em>' containment reference list.
	 * @see transportModel.TransportModelPackage#gettransportOrg_HasOperator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<operator> getHasOperator();

} // transportOrg
