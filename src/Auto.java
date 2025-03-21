public class Auto extends Vehiculo{
    //Atributos
    private int numeroPuertas;

    //Metodos

    public Auto(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public Auto(String marca, String modelo, int anio, double precioBase, int numeroPuertas) {
        super(marca, modelo, anio, precioBase);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String toString() {
        return super.toString()+
                "numeroPuertas=" + numeroPuertas +

                '}';
    }

    //Metodos propios clase hija

    @Override
    public void mostrarInfo (){
        super.mostrarInfo();
        System.out.println("NUMERO DE PUERTAS DEL AUTO: " + numeroPuertas);
    }
}















