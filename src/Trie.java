public class Trie {
    public static final int MAX_CHAR = 26;
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String key){
        int lvl, lenght = key.length(), index;

        TrieNode actual = root;

        // Depth control of the word
        for(lvl = 0; lvl < lenght; lvl++){

            index = key.charAt(lvl) - 'a';
            if(actual.getSons()[index] == null)
                actual.getSons()[index] = new TrieNode();

            actual = actual.getSons()[index];
        }   //for

        actual.setEndOfWord(true);      // Last Node as leaf
    }

    public boolean search(String key){
        int lvl, lenght = key.length(), index;

        boolean found = true;

        TrieNode actual = root;

        // Depth control of the word
        for(lvl = 0; lvl < lenght; lvl++){

            index = key.charAt(lvl) - 'a';
            if(actual.getSons()[index] == null)
                found = false;

            actual = actual.getSons()[index];
        }   //for

        if(!found)
            return found;
        else
            return actual != null && actual.isEndOfWord();
    }

    //Recursive function to delete a key
    public TrieNode remove(TrieNode n, String key, int depth){

        if(n == null)
            return null;

        //Last character is being processed
        if(depth == key.length()){

            //This node is no more end of word
            if(n.isEndOfWord())
                n.setEndOfWord(false);
            if(isEmpty(n))
                n = null;

            return n;
        }   //if

        //If not last character, go over the childs
        int index;
        if(key.charAt(depth) >= 'A' && key.charAt(depth) <= 'Z' )
            index = key.charAt(depth) - 'a';
        else
            index = key.charAt(depth);

        n.getSons()[index] = remove(n.getSons()[index], key, depth + 1);

        //Root does not have any child and its not end of word
        if(isEmpty(n) && !n.isEndOfWord())
            n = null;

        return n;
    }

    //If node has no children true, if not false
    public boolean isEmpty(TrieNode n){
        for(int i = 0; i <   MAX_CHAR; i++){
            if(n.getSons()[i] == null)
                return false;
        }   //for
        return true;
    }
}
