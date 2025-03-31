package org.example;

public enum Operator {
    ADD('+'),
    SUBTRACT('-'),
    MULTIPLY('*'),
    DIVIDE('/');

    private final char symbol;

    Operator(char symbol) {
        this.symbol = symbol;
    }

    char getSymbol() {
        return symbol;
    }
    
    public static Operator fromChart( char symbol) {
        for (Operator o : values() ) {
            if (o.symbol == symbol) {
                return o;
            }
        }
        throw new IllegalArgumentException("Unknown operator" + symbol);
    }

}
