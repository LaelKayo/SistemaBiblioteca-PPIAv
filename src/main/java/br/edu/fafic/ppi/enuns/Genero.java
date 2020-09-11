package br.edu.fafic.ppi.enuns;

public enum Genero {

	MASCULINO(1, "Masculino"), FEMININO(2, "Feminino");

	private Integer codigo;
	private String valor;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	private Genero(Integer codigo, String valor) {
		this.codigo = codigo;
		this.valor = valor;
	}

	public static Enum toEnum(Integer codigo) {
		for (Genero g : Genero.values()) {
			if (codigo.equals(g.codigo)) {
				return g;
			}
		}
		return null;
	}
}
