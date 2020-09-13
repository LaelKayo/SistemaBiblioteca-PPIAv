package br.edu.fafic.ppi.enuns;

public enum Periodo {

	P1(1, "p1"),
	P2(2, "p2"),
	P3(3, "p3"),
	P4(4, "p4"),
	P5(5, "p5"),
	P6(6, "p6"),
	P7(7, "p7"),
	P8(8, "p8");
	
	private Integer chave;
	private String valor;
	
	private Periodo(Integer chave, String valor) {
		this.chave = chave;
		this.valor = valor;
	}
	
	private Periodo() {
		
	}
	
	public Integer getChave() {
		return chave;
	}
	public void setChave(Integer chave) {
		this.chave = chave;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	
	public static Enum<?> toEnum(Integer codigo) {
		for (Periodo p : Periodo.values()) {
			if(codigo.equals(p.getChave())) {
				return p;
			}
		}
		return null;
	}
}
