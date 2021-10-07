package POO;

import java.text.NumberFormat;

public class conta {

	private String cliente;
	private int agencia;
	private int conta;
	private double saldo;
	
	public conta (String cliente, int agencia, int conta, double saldo)
	{
		this.cliente= cliente;
		this.agencia= agencia;
		this.conta= conta;
		this.saldo=saldo;
	}
	
	

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String formatarMoeda()
	{
		NumberFormat nf= NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda= nf.format(saldo);
		return formatoMoeda;
	}
	
	public void imprimir()
	{
		System.out.println("\nNome: " +cliente);
		System.out.printf("Agência: %d " ,agencia);
		System.out.printf("\nConta: %d" ,conta);
		System.out.println("\nSaldo: " +this.formatarMoeda());
	}
	
	
}
