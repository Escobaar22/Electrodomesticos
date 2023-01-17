public class Secadora extends Electrodomestico{
    protected final int carga_def = 5;

    protected int carga;

    public Secadora(){

    }

    public Secadora(double precio, double pesop){
        this.precio_base=precio;
        this.peso=pesop;
        this.color=color_def;
        this.consumo_energetico=consum_energDef;
        this.carga=carga_def;
        }

        public Secadora(double precio, double peso, String color, char consumoEnerg, int carga){
            super(precio, peso, color, consumoEnerg);
            this.carga=carga;
        }

    public int getCarga() {
        return carga;
    }

    public double precioFinal(){
        double adicion = super.precioFinal();
        if(carga>30){
            adicion+=50;
        }
        return adicion;
    }
}

