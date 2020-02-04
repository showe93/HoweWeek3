public class conversionDemo {
    public static void main(String[] args){
        String[] data = {"12","13","28", "98","23"};
        var wrongResult = data[0] + data[4];
        System.out.println(wrongResult);//will append the two together, "1223".
        var result = Integer.parseInt(data[0]) + Integer.parseInt(data[4]);//can also use Float.parseFloat
        System.out.println(result);//will print the desired result of 12 + 23, which is 35
    }
}
