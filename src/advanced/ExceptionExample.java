package advanced;

public class ExceptionExample {
    public static void main(String[] args) {

        try {
            int[] num = {1, 2, 3, 4};
            System.out.println(num[5]);
            int i = 55 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array problem");
        } catch (Exception e){
            System.out.println("Something else");
        }
        finally {
            System.out.println("This will be always printed");
        }
    }
}

