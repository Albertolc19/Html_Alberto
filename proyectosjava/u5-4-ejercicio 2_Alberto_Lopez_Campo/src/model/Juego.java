package model;

public abstract class Juego{
  private int codigo;
  private String premio;

    public Juego(int codigo, String premio) {
        this.codigo = codigo;
        this.premio = premio;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(codigo);
    }

    @Override
    public String toString() {
        return "Juego{" +
                "codigo=" + codigo +
                ", premio='" + premio + '\'' +
                '}'+"\n";
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getPremio() {
        return premio;
    }

    public void setPremio(String premio) {
        this.premio = premio;
    }
}
