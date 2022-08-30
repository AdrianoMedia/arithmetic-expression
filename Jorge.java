public class Jorge {
    public static void main(String[] args) {
        Expressao exp1 = new Expressao("(a+10)/(23(10.5-b)-2.59/(ba))");
        System.out.println(exp1.estaCorretaSintaticamente());
        System.out.println(exp1.getQtdeDivisores());
        System.out.println(exp1.getPosicaoOperador());
        Expressao exp2 = new Expressao("(a+10)/(23(10.5-b)-2.59/(ba)(");
        System.out.println(exp2.estaCorretaSintaticamente());
        System.out.println(exp2.getQtdeDivisores());
        System.out.println(exp2.getPosicaoOperador());
        Expressao exp3 = new Expressao("(a10)(23(10.5b)2.59(ba)(");
        System.out.println(exp3.estaCorretaSintaticamente());
        System.out.println(exp3.getQtdeDivisores());
        System.out.println(exp3.getPosicaoOperador());

    }
}