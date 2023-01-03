public class MarioGame implements GamingConsole{
    @Override
    public void up() {
        System.out.println("Jump");
    }

    @Override
    public void down() {
        System.out.println("Duck");
    }

    @Override
    public void left() {
        System.out.println("Move backward");
    }

    @Override
    public void right() {
        System.out.println("Move forward");
    }
}
