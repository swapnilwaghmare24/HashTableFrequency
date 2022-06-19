public class HashTableFrequency {
    static final int size = 5;

    public static int hashFunction(String str) {
        return str.hashCode() % size;
    }

    public static void sentence() {

        String sentence = "To be or not to be";
        String[] sentenceArray = sentence.split(" ");
        int i = 0;
        int j = 0;
        int count = 0;


        for (String str : sentenceArray) {
            System.out.println(str + "->" + hashFunction(str));
        }
        System.out.println(sentenceArray.length);
        while (i != (sentenceArray.length)) {
            while (j != (sentenceArray.length)) {
                if (sentenceArray[i].equals(sentenceArray[j])) {
                    count +=1;
                }
                j++;
            }
            System.out.println("Frequency of " + sentenceArray[i] + ": " + count);
            count = 0;
            i++;
            j = 0;
        }

    }

    public static void paragraph() {


        String paragraph = "Paranoids are paranoid because they are Paranoid but because they keep putting" +
                " themselves deliberately into Paranoid avoidable situations";
        String[] paragraphArray = paragraph.split(" ");
        int i = 0;
        int j = 0;
        int count = 0;
        for (String str : paragraphArray) {
            System.out.println(str + "->" + hashFunction(str));
        }
        while (i != (paragraphArray.length)) {
            while (j != (paragraphArray.length)) {
                if (paragraphArray[i].equals(paragraphArray[j])) {
                    count +=1;
                }
                j++;
            }
            System.out.println("Frequency of " + paragraphArray[i] + ": " + count);
            count = 0;
            i++;
            j = 0;
        }

    }


    public static void main(String[] args) {
        HashTableFrequency.sentence();
        System.out.println();
        HashTableFrequency.paragraph();

    }
}
