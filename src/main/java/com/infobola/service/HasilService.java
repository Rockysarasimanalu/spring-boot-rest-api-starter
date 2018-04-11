/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infobola.service;

import com.infobola.entity.Hasil;
import com.infobola.repository.HasilRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author roky.manalu
 */
@Service("hasilservice")
@Transactional
public class HasilService {
    
    @Autowired
    private HasilRepo repo;
    
    public Hasil insert(Hasil hasil){
        return repo.save(hasil);
    }
    
    public Hasil findById(Integer id){
        return repo.findOne(id);
    }
    
    public List<Hasil> findAll(){
        return repo.findAllHasil();
    }
    
    public List<Hasil> findByHari(String nama){
        return repo.findByHari("" +nama+ "");
    }
    
    public boolean delete(Integer id){
        repo.delete(id);
        return true;
    }
}
