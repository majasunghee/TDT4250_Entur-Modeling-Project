/**
 */
package transportModel.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import transportModel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see transportModel.TransportModelPackage
 * @generated
 */
public class TransportModelValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TransportModelValidator INSTANCE = new TransportModelValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "transportModel";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportModelValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return TransportModelPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case TransportModelPackage.TRANSPORT_ORG:
				return validatetransportOrg((transportOrg)value, diagnostics, context);
			case TransportModelPackage.OPERATOR:
				return validateoperator((operator)value, diagnostics, context);
			case TransportModelPackage.LINES:
				return validatelines((lines)value, diagnostics, context);
			case TransportModelPackage.ROUTE:
				return validateroute((route)value, diagnostics, context);
			case TransportModelPackage.JOURNEY_PATTERNS:
				return validatejourneyPatterns((journeyPatterns)value, diagnostics, context);
			case TransportModelPackage.STOP_PLACE:
				return validatestopPlace((stopPlace)value, diagnostics, context);
			case TransportModelPackage.TRANSPORT_MODE_TYPE:
				return validateTransportModeType((TransportModeType) value, diagnostics, context);
			case TransportModelPackage.DIRECTION_TYPE:
				return validateDirectionType((DirectionType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatetransportOrg(transportOrg transportOrg, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(transportOrg, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(transportOrg, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(transportOrg, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(transportOrg, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(transportOrg, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(transportOrg, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(transportOrg, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(transportOrg, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(transportOrg, diagnostics, context);
		if (result || diagnostics != null) result &= validatetransportOrg_hasNameCheck(transportOrg, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the hasNameCheck constraint of '<em>transport Org</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TRANSPORT_ORG__HAS_NAME_CHECK__EEXPRESSION = "self.name.size()>0";

	/**
	 * Validates the hasNameCheck constraint of '<em>transport Org</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatetransportOrg_hasNameCheck(transportOrg transportOrg, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TransportModelPackage.Literals.TRANSPORT_ORG,
				 transportOrg,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "hasNameCheck",
				 TRANSPORT_ORG__HAS_NAME_CHECK__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateoperator(operator operator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(operator, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(operator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(operator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(operator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(operator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(operator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(operator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(operator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(operator, diagnostics, context);
		if (result || diagnostics != null) result &= validateoperator_hasIdCheck(operator, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the hasIdCheck constraint of '<em>operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OPERATOR__HAS_ID_CHECK__EEXPRESSION = "self.id.size()>0";

	/**
	 * Validates the hasIdCheck constraint of '<em>operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateoperator_hasIdCheck(operator operator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TransportModelPackage.Literals.OPERATOR,
				 operator,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "hasIdCheck",
				 OPERATOR__HAS_ID_CHECK__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatelines(lines lines, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lines, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateroute(route route, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(route, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatejourneyPatterns(journeyPatterns journeyPatterns, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(journeyPatterns, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatestopPlace(stopPlace stopPlace, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stopPlace, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransportModeType(TransportModeType transportModeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirectionType(DirectionType directionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //TransportModelValidator
