package StringConcatenation;

public class RangeCheck {
    public boolean flag = false;

    public boolean checkingRange(int n) {
        if (n >= 0 && n <= 50) {
            return flag = true;
        } else {
            System.out.println("Invalid input. Please enter a number between the range of 0 to 50");
            return flag = false;
        }

    }

}
