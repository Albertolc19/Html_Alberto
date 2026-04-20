import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Las clases del modulo superior Desarrollo De Aplicaciones Web son las siguientes: \nBases de datos, Digitalización Aplicada a los Sectores Productivos,  Entornos de Desarrollo,\n Inglés Profesional, Itinerario Personal para la Empleabilidad, Lenguajes de Marcas y Sistemas de Gestión de Información\n Programación, Proyecto Intermodular, Sistemas Informáticos\n Sostenibilidad Aplicada al Sistema Productivo");
        System.out.println("Escribe una de las clases del modulo superior Desarrollo De Aplicaciones Web:");
        String Asignatura = sc.nextLine();

        switch (Asignatura) {
            case "Bases de datos":
                System.out.println("El profesor de esta asignatura es PRADO GONZÁLEZ, DAVID");
                break;
            case "Digitalización Aplicada a los Sectores Productivos":
                System.out.println("El profesor de esta asignatura es FERNÁNDEZ NAVEIRA, GONZALO");
                break;
            case "Entornos de Desarrollo":
                System.out.println("El profesor de esta asignatura es MENÉNDEZ TASCÓN, LUIS JAVIER");
                break;
            case "Inglés Profesional":
                System.out.println("El profesor de esta asignatura es Elena");
                break;
            case "Itinerario Personal para la Empleabilidad":
                System.out.println("El profesor de esta asignatura es ÁLVAREZ INFANZÓN, VERÓNICA");
                break;
            case "Lenguajes de Marcas y Sistemas de Gestión de Información":
                System.out.println("El profesor de esta asignatura es MENÉNDEZ TASCÓN, LUIS JAVIER");
                break;
            case "Programación":
                System.out.println("El profesor de esta asignatura es PRADO GONZÁLEZ, DAVID");
                break;
            case "Proyecto Intermodular":
                System.out.println("El profesor de esta asignatura es FERNÁNDEZ NAVEIRA, GONZALO");
                break;
            case "Sistemas Informáticos":
                System.out.println("El profesor de esta asignatura es ROJO BURGOS, EDUARDO MIGUEL");
                break;
            case "Sostenibilidad Aplicada al Sistema Productivo":
                System.out.println("El profesor de esta asignatura es MENÉNDEZ TASCÓN, LUIS JAVIER");
                break;
            default:
                System.out.println("La asignatura no existe o no pertenece a tu ciclo formativo");
        }
    }
}