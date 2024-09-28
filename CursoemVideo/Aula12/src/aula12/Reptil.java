package aula12;
public class Reptil extends Animal {
    
    //Atributos
    private String corEscama;
    //Métodos de Réptil
    @Override
    public void locoMover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Réptil");
    }
    
    
    //Métodos especias

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
