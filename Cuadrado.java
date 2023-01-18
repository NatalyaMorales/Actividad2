package actividad1;

public class Cuadrado {
    
	public double lado;
    public double diagonal;
    public double area;
    public double perimetro;

    public Cuadrado(double id) {
        this.lado=id;
        this.perimetro = lado*4;
        this.area = lado*lado;
        this.diagonal = Math.sqrt(Math.pow(lado,2)*2);
    }

}