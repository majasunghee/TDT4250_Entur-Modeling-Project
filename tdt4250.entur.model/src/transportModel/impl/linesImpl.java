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

import transportModel.TransportModeType;
import transportModel.TransportModelPackage;
import transportModel.lines;
import transportModel.specificLine;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>lines</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link transportModel.impl.linesImpl#getHasSpecificLine <em>Has Specific Line</em>}</li>
 *   <li>{@link transportModel.impl.linesImpl#getId <em>Id</em>}</li>
 *   <li>{@link transportModel.impl.linesImpl#getName <em>Name</em>}</li>
 *   <li>{@link transportModel.impl.linesImpl#getTransportMode <em>Transport Mode</em>}</li>
 *   <li>{@link transportModel.impl.linesImpl#getBikesAllowed <em>Bikes Allowed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class linesImpl extends MinimalEObjectImpl.Container implements lines {
	/**
	 * The cached value of the '{@link #getHasSpecificLine() <em>Has Specific Line</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasSpecificLine()
	 * @generated
	 * @ordered
	 */
	protected EList<specificLine> hasSpecificLine;

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
	 * The default value of the '{@link #getTransportMode() <em>Transport Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportMode()
	 * @generated
	 * @ordered
	 */
	protected static final TransportModeType TRANSPORT_MODE_EDEFAULT = TransportModeType.BUS;

	/**
	 * The cached value of the '{@link #getTransportMode() <em>Transport Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportMode()
	 * @generated
	 * @ordered
	 */
	protected TransportModeType transportMode = TRANSPORT_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBikesAllowed() <em>Bikes Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBikesAllowed()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean BIKES_ALLOWED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBikesAllowed() <em>Bikes Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBikesAllowed()
	 * @generated
	 * @ordered
	 */
	protected Boolean bikesAllowed = BIKES_ALLOWED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected linesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TransportModelPackage.Literals.LINES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<specificLine> getHasSpecificLine() {
		if (hasSpecificLine == null) {
			hasSpecificLine = new EObjectContainmentEList<specificLine>(specificLine.class, this, TransportModelPackage.LINES__HAS_SPECIFIC_LINE);
		}
		return hasSpecificLine;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TransportModelPackage.LINES__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TransportModelPackage.LINES__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportModeType getTransportMode() {
		return transportMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransportMode(TransportModeType newTransportMode) {
		TransportModeType oldTransportMode = transportMode;
		transportMode = newTransportMode == null ? TRANSPORT_MODE_EDEFAULT : newTransportMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransportModelPackage.LINES__TRANSPORT_MODE, oldTransportMode, transportMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getBikesAllowed() {
		return bikesAllowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBikesAllowed(Boolean newBikesAllowed) {
		Boolean oldBikesAllowed = bikesAllowed;
		bikesAllowed = newBikesAllowed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransportModelPackage.LINES__BIKES_ALLOWED, oldBikesAllowed, bikesAllowed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TransportModelPackage.LINES__HAS_SPECIFIC_LINE:
				return ((InternalEList<?>)getHasSpecificLine()).basicRemove(otherEnd, msgs);
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
			case TransportModelPackage.LINES__HAS_SPECIFIC_LINE:
				return getHasSpecificLine();
			case TransportModelPackage.LINES__ID:
				return getId();
			case TransportModelPackage.LINES__NAME:
				return getName();
			case TransportModelPackage.LINES__TRANSPORT_MODE:
				return getTransportMode();
			case TransportModelPackage.LINES__BIKES_ALLOWED:
				return getBikesAllowed();
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
			case TransportModelPackage.LINES__HAS_SPECIFIC_LINE:
				getHasSpecificLine().clear();
				getHasSpecificLine().addAll((Collection<? extends specificLine>)newValue);
				return;
			case TransportModelPackage.LINES__ID:
				setId((String)newValue);
				return;
			case TransportModelPackage.LINES__NAME:
				setName((String)newValue);
				return;
			case TransportModelPackage.LINES__TRANSPORT_MODE:
				setTransportMode((TransportModeType)newValue);
				return;
			case TransportModelPackage.LINES__BIKES_ALLOWED:
				setBikesAllowed((Boolean)newValue);
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
			case TransportModelPackage.LINES__HAS_SPECIFIC_LINE:
				getHasSpecificLine().clear();
				return;
			case TransportModelPackage.LINES__ID:
				setId(ID_EDEFAULT);
				return;
			case TransportModelPackage.LINES__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TransportModelPackage.LINES__TRANSPORT_MODE:
				setTransportMode(TRANSPORT_MODE_EDEFAULT);
				return;
			case TransportModelPackage.LINES__BIKES_ALLOWED:
				setBikesAllowed(BIKES_ALLOWED_EDEFAULT);
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
			case TransportModelPackage.LINES__HAS_SPECIFIC_LINE:
				return hasSpecificLine != null && !hasSpecificLine.isEmpty();
			case TransportModelPackage.LINES__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case TransportModelPackage.LINES__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TransportModelPackage.LINES__TRANSPORT_MODE:
				return transportMode != TRANSPORT_MODE_EDEFAULT;
			case TransportModelPackage.LINES__BIKES_ALLOWED:
				return BIKES_ALLOWED_EDEFAULT == null ? bikesAllowed != null : !BIKES_ALLOWED_EDEFAULT.equals(bikesAllowed);
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
		result.append(", transportMode: ");
		result.append(transportMode);
		result.append(", bikesAllowed: ");
		result.append(bikesAllowed);
		result.append(')');
		return result.toString();
	}

	@Override
	public void setTransportMode(Integer integer) {
		// TODO Auto-generated method stub
		
	}

} //linesImpl
