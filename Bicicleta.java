
public class Bicicleta extends Vehiculo{
    private int ruedas;
    private String tamaño;
    
    public Bicicleta(String marca, int capacidad,int ruedas,String tamaño) {
        super(marca, capacidad);
        this.ruedas = ruedas;
        this.tamaño = tamaño;
    }

    public Bicicleta( String placa,int ruedas, String tamaño) {
        super(placa);
        this.ruedas = ruedas;
        this.tamaño = tamaño;
    }

    public Bicicleta(int velocidad, int paradas) {
        super(velocidad, paradas);
    }
     

    public void Saludar(){
        super.Saludar();
    }       
    @Override
    public void MostrarDatos(){
        System.out.println("La Marca de la Bicicleta es: "+getmarca());
        System.out.println("La Capacidad de la Bicicleta es: "+getcapacidad());

    }
    @Override
        public void MostrarDatos(int km){
        System.out.println("las placas del vehiculo son: "+getplaca());
        System.out.println("El kilometraje del vehiculo es: "+km);
        System.out.println("El vehiculo tiene: "+ruedas+" ruedas");
        System.out.println("El tamaño del vehiculo es: "+tamaño);
    }  
}
