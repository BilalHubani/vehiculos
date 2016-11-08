/**
 * Created by dam on 4/11/16.
 */
public class carga extends vehiculos{
    private int pma;

    public int getPma() {
        return pma;
    }

    public void setPma(int pma) {
        this.pma = pma;
    }

    public carga(String matricula, int pma) {
        super(matricula);
        this.pma = pma;
    }

    @Override
    public double precioFinal(int dia) {
        return super.precioFinal(dia) + 20 * this.pma;
    }
}
