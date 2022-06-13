

public class StringCalculator {
    int Add(String numbers){
        if(numbers.isEmpty())
            return  0;

        String[] splits = numbers.split(",");
        int result = 0;

        for(String elem : splits){
            result += Integer.parseInt(elem);
        }

        return result;
    }

}
