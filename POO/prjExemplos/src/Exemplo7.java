/**
 *
 * @author aluno
 */
public class Exemplo7 {
    public static void main(String[] args) {
        int[] TabNum;//definindo o ponteiro
        int cont;
        
        TabNum = new int[3]; //alocação de memória
        
        TabNum[0] = 34;
        TabNum[1] = 22;
        TabNum[2] = 65;
        
        for(cont = 0; cont < 3; cont++){
            System.out.println("TabNum[" + cont + "] = " + TabNum[cont]);
        }
    }
    
}
