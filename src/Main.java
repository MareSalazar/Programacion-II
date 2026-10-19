//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args){
        Dispositivo dispositivo1= new Dispositivo();
        Dispositivo dispositivo2= new Dispositivo();

        //Primer Objeto
        dispositivo1.nombre= "Laptop";
        dispositivo1.tipo= "Portatil";
        dispositivo1.activo= true;

        //Segundo Objeto
        dispositivo2.nombre= "Celular";
        dispositivo2.tipo= "Movil";
        dispositivo2.activo= false;

        System.out.println("Dispositivo 1 ");
        dispositivo1.mostrarInformacion();
        dispositivo1.mostrarEstado();

        System.out.println(); //salto de linea

        System.out.println("Dispositivo 2 ");
        dispositivo2.mostrarInformacion();
        dispositivo2.mostrarEstado();

        System.out.println("\n CAMBIO");
        dispositivo1.nombre= "Laptop gamer";
        dispositivo1.mostrarInformacion();
        System.out.println();
        dispositivo2.mostrarInformacion();

    }
}
