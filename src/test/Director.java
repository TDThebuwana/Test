package test;


public class Director extends Manager {
    double bonus, EAlloweance;
    
    Director(int emp, String nm, String tel, double bSal, double allowances, double deduction, double bonus, double EAlloweance){
        super(emp,nm,tel,bSal,allowances,deduction);
        this.bonus = bonus;
        this.EAlloweance = EAlloweance;
    }
    
   public void calcNetSalary(){
        super.netSal =  super.basicsalary+this.allowances-this.deduction+this.bonus+this.EAlloweance;
    }
    
}
