package comparators;

public class Estudante implements Comparable<Estudante> {

    private final String nome;
    private Integer idade;

    public Estudante(String nome, Integer idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){ return nome; }
    public int getIdade(){ return idade; }

    @Override
    public String toString(){ return nome + " - " + idade;}

    @Override
    public int compareTo(Estudante o){
        return this.getIdade() - o.getIdade();
    }

}
