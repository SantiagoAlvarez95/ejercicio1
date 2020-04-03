package com.mycompany.mavenproject1;

import java.util.Scanner;

public class main {
	
public static void main(String [] args) {
	logica santi =new logica();
        
        int lim= 11;
        int x =0;
        String cedula;
        String nombre;
        String direccion;
        String telefono;
        String saldo = null;
        String empleado;
        logica.empleado[] Array =new logica.empleado[lim];
	logica empleados= new logica();
	
	
Scanner dato=new Scanner(System.in);
System.out.println("Bienvenido");
 System.out.println("--------------");
byte op;

do {
	System.out.println("1- registrar de empleado");
        System.out.println("2- Calculo total de saldos");
	System.out.println("3- Salir");
	System.out.print("Selecione una opcion: ");
	op= dato.nextByte();
	switch (op){
	
	case 1:
                System.out.println("------------------------");
		System.out.println("Registro de empleados ");
                System.out.println("------------------------");
                System.out.print("Ingrese Cedula: ");
                cedula= dato.next();
                System.out.print("Ingrese Nombre: ");
                nombre=dato.nextLine();
                System.out.print("Ingrese Direccion: ");
                direccion=dato.nextLine();
                System.out.print("Ingrese Telefono: ");
                telefono=dato.nextLine();
                System.out.println("Ingrese tipo de empleado: ");
                empleado=dato.nextLine();
                System.out.print("Saldo: ");
                saldo=dato.nextLine();
                if (x ==lim){
                    System.out.println("no hay mas lugar");
                }else{
                Array [x]=santi.new empleado(nombre,direccion,telefono,saldo,empleado,cedula);
              x++;
                }
                
                break;
               
		
	case 2:
		System.out.println("Calculo total de saldos");
                for(int i=0; i !=lim; i++){
                    System.out.println(Array[i].saldo);
                    saldo= saldo + Array[i].saldo;
                }
		break;
		
	case 3:
		System.out.println("Salir");
		break;
		
	}
	
}while(op !=3); 

}
}