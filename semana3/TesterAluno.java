import java.util.Scanner;

public class TesterAluno{

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Entre com o nome:");
        aluno.setNome( teclado.next() );
        
        System.out.println("Entre com o Matricula:");
        aluno.setMatricula( teclado.next() );
        
        System.out.println("Entre com o Curso:");
        aluno.setCurso( teclado.next() );
        
        aluno.listar();
        teclado.close();
    }
}