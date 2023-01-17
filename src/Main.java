public class Main {
    public static void main(String[] args) {
        Electrodomestico[] e = new Electrodomestico[10];
        e[0]= new Electrodomestico(100, 50);
        e[1]= new Secadora(100, 65, "azul", 'D', 15 );
        e[2]= new Television(100, 25, "gris", 'E', 50, true);
        e[3]= new Secadora(100, 55);
        e[4]= new Television(100, 35, "gris", 'A', 65, true);
        e[5]= new Television(100, 25);
        e[6]= new Secadora(100, 55, "azul", 'A', 10 );
        e[7]= new Electrodomestico(100, 70, "rojo", 'B');
        e[8]= new Electrodomestico(100, 40);
        e[9]= new Television(100, 25);

        double sumaElectrodomesticos=0;
        double sumaTelevisiones=0;
        double sumaSecadoras=0;

        for(int i=0;i<e.length;i++){

            if(e[i] instanceof Electrodomestico){
                sumaElectrodomesticos+=e[i].precioFinal();
            }
            if(e[i] instanceof Secadora){
                sumaSecadoras+=e[i].precioFinal();
            }
            if(e[i] instanceof Television){
                sumaTelevisiones+=e[i].precioFinal();
            }
        }

        System.out.println("La suma del precio de los electrodomesticos es de "+sumaElectrodomesticos);
        System.out.println("La suma del precio de las secadoras es de "+sumaSecadoras);
        System.out.println("La suma del precio de las televisiones es de "+sumaTelevisiones);

    }
}