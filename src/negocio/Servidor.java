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

    public void activar(){
        if(activo){
            System.out.println();
        }
    }
}
