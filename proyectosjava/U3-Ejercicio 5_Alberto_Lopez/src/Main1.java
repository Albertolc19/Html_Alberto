import U3Ej5.Pasajero;

public class Main {
    public static void main(String[] args) {

        Pasajero a = new Pasajero("pepe");
        /*La primera funciona por esto:
        public Pasajero(String n)
    {
               nombre = n;
                peso = 78;
               altura = 1.80;
    }
         */
        Pasajero b = new Pasajero("pepe", 1.83);
          /*La segunda funciona por esto:
          public Pasajero(String n, double a)
    {
        nombre = n;
        peso = 73;
        altura = a;
    }
         */
       // Pasajero c = new Pasajero("pepe", 65.8, 1.83);
        //La tercera no funciona porque no hay funciona que tenga un String, Doble, Doble.
        Pasajero d = new Pasajero("pepe", 69, 1.83);
          /*La cuarta funciona por esto:
          public Pasajero(String n, int p, double a)
    {
        nombre = n;
        peso = p;
        altura = a;
    }
         */

        /*
        Pasajero pasa1, pasa2;
        pasa1 = new Pasajero("Jose Luis");
        pasa1 = pasa2;
        Si hacemos solo esto y no incializamos el pasa2 no funciona.
        */
        /*
        Pasajero pasa1, pasa2;
        pasa1 = new Pasajero("Jose Luis");
        pasa2 = null;
        pasa1 = pasa2;
        System.out.println("La variable pasa1 es: "+pasa1.getNombre());
        Lo que pasaria es que pasa1 seria null
        */
       Pasajero pasa3 = new Pasajero("Alejandro",1.75);
       /* Usariamos esta variable y tendira de peso 73kg
       public Pasajero(String n, double a)
    {
        nombre = n;
        peso = 73;
        altura = a;
    }
        */
    }
}