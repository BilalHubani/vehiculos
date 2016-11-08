/**
 * Created by dam on 4/11/16.
 */
public class vehiculos {
    final private int precioBase = 50;
    private String matricula;

    public int getPrecioBase() {
        return precioBase;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public vehiculos(String matricula) {
        this.matricula = matricula;
    }

    public double precioFinal(int dia){
        double precio = this.precioBase * dia;
        return precio;
    }
}
