package classes;


public class Cadastrocliente {
    private boolean cadastrado;

    
    public Cadastrocliente() {
        this.cadastrado = false; 
    }

  
    public boolean verificarCadastro() {
      
        return cadastrado;
    }

    
    public void cadastrar() {
        
        
        this.cadastrado = true; 
    }
}

    

