
import java.util.Scanner;

/*
 * This is group Musa and Friends
 * Memebers of the group are as follows:
 * 
 * 1) Musa Bojang 1170001
 * 2) Ahmad Trawalley
 * 3) Muhammad Anwar Arif Bin Mohd Khir 1170072
 * 
 * 
 * 
 * 
 * 
 */

public class FirstInFirstOut {
	  int frames =3;
	  int pointer = 0;
	  int hit = 0;
	  int fault = 0;
	  int ref_len;
      int buffer[];
      int reference[];
      int mem_layout[][];
	
	private static Scanner br = new Scanner(System.in);
	public FirstInFirstOut() {
		
	}
	public void replaceMent() {
		
		  System.out.println("The number of Frame is 3: ");
	     
	        
	        System.out.println("Please enter the length of the Reference string: ");
	        this.ref_len = Integer.parseInt(br.nextLine());
	        
	        this.reference = new int[this.ref_len];
	        this.mem_layout = new int[this.ref_len][this.frames];
	        this.buffer = new int[this.frames];
	        
	        for(int j = 0; j < this.frames; j++)
                this.buffer[j] = -1;
	        
	        System.out.println("Please enter the reference string: ");
	        for(int i = 0; i < this.ref_len; i++) {
	            this.reference[i] = Integer.parseInt(br.nextLine());
	        }
	        System.out.println();
	        for(int i = 0; i < this.ref_len; i++) {
	         int search = -1;
	                  for(int j = 0; j < this.frames; j++) {
	                if(this.buffer[j] == this.reference[i]) {
	                 search = j;
	                 this.hit++;
	                 break;
	          } 
	         }
	        
	         if(search == -1)
	         {
	          this.buffer[this.pointer] = this.reference[i];
	          this.fault++;
	          this.pointer++;
	          if(this.pointer == this.frames)
	           this.pointer = 0;
	         }
	            for(int j = 0; j < this.frames; j++)
	                this.mem_layout[i][j] = this.buffer[j];
	        }
	        
	        for(int i = 0; i < this.frames; i++)
	        {
	            for(int j = 0; j < this.ref_len; j++)
	                System.out.printf("%3d ",this.mem_layout[j][i]);
	            System.out.println();
	        }    
	        System.out.println("The number of Faults: " + (this.fault-3));

		
	        
	}
	
	
	

	public static void main(String[] args) {
	
     FirstInFirstOut game = new FirstInFirstOut();
     game.replaceMent();
		
	}

}
