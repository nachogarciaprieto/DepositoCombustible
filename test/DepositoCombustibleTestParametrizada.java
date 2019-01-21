
import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
import org.junit.runner.*;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class DepositoCombustibleTestParametrizada {
	
		//variables o atributos
	 	private int depMax;
	    private int depNivel;
	   
	    
	    //metodo constructor
	    public DepositoCombustibleTestParametrizada(int tankMax, int tankLevel) {
	    	
	    	this.depMax   = tankMax;
	        this.depNivel = tankLevel;	
	        
	       
	    	
	    }
	
	    @Parameters //aquí van las baterias de pruebas
	    public static Collection<Object[]>numeros(){
	    	
	    	return Arrays.asList(new Object [][] {
	    		
	    		{120, 50, 170}, {200, 100, null}, {100, -50, 50}
	    		
});
	    			
	    			
	    			
	    	
	    }
	
	    	@Test
	     public void fill(int amount){
	    		
	    	
	    		DepositoCombustibleTestParametrizada mideposito= new DepositoCombustibleTestParametrizada(200, 120);
	    	
	    		depNivel = depNivel + amount;
	    		
	    		assertEquals(depNivel, 120 + amount);
	    	    
	     }
	  
	     
	     
	     @Test
	     public void consumir(int amount){
	 	    		
	    		    	
	 	    	DepositoCombustibleTestParametrizada mideposito= new DepositoCombustibleTestParametrizada(200, 120);
	 	    	
	 	    	depNivel = depNivel - amount;
	 	    	
	 	    	assertEquals(depNivel, 120 - amount);
	    	
	
	     }
	
	
	
	
	
	
	
	
	

}
