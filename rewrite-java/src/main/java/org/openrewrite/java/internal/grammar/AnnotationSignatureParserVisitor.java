// Generated from /Users/jon/Projects/github/openrewrite/rewrite/rewrite-java/src/main/antlr/AnnotationSignatureParser.g4 by ANTLR 4.8
package org.openrewrite.java.internal.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AnnotationSignatureParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AnnotationSignatureParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AnnotationSignatureParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(AnnotationSignatureParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotationSignatureParser#annotationName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationName(AnnotationSignatureParser.AnnotationNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotationSignatureParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(AnnotationSignatureParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotationSignatureParser#elementValuePairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairs(AnnotationSignatureParser.ElementValuePairsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotationSignatureParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(AnnotationSignatureParser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotationSignatureParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(AnnotationSignatureParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotationSignatureParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(AnnotationSignatureParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotationSignatureParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(AnnotationSignatureParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotationSignatureParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(AnnotationSignatureParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AnnotationSignatureParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(AnnotationSignatureParser.LiteralContext ctx);
}