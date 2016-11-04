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

    public carga(String matricula, int dia, int pma) {
        super(matricula, dia);
        this.pma = pma;
    }
}
