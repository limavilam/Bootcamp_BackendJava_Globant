package com.NoticiasEgg.EggNews.repositorios;

import com.NoticiasEgg.EggNews.entidades.Periodista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeriodistaRepositorio extends JpaRepository<Periodista,String> {


}
