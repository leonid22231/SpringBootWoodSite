package com.lyadev.SiteWood;


import com.lyadev.SiteWood.Entity.WoodEntity;
import com.lyadev.SiteWood.Repo.WoodRepository;
import com.lyadev.SiteWood.Service.WoodService;
import com.lyadev.SiteWood.Service.fileservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/v1")
public class TestApi {


    @Autowired
    private WoodService woodService;

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
    public ResponseEntity uploadfile(@RequestParam() MultipartFile file){
        try {
            fileservice.compressImage(file.getBytes(), file.getOriginalFilename());
            return ResponseEntity.ok("Что я сделал " + file.getOriginalFilename());
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Ошибка " + e);
        }
    }

}
