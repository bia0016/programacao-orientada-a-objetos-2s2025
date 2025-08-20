package calculadora; //a classe define objetos reais no codigo

public class Calculadora {
    public Double numeroA;
    public Double numeroB;

    public void somar(){
        Double resultadoSoma = this.numeroA + this.numeroB;
        System.out.println(this.numeroA + " + " + this.numeroB + " = " + resultadoSoma);
    }
    public void sub(){
        Double resultadoSub = this.numeroA - this.numeroB;
        System.out.println(this.numeroA + " - " + this.numeroB + " = " + resultadoSub);

    }
    public void mul(){
        Double resultadoMul = this.numeroA * this.numeroB;
        System.out.println(this.numeroA + " * " + this.numeroB + " = " + resultadoMul);
    }
    public void div(){
        Double resultadoDiv = this.numeroA / this.numeroB;
        System.out.println(this.numeroA + " / " + this.numeroB + " = " + resultadoDiv);
    }
}
