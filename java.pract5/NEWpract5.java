public class Main {
    public static void main(String[] args) {
        int[] Numeros = {1,3,5,7};
        String[] Words = {"second","quatro","six","vosem"};
        int razmer = Numeros.length + Words.length;
        Object[] CompletedArr = new Object[razmer];

        for (int i = 0; i < razmer; i++) {
            if (i % 2 == 0) {
                CompletedArr[i] = Numeros[i/2];
            }
            else {
                CompletedArr[i] = Words[i/2];
            }
        }
        for (int i = 0; i < CompletedArr.length; i++) {
            System.out.println("a[" + i + "]" + " - " + CompletedArr[i]);
        }
    }
}
