/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import java.util.Scanner;
import empleado.Empleado;

/**
 *
 * @author 505
 */
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              
// TODO code application logic here
        Scanner entrada=new Scanner(System.in); 
        int opcion;
        int contador=0;
        Empleado[] empleados=new Empleado[10];
        do{
        System.out.println("Bienbenido");
        System.out.println("*********");
        System.out.println("Agregar empleado");
        System.out.println("Buscar empleado");
        System.out.println("Calcular salario");
        System.out.println("Mostrar empleado");
        System.out.println("Salir");
        System.out.println("Digite una opcion");
        opcion=entrada.nextInt();
              
              switch(opcion){
                  case 1:                    
                      
                      System.out.println("Registro de empleado : ");
                      System.out.println("");
                      empleados[contador]=new Empleado();
                      empleados[contador].setId(contador) ;
                      System.out.println("Digite el nombre");
                      
                      empleados[contador].setNombre(entrada.next());
                     
                      System.out.println("Digite el cargo");
                      empleados[contador].setCargo(entrada.next());
                      
                      System.out.println("Digite horas semanales");
                      empleados[contador].setHoraSemanales(entrada.nextDouble());
                     
                      empleados[contador].setSalario(0);
                      
                      contador=contador+1;
                      
                      break;
                  case 2:
                       System.out.println("Entre a la opcion 2");
                      break;    
                   case 3:
                        System.out.println("Base de datos empleado");
                        System.out.println("");
                        
                        for(int i=0; i<contador;i++){
                         System.out.println(empleados[i].getNombre());
                         System.out.println(empleados[i].getCargo());   
                         System.out.println("");                            
                        }                
                        
                        
                      break; 
                   case 4:
                        System.out.println("Entre a la opcion 4");
                      break;   
                   case 5:
                       System.exit(0);
                      break;   
                      
                   default:   
              }
              
        }while(opcion!=5);
        }
    
    }
    

