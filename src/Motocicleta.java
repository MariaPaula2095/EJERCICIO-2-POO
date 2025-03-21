public class Motocicleta extends Vehiculo{

    //Atributos
    private int cilindrada;

    //Metodos


    public Motocicleta(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public Motocicleta(String marca, String modelo, int anio, double precioBase, int cilindrada) {
        super(marca, modelo, anio, precioBase);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return super.toString()+
                "cilindrada=" + cilindrada +
                '}';
    }

    //Metodos propios clase hija 2
    @Override
    public void mostrarInfo (){
        super.mostrarInfo();
        System.out.println("CILINDRAJE DE LA MOTO: " + cilindrada);
    }

}












