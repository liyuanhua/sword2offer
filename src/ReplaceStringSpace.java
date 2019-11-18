public class ReplaceStringSpace{

    //计算字符串中包含的空格个数  
    public static int getBlankNum(String testString){
        int blackNum = 0;

        for(int i=0;i<testString.length()-1;i++){
            if(String.valueOf(testString.charAt(i)).equals(" "))
                blackNum++;
        }
        return blackNum;
    }
    //打印char[] 数组  
    public static void printArray(char[] testArray){
        for(char i:testArray)
            System.out.print(i);
    }

    //将字符串空格转化为20%  
    public static void replaceAllBlank(String testString){
        if(testString == null || testString.length() == 0)
            return;

        int length = testString.length();
        int newLength = length + getBlankNum(testString) * 2;
        char[] newArray = new char[newLength];
        System.arraycopy(testString.toCharArray(), 0, newArray, 0, testString.toCharArray().length);

        int indexOfOirgin = length - 1;
        int indexOfNew = newLength - 1;
        while(indexOfOirgin >=0 && indexOfOirgin != indexOfNew){
            if(newArray[indexOfOirgin] == ' '){
                newArray[indexOfNew--] = '0';
                newArray[indexOfNew--] = '2';
                newArray[indexOfNew--] = '%';
            }
            else
                newArray[indexOfNew--] = newArray[indexOfOirgin];

            indexOfOirgin--;
        }

        printArray(newArray);
    }
    public static void main(String[] args){
        String str = "We are happy";
        replaceAllBlank(str);
    }
}  