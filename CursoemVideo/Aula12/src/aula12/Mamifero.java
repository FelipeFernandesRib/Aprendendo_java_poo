package aula12;
public class Mamifero extends Animal {
    
    //Atributos de Mamífero
    private String corPelo;
    
    //Métodos de Mamífero
    @Override
    public void locoMover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Mamífero");
    }
    
    
    //Métodos especias

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
}
