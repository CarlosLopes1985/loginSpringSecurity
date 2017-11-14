package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Produto {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idProduto;
	@Column
	private String produto;
	@Column
	private Double preco;
	@Column
	private Integer quantidade;
	
	public Produto() {
	}

	public Produto(Integer idProduto, String produto, Double preco, Integer quantidade) {
		super();
		this.idProduto = idProduto;
		this.produto = produto;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	

	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", produto=" + produto + ", preco=" + preco + ", quantidade="
				+ quantidade + "]";
	}

	public Integer getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
}
