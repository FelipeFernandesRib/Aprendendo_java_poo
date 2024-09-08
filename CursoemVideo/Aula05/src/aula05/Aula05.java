package aula05;
public class Aula05 {
    public static void main(String[] args) {
       ContaBanco p1 = new ContaBanco();
           p1.setNumConta(01);
           p1.setDono(" Felipe");
           p1.abrirConta("CC");
           
           ContaBanco p2 = new ContaBanco();
           p2.setNumConta(02);
           p2.setDono(" Maria");
           p2.abrirConta("CP");
           
           
           p1.depositar(100);
           p2.depositar(500);
           p2.sacar(100);
           
           p1.sacar(150);
           p1.fecharConta();
           
           p1.estadoAtual();
           p2.estadoAtual();
       }
    
    
}
