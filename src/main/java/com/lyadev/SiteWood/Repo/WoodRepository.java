package com.lyadev.SiteWood.Repo;
import com.lyadev.SiteWood.Entity.WoodEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WoodRepository extends CrudRepository<WoodEntity, Long> {
    public List<WoodEntity> findAll();
}
