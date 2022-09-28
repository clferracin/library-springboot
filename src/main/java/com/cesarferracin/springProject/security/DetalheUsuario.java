package com.cesarferracin.springProject.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.cesarferracin.springProject.model.Papel;
import com.cesarferracin.springProject.model.Usuario;


public class DetalheUsuario implements UserDetails {
	
	private Usuario usuario;	

	public DetalheUsuario(Usuario usuario) {
		super();
		this.usuario = usuario;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<Papel> papeis = usuario.getPapeis();
		List<SimpleGrantedAuthority> authorities = new ArrayList<>();
		
		for(Papel papel: papeis) {
			SimpleGrantedAuthority sga = new SimpleGrantedAuthority(papel.getPapel());
			authorities.add(sga);
		}	
		return authorities;
	}

	@Override
	public String getPassword() {
		return usuario.getPassword();
	}

	@Override
	public String getUsername() {
		return usuario.getLogin();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return usuario.isAtivo();
	}
	
	//Método que retorna o nome do usuário, usado para colocar na nav superior direita
	public String getNome() {
		return usuario.getNome();
	}

}
