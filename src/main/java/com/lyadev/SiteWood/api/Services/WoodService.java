package com.lyadev.SiteWood.api.Services;

import com.lyadev.SiteWood.api.Entity.WoodEntity;
import com.lyadev.SiteWood.api.Repositorys.WoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WoodService {
    //@Autowired
    WoodRepository woodRepository;

    public WoodEntity create(WoodEntity wood){
        return woodRepository.save(wood);
    }
}
