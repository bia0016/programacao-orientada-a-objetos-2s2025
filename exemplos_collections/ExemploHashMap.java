package exemplos_collections;
import java.util.HashMap;

public class ExemploHashMap {

    public static void main(String[] args){
    HashMap<String, String> capitais = new HashMap<>();

    capitais.put("Brasil", "Brasília");
    capitais.put("França", "Paris");
    capitais.put("Japão", "Tóquio");

    System.out.println(capitais.get("Brasil"));

    if(capitais.containsKey("Argentina")){
        System.out.println("Existe cadastro para chave Argentina");
    }else{
        System.out.println("Não existe cadastro para a chave Argentina");
    }

    for (String chave : capitais.keySet()) {
        System.out.println(chave + " - " + capitais.get(chave));
    }
    //set nao aceita elementos repetidos

    }
}
