import static org.junit.Assert.*;

import org.junit.Test;


public class DepositoCombustibleTest {
	
	
	
	//EJERICIO DEPOSITO COMBUSTIBLE. UNIDAD 7. ENTORNOS DESARRROLLO. JOSÉ IGNACIO GARCÍA PRIETO.
	

	// para comprobar el metodo que devuelve el nivel actual del deposito
	
	@Test
	public void testGetDepositoNivel() {
		
		DepositoCombustible mideposito=new DepositoCombustible(200, 100);
		int res =  mideposito.getDepositoNivel();
		assertEquals (res, 100);
		
		
	}
		// para comprobar el metodo para comproba la máxima capacidad del deposito
	@Test
	public void testGetDepositoMax() {
		
		DepositoCombustible mideposito=new DepositoCombustible(200, 100);
		
		int res =  mideposito.getDepositoMax();
		
		assertEquals(200,res);
	}

	
		// para comprobar el método  para saber si el deposito esta vacio
	@Test
	public void testEstaVacio() {

		DepositoCombustible mideposito=new DepositoCombustible(200, 100);
		
		boolean res2 =  mideposito.estaVacio();
		
		assertEquals(false,res2);		
		
	}

		//para comprobar el metodo para saber si el deposito está a la mitad de la capacidad
	
	@Test
	public void testGetDepositoMedio() {
		
		DepositoCombustible mideposito=new DepositoCombustible(200, 100);
		
		int res =  mideposito.getDepositoMax()/2;
		
		assertEquals(100,res);
	}
	
	
	

}



