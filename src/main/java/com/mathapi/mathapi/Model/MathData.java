package com.mathapi.mathapi.Model;
import com.vladmihalcea.hibernate.type.array.ListArrayType;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.Type;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import java.util.List;
import java.util.ArrayList;



@Entity
@Table( name = "mathdata")
@TypeDef(
    name = "list-array",
    typeClass = ListArrayType.class
)
public class MathData {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;

    @Type(type = "list-array")
    @Column( name = "numberList" , columnDefinition = "bigint[]")
    private List<Integer> numberList;

    @Column ( name = "quantifier",columnDefinition = "bigint")
    private Integer quantifier;
   
    @Type(type = "list-array")
    @Column( name = "result" , columnDefinition = "bigint[]")
    private List<Integer> result;

    @Column( name = "averageValue", columnDefinition = "double precision")
    private double average;

    @Column( name = "medianValue", columnDefinition = "double precision")
    private double median;

    @Column( name = "percentileValue", columnDefinition = "double precision")
    private double percentile;

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Integer> getNumberList() {
        return this.numberList;
    }

    public void setNumberList(List<Integer> numberList) {
        this.numberList = numberList;
    }

    public List<Integer> getResult() {
        return this.result;
    }

    public void setResult(List<Integer> result) {
        this.result = result;
    }

    public Integer getQuantifier() {
        return this.quantifier;
    }

    public void setQuantifier(Integer quantifier) {
        this.quantifier = quantifier;
    }

    public double getAverage() {
        return this.average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public double getMedian() {
        return this.median;
    }

    public void setMedian(double median) {
        this.median = median;
    }

    public double getPercentile() {
        return this.percentile;
    }

    public void setPercentile(double percentile) {
        this.percentile = percentile;
    }

}
