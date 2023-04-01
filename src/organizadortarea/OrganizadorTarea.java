package organizadortarea;

import java.util.Scanner;

public class OrganizadorTarea {

    public static void main(String[] args) {

        String nombre;
        String descripcion;
        String estado;

        String Vnombre = "[C][L][0-9][0-9]";
        String Vdescrip = "[a-zA-Z]";

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese Nombre del Tablero");
        nombre = sc.nextLine();
        System.out.println("Ingrese Descripcion del Tablero");
        descripcion = sc.nextLine();
        System.out.println("Ingrese estado");
        estado = sc.nextLine();

        if (!nombre.matches(Vnombre)) {
            System.out.println("Nombre Incorrecto");
        } else if (!descripcion.matches(Vdescrip)) {
            System.out.println("Descripicon incorrecta");

        } else if (!estado.matches(Vdescrip)) {
            System.out.println("Estado errado");
        } else {
            Tablero v = new Tablero(nombre, descripcion, estado);
            System.out.println(v.OrganizadorTarea());

        }

    }

    
    

    
    

}
