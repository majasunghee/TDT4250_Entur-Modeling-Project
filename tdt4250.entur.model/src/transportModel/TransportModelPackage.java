/**
 */
package transportModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see transportModel.TransportModelFactory
 * @model kind="package"
 * @generated
 */
public interface TransportModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "transportModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/tdt4250.entur.model/model/transportModel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "transportModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TransportModelPackage eINSTANCE = transportModel.impl.TransportModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link transportModel.impl.transportOrgImpl <em>transport Org</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see transportModel.impl.transportOrgImpl
	 * @see transportModel.impl.TransportModelPackageImpl#gettransportOrg()
	 * @generated
	 */
	int TRANSPORT_ORG = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_ORG__NAME = 0;

	/**
	 * The feature id for the '<em><b>Has Operator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_ORG__HAS_OPERATOR = 1;

	/**
	 * The number of structural features of the '<em>transport Org</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_ORG_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>transport Org</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_ORG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link transportModel.impl.operatorImpl <em>operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see transportModel.impl.operatorImpl
	 * @see transportModel.impl.TransportModelPackageImpl#getoperator()
	 * @generated
	 */
	int OPERATOR = 1;

	/**
	 * The feature id for the '<em><b>Has Lines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__HAS_LINES = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__NAME = 2;

	/**
	 * The feature id for the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__PHONE = 3;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__URL = 4;

	/**
	 * The number of structural features of the '<em>operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link transportModel.impl.linesImpl <em>lines</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see transportModel.impl.linesImpl
	 * @see transportModel.impl.TransportModelPackageImpl#getlines()
	 * @generated
	 */
	int LINES = 2;

	/**
	 * The feature id for the '<em><b>Has Specific Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINES__HAS_SPECIFIC_LINE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINES__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINES__NAME = 2;

	/**
	 * The feature id for the '<em><b>Transport Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINES__TRANSPORT_MODE = 3;

	/**
	 * The feature id for the '<em><b>Bikes Allowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINES__BIKES_ALLOWED = 4;

	/**
	 * The number of structural features of the '<em>lines</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINES_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>lines</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link transportModel.impl.specificLineImpl <em>specific Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see transportModel.impl.specificLineImpl
	 * @see transportModel.impl.TransportModelPackageImpl#getspecificLine()
	 * @generated
	 */
	int SPECIFIC_LINE = 3;

	/**
	 * The feature id for the '<em><b>Has Route</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_LINE__HAS_ROUTE = 0;

	/**
	 * The feature id for the '<em><b>Has Journey Patterns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_LINE__HAS_JOURNEY_PATTERNS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_LINE__ID = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_LINE__NAME = 3;

	/**
	 * The number of structural features of the '<em>specific Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_LINE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>specific Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_LINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link transportModel.impl.routeImpl <em>route</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see transportModel.impl.routeImpl
	 * @see transportModel.impl.TransportModelPackageImpl#getroute()
	 * @generated
	 */
	int ROUTE = 4;

	/**
	 * The feature id for the '<em><b>Has Stop Place</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__HAS_STOP_PLACE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__NAME = 2;

	/**
	 * The number of structural features of the '<em>route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link transportModel.impl.journeyPatternsImpl <em>journey Patterns</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see transportModel.impl.journeyPatternsImpl
	 * @see transportModel.impl.TransportModelPackageImpl#getjourneyPatterns()
	 * @generated
	 */
	int JOURNEY_PATTERNS = 5;

	/**
	 * The feature id for the '<em><b>Has Stop Place</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_PATTERNS__HAS_STOP_PLACE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_PATTERNS__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_PATTERNS__NAME = 2;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_PATTERNS__DIRECTION = 3;

	/**
	 * The number of structural features of the '<em>journey Patterns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_PATTERNS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>journey Patterns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_PATTERNS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link transportModel.impl.stopPlaceImpl <em>stop Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see transportModel.impl.stopPlaceImpl
	 * @see transportModel.impl.TransportModelPackageImpl#getstopPlace()
	 * @generated
	 */
	int STOP_PLACE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_PLACE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_PLACE__NAME = 1;

	/**
	 * The number of structural features of the '<em>stop Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_PLACE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>stop Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_PLACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link transportModel.TransportModeType <em>Transport Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see transportModel.TransportModeType
	 * @see transportModel.impl.TransportModelPackageImpl#getTransportModeType()
	 * @generated
	 */
	int TRANSPORT_MODE_TYPE = 7;

	/**
	 * The meta object id for the '{@link transportModel.DirectionType <em>Direction Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see transportModel.DirectionType
	 * @see transportModel.impl.TransportModelPackageImpl#getDirectionType()
	 * @generated
	 */
	int DIRECTION_TYPE = 8;


	/**
	 * Returns the meta object for class '{@link transportModel.transportOrg <em>transport Org</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>transport Org</em>'.
	 * @see transportModel.transportOrg
	 * @generated
	 */
	EClass gettransportOrg();

	/**
	 * Returns the meta object for the attribute '{@link transportModel.transportOrg#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see transportModel.transportOrg#getName()
	 * @see #gettransportOrg()
	 * @generated
	 */
	EAttribute gettransportOrg_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link transportModel.transportOrg#getHasOperator <em>Has Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Operator</em>'.
	 * @see transportModel.transportOrg#getHasOperator()
	 * @see #gettransportOrg()
	 * @generated
	 */
	EReference gettransportOrg_HasOperator();

	/**
	 * Returns the meta object for class '{@link transportModel.operator <em>operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>operator</em>'.
	 * @see transportModel.operator
	 * @generated
	 */
	EClass getoperator();

	/**
	 * Returns the meta object for the containment reference list '{@link transportModel.operator#getHasLines <em>Has Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Lines</em>'.
	 * @see transportModel.operator#getHasLines()
	 * @see #getoperator()
	 * @generated
	 */
	EReference getoperator_HasLines();

	/**
	 * Returns the meta object for the attribute '{@link transportModel.operator#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see transportModel.operator#getId()
	 * @see #getoperator()
	 * @generated
	 */
	EAttribute getoperator_Id();

	/**
	 * Returns the meta object for the attribute '{@link transportModel.operator#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see transportModel.operator#getName()
	 * @see #getoperator()
	 * @generated
	 */
	EAttribute getoperator_Name();

	/**
	 * Returns the meta object for the attribute '{@link transportModel.operator#getPhone <em>Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone</em>'.
	 * @see transportModel.operator#getPhone()
	 * @see #getoperator()
	 * @generated
	 */
	EAttribute getoperator_Phone();

	/**
	 * Returns the meta object for the attribute '{@link transportModel.operator#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see transportModel.operator#getUrl()
	 * @see #getoperator()
	 * @generated
	 */
	EAttribute getoperator_Url();

	/**
	 * Returns the meta object for class '{@link transportModel.lines <em>lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>lines</em>'.
	 * @see transportModel.lines
	 * @generated
	 */
	EClass getlines();

	/**
	 * Returns the meta object for the containment reference list '{@link transportModel.lines#getHasSpecificLine <em>Has Specific Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Specific Line</em>'.
	 * @see transportModel.lines#getHasSpecificLine()
	 * @see #getlines()
	 * @generated
	 */
	EReference getlines_HasSpecificLine();

	/**
	 * Returns the meta object for the attribute '{@link transportModel.lines#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see transportModel.lines#getId()
	 * @see #getlines()
	 * @generated
	 */
	EAttribute getlines_Id();

	/**
	 * Returns the meta object for the attribute '{@link transportModel.lines#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see transportModel.lines#getName()
	 * @see #getlines()
	 * @generated
	 */
	EAttribute getlines_Name();

	/**
	 * Returns the meta object for the attribute '{@link transportModel.lines#getTransportMode <em>Transport Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transport Mode</em>'.
	 * @see transportModel.lines#getTransportMode()
	 * @see #getlines()
	 * @generated
	 */
	EAttribute getlines_TransportMode();

	/**
	 * Returns the meta object for the attribute '{@link transportModel.lines#getBikesAllowed <em>Bikes Allowed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bikes Allowed</em>'.
	 * @see transportModel.lines#getBikesAllowed()
	 * @see #getlines()
	 * @generated
	 */
	EAttribute getlines_BikesAllowed();

	/**
	 * Returns the meta object for class '{@link transportModel.specificLine <em>specific Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>specific Line</em>'.
	 * @see transportModel.specificLine
	 * @generated
	 */
	EClass getspecificLine();

	/**
	 * Returns the meta object for the containment reference list '{@link transportModel.specificLine#getHasRoute <em>Has Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Route</em>'.
	 * @see transportModel.specificLine#getHasRoute()
	 * @see #getspecificLine()
	 * @generated
	 */
	EReference getspecificLine_HasRoute();

	/**
	 * Returns the meta object for the containment reference list '{@link transportModel.specificLine#getHasJourneyPatterns <em>Has Journey Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Journey Patterns</em>'.
	 * @see transportModel.specificLine#getHasJourneyPatterns()
	 * @see #getspecificLine()
	 * @generated
	 */
	EReference getspecificLine_HasJourneyPatterns();

	/**
	 * Returns the meta object for the attribute '{@link transportModel.specificLine#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see transportModel.specificLine#getId()
	 * @see #getspecificLine()
	 * @generated
	 */
	EAttribute getspecificLine_Id();

	/**
	 * Returns the meta object for the attribute '{@link transportModel.specificLine#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see transportModel.specificLine#getName()
	 * @see #getspecificLine()
	 * @generated
	 */
	EAttribute getspecificLine_Name();

	/**
	 * Returns the meta object for class '{@link transportModel.route <em>route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>route</em>'.
	 * @see transportModel.route
	 * @generated
	 */
	EClass getroute();

	/**
	 * Returns the meta object for the containment reference list '{@link transportModel.route#getHasStopPlace <em>Has Stop Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Stop Place</em>'.
	 * @see transportModel.route#getHasStopPlace()
	 * @see #getroute()
	 * @generated
	 */
	EReference getroute_HasStopPlace();

	/**
	 * Returns the meta object for the attribute '{@link transportModel.route#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see transportModel.route#getId()
	 * @see #getroute()
	 * @generated
	 */
	EAttribute getroute_Id();

	/**
	 * Returns the meta object for the attribute '{@link transportModel.route#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see transportModel.route#getName()
	 * @see #getroute()
	 * @generated
	 */
	EAttribute getroute_Name();

	/**
	 * Returns the meta object for class '{@link transportModel.journeyPatterns <em>journey Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>journey Patterns</em>'.
	 * @see transportModel.journeyPatterns
	 * @generated
	 */
	EClass getjourneyPatterns();

	/**
	 * Returns the meta object for the containment reference list '{@link transportModel.journeyPatterns#getHasStopPlace <em>Has Stop Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Stop Place</em>'.
	 * @see transportModel.journeyPatterns#getHasStopPlace()
	 * @see #getjourneyPatterns()
	 * @generated
	 */
	EReference getjourneyPatterns_HasStopPlace();

	/**
	 * Returns the meta object for the attribute '{@link transportModel.journeyPatterns#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see transportModel.journeyPatterns#getId()
	 * @see #getjourneyPatterns()
	 * @generated
	 */
	EAttribute getjourneyPatterns_Id();

	/**
	 * Returns the meta object for the attribute '{@link transportModel.journeyPatterns#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see transportModel.journeyPatterns#getName()
	 * @see #getjourneyPatterns()
	 * @generated
	 */
	EAttribute getjourneyPatterns_Name();

	/**
	 * Returns the meta object for the attribute '{@link transportModel.journeyPatterns#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see transportModel.journeyPatterns#getDirection()
	 * @see #getjourneyPatterns()
	 * @generated
	 */
	EAttribute getjourneyPatterns_Direction();

	/**
	 * Returns the meta object for class '{@link transportModel.stopPlace <em>stop Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>stop Place</em>'.
	 * @see transportModel.stopPlace
	 * @generated
	 */
	EClass getstopPlace();

	/**
	 * Returns the meta object for the attribute '{@link transportModel.stopPlace#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see transportModel.stopPlace#getId()
	 * @see #getstopPlace()
	 * @generated
	 */
	EAttribute getstopPlace_Id();

	/**
	 * Returns the meta object for the attribute '{@link transportModel.stopPlace#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see transportModel.stopPlace#getName()
	 * @see #getstopPlace()
	 * @generated
	 */
	EAttribute getstopPlace_Name();

	/**
	 * Returns the meta object for enum '{@link transportModel.TransportModeType <em>Transport Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transport Mode Type</em>'.
	 * @see transportModel.TransportModeType
	 * @generated
	 */
	EEnum getTransportModeType();

	/**
	 * Returns the meta object for enum '{@link transportModel.DirectionType <em>Direction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction Type</em>'.
	 * @see transportModel.DirectionType
	 * @generated
	 */
	EEnum getDirectionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TransportModelFactory getTransportModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link transportModel.impl.transportOrgImpl <em>transport Org</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see transportModel.impl.transportOrgImpl
		 * @see transportModel.impl.TransportModelPackageImpl#gettransportOrg()
		 * @generated
		 */
		EClass TRANSPORT_ORG = eINSTANCE.gettransportOrg();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSPORT_ORG__NAME = eINSTANCE.gettransportOrg_Name();

		/**
		 * The meta object literal for the '<em><b>Has Operator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSPORT_ORG__HAS_OPERATOR = eINSTANCE.gettransportOrg_HasOperator();

		/**
		 * The meta object literal for the '{@link transportModel.impl.operatorImpl <em>operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see transportModel.impl.operatorImpl
		 * @see transportModel.impl.TransportModelPackageImpl#getoperator()
		 * @generated
		 */
		EClass OPERATOR = eINSTANCE.getoperator();

		/**
		 * The meta object literal for the '<em><b>Has Lines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR__HAS_LINES = eINSTANCE.getoperator_HasLines();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATOR__ID = eINSTANCE.getoperator_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATOR__NAME = eINSTANCE.getoperator_Name();

		/**
		 * The meta object literal for the '<em><b>Phone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATOR__PHONE = eINSTANCE.getoperator_Phone();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATOR__URL = eINSTANCE.getoperator_Url();

		/**
		 * The meta object literal for the '{@link transportModel.impl.linesImpl <em>lines</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see transportModel.impl.linesImpl
		 * @see transportModel.impl.TransportModelPackageImpl#getlines()
		 * @generated
		 */
		EClass LINES = eINSTANCE.getlines();

		/**
		 * The meta object literal for the '<em><b>Has Specific Line</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINES__HAS_SPECIFIC_LINE = eINSTANCE.getlines_HasSpecificLine();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINES__ID = eINSTANCE.getlines_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINES__NAME = eINSTANCE.getlines_Name();

		/**
		 * The meta object literal for the '<em><b>Transport Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINES__TRANSPORT_MODE = eINSTANCE.getlines_TransportMode();

		/**
		 * The meta object literal for the '<em><b>Bikes Allowed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINES__BIKES_ALLOWED = eINSTANCE.getlines_BikesAllowed();

		/**
		 * The meta object literal for the '{@link transportModel.impl.specificLineImpl <em>specific Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see transportModel.impl.specificLineImpl
		 * @see transportModel.impl.TransportModelPackageImpl#getspecificLine()
		 * @generated
		 */
		EClass SPECIFIC_LINE = eINSTANCE.getspecificLine();

		/**
		 * The meta object literal for the '<em><b>Has Route</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_LINE__HAS_ROUTE = eINSTANCE.getspecificLine_HasRoute();

		/**
		 * The meta object literal for the '<em><b>Has Journey Patterns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_LINE__HAS_JOURNEY_PATTERNS = eINSTANCE.getspecificLine_HasJourneyPatterns();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFIC_LINE__ID = eINSTANCE.getspecificLine_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFIC_LINE__NAME = eINSTANCE.getspecificLine_Name();

		/**
		 * The meta object literal for the '{@link transportModel.impl.routeImpl <em>route</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see transportModel.impl.routeImpl
		 * @see transportModel.impl.TransportModelPackageImpl#getroute()
		 * @generated
		 */
		EClass ROUTE = eINSTANCE.getroute();

		/**
		 * The meta object literal for the '<em><b>Has Stop Place</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__HAS_STOP_PLACE = eINSTANCE.getroute_HasStopPlace();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE__ID = eINSTANCE.getroute_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE__NAME = eINSTANCE.getroute_Name();

		/**
		 * The meta object literal for the '{@link transportModel.impl.journeyPatternsImpl <em>journey Patterns</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see transportModel.impl.journeyPatternsImpl
		 * @see transportModel.impl.TransportModelPackageImpl#getjourneyPatterns()
		 * @generated
		 */
		EClass JOURNEY_PATTERNS = eINSTANCE.getjourneyPatterns();

		/**
		 * The meta object literal for the '<em><b>Has Stop Place</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOURNEY_PATTERNS__HAS_STOP_PLACE = eINSTANCE.getjourneyPatterns_HasStopPlace();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOURNEY_PATTERNS__ID = eINSTANCE.getjourneyPatterns_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOURNEY_PATTERNS__NAME = eINSTANCE.getjourneyPatterns_Name();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOURNEY_PATTERNS__DIRECTION = eINSTANCE.getjourneyPatterns_Direction();

		/**
		 * The meta object literal for the '{@link transportModel.impl.stopPlaceImpl <em>stop Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see transportModel.impl.stopPlaceImpl
		 * @see transportModel.impl.TransportModelPackageImpl#getstopPlace()
		 * @generated
		 */
		EClass STOP_PLACE = eINSTANCE.getstopPlace();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOP_PLACE__ID = eINSTANCE.getstopPlace_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOP_PLACE__NAME = eINSTANCE.getstopPlace_Name();

		/**
		 * The meta object literal for the '{@link transportModel.TransportModeType <em>Transport Mode Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see transportModel.TransportModeType
		 * @see transportModel.impl.TransportModelPackageImpl#getTransportModeType()
		 * @generated
		 */
		EEnum TRANSPORT_MODE_TYPE = eINSTANCE.getTransportModeType();

		/**
		 * The meta object literal for the '{@link transportModel.DirectionType <em>Direction Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see transportModel.DirectionType
		 * @see transportModel.impl.TransportModelPackageImpl#getDirectionType()
		 * @generated
		 */
		EEnum DIRECTION_TYPE = eINSTANCE.getDirectionType();

	}

} //TransportModelPackage
