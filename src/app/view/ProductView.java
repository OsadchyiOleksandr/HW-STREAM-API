package app.view;

import java.util.Map;

public class ProductView {

    public void messageToDisplay(String message){
        System.out.println(message);
    }

    public <K, V> void mapToDisplay(Map<K, V> map){
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
