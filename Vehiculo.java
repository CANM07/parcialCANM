
public class Vehiculo {
    String marca;
    int capacidad;
    String placa;
    int velocidad;
    int paradas;

    public Vehiculo(String marca, int capacidad) {
        this.marca = marca;
        this.capacidad = capacidad;
    }

    public Vehiculo(String placa) {
        this.placa = placa;
    }

    public Vehiculo(int velocidad, int paradas) {
        this.velocidad = velocidad;
        this.paradas = paradas;
    }
    public String getmarca() {
        return marca;
    }

    public int getcapacidad() {
        return capacidad;
    }

    public String getplaca() {
        return placa;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getParadas() {
        return paradas;
    }
    
    public void Saludar(){
        System.out.println("HOLAA YO SOY LA CLASE PADRE, USANDO EL 'SUPER'");
    }
    
    public void MostrarDatos(){
        System.out.println("Los datos de Padre son: Marca: "+marca);
        System.out.println("Los datos de Padre son: Capacidad: "+capacidad);

    }
        public void MostrarDatos(int km){
        System.out.println("las placas del vehiculo son: "+placa);
        System.out.println("El kilometraje del vehiculo es: "+km);
    }
        
     public void Avanzar(){
        System.out.println("El vehiculo esta avanzando a una velocidad de "+velocidad+"km/h por hora");
     }
     public void Detenerse(){
        System.out.println("El vehiculo se detendra en "+paradas+" paradas"); 
     }

}
 
   
