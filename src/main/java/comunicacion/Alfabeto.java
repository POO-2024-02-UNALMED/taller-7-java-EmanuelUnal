package comunicacion;

public class Alfabeto extends Pictograma{
    private static String[] letras;
    private String interpretacion;

    public Alfabeto(String origen, String[] letras, String interpretacion) {
        super(origen);
        Alfabeto.letras = letras;
        this.interpretacion = interpretacion;
    }
    public int cantidadLetras() {
        return Alfabeto.getLetras().length;
    }

    public String interpretacion() {
        return this.interpretacion;
    }
    @Override
    public String toString() {
        return String.join(", ", Alfabeto.letras);
    }


    public static String[] getLetras() {
        return Alfabeto.letras;
    }

    public static void setLetras(String[] letras) {
        Alfabeto.letras = letras;
    }

    public String getInterpretacion() {
        return this.interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    
}
