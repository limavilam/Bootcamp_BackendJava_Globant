package com.NoticiasEgg.EggNews.repositorios;

import com.NoticiasEgg.EggNews.entidades.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepositorio  extends JpaRepository<Admin,String> {

}
