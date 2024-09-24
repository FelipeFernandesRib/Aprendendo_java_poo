package aula11;
public class Professor extends Aluno{
    //Atributos
    private String especialidade;
    private float salario;
    
    //Métodos
    public void receberSalario(){
        System.out.println("Sálario de " + this.salario + " recebido");
    }
    //Métodos Especias

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
