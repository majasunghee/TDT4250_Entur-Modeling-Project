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
import transportModel.stopPlace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>route</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link transportModel.impl.routeImpl#getStopPlaces <em>Stop Places</em>}</li>
 *   <li>{@link transportModel.impl.routeImpl#getJourneyPatterns <em>Journey Patterns</em>}</li>
 *   <li>{@link transportModel.impl.routeImpl#getId <em>Id</em>}</li>
 *   <li>{@link transportModel.impl.routeImpl#getName <em>Name</em>}</li>
 *   <li>{@link transportModel.impl.routeImpl#getLineID <em>Line ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class routeImpl extends MinimalEObjectImpl.Container implements route {
	/**
	 * The cached value of the '{@link #getStopPlaces() <em>Stop Places</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopPlaces()
	 * @generated
	 * @ordered
	 */
	protected EList<stopPlace> stopPlaces;

	/**
	 * The cached value of the '{@link #getJourneyPatterns() <em>Journey Patterns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJourneyPatterns()
	 * @generated
	 * @ordered
	 */
	protected EList<journeyPatterns> journeyPatterns;

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
	 * The default value of the '{@link #getLineID() <em>Line ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineID()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLineID() <em>Line ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineID()
	 * @generated
	 * @ordered
	 */
	protected String lineID = LINE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected routeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TransportModelPackage.Literals.ROUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<stopPlace> getStopPlaces() {
		if (stopPlaces == null) {
			stopPlaces = new EObjectContainmentEList<stopPlace>(stopPlace.class, this, TransportModelPackage.ROUTE__STOP_PLACES);
		}
		return stopPlaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<journeyPatterns> getJourneyPatterns() {
		if (journeyPatterns == null) {
			journeyPatterns = new EObjectContainmentEList<journeyPatterns>(journeyPatterns.class, this, TransportModelPackage.ROUTE__JOURNEY_PATTERNS);
		}
		return journeyPatterns;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TransportModelPackage.ROUTE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TransportModelPackage.ROUTE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLineID() {
		return lineID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineID(String newLineID) {
		String oldLineID = lineID;
		lineID = newLineID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransportModelPackage.ROUTE__LINE_ID, oldLineID, lineID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TransportModelPackage.ROUTE__STOP_PLACES:
				return ((InternalEList<?>)getStopPlaces()).basicRemove(otherEnd, msgs);
			case TransportModelPackage.ROUTE__JOURNEY_PATTERNS:
				return ((InternalEList<?>)getJourneyPatterns()).basicRemove(otherEnd, msgs);
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
			case TransportModelPackage.ROUTE__STOP_PLACES:
				return getStopPlaces();
			case TransportModelPackage.ROUTE__JOURNEY_PATTERNS:
				return getJourneyPatterns();
			case TransportModelPackage.ROUTE__ID:
				return getId();
			case TransportModelPackage.ROUTE__NAME:
				return getName();
			case TransportModelPackage.ROUTE__LINE_ID:
				return getLineID();
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
			case TransportModelPackage.ROUTE__STOP_PLACES:
				getStopPlaces().clear();
				getStopPlaces().addAll((Collection<? extends stopPlace>)newValue);
				return;
			case TransportModelPackage.ROUTE__JOURNEY_PATTERNS:
				getJourneyPatterns().clear();
				getJourneyPatterns().addAll((Collection<? extends journeyPatterns>)newValue);
				return;
			case TransportModelPackage.ROUTE__ID:
				setId((String)newValue);
				return;
			case TransportModelPackage.ROUTE__NAME:
				setName((String)newValue);
				return;
			case TransportModelPackage.ROUTE__LINE_ID:
				setLineID((String)newValue);
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
			case TransportModelPackage.ROUTE__STOP_PLACES:
				getStopPlaces().clear();
				return;
			case TransportModelPackage.ROUTE__JOURNEY_PATTERNS:
				getJourneyPatterns().clear();
				return;
			case TransportModelPackage.ROUTE__ID:
				setId(ID_EDEFAULT);
				return;
			case TransportModelPackage.ROUTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TransportModelPackage.ROUTE__LINE_ID:
				setLineID(LINE_ID_EDEFAULT);
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
			case TransportModelPackage.ROUTE__STOP_PLACES:
				return stopPlaces != null && !stopPlaces.isEmpty();
			case TransportModelPackage.ROUTE__JOURNEY_PATTERNS:
				return journeyPatterns != null && !journeyPatterns.isEmpty();
			case TransportModelPackage.ROUTE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case TransportModelPackage.ROUTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TransportModelPackage.ROUTE__LINE_ID:
				return LINE_ID_EDEFAULT == null ? lineID != null : !LINE_ID_EDEFAULT.equals(lineID);
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
		result.append(", lineID: ");
		result.append(lineID);
		result.append(')');
		return result.toString();
	}

} //routeImpl
