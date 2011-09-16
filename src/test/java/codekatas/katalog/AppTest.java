package codekatas.katalog;

import static org.junit.Assert.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.apache.commons.io.FileUtils;

/*
 * 
 * OBJETIVO: 
 * 1 - Hacer que la clase Log permita no sólo persistir en fichero, sino también enviar las lineas por mail.
 * 2 - nota: no perderemos el tiempo codificando el envío de mails, sino que haremos un System.out.println y tan felices.
 * 
  	WORKING WITH LEGACY CODE (kata log)
	1 - TESTING DE INTEGRACIÓN
	2 - REFACTORIZAR
	3 - BAJAR A NIVEL UNITARIO (¿¿mockito??)
	4 - AÑADIR FUNCIONALIDAD
 * */

/*
  	PISTAS:
	0 - good naming
	1 - composition over inheritance
	2 - code smell: primitive obsession
	3 - code smell: feature envy
 * */

public class AppTest 
{

	//@Test
	public void testName() throws Exception {
		
		List<String> errores = new ArrayList<String>();		
		errores.add("error 1");
		errores.add("error 2");
		
		Log filelog = new Log();
		filelog.persist(errores);
		
	}
	
	@Test
	public void small_tip() throws Exception {
		
		File file1 = new File("/Users/user/Desktop/file1.txt");
		File file2 = new File("/Users/user/Desktop/file2.txt");
		File file1copia = new File("/Users/user/Desktop/file1copia.txt");
		assertFalse("The files differ!", FileUtils.contentEquals(file1, file2));
		assertTrue("The files differ!", FileUtils.contentEquals(file1, file1copia));

	}

}
