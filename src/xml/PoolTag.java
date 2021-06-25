package xml;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class PoolTag {

    private String name;
    private int minsize;
    private int maxsize;
    private int steep;

    public String toString() {
        return name + ", " + minsize + ", " + maxsize + ", " + steep;
    }

    public String getName() {
        return name;
    }

    public int getMinsize() {
        return minsize;
    }

    public int getMaxsize() {
        return maxsize;
    }

    public int getSteep() {
        return steep;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMinsize(int minsize) {
        this.minsize = minsize;
    }

    public void setMaxsize(int maxsize) {
        this.maxsize = maxsize;
    }

    public void setSteep(int steep) {
        this.steep = steep;
    }
    
    
    
}
