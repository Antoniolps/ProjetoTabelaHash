public class ListaSequencial {
    ListaEncadeada[] lista = new ListaEncadeada[11];
    int tamanho = 0;

    public boolean estaVazia() {
        return(tamanho == 0);
    }

    public boolean estaCheia() {
        return(tamanho == lista.length);
    }

    public int tamanhoLista() {
        return(tamanho);
    }

    public ListaEncadeada buscar(int pos) {
        // verifica se pos e valida
        if (pos < 0 || pos >= tamanho)
            return null;

        return lista[pos];
    }

    public boolean Compara(ListaEncadeada l1, ListaEncadeada l2) {
        return l1 == l2;
    }

    public int retornarPosicao(ListaEncadeada lista) {
        for (int i = 0; i <= tamanho; i++)
            if (Compara(this.lista[i], lista))
                return i;
        return -1;
    }

    public void deslocarParaDireita(int pos) {
        for (int i = tamanho; i > pos; i--)
            this.lista[i] = this.lista[i - 1];
    }

    public void inserir (int pos, Aluno aluno) {
        this.lista[pos].inserirNoFim(aluno);
    }

    public void deslocarParaEsquerda(int pos) {
        for (int i = pos; i < (tamanho - 1); i++)
            this.lista[i] = this.lista[i + 1];
    }

    /*	public boolean removerContato (int pos) {
            if ((pos > tamanho) || (pos < 0))
                return false;
            deslocarParaEsquerda(pos);
            tamanho--;
            return true;
        }
        */
    public ListaEncadeada removerAluno (int pos) {
        if ((pos > tamanho) || (pos < 0))
            return null;
        ListaEncadeada aux = this.lista[pos];
        deslocarParaEsquerda(pos);
        tamanho--;
        return aux;
    }

    public void exibirLista() {
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < lista[i].tamanho; j++) {
                this.lista[i].exibirLista();
            }
        }
    }
}
