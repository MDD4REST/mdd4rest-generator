/**
 */
package ActivityDiagramMetamodel.impl;

import ActivityDiagramMetamodel.ActivityDiagramMetamodelPackage;
import ActivityDiagramMetamodel.Aggregate;

import ActivityDiagramMetamodel.CommandAction;
import ActivityDiagramMetamodel.EventAction;
import ActivityDiagramMetamodel.QueryAction;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ActivityDiagramMetamodel.impl.AggregateImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link ActivityDiagramMetamodel.impl.AggregateImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link ActivityDiagramMetamodel.impl.AggregateImpl#getQuery <em>Query</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AggregateImpl extends ObjectNodeImpl implements Aggregate {
	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<EventAction> events;
	/**
	 * The cached value of the '{@link #getCommand() <em>Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected CommandAction command;
	/**
	 * The cached value of the '{@link #getQuery() <em>Query</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected QueryAction query;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AggregateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityDiagramMetamodelPackage.Literals.AGGREGATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EventAction> getEvents() {
		if (events == null) {
			events = new EObjectWithInverseResolvingEList<EventAction>(EventAction.class, this, ActivityDiagramMetamodelPackage.AGGREGATE__EVENTS, ActivityDiagramMetamodelPackage.EVENT_ACTION__AGGREGATE);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommandAction getCommand() {
		if (command != null && command.eIsProxy()) {
			InternalEObject oldCommand = (InternalEObject)command;
			command = (CommandAction)eResolveProxy(oldCommand);
			if (command != oldCommand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivityDiagramMetamodelPackage.AGGREGATE__COMMAND, oldCommand, command));
			}
		}
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandAction basicGetCommand() {
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommand(CommandAction newCommand, NotificationChain msgs) {
		CommandAction oldCommand = command;
		command = newCommand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivityDiagramMetamodelPackage.AGGREGATE__COMMAND, oldCommand, newCommand);
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
	public void setCommand(CommandAction newCommand) {
		if (newCommand != command) {
			NotificationChain msgs = null;
			if (command != null)
				msgs = ((InternalEObject)command).eInverseRemove(this, ActivityDiagramMetamodelPackage.COMMAND_ACTION__AGGREGATE, CommandAction.class, msgs);
			if (newCommand != null)
				msgs = ((InternalEObject)newCommand).eInverseAdd(this, ActivityDiagramMetamodelPackage.COMMAND_ACTION__AGGREGATE, CommandAction.class, msgs);
			msgs = basicSetCommand(newCommand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityDiagramMetamodelPackage.AGGREGATE__COMMAND, newCommand, newCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QueryAction getQuery() {
		if (query != null && query.eIsProxy()) {
			InternalEObject oldQuery = (InternalEObject)query;
			query = (QueryAction)eResolveProxy(oldQuery);
			if (query != oldQuery) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivityDiagramMetamodelPackage.AGGREGATE__QUERY, oldQuery, query));
			}
		}
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryAction basicGetQuery() {
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuery(QueryAction newQuery, NotificationChain msgs) {
		QueryAction oldQuery = query;
		query = newQuery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivityDiagramMetamodelPackage.AGGREGATE__QUERY, oldQuery, newQuery);
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
	public void setQuery(QueryAction newQuery) {
		if (newQuery != query) {
			NotificationChain msgs = null;
			if (query != null)
				msgs = ((InternalEObject)query).eInverseRemove(this, ActivityDiagramMetamodelPackage.QUERY_ACTION__AGGREGATE, QueryAction.class, msgs);
			if (newQuery != null)
				msgs = ((InternalEObject)newQuery).eInverseAdd(this, ActivityDiagramMetamodelPackage.QUERY_ACTION__AGGREGATE, QueryAction.class, msgs);
			msgs = basicSetQuery(newQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityDiagramMetamodelPackage.AGGREGATE__QUERY, newQuery, newQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivityDiagramMetamodelPackage.AGGREGATE__EVENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEvents()).basicAdd(otherEnd, msgs);
			case ActivityDiagramMetamodelPackage.AGGREGATE__COMMAND:
				if (command != null)
					msgs = ((InternalEObject)command).eInverseRemove(this, ActivityDiagramMetamodelPackage.COMMAND_ACTION__AGGREGATE, CommandAction.class, msgs);
				return basicSetCommand((CommandAction)otherEnd, msgs);
			case ActivityDiagramMetamodelPackage.AGGREGATE__QUERY:
				if (query != null)
					msgs = ((InternalEObject)query).eInverseRemove(this, ActivityDiagramMetamodelPackage.QUERY_ACTION__AGGREGATE, QueryAction.class, msgs);
				return basicSetQuery((QueryAction)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivityDiagramMetamodelPackage.AGGREGATE__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
			case ActivityDiagramMetamodelPackage.AGGREGATE__COMMAND:
				return basicSetCommand(null, msgs);
			case ActivityDiagramMetamodelPackage.AGGREGATE__QUERY:
				return basicSetQuery(null, msgs);
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
			case ActivityDiagramMetamodelPackage.AGGREGATE__EVENTS:
				return getEvents();
			case ActivityDiagramMetamodelPackage.AGGREGATE__COMMAND:
				if (resolve) return getCommand();
				return basicGetCommand();
			case ActivityDiagramMetamodelPackage.AGGREGATE__QUERY:
				if (resolve) return getQuery();
				return basicGetQuery();
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
			case ActivityDiagramMetamodelPackage.AGGREGATE__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends EventAction>)newValue);
				return;
			case ActivityDiagramMetamodelPackage.AGGREGATE__COMMAND:
				setCommand((CommandAction)newValue);
				return;
			case ActivityDiagramMetamodelPackage.AGGREGATE__QUERY:
				setQuery((QueryAction)newValue);
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
			case ActivityDiagramMetamodelPackage.AGGREGATE__EVENTS:
				getEvents().clear();
				return;
			case ActivityDiagramMetamodelPackage.AGGREGATE__COMMAND:
				setCommand((CommandAction)null);
				return;
			case ActivityDiagramMetamodelPackage.AGGREGATE__QUERY:
				setQuery((QueryAction)null);
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
			case ActivityDiagramMetamodelPackage.AGGREGATE__EVENTS:
				return events != null && !events.isEmpty();
			case ActivityDiagramMetamodelPackage.AGGREGATE__COMMAND:
				return command != null;
			case ActivityDiagramMetamodelPackage.AGGREGATE__QUERY:
				return query != null;
		}
		return super.eIsSet(featureID);
	}

} //AggregateImpl
