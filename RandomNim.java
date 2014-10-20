public class RandomNim {
  public int play(int pieces){ 
    if ((pieces % 3 == 2) || (pieces % 3 == 1)) { // if the pieces left leaves a remainder of 2 or 1 when divided by three...
      System.out.println("Computer took 1 piece");
      return 1; // computer returns 1
    }
    
    if (pieces % 3 == 0); { // if the pieces left leaves a remainder of 2 or 1 when divided by three...
      System.out.println("Computer took 2 pieces");
      return 2; // computer returns 2
    } 
  }
}