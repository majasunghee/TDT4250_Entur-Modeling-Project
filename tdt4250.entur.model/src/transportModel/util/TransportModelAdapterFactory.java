/**
 */
package transportModel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import transportModel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see transportModel.TransportModelPackage
 * @generated
 */
public class TransportModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TransportModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TransportModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransportModelSwitch<Adapter> modelSwitch =
		new TransportModelSwitch<Adapter>() {
			@Override
			public Adapter casetransportOrg(transportOrg object) {
				return createtransportOrgAdapter();
			}
			@Override
			public Adapter caseoperator(operator object) {
				return createoperatorAdapter();
			}
			@Override
			public Adapter caselines(lines object) {
				return createlinesAdapter();
			}
			@Override
			public Adapter caseroute(route object) {
				return createrouteAdapter();
			}
			@Override
			public Adapter casejourneyPatterns(journeyPatterns object) {
				return createjourneyPatternsAdapter();
			}
			@Override
			public Adapter casestopPlace(stopPlace object) {
				return createstopPlaceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link transportModel.transportOrg <em>transport Org</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see transportModel.transportOrg
	 * @generated
	 */
	public Adapter createtransportOrgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link transportModel.operator <em>operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see transportModel.operator
	 * @generated
	 */
	public Adapter createoperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link transportModel.lines <em>lines</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see transportModel.lines
	 * @generated
	 */
	public Adapter createlinesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link transportModel.route <em>route</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see transportModel.route
	 * @generated
	 */
	public Adapter createrouteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link transportModel.journeyPatterns <em>journey Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see transportModel.journeyPatterns
	 * @generated
	 */
	public Adapter createjourneyPatternsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link transportModel.stopPlace <em>stop Place</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see transportModel.stopPlace
	 * @generated
	 */
	public Adapter createstopPlaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TransportModelAdapterFactory
