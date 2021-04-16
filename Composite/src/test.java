
public class test {
	public static void main(String args[]) {
		Departamento financiero1 = new DepartamentoFinanzas(1, "Departamento Financiero 1");
		Sucursal sucursalPrincipal = new Sucursal(2, "Sucursal Principal");		
		sucursalPrincipal.addDepartamento(financiero1);
		
		sucursalPrincipal.imprimirNombreDepartamento();
	}
}
