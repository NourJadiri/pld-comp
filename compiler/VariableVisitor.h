#pragma once

#include "antlr4-runtime.h"
#include "generated/ifccBaseVisitor.h"

using varIndex = int;

class VariableVisitor : public ifccBaseVisitor{
    public:
        antlrcpp::Any visitSimpleDeclaration(ifccParser::SimpleDeclarationContext *ctx) override;
        antlrcpp::Any visitAffectationWithDeclaration(ifccParser::AffectationWithDeclarationContext *ctx) override;
        antlrcpp::Any visitSimpleAffectation(ifccParser::SimpleAffectationContext *ctx) override;

    private:
        std::map<std::string, std::pair<varIndex, int >> varIndexMap;
};