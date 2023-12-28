package com.celestin.restfulwebservices.filtering;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


//@JsonIgnoreProperties("Field2")

@JsonFilter("SomeBeanFilter")
public class SomeBean {

    private String field1;

    //@JsonIgnore
    private String Field2;

    //@JsonProperty("custom_name")
    private String Field3;

    public SomeBean(String field1, String Field2, String Field3) {
        this.field1 = field1;
        this.Field2 = Field2;
        this.Field3 = Field3;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return Field2;
    }

    public void setField2(String field2) {
        this.Field2 = field2;
    }

    public String getField3() {
        return Field3;
    }

    public void setField3(String field3) {
        this.Field3 = field3;
    }

    @Override
    public String toString() {
        return "SomeBean{" +
                "field1='" + field1 + '\'' +
                ", getField2='" + Field2 + '\'' +
                ", getField3='" + Field3 + '\'' +
                '}';
    }
}
