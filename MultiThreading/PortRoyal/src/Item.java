public class Item {
    private String name;

    public Item(String nome) {
        this.name = nome;
    }

    @Override
    public String toString() {
        return name;
    }
}
