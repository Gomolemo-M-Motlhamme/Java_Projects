/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staffSalary;

/**
 *
 * @author gomim
 */
public class StaffInfos extends Staff {

    @Override
    public double monthlyPayment() 
    {
        double tax = 0;
        switch(getStaff_d().toLowerCase())
        {
            case "cleaner":
                tax = 0.14;
                break;
            
            case "lecturer":
                tax = 0.20;
                break;
            
            case "admin":
                tax = 0.17;
                break;
                
        }
        double r = Double.parseDouble(getRate());
        double hr = Double.parseDouble(getHr_Worked());
        double monthlyPay = Math.round(((r*hr)*52)/12) - (r*tax);
        return monthlyPay;
    }

    @Override
    public String staffDescription() 
    {
        String des = "Hours Worked: "+getHr_Worked()+"\n"+
                     "Staff Number: "+getStaff_n()+"\n"+
                     "Tax Rate: R"+getRate()+"\n"+
                     "Designation: "+getStaff_d()+"\n"+
                     "SALARY: R"+monthlyPayment() ;
        return des;
        
    }

    
}
