package model;

public class Tenis extends Raqueta{
    public String probar() {
        return "Se está probando una raqueta de Tenis";
    }

    @Override
    public String sacar() {
        return "Se está utilizando para realizar el saque una raqueta de Tenis";
    }

    @Override
    public String vender() {
        return "Se ha vendido la raqueta.";
    }

    @Override
    public String insertar() {
        return "Se ha insertado a la Lista una raqueta de Tenis";
    }

    @Override
    public String borrar() {
        return "Se ha borrado de la Lista una raqueta de Tenis";
    }

    @Override
    public String recorrer() {
        return "Se está recorriendo la lista de raquetas de Tenis";
    }
}
