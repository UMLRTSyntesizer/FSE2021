/**
 * generated by Xtext 2.19.0
 */
package umlrtsyntesizer.constLang.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import umlrtsyntesizer.constLang.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConstLangFactoryImpl extends EFactoryImpl implements ConstLangFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ConstLangFactory init()
  {
    try
    {
      ConstLangFactory theConstLangFactory = (ConstLangFactory)EPackage.Registry.INSTANCE.getEFactory(ConstLangPackage.eNS_URI);
      if (theConstLangFactory != null)
      {
        return theConstLangFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ConstLangFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstLangFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ConstLangPackage.CONTEXT: return createContext();
      case ConstLangPackage.INIT: return createInit();
      case ConstLangPackage.SYSTEM_INVARIANT: return createSystemInvariant();
      case ConstLangPackage.MESSAGE_CONSTRAINT: return createMessageConstraint();
      case ConstLangPackage.RANGE: return createRange();
      case ConstLangPackage.VALUE: return createValue();
      case ConstLangPackage.REAL_LITERAL: return createRealLiteral();
      case ConstLangPackage.ATTRIBUTE: return createAttribute();
      case ConstLangPackage.PARAM: return createParam();
      case ConstLangPackage.EXPRESSION: return createExpression();
      case ConstLangPackage.NOT_BOOLEAN_EXPRESSION: return createNotBooleanExpression();
      case ConstLangPackage.PARAMETER: return createParameter();
      case ConstLangPackage.IDENTIFIER: return createIdentifier();
      case ConstLangPackage.LITERAL: return createLiteral();
      case ConstLangPackage.INT_LITERAL: return createIntLiteral();
      case ConstLangPackage.BOOL_LITERAL: return createBoolLiteral();
      case ConstLangPackage.ASSIGN: return createAssign();
      case ConstLangPackage.IMPLIE: return createImplie();
      case ConstLangPackage.OR_EXPRESSION: return createOrExpression();
      case ConstLangPackage.AND_EXPRESSION: return createAndExpression();
      case ConstLangPackage.GT: return createGT();
      case ConstLangPackage.LT: return createLT();
      case ConstLangPackage.GE: return createGE();
      case ConstLangPackage.LE: return createLE();
      case ConstLangPackage.EQ: return createEQ();
      case ConstLangPackage.NE: return createNE();
      case ConstLangPackage.ADDITION: return createAddition();
      case ConstLangPackage.MINUS: return createMinus();
      case ConstLangPackage.MULTIPLICATION: return createMultiplication();
      case ConstLangPackage.DIVIDE: return createDivide();
      case ConstLangPackage.MODULO: return createModulo();
      case ConstLangPackage.UNARY_EXPRESSION: return createUnaryExpression();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ConstLangPackage.VAR_TYPE:
        return createVarTypeFromString(eDataType, initialValue);
      case ConstLangPackage.WHERE_TO_APPLY_ENUM:
        return createWhereToApplyEnumFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ConstLangPackage.VAR_TYPE:
        return convertVarTypeToString(eDataType, instanceValue);
      case ConstLangPackage.WHERE_TO_APPLY_ENUM:
        return convertWhereToApplyEnumToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Context createContext()
  {
    ContextImpl context = new ContextImpl();
    return context;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Init createInit()
  {
    InitImpl init = new InitImpl();
    return init;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemInvariant createSystemInvariant()
  {
    SystemInvariantImpl systemInvariant = new SystemInvariantImpl();
    return systemInvariant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageConstraint createMessageConstraint()
  {
    MessageConstraintImpl messageConstraint = new MessageConstraintImpl();
    return messageConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Range createRange()
  {
    RangeImpl range = new RangeImpl();
    return range;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value createValue()
  {
    ValueImpl value = new ValueImpl();
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RealLiteral createRealLiteral()
  {
    RealLiteralImpl realLiteral = new RealLiteralImpl();
    return realLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Param createParam()
  {
    ParamImpl param = new ParamImpl();
    return param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotBooleanExpression createNotBooleanExpression()
  {
    NotBooleanExpressionImpl notBooleanExpression = new NotBooleanExpressionImpl();
    return notBooleanExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Identifier createIdentifier()
  {
    IdentifierImpl identifier = new IdentifierImpl();
    return identifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntLiteral createIntLiteral()
  {
    IntLiteralImpl intLiteral = new IntLiteralImpl();
    return intLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoolLiteral createBoolLiteral()
  {
    BoolLiteralImpl boolLiteral = new BoolLiteralImpl();
    return boolLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assign createAssign()
  {
    AssignImpl assign = new AssignImpl();
    return assign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Implie createImplie()
  {
    ImplieImpl implie = new ImplieImpl();
    return implie;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrExpression createOrExpression()
  {
    OrExpressionImpl orExpression = new OrExpressionImpl();
    return orExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndExpression createAndExpression()
  {
    AndExpressionImpl andExpression = new AndExpressionImpl();
    return andExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GT createGT()
  {
    GTImpl gt = new GTImpl();
    return gt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LT createLT()
  {
    LTImpl lt = new LTImpl();
    return lt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GE createGE()
  {
    GEImpl ge = new GEImpl();
    return ge;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LE createLE()
  {
    LEImpl le = new LEImpl();
    return le;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EQ createEQ()
  {
    EQImpl eq = new EQImpl();
    return eq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NE createNE()
  {
    NEImpl ne = new NEImpl();
    return ne;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Addition createAddition()
  {
    AdditionImpl addition = new AdditionImpl();
    return addition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Minus createMinus()
  {
    MinusImpl minus = new MinusImpl();
    return minus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Multiplication createMultiplication()
  {
    MultiplicationImpl multiplication = new MultiplicationImpl();
    return multiplication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Divide createDivide()
  {
    DivideImpl divide = new DivideImpl();
    return divide;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Modulo createModulo()
  {
    ModuloImpl modulo = new ModuloImpl();
    return modulo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryExpression createUnaryExpression()
  {
    UnaryExpressionImpl unaryExpression = new UnaryExpressionImpl();
    return unaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarType createVarTypeFromString(EDataType eDataType, String initialValue)
  {
    VarType result = VarType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertVarTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhereToApplyEnum createWhereToApplyEnumFromString(EDataType eDataType, String initialValue)
  {
    WhereToApplyEnum result = WhereToApplyEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertWhereToApplyEnumToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstLangPackage getConstLangPackage()
  {
    return (ConstLangPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ConstLangPackage getPackage()
  {
    return ConstLangPackage.eINSTANCE;
  }

} //ConstLangFactoryImpl
