package com.lyadev.SiteWood;


import com.lyadev.SiteWood.Entity.WoodEntity;
import com.lyadev.SiteWood.Storage.StorageService;
import com.lyadev.SiteWood.Service.WoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.awt.*;
import java.io.IOException;

@RestController
@RequestMapping("/api/v1")
public class TestApi {
    private final StorageService storageService;

    @Autowired
    private WoodService woodService;
    @Autowired
    public TestApi(StorageService storageService) {
        this.storageService = storageService;
    }

    @PostMapping("/add")
    public ResponseEntity create(@RequestBody WoodEntity wood){
        woodService.create(wood);
        return ResponseEntity.ok("Получилось id = " + wood.getId());
    }
    @GetMapping("/get")
    public ResponseEntity get(@RequestParam Long id){
        try {
            return ResponseEntity.ok(woodService.get(id));
        }catch (Exception e) {
            return ResponseEntity.badRequest().body("Ошибка " + e);
        }
    }
    @GetMapping("/getAll")
    public ResponseEntity getAll(){
        try {

            return ResponseEntity.ok(woodService.getAll());
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Ошибка " + e);
        }

    }
    @DeleteMapping("/delete")
    public ResponseEntity delete(@RequestParam Long id){
        try {
            woodService.delete(id);
            return ResponseEntity.ok("Удалён id = " + id);
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Ошибка "+ e);
        }
    }
    @PostMapping("/file")
    public ResponseEntity uploadfile(@RequestParam("file") MultipartFile file){
        try {
            storageService.store(file);
            return ResponseEntity.ok("Что я сделал " + file.getOriginalFilename());
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Ошибка " + e);
        }
    }
    @GetMapping("/file/{filename:.+}")
    @ResponseBody
    public ResponseEntity<Resource> serveFile(@PathVariable String filename) throws IOException {

        Resource file = storageService.loadAsResource(filename);
        System.out.println(file.getURL());
        return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(file);
    }


}
