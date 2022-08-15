package entities;

public class Fisica extends Pessoa {

	private Double gastoSaude;

	public Fisica() {
		super();
	}

	public Fisica(String name, Double rendaAnual, Double gastoSaude) {
		super(name, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public Double getgastoSaude() {
		return gastoSaude;
	}

	public void setgastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public double imposto() {
		if (getRendaAnual() < 20000.00) {
			return getRendaAnual() * 0.15 - gastoSaude * 0.5;
		} else {
			return getRendaAnual() * 0.25 - gastoSaude * 0.5;
		}
	}

}
