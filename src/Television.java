public class Television extends Electrodomestico{
    protected final double resolucion_def = 20;
    protected final boolean sintonizador_def = false;

    protected double resolucion;
    protected boolean sintonizador;

    public Television(){
    }

    public Television(double precio, double peso){
        this.precio_base=precio;
        this.peso=peso;
        this.color=color_def;
        this.consumo_energetico=consum_energDef;
        this.resolucion=resolucion_def;
        this.sintonizador=sintonizador_def;
    }

    public Television(double precio, double peso, String color, char consumoEnerg, double resolucion, boolean sintonizador){
        super(precio, peso, color, consumoEnerg);
        this.resolucion=resolucion;
        this.sintonizador=sintonizador;
    }

    public double getResolucion() {
        return resolucion;
    }

    public boolean getSintonizador() {
        return sintonizador;
    }

    @Override
    public double precioFinal() {
        double adiciont = super.precioFinal();
        if(resolucion<40){
            adiciont+=precio_base*0.3;
        }
        if(!sintonizador){
            adiciont+=50;
        }
        return adiciont;
    }
}
