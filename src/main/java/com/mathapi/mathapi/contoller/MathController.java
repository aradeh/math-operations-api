package com.mathapi.mathapi.contoller;

import java.util.List;
import java.util.Map;

import com.mathapi.mathapi.Model.MathData;
import com.mathapi.mathapi.repository.MathDataRepository;
import com.mathapi.mathapi.service.MathOperations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
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

    public MathController(MathDataRepository mathdataRepository) {
        this.mathdataRepository = mathdataRepository;
    }

    @GetMapping("min")
    public ResponseEntity<?> getMinimum(@RequestBody MathData mathdata){
        mathdata.setResult(mathoperations.calculateMinium(mathdata.getNumberList(),mathdata.getQuantifier()));
        this.mathdataRepository.save(mathdata);
        return ResponseEntity.ok().body(mathdata.getResult());
    }

    @GetMapping("max")
    public ResponseEntity<?> getMaximum(@RequestBody MathData mathdata){
        mathdata.setResult(mathoperations.calculateMax(mathdata.getNumberList(),mathdata.getQuantifier()));;
        this.mathdataRepository.save(mathdata);
        return ResponseEntity.ok().body(mathdata.getResult());
    }

    @GetMapping("avg")
    public ResponseEntity<Double> getAverage(@RequestBody MathData mathdata){
        mathdata.setAverage(mathoperations.calculateAverage(mathdata.getNumberList()));
        this.mathdataRepository.save(mathdata);
        return ResponseEntity.ok().body(mathdata.getAverage());
    }

    @GetMapping("median")
    public ResponseEntity<?> getMedian(@RequestBody MathData mathdata){
        mathdata.setMedian(mathoperations.calculateMedian(mathdata.getNumberList()));
        this.mathdataRepository.save(mathdata);
        return ResponseEntity.ok().body(mathdata.getMedian());
    }

    @GetMapping("percentile")
    public ResponseEntity<?> getPercentile(@RequestBody MathData mathdata){
        mathdata.setPercentile(mathoperations.calculatePercentile(mathdata.getNumberList(), mathdata.getQuantifier()));
        this.mathdataRepository.save(mathdata);
        return ResponseEntity.ok().body(mathdata.getPercentile());
    }
}
