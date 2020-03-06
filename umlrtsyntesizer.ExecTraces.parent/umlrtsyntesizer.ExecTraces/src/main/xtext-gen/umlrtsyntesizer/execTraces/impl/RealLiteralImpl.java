/**
 * generated by Xtext 2.19.0
 */
package umlrtsyntesizer.execTraces.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import umlrtsyntesizer.execTraces.ExecTracesPackage;
import umlrtsyntesizer.execTraces.RealLiteral;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Real Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link umlrtsyntesizer.execTraces.impl.RealLiteralImpl#getIntPart <em>Int Part</em>}</li>
 *   <li>{@link umlrtsyntesizer.execTraces.impl.RealLiteralImpl#getDecimalPart <em>Decimal Part</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RealLiteralImpl extends LiteralImpl implements RealLiteral
{
  /**
   * The default value of the '{@link #getIntPart() <em>Int Part</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntPart()
   * @generated
   * @ordered
   */
  protected static final int INT_PART_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getIntPart() <em>Int Part</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntPart()
   * @generated
   * @ordered
   */
  protected int intPart = INT_PART_EDEFAULT;

  /**
   * The default value of the '{@link #getDecimalPart() <em>Decimal Part</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecimalPart()
   * @generated
   * @ordered
   */
  protected static final int DECIMAL_PART_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDecimalPart() <em>Decimal Part</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecimalPart()
   * @generated
   * @ordered
   */
  protected int decimalPart = DECIMAL_PART_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RealLiteralImpl()
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
    return ExecTracesPackage.Literals.REAL_LITERAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getIntPart()
  {
    return intPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIntPart(int newIntPart)
  {
    int oldIntPart = intPart;
    intPart = newIntPart;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExecTracesPackage.REAL_LITERAL__INT_PART, oldIntPart, intPart));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDecimalPart()
  {
    return decimalPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDecimalPart(int newDecimalPart)
  {
    int oldDecimalPart = decimalPart;
    decimalPart = newDecimalPart;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExecTracesPackage.REAL_LITERAL__DECIMAL_PART, oldDecimalPart, decimalPart));
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
      case ExecTracesPackage.REAL_LITERAL__INT_PART:
        return getIntPart();
      case ExecTracesPackage.REAL_LITERAL__DECIMAL_PART:
        return getDecimalPart();
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
      case ExecTracesPackage.REAL_LITERAL__INT_PART:
        setIntPart((Integer)newValue);
        return;
      case ExecTracesPackage.REAL_LITERAL__DECIMAL_PART:
        setDecimalPart((Integer)newValue);
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
      case ExecTracesPackage.REAL_LITERAL__INT_PART:
        setIntPart(INT_PART_EDEFAULT);
        return;
      case ExecTracesPackage.REAL_LITERAL__DECIMAL_PART:
        setDecimalPart(DECIMAL_PART_EDEFAULT);
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
      case ExecTracesPackage.REAL_LITERAL__INT_PART:
        return intPart != INT_PART_EDEFAULT;
      case ExecTracesPackage.REAL_LITERAL__DECIMAL_PART:
        return decimalPart != DECIMAL_PART_EDEFAULT;
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
    result.append(" (intPart: ");
    result.append(intPart);
    result.append(", decimalPart: ");
    result.append(decimalPart);
    result.append(')');
    return result.toString();
  }

} //RealLiteralImpl
