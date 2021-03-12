public class Aluno{
    private String matricula;
    private String nome;
    private String curso;
    
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setCurso(String curso) {

        this.curso = curso;
        
        if(curso.equalsIgnoreCase("si"))
        {
            this.curso = "Sistemas de Informação";
        }
        
    }

    public void listar()
    {
        System.out.println( toString() );
        
    }

    @Override
    public String toString() {
        return "Aluno [curso=" + curso + ", matricula=" + matricula + ", nome=" + nome + "]";
    }

    

}