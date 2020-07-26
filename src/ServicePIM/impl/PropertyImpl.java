/**
 */
package ServicePIM.impl;

import ServicePIM.BasicType;
import ServicePIM.Property;
import ServicePIM.ServicePIMPackage;
import ServicePIM.TypeDefinition;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ServicePIM.impl.PropertyImpl#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link ServicePIM.impl.PropertyImpl#isIsNamingProperty <em>Is Naming Property</em>}</li>
 *   <li>{@link ServicePIM.impl.PropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link ServicePIM.impl.PropertyImpl#isIsRequired <em>Is Required</em>}</li>
 *   <li>{@link ServicePIM.impl.PropertyImpl#getMin <em>Min</em>}</li>
 *   <li>{@link ServicePIM.impl.PropertyImpl#getMax <em>Max</em>}</li>
 *   <li>{@link ServicePIM.impl.PropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link ServicePIM.impl.PropertyImpl#getBasictype <em>Basictype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyImpl extends MinimalEObjectImpl.Container implements Property {
	/**
	 * The default value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UNIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean isUnique = IS_UNIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsNamingProperty() <em>Is Naming Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNamingProperty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_NAMING_PROPERTY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsNamingProperty() <em>Is Naming Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNamingProperty()
	 * @generated
	 * @ordered
	 */
	protected boolean isNamingProperty = IS_NAMING_PROPERTY_EDEFAULT;

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
	 * The default value of the '{@link #isIsRequired() <em>Is Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsRequired() <em>Is Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean isRequired = IS_REQUIRED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected int min = MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected int max = MAX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeDefinition type;

	/**
	 * The cached value of the '{@link #getBasictype() <em>Basictype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasictype()
	 * @generated
	 * @ordered
	 */
	protected BasicType basictype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePIMPackage.Literals.PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsUnique() {
		return isUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsUnique(boolean newIsUnique) {
		boolean oldIsUnique = isUnique;
		isUnique = newIsUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePIMPackage.PROPERTY__IS_UNIQUE, oldIsUnique, isUnique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsNamingProperty() {
		return isNamingProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsNamingProperty(boolean newIsNamingProperty) {
		boolean oldIsNamingProperty = isNamingProperty;
		isNamingProperty = newIsNamingProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePIMPackage.PROPERTY__IS_NAMING_PROPERTY, oldIsNamingProperty, isNamingProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePIMPackage.PROPERTY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsRequired() {
		return isRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsRequired(boolean newIsRequired) {
		boolean oldIsRequired = isRequired;
		isRequired = newIsRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePIMPackage.PROPERTY__IS_REQUIRED, oldIsRequired, isRequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMin(int newMin) {
		int oldMin = min;
		min = newMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePIMPackage.PROPERTY__MIN, oldMin, min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMax(int newMax) {
		int oldMax = max;
		max = newMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePIMPackage.PROPERTY__MAX, oldMax, max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeDefinition getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (TypeDefinition)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServicePIMPackage.PROPERTY__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDefinition basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(TypeDefinition newType) {
		TypeDefinition oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePIMPackage.PROPERTY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicType getBasictype() {
		return basictype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasictype(BasicType newBasictype, NotificationChain msgs) {
		BasicType oldBasictype = basictype;
		basictype = newBasictype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicePIMPackage.PROPERTY__BASICTYPE, oldBasictype, newBasictype);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBasictype(BasicType newBasictype) {
		if (newBasictype != basictype) {
			NotificationChain msgs = null;
			if (basictype != null)
				msgs = ((InternalEObject)basictype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicePIMPackage.PROPERTY__BASICTYPE, null, msgs);
			if (newBasictype != null)
				msgs = ((InternalEObject)newBasictype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServicePIMPackage.PROPERTY__BASICTYPE, null, msgs);
			msgs = basicSetBasictype(newBasictype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePIMPackage.PROPERTY__BASICTYPE, newBasictype, newBasictype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServicePIMPackage.PROPERTY__BASICTYPE:
				return basicSetBasictype(null, msgs);
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
			case ServicePIMPackage.PROPERTY__IS_UNIQUE:
				return isIsUnique();
			case ServicePIMPackage.PROPERTY__IS_NAMING_PROPERTY:
				return isIsNamingProperty();
			case ServicePIMPackage.PROPERTY__NAME:
				return getName();
			case ServicePIMPackage.PROPERTY__IS_REQUIRED:
				return isIsRequired();
			case ServicePIMPackage.PROPERTY__MIN:
				return getMin();
			case ServicePIMPackage.PROPERTY__MAX:
				return getMax();
			case ServicePIMPackage.PROPERTY__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ServicePIMPackage.PROPERTY__BASICTYPE:
				return getBasictype();
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
			case ServicePIMPackage.PROPERTY__IS_UNIQUE:
				setIsUnique((Boolean)newValue);
				return;
			case ServicePIMPackage.PROPERTY__IS_NAMING_PROPERTY:
				setIsNamingProperty((Boolean)newValue);
				return;
			case ServicePIMPackage.PROPERTY__NAME:
				setName((String)newValue);
				return;
			case ServicePIMPackage.PROPERTY__IS_REQUIRED:
				setIsRequired((Boolean)newValue);
				return;
			case ServicePIMPackage.PROPERTY__MIN:
				setMin((Integer)newValue);
				return;
			case ServicePIMPackage.PROPERTY__MAX:
				setMax((Integer)newValue);
				return;
			case ServicePIMPackage.PROPERTY__TYPE:
				setType((TypeDefinition)newValue);
				return;
			case ServicePIMPackage.PROPERTY__BASICTYPE:
				setBasictype((BasicType)newValue);
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
			case ServicePIMPackage.PROPERTY__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case ServicePIMPackage.PROPERTY__IS_NAMING_PROPERTY:
				setIsNamingProperty(IS_NAMING_PROPERTY_EDEFAULT);
				return;
			case ServicePIMPackage.PROPERTY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ServicePIMPackage.PROPERTY__IS_REQUIRED:
				setIsRequired(IS_REQUIRED_EDEFAULT);
				return;
			case ServicePIMPackage.PROPERTY__MIN:
				setMin(MIN_EDEFAULT);
				return;
			case ServicePIMPackage.PROPERTY__MAX:
				setMax(MAX_EDEFAULT);
				return;
			case ServicePIMPackage.PROPERTY__TYPE:
				setType((TypeDefinition)null);
				return;
			case ServicePIMPackage.PROPERTY__BASICTYPE:
				setBasictype((BasicType)null);
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
			case ServicePIMPackage.PROPERTY__IS_UNIQUE:
				return isUnique != IS_UNIQUE_EDEFAULT;
			case ServicePIMPackage.PROPERTY__IS_NAMING_PROPERTY:
				return isNamingProperty != IS_NAMING_PROPERTY_EDEFAULT;
			case ServicePIMPackage.PROPERTY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ServicePIMPackage.PROPERTY__IS_REQUIRED:
				return isRequired != IS_REQUIRED_EDEFAULT;
			case ServicePIMPackage.PROPERTY__MIN:
				return min != MIN_EDEFAULT;
			case ServicePIMPackage.PROPERTY__MAX:
				return max != MAX_EDEFAULT;
			case ServicePIMPackage.PROPERTY__TYPE:
				return type != null;
			case ServicePIMPackage.PROPERTY__BASICTYPE:
				return basictype != null;
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
		result.append(" (isUnique: ");
		result.append(isUnique);
		result.append(", isNamingProperty: ");
		result.append(isNamingProperty);
		result.append(", name: ");
		result.append(name);
		result.append(", isRequired: ");
		result.append(isRequired);
		result.append(", min: ");
		result.append(min);
		result.append(", max: ");
		result.append(max);
		result.append(')');
		return result.toString();
	}

} //PropertyImpl
