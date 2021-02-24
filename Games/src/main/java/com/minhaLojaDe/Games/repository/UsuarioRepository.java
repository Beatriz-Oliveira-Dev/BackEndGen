package com.minhaLojaDe.Games.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.minhaLojaDe.Games.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
		public List<Usuario> findAllByNomeUsuarioContainingIgnoreCase (String nomeUsuario);


}
