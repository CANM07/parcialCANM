
public class Moto extends Vehiculo{
    private int ruedas;
    private String tamaño;
    
    public Moto(String marca, int capacidad,int ruedas,String tamaño) {
        super(marca, capacidad);
        this.ruedas = ruedas;
        this.tamaño = tamaño;
    }

    public Moto( String placa,int ruedas, String tamaño) {
        super(placa);
        this.ruedas = ruedas;
        this.tamaño = tamaño;
    }

    public Moto(int velocidad, int paradas) {
        super(velocidad, paradas);
    }
  

    @Override
    public void Saludar(){
        super.Saludar();
    }   
    @Override
    public void MostrarDatos(){
        System.out.println("La Marca de la moto es: "+getmarca());
        System.out.println("La Capacidad de la moto es: "+getcapacidad());

    }
    @Override
        public void MostrarDatos(int km){
        System.out.println("las placas del vehiculo son: "+getplaca());
        System.out.println("El kilometraje del vehiculo es: "+km);
        System.out.println("El vehiculo tiene: "+ruedas+" ruedas");
        System.out.println("El tamaño del vehiculo es: "+tamaño);
    }
    @Override
     public void Avanzar(){
        System.out.println("El vehiculo esta avanzando a una velocidad de "+velocidad+"km/h por hora");
     }
    @Override
     public void Detenerse(){
        System.out.println("El vehiculo se detendra en "+paradas+" paradas"); 
     }
}
