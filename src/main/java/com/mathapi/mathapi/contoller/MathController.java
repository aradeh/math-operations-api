package com.mathapi.mathapi.contoller;

import java.util.List;
import java.util.Map;

import com.mathapi.mathapi.Model.MathData;
import com.mathapi.mathapi.repository.MathDataRepository;
import com.mathapi.mathapi.service.MathOperations;

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
    @Autowired
    private MathOperations mathoperations;

    public MathController(MathDataRepository mathdataRepository) { this.mathdataRepository = mathdataRepository;}   
    

    @GetMapping("min")
    public ResponseEntity<?> getMinimum(@RequestBody MathData mathdata){
        //return ResponseEntity.ok(mathoperations.calculateMinium(mathdata.getNumberList(),mathdata.getLimit()));     
        return ResponseEntity.ok().body(mathoperations.calculateMinium(mathdata.getNumberList(),mathdata.getLimit()));  
    }

    @GetMapping("max")
    public ResponseEntity<?> getMaximum(@RequestBody MathData mathdata){
        //return ResponseEntity.ok(mathoperations.calculateMax(mathdata.getNumberList(),mathdata.getLimit()));
        return ResponseEntity.ok().body(mathoperations.calculateMax(mathdata.getNumberList(),mathdata.getLimit()));
    }

    @GetMapping("avg")
    public ResponseEntity<Double> getAverage(@RequestBody MathData mathdata){
        //return ResponseEntity.ok( mathoperations.calculateAverage(mathdata.getNumberList()));
        return ResponseEntity.ok().body(mathoperations.calculateAverage(mathdata.getNumberList()));
    }

    @GetMapping("median")
    public ResponseEntity<?> getMedian(@RequestBody MathData mathdata){
        return ResponseEntity.ok().body(mathoperations.calculateMedian(mathdata.getNumberList()) );
    }
}
