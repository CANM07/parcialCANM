
public class Taller1 {
    public static void main(String []args){
        Vehiculo v1 = new Vehiculo("Cualquiera",10000);
        Vehiculo v2 = new Vehiculo("AGH-32E");
        Vehiculo v3 = new Vehiculo(110,4);
        Vehiculo v4 = new Vehiculo("");
        v1.MostrarDatos();
        v2.MostrarDatos(5000);
        v3.Avanzar();
        v3.Detenerse();
        v4.Saludar();
        
        System.out.println(" ");
        System.out.println(" ");
        
        Moto m1 = new Moto("GIXXER",2,2,"Pequeño");
        Moto m2 = new Moto("WNO-32E",2,"Pequeño");
        Moto m3 = new Moto(120,2);
        m1.MostrarDatos();
        m2.MostrarDatos(38000);
        m3.Avanzar();
        m3.Detenerse();
        m3.Saludar();
        
        System.out.println(" ");
        System.out.println(" ");
        
        Carro ca1 = new Carro("MAZDA",5,4,"Mediano");
        Carro ca2 = new Carro("AKI-LES",4,"Pequeño");
        Carro ca3 = new Carro(100,5);
        ca1.MostrarDatos();
        ca2.MostrarDatos(38000);
        ca3.Avanzar();
        ca3.Detenerse();
        ca3.Saludar();
        
        System.out.println(" ");
        System.out.println(" ");
        
        Bicicleta b1 = new Bicicleta("Sportis",2,2,"Pequeño");
        Bicicleta b2 = new Bicicleta("No tiene",2,"Pequeño");
        Bicicleta b3 = new Bicicleta(40,1);
        b1.MostrarDatos();
        b2.MostrarDatos(38000);
        b3.Avanzar();
        b3.Detenerse();
        b3.Saludar();
        
        System.out.println(" ");
        System.out.println(" ");
        
        Cuatrimoto cu1 = new Cuatrimoto("Dirt Cross",2,4,"Pequeño - Mediano");
        Cuatrimoto cu2 = new Cuatrimoto("AFL-32E",4,"Pequeño - Mediano");
        Cuatrimoto cu3 = new Cuatrimoto(70,0);
        cu1.MostrarDatos();
        cu2.MostrarDatos(38000);
        cu3.Avanzar();
        cu3.Detenerse();
        cu3.Saludar();
        
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        
        Carrito carrito1 = new Carrito();
        Motico motico1 = new Motico();
        
        carrito1.Rapidez();
        carrito1.Frenado();
        System.out.println(" ");
        motico1.Rapidez();
        motico1.Frenado();
    }
}
