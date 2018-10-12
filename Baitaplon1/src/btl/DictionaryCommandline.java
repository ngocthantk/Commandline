package btl;

public class DictionaryCommandline {
    public static void  dictionaryBasic() {
        DictionaryManagement dm = new DictionaryManagement();
        dm.insertFromCommandline();
        dm.showAllWords();
    }
}
