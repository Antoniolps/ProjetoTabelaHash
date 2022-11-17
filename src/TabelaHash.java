public class TabelaHash {
    final int M = 11;
    ListaSequencial listaSequencial = new ListaSequencial();
    ListaEncadeada listaEncadeada = new ListaEncadeada();

    public int Hash(int matricula){
        return matricula % M;
    }

    public boolean colisao(int matricula){
        int posicao = Hash(matricula);
        listaEncadeada = listaSequencial.buscar(posicao);

        if(listaEncadeada.pesquisaALuno(matricula))
            return true;

        return false;
    }

    public boolean inserir(Aluno aluno){

        if(colisao(aluno.getMartricula())) {
            ListaEncadeada listaE =listaSequencial.buscar(Hash(aluno.getMartricula()));
            listaE.inserirNoFim(aluno);
            this.listaSequencial.inserir(Hash(aluno.getMartricula()), listaE);
        }
        else{
            ListaEncadeada listaE = new ListaEncadeada();
            listaE.inserirNoFim(aluno);
            this.listaSequencial.inserir(Hash(aluno.getMartricula()), listaE);
        }
        return true;
    }


}
