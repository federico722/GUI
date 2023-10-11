
public class Procesos {
	public double calcularPromedio(double n1,double n2,double n3) {
		System.out.println("Va a calcular");
		double promedio=-1;
		if(validarNota(n1,n2,n3)==true) {
			promedio=(n1+n2+n3)/3;	
		}
		return promedio;
	}
	
	public boolean validarNota(double n1,double n2,double n3) {
		
		if (n1>=0 && n1<=5 && n2>=0 && n2<=5 && n3>=0 && n3<=5) {
			return true;
		}
		
		return false;
		
	}
}
