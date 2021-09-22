import java.util.*;


class Main {
  public static void main(String[] args) {

    Random r = new Random();
    int randomNum = r.nextInt(50) +1;
    System.out.println("The Random number is: " + randomNum);

    for (int i=randomNum; i>=0; i--){
      System.out.println(i);
    }

    if (randomNum<=5){
      System.out.println("Ahoy mateys!");
    }

    else if (randomNum <42 && randomNum >25){
      System.out.println("Cannonball!");
    }

    else {
      System.out.println("Blast off!");
    }



    }      

    }