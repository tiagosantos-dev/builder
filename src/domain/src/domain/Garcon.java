import java.util.ArrayList;
import java.util.List;

//InterfaceFluente
public class Garcon {
    List<String> pedido = new ArrayList<>();
    List<Integer> mesa = new ArrayList<>();

    public Garcon pedido(String pedido){
        this.pedido.add(pedido);
        return this;

    }

    public Garcon mesa(Integer mesa){
        this.mesa.add(mesa);
        return this;

    }

    public Garcon build(){
        return this;

    }

    @Override
    public String toString() {
        return "Garcon [mesa=" + mesa + ", pedido=" + pedido + "]";
    }

    
    
}
