import java.util.ArrayList;
public class ExemploArrayList {
    public static void main(String[] args) {
        ArrayList<String> listaNomes = new ArrayList<>();
        listaNomes.add("Alice");
        listaNomes.add("Bob");
        listaNomes.add("Carol");
        for (String nome : listaNomes) {
            System.out.println(nome);
        }
        for(int i = 0; i < listaNomes.size(); i++){
            System.out.println(listaNomes.get(i));
        }

        System.out.println(listaNomes.get(1));
        if(listaNomes.contains("Bob")){
            System.out.println("Bob está na lista");
        }

        listaNomes.remove("Bob");

        if(! listaNomes.contains("Bob")){
            System.out.println("Bob não está na lista");
        }

        if(listaNomes.isEmpty()){
            System.out.println("A lista de nomes está vazia");
        }

        listaNomes.clear();

        if(listaNomes.isEmpty()){
            System.out.println("A lista de nomes está vazia");
        
        }
    }
}
