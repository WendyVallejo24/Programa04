/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.programa04;

import java.sql.Connection;

/**
 *
 * @author wbpat
 */
public abstract class TransaccionDB <T> {
    protected T p;
    protected Long id;
    // reciba como parametro el pojo

    protected TransaccionDB(T p) {
        this.p = p;	// agregación o composición
    }
    
    protected TransaccionDB(Long id) {
        this.id = id;	// agregación o composición
    }

    public abstract boolean execute(Connection con);
}
