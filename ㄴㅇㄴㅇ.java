package classpart;

public class ㄴㅇㄴㅇ {

	public static void main(String[] args) {

        for(var i= 2; i<=100;i++){
        	int temp=0;
            for(var j=2;j<=i;j++){
                if(i%j==0){
                	temp=1;
                    break;
                	}
                }
            if(temp==0) {
            	System.out.println(i+" ");
            }  
          }
            
            
    }   
}   



	