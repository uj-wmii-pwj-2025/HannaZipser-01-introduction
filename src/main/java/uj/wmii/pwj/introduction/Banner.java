package uj.wmii.pwj.introduction;

import java.util.HashMap;
import java.util.Map;

public class Banner {

    private final Map<Character, String[]> font = new HashMap<>();
    private void initFont(){
        font.put('A', new String[]{
                "   #   ",
                "  # #  ",
                " #   # ",
                "#     #",
                "#######",
                "#     #",
                "#     #"
        });

        font.put('B', new String[]{
                "###### ",
                "#     #",
                "#     #",
                "###### ",
                "#     #",
                "#     #",
                "###### "
        });
        font.put('C', new String[]{
                " ##### ",
                "#     #",
                "#      ",
                "#      ",
                "#      ",
                "#     #",
                " ##### "
        });
        font.put('D', new String[]{
                "###### ",
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                "#     #",
                "###### "
        });
        font.put('E', new String[]{
                "#######",
                "#      ",
                "#      ",
                "#####  ",
                "#      ",
                "#      ",
                "#######"
        });
        font.put('F', new String[]{
                "#######",
                "#      ",
                "#      ",
                "#####  ",
                "#      ",
                "#      ",
                "#      "
        });
        font.put('G', new String[]{
                " ##### ",
                "#     #",
                "#      ",
                "#  ####",
                "#     #",
                "#     #",
                " ##### "
        });
        font.put('H', new String[]{
                "#     #",
                "#     #",
                "#     #",
                "#######",
                "#     #",
                "#     #",
                "#     #"
        });
        font.put('I', new String[]{
                "###" ,
                " # " ,
                " # " ,
                " # " ,
                " # " ,
                " # " ,
                "###"
        });
        font.put('J', new String[]{
                "      #" ,
                "      #" ,
                "      #" ,
                "      #" ,
                "#     #" ,
                "#     #" ,
                " ##### "
        });
        font.put('K', new String[]{
                "#    #" ,
                "#   # " ,
                "#  #  " ,
                "###   " ,
                "#  #  " ,
                "#   # " ,
                "#    #",
        });
        font.put('L', new String[]{
                "#      " ,
                "#      " ,
                "#      " ,
                "#      " ,
                "#      " ,
                "#      " ,
                "#######"
        });
        font.put('M', new String[]{
                "#     #" ,
                "##   ##" ,
                "# # # #" ,
                "#  #  #" ,
                "#     #" ,
                "#     #" ,
                "#     #",
        });
        font.put('N', new String[]{
                "#     #" ,
                "##    #" ,
                "# #   #" ,
                "#  #  #" ,
                "#   # #" ,
                "#    ##" ,
                "#     #",
        });
        font.put('O', new String[]{
                "#######" ,
                "#     #" ,
                "#     #" ,
                "#     #" ,
                "#     #" ,
                "#     #" ,
                "#######"
        });
        font.put('P', new String[]{
                "###### " ,
                "#     #" ,
                "#     #" ,
                "###### " ,
                "#      " ,
                "#      " ,
                "#      ",
        });
        font.put('Q', new String[]{
                " ##### " ,
                "#     #" ,
                "#     #" ,
                "#     #" ,
                "#   # #" ,
                "#    # " ,
                " #### #"
        });
        font.put('R', new String[]{
                "###### " ,
                "#     #" ,
                "#     #" ,
                "###### " ,
                "#   #  " ,
                "#    # " ,
                "#     #"
        });
        font.put('S', new String[]{
                " ##### " ,
                "#     #" ,
                "#      " ,
                " ##### " ,
                "      #" ,
                "#     #" ,
                " ##### ",
        });
        font.put('T', new String[]{
                "#######" ,
                "   #   " ,
                "   #   " ,
                "   #   " ,
                "   #   " ,
                "   #   " ,
                "   #   ",
        });
        font.put('U', new String[]{
                "#     #" ,
                "#     #" ,
                "#     #" ,
                "#     #" ,
                "#     #" ,
                "#     #" ,
                " ##### "
        });
        font.put('V', new String[]{
                "#     #" ,
                "#     #" ,
                "#     #" ,
                "#     #" ,
                " #   # " ,
                "  # #  " ,
                "   #   ",
        });
        font.put('W', new String[]{
                "#     #" ,
                "#  #  #" ,
                "#  #  #" ,
                "#  #  #" ,
                "#  #  #" ,
                "#  #  #" ,
                " ## ## ",
        });
        font.put('X', new String[]{
                "#     #" ,
                " #   # " ,
                "  # #  " ,
                "   #   " ,
                "  # #  " ,
                " #   # " ,
                "#     #",
        });
        font.put('Y', new String[]{
                "#     #" ,
                " #   # " ,
                "  # #  " ,
                "   #   " ,
                "   #   " ,
                "   #   " ,
                "   #   ",
        });
        font.put('Z', new String[]{
                "#######" ,
                "     # " ,
                "    #  " ,
                "   #   " ,
                "  #    " ,
                " #     " ,
                "#######"
        });
    }

    public Banner(){
        initFont();
    }

    public String[] toBanner(String input) {
        final int lineSize = 7;

        if (input == null) {
            return new String[0];
        }

        input = input.toUpperCase();
        String[] output = new String[lineSize];

        for (int i = 0; i < lineSize; i++){
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < input.length(); j++){
                char letter = input.charAt(j);
                if (letter == ' '){
                    line.append("   ");
                } else {
                    line.append(font.get(letter)[i]);
                    line.append(" ");
                }
            }
            output[i] = line.toString();
        }

        return output;
    }

}
