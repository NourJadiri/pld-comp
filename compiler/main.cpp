#include <iostream>
#include <fstream>
#include <sstream>
#include <cstdlib>

#include "antlr4-runtime.h"
#include "generated/ifccLexer.h"
#include "generated/ifccParser.h"
#include "generated/ifccBaseVisitor.h"

#include "CodeGenVisitor.h"
#include "VariableVisitor.h"

using namespace antlr4;
using namespace std;

void testVisitor(ifccBaseVisitor &visitor, tree::ParseTree *tree)
{
    visitor.visit(tree);
}

int main(int argn, const char **argv)
{
    stringstream in;
    if (argn == 2)
    {
        ifstream lecture(argv[1]);
        if (!lecture.good())
        {
            cerr << "error: cannot read file: " << argv[1] << endl;
            exit(1);
        }
        in << lecture.rdbuf();
    }
    else
    {
        cerr << "usage: ifcc path/to/file.c" << endl;
        exit(1);
    }

    ANTLRInputStream input(in.str());

    ifccLexer lexer(&input);
    CommonTokenStream tokens(&lexer);

    tokens.fill();

    ifccParser parser(&tokens);
    tree::ParseTree *tree = parser.axiom();

    if (parser.getNumberOfSyntaxErrors() != 0)
    {
        cerr << "error: syntax error during parsing" << endl;
        exit(1);
    }

    VariableVisitor visitor;
    testVisitor(visitor, tree);
    return 0;
}
