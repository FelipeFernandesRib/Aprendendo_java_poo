package aula13;
public abstract class Animal {
    //Atributos
    protected float peso;
    protected int idade;
    protected int membros;
    
    //Métodos 
    public abstract void emitirSom();
    
    //Métodos Especiais

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
    
}
