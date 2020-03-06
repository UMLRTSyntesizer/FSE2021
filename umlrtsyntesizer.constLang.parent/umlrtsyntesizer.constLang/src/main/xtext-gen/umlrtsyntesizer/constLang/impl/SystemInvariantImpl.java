/**
 * generated by Xtext 2.19.0
 */
package umlrtsyntesizer.constLang.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import umlrtsyntesizer.constLang.ConstLangPackage;
import umlrtsyntesizer.constLang.Expression;
import umlrtsyntesizer.constLang.SystemInvariant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Invariant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link umlrtsyntesizer.constLang.impl.SystemInvariantImpl#getName <em>Name</em>}</li>
 *   <li>{@link umlrtsyntesizer.constLang.impl.SystemInvariantImpl#getInvariantExp <em>Invariant Exp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemInvariantImpl extends MinimalEObjectImpl.Container implements SystemInvariant
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
   * The cached value of the '{@link #getInvariantExp() <em>Invariant Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInvariantExp()
   * @generated
   * @ordered
   */
  protected Expression invariantExp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SystemInvariantImpl()
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
    return ConstLangPackage.Literals.SYSTEM_INVARIANT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ConstLangPackage.SYSTEM_INVARIANT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getInvariantExp()
  {
    return invariantExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInvariantExp(Expression newInvariantExp, NotificationChain msgs)
  {
    Expression oldInvariantExp = invariantExp;
    invariantExp = newInvariantExp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConstLangPackage.SYSTEM_INVARIANT__INVARIANT_EXP, oldInvariantExp, newInvariantExp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInvariantExp(Expression newInvariantExp)
  {
    if (newInvariantExp != invariantExp)
    {
      NotificationChain msgs = null;
      if (invariantExp != null)
        msgs = ((InternalEObject)invariantExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConstLangPackage.SYSTEM_INVARIANT__INVARIANT_EXP, null, msgs);
      if (newInvariantExp != null)
        msgs = ((InternalEObject)newInvariantExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConstLangPackage.SYSTEM_INVARIANT__INVARIANT_EXP, null, msgs);
      msgs = basicSetInvariantExp(newInvariantExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ConstLangPackage.SYSTEM_INVARIANT__INVARIANT_EXP, newInvariantExp, newInvariantExp));
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
      case ConstLangPackage.SYSTEM_INVARIANT__INVARIANT_EXP:
        return basicSetInvariantExp(null, msgs);
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
      case ConstLangPackage.SYSTEM_INVARIANT__NAME:
        return getName();
      case ConstLangPackage.SYSTEM_INVARIANT__INVARIANT_EXP:
        return getInvariantExp();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ConstLangPackage.SYSTEM_INVARIANT__NAME:
        setName((String)newValue);
        return;
      case ConstLangPackage.SYSTEM_INVARIANT__INVARIANT_EXP:
        setInvariantExp((Expression)newValue);
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
      case ConstLangPackage.SYSTEM_INVARIANT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ConstLangPackage.SYSTEM_INVARIANT__INVARIANT_EXP:
        setInvariantExp((Expression)null);
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
      case ConstLangPackage.SYSTEM_INVARIANT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ConstLangPackage.SYSTEM_INVARIANT__INVARIANT_EXP:
        return invariantExp != null;
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
    result.append(')');
    return result.toString();
  }

} //SystemInvariantImpl
