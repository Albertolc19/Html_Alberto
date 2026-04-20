public class ManipulacionCadenas {
    public String transformarCadena(String transformarCadena){
        StringBuilder sb = new StringBuilder(transformarCadena);

        sb.insert(0, "¡");
        sb.insert(13, "!");
        sb.replace(3,5, "la");
        sb.delete(7,9);

        return sb.toString();

    }
}
