package com.mathapi.mathapi.contoller;

import java.util.Map;

import com.mathapi.mathapi.Model.MathData;
import com.mathapi.mathapi.repository.MathDataRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MathController {

    @Autowired
    private MathDataRepository mathdataRepository;

    public MathController(MathDataRepository mathdataRepository) { this.mathdataRepository = mathdataRepository;}   

    @GetMapping("min")
    public ResponseEntity<String> getMinimum(@RequestBody MathData mathdata){
        System.out.println("--------------------------------$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println(mathdata.getLimit().toString());
        System.out.println("--------------------------------$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        //final Integer numbersList = body.get("numberList");
        //final Integer limit = body.get("limit");

        return ResponseEntity.ok("Test");       
    }

}
