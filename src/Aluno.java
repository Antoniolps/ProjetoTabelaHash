public class Aluno {
    private int matricula;
    private String nome;
    private int idade;
    private Aluno proximo;

    public void setMartricula(int martricula) {
        this.matricula = martricula;
    }

    public int getMartricula() {
        return matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setProximo(Aluno proximo) {
        this.proximo = proximo;
    }

    public Aluno getProximo() {
        return proximo;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "martricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}