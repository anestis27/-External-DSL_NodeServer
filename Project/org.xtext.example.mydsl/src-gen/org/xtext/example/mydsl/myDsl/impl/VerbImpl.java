/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Rule;
import org.xtext.example.mydsl.myDsl.Verb;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verb</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.VerbImpl#getVerb <em>Verb</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.VerbImpl#getQa <em>Qa</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.VerbImpl#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VerbImpl extends MemberImpl implements Verb
{
  /**
   * The default value of the '{@link #getVerb() <em>Verb</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVerb()
   * @generated
   * @ordered
   */
  protected static final String VERB_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVerb() <em>Verb</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVerb()
   * @generated
   * @ordered
   */
  protected String verb = VERB_EDEFAULT;

  /**
   * The default value of the '{@link #getQa() <em>Qa</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQa()
   * @generated
   * @ordered
   */
  protected static final String QA_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getQa() <em>Qa</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQa()
   * @generated
   * @ordered
   */
  protected String qa = QA_EDEFAULT;

  /**
   * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRules()
   * @generated
   * @ordered
   */
  protected EList<Rule> rules;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VerbImpl()
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
    return MyDslPackage.Literals.VERB;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVerb()
  {
    return verb;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVerb(String newVerb)
  {
    String oldVerb = verb;
    verb = newVerb;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.VERB__VERB, oldVerb, verb));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getQa()
  {
    return qa;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQa(String newQa)
  {
    String oldQa = qa;
    qa = newQa;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.VERB__QA, oldQa, qa));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Rule> getRules()
  {
    if (rules == null)
    {
      rules = new EObjectContainmentEList<Rule>(Rule.class, this, MyDslPackage.VERB__RULES);
    }
    return rules;
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
      case MyDslPackage.VERB__RULES:
        return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.VERB__VERB:
        return getVerb();
      case MyDslPackage.VERB__QA:
        return getQa();
      case MyDslPackage.VERB__RULES:
        return getRules();
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
      case MyDslPackage.VERB__VERB:
        setVerb((String)newValue);
        return;
      case MyDslPackage.VERB__QA:
        setQa((String)newValue);
        return;
      case MyDslPackage.VERB__RULES:
        getRules().clear();
        getRules().addAll((Collection<? extends Rule>)newValue);
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
      case MyDslPackage.VERB__VERB:
        setVerb(VERB_EDEFAULT);
        return;
      case MyDslPackage.VERB__QA:
        setQa(QA_EDEFAULT);
        return;
      case MyDslPackage.VERB__RULES:
        getRules().clear();
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
      case MyDslPackage.VERB__VERB:
        return VERB_EDEFAULT == null ? verb != null : !VERB_EDEFAULT.equals(verb);
      case MyDslPackage.VERB__QA:
        return QA_EDEFAULT == null ? qa != null : !QA_EDEFAULT.equals(qa);
      case MyDslPackage.VERB__RULES:
        return rules != null && !rules.isEmpty();
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
    result.append(" (verb: ");
    result.append(verb);
    result.append(", qa: ");
    result.append(qa);
    result.append(')');
    return result.toString();
  }

} //VerbImpl
