package Application;

import java.util.ArrayList;
import java.util.List;

public class Dictionary {
    private List<Word> dictionary = new ArrayList<>();

    public Dictionary(List<Word> dictionary) {
        this.dictionary = dictionary;
    }

    public List<Word> getDictionary() {
        return dictionary;
    }

    public void setDictionary(List<Word> dictionary) {
        this.dictionary = dictionary;
    }


}
