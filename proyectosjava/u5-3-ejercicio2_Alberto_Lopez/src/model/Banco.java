package model;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    List<Cuenta> cuentas;
    List<Cliente> clientes;

    public Banco() {
        cuentas = new ArrayList<>();
        clientes = new ArrayList<>();
    }

    public String anadirCuenta(Cuenta c) {
        cuentas.add(c);
        return "Cuenta añadida con exito";
    }

    public String anadirCliente(Cliente c) {
        clientes.add(c);
        return "Cliente añadida con exito";
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
}
