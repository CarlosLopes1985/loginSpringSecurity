package logica;

public class Correntista {
	
	private Integer id;
	private String nome;
	private Double saldo;
	
	public Correntista() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Correntista(Integer id, String nome, Double saldo) {
		super();
		this.id = id;
		this.nome = nome;
		this.saldo = saldo;
	}


	@Override
	public String toString() {
		return "Correntista [id=" + id + ", nome=" + nome + ", saldo=" + saldo + "]";
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	

}
