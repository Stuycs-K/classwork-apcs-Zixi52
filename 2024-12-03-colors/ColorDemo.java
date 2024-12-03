public class ColorDemo{
  public static final String CLEAR_SCREEN =  "\u001b[2J";
  public static final String HIDE_CURSOR =  "\u001b[?25l";
  public static final String SHOW_CURSOR =  "\u001b[?25h";

  public static int BLACK = 30;
  public static int RED = 31;

  public static void main(String[] args) {
    System.out.print("\u001b[H");
    System.out.println("\u001b[1;4;31;103m^");
    System.out.println("\u001b[1;4;31;103m^^");

    color(34, 44);
  }

  public static void color(int foreground,int background){
    System.out.print( "\u001b[" + foreground + ";" + (10+background) + "m");
  }

  public static void color(int foreground, int background, int modifier){
    System.out.print( "\u001b[" + foreground + ";" + (10+background) + ";" + modifier + "m");
  }
}
