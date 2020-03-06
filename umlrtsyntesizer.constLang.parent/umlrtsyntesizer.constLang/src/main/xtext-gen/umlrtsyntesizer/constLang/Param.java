/**
 * generated by Xtext 2.19.0
 */
package umlrtsyntesizer.constLang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlrtsyntesizer.constLang.Param#getName <em>Name</em>}</li>
 *   <li>{@link umlrtsyntesizer.constLang.Param#getPropertyType <em>Property Type</em>}</li>
 * </ul>
 *
 * @see umlrtsyntesizer.constLang.ConstLangPackage#getParam()
 * @model
 * @generated
 */
public interface Param extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see umlrtsyntesizer.constLang.ConstLangPackage#getParam_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link umlrtsyntesizer.constLang.Param#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Property Type</b></em>' attribute.
   * The literals are from the enumeration {@link umlrtsyntesizer.constLang.VarType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property Type</em>' attribute.
   * @see umlrtsyntesizer.constLang.VarType
   * @see #setPropertyType(VarType)
   * @see umlrtsyntesizer.constLang.ConstLangPackage#getParam_PropertyType()
   * @model
   * @generated
   */
  VarType getPropertyType();

  /**
   * Sets the value of the '{@link umlrtsyntesizer.constLang.Param#getPropertyType <em>Property Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property Type</em>' attribute.
   * @see umlrtsyntesizer.constLang.VarType
   * @see #getPropertyType()
   * @generated
   */
  void setPropertyType(VarType value);

} // Param
