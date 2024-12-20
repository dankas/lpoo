package model;

import java.text.NumberFormat;

public class Automovel {
	//atributos
	private String renavan;
	private String placa;
	private String cor;
	private Integer num_rodas;
	private String combustivel;
	private Integer quilometragem;
	private String chassi;
	private double valor_locacao;
	
	public Automovel() {
		super();
	}

	public Automovel(String renavan, String placa, String cor, Integer num_rodas, String combustivel,
					 Integer quilometragem, String chassi, Double valor_locacao) {
		super();
		this.renavan = renavan;
		this.placa = placa;
		this.cor = cor;
		this.num_rodas = num_rodas;
		this.combustivel = combustivel;
		this.quilometragem = quilometragem;
		this.chassi = chassi;
		this.valor_locacao = valor_locacao;
	}

	public String getRenavan() {
		return renavan;
	}

	public void setRenavan(String renavan) {
		this.renavan = renavan;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getNum_rodas() {
		return num_rodas;
	}

	public void setNum_rodas(Integer num_rodas) {
		this.num_rodas = num_rodas;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public Integer getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(Integer quilometragem) {
		this.quilometragem = quilometragem;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getValor_locacao() {
		return NumberFormat.getCurrencyInstance().format(valor_locacao);
	}

	public void setValor_locacao(double valor_locacao) {
		this.valor_locacao = valor_locacao;
	}

	@Override
	public String toString() {
		return "\nVeiculo [renavan=" + renavan + ", placa=" + placa + ", cor=" + cor + ", num_rodas=" + num_rodas
				+ ", combustivel=" + combustivel + ", quilometragem=" + quilometragem + ", chassi=" + chassi
				+ ", valor_locacao=" + NumberFormat.getCurrencyInstance().format(valor_locacao) + "]";
	}
	
}
