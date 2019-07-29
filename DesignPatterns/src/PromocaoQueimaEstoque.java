
//Concrete Strategy
public class PromocaoQueimaEstoque implements Promocao {

    @Override
    public int desconto() {
        return 40;
    }
}
