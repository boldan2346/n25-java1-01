package br.com.senaisp.bauru.aula07;

import java.awt.Color;
import java.awt.Graphics;

public class Retangulo extends Desenho {
	private int comprimento;
	private int largura;

	private static final long serialVersionUID = 1L;

	public Retangulo(int posX, int posY,int comp, int larg, Color cor) {
		super(posX, posY, cor);
		comprimento=comp;
		largura=larg;
	}

	public int getComprimento() {
		return comprimento;
	}

	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}

	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	@Override
	protected void desenharForma(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(getCor());
		g.fillRect(getPosX(), getPosY(),getComprimento(),getLargura());

	}

}
