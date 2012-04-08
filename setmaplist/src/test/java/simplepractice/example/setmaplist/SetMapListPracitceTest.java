package simplepractice.example.setmaplist;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for SetMapListPractice.
 */
public class SetMapListPracitceTest 
{
    SetMapListPractice setMapListPractice;
    
    @Before
    public void init() {
        setMapListPractice = SetMapListPractice.getInstance();
    }
    
    @Test
    public void testUseMap() {
        Map<String, Integer> map = setMapListPractice.useMap();
        assertEquals(1, map.get("key1").intValue());
        assertEquals(2, map.get("key2").intValue());
        assertEquals(2, map.size());
    }
    
    @Test
    public void testUseSet() {
        Set<String> set = setMapListPractice.useSet();
        assertEquals(2, set.size()); // Because value1 only appears once.
        assertEquals(true, set.contains("value1"));
        assertEquals(true, set.contains("value2"));
    }
    
    @Test
    public void testUseList() {
        List<String> list = setMapListPractice.useList();
        assertEquals(2, list.size());
        assertEquals("value1", list.get(0));
        assertEquals("value1", list.get(1));
    }
}
