package com.NoticiasEgg.EggNews.repositorios;

import com.NoticiasEgg.EggNews.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, String> {

    @Query("SELECT u FROM Usuario u WHERE u.nombreUsuario = :nombre")
    Usuario buscarPorNombreUsuario(@Param("nombre") String nombre);

    @Modifying
    @Query("UPDATE Usuario u SET u.rol = 'Periodista' WHERE u.id = :id")
    void updateRoleToPeriodista(@Param("id") String id);

    @Modifying
    @Query("UPDATE Usuario u SET u.rol = 'Usuario' WHERE u.id = :id")
    void updateRoleToUsuario(@Param("id") String id);
}

