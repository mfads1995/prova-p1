/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correçãoprova1;

/**
 *
 * @author maria vilma
 */
public class Testa {
    public static void main(String[] args){
        Pessoa p = new Pessoa();
        p.setNome("michael");
        
        Data d = new Data();
        d.setAno(2999);
        d.setDia(04);
        d.setMes(05);
        
        p.setDataDeNascimento(d);
        
        Veiculo v = new Veiculo();
        v.setDataDaAquisiçao(d);
        v.setProprietario(p);
    
    
        p.getMostrar();
        v.getInformarFinalidade("");
        v.getMostrar();
        
     }

    
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
        
        
                
               
        
        
        
        
    }
    

