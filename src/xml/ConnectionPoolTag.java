package xml;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class ConnectionPoolTag extends DefaultHandler {

    private JDBCTag jdbc;
    private PoolsTag pools;
    private static ConnectionPoolTag instancia = null;

    private ConnectionPoolTag() {
        jdbc = new JDBCTag();
        pools = new PoolsTag();
    }

    public JDBCTag getJdbc() {
        return jdbc;
    }

    public PoolsTag getPools() {
        return pools;
    }

    private void setJdbc(JDBCTag jdbc) {
        this.jdbc = jdbc;
    }

    private void setPools(PoolsTag pools) {
        this.pools = pools;
    }

    public static ConnectionPoolTag getInstancia() {
        if (instancia == null) {
            try {
                SAXParserFactory spf = SAXParserFactory.newInstance();
                SAXParser sp = spf.newSAXParser();
                sp.parse("connectionpool.xml", new ConnectionPoolTag());
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        }
        return instancia;
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {
        switch (qName) {
            case "connection-pool":
                instancia = new ConnectionPoolTag();
                break;
            case "jdbc":
                jdbc = new JDBCTag();
                instancia.setJdbc(jdbc);
                break;
            case "pools":
                pools = new PoolsTag();
                instancia.setPools(pools);
                break;
            case "connection":
                ConnectionTag c = new ConnectionTag();
                c.setName(attributes.getValue("name"));
                c.setDriver(attributes.getValue("driver"));
                c.setUrl(attributes.getValue("url"));
                c.setUsr(attributes.getValue("usr"));
                c.setPwd(attributes.getValue("pwd"));
                jdbc.addConnectionTag(c);
                break;

            case "pool":
                int min = Integer.parseInt(attributes.getValue("minsize"));
                int max = Integer.parseInt(attributes.getValue("maxsize"));
                int steep = Integer.parseInt(attributes.getValue("steep"));
                PoolTag p = new PoolTag();
                p.setName(attributes.getValue("name"));
                p.setMinsize(min);
                p.setMaxsize(max);
                p.setSteep(steep);
                pools.addPoolTag(p);
                break;

            default:
                break;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) {
    }

    @Override
    public String toString() {
        String x = "";
        x += "-- JDBC --\n";
        x += jdbc.toString();
        x += "-- POOLes --\n";
        x += pools.toString();
        return x;
    }
}
