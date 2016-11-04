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

    public coche(String matricula, int dia, int plazas) {
        super(matricula, dia);
        this.plazas = plazas;
    }
}
