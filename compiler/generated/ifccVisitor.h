
// Generated from ifcc.g4 by ANTLR 4.7.2

#pragma once


#include "antlr4-runtime.h"
#include "ifccParser.h"



/**
 * This class defines an abstract visitor for a parse tree
 * produced by ifccParser.
 */
class  ifccVisitor : public antlr4::tree::AbstractParseTreeVisitor {
public:

  /**
   * Visit parse trees produced by ifccParser.
   */
    virtual antlrcpp::Any visitAxiom(ifccParser::AxiomContext *context) = 0;

    virtual antlrcpp::Any visitProg(ifccParser::ProgContext *context) = 0;

    virtual antlrcpp::Any visitStmt(ifccParser::StmtContext *context) = 0;

    virtual antlrcpp::Any visitVar_decl_stmt(ifccParser::Var_decl_stmtContext *context) = 0;

    virtual antlrcpp::Any visitVar_assign_stmt(ifccParser::Var_assign_stmtContext *context) = 0;

    virtual antlrcpp::Any visitExpr(ifccParser::ExprContext *context) = 0;

    virtual antlrcpp::Any visitTerm(ifccParser::TermContext *context) = 0;

    virtual antlrcpp::Any visitConst(ifccParser::ConstContext *context) = 0;

    virtual antlrcpp::Any visitId(ifccParser::IdContext *context) = 0;

    virtual antlrcpp::Any visitParenthesis(ifccParser::ParenthesisContext *context) = 0;

    virtual antlrcpp::Any visitReturn_stmt(ifccParser::Return_stmtContext *context) = 0;


};

