/**
 */
package transportModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see transportModel.TransportModelPackage
 * @generated
 */
public interface TransportModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TransportModelFactory eINSTANCE = transportModel.impl.TransportModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>transport Org</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>transport Org</em>'.
	 * @generated
	 */
	transportOrg createtransportOrg();

	/**
	 * Returns a new object of class '<em>operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>operator</em>'.
	 * @generated
	 */
	operator createoperator();

	/**
	 * Returns a new object of class '<em>lines</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>lines</em>'.
	 * @generated
	 */
	lines createlines();

	/**
	 * Returns a new object of class '<em>route</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>route</em>'.
	 * @generated
	 */
	route createroute();

	/**
	 * Returns a new object of class '<em>journey Patterns</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>journey Patterns</em>'.
	 * @generated
	 */
	journeyPatterns createjourneyPatterns();

	/**
	 * Returns a new object of class '<em>stop Place</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>stop Place</em>'.
	 * @generated
	 */
	stopPlace createstopPlace();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TransportModelPackage getTransportModelPackage();

} //TransportModelFactory
