
 //Class Register implements the Register Objects.
 

public class Register {
    
   //Variables to represent the value and size in the Registers.
   private int register_value[];
   private int register_size = 0;
   
   //Constructor
   public Register(int size){
       initRegisterSize(size);
   }
   
    //Function to get the value of the register
   public int[] getRegisterValue(){
       return register_value;
   }
   
    //Function to get the size of the register
   public int getRegisterSize(){
       return register_size;
   }
   
    //Function to set value of the register
   public void setRegisterValue(int[] new_value){
       if (this.register_size == 0){
           System.out.print("Register size zero error");
       }
       else{
           this.register_value = new_value;
       }
      
   }
   
    //Function to set the size of the register
   private void initRegisterSize(int register_size){
       this.register_size = register_size;
       this.register_value = new int[register_size];
       
   }
}

