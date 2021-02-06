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
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Type(type = "list-array")
    @Column( name = "numberList" , columnDefinition = "bigint[]")
    private List<Integer> numberList;

    public List<Integer> getNumberList() {
        return this.numberList;
    }

    public void setNumberList(List<Integer> numberList) {
        this.numberList = numberList;
    }

    @Column ( name = "limit")
    private Integer limit;

    public Integer getLimit() {
        return this.limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Type(type = "list-array")
    @Column( name = "result" , columnDefinition = "bigint[]")
    private List<Integer> result;

    public List<Integer> getResult() {
        return this.result;
    }

    public void setResult(List<Integer> result) {
        this.result = result;
    }
    

}
