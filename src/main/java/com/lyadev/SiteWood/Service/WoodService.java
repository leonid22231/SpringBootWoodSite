package com.lyadev.SiteWood.Service;


import com.lyadev.SiteWood.Entity.WoodEntity;
import com.lyadev.SiteWood.Repo.WoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WoodService {

    @Autowired
    private WoodRepository woodRepository;

    public WoodEntity create(WoodEntity wood){
        return woodRepository.save(wood);
    }
    public WoodEntity get(Long id){return woodRepository.findById(id).get();}
    public Long delete(Long id){woodRepository.deleteById(id);return id;}
    public List<WoodEntity> getAll(){return woodRepository.findAll();}
}
