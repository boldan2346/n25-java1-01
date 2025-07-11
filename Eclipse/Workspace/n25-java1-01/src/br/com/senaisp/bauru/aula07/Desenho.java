package br.com.senaisp.bauru.aula07;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public abstract class Desenho extends JPanel {
	//Criando uma variável estática
	private static int qtdeInstancias=0;
	private static final long serialVersionUID = 1L;
	private int posX;
	private int posY;
	private Color cor;
	//Constructor
	public Desenho(int posX, int posY, Color cor) {
		qtdeInstancias++;//acrescentando a qtdeInstancias
		this.posX=posX;
		this.posY=posY;
		this.cor=cor;
	}
	public Color getCor() {
		return cor;
	}
	public void setCor(Color cor) {
		this.cor = cor;
	}
	public int getPosX() {
		return posX;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	public int getPosY() {
		return posY;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}
	//Metodo abstrato de desenharForma
	protected abstract void desenharForma(Graphics g);
	//Metodo mostrar desenho
	@Override
	public void paint(Graphics g) {
		desenharForma(g);
	}
	//Metodo estático
	public static int getQtdeInstancias() {
		return qtdeInstancias;
	}
	
}
