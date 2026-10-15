package negocio;

public class Servidor {
    private int id;
    private String nombre;
    private String direccionIP;
    private boolean activo;

    private static int totalServidores = 0;
    private static int servidoresActivos = 0;

    //Constructor
    public Servidor (String nombre, String direccionIP){
        totalServidores++;
        this.id = totalServidores;
        this.nombre = nombre;
        this.direccionIP = direccionIP;
        this.activo = false;

    }

    public static int getTotalServidores() {
        return totalServidores;
    }

    public static int getServidoresActivos() {
        return servidoresActivos;
    }


    public void activar(){
        System.out.println("[!] Activando servidor: " + nombre + "...");
        if (!activo) {
            activo = true;
            servidoresActivos++;
            System.out.println(nombre + " activado.");
        } else {
            System.out.println(nombre + " ya estaba activo.");
        }
    }

    public void desactivar(){
        System.out.println("[!] Desactivando servidor: " + nombre + "...");
        if(activo){
            activo = false;
            servidoresActivos--;
            System.out.println(nombre + " desactivado.");

        } else {
            System.out.println(nombre + " ya estaba desactivado.");
        }
    }

    public int getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }

    public String getDireccionIP(){
        return direccionIP;
    }

    public boolean isActivo(){
        return activo;
    }

    public void mostrarInformacion(){
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección IP:" + direccionIP);
        System.out.println(activo ? "Estado: Activo" : "Estado: Desactivado");
        System.out.println("-----------------------------------");
    }



}
