#include "VariableVisitor.h"

void printVarIndexMap(std::map<std::string, std::pair<varIndex, int >> varIndexMap)
{
    for(auto it = varIndexMap.begin(); it != varIndexMap.end(); it++)
    {
        std::cout << it->first << " : " << it->second.second << std::endl;
    }
}

²
antlrcpp::Any VariableVisitor::visitSimpleDeclaration(ifccParser::SimpleDeclarationContext *ctx)
{
    // On get le premier child qui est le nom de la variable
    std::string varName = ctx->children[1]->getText();

    // Si la variable a déjà été déclarée, on arrête le programme
    if(varIndexMap.find(varName) != varIndexMap.end())
    {
        std::cerr << "Variable " << varName << " already declared" << std::endl;
        exit(1);
    }
    
    // Sinon on l'ajoute à la map et on lui affecte la valeur NULL
    varIndexMap[varName] = std::make_pair(varIndexMap.size(), NULL);

    std::cout << "Variable declared : " << varName << std::endl;

    

    return 0;
}

antlrcpp::Any VariableVisitor::visitAffectationWithDeclaration(ifccParser::AffectationWithDeclarationContext *ctx)
{
    return 0;
}

antlrcpp::Any VariableVisitor::visitSimpleAffectation(ifccParser::SimpleAffectationContext *ctx)
{
    std::string varName = ctx->children[0]->getText();
    std::string value = ctx->children[2]->getText();
    int val = std::stoi(value);

    if(varIndexMap.find(varName) == varIndexMap.end())
    {
        std::cerr << "Variable " << varName << " not declared" << std::endl;
        exit(1);
    }

    varIndexMap[varName].second = val;
    std::cout << "Variable " << varName << " set to " << val << std::endl;

    //printVarIndexMap(varIndexMap);

    return 0;
}

