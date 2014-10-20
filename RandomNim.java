import java.util.Scanner;

public class RandomNim {
  private int pieces;
  
  Scanner in = new Scanner(System.in);

  
  public int play(int pieces){
    pieces = pieces % 3;
    
    if (pieces == 2) {
      pieces = pieces - 1;
      return pieces;
    }
    
    if (pieces == 1) {
      pieces = pieces - 1;
      return pieces;
    }
    
    if (pieces == 0); {
      pieces = pieces - 2;
      return pieces;
    } 
  }
}