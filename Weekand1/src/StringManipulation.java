public class StringManipulation {
    private String s1 = "abba";
    private String s2 = "baab";

    //concatenation -adding two string
    public void concatenating() {
        String s3 = s1.concat(s2);
        System.out.println(s3);
    }

    //finding length - find the length of the string
    public void lengthening() {
        System.out.println(s1.length());
    }

    //reverse - reverse the string
    public void reversing() {
        StringBuilder s3 = new StringBuilder();
        s3 = s3.append(s1); //concatenating with s3
        System.out.println(s3.reverse());
    }

    //replacing - replacing a portion of string
    public void replacing() {
        //replace(targetString, replaceString)
        System.out.println("The orginal string was abba:  " + s1.replace("ab", "abba"));

    }

    //trimming - removing string from left and right portion  of the string
    public void trimming() {
        String s3 = "    abba    ";
        System.out.println(s3.trim());
    }

    //substring - clipping part of the string
    public void substringing() {
        String s3 = "I love JAVA";
        //substring(startingIndex, endingIndex)
        System.out.println("The part of string : " + s3.substring(0, 6));
        System.out.println("prefix of the string : " + s3.substring(0, 2));
        System.out.println("suffix of the string : " + s3.substring(s3.length() - 3, s3.length() - 1));

    }

}
