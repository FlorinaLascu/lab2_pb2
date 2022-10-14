import java.util.Arrays;

public class Container {
    // Produs p;
    private Produs[] p= new Produs[10];

    public Container(Produs[] p) {
        this.p = p;
    }

    public Produs[] getP() {
        return p;
    }

    public void setP(Produs[] p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return "Container{" +
                "p=" + Arrays.toString(p) +
                '}';
    }
}
