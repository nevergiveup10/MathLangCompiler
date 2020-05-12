package compiler.visitor;


public enum Type {
    INTEGER("int"),
    FLOAT ("float"),
    VOID("void");

    private String type;

    Type(String type){
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }

    static Type getTypeByString(String type){
        switch (type){
            case "Integer":
                return INTEGER;
            case "Float":
                return FLOAT;
            default:
                return VOID;
        }
    }
}