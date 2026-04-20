package model;

public class Busqueda {
    public Busqueda() {
    }
    public int buscarLineal(int[] numeros, int valorBuscado)
    {
        boolean encontrado = false;
        int i = 0;
        int resultado=0;
        while (!encontrado)
        {
            if (numeros[i] == valorBuscado) {
                encontrado = true;
            }
            else {
                i++;
            }
            resultado=i;
            if(numeros.length==i){
                resultado=-1;
                break;
            }
        }
        return resultado;
    }
}
