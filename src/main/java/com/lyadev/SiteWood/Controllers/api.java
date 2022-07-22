package com.lyadev.SiteWood.Controllers;

import com.lyadev.SiteWood.api.Entity.WoodEntity;
import com.lyadev.SiteWood.api.Services.WoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class api {
   @Autowired
    WoodService woodService;

    @PostMapping
    public ResponseEntity create(@RequestBody WoodEntity wood){
        woodService.create(wood);
        return ResponseEntity.ok("Получилось");
    }
}
