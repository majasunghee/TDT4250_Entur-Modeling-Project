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
import transportModel.lines;
import transportModel.operator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link transportModel.impl.operatorImpl#getHasLines <em>Has Lines</em>}</li>
 *   <li>{@link transportModel.impl.operatorImpl#getId <em>Id</em>}</li>
 *   <li>{@link transportModel.impl.operatorImpl#getName <em>Name</em>}</li>
 *   <li>{@link transportModel.impl.operatorImpl#getPhone <em>Phone</em>}</li>
 *   <li>{@link transportModel.impl.operatorImpl#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class operatorImpl extends MinimalEObjectImpl.Container implements operator {
	/**
	 * The cached value of the '{@link #getHasLines() <em>Has Lines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasLines()
	 * @generated
	 * @ordered
	 */
	protected EList<lines> hasLines;

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
	 * The default value of the '{@link #getPhone() <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone()
	 * @generated
	 * @ordered
	 */
	protected static final String PHONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhone() <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone()
	 * @generated
	 * @ordered
	 */
	protected String phone = PHONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected operatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TransportModelPackage.Literals.OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<lines> getHasLines() {
		if (hasLines == null) {
			hasLines = new EObjectContainmentEList<lines>(lines.class, this, TransportModelPackage.OPERATOR__HAS_LINES);
		}
		return hasLines;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TransportModelPackage.OPERATOR__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TransportModelPackage.OPERATOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhone(String newPhone) {
		String oldPhone = phone;
		phone = newPhone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransportModelPackage.OPERATOR__PHONE, oldPhone, phone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransportModelPackage.OPERATOR__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TransportModelPackage.OPERATOR__HAS_LINES:
				return ((InternalEList<?>)getHasLines()).basicRemove(otherEnd, msgs);
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
			case TransportModelPackage.OPERATOR__HAS_LINES:
				return getHasLines();
			case TransportModelPackage.OPERATOR__ID:
				return getId();
			case TransportModelPackage.OPERATOR__NAME:
				return getName();
			case TransportModelPackage.OPERATOR__PHONE:
				return getPhone();
			case TransportModelPackage.OPERATOR__URL:
				return getUrl();
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
			case TransportModelPackage.OPERATOR__HAS_LINES:
				getHasLines().clear();
				getHasLines().addAll((Collection<? extends lines>)newValue);
				return;
			case TransportModelPackage.OPERATOR__ID:
				setId((String)newValue);
				return;
			case TransportModelPackage.OPERATOR__NAME:
				setName((String)newValue);
				return;
			case TransportModelPackage.OPERATOR__PHONE:
				setPhone((String)newValue);
				return;
			case TransportModelPackage.OPERATOR__URL:
				setUrl((String)newValue);
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
			case TransportModelPackage.OPERATOR__HAS_LINES:
				getHasLines().clear();
				return;
			case TransportModelPackage.OPERATOR__ID:
				setId(ID_EDEFAULT);
				return;
			case TransportModelPackage.OPERATOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TransportModelPackage.OPERATOR__PHONE:
				setPhone(PHONE_EDEFAULT);
				return;
			case TransportModelPackage.OPERATOR__URL:
				setUrl(URL_EDEFAULT);
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
			case TransportModelPackage.OPERATOR__HAS_LINES:
				return hasLines != null && !hasLines.isEmpty();
			case TransportModelPackage.OPERATOR__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case TransportModelPackage.OPERATOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TransportModelPackage.OPERATOR__PHONE:
				return PHONE_EDEFAULT == null ? phone != null : !PHONE_EDEFAULT.equals(phone);
			case TransportModelPackage.OPERATOR__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
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
		result.append(", phone: ");
		result.append(phone);
		result.append(", url: ");
		result.append(url);
		result.append(')');
		return result.toString();
	}

} //operatorImpl
