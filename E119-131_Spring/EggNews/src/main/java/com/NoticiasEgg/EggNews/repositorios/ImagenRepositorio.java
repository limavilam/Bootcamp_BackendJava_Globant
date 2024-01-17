package com.NoticiasEgg.EggNews.repositorios;

import com.NoticiasEgg.EggNews.entidades.Imagen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImagenRepositorio extends JpaRepository<Imagen,String> {
}
