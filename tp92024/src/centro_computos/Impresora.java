package centro_computos;
public class Impresora extends Dispositivo{
    private String ip;
    private String nombre;

    public Impresora(int inventario, String ip, String nombre) {
        super(inventario);
        this.ip = ip;
        this.nombre = nombre;
    }

    public String getIp() {
        return ip;
    }

    public String getNombre() {
        return nombre;
    }
}
