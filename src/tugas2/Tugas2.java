/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author asus
 */
public class Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
            int n=5;
   
            for (int a=0;a<n;a++){
                for (int b=0;b<n;b++){
                    if(a==0 ||b==(n-1) || a==(n-1) || b==0){
                        System.out.print("#");
                    }
                    else{      
                        System.out.print("*");
                    }
                }
                System.out.println();    
            }
    }
    
}
