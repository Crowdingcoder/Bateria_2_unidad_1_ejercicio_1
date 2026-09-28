void main() {

    Edificio prueba = new Edificio();
    Depto dpto123 = new Depto(123,true,true,new Persona("seba",28,true,"Chileno"));
    prueba.agregarDepto(dpto123);
    System.out.println("----Imprimir propietarios-----");
    prueba.imprimirPropietarios();

    System.out.println("\n----Buscar nacionalidad----");
    prueba.buscarNacionalidad("Chileno");

    System.out.println("\n----Bodega y estacionamiento----");
    prueba.imprimirBodegaEstacionamiento();

    Depto dpto124 = new Depto(124,false,false,new Persona("juan",28,false,"Chileno"));
    prueba.agregarDepto(dpto124);
    System.out.println("\n----Buscar solteros-----");
    prueba.imprimirSolteros();

    System.out.println("\n----Subir edad----");
    prueba.subirEdad();
    prueba.imprimirPropietarios();
}