package test;


public class Employee {
    int Empno;
    String name;
    String telephone;
    double basicsalary;
    int othrs;
    double otrate;
    double netSal;
    
    Employee(int emp, String nm, String tel, double bSal){
        Empno = emp;
        name = nm;
        telephone = tel;
        basicsalary = bSal;
    }
    
    Employee(int emp, String nm, String tel, double bSal, int otH, double otR){
        Empno = emp;
        name = nm;
        telephone = tel;
        basicsalary = bSal;
        othrs = otH;
        otrate = otR;
    }
    
    public void calcNetSalary(){
        netSal =  basicsalary+(othrs*otrate);
    }
    
    public void displayNetSalary(){
        
        System.out.println(netSal);
    }
    
    
    
}
