/**
 */
package ServicePIM.impl;

import ServicePIM.ApplicationType;
import ServicePIM.Config;
import ServicePIM.ServicePIMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ServicePIM.impl.ConfigImpl#getBaseName <em>Base Name</em>}</li>
 *   <li>{@link ServicePIM.impl.ConfigImpl#getApplicationType <em>Application Type</em>}</li>
 *   <li>{@link ServicePIM.impl.ConfigImpl#getServicePort <em>Service Port</em>}</li>
 *   <li>{@link ServicePIM.impl.ConfigImpl#getDbIP <em>Db IP</em>}</li>
 *   <li>{@link ServicePIM.impl.ConfigImpl#getDbPort <em>Db Port</em>}</li>
 *   <li>{@link ServicePIM.impl.ConfigImpl#getDbUsername <em>Db Username</em>}</li>
 *   <li>{@link ServicePIM.impl.ConfigImpl#getDbPassword <em>Db Password</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigImpl extends MinimalEObjectImpl.Container implements Config {
	/**
	 * The default value of the '{@link #getBaseName() <em>Base Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseName()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseName() <em>Base Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseName()
	 * @generated
	 * @ordered
	 */
	protected String baseName = BASE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getApplicationType() <em>Application Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationType()
	 * @generated
	 * @ordered
	 */
	protected static final ApplicationType APPLICATION_TYPE_EDEFAULT = ApplicationType.MICROSERVICE;

	/**
	 * The cached value of the '{@link #getApplicationType() <em>Application Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationType()
	 * @generated
	 * @ordered
	 */
	protected ApplicationType applicationType = APPLICATION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getServicePort() <em>Service Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicePort()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServicePort() <em>Service Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServicePort()
	 * @generated
	 * @ordered
	 */
	protected String servicePort = SERVICE_PORT_EDEFAULT;

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
	protected ConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePIMPackage.Literals.CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBaseName() {
		return baseName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBaseName(String newBaseName) {
		String oldBaseName = baseName;
		baseName = newBaseName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePIMPackage.CONFIG__BASE_NAME, oldBaseName, baseName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplicationType getApplicationType() {
		return applicationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApplicationType(ApplicationType newApplicationType) {
		ApplicationType oldApplicationType = applicationType;
		applicationType = newApplicationType == null ? APPLICATION_TYPE_EDEFAULT : newApplicationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePIMPackage.CONFIG__APPLICATION_TYPE, oldApplicationType, applicationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServicePort() {
		return servicePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServicePort(String newServicePort) {
		String oldServicePort = servicePort;
		servicePort = newServicePort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePIMPackage.CONFIG__SERVICE_PORT, oldServicePort, servicePort));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePIMPackage.CONFIG__DB_IP, oldDbIP, dbIP));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePIMPackage.CONFIG__DB_PORT, oldDbPort, dbPort));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePIMPackage.CONFIG__DB_USERNAME, oldDbUsername, dbUsername));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePIMPackage.CONFIG__DB_PASSWORD, oldDbPassword, dbPassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicePIMPackage.CONFIG__BASE_NAME:
				return getBaseName();
			case ServicePIMPackage.CONFIG__APPLICATION_TYPE:
				return getApplicationType();
			case ServicePIMPackage.CONFIG__SERVICE_PORT:
				return getServicePort();
			case ServicePIMPackage.CONFIG__DB_IP:
				return getDbIP();
			case ServicePIMPackage.CONFIG__DB_PORT:
				return getDbPort();
			case ServicePIMPackage.CONFIG__DB_USERNAME:
				return getDbUsername();
			case ServicePIMPackage.CONFIG__DB_PASSWORD:
				return getDbPassword();
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
			case ServicePIMPackage.CONFIG__BASE_NAME:
				setBaseName((String)newValue);
				return;
			case ServicePIMPackage.CONFIG__APPLICATION_TYPE:
				setApplicationType((ApplicationType)newValue);
				return;
			case ServicePIMPackage.CONFIG__SERVICE_PORT:
				setServicePort((String)newValue);
				return;
			case ServicePIMPackage.CONFIG__DB_IP:
				setDbIP((String)newValue);
				return;
			case ServicePIMPackage.CONFIG__DB_PORT:
				setDbPort((String)newValue);
				return;
			case ServicePIMPackage.CONFIG__DB_USERNAME:
				setDbUsername((String)newValue);
				return;
			case ServicePIMPackage.CONFIG__DB_PASSWORD:
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
			case ServicePIMPackage.CONFIG__BASE_NAME:
				setBaseName(BASE_NAME_EDEFAULT);
				return;
			case ServicePIMPackage.CONFIG__APPLICATION_TYPE:
				setApplicationType(APPLICATION_TYPE_EDEFAULT);
				return;
			case ServicePIMPackage.CONFIG__SERVICE_PORT:
				setServicePort(SERVICE_PORT_EDEFAULT);
				return;
			case ServicePIMPackage.CONFIG__DB_IP:
				setDbIP(DB_IP_EDEFAULT);
				return;
			case ServicePIMPackage.CONFIG__DB_PORT:
				setDbPort(DB_PORT_EDEFAULT);
				return;
			case ServicePIMPackage.CONFIG__DB_USERNAME:
				setDbUsername(DB_USERNAME_EDEFAULT);
				return;
			case ServicePIMPackage.CONFIG__DB_PASSWORD:
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
			case ServicePIMPackage.CONFIG__BASE_NAME:
				return BASE_NAME_EDEFAULT == null ? baseName != null : !BASE_NAME_EDEFAULT.equals(baseName);
			case ServicePIMPackage.CONFIG__APPLICATION_TYPE:
				return applicationType != APPLICATION_TYPE_EDEFAULT;
			case ServicePIMPackage.CONFIG__SERVICE_PORT:
				return SERVICE_PORT_EDEFAULT == null ? servicePort != null : !SERVICE_PORT_EDEFAULT.equals(servicePort);
			case ServicePIMPackage.CONFIG__DB_IP:
				return DB_IP_EDEFAULT == null ? dbIP != null : !DB_IP_EDEFAULT.equals(dbIP);
			case ServicePIMPackage.CONFIG__DB_PORT:
				return DB_PORT_EDEFAULT == null ? dbPort != null : !DB_PORT_EDEFAULT.equals(dbPort);
			case ServicePIMPackage.CONFIG__DB_USERNAME:
				return DB_USERNAME_EDEFAULT == null ? dbUsername != null : !DB_USERNAME_EDEFAULT.equals(dbUsername);
			case ServicePIMPackage.CONFIG__DB_PASSWORD:
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
		result.append(" (baseName: ");
		result.append(baseName);
		result.append(", applicationType: ");
		result.append(applicationType);
		result.append(", servicePort: ");
		result.append(servicePort);
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

} //ConfigImpl
