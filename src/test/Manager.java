package test;


public class Manager extends Employee{
    
    double allowances, deduction;
    
    Manager(int emp, String nm, String tel, double bSal, double allowances, double deduction){
        super(emp,nm,tel,bSal);
        this.allowances = allowances;
        this.deduction = deduction;
    }
    
   public void calcNetSalary(){
        super.netSal =  super.basicsalary+this.allowances-this.deduction;
    }
    
    
}
