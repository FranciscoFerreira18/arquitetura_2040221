

public class CharaterUtilities {
    public static char lowerLetterSuccessorOf(char letter) {
        if (letter == 'z'){
            return 'a';
        }
        else {
            return ++letter;
        }

    }
    public static char lowerLetterPredecessorOf(char letter) {
        if (letter == 'a'){
           return  'z';
        }
        else {
           return --letter;
        }

    }
    public static char lowerLetterSuccessorStepsOf(char letter, int number_char) {
        char next = letter;
        for (int i = 0;i<number_char;i++){
            next = lowerLetterSuccessorOf(next);
        }
        return next;

    }
    public static char lowerLetterPredecessorStepsOf(char letter, int number_char) {
        char next = letter;
        for (int i = 0;i<number_char;i++){
            next = lowerLetterPredecessorOf(next);
        }
        return next;
    }
    public static int occurrencesOfCharacterIn(char letter, char [] palavra) {
       int count = 0;
       for(int i = 0; i < palavra.length; i++){
           if(palavra[i]==letter){
               ++count;
           }
       }
        return count;
    }

    public static char[] replaceCharacterIn (char letter, char [] palavra, char replace) {
        for (int i = 0; i<palavra.length;i++){
            if(palavra[i]==letter){
                palavra[i]=replace;
            }
        }
        return palavra;
    }

    public static char[] concatenationOf (char [] palavra, char [] palavra1 ) {
        char [] result = new char[palavra.length+palavra1.length];
        for (int i = 0; i < palavra.length; i++){
            result[i]=palavra[i];
        }
        for (int e = 0;e <palavra1.length;e++){
            result[e+ palavra.length]=palavra1[e];
        }
        return result;
    }
    public static char[] copyOfPartOf (char [] palavra, int indice1, int indice2) {
        char [] copy = new char[indice2-indice1];
        for (int i = 0;i < indice2-indice1;i++){
            copy[i]=palavra[i+indice1];
        }
        return copy;
    }



}