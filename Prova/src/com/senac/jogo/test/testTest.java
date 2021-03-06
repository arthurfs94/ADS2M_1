package com.senac.jogo.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.senac.jogo.Comandos;

public class testTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testPosicao() {
		Comandos comd = new Comandos();
		assertTrue(comd.posicao == 0);
	}
	@Test
	public void testTanque() {
		Comandos comd = new Comandos();
		assertTrue(comd.tanque == 6);
	}
	@Test
	public void testAndarUmaCasa() {
		Comandos comd = new Comandos();
		assertTrue(comd.AndarUmaCasa());
	}
	@Test
	public void testReduzirUmaCasa() {
		Comandos comd = new Comandos();
		assertTrue(comd.ReduzirUmaCasa());
	}
	@Test
	public void testReduzirTanque() {
		Comandos comd = new Comandos();
		assertTrue(comd.ReduzirTanque());
	}
	@Test
	public void testCarregarTanque() {
		Comandos comd = new Comandos();
		assertTrue(comd.CarregarTanque());
	}
	@Test
	public void testCarregarTanqueApenasNaCasaInicial() {
		Comandos comd = new Comandos();
		assertTrue(comd.CarregarTanqueApenasNaCasaInicial());
	}
	

}
