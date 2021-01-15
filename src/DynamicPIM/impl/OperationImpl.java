/**
 */
package DynamicPIM.impl;

import DynamicPIM.DynamicPIMPackage;
import DynamicPIM.Operation;
import DynamicPIM.Parameter;
import DynamicPIM.Publish;
import DynamicPIM.TypeDefinition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DynamicPIM.impl.OperationImpl#getName <em>Name</em>}</li>
 *   <li>{@link DynamicPIM.impl.OperationImpl#getPublish <em>Publish</em>}</li>
 *   <li>{@link DynamicPIM.impl.OperationImpl#getHasParameter <em>Has Parameter</em>}</li>
 *   <li>{@link DynamicPIM.impl.OperationImpl#getReturntype <em>Returntype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationImpl extends EObjectImpl implements Operation {
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
	 * The cached value of the '{@link #getPublish() <em>Publish</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublish()
	 * @generated
	 * @ordered
	 */
	protected Publish publish;

	/**
	 * The cached value of the '{@link #getHasParameter() <em>Has Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> hasParameter;

	/**
	 * The cached value of the '{@link #getReturntype() <em>Returntype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturntype()
	 * @generated
	 * @ordered
	 */
	protected TypeDefinition returntype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DynamicPIMPackage.Literals.OPERATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicPIMPackage.OPERATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Publish getPublish() {
		return publish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublish(Publish newPublish, NotificationChain msgs) {
		Publish oldPublish = publish;
		publish = newPublish;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DynamicPIMPackage.OPERATION__PUBLISH, oldPublish, newPublish);
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
	public void setPublish(Publish newPublish) {
		if (newPublish != publish) {
			NotificationChain msgs = null;
			if (publish != null)
				msgs = ((InternalEObject)publish).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DynamicPIMPackage.OPERATION__PUBLISH, null, msgs);
			if (newPublish != null)
				msgs = ((InternalEObject)newPublish).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DynamicPIMPackage.OPERATION__PUBLISH, null, msgs);
			msgs = basicSetPublish(newPublish, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicPIMPackage.OPERATION__PUBLISH, newPublish, newPublish));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getHasParameter() {
		if (hasParameter == null) {
			hasParameter = new EObjectContainmentEList<Parameter>(Parameter.class, this, DynamicPIMPackage.OPERATION__HAS_PARAMETER);
		}
		return hasParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeDefinition getReturntype() {
		if (returntype != null && returntype.eIsProxy()) {
			InternalEObject oldReturntype = (InternalEObject)returntype;
			returntype = (TypeDefinition)eResolveProxy(oldReturntype);
			if (returntype != oldReturntype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DynamicPIMPackage.OPERATION__RETURNTYPE, oldReturntype, returntype));
			}
		}
		return returntype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDefinition basicGetReturntype() {
		return returntype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturntype(TypeDefinition newReturntype) {
		TypeDefinition oldReturntype = returntype;
		returntype = newReturntype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicPIMPackage.OPERATION__RETURNTYPE, oldReturntype, returntype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DynamicPIMPackage.OPERATION__PUBLISH:
				return basicSetPublish(null, msgs);
			case DynamicPIMPackage.OPERATION__HAS_PARAMETER:
				return ((InternalEList<?>)getHasParameter()).basicRemove(otherEnd, msgs);
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
			case DynamicPIMPackage.OPERATION__NAME:
				return getName();
			case DynamicPIMPackage.OPERATION__PUBLISH:
				return getPublish();
			case DynamicPIMPackage.OPERATION__HAS_PARAMETER:
				return getHasParameter();
			case DynamicPIMPackage.OPERATION__RETURNTYPE:
				if (resolve) return getReturntype();
				return basicGetReturntype();
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
			case DynamicPIMPackage.OPERATION__NAME:
				setName((String)newValue);
				return;
			case DynamicPIMPackage.OPERATION__PUBLISH:
				setPublish((Publish)newValue);
				return;
			case DynamicPIMPackage.OPERATION__HAS_PARAMETER:
				getHasParameter().clear();
				getHasParameter().addAll((Collection<? extends Parameter>)newValue);
				return;
			case DynamicPIMPackage.OPERATION__RETURNTYPE:
				setReturntype((TypeDefinition)newValue);
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
			case DynamicPIMPackage.OPERATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DynamicPIMPackage.OPERATION__PUBLISH:
				setPublish((Publish)null);
				return;
			case DynamicPIMPackage.OPERATION__HAS_PARAMETER:
				getHasParameter().clear();
				return;
			case DynamicPIMPackage.OPERATION__RETURNTYPE:
				setReturntype((TypeDefinition)null);
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
			case DynamicPIMPackage.OPERATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DynamicPIMPackage.OPERATION__PUBLISH:
				return publish != null;
			case DynamicPIMPackage.OPERATION__HAS_PARAMETER:
				return hasParameter != null && !hasParameter.isEmpty();
			case DynamicPIMPackage.OPERATION__RETURNTYPE:
				return returntype != null;
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

} //OperationImpl
