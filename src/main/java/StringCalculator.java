import java.util.Arrays;

public class StringCalculator {
    int Add(String numbers){
        if(numbers.isEmpty())
            return  0;

        //Changing delimiter;
        String delimiter = "\\n|";
        if(numbers.length()>2 && numbers.substring(0, 2).equals("//") ){
                String[] tempSplits = numbers.split("\\n");
                delimiter += tempSplits[0].substring(2); //assuming delimiter is only 1 character
                numbers = String.join("\n", Arrays.copyOfRange(tempSplits, 1, tempSplits.length));
        }else{
            delimiter += ",";
        }

        String[] splits = numbers.split(delimiter);
        int result = 0;

        for(String elem : splits){
            result += Integer.parseInt(elem);
        }

        return result;
    }

}
