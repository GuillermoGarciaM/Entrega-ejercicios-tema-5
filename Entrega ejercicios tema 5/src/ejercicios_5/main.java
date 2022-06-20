package ejercicios_5;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CocheCRUDImpl coche=new CocheCRUDImpl();
		coche.save();
		coche.findAll();
		coche.delete();
	}

}
