package aula12;
public class Cachorro extends Mamifero{
    @Override
    public void emitirSom() {
        System.out.println("Au! Au! Au!");
    }
    
    public void enterrarOsso(){
        System.out.println("Enterrando osso");
    }
    
    public void abamarRabo(){
        System.out.println("Abanando o Rabo");
    }
}
