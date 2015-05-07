// Autogenerated by convert_protofile.py on 2015-05-07.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../../templates/AstSubclass.java
package com.rethinkdb.ast.gen;

import com.rethinkdb.ast.helper.Arguments;
import com.rethinkdb.ast.helper.OptArgs;
import com.rethinkdb.ast.RqlAst;
import com.rethinkdb.proto.TermType;
import java.util.*;



public class Bracket extends RqlQuery {


    public Bracket(java.lang.Object arg) {
        this(new Arguments(arg), null);
    }
    public Bracket(Arguments args, OptArgs optargs) {
        this(null, args, optargs);
    }
    public Bracket(RqlAst prev, Arguments args, OptArgs optargs) {
        this(prev, TermType.BRACKET, args, optargs);
    }
    protected Bracket(RqlAst previous, TermType termType, Arguments args, OptArgs optargs){
        super(previous, termType, args, optargs);
    }


    /* Static factories */
    public static Bracket fromArgs(Object... args){
        return new Bracket(new Arguments(args), null);
    }


}
