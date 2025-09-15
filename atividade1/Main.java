//sistema operacional, computador, programas
public class Main { 
    public static void main(String[] args) {
        Computador pc = new Computador(8, 500, 4, 3.0);
        SistemaOperacional windows = new SistemaOperacional(pc);

        Programas code1 = new Programas(2, 100, 2, 1000);
        Programas code2 = new Programas(2, 600, 2, 200);
        Programas code3 = new Programas(16, 100, 2, 3000);

        System.out.println("Testando programa 1!");
        windows.executarPrograma(code1);
        System.out.println("Testando programa 2!");
        windows.executarPrograma(code2);
        System.out.println("Testando programa 3!");
        windows.executarPrograma(code3);
    }
}
