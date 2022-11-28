public class CharacterDrawingUtilities {
    public static void drawElement(char c) {
        System.out.print(c);
    }

    public static void drawNewLine() {
        System.out.print(" ");
    }

    public static void drawHorizontalSegmentWith(char c, int width) {
        for (int i = 0; i < width; i++) {
            drawElement(c);
        }
    }

    public static void drawFilledRectangleWith(char c, int width, int heigth) {
        for (int i = 0; i < heigth; i++) {
            drawHorizontalSegmentWith(c, width);
            drawNewLine();
        }
    }

    public static void drawEmptyRectangleWith(char c, int width, int heigth) {
        for (int a = 0; a < heigth; a++) {
            for (int b = 0; b < width; b++) {
                if (a == 0 || a == heigth - 1 || b == 0 || b == width - 1)
                    drawElement(c);
                else
                    drawNewLine();

            }
            System.out.println();
        }
    }

    public static void drawEmptyRectangleWith1(char c,int height, int width){
        for (int i = 0; i < height; i++) {
            if (i==0||i==height-1){
                drawHorizontalSegmentWith(c,width);
                drawNewLine();
            }
            else{
                for (int j = 0; j < width; j++) {
                    if (j==0 || j==width-1){
                        drawElement(c);
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                drawNewLine();
            }


        }
    }

}



