

public class Main {

    public static void main(String[]args){

       Bibliotecario bibliotecario = new Bibliotecario("1", "juan", "jajajaj@gmail.com", "noche");
       System.out.println(bibliotecario.darEmail());


       Socio socio = new Socio("1", "sara", "notengo@notengo", 4);
       socio.registrarPrestamo(2);

    }





}