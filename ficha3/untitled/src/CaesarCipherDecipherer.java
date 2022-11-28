public class CaesarCipherDecipherer {
    public static String cipher(String word, int steps){
            String result = "";
            for(int i = 0; i < word.length();i++){
                result+=CharaterUtilities.lowerLetterSuccessorStepsOf(word.charAt(i),steps);
            }
            return result;
    }

    public static String decipher(String word, int steps){
        String result = "";
        for(int i = 0; i < word.length();i++){
            result+=CharaterUtilities.lowerLetterPredecessorStepsOf(word.charAt(i),steps);
        }
        return result;
    }
}
