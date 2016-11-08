/**
 * Created by dam on 4/11/16.
 */
public class camiones extends vehiculos {

    public camiones(String matricula) {
        super(matricula);
    }

    @Override
    public double precioFinal(int dia) {
        return super.precioFinal(dia)+40;
    }
}
