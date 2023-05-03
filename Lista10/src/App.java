enum LUZ{
    VERMELHO, AMBAR, VERDE
}

public class App {
    public static void main(String[] args) throws Exception {
        Palestra p = new Palestra(LUZ.VERMELHO);
        p.acessa();

        Palestra p2 = new Palestra(LUZ.AMBAR);
        p2.acessa();

        Palestra p3 = new Palestra(LUZ.VERDE);
        p3.acessa();
    }
}
