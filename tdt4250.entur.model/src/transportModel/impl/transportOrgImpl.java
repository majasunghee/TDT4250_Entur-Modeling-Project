/**
 */
package transportModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import transportModel.TransportModelPackage;
import transportModel.operator;
import transportModel.transportOrg;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>transport Org</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link transportModel.impl.transportOrgImpl#getName <em>Name</em>}</li>
 *   <li>{@link transportModel.impl.transportOrgImpl#getHasOperator <em>Has Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class transportOrgImpl extends MinimalEObjectImpl.Container implements transportOrg {
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
	 * The cached value of the '{@link #getHasOperator() <em>Has Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasOperator()
	 * @generated
	 * @ordered
	 */
	protected operator hasOperator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected transportOrgImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TransportModelPackage.Literals.TRANSPORT_ORG;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TransportModelPackage.TRANSPORT_ORG__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public operator getHasOperator() {
		return hasOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasOperator(operator newHasOperator, NotificationChain msgs) {
		operator oldHasOperator = hasOperator;
		hasOperator = newHasOperator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TransportModelPackage.TRANSPORT_ORG__HAS_OPERATOR, oldHasOperator, newHasOperator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasOperator(operator newHasOperator) {
		if (newHasOperator != hasOperator) {
			NotificationChain msgs = null;
			if (hasOperator != null)
				msgs = ((InternalEObject)hasOperator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TransportModelPackage.TRANSPORT_ORG__HAS_OPERATOR, null, msgs);
			if (newHasOperator != null)
				msgs = ((InternalEObject)newHasOperator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TransportModelPackage.TRANSPORT_ORG__HAS_OPERATOR, null, msgs);
			msgs = basicSetHasOperator(newHasOperator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransportModelPackage.TRANSPORT_ORG__HAS_OPERATOR, newHasOperator, newHasOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TransportModelPackage.TRANSPORT_ORG__HAS_OPERATOR:
				return basicSetHasOperator(null, msgs);
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
			case TransportModelPackage.TRANSPORT_ORG__NAME:
				return getName();
			case TransportModelPackage.TRANSPORT_ORG__HAS_OPERATOR:
				return getHasOperator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TransportModelPackage.TRANSPORT_ORG__NAME:
				setName((String)newValue);
				return;
			case TransportModelPackage.TRANSPORT_ORG__HAS_OPERATOR:
				setHasOperator((operator)newValue);
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
			case TransportModelPackage.TRANSPORT_ORG__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TransportModelPackage.TRANSPORT_ORG__HAS_OPERATOR:
				setHasOperator((operator)null);
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
			case TransportModelPackage.TRANSPORT_ORG__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TransportModelPackage.TRANSPORT_ORG__HAS_OPERATOR:
				return hasOperator != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //transportOrgImpl
