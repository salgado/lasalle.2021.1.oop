public class PessoaTester {

    public static void main(String[] args) {
        //Pessoa pessoa = new Pessoa("Alex");
        //Pessoa pessoa = new Pessoa();

        //pessoa.fazerAniversario();

        /*
        Aluno aluno = new Aluno();

        aluno.setNome("Alex");
        aluno.fazerAniversario();
*/
        Funcionario func = new Funcionario();
        func.setNome("Alex");
        func.fazerAniversario();
        func.mudarTrabalho();
    }
}