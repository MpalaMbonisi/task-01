public class Main {
    public static void main(String[] args) {
        displayOutput(5);
        System.out.println();
        displayOutput(8);
    }
    private static void displayOutput(int x){
        String result = "";
        for (int i=0; i < x; i++){
            String z = (i % 2 == 0) ? "+" : "-";
            result += z;
        }
        System.out.println(result);
    }
}