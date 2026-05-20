package model;

public class calculadora {
    private int operando1;
    private int operando2;

    public calculadora(int operando1, int operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    public float dividir() throws ArithmeticException {
        if (operando2 == 0) {
            throw new ArithmeticException("División por cero");
        }
        return (float) operando1 / operando2;
    }

    public void resetear() {
        this.operando1 = 0;
        this.operando2 = 0;
    }

    public int getOperando1() { return operando1; }
    public int getOperando2() { return operando2; }
}
