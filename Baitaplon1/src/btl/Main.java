package btl;

public class Main {
    public static void main(String[] args){
        DictionaryManagement dm = new DictionaryManagement();
        dm.insertFromFile();
        dm.showAllWords();
        dm.dictionaryInsert();
        dm.dictionaryExportToFile();
    }
}
