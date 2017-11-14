package manager;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;

import entity.Produto;
import entity.Usuario;
import persistence.ProdutoDao;
import persistence.UsuarioDao;

@ManagedBean(name = "mb")
@SessionScoped
public class ManagerBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManagedProperty(value = "#{produtoDaoSpring}") // com espaço
	private ProdutoDao produtoDao;

	@ManagedProperty(value = "#{usuarioDaoSpring}")
	private UsuarioDao usuarioDao; // com espaço

	private List<Produto> lista;

	// para receber o usuario logado na session do spring
	private Usuario logado;

	@PostConstruct
	public void init() {
		logado = new Usuario();
		// buscando a sessao do SPring -- contexto do Spring Security
		SecurityContext context = SecurityContextHolder.getContext();
		// busco quem esta autenticado nesta sessao
		Authentication userLogado = context.getAuthentication();
		// busca o userName de quem esta logado(Spring)
		logado.setLogin(((User) userLogado.getPrincipal()).getUsername());

	}

	public Usuario getLogado() {
		return logado;
	}

	public void setLogado(Usuario logado) {
		this.logado = logado;
	}

	public ProdutoDao getProdutoDao() {
		return produtoDao;
	}

	public void setProdutoDao(ProdutoDao produtoDao) {
		this.produtoDao = produtoDao;
	}

	public UsuarioDao getUsuarioDao() {
		return usuarioDao;
	}

	public void setUsuarioDao(UsuarioDao usuarioDao) {
		this.usuarioDao = usuarioDao;
	}

	public List<Produto> getLista() {
		try {
			lista = produtoDao.findAll();
		} catch (Exception ex) {
		}
		return lista;
	}

	public void setLista(List<Produto> lista) {
		this.lista = lista;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
