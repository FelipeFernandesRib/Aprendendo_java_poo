package aula12;
public class Aula12 {
    public static void main(String[] args) {
        //Animal n = new Animal();
         Mamifero m = new Mamifero();
         Reptil r = new Reptil();
         Peixe p = new Peixe();
         Ave a = new Ave();
         
         /*m.setPeso(35.3f);
         m.setCorPelo("Marrom");
         m.alimentar();
         m.locoMover();
         m.emitirSom();
    
         a.locoMover();
         p.locoMover();
         r.locoMover();*/
         
         Canguru ca = new Canguru();
         Cachorro k = new Cachorro();
         Cobra co = new Cobra();
         Tartaruga t = new Tartaruga();
         GoldFish g = new GoldFish();
         Arara e = new Arara();
         
         ca.locoMover();
         k.emitirSom();
         k.abamarRabo();
         k.enterrarOsso();
         t.locoMover();
    }
}
