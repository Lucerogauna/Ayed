package ejemploStack;


public static int evaluarPostFija (String exp) {
	Stack <Integer> stack = new Stack<>();
	for (int i=0; i< exp.length(); i++) {
		char valor = expresion.charAt(i);
		if (esNumero(valor)) {
			stack.push
		}
		
	}
	
}
public class postfija {
	public static void main (String[]args) {
		String expresion = "34+2*"; // 3 + 4 * 2
		System.out.println("Resultado(Postfija):" + evaluarPostFija(expresion));
	}

}
