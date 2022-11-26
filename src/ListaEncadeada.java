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
                System.out.print(" - Aluno "+ (i+1) +"| matricula: "+temp.getMatricula()+" | nome: "+temp.getNome()+" | idade: "+temp.getIdade());
                temp = temp.getProximo();
            }
        }
    }

    public Aluno pesquisaALuno(int matricula){
        Aluno alunodafrente = primeiro;
        Aluno alunodetras = null;

        for (int i = 0; i < tamanho; i++) {
            if (matricula == alunodafrente.getMatricula()) {
                return alunodafrente;
            }
            else {
                alunodetras = alunodafrente;
                alunodafrente = alunodafrente.getProximo();
            }
        }
        return null;
    }

    public boolean removerAlunoPorMatricula(int matricula) {
        if (tamanho == 0) {
            return false;
        }

        if (tamanho == 1) {
            if (primeiro.getMatricula() == (matricula)) {
                primeiro = ultimo = null;
                tamanho--;
                return true;
            }
            else {
                return false;
            }
        }

        Aluno alunodafrente = primeiro;
        Aluno alunodetras = null;

        for (int i = 0; i < tamanho; i++) {
            if (matricula == alunodafrente.getMatricula()) {
                if (i == 0) {
                    primeiro = primeiro.getProximo();
                    tamanho--;
                    return true;
                }
                else {
                    if(alunodetras != null) {
                        alunodetras.setProximo(alunodafrente.getProximo());
                        tamanho--;
                        return true;
                    }
                }
            }
            else {
                alunodetras = alunodafrente;
                alunodafrente = alunodafrente.getProximo();
            }
        }

        return false;
    }
}
