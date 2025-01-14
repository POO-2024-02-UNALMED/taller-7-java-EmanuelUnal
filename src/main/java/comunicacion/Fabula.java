package comunicacion;

public class Fabula extends Escrito{
    private String ensenanzas;
    private String interpretacion;
    
    public Fabula(String origen, String titulo, String autor, int paginas, String enseñanzas, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.ensenanzas = enseñanzas;
        this.interpretacion = interpretacion;
    }
    
    public int palabrasTotales(int palabrasTotales) {
            return this.getPaginas() * (palabrasTotales*1);
        }

    public String interpretacion() {
        return this.interpretacion;
    }

    public String toString() {
        return this.getOrigen() +"\n" +this.getTitulo() + "\n" + this.getAutor() + "\n" + this.getPaginas()  + "\n" + this.getEnsenanza() + "\n" + this.interpretacion();
        }


    public String getEnsenanza() {
        return this.ensenanzas;
    }

    public void setEnsenanza(String ensenanzas) {
        this.ensenanzas = ensenanzas;
    }

    public String getInterpretacion() {
        return this.interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    
}
