package day18;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(count7(717771237));

    }

    public static int count7(int n){
        if(n == 0) {
            return n;
        } else if(n%10 == 7){
            return 1+count7(n/10);
        }
        return count7(n/10);
    }
}



// работает, но не совсем понимаю как))
// получается, что пока рекурсия работает эти +1 копятся в стеке и в последнем витке все плюсуются?