package modle;

public class Planta extends SerVivo{

    public Planta() {
        super();
    }
    public String respirar(){
        return "La planta está respirando a través de los poros que tiene la hoja";
    }

    @Override
    public String toString() {
        return super.toString()+"(Planta)";
    }
}
