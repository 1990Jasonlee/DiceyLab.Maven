
public class Bins {
    public int [] bin;
    public Bins (int min , int max){
        Integer[] bin = new Integer[max+1];
        for (int i = 0; i < bin.length; i++){
            bin[i] = 0;
        }
    }

    public void increment(int number){
        bin[number]++;
    }


}
