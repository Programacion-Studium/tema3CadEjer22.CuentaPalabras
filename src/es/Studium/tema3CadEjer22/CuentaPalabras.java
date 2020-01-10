package es.Studium.tema3CadEjer22;

import java.util.Scanner;

public class CuentaPalabras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String frase,subfrase="";
		System.out.println("indique una frase");
		frase=teclado.nextLine();
		int numPalabras=0;
		teclado.close();
		for (int i= 0;i<frase.length();i++)
		{
			//si encuentra un caracter lo mete en frase
			if (frase.charAt(i)!=' ')
			{
				subfrase+=frase.charAt(i);
			}
			else
			{
				System.out.println(subfrase);
				subfrase="";
				numPalabras++;
			}
		}
		System.out.println(subfrase);
		if (subfrase !="")
		{
			numPalabras++;
		}
		System.out.print("Palabras: "+numPalabras);
	}

}
