package app.StringOccurances;


public class NoOfOccurenceOfCharacters {
    public static void main(String[] args) {

        String str = "Hello Teacher";
        getOccuringChar(str);

    }
    static void getOccuringChar(String str)
    {
        final int MAX_CHAR = 256;
        int count[] = new int[MAX_CHAR];

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        char ch[] = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {

                if (str.charAt(i) == ch[j])
                    find++;
            }

            if (find == 1)
                System.out.println("Number of Occurrence of " + str.charAt(i) + " is:" + count[str.charAt(i)]);
        }
    }

}
