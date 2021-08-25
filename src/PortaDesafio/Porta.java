package PortaDesafio;



public class Porta {
	
	
	
	private boolean EstaAberta;
	private String cor;
	private int dimensaoz;
	private int dimensaoy;
	private int dimensaox;



	public void setEstaAberta(boolean estaAberta) {
		EstaAberta = estaAberta;
	}
	
	public boolean getEstaAberta() {
		return this.EstaAberta;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public int getDimensaoz() {
		return dimensaoz;
	}


	public void setDimensaoz(int dimensaoz) {
		this.dimensaoz = dimensaoz;
	}


	public int getDimensaoy() {
		return dimensaoy;
	}


	public void setDimensaoy(int dimensaoy) {
		this.dimensaoy = dimensaoy;
	}


	public int getDimensaox() {
		return dimensaox;
	}


	public void setDimensaox(int dimensaox) {
		this.dimensaox = dimensaox;
	}


	
	
	
	public Porta(String cor,int dimensaoz,int dimensaoy, int dimensaox ) {
		
		
		this.EstaAberta = true;
		
		this.cor = cor;
		this.dimensaoz = dimensaoz;
		this.dimensaoy = dimensaoy;
		this.dimensaox = dimensaox;
		
		
	}
	
	
	public void abrirPorta() {
		this.EstaAberta = true;
		
	}
	
	public void PortaFecha() {
	this.EstaAberta = false;
		
	}
	
	
	public void PintarPorta(String cor ) {
	this.cor = cor;
	}
	
	public boolean estaAberta() {
		return this.EstaAberta;
	}
}
