public class Item {
    private String nome;
    private int peso;
    int n = (int)(Math.random()*5)-1;

    public Item(String nome, int peso) {
        this.nome = nome;
        this.peso = peso;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        switch (n){
            case 1:
                this.nome="pergamena";
                break;
            case 2:
                this.nome="amuleto";
                break;
            case 3:
                this.nome="scarabeo";
                break;
            case 4:
                this.nome="statuetta";
                break;
            case 5:
                this.nome="moneta";
                break;
        }
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }


}
