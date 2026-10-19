public class Dispositivo {
    public String nombre;
    String tipo;
    public boolean activo;

    public void mostrarInformacion(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Tipo: "+ tipo);
        System.out.println("Activo: "+ activo);
    }

    void mostrarEstado(){
        System.out.println("Estado activo: "+ activo);
    }

    //Public ya que de esta forma otras clases podran solicitar la activacion del dispositivo
    public void activar(){
        activo= true;
        System.out.println("El dispositivo ha sido activado");
    }
}



