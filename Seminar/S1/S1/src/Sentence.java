public class Sentence {

    //check for words in a string ignoring spaces
    public int countWords(String sentence) {
        int count = 0;
        boolean word = false;
        int endOfLine = sentence.length() - 1;
        char[] characters = sentence.toCharArray();

        for(int i = 0; i < characters.length; i++) {
            if(Character.isLetter(characters[i]) && i != endOfLine) {
                word = true;
            }
        else if(!Character.isLetter(characters[i]) && word) {
                count++;
                word = false;
            }
            else if(Character.isLetter(characters[i]) && i == endOfLine) {
                count++;
            }
        }
        return count;

    }
}
