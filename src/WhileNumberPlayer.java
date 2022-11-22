public class WhileNumberPlayer {
    private int limit;

    public WhileNumberPlayer(int limit) {
        this.limit = limit;
    }

    public void printSquaresUpToLimit() {
    int i = 1;
        while (i*i < limit) {
            System.out.println(i*i);
            i++;
        }
    }

    public void printCubesUpToLimit() {
        int i = 1;
        while (i*i*i < limit) {
            System.out.println(i*i*i);
            i++;
        }
    }
}
