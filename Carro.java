
public class Carro extends Vehiculo{
    private int ruedas;
    private String tamaño;
    
    public Carro(String marca, int capacidad,int ruedas,String tamaño) {
        super(marca, capacidad);
        this.ruedas = ruedas;
        this.tamaño = tamaño;
    }

    public Carro( String placa,int ruedas, String tamaño) {
        super(placa);
        this.ruedas = ruedas;
        this.tamaño = tamaño;
    }

    public Carro(int velocidad, int paradas) {
        super(velocidad, paradas);
    }
    

    public void Saludar(){
        super.Saludar();
    }        
    @Override
    public void MostrarDatos(){
        System.out.println("La Marca del carro es: "+getmarca());
        System.out.println("La Capacidad del carro es: "+getcapacidad());

    }
    @Override
        public void MostrarDatos(int km){
        System.out.println("las placas del vehiculo son: "+getplaca());
        System.out.println("El kilometraje del vehiculo es: "+km);
        System.out.println("El vehiculo tiene: "+ruedas+" ruedas");
        System.out.println("El tamaño del vehiculo es: "+tamaño);
    }  
}
