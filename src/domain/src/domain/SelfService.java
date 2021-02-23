
public class SelfService {
    private  Boolean pimentao;
    private  Boolean tomate ;
    private  Boolean cebola ;
    private  Boolean alho ;
    private  Boolean couve ;
    private  Boolean batata ;
    private  Boolean salsinha ;
    private  Boolean brocolis ;
    private  Boolean cenoura ;
    
    private  String refeicao ;
    private  String principal ;
    private  String sobremesa ;
    private  String bebida ;

    private SelfService(Builder build){
        this.alho = build.alho;
        this.batata = build.batata;
        this.bebida = build.bebida;
        this.brocolis = build.brocolis;
        this.cebola = build.cebola;
        this.cenoura = build.cenoura;
        this.couve = build.couve;
        this.principal = build.principal;
        this.refeicao = build.refeicao;
        this.salsinha = build.salsinha;
        this.sobremesa = build.sobremesa;
        this.tomate = build.tomate; 
        this.pimentao = build.pimentao;
    }


    public static class Builder{
        private Boolean pimentao;
        private Boolean tomate;
        private Boolean cebola;
        private Boolean alho;
        private Boolean couve;
        private Boolean batata;
        private Boolean salsinha;
        private Boolean brocolis;
        private Boolean cenoura;
        
        private String refeicao;
        private String principal;
        private String sobremesa;
        private String bebida;

        public Builder pimentao(){
            this.pimentao = true;
            return this;
        }
        public Builder tomate(){
            this.tomate = true;
            return this;
        }
        public Builder cebola(){
            this.cebola = true;
            return this;
        }
        public Builder alho(){
            this.alho = true;
            return this;
        }
        public Builder couve(){
            this.couve = true;
            return this;
        }
        public Builder batata(){
            this.batata = true;
            return this;
        }
        public Builder salsinha(){
            this.salsinha = true;
            return this;
        }
        public Builder brocolis(){
            this.brocolis = true;
            return this;
        }
        public Builder cenoura(){
            this.cenoura = true;
            return this;
        }
      
        public SelfService build(){
            return new SelfService(this);
        }

    }



}