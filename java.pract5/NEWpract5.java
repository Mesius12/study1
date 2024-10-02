class NoObject {
    private int num;
    private String word;
    public NoObject(int num)  {
        this.num = num;
    }
    public NoObject(String word) {
        this.word = word;
    }
    public String toString() {
        return (word != null) ? word : String.valueOf(num);
    }
}
public class Main {
    public static void main(String[] args) {
        int[] Numbers = {1,3,5,7};
        String[] Words = {"second","fourth","six","eighth"};
        int razmer = Numbers.length + Words.length;
        NoObject[] CompletedArr = new NoObject[razmer];

        for (int i = 0; i < razmer; i++) {
            if (i % 2 == 0) {
                CompletedArr[i] = new NoObject(Numbers[i/2]);
            }
            else {
                CompletedArr[i] = new NoObject(Words[i/2]);
            }
        }
        for (int i = 0; i < CompletedArr.length; i++) {
            System.out.println("a[" + i + "]" + " - " + CompletedArr[i]);
        }
    }
}
