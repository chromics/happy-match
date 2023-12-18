package data;

import java.util.HashMap;

public enum Constant{
    BOARD_ROW_SIZE(8), BOARD_COL_SIZE(8), PICTURE_SIZE(50);

    private final int num;
    Constant(int num){
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public static HashMap<String,String> decorations = new HashMap<>(){{
        put("patch","data/static/image/patch.png");
        put("bigPatch","data/static/image/bigPatch.png");
        put("fence","data/static/image/fence.png");
    }};

    public static String[] fruitsName = {"apple", "banana", "orange", "pear"};

    public static HashMap<String,String> fruitsHashMap = new HashMap<>(){{
        put("apple","data/static/image/apple.png");
        put("banana","data/static/image/banana.png");
        put("orange","data/static/image/orange.png");
        put("pear","data/static/image/pear.png");
    }};

    public static int[][] potentialMatchPatterns = {
        /*
         * {row1,col1,row2,col2}
         * 
         * B = MainRow, MainCol (the Selected Point)
         * A = MainRow + row1, MainCol + col1
         * C = MainRow + row2, MainCol + col2
         * 
         * {0,1,-1,-1}, {-1,0,1,-1}, {0,-1,1,1}, {1,0,-1,1}
         * C . .        . A .        . . .       . . C
         * . B A        . B .        A B .       . B .
         * . . .        C . .        . . C       . A .
         * 
         */
        {0,1,-1,-1}, {-1,0,1,-1}, {0,-1,1,1}, {1,0,-1,1},

        /*
         * {1,-1,0,1}, {1,1,-1,0}, {-1,1,0,-1}, {-1,-1,1,0}
         * . . .        . C .        . . A       A . .
         * . B C        . B .        C B .       . B .
         * A . .        . . A        . . .       . C .
         * 
         */
        {1,-1,0,1}, {1,1,-1,0}, {-1,1,0,-1}, {-1,-1,1,0},

        /*
         * {-1,-1,-1,1}, {1,-1,-1,-1}, {1,1,1,-1}, {-1,1,1,1}
         * A . C         C . .         . . .       . . A
         * . B .         . B .         . B .       . B .
         * . . .         A . .         C . A       . . C
         * 
         */
        {-1,-1,-1,1}, {1,-1,-1,-1}, {1,1,1,-1}, {-1,1,1,1}
    };
}
