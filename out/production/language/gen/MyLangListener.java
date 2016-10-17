// Generated from C:/Users/Admin/IdeaProjects/language/out/production/language\MyLang.g4 by ANTLR 4.5.1

        package com.cymbol;
        
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
	 * Enter a parse tree produced by {@link MyLangParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(MyLangParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(MyLangParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MyLangParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MyLangParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(MyLangParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(MyLangParser.FunctionDeclContext ctx);
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
	 * Enter a parse tree produced by {@link MyLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(MyLangParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(MyLangParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Call}
	 * labeled alternative in {@link MyLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCall(MyLangParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Call}
	 * labeled alternative in {@link MyLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCall(MyLangParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link MyLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNot(MyLangParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link MyLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNot(MyLangParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link MyLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMult(MyLangParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link MyLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMult(MyLangParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link MyLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(MyLangParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link MyLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(MyLangParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link MyLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqual(MyLangParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link MyLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqual(MyLangParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Var}
	 * labeled alternative in {@link MyLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVar(MyLangParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link MyLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVar(MyLangParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link MyLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(MyLangParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link MyLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(MyLangParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Index}
	 * labeled alternative in {@link MyLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIndex(MyLangParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Index}
	 * labeled alternative in {@link MyLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIndex(MyLangParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Negate}
	 * labeled alternative in {@link MyLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNegate(MyLangParser.NegateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Negate}
	 * labeled alternative in {@link MyLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNegate(MyLangParser.NegateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link MyLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(MyLangParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link MyLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(MyLangParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(MyLangParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(MyLangParser.ExprListContext ctx);
}