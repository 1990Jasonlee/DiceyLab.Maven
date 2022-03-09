import java.util.Random;

public class Dice {

    private int numOfDice;
    private int sum;

    public Dice(int numOfDice) {
        this.numOfDice = numOfDice;
    }

    public Integer tossAndSum() {
        this.sum = 0;
        Random random = new Random();
        for (int i = 0; i < numOfDice; i++){
            this.sum += random.nextInt(1,6);
        }
        return this.sum;
    }
}
