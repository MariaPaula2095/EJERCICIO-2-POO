public class Vehiculo {
    // Atributos Clase Padre
    protected String marca;
    protected String modelo;
    protected int anio;
    protected double precioBase;

    //Metodos


    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int anio, double precioBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precioBase = precioBase;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                ", precioBase=" + precioBase +
                '}';
    }

    //Metodos propios
    public void mostrarInfo() {
        System.out.println("LA MARCA ES: " + marca);
        System.out.println("El MODELO ES: " + modelo);
        System.out.println("EL AÑO ES: " + anio);
        System.out.println("El PRECIO BASE ES: " + precioBase);
    }

    public double calcularPrecioFinal() {
        return (precioBase-(precioBase*0.10));
    }

}
