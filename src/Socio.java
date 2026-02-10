public class Socio extends Usuario{


    private int limiteEjemplares;
    private int ejemplaresEnprestamo;
    private double multasPendientes;


    public Socio(String id, String nombre, String email, int limiteEjemplares){
        super(id, nombre, email);
        this.limiteEjemplares = limiteEjemplares;
        ejemplaresEnprestamo = 0;
        multasPendientes = 0;

    }

    public void  registrarPrestamo(int cantidad){
        if (cantidad > limiteEjemplares){
            throw new IllegalArgumentException("supera el limite socio");
        }

        if (multasPendientes > 0) {
            throw new IllegalArgumentException("tiene multas, no puede pedir mas");
        }

        System.out.println("se prestaron" + cantidad + "libros");

        }

}
