package SOBRECARGA;

public class Operacao {
	
	private int nroGenerico1 = 0;                                     
	private int nroGenerico2 = 0;
	 
	// UNIFIQUEI AS VARIÁVEIS REMOVENDO AS VARIÁVEIS nmrMinuendo,nmrSubtraendo e nmrFatorial, PELO MOTIVO DE NÃO ACHAR ELAS NECESSÁRIAS,
	// POR CAUSA QUE DA PARA FAZER AS OPERAÇÕES USANDO SÓ nroGenerico1 E nroGenerico2;
	
	public int soma(int numero1, int numero2) {
		return numero1 + numero2;
	}
	
		
	public int subtracao() {
		return nroGenerico1 - nroGenerico2;
	}
	
	
	private int fatorialRecursivo(int numero) {
		if ((numero ==1) || (numero ==0)) {
			return 1;
		} else {
			return fatorialRecursivo(numero-1)*numero;      
				
		}
	}	
		
    public int getFatorial() {
    	return fatorialRecursivo(nroGenerico1); 
    }
    
    public int multiplicacao() {
    	return this.nroGenerico1 * this.nroGenerico2;
    }
    
    public void setNumeroGenerico1(int numero) {
    	this.nroGenerico1 = numero;
    }
    
    public void setNumeroGenerico2(int numero) {
    	this.nroGenerico2 = numero;
    }
    
    public double divisao() {
    	return this.nroGenerico1 / this.nroGenerico2;
    }
    
    public int soma(int numero1, int numero2, int numero3) {
    	return numero1 + numero2 + numero3;  
    }
    
    public int soma(String numero1, String numero2) {
    	return Integer.parseInt(numero1) + Integer.parseInt(numero2); 
    }
    
    
 // MÉTODO QUE USEI PARA CALCULAR A EXPONENCIAÇÃO;
    
    public double exponenciacao() {  
        return Math.pow(nroGenerico1, nroGenerico2); 
     
        
                   
    }
        	
}