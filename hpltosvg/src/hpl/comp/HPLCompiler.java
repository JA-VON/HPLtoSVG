package hpl.comp;

import hpl.lang.*;

public interface HPLCompiler {

    /**
     * Translate the given AST into the appropriate target representation.  This
     * method should invoke the visitPIRProgram method of a visitor that
     * compiles its input program.  (This visitor may very well be this same
     * class that implements HPLCompiler, or one that is delegated to by it).  
     * Defining an HPLCompiler interface separately from the Visitor<S,T> 
     * interface allows the main entry point to invoke the compiler without
     * presuming any properties about the type of context (instance of S) 
     * required by the compiling Visitor instance.
     *
     * @param prog The HPLProgram to be compiled.
     * @return The object representing the translated program.
     */
    public CompilerResult translate(PIRProgram prog);


    /**
     *
     * @return the file extension appropriate for saving code
     * generated by this compiler.
     */
    public String getTargetExtension();
}
