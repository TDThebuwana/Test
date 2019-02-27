/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Thisura
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("dfsd");
        Manager m = new Manager(100, "fdsf", "fdsaf", 45.2, 487.2, 45872.2);
        m.calcNetSalary();
        m.displayNetSalary();
    }
}
