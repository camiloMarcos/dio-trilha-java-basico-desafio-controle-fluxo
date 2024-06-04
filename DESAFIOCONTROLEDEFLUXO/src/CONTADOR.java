import java.util.Scanner;

public class CONTADOR {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);

                System.out.println("Digite o Primeiro Parâmetro!");
                int parametroUm = terminal.nextInt();
                System.out.println("Digite o Segundo Parâmetro!");
                int parametroDois = terminal.nextInt();
                
                try {
                    contar(parametroUm, parametroDois);
                                                                        
                } catch (ParametrosInvalidosException e) {
                    System.out.println("O segundo parâmetro deve ser maior que o primeiro");
                }
                terminal.close();
            }

static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
                if (parametroUm>= parametroDois){
                    throw new ParametrosInvalidosException();
                }
                int contagem = parametroDois - parametroUm;
                for(int x =0; x<= contagem; x++){
                    System.out.println("O número com base váriavel é: " + x++);
                }

                                        
            }
            
 }    
  
            
    