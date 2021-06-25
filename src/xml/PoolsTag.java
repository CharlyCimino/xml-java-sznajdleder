package xml;

import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class PoolsTag {

    private HashMap<String, PoolTag> pool;

    public PoolsTag() {
        pool = new HashMap<>();
    }

    public PoolTag getPoolTag(String name) {
        return pool.get(name);
    }

    public void addPoolTag(PoolTag c) {
        pool.put(c.getName(), c);
    }
    
    
    public String toString() {
        String x = "";
        PoolTag aux;
        Iterator<String> e = pool.keySet().iterator();
        while (e.hasNext()) {
            aux = pool.get(e.next());
            x += aux + "\n";
        }
        return x;
    }
}
