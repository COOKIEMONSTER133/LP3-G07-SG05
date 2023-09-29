public class Motor {
    private int numMotor;
    private int revPorMin;

    public Motor(int numMotor, int revPorMin) {
        this.numMotor = numMotor;
        this.revPorMin = revPorMin;
    }

    public String toString() {

        return "NumMotor: " + numMotor + " RevPorMin: " + revPorMin;
    }

}
