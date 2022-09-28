package com.cesarferracin.springProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cesarferracin.springProject.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	Usuario findByLogin(String login);
}
