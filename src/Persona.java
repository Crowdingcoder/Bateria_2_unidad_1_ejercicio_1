public class Persona {
    private String nombre;
    private int edad;
    private boolean casado;
    private String nacionalidad;

    public Persona(String nombre, int edad, boolean casado, String nacionalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.casado = casado;
        this.nacionalidad = nacionalidad;
    }

    public Persona() {
        this("No nombre",18,false,"No nacionalidad");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.isEmpty() || nombre == null){
            throw new IllegalArgumentException("El nombre no puede estar vacio");
        }else{
            this.nombre = nombre;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad <18){
            throw new IllegalArgumentException("La edad no puede ser menos de 18.");
        }else {
            this.edad = edad;
        }
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        if(nacionalidad.isEmpty() || nacionalidad == null){
            throw new IllegalArgumentException("La nacionalidad no puede estar vacia");
        }else {
            this.nacionalidad = nacionalidad;
        }
    }
}