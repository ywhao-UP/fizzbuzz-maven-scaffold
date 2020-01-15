public class FizzBuzz {

    public String print(int in) {
        String res = "";
        if (in % 3 == 0) {
            res += "fizz";
        }
        if (in % 5 == 0) {
            res += "buzz";
        }
        if (res.isEmpty()) {
            res += in;
        }
        return res;
    }
}
