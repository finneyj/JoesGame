public class BigSpaceShip {
    private Rectangle[] rectangles;
    private Rectangle hitbox;

    public Rectangle getHitbox(){
      return hitbox;
    }
    public void render(GameArena arena) {
        for (int i = 0; i < rectangles.length; i++) {
          arena.addRectangle(rectangles[i]);
        }
        arena.addRectangle(hitbox);
    }

    public void move(double dx, double dy) {
        for (int i = 0; i < rectangles.length; i++) {
          rectangles[i].setXPosition(rectangles[i].getXPosition() + dx);
          rectangles[i].setYPosition(rectangles[i].getYPosition() + dy);
        }
        hitbox.setXPosition(hitbox.getXPosition() + dx);
        hitbox.setYPosition(hitbox.getYPosition() + dy);
      }

    public void remove(GameArena arena) {
        for (int i = 0; i < rectangles.length; i++) {
            arena.removeRectangle(rectangles[i]);
        }
        arena.removeRectangle(hitbox);
    }

    public BigSpaceShip(double x, double y, GameArena arena, int size) {
            rectangles = new Rectangle[57];
            rectangles[0] = new Rectangle(x, y + size * 9, size*21, size, "#8F8EAE"); // wide wings left to right
            rectangles[7] = new Rectangle(x + size * 6, y + size * 6, size * 9, size * 5, "#C9C9E5"); // Light body
            // dark pixels row 9
            rectangles[1] = new Rectangle(x + size, y + size * 9, size, size, "#65628E");
            rectangles[2] = new Rectangle(x + size * 3, y + size * 9, size, size, "#65628E");
            rectangles[3] = new Rectangle(x + size * 5, y + size * 9, size, size, "#65628E");
            rectangles[4] = new Rectangle(x + size * 15, y + size * 9, size, size, "#65628E");
            rectangles[5] = new Rectangle(x + size * 17, y + size * 9, size, size, "#65628E");
            rectangles[6] = new Rectangle(x + size * 19, y + size * 9, size, size, "#65628E");
            // light pixels row 9
            rectangles[9] = new Rectangle(x + size * 7, y + size * 9, size, size, "#AFAFCC"); 
            rectangles[8] = new Rectangle(x + size * 13, y + size * 9, size, size, "#AFAFCC"); 
            // row 8
            rectangles[11] = new Rectangle(x + size, y + size * 8, size, size, "#FC2B81"); //red
            rectangles[10] = new Rectangle(x + size * 3, y + size * 8, size, size, "#FC2B81");
            rectangles[13] = new Rectangle(x + size * 17, y + size * 8, size, size, "#FC2B81"); 
            rectangles[12] = new Rectangle(x + size * 19, y + size * 8, size, size, "#FC2B81");
            rectangles[14] = new Rectangle(x + size * 8, y + size * 8, size * 5, size, "#65628E"); 
            rectangles[15] = new Rectangle(x + size * 9, y + size * 8, size * 3, size, "#AFAFCC");

            // sides
            rectangles[16] = new Rectangle(x + size * 6, y + size * 5, size, size *5, "#8F8EAE"); // side grey
            rectangles[17] = new Rectangle(x + size *6 , y + size * 4, size, size, "#65628E"); // dark
            rectangles[18] = new Rectangle(x + size *6 , y + size * 3, size, size, "#FEDC1E"); // yellow
            rectangles[19] = new Rectangle(x + size * 14, y + size * 5, size, size *5, "#8F8EAE");
            rectangles[20] = new Rectangle(x + size *14 , y + size * 4, size, size, "#65628E"); // dark
            rectangles[21] = new Rectangle(x + size *14 , y + size * 3, size, size, "#FEDC1E"); // yellow
            // row 6 and 7
            rectangles[22] = new Rectangle(x + size * 7, y + size * 6, size, size, "#8F8EAE"); 
            rectangles[23] = new Rectangle(x + size * 10, y + size * 6, size, size *2, "#8F8EAE");
            rectangles[24] = new Rectangle(x + size * 13, y + size * 6, size, size, "#8F8EAE"); 
            // row 3 and 4
            rectangles[25] = new Rectangle(x + size * 9, y + size * 3, size * 3, size * 2, "#8F8EAE"); // sides
            rectangles[26] = new Rectangle(x + size * 10, y + size * 3, size, size, "#AFAFCC"); // light
            // row 5
            rectangles[27] = new Rectangle(x + size * 8, y + size * 5, size * 5, size, "#8F8EAE"); // sides
            rectangles[28] = new Rectangle(x + size * 9, y + size * 5, size * 3, size, "#AFAFCC"); // light
            rectangles[29] = new Rectangle(x + size * 10, y + size * 4, size, size * 2, "#C9C9E5"); // body + row 4
            // rows 0,1, and 2
            rectangles[30] = new Rectangle(x + size *10 , y + size, size, size * 2, "#65628E"); // dark
            rectangles[31] = new Rectangle(x + size *10 , y, size, size, "#FEDC1E"); // yellow
            // row 10
            rectangles[32] = new Rectangle(x + size * 3, y + size * 10, size * 3, size, "#8F8EAE"); // sides
            rectangles[33] = new Rectangle(x + size * 15, y + size * 10, size * 3, size, "#8F8EAE"); // sides
            rectangles[34] = new Rectangle(x + size * 10 , y + size * 10, size, size, "#65628E"); // dark
            //row 11
            rectangles[35] = new Rectangle(x + size * 5, y + size * 11, size, size, "#FC2B81"); //red
            rectangles[36] = new Rectangle(x + size * 15, y + size * 11, size, size, "#FC2B81"); //red
            rectangles[37] = new Rectangle(x + size * 6, y + size * 11, size * 9, size, "#8F8EAE"); // sides
            // squares
            rectangles[38] = new Rectangle(x + size * 8, y + size * 12, size * 2, size * 2, "#8F8EAE"); // dark sqr r12-14
            rectangles[39] = new Rectangle(x + size * 11, y + size * 12, size * 2, size * 2, "#8F8EAE"); // dark sqr r12-14
            rectangles[40] = new Rectangle(x + size * 7, y + size * 11, size * 2, size*2, "#AFAFCC"); // light sqr r11-12
            rectangles[41] = new Rectangle(x + size * 12, y + size * 11, size * 2, size*2, "#AFAFCC"); // light sqr r11-12
            //row 12
            rectangles[42] = new Rectangle(x + size * 7, y + size * 12, size, size, "#8F8EAE"); // sides
            rectangles[43] = new Rectangle(x + size * 13, y + size * 12, size, size, "#8F8EAE"); // sides
            //row 14
            rectangles[44] = new Rectangle(x + size * 8, y + size * 14, size, size, "#65628E"); // engine
            rectangles[45] = new Rectangle(x + size * 12, y + size * 14, size, size, "#65628E"); // engine

            //FIRE

            //r 16
            rectangles[46] = new Rectangle(x + size * 5, y + size * 16, size*11, size, "#FEDC1E"); // yellow
            rectangles[47] = new Rectangle(x + size * 7, y + size * 16, size*7, size, "#FD881D"); // orange
            rectangles[48] = new Rectangle(x + size * 10, y + size * 16, size, size, "#FEDC1E"); // yellow
            //r 17
            rectangles[49] = new Rectangle(x + size * 6, y + size * 17, size*4, size, "#FEDC1E"); // yellow
            rectangles[50] = new Rectangle(x + size * 8, y + size * 17, size, size, "#FD881D"); // orange
            rectangles[51] = new Rectangle(x + size * 11, y + size * 17, size*4, size, "#FEDC1E"); // yellow
            rectangles[52] = new Rectangle(x + size * 12, y + size * 17, size, size, "#FD881D"); // orange
            //r18-19
            rectangles[53] = new Rectangle(x + size * 7, y + size * 18, size*3, size, "#FEDC1E");
            rectangles[54] = new Rectangle(x + size * 11, y + size * 18, size*3, size, "#FEDC1E"); 
            rectangles[55] = new Rectangle(x + size * 8, y + size * 19, size, size, "#FEDC1E");
            rectangles[56] = new Rectangle(x + size * 12, y + size * 19, size, size, "#FEDC1E"); 
      
          hitbox = new Rectangle(x, y, size * 21, size * 20, "BLACK", -10);
      
          render(arena);
    }
      
}
