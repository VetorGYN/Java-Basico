
package com.mycompany.arraylist;

import java.util.ArrayList;
import java.util.Scanner;


public class ArrayListTest {
    
    public static int lerIndice(Scanner sc){
        int indice = sc.nextInt();
        sc.nextLine(); 
        return indice - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tarefas  = new ArrayList<>();
        int opcao;
        
        do{
            System.out.println("\n--------- MENU ---------");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Remover tarefa");
            System.out.println("4. Mudar alguma tarefa");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();
            
            switch(opcao){
                case 1:
                     System.out.print("Digite a nova tarefa: ");
                     String novaTarefa = sc.nextLine();
                     tarefas.add(novaTarefa);
                     break;
                case 2:
                    if(tarefas.isEmpty()){
                         System.out.println("Nenhuma tarefa adicionada ainda.");
                    }else{
                        System.out.println("\nTarefas:");
                        for(int i =0; i < tarefas.size(); i++){
                            System.out.println((i+1)+"." + tarefas.get(i));
                        }
                    }
                    break;
                case 3:
                    System.out.print("Digite o número da tarefa para remover: ");
                    int indice = lerIndice(sc);
                    if(indice >= 0 && indice < tarefas.size()){
                        tarefas.remove(indice);
                        System.out.println("Tarefa removida");
                    }else{
                        System.out.println("Índice inválido.");
                    }
                    break;
                case 4:
                    System.out.println("Digite o número da tarefa que deseja alterar: ");
                    indice = lerIndice(sc);
                    sc.nextLine();
                    if(indice >= 0 && indice < tarefas.size()){
                        System.out.println("Digite a nova tarefa: ");
                        String tarefaAtualizada = sc.nextLine();
                        tarefas.set(indice, tarefaAtualizada);
                    }else{
                        System.out.println("Índice inválido.");
                    }
                    break;
                case 0:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("opção inválida.");    
            }
            
        }while(opcao != 0);
        sc.close();           
    }
}
