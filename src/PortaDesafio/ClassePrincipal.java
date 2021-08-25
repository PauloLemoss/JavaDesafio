package PortaDesafio;

import java.util.Scanner;

public class ClassePrincipal {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Porta portaa = new Porta ("Verde", 11, 14, 18);
		
		int dimensaoX = 0;
		int dimensaoY = 0;
		int dimensaoZ = 0;
	       String cor="";
		
		 Scanner sc1 = new Scanner(System.in);
		 System.out.println("digite a cor da porta");
	         cor = sc1.next();
	         portaa.setCor(cor);
	      
		 
	     	System.out.println("A porta tá pintada");
	     	System.out.println(portaa.getCor());
	     	portaa.abrirPorta();
	     	System.out.println("A porta tá abrindo");
	        
		System.out.println("Digite a dimensao x");
	         dimensaoX  = sc1.nextInt();        
	         portaa.setDimensaox(dimensaoX );
	          
	         System.out.println("Digite a dimensao y");
	             dimensaoY = sc1.nextInt();
	            portaa.setDimensaoy(dimensaoY);
	            
	            
	            
	            System.out.println("Digite a dimensao z");
	            dimensaoZ= sc1.nextInt();
	           portaa.setDimensaoz(dimensaoZ);
	          
	           portaa.getDimensaoz(); 
	           
	         // ALTERA AS DIMENSOES
	         System.out.println("Aterando as medidas da porta");
	         System.out.println("a dimensao de   x é");
	          System.out.println(portaa.getDimensaox());

	        System.out.println("Digite a nova dimensao de   x");
	         dimensaoX  = sc1.nextInt();        
	         portaa.setDimensaox(dimensaoX );
	         System.out.println(portaa.getDimensaox());


	          System.out.println("a dimensao de   y é");
	          System.out.println(portaa.getDimensaoy());

	          System.out.println("Digite a nova dimensao de   y");
	         dimensaoY  = sc1.nextInt();        
	         portaa.setDimensaoy(dimensaoY );
	         System.out.println(portaa.getDimensaoy());

	          System.out.println("a dimensao de   z é");
	          System.out.println(portaa.getDimensaoz());

	          System.out.println("Digite a nova dimensao de   z");
	         dimensaoZ  = sc1.nextInt();        
	         portaa.setDimensaoz(dimensaoZ );
	         System.out.println(portaa.getDimensaoz());
	          
	          
	          
	          
	          
	          
	           
           
           
	}

}
