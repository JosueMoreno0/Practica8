package app.ito.poo;

import clases.ito.poo.CuentaBancaria;
import clases.ito.poo.CuentasBancarias;
import java.time.LocalDate;
import java.util.Scanner;

public class Aplicacion {
	static CuentasBancarias c;

	static void run(){
	
	c= new CuentasBancarias();
	System.out.println(c.isFree());
	c.addItem(new CuentaBancaria(66,"Elias rojas",4000,LocalDate.of(2021, 4, 24)));
	c.addItem(new CuentaBancaria(34,"Mariana Rodriguez",46000,LocalDate.of(2021, 5, 30)));
	c.addItem(new CuentaBancaria(32,"Sofia Morales",70000,LocalDate.of(2021, 12, 2)));
	c.addItem(new CuentaBancaria(31,"Karolina Lopez",18000,LocalDate.of(2021, 3, 12)));
	c.addItem(new CuentaBancaria(29,"Jocelyn Flores",3000,LocalDate.of(2021, 2, 1)));
	c.addItem(new CuentaBancaria(130,"Emilio Morales",6000,LocalDate.of(2021, 2, 2)));
	System.out.println(c.isFree());
	
	for(int i=0;i<c.getSize();i++)
		System.out.println(c.getItem(i));

	System.out.print("\nVerificacion Deposito:"+ c.Deposito(3, 5));
	System.out.print("\nVerificacion Deposito:"+c.Retiro(3, 90000));
	
	c.EliminarCuenta(3);
		for(int i=0;i<c.getSize();i++)
		System.out.println(c.getItem(i));
		
		System.out.println("El saldo total es :$"+c.MontosTotales());
		System.out.println("saldo maximo: "+c.Saldomax());
		System.out.println("saldo minimo: "+c.Saldomin());
		System.out.println("El saldo promedio de las cuentas es : $"+c.PromedioMontosTotales());
		System.out.println("Cuentas con saldo de mas de $10,000.00:\n"+c.CuentaM());
		
	}

}