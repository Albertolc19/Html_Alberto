package model;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private String nombre;
    private ArrayList<Alimento> alimentos;

    public Restaurante(String nombre) {
        this.nombre = nombre;
        alimentos=new ArrayList<>();
    }
    public List<Alimento> buscarPorPrecio(double precio){
        List<Alimento> alimentosPre=new ArrayList<>();
        for(Alimento a:alimentos){
            if(a.getPrecio()==precio){
                alimentosPre.add(a);
            }
        }
        return alimentosPre;
    }
    public Alimento buscarAlimento(String nombre) {

        for (Alimento alimento : alimentos) {

            if (alimento.getNombre().equalsIgnoreCase(nombre)) {
                return alimento;
            }
        }

        return null;
    }

    public List<Alimento> obtenerMasCaros() {

        List<Alimento> masCaros = new ArrayList<>();

        if (alimentos.isEmpty()) {
            return masCaros;
        }

        double precioMaximo = alimentos.get(0).getPrecio();

        // Buscar precio máximo
        for (Alimento alimento : alimentos) {

            if (alimento.getPrecio() > precioMaximo) {
                precioMaximo = alimento.getPrecio();
            }
        }

        // Guardar alimentos con precio máximo
        for (Alimento alimento : alimentos) {

            if (alimento.getPrecio() == precioMaximo) {
                masCaros.add(alimento);
            }
        }

        return masCaros;
    }

    public Alimento obtenerMasBarato() {

        if (alimentos.isEmpty()) {
            return null;
        }

        Alimento masBarato = alimentos.get(0);

        for (Alimento alimento : alimentos) {

            if (alimento.getPrecio() < masBarato.getPrecio()) {
                masBarato = alimento;
            }
        }

        return masBarato;
    }
    
    public double mediaPrecios() {

        if (alimentos.isEmpty()) {
            return 0;
        }

        double suma = 0;

        for (Alimento alimento : alimentos) {
            suma += alimento.getPrecio();
        }

        return suma / alimentos.size();
    }
    public void addAlimento(Alimento a){
        alimentos.add(a);
    }
}
