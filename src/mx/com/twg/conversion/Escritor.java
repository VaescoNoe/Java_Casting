package mx.com.twg.conversion;


import mx.com.twg.enumerador.TipoEscritura;

public class Escritor extends Empleado{
	
	final TipoEscritura enumeration;
	
	public Escritor(String nombre, double sueldo, TipoEscritura enumeration){
		super(nombre,sueldo);
		this.enumeration = enumeration;
	}

	public TipoEscritura getEnumeration() {
		return enumeration;
	}

	public String getTipoEscrituraTexto(){
		return enumeration.getDescripcion();
	}
	
	public String toString(){
		return super.toString()+"\nTipo escritura: "+enumeration.getDescripcion();
	}
}
