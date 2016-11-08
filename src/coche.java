/**
 * Created by dam on 4/11/16.
 */
public class coche extends vehiculos {
    private int plazas;

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    public coche(String matricula, int plazas) {
        super(matricula);
        this.plazas = plazas;
    }

    @Override
    public double precioFinal(int dia) {
        return super.precioFinal(dia)+ 1.5 * this.plazas;
    }
}
