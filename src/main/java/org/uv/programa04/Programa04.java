/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package org.uv.programa04;

/**
 *
 * @author wbpat
 */
public class Programa04 {

    public static void main(String[] args) {
        DAOEmpleado dAOEmpleado = new DAOEmpleado();
//		Empleado emp = new Empleado();
//		emp.setClave(10);
//		emp.setNombre("Wendy");
//		emp.setDireccion("El trebol");
//		emp.setTelefono("2721986855");
//
//		dAOEmpleado.create(emp);
                
                Empleado emp = new Empleado();
                emp.setClave(10);
                dAOEmpleado.delete(Long.MAX_VALUE);
    }
}
