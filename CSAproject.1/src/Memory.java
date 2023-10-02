import java.util.Arrays;

//Class Memory implements the Memory Objects.
public class Memory {
    
    private int[][] memory_value;
    
    public Memory(){
        //Memory consists of 2048 words each of which is 16 bits.
        this.memory_value = new int[2048][16];
    }
    

    //Function to get value from Memory.
    public int[] getMemoryValue(int row){
        //Return the 16 bit value stored at row.
       return Arrays.copyOfRange(this.memory_value[row],0,16);
    }
    
 
    //Function to set a value in Memory.
    public void setMemoryValue(int row, int[] value){
        System.arraycopy(value, 0, this.memory_value[row], 0, 16);
    }
    
}
