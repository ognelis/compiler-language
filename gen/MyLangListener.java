// Generated from C:/Users/Admin/IdeaProjects/language/src\MyLang.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyLangParser}.
 */
public interface MyLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyLangParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(MyLangParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(MyLangParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(MyLangParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(MyLangParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(MyLangParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(MyLangParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#valDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterValDeclaration(MyLangParser.ValDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#valDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitValDeclaration(MyLangParser.ValDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(MyLangParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(MyLangParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#funDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunDeclaration(MyLangParser.FunDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#funDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunDeclaration(MyLangParser.FunDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(MyLangParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(MyLangParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(MyLangParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(MyLangParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MyLangParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MyLangParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MyLangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MyLangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MyLangParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MyLangParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(MyLangParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(MyLangParser.ExpressionListContext ctx);
}