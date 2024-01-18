package br.edu.curso.secao12;

public class Professor extends Pessoa{
    private String matricula;

    public Professor(String nome, int ano_nasc, String email, String matricula){
        super(nome, ano_nasc, email);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    //Overriding: Sobrescrita de métodos
    @Override
    public String toString() {
        return super.toString() + "\nMatrícula: " + this.matricula;
    }

    //Overriding: Sobrescrita de métodos
    @Override
    public String getNome() {
        return "Professor: \n" + super.getNome();
    }
}
