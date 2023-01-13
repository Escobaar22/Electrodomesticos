public class Electrodomestico {
    protected final double precio_def = 100;
    protected final String color_def="blanco";
    protected final char consum_energDef='F';
    protected final double peso_def=5;

    protected double precio_base;
    protected String color;
    protected char consumo_energetico;
    protected double peso;

    public Electrodomestico(){

    }

    public Electrodomestico(double precio,double pesop){
        this.precio_base=precio;
        this.peso=pesop;
        this.color=color_def;
        this.consumo_energetico=consum_energDef;
    }

    public Electrodomestico(double precio, double peso, String color, char consumoEnerg){
        this.precio_base=precio;
        comprobarColor(color);
        this.color=color;
        comprobarConsumoEnergetico(consumoEnerg);
        this.consumo_energetico=consumoEnerg;
        this.peso=peso;
    }

    public double getPrecioBase() {
        return precio_base;
    }

    public double getPeso() {
        return peso;
    }

    public char getConsumoEnergetico() {
        return consumo_energetico;
    }


    public String getColor() {
        return color;
    }

    private char comprobarConsumoEnergetico(char letra){
        char tipo_consum[]={'A','B','C','D','E','F'};
        for (int i = 0; i <= tipo_consum.length; i++){
            if(letra == tipo_consum[i]){
            }else{
                this.consumo_energetico=consum_energDef;
            }
        }
        return letra;
    }

    private String comprobarColor(String color){
        String colores[] = {"blanco","negro","rojo","azul","gris"};
        for(int i = 0; i <= colores.length; i++){
            if(color == colores[i]){

            }else{
                this.color=color_def;
            }
        }
        return color;
    }

    public double precioFinal(){
        double adicion = 0;
        switch (consumo_energetico){
            case 'A':
                adicion+=100;
                break;
            case 'B':
                adicion+=80;
                break;
            case'C':
                adicion+=60;
                break;
            case'D':
                adicion+=50;
                break;
            case'E':
                adicion+=30;
                break;
            case'F':
                adicion+=10;
                break;
        }
        if(peso>=0 && peso<19){
            adicion+=10;
        } else if (peso>=20 && peso<49) {
            adicion+=50;
        } else if (peso>=50 && peso<=79) {
            adicion+=80;
        } else if (peso>=80) {
            adicion+=100;
        }
        return precio_base+adicion;
    }
}
