public class FizzBuzz {

    private int num;
    public FizzBuzz(int input) {
        this.num = input;
    }

    public String print() {
        String result = "";
        if (divided(3)) {
            result += "fizz";
        }
        if (divided(5)) {
            result += "buzz";
        }
        if (result.isEmpty()) {
            result += String.valueOf(num);
        }
        return result;
    }
    private boolean divided(int i) {
        if (num % i == 0) {
            return true;
        }
        return false;
    }
}
