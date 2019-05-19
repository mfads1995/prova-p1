
package correçãoprova1;


public class Veiculo {
    private  Pessoa proprietario;
    private Data dataDaAquisiçao;
    private String finalidade;
    
    public void getMostrar(){
        System.out.println("o proprietario é: " + this.proprietario);
        System.out.println("a data de aquisição foi :" + this.dataDaAquisiçao);
        System.out.println("a finadade e:" + this.finalidade);
        
    }
    public Pessoa getProprietario(){
        return this.proprietario;
        }
    public Data getDataDaAquisiçao(){
        return this.dataDaAquisiçao;
        
    }
    public String getFinalidade(){
        return this.finalidade;
    }
    
    public void setProprietario(Pessoa po){
        this.proprietario = po;    
    }
    public void setDataDaAquisiçao(Data da){
        this.dataDaAquisiçao = da;
    }
    public void setFinalidade(String f){
        this.finalidade = f;
    }
    
    public boolean getInformarFinalidade(String f){
        f = this.finalidade;
        if(f.equals("passeio")){
            return true;
        }
        if(f.equals( "diplomacia")){
            return true;
        } 
        if(f.equals("aluguel")){
        return true;
    } 
        else{
            return false;
            }
        
    }
    
    
    
}
