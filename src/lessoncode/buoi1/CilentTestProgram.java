package lessoncode.buoi1;

import java.util.ArrayList;
import java.util.List;

public class CilentTestProgram {

    public static void main(String[] args) {
        
        //Create list of player
        List <MediaPlayer> allPlayers = new ArrayList<MediaPlayer>();

        allPlayers.add(new VLCMediaPlayer());
        allPlayers.add(new DivMediaPlayer());

      //Now adding new winamp player
      allPlayers.add(new WinampMediaPlayer());
    
    }
    
}
