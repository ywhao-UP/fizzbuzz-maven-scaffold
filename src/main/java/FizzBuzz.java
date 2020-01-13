public class FizzBuzz {
    private int num;

    public FizzBuzz(int input) {
        this.num = input;
    }

    public String print() {

        if(divided(3)&&divided(5)) return "fizzbuzz";
        if(divided(3)) return "fizz";
        if(divided(5)) return "buzz";
        return String.valueOf(num);
    }

    private boolean divided(int i){
        if(num%i==0) return true;
        return false;
    }
}
