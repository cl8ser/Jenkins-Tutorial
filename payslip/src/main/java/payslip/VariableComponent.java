package payslip;

/*
* Gauno 
* Another comment
* Bug in Feature1
*/
public class VariableComponent {

   private double variable;

   // constructor
   public VariableComponent(){
	  
	  FixedComponent var = new FixedComponent();
      this.variable = ((var.totalFixedComponent()) * 10)/100;
   }
      
   // prints the variable pay
   public double printVariable(){
      System.out.println(variable);
      return variable;
   }   
} 
