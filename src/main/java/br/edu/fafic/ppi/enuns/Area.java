package br.edu.fafic.ppi.enuns;

public enum Area {

	EXATAS(1, "Exatas"), HUMANAS(2, "Humanas");

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

	private Area(Integer codigo, String valor) {
		this.codigo = codigo;
		this.valor = valor;
	}

	public static Enum toEnum(Integer codigo) {
		for (Area a : Area.values()) {
			if (codigo.equals(a.codigo)) {
				return a;
			}
		}
		return null;
	}
}
