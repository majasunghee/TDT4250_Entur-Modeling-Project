/**
 */
package transportModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import transportModel.TransportModelPackage;
import transportModel.journeyPatterns;
import transportModel.route;
import transportModel.specificLine;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>specific Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link transportModel.impl.specificLineImpl#getHasRoute <em>Has Route</em>}</li>
 *   <li>{@link transportModel.impl.specificLineImpl#getHasJourneyPatterns <em>Has Journey Patterns</em>}</li>
 *   <li>{@link transportModel.impl.specificLineImpl#getId <em>Id</em>}</li>
 *   <li>{@link transportModel.impl.specificLineImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class specificLineImpl extends MinimalEObjectImpl.Container implements specificLine {
	/**
	 * The cached value of the '{@link #getHasRoute() <em>Has Route</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasRoute()
	 * @generated
	 * @ordered
	 */
	protected EList<route> hasRoute;

	/**
	 * The cached value of the '{@link #getHasJourneyPatterns() <em>Has Journey Patterns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasJourneyPatterns()
	 * @generated
	 * @ordered
	 */
	protected EList<journeyPatterns> hasJourneyPatterns;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected specificLineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TransportModelPackage.Literals.SPECIFIC_LINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<route> getHasRoute() {
		if (hasRoute == null) {
			hasRoute = new EObjectContainmentEList<route>(route.class, this, TransportModelPackage.SPECIFIC_LINE__HAS_ROUTE);
		}
		return hasRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<journeyPatterns> getHasJourneyPatterns() {
		if (hasJourneyPatterns == null) {
			hasJourneyPatterns = new EObjectContainmentEList<journeyPatterns>(journeyPatterns.class, this, TransportModelPackage.SPECIFIC_LINE__HAS_JOURNEY_PATTERNS);
		}
		return hasJourneyPatterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransportModelPackage.SPECIFIC_LINE__ID, oldId, id));
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransportModelPackage.SPECIFIC_LINE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TransportModelPackage.SPECIFIC_LINE__HAS_ROUTE:
				return ((InternalEList<?>)getHasRoute()).basicRemove(otherEnd, msgs);
			case TransportModelPackage.SPECIFIC_LINE__HAS_JOURNEY_PATTERNS:
				return ((InternalEList<?>)getHasJourneyPatterns()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TransportModelPackage.SPECIFIC_LINE__HAS_ROUTE:
				return getHasRoute();
			case TransportModelPackage.SPECIFIC_LINE__HAS_JOURNEY_PATTERNS:
				return getHasJourneyPatterns();
			case TransportModelPackage.SPECIFIC_LINE__ID:
				return getId();
			case TransportModelPackage.SPECIFIC_LINE__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TransportModelPackage.SPECIFIC_LINE__HAS_ROUTE:
				getHasRoute().clear();
				getHasRoute().addAll((Collection<? extends route>)newValue);
				return;
			case TransportModelPackage.SPECIFIC_LINE__HAS_JOURNEY_PATTERNS:
				getHasJourneyPatterns().clear();
				getHasJourneyPatterns().addAll((Collection<? extends journeyPatterns>)newValue);
				return;
			case TransportModelPackage.SPECIFIC_LINE__ID:
				setId((String)newValue);
				return;
			case TransportModelPackage.SPECIFIC_LINE__NAME:
				setName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TransportModelPackage.SPECIFIC_LINE__HAS_ROUTE:
				getHasRoute().clear();
				return;
			case TransportModelPackage.SPECIFIC_LINE__HAS_JOURNEY_PATTERNS:
				getHasJourneyPatterns().clear();
				return;
			case TransportModelPackage.SPECIFIC_LINE__ID:
				setId(ID_EDEFAULT);
				return;
			case TransportModelPackage.SPECIFIC_LINE__NAME:
				setName(NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TransportModelPackage.SPECIFIC_LINE__HAS_ROUTE:
				return hasRoute != null && !hasRoute.isEmpty();
			case TransportModelPackage.SPECIFIC_LINE__HAS_JOURNEY_PATTERNS:
				return hasJourneyPatterns != null && !hasJourneyPatterns.isEmpty();
			case TransportModelPackage.SPECIFIC_LINE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case TransportModelPackage.SPECIFIC_LINE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //specificLineImpl
