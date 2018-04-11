/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infobola.repository;

import com.infobola.entity.Hasil;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author roky.manalu
 */
public interface HasilRepo extends CrudRepository<Hasil, Integer>{
    
    @Query("SELECT h FROM Hasil h")
    public List<Hasil> findAllHasil();

    @Query("SELECT h FROM Hasil h WHERE LOWER(h.hari) LIKE LOWER(:nama)")
    public List<Hasil> findByHari(@Param("nama") String nama);
}
