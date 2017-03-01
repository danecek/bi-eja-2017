
package biepjv.servletmvc.model;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


public class Data {
    public static Data instance = new Data();
    
    private List<String> data = new CopyOnWriteArrayList<>();
    
    private Data() {
        data.add("Hello");
        
    }
    
    public List<String> data() {
        return data;
    }
    
    public void add(String elem) {
        data.add(elem);
    }
    
    
}
