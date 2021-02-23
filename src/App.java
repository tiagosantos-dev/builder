public class App{

    public static void main(String[] args) {
    //SelfService self = new SelfService().Builder().pimentao().build();
        
     Garcon iF = new Garcon().mesa(55).pedido("arroz").build();
     System.out.println(iF.toString());
    }
}