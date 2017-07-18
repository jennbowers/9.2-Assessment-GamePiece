public class Main {

    public static void main(String[] args) {
        GamePiece gamePiece = new GamePiece();

        gamePiece.setColor("Red");
    //	color tests
        if (gamePiece.getColor() == "Red") {
            System.out.println("SUCCESS! You changed the color");
        } else {
            System.out.println("let's try this color thing again...");
        }

        gamePiece.setName("King");
    //	name tests
        if (gamePiece.getName() == "King") {
            System.out.println("SUCCESS! You changed the name");
        } else {
            System.out.println("let's try this name thing again...");
        }

        gamePiece.move(1, 2);
    //    move test since not currently frozen
        if (gamePiece.positionX == 1 && gamePiece.positionY == 2) {
            System.out.println("SUCCESS! You moved!");
        } else {
            System.out.println("let's try this move thing again...");
        }

        gamePiece.freeze();
    //    freeze test since currently not frozen
        if (gamePiece.frozen) {
            System.out.println("SUCCESS! You are now frozen!");
        } else {
            System.out.println("let's try this freeze thing again...");
        }

        gamePiece.move(5, 7);
    //    did it move while it's frozen test
        if (gamePiece.positionX == 5 && gamePiece.positionY == 7) {
            System.out.println("Alas, freeze isn't working because you can still move..");
        } else {
            System.out.println("SUCCESS! Still frozen.");
        }

        gamePiece.unfreeze();
    //    unfreeze test since currently frozen
        if (!gamePiece.frozen) {
            System.out.println("SUCCESS! You are no longer frozen, go move!");
        } else {
            System.out.println("let's try this unfreeze thing again...");
        }


    }

}
