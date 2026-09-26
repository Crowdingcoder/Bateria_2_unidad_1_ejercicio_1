public class Depto extends Persona{
    private int numero;
    private boolean bodega;
    private boolean estacionamiento;
    private Persona propietario;

    public Depto(String nombre, int edad, boolean casado, String nacionalidad, int numero, boolean bodega, boolean estacionamiento, Persona propietario) {
        super(nombre, edad, casado, nacionalidad);
        this.numero = numero;
        this.bodega = bodega;
        this.estacionamiento = estacionamiento;
        this.propietario = propietario;
    }

    public Depto() {
        super();
        this.numero = 1234;
        this.bodega = false;
        this.estacionamiento = false;
        this.propietario = new Persona();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isBodega() {
        return bodega;
    }

    public void setBodega(boolean bodega) {
        this.bodega = bodega;
    }

    public boolean isEstacionamiento() {
        return estacionamiento;
    }

    public void setEstacionamiento(boolean estacionamiento) {
        this.estacionamiento = estacionamiento;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }
}
