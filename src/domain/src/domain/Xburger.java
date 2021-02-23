import interfaces.Builder;

public class Xburger {
    private String carne;
    private String pao;
    private String verdura;
    private String queijo;
    private Boolean maionese;


    public Xburger(String carne, String pao, String verdura, String queijo, Boolean maionese) {
        this.carne = carne;
        this.pao = pao;
        this.verdura = verdura;
        this.queijo = queijo;
        this.maionese = maionese;
    }

    @Override
    public String toString() {
        return "Xburger [carne=" + carne + ", maionese=" + maionese + ", pao=" + pao + ", queijo=" + queijo
                + ", verdura=" + verdura + "]";
    }
    

   
    
}
