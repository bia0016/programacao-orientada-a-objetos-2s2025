package calculadora;
public class executacalculadora {
    public static void main(String[] args){
       Calculadora calc1 = new Calculadora();
       Calculadora calc2 = new Calculadora();
 
        calc1.numeroA = 2.0;
        calc1.numeroB = 3.0;

        calc2.numeroA = 4.0;
        calc2.numeroB = 5.0;

        calc1.somar();
        calc1.sub();
        calc1.mul();
        calc1.div();

        calc2.somar();
        calc2.sub();
        calc2.mul();
        calc2.div();
    }
}
