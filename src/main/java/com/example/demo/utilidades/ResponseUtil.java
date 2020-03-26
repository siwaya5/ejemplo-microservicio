/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.utilidades;

import com.fasterxml.jackson.databind.JsonNode;
import java.util.List;

/**
 *
 * @author Simon
 */
public class ResponseUtil {

    private String message;
    private Integer tipo;
    private List<JsonNode> responseList;
    private String json;
    private JsonNode objectResponse;
    private Object object;

    public ResponseUtil() {
    }

    public ResponseUtil(String message, Integer tipo, List<JsonNode> responseList, String json, JsonNode objectResponse, Object object) {
        this.message = message;
        this.tipo = tipo;
        this.responseList = responseList;
        this.json = json;
        this.objectResponse = objectResponse;
        this.object = object;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public List<JsonNode> getResponseList() {
        return responseList;
    }

    public void setResponseList(List<JsonNode> responseList) {
        this.responseList = responseList;
    }

    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }

    public JsonNode getObjectResponse() {
        return objectResponse;
    }

    public void setObjectResponse(JsonNode objectResponse) {
        this.objectResponse = objectResponse;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
    
    

}
