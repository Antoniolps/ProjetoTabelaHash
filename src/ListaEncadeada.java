public class ListaEncadeada {
    Aluno primeiro = null;
    Aluno ultimo = null;
    int tamanho = 0;

    public boolean estaVazia() {
        if (tamanho == 0)
            return true;

        return false;
    }
    public int tamanhoDaLista() {
        return (tamanho);
    }

    public void inserirAlunoInicio(Aluno a) {
        if (estaVazia())
            primeiro = ultimo = a;
        else {
            a.setProximo(primeiro);
            primeiro = a;
        }
        tamanho++;
    }

    public void inserirNoFim(Aluno a) {
        if (estaVazia())
            primeiro = ultimo = a;
        else {
            ultimo.setProximo(a);
            ultimo = a;
        }
        tamanho++;
    }

    public void exibirLista() {
        Aluno temp = primeiro;
        if (!estaVazia()) {
            for (int i = 0; i < tamanho; i++) {
                System.out.println("Aluno "+i+"| matricula: "+temp.getMartricula()+" | nome: "+temp.getNome()+" | idade: "+temp.getIdade());
                temp = temp.getProximo();
            }
        }
    }

    public boolean pesquisaALuno(int matricula){
        Aluno alunodafrente = primeiro;
        Aluno alunodetras = null;

        for (int i = 0; i < tamanho; i++) {
            if (matricula == alunodafrente.getMartricula()) {
                return true;
            }
            else {
                alunodetras = alunodafrente;
                alunodafrente = alunodafrente.getProximo();
            }
        }
        return false;
    }

    public void removerAlunoPorNome(String nomeprocurado) {
        if (tamanho == 0) {
            System.out.println("Lista está vazia");
        }

        if (tamanho == 1) {
            if (primeiro.getNome().equals(nomeprocurado)) {
                primeiro = ultimo = null;
                tamanho--;
            }
            else {
                System.out.println("O nome "+nomeprocurado+" não está na lista.");
            }
        }

        Aluno alunodafrente = primeiro;
        Aluno alunodetras = null;

        for (int i = 0; i < tamanho; i++) {
            if (nomeprocurado.equals(alunodafrente.getNome())) {
                if (i == 0) {
                    System.out.println("O primeiro da lista é o procurado e será removido.");
                    primeiro = primeiro.getProximo();
                    tamanho--;
                }
                else {
                    if(alunodetras != null) {
                        alunodetras.setProximo(alunodafrente.getProximo());
                        tamanho--;
                    }
                }
            }
            else {
                alunodetras = alunodafrente;
                alunodafrente = alunodafrente.getProximo();
            }
        }

        System.out.println("Aluno "+nomeprocurado+" não está na lista");
    }
}
