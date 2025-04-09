package BasicOperation;

public class Tarefa {
    // atributo
    private String description;

    // construtor
    public Tarefa(String description) {
        this.description = description;
    }

    // método get
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }

}
