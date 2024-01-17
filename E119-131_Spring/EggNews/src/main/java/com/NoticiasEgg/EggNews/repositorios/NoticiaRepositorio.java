package com.NoticiasEgg.EggNews.repositorios;

import com.NoticiasEgg.EggNews.entidades.Noticia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoticiaRepositorio extends JpaRepository<Noticia, String> {

    List<Noticia> findByTituloContainingIgnoreCase(String keyword);

    @Query("UPDATE Noticia n SET n.publicado = :publicado WHERE n.id = :id")
    @Modifying
    public void updatePublishedStatus(String id, Boolean publicado);
}

