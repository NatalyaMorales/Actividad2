package actividad2;

public class Circulo {
    public double circunferencia;
    public double area;
    public double radio;
    
    //Constructor que asigna el ID como radio
    public Circulo(double id){
        this.radio = id;
    }
    //Metodos que realizan las operaciones necesarias
    public void CalcularArea(){
        area = 3.14 * Math.pow(radio, 2);
    }
    public void CalcularCircunferencia(){
        circunferencia = 3.14*2*radio;
    }
    
}
