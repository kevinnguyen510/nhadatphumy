package net.phumyreal.nhadatphumybackend.controllers;

import net.phumyreal.nhadatphumybackend.models.EstateVO;
import net.phumyreal.nhadatphumybackend.services.EstateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/estate")
public class EstateController {
    @Autowired
    EstateService estateService;
    @GetMapping
    public List<EstateVO> getEstate(@RequestBody HashMap<String, Object> data){
        return estateService.selectEstate(data);
    }
}
