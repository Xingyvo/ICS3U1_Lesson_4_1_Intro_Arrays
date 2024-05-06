class ClassDemo extends ConsoleProgram {
  public void run() {
    // Declare and initialize your arrays here
    int[] canCounts = new int[5];

    // Assign values to canCounts here
    canCounts[0] = 4;
    canCounts[1] = 10;
    canCounts[2] = 12;
    canCounts[3] = 18;
    canCounts[4] = 10;

    // Print out the first and last number of cans
    System.out.println(canCounts[0]);
    System.out.println(canCounts[4]);

    // Create an array of Strings called top5 that stores your 5 favourite song names. 
    // Declare and intialize array
    String[] favouriteSongs = new String[5];

    // Assign values to favouriteSongs here
    favouriteSongs[0] = "Like by: BTS";
    favouriteSongs[1] = "NewJeans by: NewJeans";
    favouriteSongs[2] = "ETA by: NewJeans";
    favouriteSongs[3] = "See you again by: Tyler the Creator";
    favouriteSongs[4] = "Coffee by: BTS";

    // Print out the song in the middle of the array.
    System.out.println(favouriteSongs[3]);
    
  }
}
