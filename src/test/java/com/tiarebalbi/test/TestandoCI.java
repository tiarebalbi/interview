package com.tiarebalbi.test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class TestandoCI {

	@Test
	public void deveTestarCIComAmbienteDeDesenvolvimento() {
		Double dados = new Double(2);
		assertEquals(dados, new Double(2));
	}
	
	@Test
	public void deveRodarSozinhoBuild() {
		Double dados = new Double(3);
		Assert.assertNotEquals(dados, new Double(2));
	}


}
