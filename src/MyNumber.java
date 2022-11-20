public class MyNumber {
    private int num;
    public MyNumber(int num){
        this.num = num;
    }

    public boolean isPrime(){
        for (int i = 2; i<=this.num - 1;i++) {
            if (this.num % i == 0) return false;
        }
        return true;
    }

    public int sumUpToN() {
        int sum = 0;
        for(int i=1;i<=this.num;i++){
            sum += i;
        }
        return sum;
    }

    public int sumOfDivisors(){
        int sum = 0;
        for(int i=2;i<this.num;i++){
            if (num%i ==0) sum += i;
        }
        return sum;
    }

    public void printANumberTriangle(){
        String numTriangle = "";
        for (int i = 1; i<=this.num;i++) {
            numTriangle += " " + i;
            System.out.println(numTriangle);
        }
    }

}