/**
 */
package ServicePIM.impl;

import ServicePIM.RESTfulServicePIM;
import ServicePIM.Resource;
import ServicePIM.ServicePIMPackage;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RES Tful Service PIM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ServicePIM.impl.RESTfulServicePIMImpl#getName <em>Name</em>}</li>
 *   <li>{@link ServicePIM.impl.RESTfulServicePIMImpl#getHasResources <em>Has Resources</em>}</li>
 *   <li>{@link ServicePIM.impl.RESTfulServicePIMImpl#getOutputPath <em>Output Path</em>}</li>
 *   <li>{@link ServicePIM.impl.RESTfulServicePIMImpl#getDbIP <em>Db IP</em>}</li>
 *   <li>{@link ServicePIM.impl.RESTfulServicePIMImpl#getDbPort <em>Db Port</em>}</li>
 *   <li>{@link ServicePIM.impl.RESTfulServicePIMImpl#getDbUsername <em>Db Username</em>}</li>
 *   <li>{@link ServicePIM.impl.RESTfulServicePIMImpl#getDbPassword <em>Db Password</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RESTfulServicePIMImpl extends MinimalEObjectImpl.Container implements RESTfulServicePIM {
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
	 * The cached value of the '{@link #getHasResources() <em>Has Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasResources()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> hasResources;

	/**
	 * The default value of the '{@link #getOutputPath() <em>Output Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputPath()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputPath() <em>Output Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputPath()
	 * @generated
	 * @ordered
	 */
	protected String outputPath = OUTPUT_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbIP() <em>Db IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbIP()
	 * @generated
	 * @ordered
	 */
	protected static final String DB_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbIP() <em>Db IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbIP()
	 * @generated
	 * @ordered
	 */
	protected String dbIP = DB_IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbPort() <em>Db Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbPort()
	 * @generated
	 * @ordered
	 */
	protected static final String DB_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbPort() <em>Db Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbPort()
	 * @generated
	 * @ordered
	 */
	protected String dbPort = DB_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbUsername() <em>Db Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String DB_USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbUsername() <em>Db Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbUsername()
	 * @generated
	 * @ordered
	 */
	protected String dbUsername = DB_USERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbPassword() <em>Db Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String DB_PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbPassword() <em>Db Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbPassword()
	 * @generated
	 * @ordered
	 */
	protected String dbPassword = DB_PASSWORD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RESTfulServicePIMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePIMPackage.Literals.RES_TFUL_SERVICE_PIM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePIMPackage.RES_TFUL_SERVICE_PIM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Resource> getHasResources() {
		if (hasResources == null) {
			hasResources = new EObjectContainmentEList<Resource>(Resource.class, this, ServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_RESOURCES);
		}
		return hasResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOutputPath() {
		return outputPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutputPath(String newOutputPath) {
		String oldOutputPath = outputPath;
		outputPath = newOutputPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePIMPackage.RES_TFUL_SERVICE_PIM__OUTPUT_PATH, oldOutputPath, outputPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDbIP() {
		return dbIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDbIP(String newDbIP) {
		String oldDbIP = dbIP;
		dbIP = newDbIP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePIMPackage.RES_TFUL_SERVICE_PIM__DB_IP, oldDbIP, dbIP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDbPort() {
		return dbPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDbPort(String newDbPort) {
		String oldDbPort = dbPort;
		dbPort = newDbPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePIMPackage.RES_TFUL_SERVICE_PIM__DB_PORT, oldDbPort, dbPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDbUsername() {
		return dbUsername;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDbUsername(String newDbUsername) {
		String oldDbUsername = dbUsername;
		dbUsername = newDbUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePIMPackage.RES_TFUL_SERVICE_PIM__DB_USERNAME, oldDbUsername, dbUsername));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDbPassword() {
		return dbPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDbPassword(String newDbPassword) {
		String oldDbPassword = dbPassword;
		dbPassword = newDbPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePIMPackage.RES_TFUL_SERVICE_PIM__DB_PASSWORD, oldDbPassword, dbPassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_RESOURCES:
				return ((InternalEList<?>)getHasResources()).basicRemove(otherEnd, msgs);
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
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__NAME:
				return getName();
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_RESOURCES:
				return getHasResources();
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__OUTPUT_PATH:
				return getOutputPath();
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__DB_IP:
				return getDbIP();
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__DB_PORT:
				return getDbPort();
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__DB_USERNAME:
				return getDbUsername();
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__DB_PASSWORD:
				return getDbPassword();
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
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__NAME:
				setName((String)newValue);
				return;
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_RESOURCES:
				getHasResources().clear();
				getHasResources().addAll((Collection<? extends Resource>)newValue);
				return;
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__OUTPUT_PATH:
				setOutputPath((String)newValue);
				return;
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__DB_IP:
				setDbIP((String)newValue);
				return;
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__DB_PORT:
				setDbPort((String)newValue);
				return;
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__DB_USERNAME:
				setDbUsername((String)newValue);
				return;
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__DB_PASSWORD:
				setDbPassword((String)newValue);
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
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_RESOURCES:
				getHasResources().clear();
				return;
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__OUTPUT_PATH:
				setOutputPath(OUTPUT_PATH_EDEFAULT);
				return;
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__DB_IP:
				setDbIP(DB_IP_EDEFAULT);
				return;
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__DB_PORT:
				setDbPort(DB_PORT_EDEFAULT);
				return;
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__DB_USERNAME:
				setDbUsername(DB_USERNAME_EDEFAULT);
				return;
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__DB_PASSWORD:
				setDbPassword(DB_PASSWORD_EDEFAULT);
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
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__HAS_RESOURCES:
				return hasResources != null && !hasResources.isEmpty();
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__OUTPUT_PATH:
				return OUTPUT_PATH_EDEFAULT == null ? outputPath != null : !OUTPUT_PATH_EDEFAULT.equals(outputPath);
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__DB_IP:
				return DB_IP_EDEFAULT == null ? dbIP != null : !DB_IP_EDEFAULT.equals(dbIP);
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__DB_PORT:
				return DB_PORT_EDEFAULT == null ? dbPort != null : !DB_PORT_EDEFAULT.equals(dbPort);
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__DB_USERNAME:
				return DB_USERNAME_EDEFAULT == null ? dbUsername != null : !DB_USERNAME_EDEFAULT.equals(dbUsername);
			case ServicePIMPackage.RES_TFUL_SERVICE_PIM__DB_PASSWORD:
				return DB_PASSWORD_EDEFAULT == null ? dbPassword != null : !DB_PASSWORD_EDEFAULT.equals(dbPassword);
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
		result.append(", outputPath: ");
		result.append(outputPath);
		result.append(", dbIP: ");
		result.append(dbIP);
		result.append(", dbPort: ");
		result.append(dbPort);
		result.append(", dbUsername: ");
		result.append(dbUsername);
		result.append(", dbPassword: ");
		result.append(dbPassword);
		result.append(')');
		return result.toString();
	}

} //RESTfulServicePIMImpl
