
package biepjv.servletmvc.model;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


public class Data {

    /**
     * @return the data
     */
    public List<String> getData() {
        return data;
    }
    
    private List<String> data = new CopyOnWriteArrayList<>();
    
    public Data() {
        data.add("Hello");
        
    }
    
    public List<String> data() {
        return data;
    }
    
    public void add(String elem) {
        data.add(elem);
    }
    
    
}
