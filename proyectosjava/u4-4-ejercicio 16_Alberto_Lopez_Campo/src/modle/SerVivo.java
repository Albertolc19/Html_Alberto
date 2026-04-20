package modle;

public class SerVivo {
    private int edad;
    private int peso;

    public SerVivo() {
        this.edad = (int)(Math.random() * 100)+1;
        this.peso = (int)(Math.random() * 100)+1;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "SerVivo{" +
                "edad=" + edad +
                ", peso=" + peso +
                '}';
    }

    public String respirar(){
        return "";
    }
}
