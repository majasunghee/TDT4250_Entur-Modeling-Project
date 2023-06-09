/**
 */
package transportModel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import transportModel.DirectionType;
import transportModel.TransportModeType;
import transportModel.TransportModelFactory;
import transportModel.TransportModelPackage;
import transportModel.journeyPatterns;
import transportModel.lines;
import transportModel.operator;
import transportModel.route;
import transportModel.stopPlace;
import transportModel.transportOrg;
import transportModel.util.TransportModelValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TransportModelPackageImpl extends EPackageImpl implements TransportModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transportOrgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass journeyPatternsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stopPlaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transportModeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum directionTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see transportModel.TransportModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TransportModelPackageImpl() {
		super(eNS_URI, TransportModelFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link TransportModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TransportModelPackage init() {
		if (isInited) return (TransportModelPackage)EPackage.Registry.INSTANCE.getEPackage(TransportModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTransportModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TransportModelPackageImpl theTransportModelPackage = registeredTransportModelPackage instanceof TransportModelPackageImpl ? (TransportModelPackageImpl)registeredTransportModelPackage : new TransportModelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theTransportModelPackage.createPackageContents();

		// Initialize created meta-data
		theTransportModelPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theTransportModelPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return TransportModelValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theTransportModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TransportModelPackage.eNS_URI, theTransportModelPackage);
		return theTransportModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gettransportOrg() {
		return transportOrgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute gettransportOrg_Name() {
		return (EAttribute)transportOrgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference gettransportOrg_HasOperator() {
		return (EReference)transportOrgEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getoperator() {
		return operatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getoperator_HasLines() {
		return (EReference)operatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getoperator_Id() {
		return (EAttribute)operatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getoperator_Name() {
		return (EAttribute)operatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getoperator_Phone() {
		return (EAttribute)operatorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getoperator_Url() {
		return (EAttribute)operatorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getlines() {
		return linesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getlines_Routes() {
		return (EReference)linesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getlines_Id() {
		return (EAttribute)linesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getlines_Name() {
		return (EAttribute)linesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getlines_TransportMode() {
		return (EAttribute)linesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getlines_BikesAllowed() {
		return (EAttribute)linesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getroute() {
		return routeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getroute_StopPlaces() {
		return (EReference)routeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getroute_JourneyPatterns() {
		return (EReference)routeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getroute_Id() {
		return (EAttribute)routeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getroute_Name() {
		return (EAttribute)routeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getroute_LineID() {
		return (EAttribute)routeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getjourneyPatterns() {
		return journeyPatternsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getjourneyPatterns_Name() {
		return (EAttribute)journeyPatternsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getjourneyPatterns_Direction() {
		return (EAttribute)journeyPatternsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getstopPlace() {
		return stopPlaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getstopPlace_Name() {
		return (EAttribute)stopPlaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransportModeType() {
		return transportModeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDirectionType() {
		return directionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportModelFactory getTransportModelFactory() {
		return (TransportModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		transportOrgEClass = createEClass(TRANSPORT_ORG);
		createEAttribute(transportOrgEClass, TRANSPORT_ORG__NAME);
		createEReference(transportOrgEClass, TRANSPORT_ORG__HAS_OPERATOR);

		operatorEClass = createEClass(OPERATOR);
		createEReference(operatorEClass, OPERATOR__HAS_LINES);
		createEAttribute(operatorEClass, OPERATOR__ID);
		createEAttribute(operatorEClass, OPERATOR__NAME);
		createEAttribute(operatorEClass, OPERATOR__PHONE);
		createEAttribute(operatorEClass, OPERATOR__URL);

		linesEClass = createEClass(LINES);
		createEReference(linesEClass, LINES__ROUTES);
		createEAttribute(linesEClass, LINES__ID);
		createEAttribute(linesEClass, LINES__NAME);
		createEAttribute(linesEClass, LINES__TRANSPORT_MODE);
		createEAttribute(linesEClass, LINES__BIKES_ALLOWED);

		routeEClass = createEClass(ROUTE);
		createEReference(routeEClass, ROUTE__STOP_PLACES);
		createEReference(routeEClass, ROUTE__JOURNEY_PATTERNS);
		createEAttribute(routeEClass, ROUTE__ID);
		createEAttribute(routeEClass, ROUTE__NAME);
		createEAttribute(routeEClass, ROUTE__LINE_ID);

		journeyPatternsEClass = createEClass(JOURNEY_PATTERNS);
		createEAttribute(journeyPatternsEClass, JOURNEY_PATTERNS__NAME);
		createEAttribute(journeyPatternsEClass, JOURNEY_PATTERNS__DIRECTION);

		stopPlaceEClass = createEClass(STOP_PLACE);
		createEAttribute(stopPlaceEClass, STOP_PLACE__NAME);

		// Create enums
		transportModeTypeEEnum = createEEnum(TRANSPORT_MODE_TYPE);
		directionTypeEEnum = createEEnum(DIRECTION_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(transportOrgEClass, transportOrg.class, "transportOrg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(gettransportOrg_Name(), ecorePackage.getEString(), "name", null, 1, 1, transportOrg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(gettransportOrg_HasOperator(), this.getoperator(), null, "hasOperator", null, 1, -1, transportOrg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operatorEClass, operator.class, "operator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getoperator_HasLines(), this.getlines(), null, "hasLines", null, 0, -1, operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getoperator_Id(), ecorePackage.getEString(), "id", null, 1, 1, operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getoperator_Name(), ecorePackage.getEString(), "name", null, 1, 1, operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getoperator_Phone(), ecorePackage.getEString(), "phone", null, 0, 1, operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getoperator_Url(), ecorePackage.getEString(), "url", null, 0, 1, operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linesEClass, lines.class, "lines", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getlines_Routes(), this.getroute(), null, "routes", null, 0, -1, lines.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getlines_Id(), ecorePackage.getEString(), "id", null, 1, 1, lines.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getlines_Name(), ecorePackage.getEString(), "name", null, 1, 1, lines.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getlines_TransportMode(), this.getTransportModeType(), "transportMode", null, 1, 1, lines.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getlines_BikesAllowed(), ecorePackage.getEBooleanObject(), "bikesAllowed", null, 1, 1, lines.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(routeEClass, route.class, "route", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getroute_StopPlaces(), this.getstopPlace(), null, "stopPlaces", null, 1, -1, route.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getroute_JourneyPatterns(), this.getjourneyPatterns(), null, "journeyPatterns", null, 0, -1, route.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getroute_Id(), ecorePackage.getEString(), "id", null, 1, 1, route.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getroute_Name(), ecorePackage.getEString(), "name", null, 1, 1, route.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getroute_LineID(), ecorePackage.getEString(), "lineID", null, 1, 1, route.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(journeyPatternsEClass, journeyPatterns.class, "journeyPatterns", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getjourneyPatterns_Name(), ecorePackage.getEString(), "name", null, 1, 1, journeyPatterns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getjourneyPatterns_Direction(), this.getDirectionType(), "direction", null, 1, 1, journeyPatterns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stopPlaceEClass, stopPlace.class, "stopPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getstopPlace_Name(), ecorePackage.getEString(), "name", null, 1, 1, stopPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(transportModeTypeEEnum, TransportModeType.class, "TransportModeType");
		addEEnumLiteral(transportModeTypeEEnum, TransportModeType.BUS);
		addEEnumLiteral(transportModeTypeEEnum, TransportModeType.AIR);
		addEEnumLiteral(transportModeTypeEEnum, TransportModeType.WATER);
		addEEnumLiteral(transportModeTypeEEnum, TransportModeType.RAIL);
		addEEnumLiteral(transportModeTypeEEnum, TransportModeType.LIFT);

		initEEnum(directionTypeEEnum, DirectionType.class, "DirectionType");
		addEEnumLiteral(directionTypeEEnum, DirectionType.INBOUND);
		addEEnumLiteral(directionTypeEEnum, DirectionType.OUTBOUND);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });
		addAnnotation
		  (transportOrgEClass,
		   source,
		   new String[] {
			   "constraints", "hasNameCheck"
		   });
		addAnnotation
		  (operatorEClass,
		   source,
		   new String[] {
			   "constraints", "hasIdCheck"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";
		addAnnotation
		  (transportOrgEClass,
		   source,
		   new String[] {
			   "hasNameCheck", "self.name.size()>0"
		   });
		addAnnotation
		  (operatorEClass,
		   source,
		   new String[] {
			   "hasIdCheck", "self.id.size()>0"
		   });
	}

} //TransportModelPackageImpl
