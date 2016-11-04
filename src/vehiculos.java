/**
 * Created by dam on 4/11/16.
 */
public class vehiculos {
    final private int precioBase = 50;
    private String matricula;
    private int dia;

    public int getPrecioBase() {
        return precioBase;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public vehiculos(String matricula, int dia) {
        this.matricula = matricula;
        this.dia = dia;
    }

    public double precioFinal(){
        double precio = this.precioBase;
        return precio;
    }
}
