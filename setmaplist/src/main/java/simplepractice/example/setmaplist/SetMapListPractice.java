package simplepractice.example.setmaplist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * A practice to demonstrate Set, Map and List in Java
 *
 */
public class SetMapListPractice 
{
    
    private SetMapListPractice() {
        // Do not allow to create an object
    }
    
    static SetMapListPractice getInstance() {
        return new SetMapListPractice();
    }
    
    public Set<String> useSet() {
        Set<String> set1 = new TreeSet<String>();
        set1.add("value1");
        set1.add("value2");
        
        // This one will replace the first value in the set
        set1.add("value1");
        return set1;
    }
    
    public List<String> useList() {
        List<String> list1 = new ArrayList<String>();
        list1.add("value1");
        list1.add("value1");
        return list1;
    }
    
    public Map<String, Integer> useMap() {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("key1", 1);
        map.put("key2", 2);
        return map;
    }
}
