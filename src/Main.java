public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno(112, "Antonio", 22);
        Aluno a7 = new Aluno(112, "Antonio", 22);
        Aluno a2 = new Aluno(111, "Hiago", 21);
        Aluno a3 = new Aluno(113, "Marco", 19);
        Aluno a4 = new Aluno(116, "Vinicius", 20);
        Aluno a5 = new Aluno(1234, "Teste", 123);
        Aluno a6 = new Aluno(223, "Aluno de teste", 100);

        TabelaHash t1 = new TabelaHash();


        t1.iniciar();
        t1.inserir(a1);
        t1.inserir(a2);
        t1.inserir(a3);
        t1.inserir(a4);
        t1.inserir(a5);
        t1.inserir(a6);
        t1.inserir(a7);
        t1.exibir();
    }
}