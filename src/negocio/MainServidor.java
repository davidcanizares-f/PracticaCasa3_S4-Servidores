package negocio;

public class MainServidor {
    public static void main(){
        Servidor s1 = new Servidor("ServidorWeb", "192.168.1.20");
        Servidor s2 = new Servidor("ServidorCorreo", "192.168.1.21");

        System.out.println("\n> Total de servidores: " + Servidor.getTotalServidores());

        System.out.println("=== SERVIDORES ===");
        s1.mostrarInformacion();
        s2.mostrarInformacion();
        System.out.println(">> Servidores activos: " + Servidor.getServidoresActivos());

        System.out.println("=== ACTIVAR SERVIDORES ===");
        s1.activar();
        s1.activar(); // ya estaba activo
        s2.activar();
        System.out.println("Servidores activos: " + Servidor.getServidoresActivos());

        System.out.println("=== DESACTIVAR SERVIDORES ===");
        s1.desactivar();
        s1.desactivar();  // ya estaba apagado no debe restar
        System.out.println("Servidores activos: " + Servidor.getServidoresActivos());

    }
}
