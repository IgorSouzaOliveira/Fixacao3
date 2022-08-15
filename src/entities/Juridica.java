package entities;

public class Juridica extends Pessoa {

	private Integer numPessoa;

	public Juridica() {
		super();
	}

	public Juridica(String name, Double rendaAnual, Integer numPessoa) {
		super(name, rendaAnual);
		this.numPessoa = numPessoa;
	}

	public Integer getNumPessoa() {
		return numPessoa;
	}

	public void setNumPessoa(Integer numPessoa) {
		this.numPessoa = numPessoa;
	}

	@Override
	public double imposto() {
		if (numPessoa > 10) {
			return getRendaAnual() * 0.14;

		} else {
			return getRendaAnual() * 0.16;

		}

	}

}
