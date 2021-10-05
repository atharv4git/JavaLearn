public class arrtry {
    public static void main(String[] args) {
        int[] arr = new int[5];

        for(int i = 0 ; i < 5 ; i++){
            arr[i] = i + 1;
            
        }
        for(int j = 0 ; j<5 ; j++){
            System.out.println("#Element#" + (j+1) + "-" + arr[j]);
        }
    }
}
