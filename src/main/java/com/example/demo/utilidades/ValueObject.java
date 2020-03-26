/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.utilidades;

import java.io.Serializable;

/**
 *
 * @author Simon
 */
public interface ValueObject<T> extends Serializable {

    boolean sameValueAs(T other);

}
