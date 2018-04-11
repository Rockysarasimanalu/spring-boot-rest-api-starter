package com.infobola.controller;

import com.infobola.dto.SearchData;
import com.infobola.entity.Hasil;
import com.infobola.service.HasilService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author roky.manalu
 */
@RestController
@RequestMapping("/api/infobola/hasil")
public class HasilController {
    
    @Autowired
    private HasilService services;
    
    @RequestMapping(method = RequestMethod.POST)
    public Hasil insert(@RequestBody Hasil hasil){
        return services.insert(hasil);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Hasil findById(@PathVariable Integer id){
        return services.findById(id);
    }
    
    @RequestMapping(method = RequestMethod.DELETE,value = "/{id}")
    public boolean deleteById(@PathVariable Integer id){
        return services.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Hasil> findAll(){
        return services.findAll();
    }
    
    @RequestMapping(method = RequestMethod.POST, value = "/search")
    public List<Hasil> findByHari(@RequestBody SearchData searchData){
        return services.findByHari(searchData.getSearchKey());
    }
}
