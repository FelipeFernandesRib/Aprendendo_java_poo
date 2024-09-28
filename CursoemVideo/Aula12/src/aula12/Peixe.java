package aula12;
public class Peixe extends Animal {
    
    //Atributos de Peixe
    private String corEscama;

    //Métodos de Peixe
    @Override
    public void locoMover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }
    
    public void soltarBolha(){
        System.out.println("Soltando bolhas");
    }
    
    //Métodos especiais

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
