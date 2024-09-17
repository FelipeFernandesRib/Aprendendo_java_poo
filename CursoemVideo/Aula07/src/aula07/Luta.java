package aula07;

import java.util.Random;

public class Luta {
    //Atributos
    private Lutador dasafiado;
    private Lutador desafiante;
    private int rouds;
    private boolean aprovada;
    
    //Metódos publicos
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria())
                && l1 != l2){
            this.aprovada = true;
            this.dasafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.dasafiado = null;
            this.desafiante = null;
        }
    }
    
    public void lutar(){
        if (this.aprovada){
            System.out.println("### DESAFIADO ###");
            this.dasafiado.apresentar();
            System.out.println("\n### DESAFIANTE ###");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); //0 1 2
            System.out.println("\n\n====== RESULTADO DA LUTA ======");
            switch(vencedor){
            case 0: //Empate
                System.out.println("Empatou");
                this.dasafiado.empatarLuta();
                this.desafiante.empatarLuta();
                break;
            case 1: //Desafiado vence
                System.out.println("Vitória do " + this.dasafiado.getNome());
                this.dasafiado.ganharLuta();
                this.desafiante.perderLuta();
                break;
            case 2: //Desafiante vence
                System.out.println("Vitória do " + this.desafiante.getNome());
                this.desafiante.ganharLuta();
                this.dasafiado.perderLuta();
            }      
        
            
        } else {
            System.out.println("A luta não pode acontecer");
        }
    }
    //Métodos especiais

    public Lutador getDasafiado() {
        return dasafiado;
    }

    public void setDasafiado(Lutador dasafiado) {
        this.dasafiado = dasafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRouds() {
        return rouds;
    }

    public void setRouds(int rouds) {
        this.rouds = rouds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
    
}
