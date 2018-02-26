package ipc1.tarea3_201700880;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Rudy Orellana
 */
//Por fin acabé
public class IPC1Tarea3_201700880 {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
       
        
        Scanner entrada = new Scanner(System.in);
        
        int d=0;
        String leida []= new String[5];
      try {
        while(d<1)
        
        {
        
        System.out.println("Bienvenido al Programa");
        System.out.println("Ingrese el no. Correspondiente a la opcíon que desea ejecutar");
        System.out.println("1. Usuarios");
        System.out.println("2. Contador de Dígitos");
        System.out.println("3. Números de mayor a menor");
        System.out.println("4. Calcular el promedio");
        System.out.println("5. Salir");
          int a = entrada.nextInt(); 
        
            
        
        int las=0;
        
            while(las<1)
        
            {
        if(1<=a && a<=5)
        {
          
            las=1;
            
        }
        else {
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            
            
            System.out.println("****EL NÚMERO NO ESTÁ ENTRE LAS OPCIONES****");
            System.out.println("******POR FAVOR INGRESE UN NUEVO VALOR******");
            System.out.println(" ");
            System.out.println("Ingrese el no. Correspondiente a la opcíon que desea ejecutar");
        System.out.println("1. Usuarios");
        System.out.println("2. Contador de Dígitos");
        System.out.println("3. Números de mayor a menor");
        System.out.println("4. Calcular el promedio");
        System.out.println("5. Salir");
            int mngo = entrada.nextInt();
            a=mngo;
        }
        
            }
        
        switch (a)
                
        {
            case 1:
                int rest=0;
                while (rest<1)
                {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("BIENVENIDO A USUARIOS");
            System.out.println("Ingrese el no. Correspondiente a la opcíon que desea ejecutar");
      
            System.out.println("1. Ingresar Usuarios");
            System.out.println("2. Mostrar Usuarios Ascendente");
            System.out.println("3. Mostrar Usuarios Descendete");
            System.out.println("4. Menú Principal");
            int ma = entrada.nextInt();
            
            
            int los=0;
            while(los<1) 
            {
                
            
            if(1<=ma && ma<=4)
        {
            
            los=1;
        }
        else {
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            
            System.out.println("BIENVENIDO A USUARIOS");
            System.out.println("****EL NÚMERO NO ESTÁ ENTRE LAS OPCIONES****");
            System.out.println("******POR FAVOR INGRESE UN NUEVO VALOR******");
            System.out.println(" ");
            System.out.println("Ingrese el no. Correspondiente a la opcíon que desea ejecutar");
            
            System.out.println("1. Ingresar Usuarios");
            System.out.println("2. Mostrar Usuarios Ascendente");
            System.out.println("3. Mostrar Usuarios Descendete");
            System.out.println("4. Menú Principal");
            int man = entrada.nextInt();
            ma=man;
            
            }
            }
            
            
            
            switch (ma)
            {
                case 1:
                    System.out.println("USTED HA SELECCIONADO LA OPCIÓN INGRESAR USUARIOS");
                    
                    leida [1]="lol";
                    for(int i=0; i<leida.length; i++)
                    {
                        System.out.println("Ingrese el usuario no. "+(i+1));
                        
                        leida [i]=entrada.next();
                        
                        for(int ii=0; ii<i; ii++ )
                        {
                            int tro=0;
                            while(tro<1)
                            {
                            if(leida[i].equals(leida[ii]))
                            {
                                System.out.println("El usuario "+(i+1)+" y el usuario "+(i)+" SON IGUALES");
                                System.out.println("Ingrese de nuevo el usuario "+(i+1));
                                leida [i]=entrada.next();
                            }
                            else {
                                tro=1;
                            }
                            }
                        }
                        
                        
                        
                    
                    
                    }
                    
                    
                    
                  
                    break;
                    
                case 2:
                    System.out.println("USTED HA SELECCIONADO LA OPCIÓN USUARIOS ASCENDENTE");
                    for(int j=0; j<leida.length; j++)
                    {
                        System.out.println("Usuario no. "+(j+1)+":");
                        System.out.println(leida[j]);
                       
                    }
                    System.out.println("Presione cualquier letra y/o número seguido de enter para continuar");
                    String paso;
                    paso = entrada.next();
                    
                    break;
                    
                case 3:
                    
                    System.out.println("USTED HA SELECCIONADO LA OPCIÓN USUARIOS DESCENDENTE");
                    for(int j=leida.length - 1; j>=0; j--)
                    {
                        System.out.println("Usuario no. "+(j+1)+":");
                        System.out.println(leida[j]);
                       
                    }
                    System.out.println("Presione cualquier letra y/o número seguido de enter para continuar");
                    String pasi;
                    pasi = entrada.next();
                    
                    break;
                case 4: 
                    rest=1;
                    break;
            }
                }
                    
                    break;
            
               
               
            
          
            
            case 2:  
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            
            System.out.println("BIENVENIDO A CONTADOR DE DÍGITOS");
            System.out.println("Por favor, ingrese el número que desea analizar");
            System.out.println("(se le devolverá la cant. de digitos que posee)");
            System.out.println("SOLO SE PERMITEN NÚMEROS DE 0 A 100000");
            int digito = entrada.nextInt();
            int yuya=0;
            int ndi=1;
           
            while (yuya<1)
            {
                if(0<digito &  100000>digito)
                {
                    if(digito < Math.pow(10, ndi))
                    {
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
                        System.out.println("El número tiene "+ndi+" cifras");
                        System.out.println("Ingrese una letra y/o número seguido de ENTER para continuar");
                        String porgusto; 
                        porgusto = entrada.next();
                        yuya=1;
                        
                    } else {
                        ndi=ndi+1;
                    }
                    
                }
                else {
                     System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("BIENVENIDO A CONTADOR DE DÍGITOS");
            System.out.println("USTED A INGRESADO UN NÚMERO FUERA DEL RANGO SOLICITADO");
            System.out.println("Por favor, ingrese NUEVAMENTE el número que desea analizar");
            System.out.println("(se le devolverá la cant. de digitos que posee)");
            System.out.println("SOLO SE PERMITEN NÚMEROS DE 0 A 100000");
            digito = entrada.nextInt();
                }
                
            }
            
            
            
            
                break;
                
                
                
            case 3:
                int conejo=0;
                 while (conejo<1)
             {
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("USTED HA SELECCIONADO LA OPCIÓN DE TRES NUMEROS DE MAYOR A MENOR");
            System.out.println("Seleccione la tarea a realizar");
            System.out.println("1. Ingresar Números");
            System.out.println("2. Mostrar ordenados");
            System.out.println("3. Menú principal");
            int ipc = entrada.nextInt();
            int i,j,aux;
            
            int arreglo []= new int[3];
            
             switch (ipc) {
                 case 1:
                     for (i=0; i<arreglo.length; i++)
                     {
                         System.out.println("Ingrese no. " + (i+1));
                         arreglo[i]=entrada.nextInt();
                     }
                     for (i=0; i<arreglo.length; i++){
                         for (j=i+1; j<arreglo.length; j++)
                         {
                             if(arreglo[i]<arreglo[j])
                             {
                                 aux=arreglo[i];
                                 arreglo[i]=arreglo[j];
                                 arreglo[j]=aux;
                             }
                         }
                     }
                     break;
                 case 2: 
                     for (i=0; i<arreglo.length; i++)
                     {
                         System.out.println("Ingrese no. " + (i+1));
                         arreglo[i]=entrada.nextInt();
                     }
                     for (i=0; i<arreglo.length; i++){
                         for (j=i+1; j<arreglo.length; j++)
                         {
                             if(arreglo[i]<arreglo[j])
                             {
                                 aux=arreglo[i];
                                 arreglo[i]=arreglo[j];
                                 arreglo[j]=aux;
                             }
                         }
                     }
                     System.out.print("Los numeros ordenados descendentemente son { ");
                     for (i=0; i<arreglo.length; i++)
                     {
                             
                         System.out.print(arreglo[i]+", ");
                     }
                     System.out.print(" }");
                     System.out.println(" ");
                     System.out.println("Ingrese una letra o número seguido de enter para continuar");
                     String pasadita = entrada.next();
                     break;
                 case 3:
                     conejo=1;
                 
             }
             }
            
            
                break;
            case 4:
            System.out.println("");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("USTED HA SELECCIONADO LA OPCIÓN CALCULAR PROMEDIO");
            System.out.println("");
            int [][] arreglo2=new int[6][6];
            System.out.println("Ingrese el ID 1");
            arreglo2[0][0]=entrada.nextInt();
            System.out.println("Ingrese la nota 1");
            arreglo2[0][1]=entrada.nextInt();
            System.out.println("Ingrese la nota 2");
            arreglo2[0][2]=entrada.nextInt();
            System.out.println("Ingrese la nota 3");
            arreglo2[0][3]=entrada.nextInt();
            System.out.println("Ingrese la nota 4");
            arreglo2[0][4]=entrada.nextInt();
            arreglo2[0][5]=(arreglo2[0][1]+arreglo2[0][2]+arreglo2[0][3]+arreglo2[0][4])/4;
            
            
            System.out.println("Ingrese el ID 2");
            arreglo2[1][0]=entrada.nextInt();
            System.out.println("Ingrese la nota 1");
            arreglo2[1][1]=entrada.nextInt();
            System.out.println("Ingrese la nota 2");
            arreglo2[1][2]=entrada.nextInt();
            System.out.println("Ingrese la nota 3");
            arreglo2[1][3]=entrada.nextInt();
            System.out.println("Ingrese la nota 4");
            arreglo2[1][4]=entrada.nextInt();
            arreglo2[1][5]=(arreglo2[1][1]+arreglo2[1][2]+arreglo2[1][3]+arreglo2[1][4])/4;
           
            
            System.out.println("Ingrese el ID 3");
            arreglo2[2][0]=entrada.nextInt();
            System.out.println("Ingrese la nota 1");
            arreglo2[2][1]=entrada.nextInt();
            System.out.println("Ingrese la nota 2");
            arreglo2[2][2]=entrada.nextInt();
            System.out.println("Ingrese la nota 3");
            arreglo2[2][3]=entrada.nextInt();
            System.out.println("Ingrese la nota 4");
            arreglo2[2][4]=entrada.nextInt();
            arreglo2[2][5]=(arreglo2[2][1]+arreglo2[2][2]+arreglo2[2][3]+arreglo2[2][4])/4;
            
            System.out.println("Ingrese el ID 4");
            arreglo2[3][0]=entrada.nextInt();
            System.out.println("Ingrese la nota 1");
            arreglo2[3][1]=entrada.nextInt();
            System.out.println("Ingrese la nota 2");
            arreglo2[3][2]=entrada.nextInt();
            System.out.println("Ingrese la nota 3");
            arreglo2[3][3]=entrada.nextInt();
            System.out.println("Ingrese la nota 4");
            arreglo2[3][4]=entrada.nextInt();
            arreglo2[3][5]=(arreglo2[3][1]+arreglo2[3][2]+arreglo2[3][3]+arreglo2[3][4])/4;
            
            System.out.println("Ingrese el ID 5");
            arreglo2[4][0]=entrada.nextInt();
            System.out.println("Ingrese la nota 1");
            arreglo2[4][1]=entrada.nextInt();
            System.out.println("Ingrese la nota 2");
            arreglo2[4][2]=entrada.nextInt();
            System.out.println("Ingrese la nota 3");
            arreglo2[4][3]=entrada.nextInt();
            System.out.println("Ingrese la nota 4");
            arreglo2[4][4]=entrada.nextInt();
            arreglo2[4][5]=(arreglo2[4][1]+arreglo2[4][2]+arreglo2[4][3]+arreglo2[4][4])/4;
            
            System.out.println("Ingrese el ID 6");
            arreglo2[5][0]=entrada.nextInt();
            System.out.println("Ingrese la nota 1");
            arreglo2[5][1]=entrada.nextInt();
            System.out.println("Ingrese la nota 2");
            arreglo2[5][2]=entrada.nextInt();
            System.out.println("Ingrese la nota 3");
            arreglo2[5][3]=entrada.nextInt();
            System.out.println("Ingrese la nota 4");
            arreglo2[5][4]=entrada.nextInt();
            arreglo2[5][5]=(arreglo2[5][1]+arreglo2[5][2]+arreglo2[5][3]+arreglo2[5][4])/4;
            
            
            System.out.println("Estas son las notas");
            System.out.println("Columna 1: ID");
            System.out.println("Columnas 2, 3, 4, 5: Notas");
            System.out.println("Columna 6: Promedio");
            for(int i=0; i<6; i++)
            {System.out.println(" ");
                for(int j=0; j<6; j++)
                {
                    System.out.print(arreglo2[i][j]+" ");
                }
            }
            System.out.println(" ");
            System.out.println("Ingrese una letra y/o número para continuar");
            String porfin=entrada.next();
            
            
                break;
            case 5:
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("********GRACIAS POR UTILIZAR MI PROGRAMA*********");
            System.out.println("LOS MEJORES PROGRAMAS BY RUDY ORELLANA 2017007880");
            System.out.println("**********CONTACTO PERSONAL: 55650813 :3**********");
            System.out.println("*************QUE VIVA EL BARCELONA <3*************");
            d=10;
                break;
           
                
            
                
        }
                
        
        }
        }
      
        catch(NumberFormatException | InputMismatchException e) 
                {
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("Usted ha ingresado un caracter no valido");
            System.out.println("INGRESE SOLO NÚMEROS");
            System.out.println("Proceda a ejecutar de nuevo el programa");
        }
        
    
        
    }
}
    
