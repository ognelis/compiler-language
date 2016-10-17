// Generated from C:/Users/Admin/IdeaProjects/language/src\MyLang.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MyLangParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(MyLangParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLangParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(MyLangParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLangParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(MyLangParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLangParser#valDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValDeclaration(MyLangParser.ValDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLangParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(MyLangParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLangParser#funDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunDeclaration(MyLangParser.FunDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLangParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(MyLangParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLangParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(MyLangParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLangParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MyLangParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MyLangParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MyLangParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLangParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(MyLangParser.ExpressionListContext ctx);
}