//Написати метод який приймає массив цілих чисел і вертає суму всіх його парних елементів
// (не тих які мають парні індекси а ті які самі є парними). [8,2,3,4,5,6,7] -> 20

public class Exercise2 {
    public static void main(String[] args){
        int[] numbers = new int[]{8, 2, 3, 4, 5, 6, 7};
        System.out.println(sumEvenElements(numbers));

    }
    public static int sumEvenElements(int[] numbers){

        int sum = 0;
        for(int number : numbers){
            if(number % 2 == 0){
                sum += number;
            }
        }
        return sum;

    }
}


