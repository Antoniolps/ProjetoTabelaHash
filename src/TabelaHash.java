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
        return vetor[pos].pesquisaALuno(matricula);
    }

    public void inserir(Aluno aluno){
        int chave = Hash(aluno.getMartricula());
        if(!colisao(aluno.getMartricula()))
            vetor[chave].inserirNoFim(aluno);
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

    public void buscar() {

    }

    public void remover() {

    }






}
