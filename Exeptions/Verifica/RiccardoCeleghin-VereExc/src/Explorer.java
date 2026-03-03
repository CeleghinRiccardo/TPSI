import java.util.ArrayList;

public class Explorer {
    private String nome;
    private int nTorce, nProb;
    public ArrayList<Item> inventario;
    Item item = new Item("name", 1);

    public Explorer(String nome, int nTorce) {
        this.nome = nome;
        this.nTorce = nTorce;
        this.inventario= new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getnTorce() {
        return nTorce;
    }

    public void setnTorce(int nTorce) {
        this.nTorce = nTorce;
    }
    /*
    public void addItem(){
        nProb = (int)(Math.random()*100)-1;

        if(nProb>=40){
            inventario.add(new Item(item.getNome(nome), ((int)(Math.random()*5)-1)));
        }
    }*/
}
