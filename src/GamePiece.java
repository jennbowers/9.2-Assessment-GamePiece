/**
 * Created by jenniferbowers on 7/18/17.
 */
public class GamePiece {
    public int positionX;
    public int positionY;
    public Boolean frozen;
    private String name;
    private String color;

//    empty constructor
    public GamePiece() {
        this.positionX = 0;
        this.positionY = 0;
        this.frozen = false;
    }

//    getter and setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    getter and setter for color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

//    methods
    public void move(int positionX, int positionY) {
        if (!this.frozen) {
            this.positionX = positionX;
            this.positionY = positionY;
        } else if (this.frozen) {
            System.out.println("TOUGH COOKIES, YOU'RE FROZEN! Try again later.");
        }
    }

    public void freeze() {
        this.frozen = true;
    }

    public void unfreeze() {
        this.frozen = false;
    }
}
