/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correçãoprova1;

/**
 *
 * @author ifnmg
 */
public class Data {
    
    private int dia;
    private int mes;
    private int ano;
    
    public void getMostrar(){
        
        System.out.println(dia + "/" + mes + "/" + ano);
    }
    
    public int getDia(){
        
        return this.dia;
}
    public int getMes(){
        return this.dia;
    }
    public int getAno(){
        return this.ano;
    }
    
    public void setDia(int di){
        this.dia = di;     
    }
    public void setMes(int m){
        this.mes = m;
        
    }
    public void setAno(int a){
        this.ano = a;
    }
}
