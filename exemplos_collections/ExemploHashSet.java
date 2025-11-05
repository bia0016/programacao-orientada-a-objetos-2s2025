import java.util.HashSet;

public class ExemploHashSet {
    public static void main(String[] args) {
        HashSet<Integer> inteiros = new HashSet<>();
        inteiros.add(1);
        inteiros.add(2);
        inteiros.add(3);
        inteiros.add(4); 
        //nao suporta dois elementos iguais
        //nao suporta dados duplicados
        
        for(Integer i : inteiros){
            System.out.println(i);
        }

        inteiros.remove(3);
        if(inteiros.contains(3)){
            System.out.println("3 está na lista");
        }else{
            System.out.println("3 não está na lista");;
        }
    }
}
