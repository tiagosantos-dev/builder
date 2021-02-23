import interfaces.Builder;

public class XburgerBuider implements Builder {
    private String carne;
    private String pao;
    private String verdura;
    private String queijo;
    private Boolean maionese;

    @Override
    public XburgerBuider carne(String carne) {
        this.carne = carne;
        return this;
    }

    @Override
    public XburgerBuider pao(String pao) {
        this.pao = pao;
        return this;
    }

    @Override
    public XburgerBuider verduras(String verdura) {
        this.verdura = verdura;
        return this;
    }

    @Override
    public XburgerBuider queijo(String queijo) {
        this.queijo = queijo;
        return this;
    }

    @Override
    public XburgerBuider maionese(Boolean maionese) {
        this.maionese = maionese;
        return this;
    }

    public Xburger build() {
        return new Xburger(this.carne, this.pao, this.verdura, this.queijo, this.maionese);
    }
    
}
