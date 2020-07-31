import java.lang.Math; 
public class WhileLoop(
    public static void main(String[] args){
        int outerloop = 0;
        
        while(outerloop<8){
            
            if outerloop != 0 {
                int innerloop = outerloop ;
                int front = 0 ;
                int back = outerloop-1 ;
                int middle = (int)Math.pow(2, outerloop)
                String word1 = "" ;
                String word2 = ""
                String wordall = ""
                while(innerloop>front){
                    word1=word1+(int)Math.pow(2, front)+" "
                    ++front;
                }

                while(back>=0){
                    word2=" "+word2+(int)Math.pow(2, back);
                    --back;
                }

                wordall = word1+middle+word2
                System.out.println(wordall);
            }
            
            else{
                System.out.println("1");
            }
            
            ++outerloop;
        }
    }
    
)
