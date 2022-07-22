package com.lyadev.SiteWood.api.Repositorys;
import com.lyadev.SiteWood.api.Entity.WoodEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WoodRepository extends CrudRepository<WoodEntity, Long> {
}
