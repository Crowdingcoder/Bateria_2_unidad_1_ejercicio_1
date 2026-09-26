import java.util.ArrayList;
public class Edificio extends Depto{
    private ArrayList<Depto> deptos;
    public Edificio(){
    this.deptos= new ArrayList<>();
    }

    public void agregarDepto(Depto dpto) {
        if (this.getPropietario().getEdad() >= 18 && (this.getNumero() >= 100 || this.getNumero() <= 900)) {
            this.deptos.add(dpto);
        }else{
            throw new IllegalArgumentException("Uno o más datos no son validos");
        }
    }

    public void imprimirBodegaEstacionamiento(){
        for (Depto depto : deptos) {
            if (this.isBodega() == true && this.isEstacionamiento() == true){
                for (Depto depto1 : deptos) {
                    System.out.println("----INFO-----");
                    System.out.println("Numero: "+this.getNumero());
                    System.out.println("Bodega: si");
                    System.out.println("Estacionamiento: si");
                    System.out.println("Propietario: "+ this.getPropietario().getNombre());
                }
            }
        }

    }

    public void aumentarEdadPropietarios(){
        for (Depto depto : deptos) {
            this.setEdad(this.getEdad()+1);
        }
    }

    public void buscarNacionalidad(String nacionalidad){
        boolean bandera = false;
        for (Depto depto : deptos) {
            if (this.getPropietario().getNacionalidad() == nacionalidad){
                bandera = true;
                System.out.println("----INFO-----");
                System.out.println("Numero: "+this.getNumero());
                if (this.isBodega() == true){
                    System.out.println("Bodega: si");
                }else {
                    System.out.println("Bodega: no");
                }
                if (this.isEstacionamiento() == true){
                    System.out.println("Estacionamiento: si");
                }else{
                    System.out.println("Estacionamiento: no");
                }
                System.out.println("Propietario: "+ this.getPropietario().getNombre());
                System.out.println("Nacionalidad:"+ this.getPropietario().getNacionalidad());
            }

        }
        if (bandera == false){
            System.out.println("No se encontraron personas con la nacionalidad "+nacionalidad+".");
        }
    }
}
