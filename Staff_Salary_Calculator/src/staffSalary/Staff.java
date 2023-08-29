/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staffSalary;

import javax.swing.JOptionPane;

/**
 * will determine the monthly payment amount of and return a specific staff description.
 * 
 */
abstract class Staff 
{
    String staff_d;
    String staff_n;
    String rate;
    String hours_worked;
    
    enum Profession 
    {
    Cleaner,
    Lecturer,
    Admin
    }
    public String getStaff_d()
    {
        return staff_d;
    }
    
    public void setStaff_d()
    {
        String inputStaff_D = JOptionPane.showInputDialog("Enter Staff descrption");
        if( inputStaff_D.equals(Profession.Cleaner.toString().toLowerCase()))
        {
            staff_d = inputStaff_D;
        }
        
        else if(inputStaff_D.equals(Profession.Lecturer.toString().toLowerCase()))
        {
            staff_d = inputStaff_D;
        }
        
        else if(inputStaff_D.equals(Profession.Admin.toString().toLowerCase()))
        {
            staff_d = inputStaff_D;
        }
        else
        {
           JOptionPane.showMessageDialog(null,"The Profession '"+staff_d+"' is not in this department"); 
        }
        
    }
    
    public String getStaff_n()
    {
        return staff_n;
    }
    
    public void setStaff_n()
    {
        int input_Staff_N = Integer.parseInt(JOptionPane.showInputDialog("Enter Staff number"));
        staff_n = String.valueOf(input_Staff_N);
    }
    
    public String getRate()
    {
        return rate;
    }
    
    public void setRate()
    {
        int input_rate = Integer.parseInt(JOptionPane.showInputDialog("Enter Staff rate"));
        if(input_rate <= 500)
        {
            rate = String.valueOf(input_rate);
        }
        
        else
        {
            JOptionPane.showMessageDialog(null,"No staff will be paid more than 500 per hour");
            setRate();
        }
    }
    
    public String getHr_Worked()
    {
        return hours_worked;
    }
    
    public void setHr_Worked()
    {
        int input_hrWorked = Integer.parseInt(JOptionPane.showInputDialog("Enter Staff worked hours"));
        if(input_hrWorked <= 200)
        {
            this.hours_worked = String.valueOf(input_hrWorked);
        }
        
        else
        {
            JOptionPane.showMessageDialog(null,"No staff will work more than 200 hours per month");
            setHr_Worked();
        }
    }
    
    public abstract double monthlyPayment ();
    
    
    public abstract String staffDescription ();
    
}
