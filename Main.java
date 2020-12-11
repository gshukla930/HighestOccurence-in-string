import java.util.*;

class Main{
    
    static char re;
    public static Character frequency(String str){
        int n = str.length();
        int i, j, count=1, max=0;
        char c;
        
        for(i=0; i<n; i++){
            c=str.charAt(i);
            
            for(j=0; j<n; j++){
                if(i==j){
                    break;
                }
                
                else if(str.charAt(i)== str.charAt(j)){
                    count++;
                }
            }
            if(max < count){
                max = count;
                re= str.charAt(i);
            }
        }
        return re;
    }
    
    //driver
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String st = sc.nextLine();
        System.out.println(frequency(st));
    }
}
