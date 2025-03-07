/**
 * generated by Xtext 2.19.0
 */
package umlrtsyntesizer.execTraces;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link umlrtsyntesizer.execTraces.Edge#getSource <em>Source</em>}</li>
 *   <li>{@link umlrtsyntesizer.execTraces.Edge#getDestination <em>Destination</em>}</li>
 *   <li>{@link umlrtsyntesizer.execTraces.Edge#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link umlrtsyntesizer.execTraces.Edge#getActions <em>Actions</em>}</li>
 *   <li>{@link umlrtsyntesizer.execTraces.Edge#getStatus <em>Status</em>}</li>
 *   <li>{@link umlrtsyntesizer.execTraces.Edge#getGuard <em>Guard</em>}</li>
 * </ul>
 *
 * @see umlrtsyntesizer.execTraces.ExecTracesPackage#getEdge()
 * @model
 * @generated
 */
public interface Edge extends EObject
{
  /**
   * Returns the value of the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference.
   * @see #setSource(Node)
   * @see umlrtsyntesizer.execTraces.ExecTracesPackage#getEdge_Source()
   * @model
   * @generated
   */
  Node getSource();

  /**
   * Sets the value of the '{@link umlrtsyntesizer.execTraces.Edge#getSource <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' reference.
   * @see #getSource()
   * @generated
   */
  void setSource(Node value);

  /**
   * Returns the value of the '<em><b>Destination</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Destination</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Destination</em>' reference.
   * @see #setDestination(Node)
   * @see umlrtsyntesizer.execTraces.ExecTracesPackage#getEdge_Destination()
   * @model
   * @generated
   */
  Node getDestination();

  /**
   * Sets the value of the '{@link umlrtsyntesizer.execTraces.Edge#getDestination <em>Destination</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Destination</em>' reference.
   * @see #getDestination()
   * @generated
   */
  void setDestination(Node value);

  /**
   * Returns the value of the '<em><b>Trigger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trigger</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trigger</em>' attribute.
   * @see #setTrigger(String)
   * @see umlrtsyntesizer.execTraces.ExecTracesPackage#getEdge_Trigger()
   * @model
   * @generated
   */
  String getTrigger();

  /**
   * Sets the value of the '{@link umlrtsyntesizer.execTraces.Edge#getTrigger <em>Trigger</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trigger</em>' attribute.
   * @see #getTrigger()
   * @generated
   */
  void setTrigger(String value);

  /**
   * Returns the value of the '<em><b>Actions</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actions</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' attribute.
   * @see #setActions(String)
   * @see umlrtsyntesizer.execTraces.ExecTracesPackage#getEdge_Actions()
   * @model
   * @generated
   */
  String getActions();

  /**
   * Sets the value of the '{@link umlrtsyntesizer.execTraces.Edge#getActions <em>Actions</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Actions</em>' attribute.
   * @see #getActions()
   * @generated
   */
  void setActions(String value);

  /**
   * Returns the value of the '<em><b>Status</b></em>' attribute.
   * The literals are from the enumeration {@link umlrtsyntesizer.execTraces.TransStatus}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Status</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Status</em>' attribute.
   * @see umlrtsyntesizer.execTraces.TransStatus
   * @see #setStatus(TransStatus)
   * @see umlrtsyntesizer.execTraces.ExecTracesPackage#getEdge_Status()
   * @model
   * @generated
   */
  TransStatus getStatus();

  /**
   * Sets the value of the '{@link umlrtsyntesizer.execTraces.Edge#getStatus <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Status</em>' attribute.
   * @see umlrtsyntesizer.execTraces.TransStatus
   * @see #getStatus()
   * @generated
   */
  void setStatus(TransStatus value);

  /**
   * Returns the value of the '<em><b>Guard</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Guard</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Guard</em>' attribute.
   * @see #setGuard(String)
   * @see umlrtsyntesizer.execTraces.ExecTracesPackage#getEdge_Guard()
   * @model
   * @generated
   */
  String getGuard();

  /**
   * Sets the value of the '{@link umlrtsyntesizer.execTraces.Edge#getGuard <em>Guard</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Guard</em>' attribute.
   * @see #getGuard()
   * @generated
   */
  void setGuard(String value);

} // Edge
