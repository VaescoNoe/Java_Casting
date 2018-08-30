package mx.com.twg;

import mx.com.twg.conversion.Empleado;
import mx.com.twg.conversion.Escritor;
import mx.com.twg.conversion.Gerente;
import mx.com.twg.enumerador.TipoEscritura;

public class Main {
	
	public static void main(String... args){
		Empleado empleado;
		empleado = new Escritor("Noe",15000,TipoEscritura.CLASICO);
		
		imprimirDetalles(empleado);
		
		empleado = new Gerente("Hugo",50000,"Sistemas");
		imprimirDetalles(empleado);
		
	}

	private static void imprimirDetalles(Empleado empleado) {
			String resultado = null;
			
			System.out.println("\nDetalle:\n"+empleado.toString());
			if(empleado instanceof Escritor){
				Escritor escritor = (Escritor) empleado;
				resultado = escritor.getTipoEscrituraTexto();
				
				
				resultado = ((Escritor)empleado).getEnumeration().getDescripcion();
				System.out.println("Resultado tipo escritora:"+resultado);
				
			}else if(empleado instanceof Gerente){
				resultado=((Gerente)empleado).getDepartamento();
				System.out.println("Resultado de departamento: "+ resultado);
			}
	}

}
