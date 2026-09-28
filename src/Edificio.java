import java.util.ArrayList;
public class Edificio extends Depto{
    private ArrayList<Depto> deptos;
    public Edificio(){
        this.deptos= new ArrayList<>();
        System.out.println("Lista creada.");
    }

    public void agregarDepto(Depto dpto) {
        if (this.getPropietario().getEdad() >= 18 && (this.getNumero() >= 100 || this.getNumero() <= 900)) {
            this.deptos.add(dpto);
            System.out.println("Depto agregado");
        }else{
            throw new IllegalArgumentException("Uno o más datos no son validos");
        }
    }

    public void imprimirPropietarios(){
        for (Depto depto : deptos) {
            System.out.println("Nombre"+depto.getPropietario().getNombre());
            System.out.println("Edad"+depto.getPropietario().getEdad());
            if(depto.getPropietario().isCasado()){
                System.out.println("Casado");
            }else {
                System.out.println("Soltero");
            }
            System.out.println("Nacionalidad:"+depto.getPropietario().getNacionalidad());
            System.out.println("Numero depto:"+depto.getNumero());
            if (depto.isEstacionamiento()){
                System.out.println("Estacionamiento: si");
            }else {
                System.out.println("Estacionamiento: no");
            }
            if(depto.isBodega()){
                System.out.println("Bodega: si");
            }else{
                System.out.println("Bodega: no");
            }
        }
    }

    public void imprimirBodegaEstacionamiento() {
        for (Depto depto : deptos) {
            if (depto.isBodega() == true && depto.isEstacionamiento() == true) {
                System.out.println("----INFO-----");
                System.out.println("Numero: " + depto.getNumero());
                System.out.println("Bodega: si");
                System.out.println("Estacionamiento: si");
                System.out.println("Propietario: " + depto.getPropietario().getNombre());
            }
        }
    }

    public void subirEdad(){
        for (Depto depto : deptos) {
            depto.getPropietario().setEdad(depto.getPropietario().getEdad()+1);
        }
    }

    public void buscarNacionalidad(String nacionalidad){
        boolean bandera = false;
        for (Depto depto : deptos) {
            if (this.getPropietario().getNacionalidad() == nacionalidad){
                bandera = true;
                System.out.println("----INFO-----");
                System.out.println("Numero: "+depto.getNumero());
                if (depto.isBodega() == true){
                    System.out.println("Bodega: si");
                }else {
                    System.out.println("Bodega: no");
                }
                if (depto.isEstacionamiento() == true){
                    System.out.println("Estacionamiento: si");
                }else{
                    System.out.println("Estacionamiento: no");
                }
                System.out.println("Propietario: "+ depto.getPropietario().getNombre());
                System.out.println("Nacionalidad:"+ depto.getPropietario().getNacionalidad());
            }

        }
        if (bandera == false){
            System.out.println("No se encontraron personas con la nacionalidad "+nacionalidad+".");
        }
    }
    public void imprimirSolteros(){
        boolean bandera = false;
        for (Depto depto : deptos) {
            if (depto.getPropietario().isCasado()== false){
                bandera=true;
                System.out.println("----INFO-----");
                System.out.println("Numero: "+depto.getNumero());
                if (depto.isBodega() == true){
                    System.out.println("Bodega: si");
                }else {
                    System.out.println("Bodega: no");
                }
                if (depto.isEstacionamiento() == true){
                    System.out.println("Estacionamiento: si");
                }else{
                    System.out.println("Estacionamiento: no");
                }
                System.out.println("Propietario: "+ depto.getPropietario().getNombre());
                System.out.println("Nacionalidad:"+ depto.getPropietario().getNacionalidad());
            }

        }
        if (bandera == false){
            System.out.println("No hay solteros en el edificio.");
        }
    }
}