public class TabelaHash {
    final int M = 11;
    ListaEncadeada[] vetor = new ListaEncadeada[M];

    public void iniciar() {
        for (int i = 0; i < M; i++) {
            vetor[i] = new ListaEncadeada();
        }
    }

    public int Hash(int matricula){
        return matricula % M;
    }

    public boolean colisao(int matricula){
        int pos = Hash(matricula);

        if(vetor[pos].pesquisaALuno(matricula) == null)
            return  false;
        else
            return true;
    }

    public void inserir(Aluno aluno){
        int chave = Hash(aluno.getMatricula());
        if(!colisao(aluno.getMatricula())) {
            vetor[chave].inserirNoFim(aluno);
            System.out.println("Aluno inserido com sucesso!");
        }
        else
            System.out.println("O aluno já existe");
    }

    public void exibir() {
        for (int i = 0; i < M; i++) {
            System.out.print("i: " + (i + 1));
            vetor[i].exibirLista();
            System.out.print("\n");
        }
    }

    public void buscar(int matricula) {
        int chave = Hash(matricula);
        Aluno a = vetor[chave].pesquisaALuno(matricula);

        if(a != null){
            System.out.println(a.toString());
        }
        else {
            System.out.println("O aluno não existe!");
        }
    }

    public void remover(int matricula) {
        int chave = Hash(matricula);
        boolean removido = vetor[chave].removerAlunoPorMatricula(matricula);
        if(removido){
            System.out.println("O aluno foi removido com sucesso!");
        }
        else {
            System.out.println("O aluno de matricula " + matricula + " não existe!");
        }
    }
}
