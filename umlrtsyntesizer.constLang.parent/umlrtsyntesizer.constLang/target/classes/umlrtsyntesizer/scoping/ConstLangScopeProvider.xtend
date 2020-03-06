/*
 * generated by Xtext 2.19.0
 */
package umlrtsyntesizer.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.scoping.IScope
import umlrtsyntesizer.constLang.Expression
import umlrtsyntesizer.constLang.Context
import org.eclipse.emf.ecore.EReference
import umlrtsyntesizer.constLang.Attribute
import umlrtsyntesizer.constLang.MessageConstraint

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class ConstLangScopeProvider extends AbstractConstLangScopeProvider {
		def int containerLevel(EObject o, Class<?> ownerType){
		var int i=1
		var EObject tempObject=o.eContainer
		while (tempObject!==null){
			if (ownerType.isInstance(tempObject))
				return i
			tempObject=tempObject.eContainer
			i=i+1
		}
		return 0
	}   
	def EObject containerOfType(EObject o, Class<?> ownerType){
		var int i=1
		var EObject tempObject=o.eContainer
		while (tempObject!==null){
			if (ownerType.isInstance(tempObject))
				return tempObject
			tempObject=tempObject.eContainer
			i=i+1
		}
		return null
	}   
   
///////	
	def dispatch IScope extractScop(Context att,EReference ref){
		var scop=IScope::NULLSCOPE
		println('scopping of context');
		scop
	}
	def dispatch IScope extractScop(Attribute att,EReference ref){
		var scop=IScope::NULLSCOPE
		print("test scoping expression");
		println('scopping of attribute');
		
		scop		
	} 
//	@Override
	def dispatch IScope extractScop( Expression exp,EReference ref){
		var scop=IScope::NULLSCOPE
		print("test scoping expression");
		scop		
	}
	
	def dispatch IScope extractScop( MessageConstraint exp,EReference ref){
		var scop=IScope::NULLSCOPE
		print("test scoping MessageConstraint");
		scop		
	}
}
