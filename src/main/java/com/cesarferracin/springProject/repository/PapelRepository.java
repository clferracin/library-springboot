package com.cesarferracin.springProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cesarferracin.springProject.model.Papel;

public interface PapelRepository extends JpaRepository<Papel, Long> {
	Papel findByPapel(String papel);
}
