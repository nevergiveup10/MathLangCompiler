package compiler.visitor.exceptions;

public class NotDefinedVariable extends Exception {

    public NotDefinedVariable() {
    }

    public NotDefinedVariable(String messages) {
        super(messages);
    }

}
