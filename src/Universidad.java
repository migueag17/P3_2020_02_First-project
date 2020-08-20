
public class Universidad { 
	
	float pagos = 0;

	Estudiante[] estudiantes = new Estudiante[2];
			
	void obtenerPagos (Estudiante[] est) {
		
		float totalPagos = obtenerTotal(est[0].pagos);
		float mayorPago = est[0].pagos;
		
		for (int i = 1; i<est.length; i++) {
			if (mayorPago<est[i].pagos) {
				mayorPago = est[i].pagos;
			}
		totalPagos = obtenerTotal(est[i].pagos);
		}
		ObtDifProm(totalPagos, est.length, mayorPago);
	}
	 
	float obtenerTotal(float pago) {
		pagos += pago ;
		return pagos;	
	}
	
	void ObtDifProm(float totalPagos, int lenght, float mayorPago) {
		 float promedio = totalPagos/lenght;
		 float difProm = mayorPago - promedio;
		 System.out.println("La diferencia entre el mayor pago y el estudiante que más pagó es: " + difProm);
		
	}
}

