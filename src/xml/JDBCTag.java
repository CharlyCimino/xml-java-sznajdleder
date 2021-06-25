package xml;

import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class JDBCTag {

    private HashMap<String, ConnectionTag> connection;

    public JDBCTag() {
        connection = new HashMap<>();
    }

    public ConnectionTag getConnectionTag(String name) {
        return connection.get(name);
    }

    public void addConnectionTag(ConnectionTag c) {
        connection.put(c.getName(), c);
    }

    public String toString() {
        String x = "";
        ConnectionTag aux;
        Iterator<String> e = connection.keySet().iterator();
        while (e.hasNext()) {
            aux = connection.get(e.next());
            x += aux.toString() + "\n";
        }
        return x;
    }
}
