public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "bottles";

        while (beerNum > 0) {
            if (beerNum == 1) {
                word = "bottle";
                //Say bottle when there's only one beer in the fridge
            }

            System.out.println(beerNum + " " + word + " of beer in the fridge");
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.println("Take one out,");
            System.out.println("Pass it around,");
            beerNum = beerNum -1;

            if (beerNum > 0) {
                System.out.println(beerNum + " " + word + " of beer in the fridge");
            } else {
                System.out.println("No more bottles of beer in the fridge.");
            }
        }
    }
}