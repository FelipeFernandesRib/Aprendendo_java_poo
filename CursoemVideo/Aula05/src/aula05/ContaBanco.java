package aula05;
 public class ContaBanco {
    
     public int numConta;
     protected String tipo;
     private String dono;
     private float saldo;
     private boolean status;
     
     public void estadoAtual(){
         System.out.println("-----------------------------");
         System.out.println("Conta" + this.getNumConta());
         System.out.println("Tipo " + this.getTipo());
         System.out.println("dono" + this.getDono());
         System.out.println("Saldo " + this.getSaldo());
         System.out.println("Status " + this.getStatus());
         
     }
     // metódo construtor
     public ContaBanco(){
         this.saldo = 0;
         this.status = false;
     }
     
     
     public int getNumConta(){
         return this.numConta;
     }     
     public void setNumConta(int nc){
         this.numConta = nc;
     }
     
     public String getTipo(){
         return this.tipo;
     }
     public void setTipo(String t){
         this.tipo = t;
     }
     
     public String getDono(){
         return this.dono;
     }
     public void setDono(String d){
         this.dono = d;
     }
     
     public float getSaldo(){
         return this.saldo;
     }
     public void setSaldo(float s){
         this.saldo = s;
     }
     
     public boolean getStatus(){
         return this.status;
     }
     public void setStatus(boolean st){
         this.status = st;
     }
     
     public void abrirConta(String t){
         this.setTipo(t);
         this.setStatus(true);
         if (t == "CC"){
            this.setSaldo(50.00f);  
         } 
         else if (t == "CP"){
            this.setSaldo(150.00f);
         }  
         System.out.println("Conta aberta com sucesso");
     }
     
     public void fecharConta(){
         if (getSaldo() > 0 || saldo < 0){
             System.out.println("Não é possível fechar uma conta com valores em aberto");
         }
         //else if (saldo < 0){
             //System.out.println("Não é possível fechar uma conta com saldo negativo");
         //}
         else{
         System.out.println("Conta fechada");
         setStatus(false);
     }
             
     }
     
     public void depositar(float s){
         if (getStatus() == true) {
         this.setSaldo(getSaldo() + s);
             System.out.println("Deposito realizado com sucesso na conta de: " + this.getDono());
         }
         else{
             System.out.println("Não é possivel depositar dinheiro em uma conta fechada");
         }
     }
     
     public void sacar(float s){
         if (getStatus() == true && saldo >= s){
             this.setSaldo(getSaldo() - s); 
             System.out.println("Saque realizado na conta de " + this.getDono());
             System.out.println("Saldo atual " + this.getSaldo() + " na conta de " + this.getDono());
         }
         else if (status == false){
             System.out.println("Não é possivel sacar dinheiro de conta fechada");
         }
         else if(getSaldo()<= 0.00f){
             System.out.println("Não é possivel sacar dinheiro de uma conta com saldo negativo ou zerado");  
         }
         else{
             System.out.println("Não é possível realizar um saque maior do que o saldo atual da conta");
         }
     }
     
     public void pagarMensal(){
         float v = 0;
         if (getTipo() == "CC"){
             v = 12;
         }
         else if (getTipo() == "CP"){
             v = 20;
         }
         if(status == true){
             this.setSaldo(this.getSaldo() - v);
              System.out.println("Mensalidade paga com sucesso por " + this.getDono());
         }
         else{
             System.out.println("Não é possível pagar a mensalidade de uma conta fechada");
         }
     }
         
}
