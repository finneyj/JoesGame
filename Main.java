public class Main
{
    public static void main(String[] args)
    {
        GameArena arena = new GameArena(500,400);

        StarField f = new StarField(300, 3, arena);
        BigSpaceShip ship = new BigSpaceShip(100, 100, arena, 10);

        while(true)
        {
            f.move();
            arena.pause();
        }
    }
}