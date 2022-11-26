import java.util.Scanner;

public class Menus {
    TabelaHash t1 = new TabelaHash();

    public Menus(){
        t1.iniciar();
    }
    public void menuPrincipal(){
        Scanner entrada = new Scanner(System.in);

        System.out.println(
                "\n 1- Inserir novo aluno." +
                "\n 2- Buscar aluno" +
                "\n 3- Remover aluno" +
                "\n 4- Exibir Tabela Hash" +
                "\n 5- Encerrar sistema" +
                "\n Escolha um opção: ");

        String opcao = entrada.next();

        switch(opcao){
            case "1":
                menuInserir();
            case "2":
                menuBuscar();
            case "3":
                menuRemover();
            case "4":
                menuExibir();
            case "5":
                System.exit(0);
            default:
                System.out.println("Digite uma opção válida!");
                menuPrincipal();
        }
        entrada.close();
    }

    private void menuExibir() {
        t1.exibir();
        menuPrincipal();
    }

    private void menuRemover() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("|Removendo um Aluno|");
        System.out.print("Digite a matricula do aluno a ser removido: ");
        int matricula = entrada.nextInt();
        t1.remover(matricula);
        menuPrincipal();
    }

    private void menuBuscar() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("|Buscando um aluno|");
        System.out.print("Digite a matricula do Aluno: ");
        int matricula = entrada.nextInt();
        t1.buscar(matricula);
        menuPrincipal();
    }

    private void menuInserir() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("|Inserindo um novo aluno|");
        System.out.print("Digite a Matricula do Aluno: ");
        int matricula = entrada.nextInt();
        System.out.print("Digite o nome do aluno: ");
        String nome = entrada.next();
        System.out.print("Digite a idade do aluno: ");
        int idade = entrada.nextInt();

        t1.inserir(new Aluno(matricula, nome, idade));
        menuPrincipal();
    }
}
