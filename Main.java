import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Rectangle r1 = new Rectangle(3.2, 5.8); // a rectangle measuring 3.2 by 5.8
    // a rectangle measuring 5.8 by 3.2
    Rectangle r2 = new Rectangle(5.8, 3.2);

    boolean isRotated = ((r1.getLength) == (r2.getWidth)) && (r1.getWidth() == r2.getLength);
    //r1.equals(r2)
    boolean isCongruent = r1.equals(r2) || isRotated;

    double widthRatio = r1.getWidth() / r2.getWidth();
    double lengthRatio = r1.getLength() / r2.getLength();

    boolean isSimilar = isCongruent || ratiosAreSame;
    boolean ratiosAreSame = widthRatio == lengthRatio;
  }
}
