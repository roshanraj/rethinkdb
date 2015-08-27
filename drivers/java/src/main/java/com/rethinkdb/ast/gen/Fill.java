// Autogenerated by metajava.py.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../../templates/AstSubclass.java
package com.rethinkdb.ast.gen;

import com.rethinkdb.model.Arguments;
import com.rethinkdb.model.OptArgs;
import com.rethinkdb.ast.ReqlAst;
import com.rethinkdb.proto.TermType;


public class Fill extends ReqlQuery {


    public Fill(java.lang.Object arg) {
        this(new Arguments(arg), null);
    }
    public Fill(Arguments args, OptArgs optargs) {
        this(null, args, optargs);
    }
    public Fill(ReqlAst prev, Arguments args, OptArgs optargs) {
        this(prev, TermType.FILL, args, optargs);
    }
    protected Fill(ReqlAst previous, TermType termType, Arguments args, OptArgs optargs){
        super(previous, termType, args, optargs);
    }


    /* Static factories */
    public static Fill fromArgs(java.lang.Object... args){
        return new Fill(new Arguments(args), null);
    }


}