/**
 * generated by Xtext 2.19.0
 */
package umlrtsyntesizer.execTraces.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import umlrtsyntesizer.execTraces.Edge;
import umlrtsyntesizer.execTraces.ExecTracesPackage;
import umlrtsyntesizer.execTraces.Node;
import umlrtsyntesizer.execTraces.StateStatus;
import umlrtsyntesizer.execTraces.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link umlrtsyntesizer.execTraces.impl.NodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link umlrtsyntesizer.execTraces.impl.NodeImpl#getId <em>Id</em>}</li>
 *   <li>{@link umlrtsyntesizer.execTraces.impl.NodeImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link umlrtsyntesizer.execTraces.impl.NodeImpl#getVarData <em>Var Data</em>}</li>
 *   <li>{@link umlrtsyntesizer.execTraces.impl.NodeImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link umlrtsyntesizer.execTraces.impl.NodeImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link umlrtsyntesizer.execTraces.impl.NodeImpl#getOutgoingEdges <em>Outgoing Edges</em>}</li>
 *   <li>{@link umlrtsyntesizer.execTraces.impl.NodeImpl#getIncomingEdges <em>Incoming Edges</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends MinimalEObjectImpl.Container implements Node
{
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
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final int ID_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected int id = ID_EDEFAULT;

  /**
   * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLevel()
   * @generated
   * @ordered
   */
  protected static final int LEVEL_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLevel()
   * @generated
   * @ordered
   */
  protected int level = LEVEL_EDEFAULT;

  /**
   * The cached value of the '{@link #getVarData() <em>Var Data</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarData()
   * @generated
   * @ordered
   */
  protected EList<Variable> varData;

  /**
   * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatus()
   * @generated
   * @ordered
   */
  protected static final StateStatus STATUS_EDEFAULT = StateStatus.NEW;

  /**
   * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatus()
   * @generated
   * @ordered
   */
  protected StateStatus status = STATUS_EDEFAULT;

  /**
   * The default value of the '{@link #getConstraints() <em>Constraints</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraints()
   * @generated
   * @ordered
   */
  protected static final String CONSTRAINTS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraints()
   * @generated
   * @ordered
   */
  protected String constraints = CONSTRAINTS_EDEFAULT;

  /**
   * The cached value of the '{@link #getOutgoingEdges() <em>Outgoing Edges</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutgoingEdges()
   * @generated
   * @ordered
   */
  protected EList<Edge> outgoingEdges;

  /**
   * The cached value of the '{@link #getIncomingEdges() <em>Incoming Edges</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncomingEdges()
   * @generated
   * @ordered
   */
  protected EList<Edge> incomingEdges;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NodeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ExecTracesPackage.Literals.NODE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExecTracesPackage.NODE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(int newId)
  {
    int oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExecTracesPackage.NODE__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getLevel()
  {
    return level;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLevel(int newLevel)
  {
    int oldLevel = level;
    level = newLevel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExecTracesPackage.NODE__LEVEL, oldLevel, level));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Variable> getVarData()
  {
    if (varData == null)
    {
      varData = new EObjectContainmentEList<Variable>(Variable.class, this, ExecTracesPackage.NODE__VAR_DATA);
    }
    return varData;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateStatus getStatus()
  {
    return status;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatus(StateStatus newStatus)
  {
    StateStatus oldStatus = status;
    status = newStatus == null ? STATUS_EDEFAULT : newStatus;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExecTracesPackage.NODE__STATUS, oldStatus, status));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getConstraints()
  {
    return constraints;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstraints(String newConstraints)
  {
    String oldConstraints = constraints;
    constraints = newConstraints;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExecTracesPackage.NODE__CONSTRAINTS, oldConstraints, constraints));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Edge> getOutgoingEdges()
  {
    if (outgoingEdges == null)
    {
      outgoingEdges = new EObjectResolvingEList<Edge>(Edge.class, this, ExecTracesPackage.NODE__OUTGOING_EDGES);
    }
    return outgoingEdges;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Edge> getIncomingEdges()
  {
    if (incomingEdges == null)
    {
      incomingEdges = new EObjectResolvingEList<Edge>(Edge.class, this, ExecTracesPackage.NODE__INCOMING_EDGES);
    }
    return incomingEdges;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ExecTracesPackage.NODE__VAR_DATA:
        return ((InternalEList<?>)getVarData()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ExecTracesPackage.NODE__NAME:
        return getName();
      case ExecTracesPackage.NODE__ID:
        return getId();
      case ExecTracesPackage.NODE__LEVEL:
        return getLevel();
      case ExecTracesPackage.NODE__VAR_DATA:
        return getVarData();
      case ExecTracesPackage.NODE__STATUS:
        return getStatus();
      case ExecTracesPackage.NODE__CONSTRAINTS:
        return getConstraints();
      case ExecTracesPackage.NODE__OUTGOING_EDGES:
        return getOutgoingEdges();
      case ExecTracesPackage.NODE__INCOMING_EDGES:
        return getIncomingEdges();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ExecTracesPackage.NODE__NAME:
        setName((String)newValue);
        return;
      case ExecTracesPackage.NODE__ID:
        setId((Integer)newValue);
        return;
      case ExecTracesPackage.NODE__LEVEL:
        setLevel((Integer)newValue);
        return;
      case ExecTracesPackage.NODE__VAR_DATA:
        getVarData().clear();
        getVarData().addAll((Collection<? extends Variable>)newValue);
        return;
      case ExecTracesPackage.NODE__STATUS:
        setStatus((StateStatus)newValue);
        return;
      case ExecTracesPackage.NODE__CONSTRAINTS:
        setConstraints((String)newValue);
        return;
      case ExecTracesPackage.NODE__OUTGOING_EDGES:
        getOutgoingEdges().clear();
        getOutgoingEdges().addAll((Collection<? extends Edge>)newValue);
        return;
      case ExecTracesPackage.NODE__INCOMING_EDGES:
        getIncomingEdges().clear();
        getIncomingEdges().addAll((Collection<? extends Edge>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ExecTracesPackage.NODE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ExecTracesPackage.NODE__ID:
        setId(ID_EDEFAULT);
        return;
      case ExecTracesPackage.NODE__LEVEL:
        setLevel(LEVEL_EDEFAULT);
        return;
      case ExecTracesPackage.NODE__VAR_DATA:
        getVarData().clear();
        return;
      case ExecTracesPackage.NODE__STATUS:
        setStatus(STATUS_EDEFAULT);
        return;
      case ExecTracesPackage.NODE__CONSTRAINTS:
        setConstraints(CONSTRAINTS_EDEFAULT);
        return;
      case ExecTracesPackage.NODE__OUTGOING_EDGES:
        getOutgoingEdges().clear();
        return;
      case ExecTracesPackage.NODE__INCOMING_EDGES:
        getIncomingEdges().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ExecTracesPackage.NODE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ExecTracesPackage.NODE__ID:
        return id != ID_EDEFAULT;
      case ExecTracesPackage.NODE__LEVEL:
        return level != LEVEL_EDEFAULT;
      case ExecTracesPackage.NODE__VAR_DATA:
        return varData != null && !varData.isEmpty();
      case ExecTracesPackage.NODE__STATUS:
        return status != STATUS_EDEFAULT;
      case ExecTracesPackage.NODE__CONSTRAINTS:
        return CONSTRAINTS_EDEFAULT == null ? constraints != null : !CONSTRAINTS_EDEFAULT.equals(constraints);
      case ExecTracesPackage.NODE__OUTGOING_EDGES:
        return outgoingEdges != null && !outgoingEdges.isEmpty();
      case ExecTracesPackage.NODE__INCOMING_EDGES:
        return incomingEdges != null && !incomingEdges.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", id: ");
    result.append(id);
    result.append(", level: ");
    result.append(level);
    result.append(", status: ");
    result.append(status);
    result.append(", constraints: ");
    result.append(constraints);
    result.append(')');
    return result.toString();
  }

} //NodeImpl
