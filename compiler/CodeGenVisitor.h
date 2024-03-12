#pragma once


#include "antlr4-runtime.h"
#include "generated/ifccBaseVisitor.h"


struct Symbol{

        bool used;

        int offset;

        Symbol() : used(false), offset(0) {}
};

class  CodeGenVisitor : public ifccBaseVisitor {
	public:
        virtual antlrcpp::Any visitProg(ifccParser::ProgContext *ctx) override ;
        virtual antlrcpp::Any visitReturn_stmt(ifccParser::Return_stmtContext *ctx) override;
        
};

