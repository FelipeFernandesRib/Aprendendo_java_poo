package aula11;
public class Tecnico extends Aluno{
    //Atributos
    private int registroProficional;
    
    //Métodos 
    public void praticar(){
        System.out.println("Praticando");
    }
    
    //Métodos especiais

    public int getRegistroProficional() {
        return registroProficional;
    }

    public void setRegistroProficional(int registroProficional) {
        this.registroProficional = registroProficional;
    }
}
