public class Expressao {

	// item a

	private String exp;

	public Expressao(String exp) {
		this.exp = exp;

	}

	public String getExp() {
		return exp;
	}

	public void setExp(String exp) {
		this.exp = exp;
	}

	// item b

	public boolean estaCorretaSintaticamente() {
		String tamanho = exp;
		int abrir = 0;
		int fechar = 0;
		for (int i = 0; i < tamanho.length(); i++) {
			if (exp.substring(i) == "(") {
				abrir++;
			}
			if (exp.substring(i) == ")") {
				fechar++;
			}

			if (tamanho.charAt(0) == ')') {
				return false;
			}
			if (tamanho.charAt(exp.length() - 1) == '(') {
				return false;
			}
			if (abrir > fechar) {
				return false;
			} else {
				if (fechar > abrir) {
					return false;
				} else {
					return true;
				}

			}
		}
		return estaCorretaSintaticamente();

	}

	// item c

	public int getQtdeDivisores() {
		String TtDiv = exp;
		int QtdeDivisores = 0;
		for (int i = 0; i < TtDiv.length(); i++) {
			if (TtDiv.charAt(i) == '/') {
				QtdeDivisores++;
			}
		}

		return QtdeDivisores;

	}

	// item d

	public int getPosicaoOperador() {
		String op = exp;
		int pos = 0;
		for (int i = 0; i < op.length(); i++) {
			if (op.charAt(i) == '+' || op.charAt(i) == '-' || op.charAt(i) == '*' || op.charAt(i) == '/') {
				pos = i;
				return pos;

			}

		}
		return -1;
	}

}