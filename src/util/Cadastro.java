package util;

public class Cadastro {
	private String name;
	private String email;
	private String end;
	private double number;
	private double cep;
	
	public Cadastro() {
		
	}
	
	public Cadastro(String name, String email, String end, double number, double cep) {
		this.name = name;
		this.email = email;
		this.end = end;
		this.number = number;
		this.cep = cep;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEnd() {
		return end;
	}
	
	public void setEnd(String end) {
		this.end = end;
	}
	
	public double getNumber() {
		return number;
	}
	
	public void setNumber(double number) {
		this.number = number;
	}
	
	public double getCep() {
		return cep;
	}
	
	public void setCep(double cep) {
		this.cep = cep;
	}
	
	public String toString() {
		return "Dados Cadastrados" + "%n"+
				"Nome: "+ name + "%n" + 
				"Email: " + email + "%n" +
				"Fone: " + number + "%n" +
				"End: " + end + "%n" +
				"CEP: " + cep;
				
	}
}
